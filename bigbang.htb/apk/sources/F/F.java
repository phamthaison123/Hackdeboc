package F;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class F {
    public static f0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        f0 f2 = f0.f(rootWindowInsets, null);
        e0 e0Var = f2.f94a;
        e0Var.m(f2);
        e0Var.d(view.getRootView());
        return f2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
