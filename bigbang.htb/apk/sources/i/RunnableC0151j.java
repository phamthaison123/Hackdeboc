package i;

import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.fragment.app.C0066g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import u.AbstractC0226d;

/* renamed from: i.j, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0151j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2810a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2812c;

    public /* synthetic */ RunnableC0151j(int i2, Object obj, Object obj2) {
        this.f2810a = i2;
        this.f2812c = obj;
        this.f2811b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.m mVar;
        Object obj = this.f2811b;
        int i2 = this.f2810a;
        Object obj2 = this.f2812c;
        switch (i2) {
            case 0:
                C0157m c0157m = (C0157m) obj2;
                h.o oVar = c0157m.f2830c;
                if (oVar != null && (mVar = oVar.f2454e) != null) {
                    mVar.a(oVar);
                }
                View view = (View) c0157m.f2835h;
                if (view != null && view.getWindowToken() != null) {
                    C0147h c0147h = (C0147h) obj;
                    if (!c0147h.b()) {
                        if (c0147h.f2523f != null) {
                            c0147h.d(0, 0, false, false);
                        }
                    }
                    c0157m.f2846s = c0147h;
                }
                c0157m.f2848u = null;
                return;
            case 1:
            case 2:
            default:
                ((EditText) obj).removeTextChangedListener(((o0.q) ((o0.b) obj2).f3359b).f3426e);
                return;
            case 3:
                try {
                    Method method = AbstractC0226d.f3721b;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0226d.f3722c.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                ((B.a) obj2).T((Typeface) obj);
                return;
            case 5:
                androidx.fragment.app.Q.b((ArrayList) obj, 4);
                return;
            case 6:
                ((C0066g) obj).b();
                return;
            case 7:
                ((androidx.fragment.app.d0) obj).c();
                return;
            case 8:
                ((EditText) obj).removeTextChangedListener(((o0.e) ((o0.b) obj2).f3359b).f3364e);
                return;
            case 9:
                boolean isPopupShowing = ((AutoCompleteTextView) obj).isPopupShowing();
                o0.h hVar = (o0.h) obj2;
                ((o0.l) hVar.f3375b).g(isPopupShowing);
                ((o0.l) hVar.f3375b).f3385j = isPopupShowing;
                return;
            case 10:
                ((AutoCompleteTextView) obj).removeTextChangedListener(((o0.l) ((o0.b) obj2).f3359b).f3380e);
                return;
        }
    }
}
