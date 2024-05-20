package jhs.atr;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class websockethandler extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "jhs.atr.websockethandler");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", jhs.atr.websockethandler.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.WebSocketWrapper _ws = null;
public Object _callback = null;
public String _eventname = "";
public jhs.atr.main _main = null;
public jhs.atr.starter _starter = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public ws As WebSocket";
_ws = new anywheresoftware.b4a.objects.WebSocketWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private CallBack As Object";
_callback = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Private EventName As String";
_eventname = "";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 21;BA.debugLine="If ws.Connected Then ws.Close";
if (_ws.getConnected()) { 
_ws.Close();};
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _connect(String _url) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Connect(Url As String)";
 //BA.debugLineNum = 17;BA.debugLine="ws.Connect(Url)";
_ws.Connect(_url);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
 //BA.debugLineNum = 11;BA.debugLine="CallBack = vCallback";
_callback = _vcallback;
 //BA.debugLineNum = 12;BA.debugLine="EventName = vEventName";
_eventname = _veventname;
 //BA.debugLineNum = 13;BA.debugLine="ws.Initialize(\"ws\")";
_ws.Initialize(ba,"ws");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _sendeventtoserver(String _event,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jg = null;
 //BA.debugLineNum = 25;BA.debugLine="Public Sub SendEventToServer(Event As String, Data";
 //BA.debugLineNum = 26;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 28;BA.debugLine="m.Put(\"type\", \"event\")";
_m.Put((Object)("type"),(Object)("event"));
 //BA.debugLineNum = 29;BA.debugLine="m.Put(\"event\", Event)";
_m.Put((Object)("event"),(Object)(_event));
 //BA.debugLineNum = 30;BA.debugLine="m.Put(\"params\", Data)";
_m.Put((Object)("params"),(Object)(_data.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 32;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 33;BA.debugLine="ws.SendText(jg.ToString)";
_ws.SendText(_jg.ToString());
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _ws_closed(String _reason) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Private Sub ws_Closed (Reason As String)";
 //BA.debugLineNum = 57;BA.debugLine="CallSub2(CallBack, EventName & \"_Closed\", Reason)";
__c.CallSubNew2(ba,_callback,_eventname+"_Closed",(Object)(_reason));
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _ws_connected() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Private Sub ws_Connected";
 //BA.debugLineNum = 53;BA.debugLine="CallSub(CallBack,  EventName & \"_Connected\")";
__c.CallSubNew(ba,_callback,_eventname+"_Connected");
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _ws_textmessage(String _msg) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _etype = "";
anywheresoftware.b4a.objects.collections.List _params = null;
String _event = "";
 //BA.debugLineNum = 36;BA.debugLine="Private Sub ws_TextMessage(msg As String)";
 //BA.debugLineNum = 37;BA.debugLine="Try";
try { //BA.debugLineNum = 38;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 39;BA.debugLine="jp.Initialize(msg)";
_jp.Initialize(_msg);
 //BA.debugLineNum = 40;BA.debugLine="Dim m As Map = jp.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _jp.NextObject();
 //BA.debugLineNum = 41;BA.debugLine="Dim etype As String = m.get(\"etype\")";
_etype = BA.ObjectToString(_m.Get((Object)("etype")));
 //BA.debugLineNum = 42;BA.debugLine="Dim params As List = m.get(\"value\")";
_params = new anywheresoftware.b4a.objects.collections.List();
_params = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("value"))));
 //BA.debugLineNum = 43;BA.debugLine="Dim event As String = m.get(\"prop\")";
_event = BA.ObjectToString(_m.Get((Object)("prop")));
 //BA.debugLineNum = 44;BA.debugLine="If etype = \"runFunction\" Then";
if ((_etype).equals("runFunction")) { 
 //BA.debugLineNum = 45;BA.debugLine="CallSub2(CallBack, EventName & \"_\" & event, par";
__c.CallSubNew2(ba,_callback,_eventname+"_"+_event,(Object)(_params));
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 48;BA.debugLine="Log(\"TextMessage Error: \" & LastException)";
__c.LogImpl("81900556","TextMessage Error: "+BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
