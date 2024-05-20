
package b4j.smartscan;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class huploadserver {
    public static RemoteObject myClass;
	public huploadserver() {
	}
    public static PCBA staticBA = new PCBA(null, huploadserver.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _counter = RemoteObject.createImmutable(0);
public static b4j.smartscan.main _main = null;
public static b4j.smartscan.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"counter",_ref.getField(false, "_counter")};
}
}