package i;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: i.l0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractViewOnTouchListenerC0156l0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f2819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2820b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2821c;

    /* renamed from: d, reason: collision with root package name */
    public final View f2822d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0154k0 f2823e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0154k0 f2824f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2825g;

    /* renamed from: h, reason: collision with root package name */
    public int f2826h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2827i = new int[2];

    public AbstractViewOnTouchListenerC0156l0(View view) {
        this.f2822d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2819a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2820b = tapTimeout;
        this.f2821c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0154k0 runnableC0154k0 = this.f2824f;
        View view = this.f2822d;
        if (runnableC0154k0 != null) {
            view.removeCallbacks(runnableC0154k0);
        }
        RunnableC0154k0 runnableC0154k02 = this.f2823e;
        if (runnableC0154k02 != null) {
            view.removeCallbacks(runnableC0154k02);
        }
    }

    public abstract h.F b();

    public abstract boolean c();

    public boolean d() {
        h.F b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.AbstractViewOnTouchListenerC0156l0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2825g = false;
        this.f2826h = -1;
        RunnableC0154k0 runnableC0154k0 = this.f2823e;
        if (runnableC0154k0 != null) {
            this.f2822d.removeCallbacks(runnableC0154k0);
        }
    }
}
