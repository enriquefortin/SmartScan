package b4x.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.*;

@Version(1.0f)
//@Permissions(values={"android.permission.INTERNET"})
@ShortName("FirstLib")
//@DependsOn(values={"some java library "})
//@ActivityObject
public class FirstLib {
	public int add(int x, int y) {
		return x + y;
	}
}