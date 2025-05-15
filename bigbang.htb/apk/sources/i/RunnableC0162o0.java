package i;

import java.util.WeakHashMap;

/* renamed from: i.o0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0162o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0171t0 f2873b;

    public /* synthetic */ RunnableC0162o0(C0171t0 c0171t0, int i2) {
        this.f2872a = i2;
        this.f2873b = c0171t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f2872a;
        C0171t0 c0171t0 = this.f2873b;
        switch (i2) {
            case 1:
                C0150i0 c0150i0 = c0171t0.f2900c;
                if (c0150i0 != null) {
                    c0150i0.setListSelectionHidden(true);
                    c0150i0.requestLayout();
                    break;
                }
                break;
            default:
                C0150i0 c0150i02 = c0171t0.f2900c;
                if (c0150i02 != null) {
                    WeakHashMap weakHashMap = F.O.f58a;
                    if (F.B.b(c0150i02) && c0171t0.f2900c.getCount() > c0171t0.f2900c.getChildCount() && c0171t0.f2900c.getChildCount() <= c0171t0.f2910m) {
                        c0171t0.f2922y.setInputMethodMode(2);
                        c0171t0.i();
                        break;
                    }
                }
                break;
        }
    }
}
