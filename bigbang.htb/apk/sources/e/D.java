package e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import g.AbstractC0103c;
import g.C0111k;
import g.InterfaceC0102b;
import i.C0157m;
import java.lang.ref.WeakReference;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class D extends AbstractC0103c implements h.m {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2043c;

    /* renamed from: d, reason: collision with root package name */
    public final h.o f2044d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0102b f2045e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E f2047g;

    public D(E e2, Context context, o oVar) {
        this.f2047g = e2;
        this.f2043c = context;
        this.f2045e = oVar;
        h.o oVar2 = new h.o(context);
        oVar2.f2461l = 1;
        this.f2044d = oVar2;
        oVar2.f2454e = this;
    }

    @Override // h.m
    public final void a(h.o oVar) {
        if (this.f2045e == null) {
            return;
        }
        i();
        C0157m c0157m = this.f2047g.f2055h.f824d;
        if (c0157m != null) {
            c0157m.l();
        }
    }

    @Override // g.AbstractC0103c
    public final void b() {
        E e2 = this.f2047g;
        if (e2.f2058k != this) {
            return;
        }
        if (e2.f2065r) {
            e2.f2059l = this;
            e2.f2060m = this.f2045e;
        } else {
            this.f2045e.b(this);
        }
        this.f2045e = null;
        e2.k0(false);
        ActionBarContextView actionBarContextView = e2.f2055h;
        if (actionBarContextView.f831k == null) {
            actionBarContextView.e();
        }
        e2.f2052e.setHideOnContentScrollEnabled(e2.f2070w);
        e2.f2058k = null;
    }

    @Override // g.AbstractC0103c
    public final View c() {
        WeakReference weakReference = this.f2046f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // h.m
    public final boolean d(h.o oVar, MenuItem menuItem) {
        InterfaceC0102b interfaceC0102b = this.f2045e;
        if (interfaceC0102b != null) {
            return interfaceC0102b.e(this, menuItem);
        }
        return false;
    }

    @Override // g.AbstractC0103c
    public final h.o e() {
        return this.f2044d;
    }

    @Override // g.AbstractC0103c
    public final MenuInflater f() {
        return new C0111k(this.f2043c);
    }

    @Override // g.AbstractC0103c
    public final CharSequence g() {
        return this.f2047g.f2055h.getSubtitle();
    }

    @Override // g.AbstractC0103c
    public final CharSequence h() {
        return this.f2047g.f2055h.getTitle();
    }

    @Override // g.AbstractC0103c
    public final void i() {
        if (this.f2047g.f2058k != this) {
            return;
        }
        h.o oVar = this.f2044d;
        oVar.w();
        try {
            this.f2045e.a(this, oVar);
        } finally {
            oVar.v();
        }
    }

    @Override // g.AbstractC0103c
    public final boolean j() {
        return this.f2047g.f2055h.f839s;
    }

    @Override // g.AbstractC0103c
    public final void k(View view) {
        this.f2047g.f2055h.setCustomView(view);
        this.f2046f = new WeakReference(view);
    }

    @Override // g.AbstractC0103c
    public final void l(int i2) {
        m(this.f2047g.f2050c.getResources().getString(i2));
    }

    @Override // g.AbstractC0103c
    public final void m(CharSequence charSequence) {
        this.f2047g.f2055h.setSubtitle(charSequence);
    }

    @Override // g.AbstractC0103c
    public final void n(int i2) {
        o(this.f2047g.f2050c.getResources().getString(i2));
    }

    @Override // g.AbstractC0103c
    public final void o(CharSequence charSequence) {
        this.f2047g.f2055h.setTitle(charSequence);
    }

    @Override // g.AbstractC0103c
    public final void p(boolean z2) {
        this.f2279b = z2;
        this.f2047g.f2055h.setTitleOptional(z2);
    }
}
