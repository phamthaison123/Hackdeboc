package s;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: s.h, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractC0221h {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3710a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3711b = new ThreadLocal();

    public static void a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
