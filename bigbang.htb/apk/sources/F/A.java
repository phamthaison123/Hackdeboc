package F;

import android.graphics.Rect;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class A {
    public static Rect a(View view) {
        return view.getClipBounds();
    }

    public static boolean b(View view) {
        return view.isInLayout();
    }

    public static void c(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
