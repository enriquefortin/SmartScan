
package b4j.smartscan;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class agregarfactura {
    public static RemoteObject myClass;
	public agregarfactura() {
	}
    public static PCBA staticBA = new PCBA(null, agregarfactura.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _txtempresa = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtcai = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtrtn = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtmontototal = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _txtmensaje = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _filenamedisplay = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _jqm = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _subir = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _langmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _langlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _tesseractinstalled = RemoteObject.createImmutable(false);
public static RemoteObject _t_p = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static b4j.smartscan.main _main = null;
public static b4j.smartscan.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"filenamedisplay",_ref.getField(false, "_filenamedisplay"),"jqm",_ref.getField(false, "_jqm"),"langlist",_ref.getField(false, "_langlist"),"langmap",_ref.getField(false, "_langmap"),"subir",_ref.getField(false, "_subir"),"t_p",_ref.getField(false, "_t_p"),"tesseractInstalled",_ref.getField(false, "_tesseractinstalled"),"timer1",_ref.getField(false, "_timer1"),"txtcai",_ref.getField(false, "_txtcai"),"txtempresa",_ref.getField(false, "_txtempresa"),"txtmensaje",_ref.getField(false, "_txtmensaje"),"txtmontototal",_ref.getField(false, "_txtmontototal"),"txtrtn",_ref.getField(false, "_txtrtn"),"ws",_ref.getField(false, "_ws")};
}
}