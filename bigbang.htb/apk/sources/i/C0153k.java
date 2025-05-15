package i;

import android.view.View;

/* renamed from: i.k, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0153k extends AbstractViewOnTouchListenerC0156l0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2813j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2814k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f2815l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0153k(View view, View view2, Object obj, int i2) {
        super(view2);
        this.f2813j = i2;
        this.f2815l = view;
        this.f2814k = obj;
    }

    @Override // i.AbstractViewOnTouchListenerC0156l0
    public final h.F b() {
        switch (this.f2813j) {
            case 0:
                C0147h c0147h = ((C0155l) this.f2815l).f2818d.f2846s;
                if (c0147h == null) {
                    return null;
                }
                return c0147h.a();
            default:
                return (P) this.f2814k;
        }
    }

    @Override // i.AbstractViewOnTouchListenerC0156l0
    public final boolean c() {
        int i2 = this.f2813j;
        View view = this.f2815l;
        switch (i2) {
            case 0:
                ((C0155l) view).f2818d.l();
                break;
            default:
                T t2 = (T) view;
                if (!t2.getInternalPopup().a()) {
                    t2.f2716f.e(t2.getTextDirection(), t2.getTextAlignment());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // i.AbstractViewOnTouchListenerC0156l0
    public final boolean d() {
        switch (this.f2813j) {
            case 0:
                C0157m c0157m = ((C0155l) this.f2815l).f2818d;
                if (c0157m.f2848u == null) {
                    c0157m.f();
                    break;
                }
                break;
            default:
                super.d();
                break;
        }
        return true;
    }
}
