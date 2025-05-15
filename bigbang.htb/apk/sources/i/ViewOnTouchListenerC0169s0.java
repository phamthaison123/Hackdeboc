package i;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: i.s0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ViewOnTouchListenerC0169s0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0171t0 f2893a;

    public ViewOnTouchListenerC0169s0(C0171t0 c0171t0) {
        this.f2893a = c0171t0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0129F c0129f;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        C0171t0 c0171t0 = this.f2893a;
        if (action == 0 && (c0129f = c0171t0.f2922y) != null && c0129f.isShowing() && x2 >= 0 && x2 < c0171t0.f2922y.getWidth() && y2 >= 0 && y2 < c0171t0.f2922y.getHeight()) {
            c0171t0.f2918u.postDelayed(c0171t0.f2914q, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0171t0.f2918u.removeCallbacks(c0171t0.f2914q);
        return false;
    }
}
