package b4j.smartscan;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class hn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.StandardBA("b4j.smartscan", "b4j.smartscan.hn", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.smartscan.hn.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.WebSocket.JQueryElement _txtfecha = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.collections.Map _langmap = null;
public anywheresoftware.b4a.objects.collections.List _langlist = null;
public boolean _tesseractinstalled = false;
public anywheresoftware.b4a.objects.Timer _t_p = null;
public String _status = "";
public String _response = "";
public String _jscript = "";
public anywheresoftware.b4a.objects.collections.List _partes = null;
public eu.smessenger.unboundid.UNBOUNDID4B4J _ldapclient = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _lblusernamemain = null;
public anywheresoftware.b4j.objects.SQL _mysql = null;
public b4j.smartscan.main _main = null;
public b4j.smartscan.httputils2service _httputils2service = null;
public boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 350;BA.debugLine="Log(\"Error\")";
__c.LogImpl("26225921","Error",0);
 //BA.debugLineNum = 351;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
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
_txtfecha = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
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
 //BA.debugLineNum = 14;BA.debugLine="Private jscript As String";
_jscript = "";
 //BA.debugLineNum = 15;BA.debugLine="Dim partes As List";
_partes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private ldapClient As UNBOUNDID4B4J";
_ldapclient = new eu.smessenger.unboundid.UNBOUNDID4B4J();
 //BA.debugLineNum = 17;BA.debugLine="Private lblusernamemain As JQueryElement";
_lblusernamemain = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
 //BA.debugLineNum = 18;BA.debugLine="Private mysql As SQL";
_mysql = new anywheresoftware.b4j.objects.SQL();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _colocar_cero(anywheresoftware.b4a.objects.collections.Map _param) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Sub Colocar_cero (param As Map)";
 //BA.debugLineNum = 230;BA.debugLine="Log(\"colococero desde js\")";
__c.LogImpl("25898241","colococero desde js",0);
 //BA.debugLineNum = 231;BA.debugLine="Main.porcentaje=\"\"";
_main._porcentaje /*String*/  = "";
 //BA.debugLineNum = 232;BA.debugLine="enviarporcentaje(0)";
_enviarporcentaje(BA.NumberToString(0));
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public String  _device_message(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Device_Message(Params As Map)";
 //BA.debugLineNum = 69;BA.debugLine="Log(\"Device message: \" & Params.Get(\"message\"))";
__c.LogImpl("25373953","Device message: "+BA.ObjectToString(_params.Get((Object)("message"))),0);
 //BA.debugLineNum = 71;BA.debugLine="Main.msj=Params";
_main._msj /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public void  _enviar_sessionid(anywheresoftware.b4a.objects.collections.Map _param) throws Exception{
ResumableSub_Enviar_sessionid rsub = new ResumableSub_Enviar_sessionid(this,_param);
rsub.resume(ba, null);
}
public static class ResumableSub_Enviar_sessionid extends BA.ResumableSub {
public ResumableSub_Enviar_sessionid(b4j.smartscan.hn parent,anywheresoftware.b4a.objects.collections.Map _param) {
this.parent = parent;
this._param = _param;
}
b4j.smartscan.hn parent;
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
 //BA.debugLineNum = 190;BA.debugLine="Log(\"devulvo\")";
parent.__c.LogImpl("25701634","devulvo",0);
 //BA.debugLineNum = 194;BA.debugLine="Dim j As HttpJob";
_j = new b4j.smartscan.httpjob();
 //BA.debugLineNum = 195;BA.debugLine="Dim URL As String = \"http://10.125.15.164/upload/";
_url = "http://10.125.15.164/upload/v2/";
 //BA.debugLineNum = 197;BA.debugLine="Dim P As String= \"session=\"&ws.Session.Id";
_p = "session="+parent._ws.getSession().getId();
 //BA.debugLineNum = 198;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 199;BA.debugLine="j.PostString(URL,P)";
_j._poststring /*String*/ (_url,_p);
 //BA.debugLineNum = 201;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.smartscan.httpjob) result[0];
;
 //BA.debugLineNum = 202;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 203;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("25701647",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 204;BA.debugLine="Log(\"mensaje enviado\")";
parent.__c.LogImpl("25701648","mensaje enviado",0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 206;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 208;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
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
public ResumableSub_enviarAI(b4j.smartscan.hn parent,String _message) {
this.parent = parent;
this._message = _message;
}
b4j.smartscan.hn parent;
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
 //BA.debugLineNum = 409;BA.debugLine="Dim strAPIurl As String =\"https://generativelangu";
_strapiurl = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=AIzaSyAAlU6UEaSo0NcGFZWC_q2uZOh8uBuQSt0";
 //BA.debugLineNum = 410;BA.debugLine="Log(strAPIurl)";
parent.__c.LogImpl("26553602",_strapiurl,0);
 //BA.debugLineNum = 413;BA.debugLine="Dim partsMap As Map";
_partsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 414;BA.debugLine="partsMap.Initialize";
_partsmap.Initialize();
 //BA.debugLineNum = 415;BA.debugLine="partsMap.Put(\"text\", $\" del siguiente bloque de t";
_partsmap.Put((Object)("text"),(Object)((" del siguiente bloque de texto necesito que me identifiques y ordenes los siguientes valores MOTOR, PLACA, AÑO, COLOR, CHASIS algunos ejemplos\n"+"	 de motor son los siguientes (45386047, YD25776714P, MGC20597, CE7AN29R9052) algunos ejemplos de numeros de placa son los siguientes (TEA7853, HED8025, HDA4779)\n"+"	  el año siempre toma el que no encuetres bajo el texto año sino el siguiente el color pueden ser dos ejemplo AZUL-BLANCO o tambien puede ser solo uno ejemplo AZUL\n"+"	   toma en cuenta que el numero del motor siempre tendra menos o igual tamaño de caracteres que el numero del chasis favor limita la respuesta unicamente a los datos\n"+"	    en una lista ordenada  en el formato Motor: CE7AN29R9052\\nPlaca: XXX1234\\nAño: 2022\\nColor: AZUL-BLANCO\\nChasis: MD637AE74N2AB1025 \\n el parametro el valor o numero \n"+"		luego en el siguiente espacio el numero de placa y asi con los datos solicitados recuerda unicamente Motor,Placa,Año,Color y Chasis no mas datos. agunos ejmeplos \n"+"		de chasis son los siguientes (1FV6HLAA7VL714763, 3N6CD33B2ZK463860, JTEBR3FJ60K277588): "+parent.__c.SmartStringFormatter("",(Object)(_message))+" ")));
 //BA.debugLineNum = 424;BA.debugLine="Dim partsList As List";
_partslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 425;BA.debugLine="partsList.Initialize";
_partslist.Initialize();
 //BA.debugLineNum = 426;BA.debugLine="partsList.Add(partsMap)";
_partslist.Add((Object)(_partsmap.getObject()));
 //BA.debugLineNum = 429;BA.debugLine="Dim contentsMap As Map";
_contentsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 430;BA.debugLine="contentsMap.Initialize";
_contentsmap.Initialize();
 //BA.debugLineNum = 431;BA.debugLine="contentsMap.Put(\"parts\", partsList)";
_contentsmap.Put((Object)("parts"),(Object)(_partslist.getObject()));
 //BA.debugLineNum = 434;BA.debugLine="Dim contentsList As List";
_contentslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 435;BA.debugLine="contentsList.Initialize";
_contentslist.Initialize();
 //BA.debugLineNum = 436;BA.debugLine="contentsList.Add(contentsMap)";
_contentslist.Add((Object)(_contentsmap.getObject()));
 //BA.debugLineNum = 439;BA.debugLine="Dim finalMap As Map";
_finalmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 440;BA.debugLine="finalMap.Initialize";
_finalmap.Initialize();
 //BA.debugLineNum = 441;BA.debugLine="finalMap.Put(\"contents\", contentsList)";
_finalmap.Put((Object)("contents"),(Object)(_contentslist.getObject()));
 //BA.debugLineNum = 444;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 445;BA.debugLine="JSONGenerator.Initialize(finalMap)";
_jsongenerator.Initialize(_finalmap);
 //BA.debugLineNum = 447;BA.debugLine="Log(JSONGenerator.ToString)";
parent.__c.LogImpl("26553639",_jsongenerator.ToString(),0);
 //BA.debugLineNum = 449;BA.debugLine="Dim strPayload As String = JSONGenerator.ToString";
_strpayload = _jsongenerator.ToString();
 //BA.debugLineNum = 451;BA.debugLine="Dim j As HttpJob";
_j = new b4j.smartscan.httpjob();
 //BA.debugLineNum = 452;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 453;BA.debugLine="J.PostString(strAPIurl,strPayload)";
_j._poststring /*String*/ (_strapiurl,_strpayload);
 //BA.debugLineNum = 454;BA.debugLine="J.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 456;BA.debugLine="Wait For (J) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_j = (b4j.smartscan.httpjob) result[0];
;
 //BA.debugLineNum = 457;BA.debugLine="If J.Success Then";
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
 //BA.debugLineNum = 459;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 460;BA.debugLine="parser.Initialize(J.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 461;BA.debugLine="Dim jRoot As Map";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 462;BA.debugLine="jRoot.Initialize";
_jroot.Initialize();
 //BA.debugLineNum = 463;BA.debugLine="jRoot = parser.NextObject";
_jroot = _parser.NextObject();
 //BA.debugLineNum = 464;BA.debugLine="Dim candidates As List";
_candidates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 465;BA.debugLine="candidates.Initialize";
_candidates.Initialize();
 //BA.debugLineNum = 466;BA.debugLine="candidates= jRoot.Get(\"candidates\")";
_candidates = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jroot.Get((Object)("candidates"))));
 //BA.debugLineNum = 467;BA.debugLine="Dim colcandidates As Map";
_colcandidates = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 468;BA.debugLine="colcandidates.Initialize";
_colcandidates.Initialize();
 //BA.debugLineNum = 469;BA.debugLine="For Each colcandidates As Map In candidates";
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
 //BA.debugLineNum = 470;BA.debugLine="Dim finishReason As String = colcandidates.Get(";
_finishreason = BA.ObjectToString(_colcandidates.Get((Object)("finishReason")));
 //BA.debugLineNum = 471;BA.debugLine="Dim index As Int = colcandidates.Get(\"index\")";
_index = (int)(BA.ObjectToNumber(_colcandidates.Get((Object)("index"))));
 //BA.debugLineNum = 472;BA.debugLine="Dim safetyRatings As List";
_safetyratings = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 473;BA.debugLine="safetyRatings.Initialize";
_safetyratings.Initialize();
 //BA.debugLineNum = 474;BA.debugLine="safetyRatings = colcandidates.Get(\"safetyRating";
_safetyratings = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colcandidates.Get((Object)("safetyRatings"))));
 //BA.debugLineNum = 475;BA.debugLine="Dim colsafetyRatings As Map";
_colsafetyratings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 476;BA.debugLine="colsafetyRatings.Initialize";
_colsafetyratings.Initialize();
 //BA.debugLineNum = 477;BA.debugLine="For Each colsafetyRatings As Map In safetyRatin";
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
 //BA.debugLineNum = 478;BA.debugLine="Dim probability As String = colsafetyRatings.G";
_probability = BA.ObjectToString(_colsafetyratings.Get((Object)("probability")));
 //BA.debugLineNum = 479;BA.debugLine="Dim category As String = colsafetyRatings.Get(";
_category = BA.ObjectToString(_colsafetyratings.Get((Object)("category")));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 481;BA.debugLine="Dim content As Map";
_content = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 482;BA.debugLine="content.Initialize";
_content.Initialize();
 //BA.debugLineNum = 483;BA.debugLine="content = colcandidates.Get(\"content\")";
_content = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colcandidates.Get((Object)("content"))));
 //BA.debugLineNum = 484;BA.debugLine="Dim role As String = content.Get(\"role\")";
_role = BA.ObjectToString(_content.Get((Object)("role")));
 //BA.debugLineNum = 485;BA.debugLine="Dim parts As List = content.Get(\"parts\")";
_parts = new anywheresoftware.b4a.objects.collections.List();
_parts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_content.Get((Object)("parts"))));
 //BA.debugLineNum = 487;BA.debugLine="partes=parts";
parent._partes = _parts;
 //BA.debugLineNum = 488;BA.debugLine="Dim colparts As Map";
_colparts = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 489;BA.debugLine="colparts.Initialize";
_colparts.Initialize();
 //BA.debugLineNum = 490;BA.debugLine="For Each colparts As Map In parts";
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
 //BA.debugLineNum = 491;BA.debugLine="Dim text As String = colparts.Get(\"text\")";
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
 //BA.debugLineNum = 496;BA.debugLine="Dim usageMetadata As Map";
_usagemetadata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 497;BA.debugLine="usageMetadata.Initialize";
_usagemetadata.Initialize();
 //BA.debugLineNum = 498;BA.debugLine="usageMetadata = jRoot.Get(\"usageMetadata\")";
_usagemetadata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("usageMetadata"))));
 //BA.debugLineNum = 499;BA.debugLine="Dim candidatesTokenCount As Int = usageMetadata.";
_candidatestokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("candidatesTokenCount"))));
 //BA.debugLineNum = 500;BA.debugLine="Dim totalTokenCount As Int = usageMetadata.Get(\"";
_totaltokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("totalTokenCount"))));
 //BA.debugLineNum = 501;BA.debugLine="Dim promptTokenCount As Int = usageMetadata.Get(";
_prompttokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("promptTokenCount"))));
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 507;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 508;BA.debugLine="parser.Initialize(J.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 509;BA.debugLine="Dim jRoot As Map";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 510;BA.debugLine="jRoot.Initialize";
_jroot.Initialize();
 //BA.debugLineNum = 511;BA.debugLine="jRoot = parser.NextObject";
_jroot = _parser.NextObject();
 //BA.debugLineNum = 512;BA.debugLine="Dim error As Map";
_error = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 513;BA.debugLine="error.Initialize";
_error.Initialize();
 //BA.debugLineNum = 514;BA.debugLine="error = jRoot.Get(\"error\")";
_error = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("error"))));
 //BA.debugLineNum = 515;BA.debugLine="Dim code As Int = error.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_error.Get((Object)("code"))));
 //BA.debugLineNum = 516;BA.debugLine="Dim message As String = error.Get(\"message\")";
_message = BA.ObjectToString(_error.Get((Object)("message")));
 //BA.debugLineNum = 517;BA.debugLine="Dim status As String = error.Get(\"status\")";
parent._status = BA.ObjectToString(_error.Get((Object)("status")));
 //BA.debugLineNum = 518;BA.debugLine="Log(message)";
parent.__c.LogImpl("26553710",_message,0);
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 521;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 523;BA.debugLine="Log(partes)";
parent.__c.LogImpl("26553715",BA.ObjectToString(parent._partes),0);
 //BA.debugLineNum = 526;BA.debugLine="ProcessList(partes)";
parent._processlist(parent._partes);
 //BA.debugLineNum = 529;BA.debugLine="End Sub";
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
public ResumableSub_enviarAINombre(b4j.smartscan.hn parent,String _message) {
this.parent = parent;
this._message = _message;
}
b4j.smartscan.hn parent;
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
 //BA.debugLineNum = 534;BA.debugLine="Dim strAPIurl As String =\"https://generativelangu";
_strapiurl = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=AIzaSyAAlU6UEaSo0NcGFZWC_q2uZOh8uBuQSt0";
 //BA.debugLineNum = 535;BA.debugLine="Log(strAPIurl)";
parent.__c.LogImpl("26619138",_strapiurl,0);
 //BA.debugLineNum = 538;BA.debugLine="Dim partsMap As Map";
_partsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 539;BA.debugLine="partsMap.Initialize";
_partsmap.Initialize();
 //BA.debugLineNum = 540;BA.debugLine="partsMap.Put(\"text\", $\" del siguiente bloque de t";
_partsmap.Put((Object)("text"),(Object)((" del siguiente bloque de texto necesito que me identifiques y ordenes los siguientes valores Nombre, Numero de identificacion y fecha de nacimiento el nombre puedes encontrarlo \n"+"	como uno o dos nombre como ejemplo JUAN MANUEL por favor concatena con el apellido que puedes encontrarlo como ejemplo como LOPEZ GONZALEZcla fecha de nacimiento esta en el formato dia-mes-año limita la respuesta unicamente a los datos\n"+"	en una lista ordenada  en el formato Nombre: JUAN MANUEL LOPEZ GONZALEZ\\Identidad: 0801199012345\\Fecha: 10-03-1990\\n\n"+"	recuerda unicamente Nombre concatenado con el apellido y Numero de identidad no mas datos.: "+parent.__c.SmartStringFormatter("",(Object)(_message))+" ")));
 //BA.debugLineNum = 546;BA.debugLine="Dim partsList As List";
_partslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 547;BA.debugLine="partsList.Initialize";
_partslist.Initialize();
 //BA.debugLineNum = 548;BA.debugLine="partsList.Add(partsMap)";
_partslist.Add((Object)(_partsmap.getObject()));
 //BA.debugLineNum = 551;BA.debugLine="Dim contentsMap As Map";
_contentsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 552;BA.debugLine="contentsMap.Initialize";
_contentsmap.Initialize();
 //BA.debugLineNum = 553;BA.debugLine="contentsMap.Put(\"parts\", partsList)";
_contentsmap.Put((Object)("parts"),(Object)(_partslist.getObject()));
 //BA.debugLineNum = 556;BA.debugLine="Dim contentsList As List";
_contentslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 557;BA.debugLine="contentsList.Initialize";
_contentslist.Initialize();
 //BA.debugLineNum = 558;BA.debugLine="contentsList.Add(contentsMap)";
_contentslist.Add((Object)(_contentsmap.getObject()));
 //BA.debugLineNum = 561;BA.debugLine="Dim finalMap As Map";
_finalmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 562;BA.debugLine="finalMap.Initialize";
_finalmap.Initialize();
 //BA.debugLineNum = 563;BA.debugLine="finalMap.Put(\"contents\", contentsList)";
_finalmap.Put((Object)("contents"),(Object)(_contentslist.getObject()));
 //BA.debugLineNum = 566;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 567;BA.debugLine="JSONGenerator.Initialize(finalMap)";
_jsongenerator.Initialize(_finalmap);
 //BA.debugLineNum = 569;BA.debugLine="Log(JSONGenerator.ToString)";
parent.__c.LogImpl("26619172",_jsongenerator.ToString(),0);
 //BA.debugLineNum = 571;BA.debugLine="Dim strPayload As String = JSONGenerator.ToString";
_strpayload = _jsongenerator.ToString();
 //BA.debugLineNum = 573;BA.debugLine="Dim j As HttpJob";
_j = new b4j.smartscan.httpjob();
 //BA.debugLineNum = 574;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 575;BA.debugLine="J.PostString(strAPIurl,strPayload)";
_j._poststring /*String*/ (_strapiurl,_strpayload);
 //BA.debugLineNum = 576;BA.debugLine="J.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 578;BA.debugLine="Wait For (J) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_j = (b4j.smartscan.httpjob) result[0];
;
 //BA.debugLineNum = 579;BA.debugLine="If J.Success Then";
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
 //BA.debugLineNum = 581;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 582;BA.debugLine="parser.Initialize(J.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 583;BA.debugLine="Dim jRoot As Map";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 584;BA.debugLine="jRoot.Initialize";
_jroot.Initialize();
 //BA.debugLineNum = 585;BA.debugLine="jRoot = parser.NextObject";
_jroot = _parser.NextObject();
 //BA.debugLineNum = 586;BA.debugLine="Dim candidates As List";
_candidates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 587;BA.debugLine="candidates.Initialize";
_candidates.Initialize();
 //BA.debugLineNum = 588;BA.debugLine="candidates= jRoot.Get(\"candidates\")";
_candidates = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jroot.Get((Object)("candidates"))));
 //BA.debugLineNum = 589;BA.debugLine="Dim colcandidates As Map";
_colcandidates = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 590;BA.debugLine="colcandidates.Initialize";
_colcandidates.Initialize();
 //BA.debugLineNum = 591;BA.debugLine="For Each colcandidates As Map In candidates";
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
 //BA.debugLineNum = 592;BA.debugLine="Dim finishReason As String = colcandidates.Get(";
_finishreason = BA.ObjectToString(_colcandidates.Get((Object)("finishReason")));
 //BA.debugLineNum = 593;BA.debugLine="Dim index As Int = colcandidates.Get(\"index\")";
_index = (int)(BA.ObjectToNumber(_colcandidates.Get((Object)("index"))));
 //BA.debugLineNum = 594;BA.debugLine="Dim safetyRatings As List";
_safetyratings = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 595;BA.debugLine="safetyRatings.Initialize";
_safetyratings.Initialize();
 //BA.debugLineNum = 596;BA.debugLine="safetyRatings = colcandidates.Get(\"safetyRating";
_safetyratings = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colcandidates.Get((Object)("safetyRatings"))));
 //BA.debugLineNum = 597;BA.debugLine="Dim colsafetyRatings As Map";
_colsafetyratings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 598;BA.debugLine="colsafetyRatings.Initialize";
_colsafetyratings.Initialize();
 //BA.debugLineNum = 599;BA.debugLine="For Each colsafetyRatings As Map In safetyRatin";
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
 //BA.debugLineNum = 600;BA.debugLine="Dim probability As String = colsafetyRatings.G";
_probability = BA.ObjectToString(_colsafetyratings.Get((Object)("probability")));
 //BA.debugLineNum = 601;BA.debugLine="Dim category As String = colsafetyRatings.Get(";
_category = BA.ObjectToString(_colsafetyratings.Get((Object)("category")));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 603;BA.debugLine="Dim content As Map";
_content = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 604;BA.debugLine="content.Initialize";
_content.Initialize();
 //BA.debugLineNum = 605;BA.debugLine="content = colcandidates.Get(\"content\")";
_content = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colcandidates.Get((Object)("content"))));
 //BA.debugLineNum = 606;BA.debugLine="Dim role As String = content.Get(\"role\")";
_role = BA.ObjectToString(_content.Get((Object)("role")));
 //BA.debugLineNum = 607;BA.debugLine="Dim parts As List = content.Get(\"parts\")";
_parts = new anywheresoftware.b4a.objects.collections.List();
_parts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_content.Get((Object)("parts"))));
 //BA.debugLineNum = 609;BA.debugLine="partes=parts";
parent._partes = _parts;
 //BA.debugLineNum = 610;BA.debugLine="Dim colparts As Map";
_colparts = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 611;BA.debugLine="colparts.Initialize";
_colparts.Initialize();
 //BA.debugLineNum = 612;BA.debugLine="For Each colparts As Map In parts";
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
 //BA.debugLineNum = 613;BA.debugLine="Dim text As String = colparts.Get(\"text\")";
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
 //BA.debugLineNum = 618;BA.debugLine="Dim usageMetadata As Map";
_usagemetadata = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 619;BA.debugLine="usageMetadata.Initialize";
_usagemetadata.Initialize();
 //BA.debugLineNum = 620;BA.debugLine="usageMetadata = jRoot.Get(\"usageMetadata\")";
_usagemetadata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("usageMetadata"))));
 //BA.debugLineNum = 621;BA.debugLine="Dim candidatesTokenCount As Int = usageMetadata.";
_candidatestokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("candidatesTokenCount"))));
 //BA.debugLineNum = 622;BA.debugLine="Dim totalTokenCount As Int = usageMetadata.Get(\"";
_totaltokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("totalTokenCount"))));
 //BA.debugLineNum = 623;BA.debugLine="Dim promptTokenCount As Int = usageMetadata.Get(";
_prompttokencount = (int)(BA.ObjectToNumber(_usagemetadata.Get((Object)("promptTokenCount"))));
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 629;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 630;BA.debugLine="parser.Initialize(J.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 631;BA.debugLine="Dim jRoot As Map";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 632;BA.debugLine="jRoot.Initialize";
_jroot.Initialize();
 //BA.debugLineNum = 633;BA.debugLine="jRoot = parser.NextObject";
_jroot = _parser.NextObject();
 //BA.debugLineNum = 634;BA.debugLine="Dim error As Map";
_error = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 635;BA.debugLine="error.Initialize";
_error.Initialize();
 //BA.debugLineNum = 636;BA.debugLine="error = jRoot.Get(\"error\")";
_error = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_jroot.Get((Object)("error"))));
 //BA.debugLineNum = 637;BA.debugLine="Dim code As Int = error.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_error.Get((Object)("code"))));
 //BA.debugLineNum = 638;BA.debugLine="Dim message As String = error.Get(\"message\")";
_message = BA.ObjectToString(_error.Get((Object)("message")));
 //BA.debugLineNum = 639;BA.debugLine="Dim status As String = error.Get(\"status\")";
parent._status = BA.ObjectToString(_error.Get((Object)("status")));
 //BA.debugLineNum = 640;BA.debugLine="Log(message)";
parent.__c.LogImpl("26619243",_message,0);
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 643;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 645;BA.debugLine="Log(partes)";
parent.__c.LogImpl("26619248",BA.ObjectToString(parent._partes),0);
 //BA.debugLineNum = 647;BA.debugLine="ProcessListNombre(partes)";
parent._processlistnombre(parent._partes);
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _enviarporcentaje(String _algo) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Public Sub enviarporcentaje (algo As String)";
 //BA.debugLineNum = 223;BA.debugLine="ws.Eval($\"updateProgress(${algo});\"$,Null)";
_ws.Eval(("updateProgress("+__c.SmartStringFormatter("",(Object)(_algo))+");"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 224;BA.debugLine="ws.Eval(\"location.reload(True);\",Null)";
_ws.Eval("location.reload(True);",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _extractvalue(String _input,String _key,String _nextkey) throws Exception{
int _startindex = 0;
int _endindex = 0;
 //BA.debugLineNum = 325;BA.debugLine="Sub ExtractValue(input As String, key As String, n";
 //BA.debugLineNum = 326;BA.debugLine="Dim startIndex As Int = input.IndexOf(key)";
_startindex = _input.indexOf(_key);
 //BA.debugLineNum = 327;BA.debugLine="If startIndex = -1 Then Return \"\"";
if (_startindex==-1) { 
if (true) return "";};
 //BA.debugLineNum = 329;BA.debugLine="startIndex = startIndex + key.Length";
_startindex = (int) (_startindex+_key.length());
 //BA.debugLineNum = 330;BA.debugLine="Dim endIndex As Int";
_endindex = 0;
 //BA.debugLineNum = 331;BA.debugLine="If nextKey <> \"\" Then";
if ((_nextkey).equals("") == false) { 
 //BA.debugLineNum = 332;BA.debugLine="endIndex = input.IndexOf(nextKey)";
_endindex = _input.indexOf(_nextkey);
 //BA.debugLineNum = 333;BA.debugLine="If endIndex = -1 Then";
if (_endindex==-1) { 
 //BA.debugLineNum = 334;BA.debugLine="endIndex = input.Length";
_endindex = _input.length();
 }else {
 //BA.debugLineNum = 336;BA.debugLine="endIndex = endIndex";
_endindex = _endindex;
 };
 }else {
 //BA.debugLineNum = 339;BA.debugLine="endIndex = input.Length";
_endindex = _input.length();
 };
 //BA.debugLineNum = 342;BA.debugLine="Return input.SubString2(startIndex, endIndex).Tri";
if (true) return _input.substring(_startindex,_endindex).trim();
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public String  _gebd_click(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Private Sub gebd_Click(params As Map)";
 //BA.debugLineNum = 238;BA.debugLine="Main.sql1.BeginTransaction";
_main._sql1 /*anywheresoftware.b4j.objects.SQL*/ .BeginTransaction();
 //BA.debugLineNum = 241;BA.debugLine="Main.sql1.ExecNonQuery2(\"insert into vehiculos va";
_main._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into vehiculos values (?,?,?,?,?,?,?,?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__c.Null,_txtnombre.GetVal().getValue(),_txtidentidad.GetVal().getValue(),_txtmotor.GetVal().getValue(),_txtplaca.GetVal().getValue(),_txtanio.GetVal().getValue(),_txtcolor.GetVal().getValue(),_txtchasis.GetVal().getValue()}));
 //BA.debugLineNum = 244;BA.debugLine="Main.sql1.TransactionSuccessful";
_main._sql1 /*anywheresoftware.b4j.objects.SQL*/ .TransactionSuccessful();
 //BA.debugLineNum = 246;BA.debugLine="mysql.BeginTransaction";
_mysql.BeginTransaction();
 //BA.debugLineNum = 247;BA.debugLine="mysql.ExecNonQuery2(\"insert into InfoDB values (?";
_mysql.ExecNonQuery2("insert into InfoDB values (?,?,?,?,?,?,?,?,?,?) ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__c.Null,_txtnombre.GetVal().getValue(),_txtidentidad.GetVal().getValue(),_txtfecha.GetVal().getValue(),_txtmotor.GetVal().getValue(),_txtplaca.GetVal().getValue(),_txtanio.GetVal().getValue(),_txtcolor.GetVal().getValue(),_txtchasis.GetVal().getValue(),(Object)("HN")}));
 //BA.debugLineNum = 251;BA.debugLine="mysql.TransactionSuccessful";
_mysql.TransactionSuccessful();
 //BA.debugLineNum = 253;BA.debugLine="ws.Eval($\"Swal.fire({    title: 'El registro se h";
_ws.Eval(("Swal.fire({\n"+"   title: 'El registro se ha cargado con éxito',\n"+"   text: 'Documentación enviada.',\n"+"   icon: 'success',\n"+"   showConfirmButton: true\n"+"}).then((result) => {\n"+"   if (result.isConfirmed) {\n"+"     alertify.success('Registro enviado.');\n"+"	 //document.location.replace('index.html');\n"+"   }\n"+"});"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 265;BA.debugLine="ws.Eval(\"deshabilitarBoton()\",Null)";
_ws.Eval("deshabilitarBoton()",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 266;BA.debugLine="txtnombre.SetVal(\"\")";
_txtnombre.SetVal((Object)(""));
 //BA.debugLineNum = 267;BA.debugLine="txtidentidad.SetVal(\"\")";
_txtidentidad.SetVal((Object)(""));
 //BA.debugLineNum = 268;BA.debugLine="txtmotor.SetVal(\"\")";
_txtmotor.SetVal((Object)(""));
 //BA.debugLineNum = 269;BA.debugLine="txtfecha.SetVal(\"\")";
_txtfecha.SetVal((Object)(""));
 //BA.debugLineNum = 270;BA.debugLine="txtplaca.SetVal(\"\")";
_txtplaca.SetVal((Object)(""));
 //BA.debugLineNum = 271;BA.debugLine="txtanio.SetVal(\"\")";
_txtanio.SetVal((Object)(""));
 //BA.debugLineNum = 272;BA.debugLine="txtcolor.SetVal(\"\")";
_txtcolor.SetVal((Object)(""));
 //BA.debugLineNum = 273;BA.debugLine="txtchasis.SetVal(\"\")";
_txtchasis.SetVal((Object)(""));
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 22;BA.debugLine="partes.Initialize";
_partes.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="Main.sql1.InitializeSQLite(File.DirApp & \"/DB\", \"";
_main._sql1 /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__c.File.getDirApp()+"/DB","InfoDBHN.db",__c.False);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _jqm_click(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
String _message = "";
 //BA.debugLineNum = 279;BA.debugLine="Private Sub jqm_Click(params As Map)";
 //BA.debugLineNum = 281;BA.debugLine="Log(Main.msj.Get(txtiddelmovil.GetVal.Value&\"mess";
__c.LogImpl("26029314",BA.ObjectToString(_main._msj /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(BA.ObjectToString(_txtiddelmovil.GetVal().getValue())+"messagehn"))),0);
 //BA.debugLineNum = 282;BA.debugLine="Log(txtiddelmovil.GetVal.Value)";
__c.LogImpl("26029315",BA.ObjectToString(_txtiddelmovil.GetVal().getValue()),0);
 //BA.debugLineNum = 283;BA.debugLine="txtmensaje.SetHtml(\"\")";
_txtmensaje.SetHtml("");
 //BA.debugLineNum = 284;BA.debugLine="Log(\"CLICK\")";
__c.LogImpl("26029317","CLICK",0);
 //BA.debugLineNum = 286;BA.debugLine="txtmensaje.SetText(Main.msj.Get(txtiddelmovil.Get";
_txtmensaje.SetText(BA.ObjectToString(_main._msj /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(BA.ObjectToString(_txtiddelmovil.GetVal().getValue())+"messagehn"))));
 //BA.debugLineNum = 288;BA.debugLine="Dim message As String = Main.msj.Get(txtiddelmovi";
_message = BA.ObjectToString(_main._msj /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(BA.ObjectToString(_txtiddelmovil.GetVal().getValue())+"messagehn")));
 //BA.debugLineNum = 291;BA.debugLine="If message.Contains(\"MOTOR\") Or message.Contains(";
if (_message.contains("MOTOR") || _message.contains("PLACA") || _message.contains("COLOR") || _message.contains("CHASIS")) { 
 //BA.debugLineNum = 292;BA.debugLine="enviarAI(message)";
_enviarai(_message);
 };
 //BA.debugLineNum = 295;BA.debugLine="If message.Contains(\"NOMBRE\") Or message.Contains";
if (_message.contains("NOMBRE") || _message.contains("IDENTIDAD") || _message.contains("FORENAME") || _message.contains("IDENTIFICACION")) { 
 //BA.debugLineNum = 296;BA.debugLine="enviarAINombre(message)";
_enviarainombre(_message);
 };
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public String  _leertesseract() throws Exception{
anywheresoftware.b4j.objects.Shell _sh = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub leertesseract'_Click(Params As Map)";
 //BA.debugLineNum = 78;BA.debugLine="Log(\"click al boton leertesseract\")";
__c.LogImpl("25439489","click al boton leertesseract",0);
 //BA.debugLineNum = 80;BA.debugLine="Dim sh As Shell";
_sh = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 81;BA.debugLine="sh.Initialize(\"sh\",\"tesseract\",Null)";
_sh.Initialize("sh","tesseract",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 82;BA.debugLine="sh.run(10000)";
_sh.Run(ba,(long) (10000));
 //BA.debugLineNum = 83;BA.debugLine="langmap.Initialize";
_langmap.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="langlist.Initialize";
_langlist.Initialize();
 //BA.debugLineNum = 85;BA.debugLine="langlist.Add(\"spa_old\")";
_langlist.Add((Object)("spa_old"));
 //BA.debugLineNum = 86;BA.debugLine="langmap.Put(\"Español\",langlist.Get(0))";
_langmap.Put((Object)("Español"),_langlist.Get((int) (0)));
 //BA.debugLineNum = 87;BA.debugLine="Log(langlist)";
__c.LogImpl("25439498",BA.ObjectToString(_langlist),0);
 //BA.debugLineNum = 88;BA.debugLine="Log(langmap)";
__c.LogImpl("25439499",BA.ObjectToString(_langmap),0);
 //BA.debugLineNum = 89;BA.debugLine="Log(langmap.Get(\"Español\"))";
__c.LogImpl("25439500",BA.ObjectToString(_langmap.Get((Object)("Español"))),0);
 //BA.debugLineNum = 92;BA.debugLine="ProcessImage";
_processimage();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _ocr_finished(String _text,int _processingtime) throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Sub OCR_finished (Text As String,ProcessingTime As";
 //BA.debugLineNum = 356;BA.debugLine="Log(Text)";
__c.LogImpl("26291457",_text,0);
 //BA.debugLineNum = 357;BA.debugLine="Log(ProcessingTime & \" ms\")";
__c.LogImpl("26291458",BA.NumberToString(_processingtime)+" ms",0);
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return "";
}
public String  _ocr_overlay(anywheresoftware.b4a.objects.collections.Map _overlay) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Sub OCR_overlay (Overlay As Map)";
 //BA.debugLineNum = 361;BA.debugLine="Log(Overlay)";
__c.LogImpl("26356993",BA.ObjectToString(_overlay),0);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return "";
}
public String  _processimage() throws Exception{
String _uploadedimagepath = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inp = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 96;BA.debugLine="Sub ProcessImage";
 //BA.debugLineNum = 98;BA.debugLine="If Main.NombreArchivo <> \"\" Then";
if ((_main._nombrearchivo /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 103;BA.debugLine="Try";
try { //BA.debugLineNum = 105;BA.debugLine="Dim uploadedImagePath As String = File.Combine(F";
_uploadedimagepath = __c.File.Combine(__c.File.getDirApp()+"/up","");
 //BA.debugLineNum = 108;BA.debugLine="Log(Main.NombreArchivo)";
__c.LogImpl("25505036",_main._nombrearchivo /*String*/ ,0);
 //BA.debugLineNum = 109;BA.debugLine="Dim Inp As InputStream = File.OpenInput(uploaded";
_inp = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_inp = __c.File.OpenInput(_uploadedimagepath,_main._nombrearchivo /*String*/ );
 //BA.debugLineNum = 112;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.D";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(__c.File.getDirApp()+"/tesseract-ocr","image.png",__c.False);
 //BA.debugLineNum = 115;BA.debugLine="File.Copy2(Inp, out)";
__c.File.Copy2((java.io.InputStream)(_inp.getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 118;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 123;BA.debugLine="scan";
_scan();
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 125;BA.debugLine="Log(LastException)";
__c.LogImpl("25505053",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 301;BA.debugLine="Sub ProcessList(inputList As List)";
 //BA.debugLineNum = 302;BA.debugLine="For Each item As Map In inputList";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _inputlist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));
 //BA.debugLineNum = 303;BA.debugLine="Dim text As String = item.Get(\"text\")";
_text = BA.ObjectToString(_item.Get((Object)("text")));
 //BA.debugLineNum = 306;BA.debugLine="Dim motor As String = ExtractValue(text, \"Motor:";
_motor = _extractvalue(_text,"Motor:","Placa:");
 //BA.debugLineNum = 307;BA.debugLine="Dim placa As String = ExtractValue(text, \"Placa:";
_placa = _extractvalue(_text,"Placa:","Año:");
 //BA.debugLineNum = 308;BA.debugLine="Dim anio As String = ExtractValue(text, \"Año:\",";
_anio = _extractvalue(_text,"Año:","Color:");
 //BA.debugLineNum = 309;BA.debugLine="Dim color As String = ExtractValue(text, \"Color:";
_color = _extractvalue(_text,"Color:","Chasis:");
 //BA.debugLineNum = 310;BA.debugLine="Dim chasis As String = ExtractValue(text, \"Chasi";
_chasis = _extractvalue(_text,"Chasis:","");
 //BA.debugLineNum = 311;BA.debugLine="Log(motor)";
__c.LogImpl("26094858",_motor,0);
 //BA.debugLineNum = 313;BA.debugLine="txtmotor.SetVal(motor)";
_txtmotor.SetVal((Object)(_motor));
 //BA.debugLineNum = 314;BA.debugLine="txtplaca.SetVal(placa)";
_txtplaca.SetVal((Object)(_placa));
 //BA.debugLineNum = 315;BA.debugLine="txtanio.SetVal(anio)";
_txtanio.SetVal((Object)(_anio));
 //BA.debugLineNum = 316;BA.debugLine="txtcolor.SetVal(color)";
_txtcolor.SetVal((Object)(_color));
 //BA.debugLineNum = 317;BA.debugLine="txtchasis.SetVal(chasis)";
_txtchasis.SetVal((Object)(_chasis));
 }
};
 //BA.debugLineNum = 320;BA.debugLine="ws.Eval(\"validarCampos()\",Null)";
_ws.Eval("validarCampos()",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return "";
}
public String  _processlistnombre(anywheresoftware.b4a.objects.collections.List _inputlist) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
String _text = "";
String _nombre = "";
String _identidad = "";
String _fecha = "";
String[] _parts = null;
String _day = "";
String _month = "";
String _year = "";
String _formatteddate = "";
 //BA.debugLineNum = 652;BA.debugLine="Sub ProcessListNombre(inputList As List)";
 //BA.debugLineNum = 653;BA.debugLine="For Each item As Map In inputList";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _inputlist;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));
 //BA.debugLineNum = 654;BA.debugLine="Dim text As String = item.Get(\"text\")";
_text = BA.ObjectToString(_item.Get((Object)("text")));
 //BA.debugLineNum = 657;BA.debugLine="Dim nombre As String = ExtractValue(text, \"Nombr";
_nombre = _extractvalue(_text,"Nombre:","\\Identidad:");
 //BA.debugLineNum = 658;BA.debugLine="Dim identidad As String = ExtractValue(text, \"Id";
_identidad = _extractvalue(_text,"Identidad:","\\Fecha:");
 //BA.debugLineNum = 659;BA.debugLine="Dim fecha As String = ExtractValue(text, \"Fecha:";
_fecha = _extractvalue(_text,"Fecha:","\\n");
 //BA.debugLineNum = 661;BA.debugLine="Log(nombre)";
__c.LogImpl("26684681",_nombre,0);
 //BA.debugLineNum = 663;BA.debugLine="txtnombre.SetVal(nombre)";
_txtnombre.SetVal((Object)(_nombre));
 //BA.debugLineNum = 664;BA.debugLine="txtidentidad.SetVal(identidad)";
_txtidentidad.SetVal((Object)(_identidad));
 //BA.debugLineNum = 668;BA.debugLine="Dim parts() As String = Regex.Split(\"-\", fecha)";
_parts = __c.Regex.Split("-",_fecha);
 //BA.debugLineNum = 669;BA.debugLine="Dim day As String = parts(0)";
_day = _parts[(int) (0)];
 //BA.debugLineNum = 670;BA.debugLine="Dim month As String = parts(1)";
_month = _parts[(int) (1)];
 //BA.debugLineNum = 671;BA.debugLine="Dim year As String = parts(2)";
_year = _parts[(int) (2)];
 //BA.debugLineNum = 674;BA.debugLine="Dim formattedDate As String = year & \"-\" & month";
_formatteddate = _year+"-"+_month+"-"+_day;
 //BA.debugLineNum = 676;BA.debugLine="txtfecha.SetVal(formattedDate)";
_txtfecha.SetVal((Object)(_formatteddate));
 }
};
 //BA.debugLineNum = 680;BA.debugLine="ws.Eval(\"validarCampos()\",Null)";
_ws.Eval("validarCampos()",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 681;BA.debugLine="End Sub";
return "";
}
public String  _scan() throws Exception{
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4j.objects.Shell _sh1 = null;
 //BA.debugLineNum = 132;BA.debugLine="Sub scan";
 //BA.debugLineNum = 133;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 134;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 135;BA.debugLine="args.AddAll(Array As String(\"image.png\",\"output\",";
_args.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"image.png","output","-l",BA.ObjectToString(_langmap.Get((Object)("Español")))}));
 //BA.debugLineNum = 136;BA.debugLine="Dim sh1 As Shell";
_sh1 = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 137;BA.debugLine="tesseractInstalled=True";
_tesseractinstalled = __c.True;
 //BA.debugLineNum = 138;BA.debugLine="If tesseractInstalled Then";
if (_tesseractinstalled) { 
 //BA.debugLineNum = 139;BA.debugLine="sh1.Initialize(\"sh1\",\"tesseract\",args)";
_sh1.Initialize("sh1","tesseract",_args);
 //BA.debugLineNum = 140;BA.debugLine="Log(\"iniciado\")";
__c.LogImpl("25570568","iniciado",0);
 }else {
 //BA.debugLineNum = 142;BA.debugLine="sh1.Initialize(\"sh1\",File.Combine(File.Combine(F";
_sh1.Initialize("sh1",__c.File.Combine(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"tesseract"),_args);
 //BA.debugLineNum = 143;BA.debugLine="Log(File.Combine(File.Combine(File.DirApp,\"tesse";
__c.LogImpl("25570571",__c.File.Combine(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"tesseract"),0);
 };
 //BA.debugLineNum = 145;BA.debugLine="sh1.WorkingDirectory = File.Combine(File.DirApp,\"";
_sh1.setWorkingDirectory(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"));
 //BA.debugLineNum = 146;BA.debugLine="sh1.run(100000)";
_sh1.Run(ba,(long) (100000));
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _sh_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub sh_ProcessCompleted (Success As Boolean, ExitC";
 //BA.debugLineNum = 366;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
 //BA.debugLineNum = 367;BA.debugLine="Log(\"Success\")";
__c.LogImpl("26422530","Success",0);
 //BA.debugLineNum = 368;BA.debugLine="Log(StdOut)";
__c.LogImpl("26422531",_stdout,0);
 //BA.debugLineNum = 369;BA.debugLine="tesseractInstalled=True";
_tesseractinstalled = __c.True;
 //BA.debugLineNum = 370;BA.debugLine="Log(\"Si\")";
__c.LogImpl("26422533","Si",0);
 }else {
 //BA.debugLineNum = 372;BA.debugLine="Log(\"Error: \" & StdErr)";
__c.LogImpl("26422535","Error: "+_stderr,0);
 //BA.debugLineNum = 373;BA.debugLine="tesseractInstalled=False";
_tesseractinstalled = __c.False;
 };
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return "";
}
public String  _sh1_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
String _message = "";
String[] _lines = null;
 //BA.debugLineNum = 377;BA.debugLine="Sub sh1_ProcessCompleted (Success As Boolean, Exit";
 //BA.debugLineNum = 378;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
 //BA.debugLineNum = 379;BA.debugLine="Log(\"Success\")";
__c.LogImpl("26488066","Success",0);
 //BA.debugLineNum = 380;BA.debugLine="Log(StdOut)";
__c.LogImpl("26488067",_stdout,0);
 //BA.debugLineNum = 381;BA.debugLine="txtmensaje.SetText(\"\")";
_txtmensaje.SetText("");
 //BA.debugLineNum = 382;BA.debugLine="txtmensaje.SetHtml(File.ReadString(File.Combine(";
_txtmensaje.SetHtml(__c.File.ReadString(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"output.txt"));
 //BA.debugLineNum = 384;BA.debugLine="Dim message As String = File.ReadString(File.Com";
_message = __c.File.ReadString(__c.File.Combine(__c.File.getDirApp(),"tesseract-ocr"),"output.txt");
 //BA.debugLineNum = 385;BA.debugLine="Log(message)";
__c.LogImpl("26488072",_message,0);
 //BA.debugLineNum = 386;BA.debugLine="Dim lines() As String = Regex.Split(CRLF, messag";
_lines = __c.Regex.Split(__c.CRLF,_message);
 //BA.debugLineNum = 389;BA.debugLine="If message.Contains(\"NOMBRE\") Or message.Contain";
if (_message.contains("NOMBRE") || _message.contains("IDENTIDAD") || _message.contains("FORENAME") || _message.contains("IDENTIFICACION")) { 
 //BA.debugLineNum = 390;BA.debugLine="enviarAINombre(message)";
_enviarainombre(_message);
 };
 //BA.debugLineNum = 393;BA.debugLine="If message.Contains(\"MOTOR\") Or message.Contains";
if (_message.contains("MOTOR") || _message.contains("PLACA") || _message.contains("COLOR") || _message.contains("CHASIS")) { 
 //BA.debugLineNum = 394;BA.debugLine="enviarAI(message)";
_enviarai(_message);
 };
 }else {
 //BA.debugLineNum = 399;BA.debugLine="Log(ExitCode)";
__c.LogImpl("26488086",BA.NumberToString(_exitcode),0);
 //BA.debugLineNum = 400;BA.debugLine="Log(\"Error: \" & StdErr)";
__c.LogImpl("26488087","Error: "+_stderr,0);
 //BA.debugLineNum = 401;BA.debugLine="ws.Alert(\"fallo de reconocimiento\")";
_ws.Alert("fallo de reconocimiento");
 };
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return "";
}
public String  _t_p_tick() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub t_p_Tick";
 //BA.debugLineNum = 59;BA.debugLine="If Main.porcentaje <> \"\" Then";
if ((_main._porcentaje /*String*/ ).equals("") == false) { 
 };
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 153;BA.debugLine="ws.RunFunction(\"ServerTime\", Array As Object(Date";
_ws.RunFunction("ServerTime",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__c.DateTime.Time(__c.DateTime.getNow()))}));
 //BA.debugLineNum = 154;BA.debugLine="ws.Flush";
_ws.Flush();
 //BA.debugLineNum = 155;BA.debugLine="If Main.reload=1 And Main.sessionid.Get(ws.Sessio";
if (_main._reload /*int*/ ==1 && (_main._sessionid /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_ws.getSession().getId()))).equals((Object)(_ws.getSession().getId()))) { 
 //BA.debugLineNum = 157;BA.debugLine="ws.Eval($\"Swal.fire({    title: 'Los documentos";
_ws.Eval(("Swal.fire({\n"+"   title: 'Los documentos se han cargado con éxito',\n"+"   text: 'Documentación enviada.',\n"+"   icon: 'success',\n"+"   showConfirmButton: true\n"+"}).then((result) => {\n"+"   if (result.isConfirmed) {\n"+"     alertify.success('Documentación enviada.');\n"+"	 //document.location.replace('index.html');\n"+"   }\n"+"});"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 168;BA.debugLine="txtmensaje.SetText(\"Convirtiendo...\")";
_txtmensaje.SetText("Convirtiendo...");
 //BA.debugLineNum = 169;BA.debugLine="Colocar_cero(Null)";
_colocar_cero((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__c.Null)));
 //BA.debugLineNum = 173;BA.debugLine="Log(\"subido\")";
__c.LogImpl("25636118","subido",0);
 //BA.debugLineNum = 175;BA.debugLine="leertesseract";
_leertesseract();
 //BA.debugLineNum = 176;BA.debugLine="Main.reload=0";
_main._reload /*int*/  = (int) (0);
 //BA.debugLineNum = 177;BA.debugLine="Main.sessionid.Remove(ws.Session.id)";
_main._sessionid /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_ws.getSession().getId()));
 };
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
 //BA.debugLineNum = 28;BA.debugLine="ws = WebSocket1";
_ws = _websocket1;
 //BA.debugLineNum = 30;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
_timer1.Initialize(ba,"timer1",(long) (1000));
 //BA.debugLineNum = 31;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 32;BA.debugLine="t_p.Initialize(\"t_p\",100)";
_t_p.Initialize(ba,"t_p",(long) (100));
 //BA.debugLineNum = 33;BA.debugLine="t_p.Enabled=True";
_t_p.setEnabled(__c.True);
 //BA.debugLineNum = 34;BA.debugLine="Main.porcentaje=\"\"";
_main._porcentaje /*String*/  = "";
 //BA.debugLineNum = 36;BA.debugLine="Log(ws.Session.Id)";
__c.LogImpl("25242889",_ws.getSession().getId(),0);
 //BA.debugLineNum = 39;BA.debugLine="partes.Initialize";
_partes.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="ws.eval($\"deshabilitarBoton()\"$, Null)";
_ws.Eval(("deshabilitarBoton()"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 42;BA.debugLine="Main.ValidarUsuario(ws,lblusernamemain)";
_main._validarusuario /*String*/ (_ws,_lblusernamemain);
 //BA.debugLineNum = 43;BA.debugLine="lblusernamemain.SetText(ws.Session.GetAttribute(\"";
_lblusernamemain.SetText(BA.ObjectToString(_ws.getSession().GetAttribute("UserName")));
 //BA.debugLineNum = 44;BA.debugLine="ws.Eval($\"validarPais(\"${ws.Session.GetAttribute(";
_ws.Eval(("validarPais(\""+__c.SmartStringFormatter("",_ws.getSession().GetAttribute("Pais"))+"\");"),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 46;BA.debugLine="Log(ws.Session.GetAttribute(\"Pais\"))";
__c.LogImpl("25242899",BA.ObjectToString(_ws.getSession().GetAttribute("Pais")),0);
 //BA.debugLineNum = 48;BA.debugLine="mysql= Main.pool.GetConnection";
_mysql = _main._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected() throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Private Sub WebSocket_Disconnected";
 //BA.debugLineNum = 214;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 215;BA.debugLine="t_p.Enabled=False";
_t_p.setEnabled(__c.False);
 //BA.debugLineNum = 216;BA.debugLine="Log(\"disconnected\")";
__c.LogImpl("25767171","disconnected",0);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
