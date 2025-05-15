package f0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f2274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2276c;

    public a(Dialog dialog, Rect rect) {
        this.f2274a = dialog;
        this.f2275b = rect.left;
        this.f2276c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f2275b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f2276c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.f2274a.onTouchEvent(obtain);
    }
}
