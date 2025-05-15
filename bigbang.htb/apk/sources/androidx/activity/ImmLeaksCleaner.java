package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.m;
import androidx.lifecycle.o;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
final class ImmLeaksCleaner implements m {

    /* renamed from: a, reason: collision with root package name */
    public static int f748a;

    @Override // androidx.lifecycle.m
    public final void b(o oVar, androidx.lifecycle.i iVar) {
        if (iVar != androidx.lifecycle.i.ON_DESTROY) {
            return;
        }
        if (f748a == 0) {
            try {
                f748a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f748a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f748a == 1) {
            throw null;
        }
    }
}
