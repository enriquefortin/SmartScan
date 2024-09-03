B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private microsoft_login As JQueryElement
	Private lblmail As JQueryElement
	Private jscript As String
	Private mail As String =""
	Private username As String =""
	Private pass As String=""
	Private lastTwoChars As String
End Sub

Public Sub Initialize
	
	jscript=$"
var firebaseConfig = {
    apiKey: "AIzaSyAfeOuhe4N-0O1fwCnVGwgR8ywDdEznOG0",
    authDomain: "kateen-le-app.firebaseapp.com",
    projectId: "kateen-le-app",
    storageBucket: "kateen-le-app.appspot.com",
    messagingSenderId: "163149882505",
    appId: "1:163149882505:web:3ae63811b49a1bf3751258",
    measurementId: "G-Q4QLS0LW24"
};
firebase.initializeApp(firebaseConfig);

	"$
	
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Log("Cliente conectado")
	ws.Eval(jscript,Null)
	ws.Session.SetAttribute("UserId",0)
	ws.Session.SetAttribute("UserName",0)
	ws.Session.SetAttribute("Email",0)
	ws.Session.SetAttribute("Pais","")

End Sub


Private Sub WebSocket_Disconnected
Log("conectado")
End Sub



Sub microsoft_login_Click (Params As Map)
	Log("btn microsoft precionado")  
	ws.Eval("setTimeout(function() { signInWithMicrosoft(); }, 100);", Null)
End Sub


Sub firebaseauth_tokenverified (Token As Map)
	username=Token.Get("getName")
	mail=Token.Get("getEmail")
	pass=Token.Get("getUid")
	Log(username)
	Log(mail)
	Log(pass)
			
	ws.Session.SetAttribute("UserId",Token.Get("getUid"))
	ws.Session.SetAttribute("UserName",Token.Get("getName"))
	ws.Session.SetAttribute("Email",Token.Get("getEmail"))
	
	Log(ws.Session.GetAttribute("UserName"))
	
	
	Dim email As String
	email = Token.Get("getEmail")

	' Obtener los últimos dos caracteres del email
	
	lastTwoChars = email.SubString2(email.Length - 2, email.Length)

	' Convertir los últimos dos caracteres a mayúsculas
	lastTwoChars = lastTwoChars.ToUpperCase()

	' Mostrar el resultado
	Log(lastTwoChars)
	If lastTwoChars="HN" Then
		ws.Eval("document.location.replace('HN.html');",Null)
		ws.Session.SetAttribute("Pais","HN")
	Else If lastTwoChars="SV" Then
		ws.Eval("document.location.replace('SV.html');",Null)
		ws.Session.SetAttribute("Pais","SV")
	Else If lastTwoChars="GT" Then
		ws.Eval("document.location.replace('GT.html');",Null)
		ws.Session.SetAttribute("Pais","GT")
	Else If lastTwoChars="PA" Then
		ws.Eval("document.location.replace('PA.html');",Null)
		ws.Session.SetAttribute("Pais","PA")
	Else If lastTwoChars="NI" Then
		ws.Eval("document.location.replace('NI.html');",Null)
		ws.Session.SetAttribute("Pais","NI")
	Else If lastTwoChars="CR" Then
		ws.Eval("document.location.replace('CR.html');",Null)
		ws.Session.SetAttribute("Pais","CR")
	Else If lastTwoChars="CO" Then
		ws.Eval("document.location.replace('CO.html');",Null)
		ws.Session.SetAttribute("Pais","CO")
	End If
	
End Sub



Sub event_register(variable As Map)
	Log("CONNECTED")
	Dim token As String = variable.Get("tk")
	Main.firetoken.verifyIdToken(token)


	Log("is found desde mensaje")
	ws.Eval($"Swal.fire({
   title: 'Inicio de Sessión Correcto',
   text: 'Verificación completada.',
   icon: 'success',
   showConfirmButton: true
}).then((result) => {
   if (result.isConfirmed) {
     alertify.success('Documentación enviada.');
	 //document.location.replace('index.html');
   }
});"$,Null)

	Main.firetoken.closeConnection
End Sub




