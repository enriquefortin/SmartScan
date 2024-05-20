package b4j.smartscan;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,21);
if (RapidSub.canDelegate("appstart")) { return b4j.smartscan.main.remoteMe.runUserSub(false, "main","appstart", _args);}
Debug.locals.put("Args", _args);
 BA.debugLineNum = 21;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="srvr.Initialize(\"srvr\")";
Debug.ShouldStop(2097152);
main._srvr.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("srvr")));
 BA.debugLineNum = 23;BA.debugLine="srvr.Port = 55555";
Debug.ShouldStop(4194304);
main._srvr.runMethod(true,"setPort",BA.numberCast(int.class, 55555));
 BA.debugLineNum = 24;BA.debugLine="srvr.StaticFilesFolder = File.Combine(File.DirApp";
Debug.ShouldStop(8388608);
main._srvr.runMethod(true,"setStaticFilesFolder",main.__c.getField(false,"File").runMethod(true,"Combine",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("www"))));
 BA.debugLineNum = 26;BA.debugLine="srvr.AddWebSocket(\"/AgregarFactura\", \"AgregarFact";
Debug.ShouldStop(33554432);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/AgregarFactura")),(Object)(RemoteObject.createImmutable("AgregarFactura")));
 BA.debugLineNum = 27;BA.debugLine="srvr.AddWebSocket(\"/ws\", \"B4A\")";
Debug.ShouldStop(67108864);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/ws")),(Object)(RemoteObject.createImmutable("B4A")));
 BA.debugLineNum = 28;BA.debugLine="srvr.AddHandler(\"/upload/v2/*\", \"hUploadServer\",";
Debug.ShouldStop(134217728);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/upload/v2/*")),(Object)(BA.ObjectToString("hUploadServer")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 29;BA.debugLine="srvr.Start";
Debug.ShouldStop(268435456);
main._srvr.runVoidMethod ("Start");
 BA.debugLineNum = 30;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 32;BA.debugLine="msj.Initialize";
Debug.ShouldStop(-2147483648);
main._msj.runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.smartscan.main");
agregarfactura.myClass = BA.getDeviceClass ("b4j.smartscan.agregarfactura");
huploadserver.myClass = BA.getDeviceClass ("b4j.smartscan.huploadserver");
b4a.myClass = BA.getDeviceClass ("b4j.smartscan.b4a");
httputils2service.myClass = BA.getDeviceClass ("b4j.smartscan.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4j.smartscan.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private srvr As Server";
main._srvr = RemoteObject.createNew ("anywheresoftware.b4j.object.ServerWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Public msj As Map";
main._msj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 13;BA.debugLine="Public reload As Int";
main._reload = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="Public NombreArchivo As String";
main._nombrearchivo = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Public porcentaje As String=\"\"";
main._porcentaje = BA.ObjectToString("");
 //BA.debugLineNum = 16;BA.debugLine="Public subido As Boolean =False";
main._subido = main.__c.getField(true,"False");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}