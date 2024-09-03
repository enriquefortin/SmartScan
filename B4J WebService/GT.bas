B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private  txtmensaje, filenamedisplay, jqm, subir, gebd , txtiddelmovil As JQueryElement
	Private  txtnombre, txtidentidad As JQueryElement
	Private  txtmotor, txtplaca, txtanio, txtcolor, txtchasis As JQueryElement
	Private timer1 As Timer
	Private langmap As Map
	Private langlist As List
	Private tesseractInstalled As Boolean = True
	Private t_p As Timer
	Dim status As String
	Dim response As String
	Dim partes As List
	Private ldapClient As UNBOUNDID4B4J
	Private lblusernamemain As JQueryElement
	Private mysql As SQL
End Sub

Public Sub Initialize
	partes.Initialize
	Main.sql1.InitializeSQLite(File.DirApp & "/DB", "InfoDBGT.db",False)
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	'ws.Alert("conectado")
	timer1.Initialize("timer1", 1000)
	timer1.Enabled = True
	t_p.Initialize("t_p",100)
	t_p.Enabled=True
	Main.porcentaje=""
	
	Log(ws.Session.Id)
	'ws.Session.SetAttribute("id", ws.Session.Id)
	'Main.sessionid.Put("id"&ws.Session.id,ws.Session.Id)
	partes.Initialize
	
	ws.eval($"deshabilitarBoton()"$, Null)
	Main.ValidarUsuario(ws,lblusernamemain)
	lblusernamemain.SetText(ws.Session.GetAttribute("UserName"))
	ws.Eval($"validarPais("${ws.Session.GetAttribute("Pais")}");"$,Null)
	mysql= Main.pool.GetConnection
End Sub






Sub t_p_Tick
	'cargarlabarra(Main.cargabarra)
	
	If Main.porcentaje <> "" Then
		'enviarporcentaje(Main.porcentaje)
	End If
End Sub





Sub Device_Message(Params As Map)
	Log("Device message: " & Params.Get("message"))
	
	Main.msj=Params
	

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
	If Main.reload=1 And Main.sessionid.Get(ws.Session.Id)=ws.Session.id Then

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
		txtmensaje.SetText("Convirtiendo...")
		Colocar_cero(Null)



		Log("subido")
		
		leertesseract
		Main.reload=0
		Main.sessionid.Remove(ws.Session.id)
	End If
	
	
End Sub


'Sub Enviar_sessionid (param As Map)
'   
'End Sub

Sub Enviar_sessionid (param As Map)

	Log("devulvo")
   
	' Envía el script al cliente (frontend)
	
	Dim j As HttpJob
	Dim URL As String = "http://10.125.15.164/upload/v2/"
	'Dim URL As String = "http://192.168.75.100:55555/upload/v2/"
	Dim P As String= "session="&ws.Session.Id
	j.Initialize("", Me)
	j.PostString(URL,P)
	
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Log(j.GetString)
		Log("mensaje enviado")
	Else
		Return
	End If
	j.Release
End Sub



Private Sub WebSocket_Disconnected
	timer1.Enabled = False
	t_p.Enabled=False
	Log("disconnected")
	'Main.sessionid.Remove(ws.Session.id)
End Sub



Public Sub enviarporcentaje (algo As String)
	ws.Eval($"updateProgress(${algo});"$,Null)
	ws.Eval("location.reload(True);",Null)

End Sub


Sub Colocar_cero (param As Map)
	Log("colococero desde js")
	Main.porcentaje=""
	enviarporcentaje(0)

End Sub

Private Sub gebd_Click(params As Map)

	Main.sql1.BeginTransaction
		
		
	Main.sql1.ExecNonQuery2("insert into vehiculos values (?,?,?,?,?,?,?,?) ", _
		Array As Object(Null, txtnombre.GetVal.value,txtidentidad.GetVal.Value,txtmotor.GetVal.Value,txtplaca.GetVal.value, txtanio.GetVal.Value, txtcolor.GetVal.Value, _
		 txtchasis.GetVal.Value))
	Main.sql1.TransactionSuccessful

	mysql.BeginTransaction
	mysql.ExecNonQuery2("insert into InfoDB values (?,?,?,?,?,?,?,?,?,?) ", _
		Array As Object(Null, txtnombre.GetVal.value,txtidentidad.GetVal.Value,Null,txtmotor.GetVal.Value,txtplaca.GetVal.value, txtanio.GetVal.Value, txtcolor.GetVal.Value, _
		 txtchasis.GetVal.Value,"GT"))
		 
	mysql.TransactionSuccessful
				
	ws.Eval($"Swal.fire({
   title: 'El registro se ha cargado con éxito',
   text: 'Documentación enviada.',
   icon: 'success',
   showConfirmButton: true
}).then((result) => {
   if (result.isConfirmed) {
     alertify.success('Registro enviado.');
	 //document.location.replace('index.html');
   }
});"$,Null)

	ws.Eval("deshabilitarBoton()",Null)
	txtnombre.SetVal("")
	txtidentidad.SetVal("")
	txtmotor.SetVal("")
	txtplaca.SetVal("")
	txtanio.SetVal("")
	txtcolor.SetVal("")
	txtchasis.SetVal("")

End Sub



Private Sub jqm_Click(params As Map)

	Log(Main.msj.Get(txtiddelmovil.GetVal.Value&"messagegt"))
	Log(txtiddelmovil.GetVal.Value)
	txtmensaje.SetHtml("")
	Log("CLICK")

	txtmensaje.SetText(Main.msj.Get(txtiddelmovil.GetVal.Value&"messagegt"))

	Dim message As String = Main.msj.Get(txtiddelmovil.GetVal.Value&"messagegt")

	
	If message.Contains("MOTOR") Or message.Contains("PLACA") Or message.Contains("COLOR") Or message.Contains("CHASIS") Then
		enviarAI(message)
	End If
	
	If message.Contains("APELLIDO") Or message.Contains("SEXO") Or message.Contains("NACIONALIDAD") Then
		enviarAINombre(message)
	End If
End Sub


Sub ProcessList(inputList As List)
	For Each item As Map In inputList
		Dim text As String = item.Get("text")
        
		' Extrae los valores de la cadena
		Dim motor As String = ExtractValue(text, "Motor:", "Placa:")
		Dim placa As String = ExtractValue(text, "Placa:", "Año:")
		Dim anio As String = ExtractValue(text, "Año:", "Color:")
		Dim color As String = ExtractValue(text, "Color:", "Chasis:")
		Dim chasis As String = ExtractValue(text, "Chasis:", "")
		Log(motor)
		' Asigna los valores a los campos correspondientes
		txtmotor.SetVal(motor)
		txtplaca.SetVal(placa)
		txtanio.SetVal(anio)
		txtcolor.SetVal(color)
		txtchasis.SetVal(chasis)
	Next
	
	ws.Eval("validarCampos()",Null)
End Sub



Sub ExtractValue(input As String, key As String, nextKey As String) As String
	Dim startIndex As Int = input.IndexOf(key)
	If startIndex = -1 Then Return ""
    
	startIndex = startIndex + key.Length
	Dim endIndex As Int
	If nextKey <> "" Then
		endIndex = input.IndexOf(nextKey)
		If endIndex = -1 Then
			endIndex = input.Length
		Else
			endIndex = endIndex
		End If
	Else
		endIndex = input.Length
	End If
    
	Return input.SubString2(startIndex, endIndex).Trim
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
		txtmensaje.SetText("")
		txtmensaje.SetHtml(File.ReadString(File.Combine(File.DirApp,"tesseract-ocr"),"output.txt"))
		
		Dim message As String = File.ReadString(File.Combine(File.DirApp,"tesseract-ocr"),"output.txt")
		Log(message)

		'comienzo replica codigo set valores
		
		If message.Contains("MOTOR") Or message.Contains("PLACA") Or message.Contains("COLOR") Or message.Contains("CHASIS") Then
			enviarAI(message)
		End If
	
		
		If message.Contains("APELLIDO") Or message.Contains("SEXO") Or message.Contains("NACIONALIDAD") Then
			enviarAINombre(message)
		End If
		'enviarAI(message)
		
	Else
		Log(ExitCode)
		Log("Error: " & StdErr)
		ws.Alert("fallo de reconocimiento")

	End If
End Sub



Sub enviarAI(message As String)
	Dim strAPIurl As String ="https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=AIzaSyAAlU6UEaSo0NcGFZWC_q2uZOh8uBuQSt0"
	Log(strAPIurl)

	' Create a map for the inner parts map
	Dim partsMap As Map
	partsMap.Initialize
	partsMap.Put("text", $" del siguiente bloque de texto necesito que me identifiques y ordenes los siguientes valores MOTOR, PLACA, AÑO, COLOR, CHASIS algunos ejemplos
	 de motor son los siguientes (45386047, YD25776714P, MGC20597, CE7AN29R9052) algunos ejemplos de numeros de placa son los siguientes (TEA7853, HED8025, HDA4779)
	  el año siempre toma el que no encuetres bajo el texto año sino el siguiente el color pueden ser dos ejemplo AZUL-BLANCO o tambien puede ser solo uno ejemplo AZUL
	   toma en cuenta que el numero del motor siempre tendra menos o igual tamaño de caracteres que el numero del chasis favor limita la respuesta unicamente a los datos
	    en una lista ordenada  en el formato Motor: CE7AN29R9052\nPlaca: XXX1234\nAño: 2022\nColor: AZUL-BLANCO\nChasis: MD637AE74N2AB1025 \n el parametro el valor o numero 
		luego en el siguiente espacio el numero de placa y asi con los datos solicitados recuerda unicamente Motor,Placa,Año,Color y Chasis no mas datos. agunos ejmeplos 
		de chasis son los siguientes (1FV6HLAA7VL714763, 3N6CD33B2ZK463860, JTEBR3FJ60K277588): ${message} "$)
    
	' Create a list for parts
	Dim partsList As List
	partsList.Initialize
	partsList.Add(partsMap)
    
	' Create a map for the contents map
	Dim contentsMap As Map
	contentsMap.Initialize
	contentsMap.Put("parts", partsList)
    
	' Create a list for contents
	Dim contentsList As List
	contentsList.Initialize
	contentsList.Add(contentsMap)
    
	' Create the final map
	Dim finalMap As Map
	finalMap.Initialize
	finalMap.Put("contents", contentsList)
    
	' Convert the final map to JSON
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize(finalMap)
    
	Log(JSONGenerator.ToString)
	' Return the JSON string
	Dim strPayload As String = JSONGenerator.ToString

	Dim j As HttpJob
	j.Initialize("", Me)
	J.PostString(strAPIurl,strPayload)
	J.GetRequest.SetContentType("application/json")
	'J.GetRequest.SetHeader("Authorization","Bearer " & strToken)
	Wait For (J) JobDone(j As HttpJob)
	If J.Success Then

		Dim parser As JSONParser
		parser.Initialize(J.GetString)
		Dim jRoot As Map
		jRoot.Initialize
		jRoot = parser.NextObject
		Dim candidates As List
		candidates.Initialize
		candidates= jRoot.Get("candidates")
		Dim colcandidates As Map
		colcandidates.Initialize
		For Each colcandidates As Map In candidates
			Dim finishReason As String = colcandidates.Get("finishReason")
			Dim index As Int = colcandidates.Get("index")
			Dim safetyRatings As List
			safetyRatings.Initialize
			safetyRatings = colcandidates.Get("safetyRatings")
			Dim colsafetyRatings As Map
			colsafetyRatings.Initialize
			For Each colsafetyRatings As Map In safetyRatings
				Dim probability As String = colsafetyRatings.Get("probability")
				Dim category As String = colsafetyRatings.Get("category")
			Next
			Dim content As Map
			content.Initialize
			content = colcandidates.Get("content")
			Dim role As String = content.Get("role")
			Dim parts As List = content.Get("parts")
			'Log(parts)
			partes=parts
			Dim colparts As Map
			colparts.Initialize
			For Each colparts As Map In parts
				Dim text As String = colparts.Get("text")
				'Log(text)
				'partes.Add(text)
			Next
		Next
		Dim usageMetadata As Map
		usageMetadata.Initialize
		usageMetadata = jRoot.Get("usageMetadata")
		Dim candidatesTokenCount As Int = usageMetadata.Get("candidatesTokenCount")
		Dim totalTokenCount As Int = usageMetadata.Get("totalTokenCount")
		Dim promptTokenCount As Int = usageMetadata.Get("promptTokenCount")
		
		
	Else
	
		
		Dim parser As JSONParser
		parser.Initialize(J.GetString)
		Dim jRoot As Map
		jRoot.Initialize
		jRoot = parser.NextObject
		Dim error As Map
		error.Initialize
		error = jRoot.Get("error")
		Dim code As Int = error.Get("code")
		Dim message As String = error.Get("message")
		Dim status As String = error.Get("status")
		Log(message)
	
	End If
	j.Release
	
	Log(partes)
	
	'If message.Contains("Motor") Or message.Contains("MOTOR") Then
	ProcessList(partes)
	'End If
	
End Sub



Sub enviarAINombre(message As String)
	Dim strAPIurl As String ="https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=AIzaSyAAlU6UEaSo0NcGFZWC_q2uZOh8uBuQSt0"
	Log(strAPIurl)

	' Create a map for the inner parts map
	Dim partsMap As Map
	partsMap.Initialize
	partsMap.Put("text", $" del siguiente bloque de texto necesito que me identifiques y ordenes los siguientes valores Nombre y Numero de identificacion  el nombre puedes encontrarlo
	como uno o dos nombre como ejemplo JUAN MANUEL por favor concatena con el apellido que puedes encontrarlo como ejemplo como LOPEZ GONZALEZ limita la respuesta unicamente a los datos
	en una lista ordenada  en el formato Nombre: JUAN MANUEL LOPEZ GONZALEZ\Identidad: 0801199012345\n
	recuerda unicamente Nombre concatenado con el apellido y Numero de identidad no mas datos.: ${message} "$)
    
	' Create a list for parts
	Dim partsList As List
	partsList.Initialize
	partsList.Add(partsMap)
    
	' Create a map for the contents map
	Dim contentsMap As Map
	contentsMap.Initialize
	contentsMap.Put("parts", partsList)
    
	' Create a list for contents
	Dim contentsList As List
	contentsList.Initialize
	contentsList.Add(contentsMap)
    
	' Create the final map
	Dim finalMap As Map
	finalMap.Initialize
	finalMap.Put("contents", contentsList)
    
	' Convert the final map to JSON
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize(finalMap)
    
	Log(JSONGenerator.ToString)
	' Return the JSON string
	Dim strPayload As String = JSONGenerator.ToString

	Dim j As HttpJob
	j.Initialize("", Me)
	J.PostString(strAPIurl,strPayload)
	J.GetRequest.SetContentType("application/json")
	'J.GetRequest.SetHeader("Authorization","Bearer " & strToken)
	Wait For (J) JobDone(j As HttpJob)
	If J.Success Then

		Dim parser As JSONParser
		parser.Initialize(J.GetString)
		Dim jRoot As Map
		jRoot.Initialize
		jRoot = parser.NextObject
		Dim candidates As List
		candidates.Initialize
		candidates= jRoot.Get("candidates")
		Dim colcandidates As Map
		colcandidates.Initialize
		For Each colcandidates As Map In candidates
			Dim finishReason As String = colcandidates.Get("finishReason")
			Dim index As Int = colcandidates.Get("index")
			Dim safetyRatings As List
			safetyRatings.Initialize
			safetyRatings = colcandidates.Get("safetyRatings")
			Dim colsafetyRatings As Map
			colsafetyRatings.Initialize
			For Each colsafetyRatings As Map In safetyRatings
				Dim probability As String = colsafetyRatings.Get("probability")
				Dim category As String = colsafetyRatings.Get("category")
			Next
			Dim content As Map
			content.Initialize
			content = colcandidates.Get("content")
			Dim role As String = content.Get("role")
			Dim parts As List = content.Get("parts")
			'Log(parts)
			partes=parts
			Dim colparts As Map
			colparts.Initialize
			For Each colparts As Map In parts
				Dim text As String = colparts.Get("text")
				'Log(text)
				'partes.Add(text)
			Next
		Next
		Dim usageMetadata As Map
		usageMetadata.Initialize
		usageMetadata = jRoot.Get("usageMetadata")
		Dim candidatesTokenCount As Int = usageMetadata.Get("candidatesTokenCount")
		Dim totalTokenCount As Int = usageMetadata.Get("totalTokenCount")
		Dim promptTokenCount As Int = usageMetadata.Get("promptTokenCount")
		
		
	Else
	
		
		Dim parser As JSONParser
		parser.Initialize(J.GetString)
		Dim jRoot As Map
		jRoot.Initialize
		jRoot = parser.NextObject
		Dim error As Map
		error.Initialize
		error = jRoot.Get("error")
		Dim code As Int = error.Get("code")
		Dim message As String = error.Get("message")
		Dim status As String = error.Get("status")
		Log(message)
	
	End If
	j.Release
	
	Log(partes)
	
	ProcessListNombre(partes)

	
End Sub

Sub ProcessListNombre(inputList As List)
	For Each item As Map In inputList
		Dim text As String = item.Get("text")
        
		' Extrae los valores de la cadena
		Dim nombre As String = ExtractValue(text, "Nombre:", "\Identidad:")
		Dim identidad As String = ExtractValue(text, "Identidad:", "\n")

		Log(nombre)
		' Asigna los valores a los campos correspondientes
		txtnombre.SetVal(nombre)
		txtidentidad.SetVal(identidad)

	Next
	ws.Eval("validarCampos()",Null)
End Sub