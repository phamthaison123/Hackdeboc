package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import h.o;
import i.C0157m;
import java.lang.ref.WeakReference;

/* renamed from: g.f, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0106f extends AbstractC0103c implements h.m {

    /* renamed from: c, reason: collision with root package name */
    public Context f2285c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f2286d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0102b f2287e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f2288f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2289g;

    /* renamed from: h, reason: collision with root package name */
    public o f2290h;

    @Override // h.m
    public final void a(o oVar) {
        i();
        C0157m c0157m = this.f2286d.f824d;
        if (c0157m != null) {
            c0157m.l();
        }
    }

    @Override // g.AbstractC0103c
    public final void b() {
        if (this.f2289g) {
            return;
        }
        this.f2289g = true;
        this.f2287e.b(this);
    }

    @Override // g.AbstractC0103c
    public final View c() {
        WeakReference weakReference = this.f2288f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // h.m
    public final boolean d(o oVar, MenuItem menuItem) {
        return this.f2287e.e(this, menuItem);
    }

    @Override // g.AbstractC0103c
    public final o e() {
        return this.f2290h;
    }

    @Override // g.AbstractC0103c
    public final MenuInflater f() {
        return new C0111k(this.f2286d.getContext());
    }

    @Override // g.AbstractC0103c
    public final CharSequence g() {
        return this.f2286d.getSubtitle();
    }

    @Override // g.AbstractC0103c
    public final CharSequence h() {
        return this.f2286d.getTitle();
    }

    @Override // g.AbstractC0103c
    public final void i() {
        this.f2287e.a(this, this.f2290h);
    }

    @Override // g.AbstractC0103c
    public final boolean j() {
        return this.f2286d.f839s;
    }

    @Override // g.AbstractC0103c
    public final void k(View view) {
        this.f2286d.setCustomView(view);
        this.f2288f = view != null ? new WeakReference(view) : null;
    }

    @Override // g.AbstractC0103c
    public final void l(int i2) {
        m(this.f2285c.getString(i2));
    }

    @Override // g.AbstractC0103c
    public final void m(CharSequence charSequence) {
        this.f2286d.setSubtitle(charSequence);
    }

    @Override // g.AbstractC0103c
    public final void n(int i2) {
        o(this.f2285c.getString(i2));
    }

    @Override // g.AbstractC0103c
    public final void o(CharSequence charSequence) {
        this.f2286d.setTitle(charSequence);
    }

    @Override // g.AbstractC0103c
    public final void p(boolean z2) {
        this.f2279b = z2;
        this.f2286d.setTitleOptional(z2);
    }
}
