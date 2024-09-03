package b4j.smartscan;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class gt extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.smartscan", "b4j.smartscan.gt", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.smartscan.gt.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.WebSocket _ws = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtmensaje = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _filenamedisplay = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _jqm = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _subir = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _gebd = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtiddelmovil = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtnombre = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtidentidad = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtmotor = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtplaca = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtanio = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtcolor = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtchasis = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.collections.Map _langmap = null;
public anywheresoftware.b4a.objects.collections.List _langlist = null;
public boolean _tesseractinstalled = false;
public anywheresoftware.b4a.objects.Timer _t_p = null;
public String _status = "";
public String _response = "";
public anywheresoftware.b4a.objects.collections.List _partes = null;
public eu.smessenger.unboundid.UNBOUNDID4B4J _ldapclient = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.objects.SQL _mysql = null;
public b4j.smartscan.main _main = null;
public b4j.smartscan.httputils2service _httputils2service = null;
public boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 347;BA.debugLine="Log(\"Error\")";
__c.LogImpl("211141121","Error",0);
 //BA.debugLineNum = 348;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
 //BA.debugLineNum = 4;BA.debugLine="Private  txtmensaje, filenamedisplay, jqm, subir,";
_txtmensaje = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_filenamedisplay = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_jqm = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_subir = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_gebd = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtiddelmovil = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
 //BA.debugLineNum = 5;BA.debugLine="Private  txtnombre, txtidentidad As JQueryElement";
_txtnombre = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtidentidad = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
 //BA.debugLineNum = 6;BA.debugLine="Private  txtmotor, txtplaca, txtanio, txtcolor, t";
_txtmotor = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtplaca = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtanio = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtcolor = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
_txtchasis = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
 //BA.debugLineNum = 7;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 8;BA.debugLine="Private langmap As Map";
_langmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Private langlist As List";
_langlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private tesseractInstalled As Boolean = True";
_tesseractinstalled = __c.True;
 //BA.debugLineNum = 11;BA.debugLine="Private t_p As Timer";
_t_p = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 12;BA.debugLine="Dim status As String";
_status = "";
 //BA.debugLineNum = 13;BA.debugLine="Dim response As String";
_response = "";
 //BA.debugLineNum = 14;BA.debugLine="Dim partes As List";
_partes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Private ldapClient As UNBOUNDID4B4J";
_ldapclient = new eu.smessenger.unboundid.UNBOUNDID4B4J();
 //BA.debugLineNum = 16;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
 //BA.debugLineNum = 17;BA.debugLine="Private mysql As SQL";
_mysql = new anywheresoftware.b4j.objects.SQL();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _colocar_cero(anywheresoftware.b4a.objects.collections.Map _param) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Sub Colocar_cero (param As Map)";
 //BA.debugLineNum = 228;BA.debugLine="Log(\"colococero desde js\")";
__c.LogImpl("210813441","colococero desde js",0);
 //BA.debugLineNum = 229;BA.debugLine="Main.porcentaje=\"\"";
_main._porcentaje /*String*/  = "";
 //BA.debugLineNum = 230;BA.debugLine="enviarporcentaje(0)";
_enviarporcentaje(BA.NumberToString(0));
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public String  _device_message(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub Device_Message(Params As Map)";
 //BA.debugLineNum = 64;BA.debugLine="Log(\"Device message: \" & Params.Get(\"message\"))";
__c.LogImpl("210289153","Device message: "+BA.ObjectToString(_params.Get((Object)("message"))),0);
 //BA.debugLineNum = 66;BA.debugLine="Main.msj=Params";
_main._msj /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public void  _enviar_sessionid(anywheresoftware.b4a.objects.collections.Map _param) throws Exception{
ResumableSub_Enviar_sessionid rsub = new ResumableSub_Enviar_sessionid(this,_param);
rsub.resume(ba, null);
}
public static class ResumableSub_Enviar_sessionid extends BA.ResumableSub {
public ResumableSub_Enviar_sessionid(b4j.smartscan.gt parent,anywheresoftware.b4a.objects.collections.Map _param) {
this.parent = parent;
this._param = _param;
}
b4j.smartscan.gt parent;
anywheresoftware.b4a.objects.collections.Map _param;
b4j.smartscan.httpjob _j = null;
String _url = "";
String _p = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 188;BA.debugLine="Log(\"devulvo\")";
parent.__c.LogImpl("210616834","devulvo",0);
 //BA.debugLineNum = 192;BA.debugLine="Dim j As HttpJob";
_j = new b4j.smartscan.httpjob();
 //BA.debugLineNum = 193;BA.debugLine="Dim URL As String = \"http://10.125.15.164/upload/";
_url = "http://10.125.15.164/upload/v2/";
 //BA.debugLineNum = 195;BA.debugLine="Dim P As String= \"session=\"&ws.Session.Id";
_p = "session="+parent._ws.getSession().getId();
 //BA.debugLineNum = 196;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 197;BA.debugLine="j.PostString(URL,P)";
_j._poststring /*String*/ (_url,_p);
 //BA.debugLineNum = 199;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.smartscan.httpjob) result[0];
;
 //BA.debugLineNum = 200;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 201;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("210616847",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 202;BA.debugLine="Log(\"mensaje enviado\")";
parent.__c.LogImpl("210616848","mensaje enviado",0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 204;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 206;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4j.smartscan.httpjob _j) throws Exception{
}
public void  _enviarai(String _message) throws Exception{
ResumableSub_enviarAI rsub = new ResumableSub_enviarAI(this,_message);
rsub.resume(ba, null);
}
public static class ResumableSub_enviarAI extends BA.ResumableSub {
public ResumableSub_enviarAI(b4j.smartscan.gt parent,String _message) {
this.parent = parent;
this._message = _message;
}
b4j.smartscan.gt parent;
String _message;
String _strapiurl = "";
anywheresoftware.b4a.objects.collections.Map _partsmap = null;
anywheresoftware.b4a.objects.collections.List _partslist = null;
anywheresoftware.b4a.objects.collections.Map _contentsmap = null;
anywheresoftware.b4a.objects.collections.List _contentslist = null;
anywheresoftware.b4a.objects.collections.Map _finalmap = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
String _strpayload = "";
b4j.smartscan.httpjob _j = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jroot = null;
anywheresoftware.b4a.objects.collections.List _candidates = null;
anywheresoftware.b4a.objects.collections.Map _colcandidates = null;
String _finishreason = "";
int _index = 0;
anywheresoftware.b4a.objects.collections.List _safetyratings = null;
anywheresoftware.b4a.objects.collections.Map _colsafetyratings = null;
String _probability = "";
String _category = "";
anywheresoftware.b4a.objects.collections.Map _content = null;
String _role = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
anywheresoftware.b4a.objects.collections.Map _colparts = null;
String _text = "";
anywheresoftware.b4a.objects.collections.Map _usagemetadata = null;
int _candidatestokencount = 0;
int _totaltokencount = 0;
int _prompttokencount = 0;
anywheresoftware.b4a.objects.collections.Map _error = null;
int _code = 0;
anywheresoftware.b4a.BA.IterableList group38;
int index38;
int groupLen38;
anywheresoftware.b4a.BA.IterableList group46;
int index46;
int groupLen46;
anywheresoftware.b4a.BA.IterableList group58;
int index58;
int groupLen58;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 407;BA.debugLine="Dim strAPIurl As String =\"https://generativelangu";
_strapiurl = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=AIzaSyAAlU6UEaSo0NcGFZWC_q2uZOh8uBuQSt0";
 //BA.debugLineNum = 408;BA.debugLine="Log(strAPIurl)";
parent.__c.LogImpl("211468802",_strapiurl,0);
 //BA.debugLineNum = 411;BA.debugLine="Dim partsMap As Map";
_partsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 412;BA.debugLine="partsMap.Initialize";
_partsmap.Initialize();
 //BA.debugLineNum = 413;BA.debugLine="partsMap.Put(\"text\", $\" del siguiente bloque de t";
_partsmap.Put((Object)("text"),(Object)((" del siguiente bloque de texto necesito que me identifiques y ordenes los siguientes valores MOTOR, PLACA, AÑO, COLOR, CHASIS algunos ejemplos\n"+"	 de motor son los siguientes (45386047, YD25776714P, MGC20597, CE7AN29R9052) algunos ejemplos de numeros de placa son los siguientes (TEA7853, HED8025, HDA4779)\n"+"	  el año siempre toma el que no encuetres bajo el texto año sino el siguiente el color pueden ser dos ejemplo AZUL-BLANCO o tambien puede ser solo uno ejemplo AZUL\n"+"	   toma en cuenta que el numero del motor siempre tendra menos o igual tamaño de caracteres que el numero del chasis favor limita la respuesta unicamente a los datos\n"+"	    en una lista ordenada  en el formato Motor: CE7AN29R9052\\nPlaca: XXX1234\\nAño: 2022\\nColor: AZUL-BLANCO\\nChasis: MD637AE74N2AB1025 \\n el parametro el valor o numero \n"+"		luego en el siguiente espacio el numero de placa y asi con los datos solicitados recuerda unicamente Motor,Placa,Año,Color y Chasis no mas datos. agunos ejmeplos \n"+"		de chasis son los siguientes (1FV6HLAA7VL714763, 3N6CD33B2ZK463860, JTEBR3FJ60K277588): "+parent.__c.SmartStringFormatter("",(Object)(_message))+" ")));
 //BA.debugLineNum = 422;BA.debugLine="Dim partsList As List";
_partslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 423;BA.debugLine="partsList.Initialize";
_partslist.Initialize();
 //BA.debugLineNum = 424;BA.debugLine="partsList.Add(partsMap)";
_partslist.Add((Object)(_partsmap.getObject()));
 //BA.debugLineNum = 427;BA.debugLine="Dim contentsMap As Map";
_contentsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 428;BA.debugLine="contentsMap.Initialize";
_contentsmap.Initialize();
 //BA.debugLineNum = 429;BA.debugLine="contentsMap.Put(\"parts\", partsList)";
_contentsmap.Put((Object)("parts"),(Object)(_partslist.getObject()));
 //BA.debugLineNum = 432;BA.debugLine="Dim contentsList As List";
_contentslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 433;BA.debugLine="contentsList.Initialize";
_contentslist.Initialize();
 //BA.debugLineNum = 434;BA.debugLine="contentsList.Add(contentsMap)";
_contentslist.Add((Object)(_contentsmap.getObject()));
 //BA.debugLineNum = 437;BA.debugLine="Dim finalMap As Map";
_finalmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 438;BA.debugLine="finalMap.Initialize";
_finalmap.Initialize();
 //BA.debugLineNum = 439;BA.debugLine="finalMap.Put(\"contents\", contentsList)";
_finalmap.Put((Object)("contents"),(Object)(_contentslist.getObject()));
 //BA.debugLineNum = 442;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 443;BA.debugLine="JSONGenerator.Initialize(finalMap)";
_jsongenerator.Initialize(_finalmap);
 //BA.debugLineNum = 445;BA.debugLine="Log(JSONGenerator.ToString)";
parent.__c.LogImpl("211468839",_jsongenerator.ToString(),0);
 //BA.debugLineNum = 447;BA.debugLine="Dim strPayload As String = JSONGenerator.ToString";
_strpayload = _jsongenerator.ToString();
 //BA.debugLineNum = 449;BA.debugLine="Dim j As HttpJob";
_j = new b4j.smartscan.httpjob();
 //BA.debugLineNum = 450;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 451;BA.debugLine="J.PostString(strAPIurl,strPayload)";
_j._poststring /*String*/ (_strapiurl,_strpayload);
 //BA.debugLineNum = 452;BA.debugLine="J.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 454;BA.debugLine="Wait For (J) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_j = (b4j.smartscan.httpjob) result[0];
;
 //BA.debugLineNum = 455;BA.debugLine="If J.Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 457;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 458;BA.debugLine="parser.Initialize(J.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 459;BA.debugLine="Dim jRoot As Map";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 460;BA.debugLine="jRoot.Initialize";
_jroot.Initialize();
 //BA.debugLineNum = 461;BA.debugLine="jRoot = parser.NextObject";
_jroot = _parser.NextObject();
 //BA.debugLineNum = 462;BA.debugLine="Dim candidates As List";
_candidates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 463;BA.debugLine="candidates.Initialize";
_candidates.Initialize();
 //BA.debugLineNum = 464;BA.debugLine="candidates= jRoot.Get(\"candidates\")";
_candidates = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jroot.Get((Object)("candidates"))));
 //BA.debugLineNum = 465;BA.debugLine="Dim colcandidates As Map";
_colcandidates = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 466;BA.debugLine="colcandidates.Initialize";
_colcandidates.Initialize();
 //BA.debugLineNum = 467;BA.debugLine="For Each colcandidates As Map In candidates";
if (true) break;

case 4:
//for
this.state = 15;
_colcandidates = new anywheresoftware.b4a.objects.collections.Map();
group38 = _candidates;
index38 = 0;
groupLen38 = group38.getSize();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 15;
if (index38 < groupLen38) {
this.state = 6;
_colcandidates = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group38.Get(index38)));}
if (true) break;

case 21:
//C
this.state = 20;
index38++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 468;BA.debugLine="Dim finishReason As String = colcandidates.Get(";
_finishreason = BA.ObjectToString(_colcandidates.Get((Object)("finishReason")));
 //BA.debugLineNum = 469;BA.debugLine="Dim index As Int = colcandidates.Get(\"index\")";
_index = (int)(BA.ObjectToNumber(_colcandidates.Get((Object)("index"))));
 //BA.debugLineNum = 470;BA.debugLine="Dim safetyRatings As List";
_safetyratings = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 471;BA.debugLine="safetyRatings.Initialize";
_safetyratings.Initialize();
 //BA.debugLineNum = 472;BA.debugLine="safetyRatings = colcandidates.Get(\"safetyRating";
_safetyratings = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colcandidates.Get((Object)("safetyRatings"))));
 //BA.debugLineNum = 473;BA.debugLine="Dim colsafetyRatings As Map";
_colsafetyratings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 474;BA.debugLine="colsafetyRatings.Initialize";
_colsafetyratings.Initialize();
 //BA.debugLineNum = 475;BA.debugLine="For Each colsafetyRatings As Map In safetyRatin";
if (true) break;

case 7:
//for
this.state = 10;
_colsafetyratings = new anywheresoftware.b4a.objects.collections.Map();
group46 = _safetyratings;
index46 = 0;
groupLen46 = group46.getSize();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 10;
if (index46 < groupLen46) {
this.state = 9;
_colsafetyratings = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group46.Get(index46)));}
if (true) break;

case 23:
//C
this.state = 22;
index46++;
if (true) break;

case 9:
//C
this.state = 23;
 //BA.debugLineNum = 476;BA.debugLine="Dim probability As String = colsafetyRatings.G";
_probability = BA.ObjectToString(_colsafetyratings.Get((Object)("probability")));
 //BA.debugLineNum = 477;BA.debugLine="Dim category As String = colsafetyRatings.Get(";
_category = BA.ObjectToString(_colsafetyratings.Get((Object)("category")));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 479;BA.debugLine="Dim content As Map";
_content = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 480;BA.debugLine="content.Initialize";
_content.Initialize();
 //BA.debugLineNum = 481;BA.debugLine="content = colcandidates.Get(\"content\")";
_content = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colcandidates.Get((Object)("content"))));
 //BA.debugLineNum = 482;BA.debugLine="Dim role As String = content.Get(\"role\")";
_role = BA.ObjectToString(_content.Get((Object)("role")));
 //BA.debugLineNum = 483;BA.debugLine="Dim parts As List = content.Get(\"parts\")";
_parts = new anywheresoftware.b4a.objects.collections.List();
_parts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_content.Get((Object)("parts"))));
 //BA.debugLineNum = 485;BA.debugLine="partes=parts";
parent._partes = _parts;
 //BA.debugLineNum = 486;BA.debugLine="Dim colparts As Map";
_colparts = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 487;BA.debugLine="colparts.Initialize";
_colparts.Initialize();
 //BA.debugLineNum = 488;BA.debugLine="For Each colparts As Map In parts";
if (true) break;

case 11:
//for
this.state = 14;
_colparts = new anywheresoftware.b4a.objects.collections.Map();
group58 = _parts;
index58 = 0;
groupLen58 = group58.getSize();
this.state = 24;
if (true) break;

case 24:
//C
this.state = 14;
if (index58 < groupLen58) {
this.state = 13;
_colparts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group58.Get(index58)));}
if (true) break;

case 25:
//C
this.state = 24;
index58++;
if (true) break;

case 13:
//C
this.state = 25;
 //BA.debugLineNum = 489;BA.debugLine="Dim text As String = colparts.Get(\"text\")";
_text = BA.ObjectToString(_colparts.Get((Object)("text")));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 21;
;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 18;
;
 //BA.debugLineNum = 494;BA.debugLine="Dim usageMetadata As Map";
_usagemetadata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 495;BA.debugLine="usageMetadata.Initialize";
_usagemetadata.Initialize();
 //BA.debugLineNum = 496;BA.debugLine="usageMetadata = jRoot.Get(\"usageMetadata\")";
_usagemetadata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("usageMetadata"))));
 //BA.debugLineNum = 497;BA.debugLine="Dim candidatesTokenCount As Int = usageMetadata.";
_candidatestokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("candidatesTokenCount"))));
 //BA.debugLineNum = 498;BA.debugLine="Dim totalTokenCount As Int = usageMetadata.Get(\"";
_totaltokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("totalTokenCount"))));
 //BA.debugLineNum = 499;BA.debugLine="Dim promptTokenCount As Int = usageMetadata.Get(";
_prompttokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("promptTokenCount"))));
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 505;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 506;BA.debugLine="parser.Initialize(J.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 507;BA.debugLine="Dim jRoot As Map";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 508;BA.debugLine="jRoot.Initialize";
_jroot.Initialize();
 //BA.debugLineNum = 509;BA.debugLine="jRoot = parser.NextObject";
_jroot = _parser.NextObject();
 //BA.debugLineNum = 510;BA.debugLine="Dim error As Map";
_error = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 511;BA.debugLine="error.Initialize";
_error.Initialize();
 //BA.debugLineNum = 512;BA.debugLine="error = jRoot.Get(\"error\")";
_error = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("error"))));
 //BA.debugLineNum = 513;BA.debugLine="Dim code As Int = error.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_error.Get((Object)("code"))));
 //BA.debugLineNum = 514;BA.debugLine="Dim message As String = error.Get(\"message\")";
_message = BA.ObjectToString(_error.Get((Object)("message")));
 //BA.debugLineNum = 515;BA.debugLine="Dim status As String = error.Get(\"status\")";
parent._status = BA.ObjectToString(_error.Get((Object)("status")));
 //BA.debugLineNum = 516;BA.debugLine="Log(message)";
parent.__c.LogImpl("211468910",_message,0);
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 519;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 521;BA.debugLine="Log(partes)";
parent.__c.LogImpl("211468915",BA.ObjectToString(parent._partes),0);
 //BA.debugLineNum = 524;BA.debugLine="ProcessList(partes)";
parent._processlist(parent._partes);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _enviarainombre(String _message) throws Exception{
ResumableSub_enviarAINombre rsub = new ResumableSub_enviarAINombre(this,_message);
rsub.resume(ba, null);
}
public static class ResumableSub_enviarAINombre extends BA.ResumableSub {
public ResumableSub_enviarAINombre(b4j.smartscan.gt parent,String _message) {
this.parent = parent;
this._message = _message;
}
b4j.smartscan.gt parent;
String _message;
String _strapiurl = "";
anywheresoftware.b4a.objects.collections.Map _partsmap = null;
anywheresoftware.b4a.objects.collections.List _partslist = null;
anywheresoftware.b4a.objects.collections.Map _contentsmap = null;
anywheresoftware.b4a.objects.collections.List _contentslist = null;
anywheresoftware.b4a.objects.collections.Map _finalmap = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
String _strpayload = "";
b4j.smartscan.httpjob _j = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jroot = null;
anywheresoftware.b4a.objects.collections.List _candidates = null;
anywheresoftware.b4a.objects.collections.Map _colcandidates = null;
String _finishreason = "";
int _index = 0;
anywheresoftware.b4a.objects.collections.List _safetyratings = null;
anywheresoftware.b4a.objects.collections.Map _colsafetyratings = null;
String _probability = "";
String _category = "";
anywheresoftware.b4a.objects.collections.Map _content = null;
String _role = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
anywheresoftware.b4a.objects.collections.Map _colparts = null;
String _text = "";
anywheresoftware.b4a.objects.collections.Map _usagemetadata = null;
int _candidatestokencount = 0;
int _totaltokencount = 0;
int _prompttokencount = 0;
anywheresoftware.b4a.objects.collections.Map _error = null;
int _code = 0;
anywheresoftware.b4a.BA.IterableList group38;
int index38;
int groupLen38;
anywheresoftware.b4a.BA.IterableList group46;
int index46;
int groupLen46;
anywheresoftware.b4a.BA.IterableList group58;
int index58;
int groupLen58;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 532;BA.debugLine="Dim strAPIurl As String =\"https://generativelangu";
_strapiurl = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=AIzaSyAAlU6UEaSo0NcGFZWC_q2uZOh8uBuQSt0";
 //BA.debugLineNum = 533;BA.debugLine="Log(strAPIurl)";
parent.__c.LogImpl("211534338",_strapiurl,0);
 //BA.debugLineNum = 536;BA.debugLine="Dim partsMap As Map";
_partsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 537;BA.debugLine="partsMap.Initialize";
_partsmap.Initialize();
 //BA.debugLineNum = 538;BA.debugLine="partsMap.Put(\"text\", $\" del siguiente bloque de t";
_partsmap.Put((Object)("text"),(Object)((" del siguiente bloque de texto necesito que me identifiques y ordenes los siguientes valores Nombre y Numero de identificacion  el nombre puedes encontrarlo\n"+"	como uno o dos nombre como ejemplo JUAN MANUEL por favor concatena con el apellido que puedes encontrarlo como ejemplo como LOPEZ GONZALEZ limita la respuesta unicamente a los datos\n"+"	en una lista ordenada  en el formato Nombre: JUAN MANUEL LOPEZ GONZALEZ\\Identidad: 0801199012345\\n\n"+"	recuerda unicamente Nombre concatenado con el apellido y Numero de identidad no mas datos.: "+parent.__c.SmartStringFormatter("",(Object)(_message))+" ")));
 //BA.debugLineNum = 544;BA.debugLine="Dim partsList As List";
_partslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 545;BA.debugLine="partsList.Initialize";
_partslist.Initialize();
 //BA.debugLineNum = 546;BA.debugLine="partsList.Add(partsMap)";
_partslist.Add((Object)(_partsmap.getObject()));
 //BA.debugLineNum = 549;BA.debugLine="Dim contentsMap As Map";
_contentsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 550;BA.debugLine="contentsMap.Initialize";
_contentsmap.Initialize();
 //BA.debugLineNum = 551;BA.debugLine="contentsMap.Put(\"parts\", partsList)";
_contentsmap.Put((Object)("parts"),(Object)(_partslist.getObject()));
 //BA.debugLineNum = 554;BA.debugLine="Dim contentsList As List";
_contentslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 555;BA.debugLine="contentsList.Initialize";
_contentslist.Initialize();
 //BA.debugLineNum = 556;BA.debugLine="contentsList.Add(contentsMap)";
_contentslist.Add((Object)(_contentsmap.getObject()));
 //BA.debugLineNum = 559;BA.debugLine="Dim finalMap As Map";
_finalmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 560;BA.debugLine="finalMap.Initialize";
_finalmap.Initialize();
 //BA.debugLineNum = 561;BA.debugLine="finalMap.Put(\"contents\", contentsList)";
_finalmap.Put((Object)("contents"),(Object)(_contentslist.getObject()));
 //BA.debugLineNum = 564;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 565;BA.debugLine="JSONGenerator.Initialize(finalMap)";
_jsongenerator.Initialize(_finalmap);
 //BA.debugLineNum = 567;BA.debugLine="Log(JSONGenerator.ToString)";
parent.__c.LogImpl("211534372",_jsongenerator.ToString(),0);
 //BA.debugLineNum = 569;BA.debugLine="Dim strPayload As String = JSONGenerator.ToString";
_strpayload = _jsongenerator.ToString();
 //BA.debugLineNum = 571;BA.debugLine="Dim j As HttpJob";
_j = new b4j.smartscan.httpjob();
 //BA.debugLineNum = 572;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 573;BA.debugLine="J.PostString(strAPIurl,strPayload)";
_j._poststring /*String*/ (_strapiurl,_strpayload);
 //BA.debugLineNum = 574;BA.debugLine="J.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 576;BA.debugLine="Wait For (J) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_j = (b4j.smartscan.httpjob) result[0];
;
 //BA.debugLineNum = 577;BA.debugLine="If J.Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 579;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 580;BA.debugLine="parser.Initialize(J.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 581;BA.debugLine="Dim jRoot As Map";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 582;BA.debugLine="jRoot.Initialize";
_jroot.Initialize();
 //BA.debugLineNum = 583;BA.debugLine="jRoot = parser.NextObject";
_jroot = _parser.NextObject();
 //BA.debugLineNum = 584;BA.debugLine="Dim candidates As List";
_candidates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 585;BA.debugLine="candidates.Initialize";
_candidates.Initialize();
 //BA.debugLineNum = 586;BA.debugLine="candidates= jRoot.Get(\"candidates\")";
_candidates = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jroot.Get((Object)("candidates"))));
 //BA.debugLineNum = 587;BA.debugLine="Dim colcandidates As Map";
_colcandidates = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 588;BA.debugLine="colcandidates.Initialize";
_colcandidates.Initialize();
 //BA.debugLineNum = 589;BA.debugLine="For Each colcandidates As Map In candidates";
if (true) break;

case 4:
//for
this.state = 15;
_colcandidates = new anywheresoftware.b4a.objects.collections.Map();
group38 = _candidates;
index38 = 0;
groupLen38 = group38.getSize();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 15;
if (index38 < groupLen38) {
this.state = 6;
_colcandidates = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group38.Get(index38)));}
if (true) break;

case 21:
//C
this.state = 20;
index38++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 590;BA.debugLine="Dim finishReason As String = colcandidates.Get(";
_finishreason = BA.ObjectToString(_colcandidates.Get((Object)("finishReason")));
 //BA.debugLineNum = 591;BA.debugLine="Dim index As Int = colcandidates.Get(\"index\")";
_index = (int)(BA.ObjectToNumber(_colcandidates.Get((Object)("index"))));
 //BA.debugLineNum = 592;BA.debugLine="Dim safetyRatings As List";
_safetyratings = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 593;BA.debugLine="safetyRatings.Initialize";
_safetyratings.Initialize();
 //BA.debugLineNum = 594;BA.debugLine="safetyRatings = colcandidates.Get(\"safetyRating";
_safetyratings = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colcandidates.Get((Object)("safetyRatings"))));
 //BA.debugLineNum = 595;BA.debugLine="Dim colsafetyRatings As Map";
_colsafetyratings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 596;BA.debugLine="colsafetyRatings.Initialize";
_colsafetyratings.Initialize();
 //BA.debugLineNum = 597;BA.debugLine="For Each colsafetyRatings As Map In safetyRatin";
if (true) break;

case 7:
//for
this.state = 10;
_colsafetyratings = new anywheresoftware.b4a.objects.collections.Map();
group46 = _safetyratings;
index46 = 0;
groupLen46 = group46.getSize();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 10;
if (index46 < groupLen46) {
this.state = 9;
_colsafetyratings = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group46.Get(index46)));}
if (true) break;

case 23:
//C
this.state = 22;
index46++;
if (true) break;

case 9:
//C
this.state = 23;
 //BA.debugLineNum = 598;BA.debugLine="Dim probability As String = colsafetyRatings.G";
_probability = BA.ObjectToString(_colsafetyratings.Get((Object)("probability")));
 //BA.debugLineNum = 599;BA.debugLine="Dim category As String = colsafetyRatings.Get(";
_category = BA.ObjectToString(_colsafetyratings.Get((Object)("category")));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 601;BA.debugLine="Dim content As Map";
_content = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 602;BA.debugLine="content.Initialize";
_content.Initialize();
 //BA.debugLineNum = 603;BA.debugLine="content = colcandidates.Get(\"content\")";
_content = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colcandidates.Get((Object)("content"))));
 //BA.debugLineNum = 604;BA.debugLine="Dim role As String = content.Get(\"role\")";
_role = BA.ObjectToString(_content.Get((Object)("role")));
 //BA.debugLineNum = 605;BA.debugLine="Dim parts As List = content.Get(\"parts\")";
_parts = new anywheresoftware.b4a.objects.collections.List();
_parts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_content.Get((Object)("parts"))));
 //BA.debugLineNum = 607;BA.debugLine="partes=parts";
parent._partes = _parts;
 //BA.debugLineNum = 608;BA.debugLine="Dim colparts As Map";
_colparts = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 609;BA.debugLine="colparts.Initialize";
_colparts.Initialize();
 //BA.debugLineNum = 610;BA.debugLine="For Each colparts As Map In parts";
if (true) break;

case 11:
//for
this.state = 14;
_colparts = new anywheresoftware.b4a.objects.collections.Map();
group58 = _parts;
index58 = 0;
groupLen58 = group58.getSize();
this.state = 24;
if (true) break;

case 24:
//C
this.state = 14;
if (index58 < groupLen58) {
this.state = 13;
_colparts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group58.Get(index58)));}
if (true) break;

case 25:
//C
this.state = 24;
index58++;
if (true) break;

case 13:
//C
this.state = 25;
 //BA.debugLineNum = 611;BA.debugLine="Dim text As String = colparts.Get(\"text\")";
_text = BA.ObjectToString(_colparts.Get((Object)("text")));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 21;
;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 18;
;
 //BA.debugLineNum = 616;BA.debugLine="Dim usageMetadata As Map";
_usagemetadata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 617;BA.debugLine="usageMetadata.Initialize";
_usagemetadata.Initialize();
 //BA.debugLineNum = 618;BA.debugLine="usageMetadata = jRoot.Get(\"usageMetadata\")";
_usagemetadata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("usageMetadata"))));
 //BA.debugLineNum = 619;BA.debugLine="Dim candidatesTokenCount As Int = usageMetadata.";
_candidatestokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("candidatesTokenCount"))));
 //BA.debugLineNum = 620;BA.debugLine="Dim totalTokenCount As Int = usageMetadata.Get(\"";
_totaltokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("totalTokenCount"))));
 //BA.debugLineNum = 621;BA.debugLine="Dim promptTokenCount As Int = usageMetadata.Get(";
_prompttokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("promptTokenCount"))));
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 627;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 628;BA.debugLine="parser.Initialize(J.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 629;BA.debugLine="Dim jRoot As Map";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 630;BA.debugLine="jRoot.Initialize";
_jroot.Initialize();
 //BA.debugLineNum = 631;BA.debugLine="jRoot = parser.NextObject";
_jroot = _parser.NextObject();
 //BA.debugLineNum = 632;BA.debugLine="Dim error As Map";
_error = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 633;BA.debugLine="error.Initialize";
_error.Initialize();
 //BA.debugLineNum = 634;BA.debugLine="error = jRoot.Get(\"error\")";
_error = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("error"))));
 //BA.debugLineNum = 635;BA.debugLine="Dim code As Int = error.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_error.Get((Object)("code"))));
 //BA.debugLineNum = 636;BA.debugLine="Dim message As String = error.Get(\"message\")";
_message = BA.ObjectToString(_error.Get((Object)("message")));
 //BA.debugLineNum = 637;BA.debugLine="Dim status As String = error.Get(\"status\")";
parent._status = BA.ObjectToString(_error.Get((Object)("status")));
 //BA.debugLineNum = 638;BA.debugLine="Log(message)";
parent.__c.LogImpl("211534443",_message,0);
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 641;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 643;BA.debugLine="Log(partes)";
parent.__c.LogImpl("211534448",BA.ObjectToString(parent._partes),0);
 //BA.debugLineNum = 645;BA.debugLine="ProcessListNombre(partes)";
parent._processlistnombre(parent._partes);
 //BA.debugLineNum = 648;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _enviarporcentaje(String _algo) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Public Sub enviarporcentaje (algo As String)";
 //BA.debugLineNum = 221;BA.debugLine="ws.Eval($\"updateProgress(${algo});\"$,Null)";
_ws.Eval(("updateProgress("+__c.SmartStringFormatter("",(Object)(_algo))+");"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 222;BA.debugLine="ws.Eval(\"location.reload(True);\",Null)";
_ws.Eval("location.reload(True);",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return "";
}
public String  _extractvalue(String _input,String _key,String _nextkey) throws Exception{
int _startindex = 0;
int _endindex = 0;
 //BA.debugLineNum = 322;BA.debugLine="Sub ExtractValue(input As String, key As String, n";
 //BA.debugLineNum = 323;BA.debugLine="Dim startIndex As Int = input.IndexOf(key)";
_startindex = _input.indexOf(_key);
 //BA.debugLineNum = 324;BA.debugLine="If startIndex = -1 Then Return \"\"";
if (_startindex==-1) { 
if (true) return "";};
 //BA.debugLineNum = 326;BA.debugLine="startIndex = startIndex + key.Length";
_startindex = (int) (_startindex+_key.length());
 //BA.debugLineNum = 327;BA.debugLine="Dim endIndex As Int";
_endindex = 0;
 //BA.debugLineNum = 328;BA.debugLine="If nextKey <> \"\" Then";
if ((_nextkey).equals("") == false) { 
 //BA.debugLineNum = 329;BA.debugLine="endIndex = input.IndexOf(nextKey)";
_endindex = _input.indexOf(_nextkey);
 //BA.debugLineNum = 330;BA.debugLine="If endIndex = -1 Then";
if (_endindex==-1) { 
 //BA.debugLineNum = 331;BA.debugLine="endIndex = input.Length";
_endindex = _input.length();
 }else {
 //BA.debugLineNum = 333;BA.debugLine="endIndex = endIndex";
_endindex = _endindex;
 };
 }else {
 //BA.debugLineNum = 336;BA.debugLine="endIndex = input.Length";
_endindex = _input.length();
 };
 //BA.debugLineNum = 339;BA.debugLine="Return input.SubString2(startIndex, endIndex).Tri";
if (true) return _input.substring(_startindex,_endindex).trim();
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return "";
}
public String  _gebd_click(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Private Sub gebd_Click(params As Map)";
 //BA.debugLineNum = 236;BA.debugLine="Main.sql1.BeginTransaction";
_main._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
 //BA.debugLineNum = 239;BA.debugLine="Main.sql1.ExecNonQuery2(\"insert into vehiculos va";
_main._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into vehiculos values (?,?,?,?,?,?,?,?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__c.Null,_txtnombre.GetVal().getValue(),_txtidentidad.GetVal().getValue(),_txtmotor.GetVal().getValue(),_txtplaca.GetVal().getValue(),_txtanio.GetVal().getValue(),_txtcolor.GetVal().getValue(),_txtchasis.GetVal().getValue()}));
 //BA.debugLineNum = 242;BA.debugLine="Main.sql1.TransactionSuccessful";
_main._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 //BA.debugLineNum = 244;BA.debugLine="mysql.BeginTransaction";
_mysql.BeginTransaction();
 //BA.debugLineNum = 245;BA.debugLine="mysql.ExecNonQuery2(\"insert into InfoDB values (?";
_mysql.ExecNonQuery2("insert into InfoDB values (?,?,?,?,?,?,?,?,?,?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__c.Null,_txtnombre.GetVal().getValue(),_txtidentidad.GetVal().getValue(),__c.Null,_txtmotor.GetVal().getValue(),_txtplaca.GetVal().getValue(),_txtanio.GetVal().getValue(),_txtcolor.GetVal().getValue(),_txtchasis.GetVal().getValue(),(Object)("GT")}));
 //BA.debugLineNum = 249;BA.debugLine="mysql.TransactionSuccessful";
_mysql.TransactionSuccessful();
 //BA.debugLineNum = 251;BA.debugLine="ws.Eval($\"Swal.fire({    title: 'El registro se h";
_ws.Eval(("Swal.fire({\n"+"   title: 'El registro se ha cargado con éxito',\n"+"   text: 'Documentación enviada.',\n"+"   icon: 'success',\n"+"   showConfirmButton: true\n"+"}).then((result) => {\n"+"   if (result.isConfirmed) {\n"+"     alertify.success('Registro enviado.');\n"+"	 //document.location.replace('index.html');\n"+"   }\n"+"});"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 263;BA.debugLine="ws.Eval(\"deshabilitarBoton()\",Null)";
_ws.Eval("deshabilitarBoton()",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 264;BA.debugLine="txtnombre.SetVal(\"\")";
_txtnombre.SetVal((Object)(""));
 //BA.debugLineNum = 265;BA.debugLine="txtidentidad.SetVal(\"\")";
_txtidentidad.SetVal((Object)(""));
 //BA.debugLineNum = 266;BA.debugLine="txtmotor.SetVal(\"\")";
_txtmotor.SetVal((Object)(""));
 //BA.debugLineNum = 267;BA.debugLine="txtplaca.SetVal(\"\")";
_txtplaca.SetVal((Object)(""));
 //BA.debugLineNum = 268;BA.debugLine="txtanio.SetVal(\"\")";
_txtanio.SetVal((Object)(""));
 //BA.debugLineNum = 269;BA.debugLine="txtcolor.SetVal(\"\")";
_txtcolor.SetVal((Object)(""));
 //BA.debugLineNum = 270;BA.debugLine="txtchasis.SetVal(\"\")";
_txtchasis.SetVal((Object)(""));
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 21;BA.debugLine="partes.Initialize";
_partes.Initialize();
 //BA.debugLineNum = 22;BA.debugLine="Main.sql1.InitializeSQLite(File.DirApp & \"/DB\", \"";
_main._sql1 /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__c.File.getDirApp()+"/DB","InfoDBGT.db",__c.False);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _jqm_click(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
String _message = "";
 //BA.debugLineNum = 276;BA.debugLine="Private Sub jqm_Click(params As Map)";
 //BA.debugLineNum = 278;BA.debugLine="Log(Main.msj.Get(txtiddelmovil.GetVal.Value&\"mess";
__c.LogImpl("210944514",BA.ObjectToString(_main._msj /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(BA.ObjectToString(_txtiddelmovil.GetVal().getValue())+"messagegt"))),0);
 //BA.debugLineNum = 279;BA.debugLine="Log(txtiddelmovil.GetVal.Value)";
__c.LogImpl("210944515",BA.ObjectToString(_txtiddelmovil.GetVal().getValue()),0);
 //BA.debugLineNum = 280;BA.debugLine="txtmensaje.SetHtml(\"\")";
_txtmensaje.SetHtml("");
 //BA.debugLineNum = 281;BA.debugLine="Log(\"CLICK\")";
__c.LogImpl("210944517","CLICK",0);
 //BA.debugLineNum = 283;BA.debugLine="txtmensaje.SetText(Main.msj.Get(txtiddelmovil.Get";
_txtmensaje.SetText(BA.ObjectToString(_main._msj /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(BA.ObjectToString(_txtiddelmovil.GetVal().getValue())+"messagegt"))));
 //BA.debugLineNum = 285;BA.debugLine="Dim message As String = Main.msj.Get(txtiddelmovi";
_message = BA.ObjectToString(_main._msj /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(BA.ObjectToString(_txtiddelmovil.GetVal().getValue())+"messagegt")));
 //BA.debugLineNum = 288;BA.debugLine="If message.Contains(\"MOTOR\") Or message.Contains(";
if (_message.contains("MOTOR") || _message.contains("PLACA") || _message.contains("COLOR") || _message.contains("CHASIS")) { 
 //BA.debugLineNum = 289;BA.debugLine="enviarAI(message)";
_enviarai(_message);
 };
 //BA.debugLineNum = 292;BA.debugLine="If message.Contains(\"APELLIDO\") Or message.Contai";
if (_message.contains("APELLIDO") || _message.contains("SEXO") || _message.contains("NACIONALIDAD")) { 
 //BA.debugLineNum = 293;BA.debugLine="enviarAINombre(message)";
_enviarainombre(_message);
 };
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return "";
}
public String  _leertesseract() throws Exception{
anywheresoftware.b4j.objects.Shell _sh = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub leertesseract'_Click(Params As Map)";
 //BA.debugLineNum = 73;BA.debugLine="Log(\"click al boton leertesseract\")";
__c.LogImpl("210354689","click al boton leertesseract",0);
 //BA.debugLineNum = 75;BA.debugLine="Dim sh As Shell";
_sh = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 76;BA.debugLine="sh.Initialize(\"sh\",\"tesseract\",Null)";
_sh.Initialize("sh","tesseract",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 77;BA.debugLine="sh.run(10000)";
_sh.Run(ba,(long) (10000));
 //BA.debugLineNum = 78;BA.debugLine="langmap.Initialize";
_langmap.Initialize();
 //BA.debugLineNum = 79;BA.debugLine="langlist.Initialize";
_langlist.Initialize();
 //BA.debugLineNum = 80;BA.debugLine="langlist.Add(\"spa_old\")";
_langlist.Add((Object)("spa_old"));
 //BA.debugLineNum = 81;BA.debugLine="langmap.Put(\"Español\",langlist.Get(0))";
_langmap.Put((Object)("Español"),_langlist.Get((int) (0)));
 //BA.debugLineNum = 82;BA.debugLine="Log(langlist)";
__c.LogImpl("210354698",BA.ObjectToString(_langlist),0);
 //BA.debugLineNum = 83;BA.debugLine="Log(langmap)";
__c.LogImpl("210354699",BA.ObjectToString(_langmap),0);
 //BA.debugLineNum = 84;BA.debugLine="Log(langmap.Get(\"Español\"))";
__c.LogImpl("210354700",BA.ObjectToString(_langmap.Get((Object)("Español"))),0);
 //BA.debugLineNum = 87;BA.debugLine="ProcessImage";
_processimage();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _ocr_finished(String _text,int _processingtime) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub OCR_finished (Text As String,ProcessingTime As";
 //BA.debugLineNum = 353;BA.debugLine="Log(Text)";
__c.LogImpl("211206657",_text,0);
 //BA.debugLineNum = 354;BA.debugLine="Log(ProcessingTime & \" ms\")";
__c.LogImpl("211206658",BA.NumberToString(_processingtime)+" ms",0);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return "";
}
public String  _ocr_overlay(anywheresoftware.b4a.objects.collections.Map _overlay) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub OCR_overlay (Overlay As Map)";
 //BA.debugLineNum = 358;BA.debugLine="Log(Overlay)";
__c.LogImpl("211272193",BA.ObjectToString(_overlay),0);
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public String  _processimage() throws Exception{
String _uploadedimagepath = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inp = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 94;BA.debugLine="Sub ProcessImage";
 //BA.debugLineNum = 96;BA.debugLine="If Main.NombreArchivo <> \"\" Then";
if ((_main._nombrearchivo /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 101;BA.debugLine="Try";
try { //BA.debugLineNum = 103;BA.debugLine="Dim uploadedImagePath As String = File.Combine(";
_uploadedimagepath = __c.File.Combine(__c.File.getDirApp()+"/up","");
 //BA.debugLineNum = 106;BA.debugLine="Log(Main.NombreArchivo)";
__c.LogImpl("210420236",_main._nombrearchivo /*String*/ ,0);
 //BA.debugLineNum = 107;BA.debugLine="Dim Inp As InputStream = File.OpenInput(uploade";
_inp = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_inp = __c.File.OpenInput(_uploadedimagepath,_main._nombrearchivo /*String*/ );
 //BA.debugLineNum = 110;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(__c.File.getDirApp()+"/tesseract-ocr","image.png",__c.False);
 //BA.debugLineNum = 113;BA.debugLine="File.Copy2(Inp, out)";
__c.File.Copy2((java.io.InputStream)(_inp.getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 116;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 121;BA.debugLine="scan";
_scan();
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 123;BA.debugLine="Log(LastException)";
__c.LogImpl("210420253",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _processlist(anywheresoftware.b4a.objects.collections.List _inputlist) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
String _text = "";
String _motor = "";
String _placa = "";
String _anio = "";
String _color = "";
String _chasis = "";
 //BA.debugLineNum = 298;BA.debugLine="Sub ProcessList(inputList As List)";
 //BA.debugLineNum = 299;BA.debugLine="For Each item As Map In inputList";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _inputlist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));
 //BA.debugLineNum = 300;BA.debugLine="Dim text As String = item.Get(\"text\")";
_text = BA.ObjectToString(_item.Get((Object)("text")));
 //BA.debugLineNum = 303;BA.debugLine="Dim motor As String = ExtractValue(text, \"Motor:";
_motor = _extractvalue(_text,"Motor:","Placa:");
 //BA.debugLineNum = 304;BA.debugLine="Dim placa As String = ExtractValue(text, \"Placa:";
_placa = _extractvalue(_text,"Placa:","Año:");
 //BA.debugLineNum = 305;BA.debugLine="Dim anio As String = ExtractValue(text, \"Año:\",";
_anio = _extractvalue(_text,"Año:","Color:");
 //BA.debugLineNum = 306;BA.debugLine="Dim color As String = ExtractValue(text, \"Color:";
_color = _extractvalue(_text,"Color:","Chasis:");
 //BA.debugLineNum = 307;BA.debugLine="Dim chasis As String = ExtractValue(text, \"Chasi";
_chasis = _extractvalue(_text,"Chasis:","");
 //BA.debugLineNum = 308;BA.debugLine="Log(motor)";
__c.LogImpl("211010058",_motor,0);
 //BA.debugLineNum = 310;BA.debugLine="txtmotor.SetVal(motor)";
_txtmotor.SetVal((Object)(_motor));
 //BA.debugLineNum = 311;BA.debugLine="txtplaca.SetVal(placa)";
_txtplaca.SetVal((Object)(_placa));
 //BA.debugLineNum = 312;BA.debugLine="txtanio.SetVal(anio)";
_txtanio.SetVal((Object)(_anio));
 //BA.debugLineNum = 313;BA.debugLine="txtcolor.SetVal(color)";
_txtcolor.SetVal((Object)(_color));
 //BA.debugLineNum = 314;BA.debugLine="txtchasis.SetVal(chasis)";
_txtchasis.SetVal((Object)(_chasis));
 }
};
 //BA.debugLineNum = 317;BA.debugLine="ws.Eval(\"validarCampos()\",Null)";
_ws.Eval("validarCampos()",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public String  _processlistnombre(anywheresoftware.b4a.objects.collections.List _inputlist) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
String _text = "";
String _nombre = "";
String _identidad = "";
 //BA.debugLineNum = 650;BA.debugLine="Sub ProcessListNombre(inputList As List)";
 //BA.debugLineNum = 651;BA.debugLine="For Each item As Map In inputList";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _inputlist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));
 //BA.debugLineNum = 652;BA.debugLine="Dim text As String = item.Get(\"text\")";
_text = BA.ObjectToString(_item.Get((Object)("text")));
 //BA.debugLineNum = 655;BA.debugLine="Dim nombre As String = ExtractValue(text, \"Nombr";
_nombre = _extractvalue(_text,"Nombre:","\\Identidad:");
 //BA.debugLineNum = 656;BA.debugLine="Dim identidad As String = ExtractValue(text, \"Id";
_identidad = _extractvalue(_text,"Identidad:","\\n");
 //BA.debugLineNum = 658;BA.debugLine="Log(nombre)";
__c.LogImpl("211599880",_nombre,0);
 //BA.debugLineNum = 660;BA.debugLine="txtnombre.SetVal(nombre)";
_txtnombre.SetVal((Object)(_nombre));
 //BA.debugLineNum = 661;BA.debugLine="txtidentidad.SetVal(identidad)";
_txtidentidad.SetVal((Object)(_identidad));
 }
};
 //BA.debugLineNum = 664;BA.debugLine="ws.Eval(\"validarCampos()\",Null)";
_ws.Eval("validarCampos()",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return "";
}
public String  _scan() throws Exception{
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4j.objects.Shell _sh1 = null;
 //BA.debugLineNum = 130;BA.debugLine="Sub scan";
 //BA.debugLineNum = 131;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 132;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 133;BA.debugLine="args.AddAll(Array As String(\"image.png\",\"output\",";
_args.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"image.png","output","-l",BA.ObjectToString(_langmap.Get((Object)("Español")))}));
 //BA.debugLineNum = 134;BA.debugLine="Dim sh1 As Shell";
_sh1 = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 135;BA.debugLine="tesseractInstalled=True";
_tesseractinstalled = __c.True;
 //BA.debugLineNum = 136;BA.debugLine="If tesseractInstalled Then";
if (_tesseractinstalled) { 
 //BA.debugLineNum = 137;BA.debugLine="sh1.Initialize(\"sh1\",\"tesseract\",args)";
_sh1.Initialize("sh1","tesseract",_args);
 //BA.debugLineNum = 138;BA.debugLine="Log(\"iniciado\")";
__c.LogImpl("210485768","iniciado",0);
 }else {
 //BA.debugLineNum = 140;BA.debugLine="sh1.Initialize(\"sh1\",File.Combine(File.Combine(F";
_sh1.Initialize("sh1",__c.File.Combine(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"tesseract"),_args);
 //BA.debugLineNum = 141;BA.debugLine="Log(File.Combine(File.Combine(File.DirApp,\"tesse";
__c.LogImpl("210485771",__c.File.Combine(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"tesseract"),0);
 };
 //BA.debugLineNum = 143;BA.debugLine="sh1.WorkingDirectory = File.Combine(File.DirApp,\"";
_sh1.setWorkingDirectory(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"));
 //BA.debugLineNum = 144;BA.debugLine="sh1.run(100000)";
_sh1.Run(ba,(long) (100000));
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _sh_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub sh_ProcessCompleted (Success As Boolean, ExitC";
 //BA.debugLineNum = 363;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
 //BA.debugLineNum = 364;BA.debugLine="Log(\"Success\")";
__c.LogImpl("211337730","Success",0);
 //BA.debugLineNum = 365;BA.debugLine="Log(StdOut)";
__c.LogImpl("211337731",_stdout,0);
 //BA.debugLineNum = 366;BA.debugLine="tesseractInstalled=True";
_tesseractinstalled = __c.True;
 //BA.debugLineNum = 367;BA.debugLine="Log(\"Si\")";
__c.LogImpl("211337733","Si",0);
 }else {
 //BA.debugLineNum = 369;BA.debugLine="Log(\"Error: \" & StdErr)";
__c.LogImpl("211337735","Error: "+_stderr,0);
 //BA.debugLineNum = 370;BA.debugLine="tesseractInstalled=False";
_tesseractinstalled = __c.False;
 };
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return "";
}
public String  _sh1_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
String _message = "";
 //BA.debugLineNum = 374;BA.debugLine="Sub sh1_ProcessCompleted (Success As Boolean, Exit";
 //BA.debugLineNum = 375;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
 //BA.debugLineNum = 376;BA.debugLine="Log(\"Success\")";
__c.LogImpl("211403266","Success",0);
 //BA.debugLineNum = 377;BA.debugLine="Log(StdOut)";
__c.LogImpl("211403267",_stdout,0);
 //BA.debugLineNum = 378;BA.debugLine="txtmensaje.SetText(\"\")";
_txtmensaje.SetText("");
 //BA.debugLineNum = 379;BA.debugLine="txtmensaje.SetHtml(File.ReadString(File.Combine(";
_txtmensaje.SetHtml(__c.File.ReadString(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"output.txt"));
 //BA.debugLineNum = 381;BA.debugLine="Dim message As String = File.ReadString(File.Com";
_message = __c.File.ReadString(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"output.txt");
 //BA.debugLineNum = 382;BA.debugLine="Log(message)";
__c.LogImpl("211403272",_message,0);
 //BA.debugLineNum = 386;BA.debugLine="If message.Contains(\"MOTOR\") Or message.Contains";
if (_message.contains("MOTOR") || _message.contains("PLACA") || _message.contains("COLOR") || _message.contains("CHASIS")) { 
 //BA.debugLineNum = 387;BA.debugLine="enviarAI(message)";
_enviarai(_message);
 };
 //BA.debugLineNum = 391;BA.debugLine="If message.Contains(\"APELLIDO\") Or message.Conta";
if (_message.contains("APELLIDO") || _message.contains("SEXO") || _message.contains("NACIONALIDAD")) { 
 //BA.debugLineNum = 392;BA.debugLine="enviarAINombre(message)";
_enviarainombre(_message);
 };
 }else {
 //BA.debugLineNum = 397;BA.debugLine="Log(ExitCode)";
__c.LogImpl("211403287",BA.NumberToString(_exitcode),0);
 //BA.debugLineNum = 398;BA.debugLine="Log(\"Error: \" & StdErr)";
__c.LogImpl("211403288","Error: "+_stderr,0);
 //BA.debugLineNum = 399;BA.debugLine="ws.Alert(\"fallo de reconocimiento\")";
_ws.Alert("fallo de reconocimiento");
 };
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return "";
}
public String  _t_p_tick() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub t_p_Tick";
 //BA.debugLineNum = 54;BA.debugLine="If Main.porcentaje <> \"\" Then";
if ((_main._porcentaje /*String*/ ).equals("") == false) { 
 };
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 151;BA.debugLine="ws.RunFunction(\"ServerTime\", Array As Object(Date";
_ws.RunFunction("ServerTime",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__c.DateTime.Time(__c.DateTime.getNow()))}));
 //BA.debugLineNum = 152;BA.debugLine="ws.Flush";
_ws.Flush();
 //BA.debugLineNum = 153;BA.debugLine="If Main.reload=1 And Main.sessionid.Get(ws.Sessio";
if (_main._reload /*int*/ ==1 && (_main._sessionid /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_ws.getSession().getId()))).equals((Object)(_ws.getSession().getId()))) { 
 //BA.debugLineNum = 155;BA.debugLine="ws.Eval($\"Swal.fire({    title: 'Los documentos";
_ws.Eval(("Swal.fire({\n"+"   title: 'Los documentos se han cargado con éxito',\n"+"   text: 'Documentación enviada.',\n"+"   icon: 'success',\n"+"   showConfirmButton: true\n"+"}).then((result) => {\n"+"   if (result.isConfirmed) {\n"+"     alertify.success('Documentación enviada.');\n"+"	 //document.location.replace('index.html');\n"+"   }\n"+"});"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 166;BA.debugLine="txtmensaje.SetText(\"Convirtiendo...\")";
_txtmensaje.SetText("Convirtiendo...");
 //BA.debugLineNum = 167;BA.debugLine="Colocar_cero(Null)";
_colocar_cero((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
 //BA.debugLineNum = 171;BA.debugLine="Log(\"subido\")";
__c.LogImpl("210551318","subido",0);
 //BA.debugLineNum = 173;BA.debugLine="leertesseract";
_leertesseract();
 //BA.debugLineNum = 174;BA.debugLine="Main.reload=0";
_main._reload /*int*/  = (int) (0);
 //BA.debugLineNum = 175;BA.debugLine="Main.sessionid.Remove(ws.Session.id)";
_main._sessionid /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_ws.getSession().getId()));
 };
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
 //BA.debugLineNum = 26;BA.debugLine="ws = WebSocket1";
_ws = _websocket1;
 //BA.debugLineNum = 28;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
_timer1.Initialize(ba,"timer1",(long) (1000));
 //BA.debugLineNum = 29;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 30;BA.debugLine="t_p.Initialize(\"t_p\",100)";
_t_p.Initialize(ba,"t_p",(long) (100));
 //BA.debugLineNum = 31;BA.debugLine="t_p.Enabled=True";
_t_p.setEnabled(__c.True);
 //BA.debugLineNum = 32;BA.debugLine="Main.porcentaje=\"\"";
_main._porcentaje /*String*/  = "";
 //BA.debugLineNum = 34;BA.debugLine="Log(ws.Session.Id)";
__c.LogImpl("210158089",_ws.getSession().getId(),0);
 //BA.debugLineNum = 37;BA.debugLine="partes.Initialize";
_partes.Initialize();
 //BA.debugLineNum = 39;BA.debugLine="ws.eval($\"deshabilitarBoton()\"$, Null)";
_ws.Eval(("deshabilitarBoton()"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 40;BA.debugLine="Main.ValidarUsuario(ws,lblusernamemain)";
_main._validarusuario /*String*/ (_ws,_lblusernamemain);
 //BA.debugLineNum = 41;BA.debugLine="lblusernamemain.SetText(ws.Session.GetAttribute(\"";
_lblusernamemain.SetText(BA.ObjectToString(_ws.getSession().GetAttribute("UserName")));
 //BA.debugLineNum = 42;BA.debugLine="ws.Eval($\"validarPais(\"${ws.Session.GetAttribute(";
_ws.Eval(("validarPais(\""+__c.SmartStringFormatter("",_ws.getSession().GetAttribute("Pais"))+"\");"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 43;BA.debugLine="mysql= Main.pool.GetConnection";
_mysql = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Private Sub WebSocket_Disconnected";
 //BA.debugLineNum = 212;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 213;BA.debugLine="t_p.Enabled=False";
_t_p.setEnabled(__c.False);
 //BA.debugLineNum = 214;BA.debugLine="Log(\"disconnected\")";
__c.LogImpl("210682371","disconnected",0);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
