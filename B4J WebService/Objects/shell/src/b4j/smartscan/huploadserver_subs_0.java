package b4j.smartscan;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class huploadserver_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private counter As Int = 1";
huploadserver._counter = BA.numberCast(int.class, 1);__ref.setField("_counter",huploadserver._counter);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getuniquefilename(RemoteObject __ref,RemoteObject _pathupload,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetUniqueFileName (huploadserver) ","huploadserver",2,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("getuniquefilename")) { return __ref.runUserSub(false, "huploadserver","getuniquefilename", __ref, _pathupload, _filename);}
RemoteObject _basename = RemoteObject.createImmutable("");
RemoteObject _extension = RemoteObject.createImmutable("");
RemoteObject _newfilename = RemoteObject.createImmutable("");
Debug.locals.put("pathUpload", _pathupload);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 70;BA.debugLine="Sub GetUniqueFileName(pathUpload As String, FileNa";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim baseName As String = FileName.SubString2(0, F";
Debug.ShouldStop(64);
_basename = _filename.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_filename.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")))));Debug.locals.put("baseName", _basename);Debug.locals.put("baseName", _basename);
 BA.debugLineNum = 72;BA.debugLine="Dim extension As String = FileName.SubString(File";
Debug.ShouldStop(128);
_extension = _filename.runMethod(true,"substring",(Object)(_filename.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")))));Debug.locals.put("extension", _extension);Debug.locals.put("extension", _extension);
 BA.debugLineNum = 74;BA.debugLine="Dim newFileName As String = baseName & \"_\" & coun";
Debug.ShouldStop(512);
_newfilename = RemoteObject.concat(_basename,RemoteObject.createImmutable("_"),__ref.getField(true,"_counter" /*RemoteObject*/ ),_extension);Debug.locals.put("newFileName", _newfilename);Debug.locals.put("newFileName", _newfilename);
 BA.debugLineNum = 76;BA.debugLine="Do While File.Exists(pathUpload, newFileName)";
Debug.ShouldStop(2048);
while (huploadserver.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_pathupload),(Object)(_newfilename)).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 77;BA.debugLine="counter = counter + 1";
Debug.ShouldStop(4096);
__ref.setField ("_counter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_counter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 78;BA.debugLine="newFileName = baseName & \"_\" & counter & extensi";
Debug.ShouldStop(8192);
_newfilename = RemoteObject.concat(_basename,RemoteObject.createImmutable("_"),__ref.getField(true,"_counter" /*RemoteObject*/ ),_extension);Debug.locals.put("newFileName", _newfilename);
 }
;
 BA.debugLineNum = 81;BA.debugLine="Return newFileName";
Debug.ShouldStop(65536);
if (true) return _newfilename;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (huploadserver) ","huploadserver",2,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("handle")) { return __ref.runUserSub(false, "huploadserver","handle", __ref, _req, _resp);}
RemoteObject _jupload = RemoteObject.declareNull("com.tummosoft.jFileUploadSupport");
RemoteObject _pathupload = RemoteObject.createImmutable("");
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 10;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim jupload As jFileUploadSupport";
Debug.ShouldStop(1024);
_jupload = RemoteObject.createNew ("com.tummosoft.jFileUploadSupport");Debug.locals.put("jupload", _jupload);
 BA.debugLineNum = 12;BA.debugLine="resp.SetHeader(\"Access-Control-Allow-Origin\", \"*\"";
Debug.ShouldStop(2048);
_resp.runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Access-Control-Allow-Origin")),(Object)(RemoteObject.createImmutable("*")));
 BA.debugLineNum = 13;BA.debugLine="jupload.Initialize(\"jupload\")";
Debug.ShouldStop(4096);
_jupload.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("jupload")));
 BA.debugLineNum = 14;BA.debugLine="Dim pathUpload As String = File.Combine(File.DirA";
Debug.ShouldStop(8192);
_pathupload = huploadserver.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(huploadserver.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/up"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pathUpload", _pathupload);Debug.locals.put("pathUpload", _pathupload);
 BA.debugLineNum = 15;BA.debugLine="jupload.TempFile(File.DirApp & \"www\", \"Multipart.";
Debug.ShouldStop(16384);
_jupload.runVoidMethod ("TempFile",(Object)(RemoteObject.concat(huploadserver.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("www"))),(Object)(RemoteObject.createImmutable("Multipart.temp")));
 BA.debugLineNum = 16;BA.debugLine="jupload.UploadPath(pathUpload)";
Debug.ShouldStop(32768);
_jupload.runVoidMethod ("UploadPath",(Object)(_pathupload));
 BA.debugLineNum = 17;BA.debugLine="jupload.MultipartHook(req)";
Debug.ShouldStop(65536);
_jupload.runVoidMethod ("MultipartHook",__ref.getField(false, "ba"),(Object)((_req.getObject())));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Initialize (huploadserver) ","huploadserver",2,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "huploadserver","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jupload_uploadcompleted(RemoteObject __ref,RemoteObject _success,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("jupload_UploadCompleted (huploadserver) ","huploadserver",2,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("jupload_uploadcompleted")) { return __ref.runUserSub(false, "huploadserver","jupload_uploadcompleted", __ref, _success, _filename);}
RemoteObject _pathupload = RemoteObject.createImmutable("");
RemoteObject _newfilename = RemoteObject.createImmutable("");
Debug.locals.put("Success", _success);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 31;BA.debugLine="Sub jupload_UploadCompleted(Success As Boolean, Fi";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Log(FileName)";
Debug.ShouldStop(-2147483648);
huploadserver.__c.runVoidMethod ("LogImpl","31572865",_filename,0);
 BA.debugLineNum = 33;BA.debugLine="Log(Success)";
Debug.ShouldStop(1);
huploadserver.__c.runVoidMethod ("LogImpl","31572866",BA.ObjectToString(_success),0);
 BA.debugLineNum = 37;BA.debugLine="If Success Then";
Debug.ShouldStop(16);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 38;BA.debugLine="Dim pathUpload As String = File.Combine(File.Dir";
Debug.ShouldStop(32);
_pathupload = huploadserver.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(huploadserver.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/up"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pathUpload", _pathupload);Debug.locals.put("pathUpload", _pathupload);
 BA.debugLineNum = 43;BA.debugLine="Dim newFileName As String = GetUniqueFileName(p";
Debug.ShouldStop(1024);
_newfilename = __ref.runClassMethod (b4j.smartscan.huploadserver.class, "_getuniquefilename" /*RemoteObject*/ ,(Object)(_pathupload),(Object)(_filename));Debug.locals.put("newFileName", _newfilename);Debug.locals.put("newFileName", _newfilename);
 BA.debugLineNum = 44;BA.debugLine="If File.Exists(pathUpload, FileName) Then";
Debug.ShouldStop(2048);
if (huploadserver.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_pathupload),(Object)(_filename)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 45;BA.debugLine="File.Copy(pathUpload, FileName, pathUpload, new";
Debug.ShouldStop(4096);
huploadserver.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_pathupload),(Object)(_filename),(Object)(_pathupload),(Object)(_newfilename));
 BA.debugLineNum = 46;BA.debugLine="File.Delete(pathUpload, FileName)";
Debug.ShouldStop(8192);
huploadserver.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_pathupload),(Object)(_filename));
 BA.debugLineNum = 48;BA.debugLine="Main.NombreArchivo = newFileName";
Debug.ShouldStop(32768);
huploadserver._main._nombrearchivo /*RemoteObject*/  = _newfilename;
 BA.debugLineNum = 49;BA.debugLine="Log(\"camino que existe\")";
Debug.ShouldStop(65536);
huploadserver.__c.runVoidMethod ("LogImpl","31572882",RemoteObject.createImmutable("camino que existe"),0);
 };
 BA.debugLineNum = 58;BA.debugLine="Main.subido = True";
Debug.ShouldStop(33554432);
huploadserver._main._subido /*RemoteObject*/  = huploadserver.__c.getField(true,"True");
 BA.debugLineNum = 59;BA.debugLine="Main.reload = 1";
Debug.ShouldStop(67108864);
huploadserver._main._reload /*RemoteObject*/  = BA.numberCast(int.class, 1);
 }else {
 BA.debugLineNum = 61;BA.debugLine="Main.subido = False";
Debug.ShouldStop(268435456);
huploadserver._main._subido /*RemoteObject*/  = huploadserver.__c.getField(true,"False");
 };
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jupload_uploadprogress(RemoteObject __ref,RemoteObject _totalkb,RemoteObject _percent) throws Exception{
try {
		Debug.PushSubsStack("jupload_UploadProgress (huploadserver) ","huploadserver",2,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("jupload_uploadprogress")) { return __ref.runUserSub(false, "huploadserver","jupload_uploadprogress", __ref, _totalkb, _percent);}
Debug.locals.put("TotalKB", _totalkb);
Debug.locals.put("Percent", _percent);
 BA.debugLineNum = 23;BA.debugLine="Sub jupload_UploadProgress (TotalKB As Long, Perce";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Log(TotalKB)";
Debug.ShouldStop(8388608);
huploadserver.__c.runVoidMethod ("LogImpl","31507329",BA.NumberToString(_totalkb),0);
 BA.debugLineNum = 25;BA.debugLine="Log(Percent)";
Debug.ShouldStop(16777216);
huploadserver.__c.runVoidMethod ("LogImpl","31507330",_percent,0);
 BA.debugLineNum = 26;BA.debugLine="Main.porcentaje=Percent";
Debug.ShouldStop(33554432);
huploadserver._main._porcentaje /*RemoteObject*/  = _percent;
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}