package b4j.smartscan;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class index extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.smartscan", "b4j.smartscan.index", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.smartscan.index.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.WebSocket _ws = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _honduras = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public b4j.smartscan.main _main = null;
public b4j.smartscan.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
 //BA.debugLineNum = 4;BA.debugLine="Private honduras,lblusernamemain As JQueryElement";
_honduras = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
 //BA.debugLineNum = 12;BA.debugLine="ws = WebSocket1";
_ws = _websocket1;
 //BA.debugLineNum = 13;BA.debugLine="Log(\"en index\")";
__c.LogImpl("212255234","en index",0);
 //BA.debugLineNum = 14;BA.debugLine="Main.ValidarUsuario(ws,lblusernamemain)";
_main._validarusuario /*String*/ (_ws,_lblusernamemain);
 //BA.debugLineNum = 16;BA.debugLine="lblusernamemain.SetText(ws.Session.GetAttribute(\"";
_lblusernamemain.SetText(BA.ObjectToString(_ws.getSession().GetAttribute("UserName")));
 //BA.debugLineNum = 17;BA.debugLine="If ws.Session.GetAttribute(\"Pais\") <> \"\" Then";
if ((_ws.getSession().GetAttribute("Pais")).equals((Object)("")) == false) { 
 //BA.debugLineNum = 19;BA.debugLine="ws.Eval($\"Swal.fire({    title: 'No tiene acceso";
_ws.Eval(("Swal.fire({\n"+"   title: 'No tiene acceso a esta pagina verifique su cuenta de Inicio de Sessión',\n"+"   text: 'Verificación completada.',\n"+"   icon: 'error',\n"+"   showConfirmButton: true\n"+"}).then((result) => {\n"+"   if (result.isConfirmed) {\n"+"     alertify.success('Documentación enviada.');\n"+"	 document.location.replace('"+__c.SmartStringFormatter("",_ws.getSession().GetAttribute("Pais"))+".html');\n"+"   } else{\n"+"   document.location.replace('"+__c.SmartStringFormatter("",_ws.getSession().GetAttribute("Pais"))+".html');\n"+"   }\n"+"   \n"+"});"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 };
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub WebSocket_Disconnected";
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
