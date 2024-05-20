package jhs.atr.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_layout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Layout/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="atr1.Left = 0%x"[Layout/General script]
views.get("atr1").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="atr1.Top = 0%y"[Layout/General script]
views.get("atr1").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="atr1.width = 100%x"[Layout/General script]
views.get("atr1").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="atr1.Height = 50%y"[Layout/General script]
views.get("atr1").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="Button1.Top = atr1.Bottom + 2%y"[Layout/General script]
views.get("button1").vw.setTop((int)((views.get("atr1").vw.getTop() + views.get("atr1").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 13;BA.debugLine="Button1.Left = 50%x-Button1.Width/2"[Layout/General script]
views.get("button1").vw.setLeft((int)((50d / 100 * width)-(views.get("button1").vw.getWidth())/2d));
//BA.debugLineNum = 15;BA.debugLine="Button2.Left = atr1.Left"[Layout/General script]
views.get("button2").vw.setLeft((int)((views.get("atr1").vw.getLeft())));
//BA.debugLineNum = 16;BA.debugLine="Button2.Top = Button1.Bottom + 2%y"[Layout/General script]
views.get("button2").vw.setTop((int)((views.get("button1").vw.getTop() + views.get("button1").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 20;BA.debugLine="Button3.Left = atr1.Right - Button2.width"[Layout/General script]
views.get("button3").vw.setLeft((int)((views.get("atr1").vw.getLeft() + views.get("atr1").vw.getWidth())-(views.get("button2").vw.getWidth())));
//BA.debugLineNum = 21;BA.debugLine="Button3.Top = Button1.Bottom + 2%y"[Layout/General script]
views.get("button3").vw.setTop((int)((views.get("button1").vw.getTop() + views.get("button1").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 25;BA.debugLine="Button4.Left = Button1.Left"[Layout/General script]
views.get("button4").vw.setLeft((int)((views.get("button1").vw.getLeft())));
//BA.debugLineNum = 26;BA.debugLine="Button4.Top = Button2.Bottom + 2%y"[Layout/General script]
views.get("button4").vw.setTop((int)((views.get("button2").vw.getTop() + views.get("button2").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 27;BA.debugLine="Button4.Width = Button1.Width"[Layout/General script]
views.get("button4").vw.setWidth((int)((views.get("button1").vw.getWidth())));
//BA.debugLineNum = 28;BA.debugLine="Button4.Height = Button1.Height"[Layout/General script]
views.get("button4").vw.setHeight((int)((views.get("button1").vw.getHeight())));
//BA.debugLineNum = 30;BA.debugLine="lblServerTime.Top=100%y-lblServerTime.Height"[Layout/General script]
views.get("lblservertime").vw.setTop((int)((100d / 100 * height)-(views.get("lblservertime").vw.getHeight())));
//BA.debugLineNum = 31;BA.debugLine="lblStatus.Top=100%y-lblServerTime.Height"[Layout/General script]
views.get("lblstatus").vw.setTop((int)((100d / 100 * height)-(views.get("lblservertime").vw.getHeight())));
//BA.debugLineNum = 32;BA.debugLine="btnSend.Top=100%y-lblServerTime.Height-btnConnect.Height"[Layout/General script]
views.get("btnsend").vw.setTop((int)((100d / 100 * height)-(views.get("lblservertime").vw.getHeight())-(views.get("btnconnect").vw.getHeight())));
//BA.debugLineNum = 33;BA.debugLine="btnConnect.Top=100%y-lblServerTime.Height-btnConnect.Height"[Layout/General script]
views.get("btnconnect").vw.setTop((int)((100d / 100 * height)-(views.get("lblservertime").vw.getHeight())-(views.get("btnconnect").vw.getHeight())));

}
}