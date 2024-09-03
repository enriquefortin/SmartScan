B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
'Handler class
Sub Class_Globals
	Private counter As Int = 1
	Private valsession As String
End Sub

Public Sub Initialize
	
End Sub

Sub Handle(req As ServletRequest, resp As ServletResponse)

	If Main.sessionid = Null Then
		resp.SendError(403, "No session ID found")
		Return
	End If
	
	Dim jupload As jFileUploadSupport
	resp.SetHeader("Access-Control-Allow-Origin", "*")
	jupload.Initialize("jupload")
	Dim pathUpload As String = File.Combine(File.DirApp & "/up", "")
	jupload.TempFile(File.DirApp & "www", "Multipart.temp")
	jupload.UploadPath(pathUpload)
	jupload.MultipartHook(req)
	
	
	Dim session As String = req.GetParameter("session")
	If session <> "" Then
	Log("Session: " & session)
		valsession=session
		
		Log("mi valor "&valsession)
		Dim localsession As String = valsession

		Main.sessionid.Put(localsession,localsession)
		Log(Main.sessionid.Get(localsession))
		
		
		Main.reload = 1
	End If

End Sub


Sub jupload_UploadProgress (TotalKB As Long, Percent As String)
'	Log(TotalKB)
'	Log(Percent)
	Main.porcentaje=Percent

End Sub




Sub jupload_UploadCompleted(Success As Boolean, FileName As String)
	'Log(FileName)
	'Log(Success)



	If Success Then
		Dim pathUpload As String = File.Combine(File.DirApp & "/up", "")

		' Comprueba si el archivo ya existe
	'	If File.Exists(pathUpload, FileName) Then
			' Renombra el archivo para evitar duplicados
			Dim newFileName As String = GetUniqueFileName(pathUpload, FileName)
		If File.Exists(pathUpload, FileName) Then
			File.Copy(pathUpload, FileName, pathUpload, newFileName)
			File.Delete(pathUpload, FileName)
			
		
	
			Main.NombreArchivo = newFileName			
	

			Log("camino que existe")

			End If

		Main.subido = True
		'Main.reload = 1
	Else
		Main.subido = False
	End If

End Sub




 'Función para generar un nombre de archivo único
Sub GetUniqueFileName(pathUpload As String, FileName As String) As String
	Dim baseName As String = FileName.SubString2(0, FileName.LastIndexOf("."))
	Dim extension As String = FileName.SubString(FileName.LastIndexOf("."))

	Dim newFileName As String = baseName & "_" & counter & extension
    
	Do While File.Exists(pathUpload, newFileName)
		counter = counter + 1
		newFileName = baseName & "_" & counter & extension
	Loop

	Return newFileName

End Sub



