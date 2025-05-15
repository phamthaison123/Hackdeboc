package i;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: i.w0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0177w0 extends C0171t0 implements InterfaceC0173u0 {

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0173u0 f2944z;

    @Override // i.InterfaceC0173u0
    public final void h(h.o oVar, MenuItem menuItem) {
        InterfaceC0173u0 interfaceC0173u0 = this.f2944z;
        if (interfaceC0173u0 != null) {
            interfaceC0173u0.h(oVar, menuItem);
        }
    }

    @Override // i.InterfaceC0173u0
    public final void m(h.o oVar, h.q qVar) {
        InterfaceC0173u0 interfaceC0173u0 = this.f2944z;
        if (interfaceC0173u0 != null) {
            interfaceC0173u0.m(oVar, qVar);
        }
    }

    @Override // i.C0171t0
    public final C0150i0 q(Context context, boolean z2) {
        C0175v0 c0175v0 = new C0175v0(context, z2);
        c0175v0.setHoverListener(this);
        return c0175v0;
    }
}
