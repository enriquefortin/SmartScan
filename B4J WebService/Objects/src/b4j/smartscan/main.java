package b4j.smartscan;


import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.StandardBA("b4j.smartscan", "b4j.smartscan.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.smartscan.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.object.ServerWrapper _srvr = null;
public static anywheresoftware.b4a.objects.collections.Map _msj = null;
public static int _reload = 0;
public static String _nombrearchivo = "";
public static String _porcentaje = "";
public static boolean _subido = false;
public static anywheresoftware.b4a.objects.collections.Map _sessionid = null;
public static anywheresoftware.b4j.objects.SQL _sql1 = null;
public static com.tummosoft.muix.jFirebaseAuthWrapper _firetoken = null;
public static anywheresoftware.b4j.object.ConnectionPool _pool = null;
public static b4j.smartscan.httputils2service _httputils2service = null;
public static String  _appstart(String[] _args) throws Exception{
String _auth = "";
 //BA.debugLineNum = 57;BA.debugLine="Sub AppStart (Args() As String)";
 //BA.debugLineNum = 58;BA.debugLine="pool.Initialize(\"com.mysql.cj.jdbc.Driver\",\"jdbc:";
_pool.Initialize("com.mysql.cj.jdbc.Driver","jdbc:mysql://10.125.15.164/SMARTSCAN?characterEncoding=utf8","ocrapp","$datosocr!");
 //BA.debugLineNum = 59;BA.debugLine="sessionid.Initialize";
_sessionid.Initialize();
 //BA.debugLineNum = 60;BA.debugLine="srvr.Initialize(\"srvr\")";
_srvr.Initialize(ba,"srvr");
 //BA.debugLineNum = 61;BA.debugLine="srvr.Port = 80";
_srvr.setPort((int) (80));
 //BA.debugLineNum = 62;BA.debugLine="srvr.StaticFilesFolder = File.Combine(File.DirApp";
_srvr.setStaticFilesFolder(anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"www"));
 //BA.debugLineNum = 63;BA.debugLine="srvr.AddWebSocket(\"/HN\", \"HN\")";
_srvr.AddWebSocket("/HN","HN");
 //BA.debugLineNum = 64;BA.debugLine="srvr.AddWebSocket(\"/CR\", \"CR\")";
_srvr.AddWebSocket("/CR","CR");
 //BA.debugLineNum = 65;BA.debugLine="srvr.AddWebSocket(\"/NI\", \"NI\")";
_srvr.AddWebSocket("/NI","NI");
 //BA.debugLineNum = 66;BA.debugLine="srvr.AddWebSocket(\"/SV\", \"SV\")";
_srvr.AddWebSocket("/SV","SV");
 //BA.debugLineNum = 67;BA.debugLine="srvr.AddWebSocket(\"/PA\", \"PA\")";
_srvr.AddWebSocket("/PA","PA");
 //BA.debugLineNum = 68;BA.debugLine="srvr.AddWebSocket(\"/CO\", \"CO\")";
_srvr.AddWebSocket("/CO","CO");
 //BA.debugLineNum = 69;BA.debugLine="srvr.AddWebSocket(\"/GT\", \"GT\")";
_srvr.AddWebSocket("/GT","GT");
 //BA.debugLineNum = 70;BA.debugLine="srvr.AddWebSocket(\"/index\", \"Index\")";
_srvr.AddWebSocket("/index","Index");
 //BA.debugLineNum = 71;BA.debugLine="srvr.AddHandler(\"/upload/v2/*\", \"hUploadServer\",";
_srvr.AddHandler("/upload/v2/*","hUploadServer",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 72;BA.debugLine="srvr.AddWebSocket(\"/LoginRegister\", \"LogInRegistr";
_srvr.AddWebSocket("/LoginRegister","LogInRegistro");
 //BA.debugLineNum = 73;BA.debugLine="srvr.AddFilter(\"/*\", \"SessionCreator\", False)";
_srvr.AddFilter("/*","SessionCreator",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 74;BA.debugLine="srvr.Start";
_srvr.Start();
 //BA.debugLineNum = 75;BA.debugLine="Dim auth As String = File.Combine(File.DirApp,\"ka";
_auth = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"kateen-le-app-firebase-adminsdk-dnsu1-ac68a2e2c7.json");
 //BA.debugLineNum = 76;BA.debugLine="firetoken.Initialize(\"firebaseauth\", auth)";
_firetoken.Initialize("firebaseauth",_auth);
 //BA.debugLineNum = 77;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
 //BA.debugLineNum = 79;BA.debugLine="msj.Initialize";
_msj.Initialize();
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 43;BA.debugLine="Private srvr As Server";
_srvr = new anywheresoftware.b4j.object.ServerWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Public msj As Map";
_msj = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 45;BA.debugLine="Public reload As Int";
_reload = 0;
 //BA.debugLineNum = 46;BA.debugLine="Public NombreArchivo As String";
_nombrearchivo = "";
 //BA.debugLineNum = 47;BA.debugLine="Public porcentaje As String=\"\"";
_porcentaje = "";
 //BA.debugLineNum = 48;BA.debugLine="Public subido As Boolean =False";
_subido = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 49;BA.debugLine="Public sessionid As Map";
_sessionid = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 50;BA.debugLine="Dim sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
 //BA.debugLineNum = 51;BA.debugLine="Public firetoken As jFirebaseAuthWrapper";
_firetoken = new com.tummosoft.muix.jFirebaseAuthWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Public pool As ConnectionPool";
_pool = new anywheresoftware.b4j.object.ConnectionPool();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _validarusuario(anywheresoftware.b4j.object.WebSocket _ws,anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="public Sub ValidarUsuario(ws As WebSocket, lbluser";
 //BA.debugLineNum = 85;BA.debugLine="Try";
try { //BA.debugLineNum = 86;BA.debugLine="If ws.Session.GetAttribute(\"UserId\") = Null Or 0";
if (_ws.getSession().GetAttribute("UserId")== null || 0==(double)(BA.ObjectToNumber(_ws.getSession().GetAttribute("UserId")))) { 
 //BA.debugLineNum = 87;BA.debugLine="ws.Eval(\"document.location.replace('auth-login-";
_ws.Eval("document.location.replace('auth-login-basic.html')",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
 }else {
 //BA.debugLineNum = 89;BA.debugLine="lblusernamemain.SetHtml(ws.Session.GetAttribute";
_lblusernamemain.SetHtml(BA.ObjectToString(_ws.getSession().GetAttribute("UserName")));
 };
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 92;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("2131080",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
}
