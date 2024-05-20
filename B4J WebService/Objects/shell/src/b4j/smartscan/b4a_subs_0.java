package b4j.smartscan;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4a_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
b4a._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",b4a._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private timer1 As Timer";
b4a._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer1",b4a._timer1);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _device_message(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Device_Message (b4a) ","b4a",3,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("device_message")) { return __ref.runUserSub(false, "b4a","device_message", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 22;BA.debugLine="Sub Device_Message(Params As Map)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Log(\"Device message: \" & Params.Get(\"message\"))";
Debug.ShouldStop(4194304);
b4a.__c.runVoidMethod ("LogImpl","31966081",RemoteObject.concat(RemoteObject.createImmutable("Device message: "),_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message"))))),0);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4a) ","b4a",3,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4a","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (b4a) ","b4a",3,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("timer1_tick")) { return __ref.runUserSub(false, "b4a","timer1_tick", __ref);}
 BA.debugLineNum = 17;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="ws.RunFunction(\"ServerTime\", Array As Object(Date";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("ServerTime")),(Object)(b4a.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(b4a.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(b4a.__c.getField(false,"DateTime").runMethod(true,"getNow"))))})))));
 BA.debugLineNum = 19;BA.debugLine="ws.Flush";
Debug.ShouldStop(262144);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (b4a) ","b4a",3,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "b4a","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 11;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(2048);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 13;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
Debug.ShouldStop(4096);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 14;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4a.__c.getField(true,"True"));
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_disconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Disconnected (b4a) ","b4a",3,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "b4a","websocket_disconnected", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4a.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="Log(\"disconnected\")";
Debug.ShouldStop(134217728);
b4a.__c.runVoidMethod ("LogImpl","32031618",RemoteObject.createImmutable("disconnected"),0);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}