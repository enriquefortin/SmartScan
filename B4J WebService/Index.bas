B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Private honduras,lblusernamemain As JQueryElement
End Sub

Public Sub Initialize
	
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
	Log("en index")
	Main.ValidarUsuario(ws,lblusernamemain)

	lblusernamemain.SetText(ws.Session.GetAttribute("UserName"))
	If ws.Session.GetAttribute("Pais") <> "" Then
		
		ws.Eval($"Swal.fire({
   title: 'No tiene acceso a esta pagina verifique su cuenta de Inicio de Sessión',
   text: 'Verificación completada.',
   icon: 'error',
   showConfirmButton: true
}).then((result) => {
   if (result.isConfirmed) {
     alertify.success('Documentación enviada.');
	 document.location.replace('${ws.Session.GetAttribute("Pais")}.html');
   } else{
   document.location.replace('${ws.Session.GetAttribute("Pais")}.html');
   }
   
});"$,Null)
		
	End If

End Sub

Private Sub WebSocket_Disconnected

End Sub
'
'Sub honduras_Click (Params As Map)
'	Log("click en HN" )
'	ws.Eval("document.location.replace('HN.html');",Null)
'End Sub
'
