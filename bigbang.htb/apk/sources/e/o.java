package e;

import F.O;
import F.T;
import android.view.MenuItem;
import android.view.ViewGroup;
import g.AbstractC0103c;
import g.C0107g;
import g.InterfaceC0102b;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class o implements InterfaceC0102b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0102b f2130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f2131b;

    public o(v vVar, C0107g c0107g) {
        this.f2131b = vVar;
        this.f2130a = c0107g;
    }

    @Override // g.InterfaceC0102b
    public final boolean a(AbstractC0103c abstractC0103c, h.o oVar) {
        ViewGroup viewGroup = this.f2131b.f2204u;
        WeakHashMap weakHashMap = O.f58a;
        F.C.c(viewGroup);
        return this.f2130a.a(abstractC0103c, oVar);
    }

    @Override // g.InterfaceC0102b
    public final void b(AbstractC0103c abstractC0103c) {
        this.f2130a.b(abstractC0103c);
        v vVar = this.f2131b;
        if (vVar.f2199p != null) {
            vVar.f2188e.getDecorView().removeCallbacks(vVar.f2200q);
        }
        if (vVar.f2198o != null) {
            T t2 = vVar.f2201r;
            if (t2 != null) {
                t2.b();
            }
            T a2 = O.a(vVar.f2198o);
            a2.a(0.0f);
            vVar.f2201r = a2;
            a2.d(new n(2, this));
        }
        vVar.f2197n = null;
        ViewGroup viewGroup = vVar.f2204u;
        WeakHashMap weakHashMap = O.f58a;
        F.C.c(viewGroup);
    }

    @Override // g.InterfaceC0102b
    public final boolean c(AbstractC0103c abstractC0103c, h.o oVar) {
        return this.f2130a.c(abstractC0103c, oVar);
    }

    @Override // g.InterfaceC0102b
    public final boolean e(AbstractC0103c abstractC0103c, MenuItem menuItem) {
        return this.f2130a.e(abstractC0103c, menuItem);
    }
}
