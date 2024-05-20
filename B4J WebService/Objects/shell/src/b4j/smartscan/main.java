
package b4j.smartscan;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.smartscan.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.smartscan.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _srvr = RemoteObject.declareNull("anywheresoftware.b4j.object.ServerWrapper");
public static RemoteObject _msj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _reload = RemoteObject.createImmutable(0);
public static RemoteObject _nombrearchivo = RemoteObject.createImmutable("");
public static RemoteObject _porcentaje = RemoteObject.createImmutable("");
public static RemoteObject _subido = RemoteObject.createImmutable(false);
public static b4j.smartscan.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"HttpUtils2Service",Debug.moduleToString(b4j.smartscan.httputils2service.class),"msj",main._msj,"NombreArchivo",main._nombrearchivo,"porcentaje",main._porcentaje,"reload",main._reload,"srvr",main._srvr,"subido",main._subido};
}
}