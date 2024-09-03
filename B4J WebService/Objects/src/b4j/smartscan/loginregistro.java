package b4j.smartscan;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class loginregistro extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.smartscan", "b4j.smartscan.loginregistro", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.smartscan.loginregistro.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.WebSocket _ws = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _microsoft_login = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblmail = null;
public String _jscript = "";
public String _mail = "";
public String _username = "";
public String _pass = "";
public String _lasttwochars = "";
public b4j.smartscan.main _main = null;
public b4j.smartscan.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
 //BA.debugLineNum = 4;BA.debugLine="Private microsoft_login As JQueryElement";
_microsoft_login = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
 //BA.debugLineNum = 5;BA.debugLine="Private lblmail As JQueryElement";
_lblmail = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
 //BA.debugLineNum = 6;BA.debugLine="Private jscript As String";
_jscript = "";
 //BA.debugLineNum = 7;BA.debugLine="Private mail As String =\"\"";
_mail = "";
 //BA.debugLineNum = 8;BA.debugLine="Private username As String =\"\"";
_username = "";
 //BA.debugLineNum = 9;BA.debugLine="Private pass As String=\"\"";
_pass = "";
 //BA.debugLineNum = 10;BA.debugLine="Private lastTwoChars As String";
_lasttwochars = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _event_register(anywheresoftware.b4a.objects.collections.Map _variable) throws Exception{
String _token = "";
 //BA.debugLineNum = 110;BA.debugLine="Sub event_register(variable As Map)";
 //BA.debugLineNum = 111;BA.debugLine="Log(\"CONNECTED\")";
__c.LogImpl("212058625","CONNECTED",0);
 //BA.debugLineNum = 112;BA.debugLine="Dim token As String = variable.Get(\"tk\")";
_token = BA.ObjectToString(_variable.Get((Object)("tk")));
 //BA.debugLineNum = 113;BA.debugLine="Main.firetoken.verifyIdToken(token)";
_main._firetoken /*com.tummosoft.muix.jFirebaseAuthWrapper*/ .verifyIdToken(ba,_token);
 //BA.debugLineNum = 116;BA.debugLine="Log(\"is found desde mensaje\")";
__c.LogImpl("212058630","is found desde mensaje",0);
 //BA.debugLineNum = 117;BA.debugLine="ws.Eval($\"Swal.fire({    title: 'Inicio de Sessió";
_ws.Eval(("Swal.fire({\n"+"   title: 'Inicio de Sessión Correcto',\n"+"   text: 'Verificación completada.',\n"+"   icon: 'success',\n"+"   showConfirmButton: true\n"+"}).then((result) => {\n"+"   if (result.isConfirmed) {\n"+"     alertify.success('Documentación enviada.');\n"+"	 //document.location.replace('index.html');\n"+"   }\n"+"});"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 129;BA.debugLine="Main.firetoken.closeConnection";
_main._firetoken /*com.tummosoft.muix.jFirebaseAuthWrapper*/ .closeConnection();
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _firebaseauth_tokenverified(anywheresoftware.b4a.objects.collections.Map _token) throws Exception{
String _email = "";
 //BA.debugLineNum = 56;BA.debugLine="Sub firebaseauth_tokenverified (Token As Map)";
 //BA.debugLineNum = 57;BA.debugLine="username=Token.Get(\"getName\")";
_username = BA.ObjectToString(_token.Get((Object)("getName")));
 //BA.debugLineNum = 58;BA.debugLine="mail=Token.Get(\"getEmail\")";
_mail = BA.ObjectToString(_token.Get((Object)("getEmail")));
 //BA.debugLineNum = 59;BA.debugLine="pass=Token.Get(\"getUid\")";
_pass = BA.ObjectToString(_token.Get((Object)("getUid")));
 //BA.debugLineNum = 60;BA.debugLine="Log(username)";
__c.LogImpl("211993092",_username,0);
 //BA.debugLineNum = 61;BA.debugLine="Log(mail)";
__c.LogImpl("211993093",_mail,0);
 //BA.debugLineNum = 62;BA.debugLine="Log(pass)";
__c.LogImpl("211993094",_pass,0);
 //BA.debugLineNum = 64;BA.debugLine="ws.Session.SetAttribute(\"UserId\",Token.Get(\"getUi";
_ws.getSession().SetAttribute("UserId",_token.Get((Object)("getUid")));
 //BA.debugLineNum = 65;BA.debugLine="ws.Session.SetAttribute(\"UserName\",Token.Get(\"get";
_ws.getSession().SetAttribute("UserName",_token.Get((Object)("getName")));
 //BA.debugLineNum = 66;BA.debugLine="ws.Session.SetAttribute(\"Email\",Token.Get(\"getEma";
_ws.getSession().SetAttribute("Email",_token.Get((Object)("getEmail")));
 //BA.debugLineNum = 68;BA.debugLine="Log(ws.Session.GetAttribute(\"UserName\"))";
__c.LogImpl("211993100",BA.ObjectToString(_ws.getSession().GetAttribute("UserName")),0);
 //BA.debugLineNum = 71;BA.debugLine="Dim email As String";
_email = "";
 //BA.debugLineNum = 72;BA.debugLine="email = Token.Get(\"getEmail\")";
_email = BA.ObjectToString(_token.Get((Object)("getEmail")));
 //BA.debugLineNum = 76;BA.debugLine="lastTwoChars = email.SubString2(email.Length - 2,";
_lasttwochars = _email.substring((int) (_email.length()-2),_email.length());
 //BA.debugLineNum = 79;BA.debugLine="lastTwoChars = lastTwoChars.ToUpperCase()";
_lasttwochars = _lasttwochars.toUpperCase();
 //BA.debugLineNum = 82;BA.debugLine="Log(lastTwoChars)";
__c.LogImpl("211993114",_lasttwochars,0);
 //BA.debugLineNum = 83;BA.debugLine="If lastTwoChars=\"HN\" Then";
if ((_lasttwochars).equals("HN")) { 
 //BA.debugLineNum = 84;BA.debugLine="ws.Eval(\"document.location.replace('HN.html');\",";
_ws.Eval("document.location.replace('HN.html');",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 85;BA.debugLine="ws.Session.SetAttribute(\"Pais\",\"HN\")";
_ws.getSession().SetAttribute("Pais",(Object)("HN"));
 }else if((_lasttwochars).equals("SV")) { 
 //BA.debugLineNum = 87;BA.debugLine="ws.Eval(\"document.location.replace('SV.html');\",";
_ws.Eval("document.location.replace('SV.html');",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 88;BA.debugLine="ws.Session.SetAttribute(\"Pais\",\"SV\")";
_ws.getSession().SetAttribute("Pais",(Object)("SV"));
 }else if((_lasttwochars).equals("GT")) { 
 //BA.debugLineNum = 90;BA.debugLine="ws.Eval(\"document.location.replace('GT.html');\",";
_ws.Eval("document.location.replace('GT.html');",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 91;BA.debugLine="ws.Session.SetAttribute(\"Pais\",\"GT\")";
_ws.getSession().SetAttribute("Pais",(Object)("GT"));
 }else if((_lasttwochars).equals("PA")) { 
 //BA.debugLineNum = 93;BA.debugLine="ws.Eval(\"document.location.replace('PA.html');\",";
_ws.Eval("document.location.replace('PA.html');",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 94;BA.debugLine="ws.Session.SetAttribute(\"Pais\",\"PA\")";
_ws.getSession().SetAttribute("Pais",(Object)("PA"));
 }else if((_lasttwochars).equals("NI")) { 
 //BA.debugLineNum = 96;BA.debugLine="ws.Eval(\"document.location.replace('NI.html');\",";
_ws.Eval("document.location.replace('NI.html');",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 97;BA.debugLine="ws.Session.SetAttribute(\"Pais\",\"NI\")";
_ws.getSession().SetAttribute("Pais",(Object)("NI"));
 }else if((_lasttwochars).equals("CR")) { 
 //BA.debugLineNum = 99;BA.debugLine="ws.Eval(\"document.location.replace('CR.html');\",";
_ws.Eval("document.location.replace('CR.html');",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 100;BA.debugLine="ws.Session.SetAttribute(\"Pais\",\"CR\")";
_ws.getSession().SetAttribute("Pais",(Object)("CR"));
 }else if((_lasttwochars).equals("CO")) { 
 //BA.debugLineNum = 102;BA.debugLine="ws.Eval(\"document.location.replace('CO.html');\",";
_ws.Eval("document.location.replace('CO.html');",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 103;BA.debugLine="ws.Session.SetAttribute(\"Pais\",\"CO\")";
_ws.getSession().SetAttribute("Pais",(Object)("CO"));
 };
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 15;BA.debugLine="jscript=$\" var firebaseConfig = {     apiKey: \"AI";
_jscript = ("\n"+"var firebaseConfig = {\n"+"    apiKey: \"AIzaSyAfeOuhe4N-0O1fwCnVGwgR8ywDdEznOG0\",\n"+"    authDomain: \"kateen-le-app.firebaseapp.com\",\n"+"    projectId: \"kateen-le-app\",\n"+"    storageBucket: \"kateen-le-app.appspot.com\",\n"+"    messagingSenderId: \"163149882505\",\n"+"    appId: \"1:163149882505:web:3ae63811b49a1bf3751258\",\n"+"    measurementId: \"G-Q4QLS0LW24\"\n"+"};\n"+"firebase.initializeApp(firebaseConfig);\n"+"\n"+"	");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _microsoft_login_click(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub microsoft_login_Click (Params As Map)";
 //BA.debugLineNum = 51;BA.debugLine="Log(\"btn microsoft precionado\")";
__c.LogImpl("211927553","btn microsoft precionado",0);
 //BA.debugLineNum = 52;BA.debugLine="ws.Eval(\"setTimeout(function() { signInWithMicros";
_ws.Eval("setTimeout(function() { signInWithMicrosoft(); }, 100);",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
 //BA.debugLineNum = 33;BA.debugLine="ws = WebSocket1";
_ws = _websocket1;
 //BA.debugLineNum = 34;BA.debugLine="Log(\"Cliente conectado\")";
__c.LogImpl("211796482","Cliente conectado",0);
 //BA.debugLineNum = 35;BA.debugLine="ws.Eval(jscript,Null)";
_ws.Eval(_jscript,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 36;BA.debugLine="ws.Session.SetAttribute(\"UserId\",0)";
_ws.getSession().SetAttribute("UserId",(Object)(0));
 //BA.debugLineNum = 37;BA.debugLine="ws.Session.SetAttribute(\"UserName\",0)";
_ws.getSession().SetAttribute("UserName",(Object)(0));
 //BA.debugLineNum = 38;BA.debugLine="ws.Session.SetAttribute(\"Email\",0)";
_ws.getSession().SetAttribute("Email",(Object)(0));
 //BA.debugLineNum = 39;BA.debugLine="ws.Session.SetAttribute(\"Pais\",\"\")";
_ws.getSession().SetAttribute("Pais",(Object)(""));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Private Sub WebSocket_Disconnected";
 //BA.debugLineNum = 45;BA.debugLine="Log(\"conectado\")";
__c.LogImpl("211862017","conectado",0);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
