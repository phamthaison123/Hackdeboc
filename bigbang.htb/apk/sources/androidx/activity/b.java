package androidx.activity;

import F.AbstractC0023y;
import F.O;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.y;
import com.satellite.bigbang.LoginActivity;
import f.AbstractC0100a;
import i.C0150i0;
import i.C0157m;
import java.util.WeakHashMap;
import u.AsyncTaskC0228f;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f754b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f753a = i2;
        this.f754b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0157m c0157m;
        switch (this.f753a) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                }
            case 1:
                AbstractC0100a abstractC0100a = (AbstractC0100a) this.f754b;
                abstractC0100a.a(true);
                abstractC0100a.invalidateSelf();
                return;
            case 2:
                C0150i0 c0150i0 = (C0150i0) this.f754b;
                c0150i0.f2809m = null;
                c0150i0.drawableStateChanged();
                return;
            case 3:
                ActionMenuView actionMenuView = ((Toolbar) this.f754b).f954a;
                if (actionMenuView == null || (c0157m = actionMenuView.f874t) == null) {
                    return;
                }
                c0157m.l();
                return;
            case 4:
            case 7:
            default:
                Toast.makeText((LoginActivity) ((AsyncTaskC0228f) this.f754b).f3724b, "Error logging in", 0).show();
                return;
            case 5:
                I.c cVar = (I.c) this.f754b;
                if (cVar.f158o) {
                    if (cVar.f156m) {
                        cVar.f156m = false;
                        I.a aVar = cVar.f144a;
                        aVar.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f138e = currentAnimationTimeMillis;
                        aVar.f140g = -1L;
                        aVar.f139f = currentAnimationTimeMillis;
                        aVar.f141h = 0.5f;
                    }
                    I.a aVar2 = cVar.f144a;
                    if ((aVar2.f140g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f140g + aVar2.f142i) || !cVar.f()) {
                        cVar.f158o = false;
                        return;
                    }
                    if (cVar.f157n) {
                        cVar.f157n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        cVar.f146c.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f139f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar2.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar2.f139f;
                    aVar2.f139f = currentAnimationTimeMillis2;
                    cVar.f160q.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar2.f137d));
                    View view = cVar.f146c;
                    WeakHashMap weakHashMap = O.f58a;
                    AbstractC0023y.m(view, this);
                    return;
                }
                return;
            case 6:
                ((L.e) this.f754b).n(0);
                return;
            case 8:
                y yVar = (y) this.f754b;
                if (yVar.f1496b == 0) {
                    yVar.f1497c = true;
                    yVar.f1500f.g(androidx.lifecycle.i.ON_PAUSE);
                }
                if (yVar.f1495a == 0 && yVar.f1497c) {
                    yVar.f1500f.g(androidx.lifecycle.i.ON_STOP);
                    yVar.f1498d = true;
                    return;
                }
                return;
            case 9:
                View view2 = (View) this.f754b;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 1);
                return;
        }
    }
}
