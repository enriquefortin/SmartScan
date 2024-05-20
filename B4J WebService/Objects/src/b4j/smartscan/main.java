package b4j.smartscan;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.smartscan", "b4j.smartscan.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4a.StandardBA("b4j.smartscan", null, null);
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


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.object.ServerWrapper _srvr = null;
public static anywheresoftware.b4a.objects.collections.Map _msj = null;
public static int _reload = 0;
public static String _nombrearchivo = "";
public static String _porcentaje = "";
public static boolean _subido = false;
public static b4j.smartscan.httputils2service _httputils2service = null;
public static String  _appstart(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="srvr.Initialize(\"srvr\")";
_srvr.Initialize(ba,"srvr");
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="srvr.Port = 55555";
_srvr.setPort((int) (55555));
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="srvr.StaticFilesFolder = File.Combine(File.DirApp";
_srvr.setStaticFilesFolder(anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"www"));
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="srvr.AddWebSocket(\"/AgregarFactura\", \"AgregarFact";
_srvr.AddWebSocket("/AgregarFactura","AgregarFactura");
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="srvr.AddWebSocket(\"/ws\", \"B4A\")";
_srvr.AddWebSocket("/ws","B4A");
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="srvr.AddHandler(\"/upload/v2/*\", \"hUploadServer\",";
_srvr.AddHandler("/upload/v2/*","hUploadServer",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="srvr.Start";
_srvr.Start();
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="msj.Initialize";
_msj.Initialize();
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="End Sub";
return "";
}
}