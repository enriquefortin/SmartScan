package com.detektor.smartscandtk;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.detektor.smartscandtk", "com.detektor.smartscandtk.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.detektor.smartscandtk", "com.detektor.smartscandtk.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.detektor.smartscandtk.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static com.detektor.smartscandtk.websockethandler _wsh = null;
public textrecognitionwrapper.textrecognitionWrapper _atr1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnconnect = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblservertime = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstatus = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsend = null;
public static int _ramdon_number = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblidapp = null;
public com.detektor.smartscandtk.b4xcombobox _b4xcombobox1 = null;
public static String _conectado = "";
public static String _datamsj = "";
public anywheresoftware.b4a.objects.collections.List _paises = null;
public static String _link = "";
public b4a.example.dateutils _dateutils = null;
public com.detektor.smartscandtk.starter _starter = null;
public com.detektor.smartscandtk.xuiviewsutils _xuiviewsutils = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 112;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 //BA.debugLineNum = 113;BA.debugLine="wsh.Initialize(Me, \"wsh\")";
_wsh._initialize /*String*/ (processBA,main.getObject(),"wsh");
 };
 //BA.debugLineNum = 115;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
 //BA.debugLineNum = 117;BA.debugLine="ramdon_number = Rnd(0,99999)";
_ramdon_number = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (99999));
 //BA.debugLineNum = 118;BA.debugLine="paises.Initialize";
mostCurrent._paises.Initialize();
 //BA.debugLineNum = 119;BA.debugLine="paises.AddAll(Array As String(\"Honduras\",\"El Salv";
mostCurrent._paises.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Honduras","El Salvador","Guatemala","Nicaragua","Costa Rica","Panama","Colombia"}));
 //BA.debugLineNum = 120;BA.debugLine="B4XComboBox1.SetItems(paises)";
mostCurrent._b4xcombobox1._setitems /*String*/ (mostCurrent._paises);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 138;BA.debugLine="UpdateStatus";
_updatestatus();
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public static String  _atr1_text_scanned_blocks(Object _blocks) throws Exception{
anywheresoftware.b4a.objects.collections.List _scannedblocks = null;
int _i = 0;
 //BA.debugLineNum = 175;BA.debugLine="Sub atr1_text_scanned_blocks(Blocks As Object)";
 //BA.debugLineNum = 177;BA.debugLine="Dim scannedBlocks As List = Blocks";
_scannedblocks = new anywheresoftware.b4a.objects.collections.List();
_scannedblocks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_blocks));
 //BA.debugLineNum = 178;BA.debugLine="For i = 0 To scannedBlocks.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_scannedblocks.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 179;BA.debugLine="Log(\"scannedBlocks(\" & i & \") = \" & scannedBlock";
anywheresoftware.b4a.keywords.Common.LogImpl("4720900","scannedBlocks("+BA.NumberToString(_i)+") = "+BA.ObjectToString(_scannedblocks.Get(_i)),0);
 }
};
 //BA.debugLineNum = 181;BA.debugLine="Log(\" \")";
anywheresoftware.b4a.keywords.Common.LogImpl("4720902"," ",0);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public static String  _atr1_text_scanned_lines(Object _lines) throws Exception{
anywheresoftware.b4a.objects.collections.List _scannedlines = null;
int _i = 0;
 //BA.debugLineNum = 185;BA.debugLine="Sub atr1_text_scanned_lines(Lines As Object)";
 //BA.debugLineNum = 186;BA.debugLine="Dim scannedLines As List = Lines";
_scannedlines = new anywheresoftware.b4a.objects.collections.List();
_scannedlines = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_lines));
 //BA.debugLineNum = 187;BA.debugLine="For i = 0 To scannedLines.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_scannedlines.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 188;BA.debugLine="Log(\"scannedLines(\" & i & \") = \" & scannedLines.";
anywheresoftware.b4a.keywords.Common.LogImpl("4786435","scannedLines("+BA.NumberToString(_i)+") = "+BA.ObjectToString(_scannedlines.Get(_i)),0);
 }
};
 //BA.debugLineNum = 190;BA.debugLine="Log(\" \")";
anywheresoftware.b4a.keywords.Common.LogImpl("4786437"," ",0);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public static String  _atr1_text_scanned_words(Object _words) throws Exception{
anywheresoftware.b4a.objects.collections.List _scannedwords = null;
int _i = 0;
 //BA.debugLineNum = 193;BA.debugLine="Sub atr1_text_scanned_words(Words As Object)";
 //BA.debugLineNum = 194;BA.debugLine="Dim scannedWords As List = Words";
_scannedwords = new anywheresoftware.b4a.objects.collections.List();
_scannedwords = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_words));
 //BA.debugLineNum = 195;BA.debugLine="For i = 0 To scannedWords.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_scannedwords.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 196;BA.debugLine="Log(\"scannedWords(\" & i & \") = \" & scannedWords.";
anywheresoftware.b4a.keywords.Common.LogImpl("4851971","scannedWords("+BA.NumberToString(_i)+") = "+BA.ObjectToString(_scannedwords.Get(_i)),0);
 }
};
 //BA.debugLineNum = 198;BA.debugLine="Log(\" \")";
anywheresoftware.b4a.keywords.Common.LogImpl("4851973"," ",0);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public static String  _b4xcombobox1_selectedindexchanged(int _index) throws Exception{
String _paisseleccionado = "";
 //BA.debugLineNum = 53;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
 //BA.debugLineNum = 55;BA.debugLine="Dim PaisSeleccionado As String = B4XComboBox1.Get";
_paisseleccionado = mostCurrent._b4xcombobox1._getitem /*String*/ (_index);
 //BA.debugLineNum = 58;BA.debugLine="Select PaisSeleccionado";
switch (BA.switchObjectToInt(_paisseleccionado,"Honduras","El Salvador","Guatemala","Nicaragua","Costa Rica","Panama","Colombia")) {
case 0: {
 //BA.debugLineNum = 60;BA.debugLine="conectado=\"HN\"";
mostCurrent._conectado = "HN";
 //BA.debugLineNum = 61;BA.debugLine="datamsj=\"hn\"";
mostCurrent._datamsj = "hn";
 //BA.debugLineNum = 62;BA.debugLine="link= \"ws://10.125.15.164/HN\"";
mostCurrent._link = "ws://10.125.15.164/HN";
 //BA.debugLineNum = 63;BA.debugLine="Log(link)";
anywheresoftware.b4a.keywords.Common.LogImpl("4131082",mostCurrent._link,0);
 //BA.debugLineNum = 64;BA.debugLine="wsh.Close";
_wsh._close /*String*/ ();
 //BA.debugLineNum = 65;BA.debugLine="btnConnect.Enabled=True";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 1: {
 //BA.debugLineNum = 67;BA.debugLine="conectado=\"SV\"";
mostCurrent._conectado = "SV";
 //BA.debugLineNum = 68;BA.debugLine="datamsj=\"sv\"";
mostCurrent._datamsj = "sv";
 //BA.debugLineNum = 69;BA.debugLine="link= \"ws://10.125.15.164/SV\"";
mostCurrent._link = "ws://10.125.15.164/SV";
 //BA.debugLineNum = 70;BA.debugLine="Log(link)";
anywheresoftware.b4a.keywords.Common.LogImpl("4131089",mostCurrent._link,0);
 //BA.debugLineNum = 71;BA.debugLine="wsh.Close";
_wsh._close /*String*/ ();
 //BA.debugLineNum = 72;BA.debugLine="btnConnect.Enabled=True";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 2: {
 //BA.debugLineNum = 74;BA.debugLine="conectado=\"GT\"";
mostCurrent._conectado = "GT";
 //BA.debugLineNum = 75;BA.debugLine="datamsj=\"gt\"";
mostCurrent._datamsj = "gt";
 //BA.debugLineNum = 76;BA.debugLine="link= \"ws://10.125.15.164/GT\"";
mostCurrent._link = "ws://10.125.15.164/GT";
 //BA.debugLineNum = 77;BA.debugLine="Log(link)";
anywheresoftware.b4a.keywords.Common.LogImpl("4131096",mostCurrent._link,0);
 //BA.debugLineNum = 78;BA.debugLine="wsh.Close";
_wsh._close /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="btnConnect.Enabled=True";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 3: {
 //BA.debugLineNum = 81;BA.debugLine="conectado=\"NI\"";
mostCurrent._conectado = "NI";
 //BA.debugLineNum = 82;BA.debugLine="datamsj=\"ni\"";
mostCurrent._datamsj = "ni";
 //BA.debugLineNum = 83;BA.debugLine="link= \"ws://10.125.15.164/NI\"";
mostCurrent._link = "ws://10.125.15.164/NI";
 //BA.debugLineNum = 84;BA.debugLine="Log(link)";
anywheresoftware.b4a.keywords.Common.LogImpl("4131103",mostCurrent._link,0);
 //BA.debugLineNum = 85;BA.debugLine="wsh.Close";
_wsh._close /*String*/ ();
 //BA.debugLineNum = 86;BA.debugLine="btnConnect.Enabled=True";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 4: {
 //BA.debugLineNum = 88;BA.debugLine="conectado=\"CR\"";
mostCurrent._conectado = "CR";
 //BA.debugLineNum = 89;BA.debugLine="datamsj=\"cr\"";
mostCurrent._datamsj = "cr";
 //BA.debugLineNum = 90;BA.debugLine="link= \"ws://10.125.15.164/CR\"";
mostCurrent._link = "ws://10.125.15.164/CR";
 //BA.debugLineNum = 91;BA.debugLine="Log(link)";
anywheresoftware.b4a.keywords.Common.LogImpl("4131110",mostCurrent._link,0);
 //BA.debugLineNum = 92;BA.debugLine="wsh.Close";
_wsh._close /*String*/ ();
 //BA.debugLineNum = 93;BA.debugLine="btnConnect.Enabled=True";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 5: {
 //BA.debugLineNum = 95;BA.debugLine="conectado=\"PA\"";
mostCurrent._conectado = "PA";
 //BA.debugLineNum = 96;BA.debugLine="datamsj=\"pa\"";
mostCurrent._datamsj = "pa";
 //BA.debugLineNum = 97;BA.debugLine="link= \"ws://10.125.15.164/PA\"";
mostCurrent._link = "ws://10.125.15.164/PA";
 //BA.debugLineNum = 98;BA.debugLine="Log(link)";
anywheresoftware.b4a.keywords.Common.LogImpl("4131117",mostCurrent._link,0);
 //BA.debugLineNum = 99;BA.debugLine="wsh.Close";
_wsh._close /*String*/ ();
 //BA.debugLineNum = 100;BA.debugLine="btnConnect.Enabled=True";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 6: {
 //BA.debugLineNum = 102;BA.debugLine="conectado=\"CO\"";
mostCurrent._conectado = "CO";
 //BA.debugLineNum = 103;BA.debugLine="datamsj=\"co\"";
mostCurrent._datamsj = "co";
 //BA.debugLineNum = 104;BA.debugLine="link= \"ws://10.125.15.164/CO\"";
mostCurrent._link = "ws://10.125.15.164/CO";
 //BA.debugLineNum = 105;BA.debugLine="Log(link)";
anywheresoftware.b4a.keywords.Common.LogImpl("4131124",mostCurrent._link,0);
 //BA.debugLineNum = 106;BA.debugLine="wsh.Close";
_wsh._close /*String*/ ();
 //BA.debugLineNum = 107;BA.debugLine="btnConnect.Enabled=True";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public static String  _btnconnect_click() throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub btnConnect_Click";
 //BA.debugLineNum = 291;BA.debugLine="wsh.Connect(link)";
_wsh._connect /*String*/ (mostCurrent._link);
 //BA.debugLineNum = 292;BA.debugLine="lblStatus.Text = \"Status: Connecting...\"";
mostCurrent._lblstatus.setText(BA.ObjectToCharSequence("Status: Connecting..."));
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public static void  _button1_click() throws Exception{
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(com.detektor.smartscandtk.main parent) {
this.parent = parent;
}
com.detektor.smartscandtk.main parent;
boolean _result = false;
String _permission = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 163;BA.debugLine="Dim Result As Boolean = True";
_result = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 164;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(parent._rp.Check(parent._rp.PERMISSION_CAMERA))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 165;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 166;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 8;
return;
case 8:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 if (true) break;
;
 //BA.debugLineNum = 168;BA.debugLine="If Result Then";

case 4:
//if
this.state = 7;
if (_result) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 169;BA.debugLine="atr1.startScanning";
parent.mostCurrent._atr1.startScanning();
 //BA.debugLineNum = 170;BA.debugLine="Button4.Enabled=True";
parent.mostCurrent._button4.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _activity_permissionresult(String _permission,boolean _result) throws Exception{
}
public static String  _button2_click() throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Sub Button2_Click";
 //BA.debugLineNum = 228;BA.debugLine="atr1.setFlashOn";
mostCurrent._atr1.setFlashOn();
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Sub Button3_Click";
 //BA.debugLineNum = 234;BA.debugLine="atr1.setFlashOff";
mostCurrent._atr1.setFlashOff();
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _blk = null;
anywheresoftware.b4a.objects.collections.List _lns = null;
anywheresoftware.b4a.objects.collections.List _wrd = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _data = null;
 //BA.debugLineNum = 238;BA.debugLine="Sub Button4_Click";
 //BA.debugLineNum = 239;BA.debugLine="If lblStatus.Text = \"Status: Connected\" Then";
if ((mostCurrent._lblstatus.getText()).equals("Status: Connected")) { 
 //BA.debugLineNum = 240;BA.debugLine="ToastMessageShow(\"Capturado en OCR\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Capturado en OCR"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 244;BA.debugLine="Dim blk As List";
_blk = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 245;BA.debugLine="blk.Initialize";
_blk.Initialize();
 //BA.debugLineNum = 246;BA.debugLine="blk = atr1.TextBlocks              'for blocks";
_blk = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._atr1.getTextBlocks()));
 //BA.debugLineNum = 248;BA.debugLine="Dim lns As List";
_lns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 249;BA.debugLine="lns.Initialize";
_lns.Initialize();
 //BA.debugLineNum = 250;BA.debugLine="lns = atr1.TextLines               'for Lines";
_lns = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._atr1.getTextLines()));
 //BA.debugLineNum = 252;BA.debugLine="Dim wrd As List";
_wrd = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 253;BA.debugLine="wrd.Initialize";
_wrd.Initialize();
 //BA.debugLineNum = 254;BA.debugLine="wrd = atr1.TextWords               'for Words";
_wrd = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._atr1.getTextWords()));
 //BA.debugLineNum = 256;BA.debugLine="If blk.Size > 0 Then";
if (_blk.getSize()>0) { 
 //BA.debugLineNum = 257;BA.debugLine="For i = 0 To blk.Size - 1";
{
final int step13 = 1;
final int limit13 = (int) (_blk.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 258;BA.debugLine="Log(\"block(\" & i & \") = \" & blk.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("41114132","block("+BA.NumberToString(_i)+") = "+BA.ObjectToString(_blk.Get(_i)),0);
 //BA.debugLineNum = 259;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 260;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 262;BA.debugLine="data.Put(ramdon_number&\"message\"&datamsj, blk.";
_data.Put((Object)(BA.NumberToString(_ramdon_number)+"message"+mostCurrent._datamsj),_blk.Get(_i));
 //BA.debugLineNum = 263;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("41114137",BA.ObjectToString(_data),0);
 //BA.debugLineNum = 264;BA.debugLine="wsh.SendEventToServer(\"Device_Message\", data)";
_wsh._sendeventtoserver /*String*/ ("Device_Message",_data);
 //BA.debugLineNum = 267;BA.debugLine="If blk.get(i) = \"3 0282 0780\" Then";
if ((_blk.Get(_i)).equals((Object)("3 0282 0780"))) { 
 //BA.debugLineNum = 268;BA.debugLine="Log(\"GOTCHA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("41114142","GOTCHA",0);
 //BA.debugLineNum = 269;BA.debugLine="atr1.stopScanning";
mostCurrent._atr1.stopScanning();
 //BA.debugLineNum = 271;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 272;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 273;BA.debugLine="data.Put(\"message\", \"block(\" & i & \") = \" & bl";
_data.Put((Object)("message"),(Object)("block("+BA.NumberToString(_i)+") = "+BA.ObjectToString(_blk.Get(_i))));
 //BA.debugLineNum = 274;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("41114148",BA.ObjectToString(_data),0);
 //BA.debugLineNum = 275;BA.debugLine="wsh.SendEventToServer(\"Device_Message\", data)";
_wsh._sendeventtoserver /*String*/ ("Device_Message",_data);
 };
 }
};
 };
 }else {
 //BA.debugLineNum = 283;BA.debugLine="ToastMessageShow(\"Conecte la aplicación al servi";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Conecte la aplicación al servidor"),anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 33;BA.debugLine="Private atr1 As AnroidTextRecognition";
mostCurrent._atr1 = new textrecognitionwrapper.textrecognitionWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Button2 As Button";
mostCurrent._button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Button3 As Button";
mostCurrent._button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Button4 As Button";
mostCurrent._button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private btnConnect As Button";
mostCurrent._btnconnect = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lblServerTime As Label";
mostCurrent._lblservertime = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lblStatus As Label";
mostCurrent._lblstatus = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private btnSend As Button";
mostCurrent._btnsend = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private ramdon_number As Int";
_ramdon_number = 0;
 //BA.debugLineNum = 42;BA.debugLine="Private lblidapp As B4XView";
mostCurrent._lblidapp = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
mostCurrent._b4xcombobox1 = new com.detektor.smartscandtk.b4xcombobox();
 //BA.debugLineNum = 44;BA.debugLine="Private conectado As String = \"HN\"";
mostCurrent._conectado = "HN";
 //BA.debugLineNum = 45;BA.debugLine="Private datamsj As String = \"hn\"";
mostCurrent._datamsj = "hn";
 //BA.debugLineNum = 46;BA.debugLine="Private paises As List";
mostCurrent._paises = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 47;BA.debugLine="Private link As String = \"ws://10.125.15.164/HN\"";
mostCurrent._link = "ws://10.125.15.164/HN";
 //BA.debugLineNum = 48;BA.debugLine="Log(link)";
anywheresoftware.b4a.keywords.Common.LogImpl("465553",mostCurrent._link,0);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
starter._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 21;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 24;BA.debugLine="Private wsh As WebSocketHandler";
_wsh = new com.detektor.smartscandtk.websockethandler();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _t_tick() throws Exception{
anywheresoftware.b4a.objects.collections.List _blk = null;
int _i = 0;
 //BA.debugLineNum = 202;BA.debugLine="Sub t_tick";
 //BA.debugLineNum = 205;BA.debugLine="Dim blk As List = atr1.TextBlocks             'ge";
_blk = new anywheresoftware.b4a.objects.collections.List();
_blk = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._atr1.getTextBlocks()));
 //BA.debugLineNum = 210;BA.debugLine="If blk.Size > 0 Then";
if (_blk.getSize()>0) { 
 //BA.debugLineNum = 211;BA.debugLine="For i = 0 To blk.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_blk.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 212;BA.debugLine="Log(\"block(\" & i & \") = \" & blk.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("4917514","block("+BA.NumberToString(_i)+") = "+BA.ObjectToString(_blk.Get(_i)),0);
 //BA.debugLineNum = 213;BA.debugLine="ToastMessageShow(\"block(\" & i & \") = \" & blk.Ge";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("block("+BA.NumberToString(_i)+") = "+BA.ObjectToString(_blk.Get(_i))),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 214;BA.debugLine="If blk.get(i) = \"3 0282 0780\" Then";
if ((_blk.Get(_i)).equals((Object)("3 0282 0780"))) { 
 //BA.debugLineNum = 215;BA.debugLine="Log(\"GOTCHA\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4917517","GOTCHA",0);
 //BA.debugLineNum = 217;BA.debugLine="atr1.stopScanning                            '";
mostCurrent._atr1.stopScanning();
 };
 }
};
 };
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public static String  _updatestatus() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub UpdateStatus";
 //BA.debugLineNum = 142;BA.debugLine="If wsh.ws.Connected Then";
if (_wsh._ws /*anywheresoftware.b4a.objects.WebSocketWrapper*/ .getConnected()) { 
 //BA.debugLineNum = 143;BA.debugLine="lblStatus.Text = \"Status: Connected\"";
mostCurrent._lblstatus.setText(BA.ObjectToCharSequence("Status: Connected"));
 //BA.debugLineNum = 145;BA.debugLine="lblidapp.Text= ramdon_number";
mostCurrent._lblidapp.setText(BA.ObjectToCharSequence(_ramdon_number));
 }else {
 //BA.debugLineNum = 147;BA.debugLine="lblStatus.Text = \"Status: Disconnected\"";
mostCurrent._lblstatus.setText(BA.ObjectToCharSequence("Status: Disconnected"));
 //BA.debugLineNum = 148;BA.debugLine="lblidapp.Text=\"\"";
mostCurrent._lblidapp.setText(BA.ObjectToCharSequence(""));
 };
 //BA.debugLineNum = 150;BA.debugLine="btnConnect.Enabled = Not(wsh.ws.Connected)";
mostCurrent._btnconnect.setEnabled(anywheresoftware.b4a.keywords.Common.Not(_wsh._ws /*anywheresoftware.b4a.objects.WebSocketWrapper*/ .getConnected()));
 //BA.debugLineNum = 151;BA.debugLine="btnSend.Enabled = wsh.ws.Connected";
mostCurrent._btnsend.setEnabled(_wsh._ws /*anywheresoftware.b4a.objects.WebSocketWrapper*/ .getConnected());
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public static String  _wsh_closed(String _reason) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub wsh_Closed (Reason As String)";
 //BA.debugLineNum = 133;BA.debugLine="UpdateStatus";
_updatestatus();
 //BA.debugLineNum = 134;BA.debugLine="ToastMessageShow(Reason, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_reason),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _wsh_connected() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub wsh_Connected";
 //BA.debugLineNum = 129;BA.debugLine="UpdateStatus";
_updatestatus();
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public static String  _wsh_servertime(anywheresoftware.b4a.objects.collections.List _params) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub wsh_ServerTime(Params As List)";
 //BA.debugLineNum = 125;BA.debugLine="lblServerTime.Text = \"Server Time: \" & Params.Get";
mostCurrent._lblservertime.setText(BA.ObjectToCharSequence("Server Time: "+BA.ObjectToString(_params.Get((int) (0)))));
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
}