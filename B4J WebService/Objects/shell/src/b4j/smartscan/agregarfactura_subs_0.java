package b4j.smartscan;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class agregarfactura_subs_0 {


public static RemoteObject  _application_error(RemoteObject __ref,RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("application_error")) { return __ref.runUserSub(false, "agregarfactura","application_error", __ref, _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 195;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="Log(\"Error\")";
Debug.ShouldStop(8);
agregarfactura.__c.runVoidMethod ("LogImpl","3983041",RemoteObject.createImmutable("Error"),0);
 BA.debugLineNum = 197;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return agregarfactura.__c.getField(true,"True");
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
agregarfactura._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",agregarfactura._ws);
 //BA.debugLineNum = 4;BA.debugLine="Private txtempresa, txtcai, txtrtn, txtmontototal";
agregarfactura._txtempresa = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtempresa",agregarfactura._txtempresa);
agregarfactura._txtcai = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtcai",agregarfactura._txtcai);
agregarfactura._txtrtn = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtrtn",agregarfactura._txtrtn);
agregarfactura._txtmontototal = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtmontototal",agregarfactura._txtmontototal);
agregarfactura._txtmensaje = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_txtmensaje",agregarfactura._txtmensaje);
agregarfactura._filenamedisplay = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_filenamedisplay",agregarfactura._filenamedisplay);
agregarfactura._jqm = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_jqm",agregarfactura._jqm);
agregarfactura._subir = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_subir",agregarfactura._subir);
 //BA.debugLineNum = 5;BA.debugLine="Private timer1 As Timer";
agregarfactura._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer1",agregarfactura._timer1);
 //BA.debugLineNum = 6;BA.debugLine="Private langmap As Map";
agregarfactura._langmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_langmap",agregarfactura._langmap);
 //BA.debugLineNum = 7;BA.debugLine="Private langlist As List";
agregarfactura._langlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_langlist",agregarfactura._langlist);
 //BA.debugLineNum = 8;BA.debugLine="Private tesseractInstalled As Boolean = True";
agregarfactura._tesseractinstalled = agregarfactura.__c.getField(true,"True");__ref.setField("_tesseractinstalled",agregarfactura._tesseractinstalled);
 //BA.debugLineNum = 9;BA.debugLine="Private t_p As Timer";
agregarfactura._t_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_t_p",agregarfactura._t_p);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _colocar_cero(RemoteObject __ref,RemoteObject _param) throws Exception{
try {
		Debug.PushSubsStack("Colocar_cero (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("colocar_cero")) { return __ref.runUserSub(false, "agregarfactura","colocar_cero", __ref, _param);}
Debug.locals.put("param", _param);
 BA.debugLineNum = 176;BA.debugLine="Sub Colocar_cero (param As Map)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="Log(\"colococero desde js\")";
Debug.ShouldStop(65536);
agregarfactura.__c.runVoidMethod ("LogImpl","3851969",RemoteObject.createImmutable("colococero desde js"),0);
 BA.debugLineNum = 178;BA.debugLine="Main.porcentaje=\"\"";
Debug.ShouldStop(131072);
agregarfactura._main._porcentaje /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 179;BA.debugLine="enviarporcentaje(0)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.smartscan.agregarfactura.class, "_enviarporcentaje" /*RemoteObject*/ ,(Object)(BA.NumberToString(0)));
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _device_message(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Device_Message (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("device_message")) { return __ref.runUserSub(false, "agregarfactura","device_message", __ref, _params);}
Debug.locals.put("Params", _params);
 BA.debugLineNum = 38;BA.debugLine="Sub Device_Message(Params As Map)";
Debug.ShouldStop(32);
 BA.debugLineNum = 41;BA.debugLine="Main.msj=Params";
Debug.ShouldStop(256);
agregarfactura._main._msj /*RemoteObject*/  = _params;
 BA.debugLineNum = 42;BA.debugLine="Log(Main.msj.Get(\"message\"))";
Debug.ShouldStop(512);
agregarfactura.__c.runVoidMethod ("LogImpl","3393220",BA.ObjectToString(agregarfactura._main._msj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message"))))),0);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enviarporcentaje(RemoteObject __ref,RemoteObject _algo) throws Exception{
try {
		Debug.PushSubsStack("enviarporcentaje (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("enviarporcentaje")) { return __ref.runUserSub(false, "agregarfactura","enviarporcentaje", __ref, _algo);}
Debug.locals.put("algo", _algo);
 BA.debugLineNum = 169;BA.debugLine="Public Sub enviarporcentaje (algo As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="ws.Eval($\"updateProgress(${algo});\"$,Null)";
Debug.ShouldStop(512);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)((RemoteObject.concat(RemoteObject.createImmutable("updateProgress("),agregarfactura.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_algo))),RemoteObject.createImmutable(");")))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), agregarfactura.__c.getField(false,"Null")));
 BA.debugLineNum = 171;BA.debugLine="ws.Eval(\"location.reload(True);\",Null)";
Debug.ShouldStop(1024);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)(BA.ObjectToString("location.reload(True);")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), agregarfactura.__c.getField(false,"Null")));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "agregarfactura","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
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
public static RemoteObject  _jqm_click(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("jqm_Click (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("jqm_click")) { return __ref.runUserSub(false, "agregarfactura","jqm_click", __ref, _params);}
Debug.locals.put("params", _params);
 BA.debugLineNum = 187;BA.debugLine="Private Sub jqm_Click(params As Map)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="Log(\"CLICK\")";
Debug.ShouldStop(134217728);
agregarfactura.__c.runVoidMethod ("LogImpl","3917505",RemoteObject.createImmutable("CLICK"),0);
 BA.debugLineNum = 189;BA.debugLine="txtmensaje.SetHtml(Main.msj.Get(\"message\"))";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtmensaje" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(BA.ObjectToString(agregarfactura._main._msj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))))));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _leertesseract(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("leertesseract (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("leertesseract")) { return __ref.runUserSub(false, "agregarfactura","leertesseract", __ref);}
RemoteObject _sh = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
 BA.debugLineNum = 46;BA.debugLine="Sub leertesseract'_Click(Params As Map)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Log(\"click al boton leertesseract\")";
Debug.ShouldStop(16384);
agregarfactura.__c.runVoidMethod ("LogImpl","3458753",RemoteObject.createImmutable("click al boton leertesseract"),0);
 BA.debugLineNum = 49;BA.debugLine="Dim sh As Shell";
Debug.ShouldStop(65536);
_sh = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("sh", _sh);
 BA.debugLineNum = 50;BA.debugLine="sh.Initialize(\"sh\",\"tesseract\",Null)";
Debug.ShouldStop(131072);
_sh.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("sh")),(Object)(BA.ObjectToString("tesseract")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), agregarfactura.__c.getField(false,"Null")));
 BA.debugLineNum = 51;BA.debugLine="sh.run(10000)";
Debug.ShouldStop(262144);
_sh.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, 10000)));
 BA.debugLineNum = 52;BA.debugLine="langmap.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_langmap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="langlist.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_langlist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 54;BA.debugLine="langlist.Add(\"spa_old\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_langlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("spa_old"))));
 BA.debugLineNum = 55;BA.debugLine="langmap.Put(\"Español\",langlist.Get(0))";
Debug.ShouldStop(4194304);
__ref.getField(false,"_langmap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Español"))),(Object)(__ref.getField(false,"_langlist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 56;BA.debugLine="Log(langlist)";
Debug.ShouldStop(8388608);
agregarfactura.__c.runVoidMethod ("LogImpl","3458762",BA.ObjectToString(__ref.getField(false,"_langlist" /*RemoteObject*/ )),0);
 BA.debugLineNum = 57;BA.debugLine="Log(langmap)";
Debug.ShouldStop(16777216);
agregarfactura.__c.runVoidMethod ("LogImpl","3458763",BA.ObjectToString(__ref.getField(false,"_langmap" /*RemoteObject*/ )),0);
 BA.debugLineNum = 58;BA.debugLine="Log(langmap.Get(\"Español\"))";
Debug.ShouldStop(33554432);
agregarfactura.__c.runVoidMethod ("LogImpl","3458764",BA.ObjectToString(__ref.getField(false,"_langmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Español"))))),0);
 BA.debugLineNum = 61;BA.debugLine="ProcessImage";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.smartscan.agregarfactura.class, "_processimage" /*RemoteObject*/ );
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ocr_finished(RemoteObject __ref,RemoteObject _text,RemoteObject _processingtime) throws Exception{
try {
		Debug.PushSubsStack("OCR_finished (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("ocr_finished")) { return __ref.runUserSub(false, "agregarfactura","ocr_finished", __ref, _text, _processingtime);}
Debug.locals.put("Text", _text);
Debug.locals.put("ProcessingTime", _processingtime);
 BA.debugLineNum = 201;BA.debugLine="Sub OCR_finished (Text As String,ProcessingTime As";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="Log(Text)";
Debug.ShouldStop(512);
agregarfactura.__c.runVoidMethod ("LogImpl","31048577",_text,0);
 BA.debugLineNum = 203;BA.debugLine="Log(ProcessingTime & \" ms\")";
Debug.ShouldStop(1024);
agregarfactura.__c.runVoidMethod ("LogImpl","31048578",RemoteObject.concat(_processingtime,RemoteObject.createImmutable(" ms")),0);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ocr_overlay(RemoteObject __ref,RemoteObject _overlay) throws Exception{
try {
		Debug.PushSubsStack("OCR_overlay (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("ocr_overlay")) { return __ref.runUserSub(false, "agregarfactura","ocr_overlay", __ref, _overlay);}
Debug.locals.put("Overlay", _overlay);
 BA.debugLineNum = 206;BA.debugLine="Sub OCR_overlay (Overlay As Map)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="Log(Overlay)";
Debug.ShouldStop(16384);
agregarfactura.__c.runVoidMethod ("LogImpl","31114113",BA.ObjectToString(_overlay),0);
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _processimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ProcessImage (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("processimage")) { return __ref.runUserSub(false, "agregarfactura","processimage", __ref);}
RemoteObject _uploadedimagepath = RemoteObject.createImmutable("");
RemoteObject _inp = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 BA.debugLineNum = 68;BA.debugLine="Sub ProcessImage";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="If Main.NombreArchivo <> \"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",agregarfactura._main._nombrearchivo /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 75;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 77;BA.debugLine="Dim uploadedImagePath As String = File.Combine(F";
Debug.ShouldStop(4096);
_uploadedimagepath = agregarfactura.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(agregarfactura.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/up"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("uploadedImagePath", _uploadedimagepath);Debug.locals.put("uploadedImagePath", _uploadedimagepath);
 BA.debugLineNum = 80;BA.debugLine="Log(Main.NombreArchivo)";
Debug.ShouldStop(32768);
agregarfactura.__c.runVoidMethod ("LogImpl","3524300",agregarfactura._main._nombrearchivo /*RemoteObject*/ ,0);
 BA.debugLineNum = 81;BA.debugLine="Dim Inp As InputStream = File.OpenInput(uploaded";
Debug.ShouldStop(65536);
_inp = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_inp = agregarfactura.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_uploadedimagepath),(Object)(agregarfactura._main._nombrearchivo /*RemoteObject*/ ));Debug.locals.put("Inp", _inp);Debug.locals.put("Inp", _inp);
 BA.debugLineNum = 84;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.D";
Debug.ShouldStop(524288);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = agregarfactura.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(RemoteObject.concat(agregarfactura.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/tesseract-ocr"))),(Object)(BA.ObjectToString("image.png")),(Object)(agregarfactura.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 87;BA.debugLine="File.Copy2(Inp, out)";
Debug.ShouldStop(4194304);
agregarfactura.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_inp.getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 90;BA.debugLine="out.Close";
Debug.ShouldStop(33554432);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 95;BA.debugLine="scan";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.smartscan.agregarfactura.class, "_scan" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 97;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
agregarfactura.__c.runVoidMethod ("LogImpl","3524317",BA.ObjectToString(agregarfactura.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scan(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("scan (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("scan")) { return __ref.runUserSub(false, "agregarfactura","scan", __ref);}
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sh1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
 BA.debugLineNum = 104;BA.debugLine="Sub scan";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Dim args As List";
Debug.ShouldStop(256);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 106;BA.debugLine="args.Initialize";
Debug.ShouldStop(512);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 107;BA.debugLine="args.AddAll(Array As String(\"image.png\",\"output\",";
Debug.ShouldStop(1024);
_args.runVoidMethod ("AddAll",(Object)(agregarfactura.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("image.png"),BA.ObjectToString("output"),BA.ObjectToString("-l"),BA.ObjectToString(__ref.getField(false,"_langmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Español")))))})))));
 BA.debugLineNum = 108;BA.debugLine="Dim sh1 As Shell";
Debug.ShouldStop(2048);
_sh1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("sh1", _sh1);
 BA.debugLineNum = 109;BA.debugLine="tesseractInstalled=True";
Debug.ShouldStop(4096);
__ref.setField ("_tesseractinstalled" /*RemoteObject*/ ,agregarfactura.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="If tesseractInstalled Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_tesseractinstalled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 111;BA.debugLine="sh1.Initialize(\"sh1\",\"tesseract\",args)";
Debug.ShouldStop(16384);
_sh1.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("sh1")),(Object)(BA.ObjectToString("tesseract")),(Object)(_args));
 BA.debugLineNum = 112;BA.debugLine="Log(\"iniciado\")";
Debug.ShouldStop(32768);
agregarfactura.__c.runVoidMethod ("LogImpl","3589832",RemoteObject.createImmutable("iniciado"),0);
 }else {
 BA.debugLineNum = 114;BA.debugLine="sh1.Initialize(\"sh1\",File.Combine(File.Combine(F";
Debug.ShouldStop(131072);
_sh1.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("sh1")),(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"Combine",(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"Combine",(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("tesseract-ocr")))),(Object)(RemoteObject.createImmutable("tesseract")))),(Object)(_args));
 BA.debugLineNum = 115;BA.debugLine="Log(File.Combine(File.Combine(File.DirApp,\"tesse";
Debug.ShouldStop(262144);
agregarfactura.__c.runVoidMethod ("LogImpl","3589835",agregarfactura.__c.getField(false,"File").runMethod(true,"Combine",(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"Combine",(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("tesseract-ocr")))),(Object)(RemoteObject.createImmutable("tesseract"))),0);
 };
 BA.debugLineNum = 117;BA.debugLine="sh1.WorkingDirectory = File.Combine(File.DirApp,\"";
Debug.ShouldStop(1048576);
_sh1.runMethod(true,"setWorkingDirectory",agregarfactura.__c.getField(false,"File").runMethod(true,"Combine",(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("tesseract-ocr"))));
 BA.debugLineNum = 118;BA.debugLine="sh1.run(100000)";
Debug.ShouldStop(2097152);
_sh1.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, 100000)));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sh_processcompleted(RemoteObject __ref,RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
try {
		Debug.PushSubsStack("sh_ProcessCompleted (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("sh_processcompleted")) { return __ref.runUserSub(false, "agregarfactura","sh_processcompleted", __ref, _success, _exitcode, _stdout, _stderr);}
Debug.locals.put("Success", _success);
Debug.locals.put("ExitCode", _exitcode);
Debug.locals.put("StdOut", _stdout);
Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 211;BA.debugLine="Sub sh_ProcessCompleted (Success As Boolean, ExitC";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 213;BA.debugLine="Log(\"Success\")";
Debug.ShouldStop(1048576);
agregarfactura.__c.runVoidMethod ("LogImpl","31179650",RemoteObject.createImmutable("Success"),0);
 BA.debugLineNum = 214;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(2097152);
agregarfactura.__c.runVoidMethod ("LogImpl","31179651",_stdout,0);
 BA.debugLineNum = 215;BA.debugLine="tesseractInstalled=True";
Debug.ShouldStop(4194304);
__ref.setField ("_tesseractinstalled" /*RemoteObject*/ ,agregarfactura.__c.getField(true,"True"));
 BA.debugLineNum = 216;BA.debugLine="Log(\"Si\")";
Debug.ShouldStop(8388608);
agregarfactura.__c.runVoidMethod ("LogImpl","31179653",RemoteObject.createImmutable("Si"),0);
 }else {
 BA.debugLineNum = 218;BA.debugLine="Log(\"Error: \" & StdErr)";
Debug.ShouldStop(33554432);
agregarfactura.__c.runVoidMethod ("LogImpl","31179655",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_stderr),0);
 BA.debugLineNum = 219;BA.debugLine="tesseractInstalled=False";
Debug.ShouldStop(67108864);
__ref.setField ("_tesseractinstalled" /*RemoteObject*/ ,agregarfactura.__c.getField(true,"False"));
 };
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sh1_processcompleted(RemoteObject __ref,RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
try {
		Debug.PushSubsStack("sh1_ProcessCompleted (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("sh1_processcompleted")) { return __ref.runUserSub(false, "agregarfactura","sh1_processcompleted", __ref, _success, _exitcode, _stdout, _stderr);}
Debug.locals.put("Success", _success);
Debug.locals.put("ExitCode", _exitcode);
Debug.locals.put("StdOut", _stdout);
Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 223;BA.debugLine="Sub sh1_ProcessCompleted (Success As Boolean, Exit";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 225;BA.debugLine="Log(\"Success\")";
Debug.ShouldStop(1);
agregarfactura.__c.runVoidMethod ("LogImpl","31245186",RemoteObject.createImmutable("Success"),0);
 BA.debugLineNum = 226;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(2);
agregarfactura.__c.runVoidMethod ("LogImpl","31245187",_stdout,0);
 BA.debugLineNum = 228;BA.debugLine="txtmensaje.SetHtml(File.ReadString(File.Combine(";
Debug.ShouldStop(8);
__ref.getField(false,"_txtmensaje" /*RemoteObject*/ ).runVoidMethod ("SetHtml",(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"Combine",(Object)(agregarfactura.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("tesseract-ocr")))),(Object)(RemoteObject.createImmutable("output.txt")))));
 }else {
 BA.debugLineNum = 233;BA.debugLine="Log(ExitCode)";
Debug.ShouldStop(256);
agregarfactura.__c.runVoidMethod ("LogImpl","31245194",BA.NumberToString(_exitcode),0);
 BA.debugLineNum = 234;BA.debugLine="Log(\"Error: \" & StdErr)";
Debug.ShouldStop(512);
agregarfactura.__c.runVoidMethod ("LogImpl","31245195",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_stderr),0);
 BA.debugLineNum = 235;BA.debugLine="ws.Alert(\"fallo de reconocimiento\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Alert",(Object)(RemoteObject.createImmutable("fallo de reconocimiento")));
 };
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t_p_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("t_p_Tick (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("t_p_tick")) { return __ref.runUserSub(false, "agregarfactura","t_p_tick", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Sub t_p_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="If Main.porcentaje <> \"\"  Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",agregarfactura._main._porcentaje /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 33;BA.debugLine="enviarporcentaje(Main.porcentaje)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.smartscan.agregarfactura.class, "_enviarporcentaje" /*RemoteObject*/ ,(Object)(agregarfactura._main._porcentaje /*RemoteObject*/ ));
 };
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
public static RemoteObject  _timer1_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("timer1_tick")) { return __ref.runUserSub(false, "agregarfactura","timer1_tick", __ref);}
 BA.debugLineNum = 123;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="ws.RunFunction(\"ServerTime\", Array As Object(Date";
Debug.ShouldStop(134217728);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("ServerTime")),(Object)(agregarfactura.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(agregarfactura.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(agregarfactura.__c.getField(false,"DateTime").runMethod(true,"getNow"))))})))));
 BA.debugLineNum = 125;BA.debugLine="ws.Flush";
Debug.ShouldStop(268435456);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Flush");
 BA.debugLineNum = 126;BA.debugLine="If Main.reload=1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",agregarfactura._main._reload /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 129;BA.debugLine="ws.Eval($\"Swal.fire({    title: 'Los documentos";
Debug.ShouldStop(1);
__ref.getField(false,"_ws" /*RemoteObject*/ ).runVoidMethod ("Eval",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Swal.fire({\n"),RemoteObject.createImmutable("   title: 'Los documentos se han cargado con éxito',\n"),RemoteObject.createImmutable("   text: 'Documentación enviada.',\n"),RemoteObject.createImmutable("   icon: 'success',\n"),RemoteObject.createImmutable("   showConfirmButton: true\n"),RemoteObject.createImmutable("}).then((result) => {\n"),RemoteObject.createImmutable("   if (result.isConfirmed) {\n"),RemoteObject.createImmutable("     alertify.success('Documentación enviada.');\n"),RemoteObject.createImmutable("	 //document.location.replace('index.html');\n"),RemoteObject.createImmutable("   }\n"),RemoteObject.createImmutable("});")))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), agregarfactura.__c.getField(false,"Null")));
 BA.debugLineNum = 140;BA.debugLine="Colocar_cero(Null)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.smartscan.agregarfactura.class, "_colocar_cero" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), agregarfactura.__c.getField(false,"Null")));
 BA.debugLineNum = 149;BA.debugLine="Log(\"subido\")";
Debug.ShouldStop(1048576);
agregarfactura.__c.runVoidMethod ("LogImpl","3655386",RemoteObject.createImmutable("subido"),0);
 BA.debugLineNum = 151;BA.debugLine="leertesseract";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.smartscan.agregarfactura.class, "_leertesseract" /*RemoteObject*/ );
 BA.debugLineNum = 152;BA.debugLine="Main.reload=0";
Debug.ShouldStop(8388608);
agregarfactura._main._reload /*RemoteObject*/  = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("WebSocket_Connected (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("websocket_connected")) { return __ref.runUserSub(false, "agregarfactura","websocket_connected", __ref, _websocket1);}
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 17;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(131072);
__ref.setField ("_ws" /*RemoteObject*/ ,_websocket1);
 BA.debugLineNum = 20;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
Debug.ShouldStop(524288);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 21;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",agregarfactura.__c.getField(true,"True"));
 BA.debugLineNum = 22;BA.debugLine="t_p.Initialize(\"t_p\",100)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_t_p" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("t_p")),(Object)(BA.numberCast(long.class, 100)));
 BA.debugLineNum = 23;BA.debugLine="t_p.Enabled=True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_t_p" /*RemoteObject*/ ).runMethod(true,"setEnabled",agregarfactura.__c.getField(true,"True"));
 BA.debugLineNum = 24;BA.debugLine="Main.porcentaje=\"\"";
Debug.ShouldStop(8388608);
agregarfactura._main._porcentaje /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("WebSocket_Disconnected (agregarfactura) ","agregarfactura",1,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("websocket_disconnected")) { return __ref.runUserSub(false, "agregarfactura","websocket_disconnected", __ref);}
 BA.debugLineNum = 161;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(2);
__ref.getField(false,"_timer1" /*RemoteObject*/ ).runMethod(true,"setEnabled",agregarfactura.__c.getField(true,"False"));
 BA.debugLineNum = 163;BA.debugLine="t_p.Enabled=False";
Debug.ShouldStop(4);
__ref.getField(false,"_t_p" /*RemoteObject*/ ).runMethod(true,"setEnabled",agregarfactura.__c.getField(true,"False"));
 BA.debugLineNum = 164;BA.debugLine="Log(\"disconnected\")";
Debug.ShouldStop(8);
agregarfactura.__c.runVoidMethod ("LogImpl","3720899",RemoteObject.createImmutable("disconnected"),0);
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}