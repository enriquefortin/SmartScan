package b4j.smartscan;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4a extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.smartscan", "b4j.smartscan.b4a", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.smartscan.b4a.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.WebSocket _ws = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public b4j.smartscan.main _main = null;
public b4j.smartscan.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
 //BA.debugLineNum = 4;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _device_message(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Device_Message(Params As Map)";
 //BA.debugLineNum = 23;BA.debugLine="Log(\"Device message: \" & Params.Get(\"message\"))";
__c.LogImpl("212648449","Device message: "+BA.ObjectToString(_params.Get((Object)("message"))),0);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 18;BA.debugLine="ws.RunFunction(\"ServerTime\", Array As Object(Date";
_ws.RunFunction("ServerTime",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__c.DateTime.Time(__c.DateTime.getNow()))}));
 //BA.debugLineNum = 19;BA.debugLine="ws.Flush";
_ws.Flush();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
 //BA.debugLineNum = 12;BA.debugLine="ws = WebSocket1";
_ws = _websocket1;
 //BA.debugLineNum = 13;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
_timer1.Initialize(ba,"timer1",(long) (1000));
 //BA.debugLineNum = 14;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Private Sub WebSocket_Disconnected";
 //BA.debugLineNum = 27;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 28;BA.debugLine="Log(\"disconnected\")";
__c.LogImpl("212713986","disconnected",0);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
