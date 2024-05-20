B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
'Handler class
Sub Class_Globals
	Private counter As Int = 1
End Sub

Public Sub Initialize
	
End Sub

Sub Handle(req As ServletRequest, resp As ServletResponse)
	Dim jupload As jFileUploadSupport
	resp.SetHeader("Access-Control-Allow-Origin", "*")
	jupload.Initialize("jupload")
	Dim pathUpload As String = File.Combine(File.DirApp & "/up", "")
	jupload.TempFile(File.DirApp & "www", "Multipart.temp")
	jupload.UploadPath(pathUpload)
	jupload.MultipartHook(req)

	
	
End Sub

Sub jupload_UploadProgress (TotalKB As Long, Percent As String)
	Log(TotalKB)
	Log(Percent)
	Main.porcentaje=Percent
End Sub



Sub jupload_UploadCompleted(Success As Boolean, FileName As String)
	Log(FileName)
	Log(Success)
	'Main.reload=1
	'Main.NombreArchivo=FileName
	'Main.subido=Success
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
'Else
'	Main.NombreArchivo = FileName
'	Log("camino que no existe")
'
'End If
  
		Main.subido = True
		Main.reload = 1
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



