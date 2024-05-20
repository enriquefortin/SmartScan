
package b4j.smartscan;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4a {
    public static RemoteObject myClass;
	public b4a() {
	}
    public static PCBA staticBA = new PCBA(null, b4a.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static b4j.smartscan.main _main = null;
public static b4j.smartscan.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"timer1",_ref.getField(false, "_timer1"),"ws",_ref.getField(false, "_ws")};
}
}