package b4j.smartscan;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class huploadserver extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.smartscan", "b4j.smartscan.huploadserver", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int _counter = 0;
public b4j.smartscan.main _main = null;
public b4j.smartscan.httputils2service _httputils2service = null;
public String  _class_globals(b4j.smartscan.huploadserver __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="huploadserver";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Private counter As Int = 1";
_counter = (int) (1);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _getuniquefilename(b4j.smartscan.huploadserver __ref,String _pathupload,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="huploadserver";
if (Debug.shouldDelegate(ba, "getuniquefilename", false))
	 {return ((String) Debug.delegate(ba, "getuniquefilename", new Object[] {_pathupload,_filename}));}
String _basename = "";
String _extension = "";
String _newfilename = "";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub GetUniqueFileName(pathUpload As String, FileNa";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim baseName As String = FileName.SubString2(0, F";
_basename = _filename.substring((int) (0),_filename.lastIndexOf("."));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim extension As String = FileName.SubString(File";
_extension = _filename.substring(_filename.lastIndexOf("."));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Dim newFileName As String = baseName & \"_\" & coun";
_newfilename = _basename+"_"+BA.NumberToString(__ref._counter /*int*/ )+_extension;
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Do While File.Exists(pathUpload, newFileName)";
while (__c.File.Exists(_pathupload,_newfilename)) {
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="counter = counter + 1";
__ref._counter /*int*/  = (int) (__ref._counter /*int*/ +1);
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="newFileName = baseName & \"_\" & counter & extensi";
_newfilename = _basename+"_"+BA.NumberToString(__ref._counter /*int*/ )+_extension;
 }
;
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="Return newFileName";
if (true) return _newfilename;
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.smartscan.huploadserver __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="huploadserver";
if (Debug.shouldDelegate(ba, "handle", false))
	 {return ((String) Debug.delegate(ba, "handle", new Object[] {_req,_resp}));}
com.tummosoft.jFileUploadSupport _jupload = null;
String _pathupload = "";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim jupload As jFileUploadSupport";
_jupload = new com.tummosoft.jFileUploadSupport();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="resp.SetHeader(\"Access-Control-Allow-Origin\", \"*\"";
_resp.SetHeader("Access-Control-Allow-Origin","*");
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="jupload.Initialize(\"jupload\")";
_jupload.Initialize("jupload");
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Dim pathUpload As String = File.Combine(File.DirA";
_pathupload = __c.File.Combine(__c.File.getDirApp()+"/up","");
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="jupload.TempFile(File.DirApp & \"www\", \"Multipart.";
_jupload.TempFile(__c.File.getDirApp()+"www","Multipart.temp");
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="jupload.UploadPath(pathUpload)";
_jupload.UploadPath(_pathupload);
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="jupload.MultipartHook(req)";
_jupload.MultipartHook(ba,(jakarta.servlet.http.HttpServletRequest)(_req.getObject()));
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.smartscan.huploadserver __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="huploadserver";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _jupload_uploadcompleted(b4j.smartscan.huploadserver __ref,boolean _success,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="huploadserver";
if (Debug.shouldDelegate(ba, "jupload_uploadcompleted", false))
	 {return ((String) Debug.delegate(ba, "jupload_uploadcompleted", new Object[] {_success,_filename}));}
String _pathupload = "";
String _newfilename = "";
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub jupload_UploadCompleted(Success As Boolean, Fi";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Log(FileName)";
__c.LogImpl("31572865",_filename,0);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Log(Success)";
__c.LogImpl("31572866",BA.ObjectToString(_success),0);
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="Dim pathUpload As String = File.Combine(File.Dir";
_pathupload = __c.File.Combine(__c.File.getDirApp()+"/up","");
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="Dim newFileName As String = GetUniqueFileName(p";
_newfilename = __ref._getuniquefilename /*String*/ (null,_pathupload,_filename);
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="If File.Exists(pathUpload, FileName) Then";
if (__c.File.Exists(_pathupload,_filename)) { 
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="File.Copy(pathUpload, FileName, pathUpload, new";
__c.File.Copy(_pathupload,_filename,_pathupload,_newfilename);
RDebugUtils.currentLine=1572879;
 //BA.debugLineNum = 1572879;BA.debugLine="File.Delete(pathUpload, FileName)";
__c.File.Delete(_pathupload,_filename);
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="Main.NombreArchivo = newFileName";
_main._nombrearchivo /*String*/  = _newfilename;
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="Log(\"camino que existe\")";
__c.LogImpl("31572882","camino que existe",0);
 };
RDebugUtils.currentLine=1572891;
 //BA.debugLineNum = 1572891;BA.debugLine="Main.subido = True";
_main._subido /*boolean*/  = __c.True;
RDebugUtils.currentLine=1572892;
 //BA.debugLineNum = 1572892;BA.debugLine="Main.reload = 1";
_main._reload /*int*/  = (int) (1);
 }else {
RDebugUtils.currentLine=1572894;
 //BA.debugLineNum = 1572894;BA.debugLine="Main.subido = False";
_main._subido /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=1572897;
 //BA.debugLineNum = 1572897;BA.debugLine="End Sub";
return "";
}
public String  _jupload_uploadprogress(b4j.smartscan.huploadserver __ref,long _totalkb,String _percent) throws Exception{
__ref = this;
RDebugUtils.currentModule="huploadserver";
if (Debug.shouldDelegate(ba, "jupload_uploadprogress", false))
	 {return ((String) Debug.delegate(ba, "jupload_uploadprogress", new Object[] {_totalkb,_percent}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub jupload_UploadProgress (TotalKB As Long, Perce";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Log(TotalKB)";
__c.LogImpl("31507329",BA.NumberToString(_totalkb),0);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Log(Percent)";
__c.LogImpl("31507330",_percent,0);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Main.porcentaje=Percent";
_main._porcentaje /*String*/  = _percent;
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
}