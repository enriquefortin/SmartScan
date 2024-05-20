B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=6.51
@EndOfDesignText@
#Event: finished (Text As String,ProcessingTime as int)
#Event: overlay (Overlay As Map)
#Event: error (ErrorDetails As String,ErrorMessage as String )

Sub Class_Globals
	'Dim xui As XUI
	Dim api As String
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize (CallBack As Object, EventName As String,apikey As String)
	mEventName = EventName
	mCallBack = CallBack
	api=apikey
End Sub


'Language: used for OCR. If you pass "" English eng is taken as default.
'  IMPORTANT: The language code has always 3-letters (not 2). So it is "eng" and not "en".
'image: the image wich should be compute
'Autorotate: If set to true, the api autorotates the image correctly
'Overlay: If true, returns the coordinates of the bounding boxes for each word.
Public Sub ocr(Language As String,image As B4XBitmap,Autorotate As Boolean,Overlay As Boolean)
	Dim job As HttpJob
	job.Initialize("job",Me)
	Dim Out As OutputStream
	'Out = File.OpenOutput(xui.DefaultFolder, "image.png", False)
	Out= file.OpenInput(File.Combine(File.DirApp & "/up", Main.NombreArchivo))
	image.WriteToStream(Out, 100, "PNG")
	Out.Close
	Dim img As List
	img.Initialize
	Dim fd As MultipartFileData
	fd.ContentType="image/jpeg"
	fd.FileName = "image.png"
	fd.Dir=xui.DefaultFolder
	img.Add(fd)
	Dim m As Map
	m.Initialize
	m.Put("apikey",api)
	m.Put("language",Language)
	m.Put("isOverlayRequired",Overlay)
	m.Put("detectOrientation",Autorotate)
	job.PostMultipart("https://api.ocr.space/Parse/Image",m,img)
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		'The result is a json string. We parse it and log the fields.
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim root As Map = parser.NextObject
		Dim IsErroredOnProcessing As Boolean = root.Get("IsErroredOnProcessing")
		Dim ParsedResults As List = root.Get("ParsedResults")
		For Each colParsedResults As Map In ParsedResults
			Dim ParsedText As String = colParsedResults.Get("ParsedText")
			Dim ErrorDetails As String = colParsedResults.Get("ErrorDetails")
			Dim ErrorMessage As String = colParsedResults.Get("ErrorMessage")
			Dim TextOverlay As Map = colParsedResults.Get("TextOverlay")
			Dim HasOverlay As Boolean = TextOverlay.Get("HasOverlay")
		Next
		Dim ProcessingTimeInMilliseconds As Int = root.Get("ProcessingTimeInMilliseconds")
		
		If Not(IsErroredOnProcessing)Then
			If xui.SubExists(mCallBack, mEventName & "_finished",2) Then
				CallSub3(mCallBack, mEventName & "_finished",ParsedText,ProcessingTimeInMilliseconds)
			End If
			If HasOverlay Then
				If xui.SubExists(mCallBack, mEventName & "_overlay",1) Then
					CallSub2(mCallBack, mEventName & "_overlay",TextOverlay)
				End If
			End If
		Else
			If xui.SubExists(mCallBack, mEventName & "_error",2) Then
				CallSub3(mCallBack, mEventName & "_error",ErrorDetails,ErrorMessage)
			End If
		End If
	Else
		Log(job.ErrorMessage)
	End If
	job.Release	
End Sub