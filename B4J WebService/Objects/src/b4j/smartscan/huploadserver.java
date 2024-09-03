package b4j.smartscan;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class huploadserver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.smartscan", "b4j.smartscan.huploadserver", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.smartscan.huploadserver.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _counter = 0;
public String _valsession = "";
public b4j.smartscan.main _main = null;
public b4j.smartscan.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private counter As Int = 1";
_counter = (int) (1);
 //BA.debugLineNum = 4;BA.debugLine="Private valsession As String";
_valsession = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _getuniquefilename(String _pathupload,String _filename) throws Exception{
String _basename = "";
String _extension = "";
String _newfilename = "";
 //BA.debugLineNum = 93;BA.debugLine="Sub GetUniqueFileName(pathUpload As String, FileNa";
 //BA.debugLineNum = 94;BA.debugLine="Dim baseName As String = FileName.SubString2(0, F";
_basename = _filename.substring((int) (0),_filename.lastIndexOf("."));
 //BA.debugLineNum = 95;BA.debugLine="Dim extension As String = FileName.SubString(File";
_extension = _filename.substring(_filename.lastIndexOf("."));
 //BA.debugLineNum = 97;BA.debugLine="Dim newFileName As String = baseName & \"_\" & coun";
_newfilename = _basename+"_"+BA.NumberToString(_counter)+_extension;
 //BA.debugLineNum = 99;BA.debugLine="Do While File.Exists(pathUpload, newFileName)";
while (__c.File.Exists(_pathupload,_newfilename)) {
 //BA.debugLineNum = 100;BA.debugLine="counter = counter + 1";
_counter = (int) (_counter+1);
 //BA.debugLineNum = 101;BA.debugLine="newFileName = baseName & \"_\" & counter & extensi";
_newfilename = _basename+"_"+BA.NumberToString(_counter)+_extension;
 }
;
 //BA.debugLineNum = 104;BA.debugLine="Return newFileName";
if (true) return _newfilename;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _handle(anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
com.tummosoft.jFileUploadSupport _jupload = null;
String _pathupload = "";
String _session = "";
String _localsession = "";
 //BA.debugLineNum = 11;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
 //BA.debugLineNum = 13;BA.debugLine="If Main.sessionid = Null Then";
if (_main._sessionid /*anywheresoftware.b4a.objects.collections.Map*/ == null) { 
 //BA.debugLineNum = 14;BA.debugLine="resp.SendError(403, \"No session ID found\")";
_resp.SendError((int) (403),"No session ID found");
 //BA.debugLineNum = 15;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 18;BA.debugLine="Dim jupload As jFileUploadSupport";
_jupload = new com.tummosoft.jFileUploadSupport();
 //BA.debugLineNum = 19;BA.debugLine="resp.SetHeader(\"Access-Control-Allow-Origin\", \"*\"";
_resp.SetHeader("Access-Control-Allow-Origin","*");
 //BA.debugLineNum = 20;BA.debugLine="jupload.Initialize(\"jupload\")";
_jupload.Initialize("jupload");
 //BA.debugLineNum = 21;BA.debugLine="Dim pathUpload As String = File.Combine(File.DirA";
_pathupload = __c.File.Combine(__c.File.getDirApp()+"/up","");
 //BA.debugLineNum = 22;BA.debugLine="jupload.TempFile(File.DirApp & \"www\", \"Multipart.";
_jupload.TempFile(__c.File.getDirApp()+"www","Multipart.temp");
 //BA.debugLineNum = 23;BA.debugLine="jupload.UploadPath(pathUpload)";
_jupload.UploadPath(_pathupload);
 //BA.debugLineNum = 24;BA.debugLine="jupload.MultipartHook(req)";
_jupload.MultipartHook(ba,(jakarta.servlet.http.HttpServletRequest)(_req.getObject()));
 //BA.debugLineNum = 27;BA.debugLine="Dim session As String = req.GetParameter(\"session";
_session = _req.GetParameter("session");
 //BA.debugLineNum = 28;BA.debugLine="If session <> \"\" Then";
if ((_session).equals("") == false) { 
 //BA.debugLineNum = 29;BA.debugLine="Log(\"Session: \" & session)";
__c.LogImpl("212910610","Session: "+_session,0);
 //BA.debugLineNum = 30;BA.debugLine="valsession=session";
_valsession = _session;
 //BA.debugLineNum = 32;BA.debugLine="Log(\"mi valor \"&valsession)";
__c.LogImpl("212910613","mi valor "+_valsession,0);
 //BA.debugLineNum = 33;BA.debugLine="Dim localsession As String = valsession";
_localsession = _valsession;
 //BA.debugLineNum = 35;BA.debugLine="Main.sessionid.Put(localsession,localsession)";
_main._sessionid /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_localsession),(Object)(_localsession));
 //BA.debugLineNum = 36;BA.debugLine="Log(Main.sessionid.Get(localsession))";
__c.LogImpl("212910617",BA.ObjectToString(_main._sessionid /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_localsession))),0);
 //BA.debugLineNum = 39;BA.debugLine="Main.reload = 1";
_main._reload /*int*/  = (int) (1);
 };
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _jupload_uploadcompleted(boolean _success,String _filename) throws Exception{
String _pathupload = "";
String _newfilename = "";
 //BA.debugLineNum = 55;BA.debugLine="Sub jupload_UploadCompleted(Success As Boolean, Fi";
 //BA.debugLineNum = 61;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 62;BA.debugLine="Dim pathUpload As String = File.Combine(File.Dir";
_pathupload = __c.File.Combine(__c.File.getDirApp()+"/up","");
 //BA.debugLineNum = 67;BA.debugLine="Dim newFileName As String = GetUniqueFileName(p";
_newfilename = _getuniquefilename(_pathupload,_filename);
 //BA.debugLineNum = 68;BA.debugLine="If File.Exists(pathUpload, FileName) Then";
if (__c.File.Exists(_pathupload,_filename)) { 
 //BA.debugLineNum = 69;BA.debugLine="File.Copy(pathUpload, FileName, pathUpload, new";
__c.File.Copy(_pathupload,_filename,_pathupload,_newfilename);
 //BA.debugLineNum = 70;BA.debugLine="File.Delete(pathUpload, FileName)";
__c.File.Delete(_pathupload,_filename);
 //BA.debugLineNum = 74;BA.debugLine="Main.NombreArchivo = newFileName";
_main._nombrearchivo /*String*/  = _newfilename;
 //BA.debugLineNum = 77;BA.debugLine="Log(\"camino que existe\")";
__c.LogImpl("213041686","camino que existe",0);
 };
 //BA.debugLineNum = 81;BA.debugLine="Main.subido = True";
_main._subido /*boolean*/  = __c.True;
 }else {
 //BA.debugLineNum = 84;BA.debugLine="Main.subido = False";
_main._subido /*boolean*/  = __c.False;
 };
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _jupload_uploadprogress(long _totalkb,String _percent) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub jupload_UploadProgress (TotalKB As Long, Perce";
 //BA.debugLineNum = 48;BA.debugLine="Main.porcentaje=Percent";
_main._porcentaje /*String*/  = _percent;
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
