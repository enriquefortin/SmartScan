package b4j.smartscan;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class agregarfactura extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.smartscan", "b4j.smartscan.agregarfactura", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.smartscan.agregarfactura.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket _ws = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtempresa = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcai = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtrtn = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtmontototal = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtmensaje = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _filenamedisplay = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _jqm = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _subir = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.collections.Map _langmap = null;
public anywheresoftware.b4a.objects.collections.List _langlist = null;
public boolean _tesseractinstalled = false;
public anywheresoftware.b4a.objects.Timer _t_p = null;
public b4j.smartscan.main _main = null;
public b4j.smartscan.httputils2service _httputils2service = null;
public boolean  _application_error(b4j.smartscan.agregarfactura __ref,anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Log(\"Error\")";
__c.LogImpl("3983041","Error",0);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.smartscan.agregarfactura __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Private txtempresa, txtcai, txtrtn, txtmontototal";
_txtempresa = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcai = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtrtn = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtmontototal = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtmensaje = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_filenamedisplay = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_jqm = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_subir = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Private langmap As Map";
_langmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Private langlist As List";
_langlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Private tesseractInstalled As Boolean = True";
_tesseractinstalled = __c.True;
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Private t_p As Timer";
_t_p = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="End Sub";
return "";
}
public String  _colocar_cero(b4j.smartscan.agregarfactura __ref,anywheresoftware.b4a.objects.collections.Map _param) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "colocar_cero", false))
	 {return ((String) Debug.delegate(ba, "colocar_cero", new Object[] {_param}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Colocar_cero (param As Map)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Log(\"colococero desde js\")";
__c.LogImpl("3851969","colococero desde js",0);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Main.porcentaje=\"\"";
_main._porcentaje /*String*/  = "";
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="enviarporcentaje(0)";
__ref._enviarporcentaje /*String*/ (null,BA.NumberToString(0));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public String  _enviarporcentaje(b4j.smartscan.agregarfactura __ref,String _algo) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "enviarporcentaje", false))
	 {return ((String) Debug.delegate(ba, "enviarporcentaje", new Object[] {_algo}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub enviarporcentaje (algo As String)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="ws.Eval($\"updateProgress(${algo});\"$,Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(("updateProgress("+__c.SmartStringFormatter("",(Object)(_algo))+");"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="ws.Eval(\"location.reload(True);\",Null)";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval("location.reload(True);",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
public String  _device_message(b4j.smartscan.agregarfactura __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "device_message", false))
	 {return ((String) Debug.delegate(ba, "device_message", new Object[] {_params}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Device_Message(Params As Map)";
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Main.msj=Params";
_main._msj /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Log(Main.msj.Get(\"message\"))";
__c.LogImpl("3393220",BA.ObjectToString(_main._msj /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("message"))),0);
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.smartscan.agregarfactura __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public String  _jqm_click(b4j.smartscan.agregarfactura __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "jqm_click", false))
	 {return ((String) Debug.delegate(ba, "jqm_click", new Object[] {_params}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub jqm_Click(params As Map)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Log(\"CLICK\")";
__c.LogImpl("3917505","CLICK",0);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="txtmensaje.SetHtml(Main.msj.Get(\"message\"))";
__ref._txtmensaje /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(BA.ObjectToString(_main._msj /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("message"))));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="End Sub";
return "";
}
public String  _leertesseract(b4j.smartscan.agregarfactura __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "leertesseract", false))
	 {return ((String) Debug.delegate(ba, "leertesseract", null));}
anywheresoftware.b4j.objects.Shell _sh = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub leertesseract'_Click(Params As Map)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Log(\"click al boton leertesseract\")";
__c.LogImpl("3458753","click al boton leertesseract",0);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Dim sh As Shell";
_sh = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="sh.Initialize(\"sh\",\"tesseract\",Null)";
_sh.Initialize("sh","tesseract",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="sh.run(10000)";
_sh.Run(ba,(long) (10000));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="langmap.Initialize";
__ref._langmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="langlist.Initialize";
__ref._langlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="langlist.Add(\"spa_old\")";
__ref._langlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)("spa_old"));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="langmap.Put(\"Español\",langlist.Get(0))";
__ref._langmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Español"),__ref._langlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Log(langlist)";
__c.LogImpl("3458762",BA.ObjectToString(__ref._langlist /*anywheresoftware.b4a.objects.collections.List*/ ),0);
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Log(langmap)";
__c.LogImpl("3458763",BA.ObjectToString(__ref._langmap /*anywheresoftware.b4a.objects.collections.Map*/ ),0);
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Log(langmap.Get(\"Español\"))";
__c.LogImpl("3458764",BA.ObjectToString(__ref._langmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Español"))),0);
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="ProcessImage";
__ref._processimage /*String*/ (null);
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="End Sub";
return "";
}
public String  _processimage(b4j.smartscan.agregarfactura __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "processimage", false))
	 {return ((String) Debug.delegate(ba, "processimage", null));}
String _uploadedimagepath = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inp = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub ProcessImage";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="If Main.NombreArchivo <> \"\" Then";
if ((_main._nombrearchivo /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="Try";
try {RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Dim uploadedImagePath As String = File.Combine(F";
_uploadedimagepath = __c.File.Combine(__c.File.getDirApp()+"/up","");
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Log(Main.NombreArchivo)";
__c.LogImpl("3524300",_main._nombrearchivo /*String*/ ,0);
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Dim Inp As InputStream = File.OpenInput(uploaded";
_inp = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_inp = __c.File.OpenInput(_uploadedimagepath,_main._nombrearchivo /*String*/ );
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.D";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(__c.File.getDirApp()+"/tesseract-ocr","image.png",__c.False);
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="File.Copy2(Inp, out)";
__c.File.Copy2((java.io.InputStream)(_inp.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="scan";
__ref._scan /*String*/ (null);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="Log(LastException)";
__c.LogImpl("3524317",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="End Sub";
return "";
}
public String  _ocr_finished(b4j.smartscan.agregarfactura __ref,String _text,int _processingtime) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "ocr_finished", false))
	 {return ((String) Debug.delegate(ba, "ocr_finished", new Object[] {_text,_processingtime}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub OCR_finished (Text As String,ProcessingTime As";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Log(Text)";
__c.LogImpl("31048577",_text,0);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Log(ProcessingTime & \" ms\")";
__c.LogImpl("31048578",BA.NumberToString(_processingtime)+" ms",0);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return "";
}
public String  _ocr_overlay(b4j.smartscan.agregarfactura __ref,anywheresoftware.b4a.objects.collections.Map _overlay) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "ocr_overlay", false))
	 {return ((String) Debug.delegate(ba, "ocr_overlay", new Object[] {_overlay}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub OCR_overlay (Overlay As Map)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Log(Overlay)";
__c.LogImpl("31114113",BA.ObjectToString(_overlay),0);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public String  _scan(b4j.smartscan.agregarfactura __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "scan", false))
	 {return ((String) Debug.delegate(ba, "scan", null));}
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4j.objects.Shell _sh1 = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub scan";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="args.AddAll(Array As String(\"image.png\",\"output\",";
_args.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"image.png","output","-l",BA.ObjectToString(__ref._langmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Español")))}));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim sh1 As Shell";
_sh1 = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="tesseractInstalled=True";
__ref._tesseractinstalled /*boolean*/  = __c.True;
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="If tesseractInstalled Then";
if (__ref._tesseractinstalled /*boolean*/ ) { 
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="sh1.Initialize(\"sh1\",\"tesseract\",args)";
_sh1.Initialize("sh1","tesseract",_args);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Log(\"iniciado\")";
__c.LogImpl("3589832","iniciado",0);
 }else {
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="sh1.Initialize(\"sh1\",File.Combine(File.Combine(F";
_sh1.Initialize("sh1",__c.File.Combine(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"tesseract"),_args);
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Log(File.Combine(File.Combine(File.DirApp,\"tesse";
__c.LogImpl("3589835",__c.File.Combine(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"tesseract"),0);
 };
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="sh1.WorkingDirectory = File.Combine(File.DirApp,\"";
_sh1.setWorkingDirectory(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="sh1.run(100000)";
_sh1.Run(ba,(long) (100000));
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="End Sub";
return "";
}
public String  _sh_processcompleted(b4j.smartscan.agregarfactura __ref,boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "sh_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "sh_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub sh_ProcessCompleted (Success As Boolean, ExitC";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Log(\"Success\")";
__c.LogImpl("31179650","Success",0);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Log(StdOut)";
__c.LogImpl("31179651",_stdout,0);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="tesseractInstalled=True";
__ref._tesseractinstalled /*boolean*/  = __c.True;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Log(\"Si\")";
__c.LogImpl("31179653","Si",0);
 }else {
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Log(\"Error: \" & StdErr)";
__c.LogImpl("31179655","Error: "+_stderr,0);
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="tesseractInstalled=False";
__ref._tesseractinstalled /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="End Sub";
return "";
}
public String  _sh1_processcompleted(b4j.smartscan.agregarfactura __ref,boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "sh1_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "sh1_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub sh1_ProcessCompleted (Success As Boolean, Exit";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Log(\"Success\")";
__c.LogImpl("31245186","Success",0);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Log(StdOut)";
__c.LogImpl("31245187",_stdout,0);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="txtmensaje.SetHtml(File.ReadString(File.Combine(";
__ref._txtmensaje /*anywheresoftware.b4j.object.WebSocket.JQueryElement*/ .SetHtml(__c.File.ReadString(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"output.txt"));
 }else {
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Log(ExitCode)";
__c.LogImpl("31245194",BA.NumberToString(_exitcode),0);
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Log(\"Error: \" & StdErr)";
__c.LogImpl("31245195","Error: "+_stderr,0);
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="ws.Alert(\"fallo de reconocimiento\")";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Alert("fallo de reconocimiento");
 };
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="End Sub";
return "";
}
public String  _t_p_tick(b4j.smartscan.agregarfactura __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "t_p_tick", false))
	 {return ((String) Debug.delegate(ba, "t_p_tick", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub t_p_Tick";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If Main.porcentaje <> \"\"  Then";
if ((_main._porcentaje /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="enviarporcentaje(Main.porcentaje)";
__ref._enviarporcentaje /*String*/ (null,_main._porcentaje /*String*/ );
 };
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick(b4j.smartscan.agregarfactura __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "timer1_tick", false))
	 {return ((String) Debug.delegate(ba, "timer1_tick", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="ws.RunFunction(\"ServerTime\", Array As Object(Date";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .RunFunction("ServerTime",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__c.DateTime.Time(__c.DateTime.getNow()))}));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="ws.Flush";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Flush();
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="If Main.reload=1 Then";
if (_main._reload /*int*/ ==1) { 
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="ws.Eval($\"Swal.fire({    title: 'Los documentos";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/ .Eval(("Swal.fire({\n"+"   title: 'Los documentos se han cargado con éxito',\n"+"   text: 'Documentación enviada.',\n"+"   icon: 'success',\n"+"   showConfirmButton: true\n"+"}).then((result) => {\n"+"   if (result.isConfirmed) {\n"+"     alertify.success('Documentación enviada.');\n"+"	 //document.location.replace('index.html');\n"+"   }\n"+"});"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="Colocar_cero(Null)";
__ref._colocar_cero /*String*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="Log(\"subido\")";
__c.LogImpl("3655386","subido",0);
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="leertesseract";
__ref._leertesseract /*String*/ (null);
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="Main.reload=0";
_main._reload /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=655393;
 //BA.debugLineNum = 655393;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.smartscan.agregarfactura __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "websocket_connected", false))
	 {return ((String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="ws = WebSocket1";
__ref._ws /*anywheresoftware.b4j.object.WebSocket*/  = _websocket1;
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"timer1",(long) (1000));
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="timer1.Enabled = True";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="t_p.Initialize(\"t_p\",100)";
__ref._t_p /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"t_p",(long) (100));
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="t_p.Enabled=True";
__ref._t_p /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="Main.porcentaje=\"\"";
_main._porcentaje /*String*/  = "";
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.smartscan.agregarfactura __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="agregarfactura";
if (Debug.shouldDelegate(ba, "websocket_disconnected", false))
	 {return ((String) Debug.delegate(ba, "websocket_disconnected", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="timer1.Enabled = False";
__ref._timer1 /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="t_p.Enabled=False";
__ref._t_p /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Log(\"disconnected\")";
__c.LogImpl("3720899","disconnected",0);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="End Sub";
return "";
}
}