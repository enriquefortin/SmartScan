B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private txtempresa, txtcai, txtrtn, txtmontototal, txtmensaje, filenamedisplay, jqm, subir As JQueryElement
	Private timer1 As Timer
	Private langmap As Map
	Private langlist As List
	Private tesseractInstalled As Boolean = True	
	Private t_p As Timer 

End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	'ws.Alert("conectado")
	timer1.Initialize("timer1", 1000)
	timer1.Enabled = True
	t_p.Initialize("t_p",100)
	t_p.Enabled=True
	Main.porcentaje=""
End Sub





Sub t_p_Tick
	If Main.porcentaje <> ""  Then
		enviarporcentaje(Main.porcentaje)		
	End If
		
End Sub

Sub Device_Message(Params As Map)
	'Log("Device message: " & Params.Get("message"))
	
Main.msj=Params
Log(Main.msj.Get("message"))
End Sub


Sub leertesseract'_Click(Params As Map)
	Log("click al boton leertesseract")
	
	Dim sh As Shell
	sh.Initialize("sh","tesseract",Null)
	sh.run(10000)	
	langmap.Initialize
	langlist.Initialize
	langlist.Add("spa_old")
	langmap.Put("Español",langlist.Get(0))
	Log(langlist)
	Log(langmap)
	Log(langmap.Get("Español"))
	
	
	ProcessImage
	
	
	
	'scan
End Sub

Sub ProcessImage
	
	If Main.NombreArchivo <> "" Then
		
		
		

	Try
		' Ruta de la imagen de carga.
		Dim uploadedImagePath As String = File.Combine(File.DirApp & "/up", "")

		' Abrir OutputStream para la imagen de salida
		Log(Main.NombreArchivo)
		Dim Inp As InputStream = File.OpenInput(uploadedImagePath,Main.NombreArchivo)
        
		' Abrir OutputStream para la imagen de salida
		Dim out As OutputStream = File.OpenOutput(File.DirApp & "/tesseract-ocr", "image.png", False)
        
		' Copiar imagen de InputStream a OutputStream
		File.Copy2(Inp, out)

		' Cerrar stream
		out.Close

		' Aquí puede llamar a Tesseract o realizar cualquier procesamiento adicional con la imagen.
		

        scan
	Catch
		Log(LastException)
	End Try
End If
End Sub



Sub scan
	Dim args As List
	args.Initialize
	args.AddAll(Array As String("image.png","output","-l",langmap.Get("Español")))
	Dim sh1 As Shell
	tesseractInstalled=True
	If tesseractInstalled Then
		sh1.Initialize("sh1","tesseract",args)
		Log("iniciado")
	Else
		sh1.Initialize("sh1",File.Combine(File.Combine(File.DirApp,"tesseract-ocr"),"tesseract"),args)
		Log(File.Combine(File.Combine(File.DirApp,"tesseract-ocr"),"tesseract"))
	End If
	sh1.WorkingDirectory = File.Combine(File.DirApp,"tesseract-ocr")
	sh1.run(100000)

End Sub


Sub Timer1_Tick
	ws.RunFunction("ServerTime", Array As Object(DateTime.Time(DateTime.Now)))
	ws.Flush
	If Main.reload=1 Then
		

		ws.Eval($"Swal.fire({
   title: 'Los documentos se han cargado con éxito',
   text: 'Documentación enviada.',
   icon: 'success',
   showConfirmButton: true
}).then((result) => {
   if (result.isConfirmed) {
     alertify.success('Documentación enviada.');
	 //document.location.replace('index.html');
   }
});"$,Null)
		Colocar_cero(Null)
		'ws.Eval($"form.removeEventListener("submit", handleSubmit);"$,Null)
		
		'ws.Eval($"document.getElementById("subir").click();"$,Null)
		
		'ws.Eval($" inputFile.value = "";"$,Null)
		'ws.Eval("window.location.reload();",Null)


Log("subido")
		
		leertesseract
		Main.reload=0
	End If
	
	
End Sub




Private Sub WebSocket_Disconnected
	timer1.Enabled = False
	t_p.Enabled=False
	Log("disconnected")
End Sub



Public Sub enviarporcentaje (algo As String)
	ws.Eval($"updateProgress(${algo});"$,Null)	
	ws.Eval("location.reload(True);",Null)
'	Log(algo)
End Sub


  Sub Colocar_cero (param As Map)
	Log("colococero desde js")
	Main.porcentaje=""
	enviarporcentaje(0)
	'Main.NombreArchivo=""
End Sub
'Private Sub jqm_Click(Params As Map)
'	Log("CLICK")
'	txtmensaje.SetHtml(Main.msj.Get("message"))
'End Sub

Private Sub jqm_Click(params As Map)
	Log("CLICK")
	txtmensaje.SetHtml(Main.msj.Get("message"))
End Sub




Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Log("Error")
	Return True
End Sub


Sub OCR_finished (Text As String,ProcessingTime As Int)
	Log(Text)
	Log(ProcessingTime & " ms")
End Sub

Sub OCR_overlay (Overlay As Map)
	Log(Overlay)
End Sub


Sub sh_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	If Success And ExitCode = 0 Then
		Log("Success")
		Log(StdOut)
		tesseractInstalled=True
		Log("Si")
	Else
		Log("Error: " & StdErr)
		tesseractInstalled=False
	End If
End Sub

Sub sh1_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	If Success And ExitCode = 0 Then
		Log("Success")
		Log(StdOut)
		
		txtmensaje.SetHtml(File.ReadString(File.Combine(File.DirApp,"tesseract-ocr"),"output.txt"))
		'TextArea1.Text=File.ReadString(File.Combine(File.DirApp,"tesseract-ocr"),"output.txt")
		'fx.Clipboard.SetString(TextArea1.Text)
		'ws.Alert("Los resultados se han copiado en el portapapeles.")
	Else
		Log(ExitCode)
		Log("Error: " & StdErr)
		ws.Alert("fallo de reconocimiento")

	End If
End Sub

