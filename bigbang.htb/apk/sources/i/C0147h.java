package i;

import android.content.Context;
import android.view.View;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0147h extends h.z {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2792m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0157m f2793n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147h(C0157m c0157m, Context context, h.o oVar, C0155l c0155l) {
        super(2130968608, 0, context, c0155l, oVar, true);
        this.f2793n = c0157m;
        this.f2524g = 8388613;
        e.z zVar = c0157m.f2850w;
        this.f2526i = zVar;
        h.x xVar = this.f2527j;
        if (xVar != null) {
            xVar.e(zVar);
        }
    }

    @Override // h.z
    public final void c() {
        int i2 = this.f2792m;
        C0157m c0157m = this.f2793n;
        switch (i2) {
            case 0:
                c0157m.f2847t = null;
                super.c();
                break;
            default:
                h.o oVar = c0157m.f2830c;
                if (oVar != null) {
                    oVar.c(true);
                }
                c0157m.f2846s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147h(C0157m c0157m, Context context, h.H h2, View view) {
        super(2130968608, 0, context, view, h2, false);
        this.f2793n = c0157m;
        if (!h2.f2375A.f()) {
            View view2 = c0157m.f2836i;
            this.f2523f = view2 == null ? (View) c0157m.f2835h : view2;
        }
        e.z zVar = c0157m.f2850w;
        this.f2526i = zVar;
        h.x xVar = this.f2527j;
        if (xVar != null) {
            xVar.e(zVar);
        }
    }
}
