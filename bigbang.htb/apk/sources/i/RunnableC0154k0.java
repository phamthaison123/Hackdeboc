package i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: i.k0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0154k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0156l0 f2817b;

    public /* synthetic */ RunnableC0154k0(AbstractViewOnTouchListenerC0156l0 abstractViewOnTouchListenerC0156l0, int i2) {
        this.f2816a = i2;
        this.f2817b = abstractViewOnTouchListenerC0156l0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f2816a;
        AbstractViewOnTouchListenerC0156l0 abstractViewOnTouchListenerC0156l0 = this.f2817b;
        switch (i2) {
            case 0:
                ViewParent parent = abstractViewOnTouchListenerC0156l0.f2822d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                abstractViewOnTouchListenerC0156l0.a();
                View view = abstractViewOnTouchListenerC0156l0.f2822d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0156l0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0156l0.f2825g = true;
                    break;
                }
                break;
        }
    }
}
