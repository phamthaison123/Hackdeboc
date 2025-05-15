package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import h.E;

/* renamed from: g.h, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0108h extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2296a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0103c f2297b;

    public C0108h(Context context, AbstractC0103c abstractC0103c) {
        this.f2296a = context;
        this.f2297b = abstractC0103c;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f2297b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f2297b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new E(this.f2296a, this.f2297b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f2297b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f2297b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f2297b.f2278a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f2297b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f2297b.f2279b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f2297b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f2297b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f2297b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f2297b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f2297b.f2278a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f2297b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f2297b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f2297b.l(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f2297b.n(i2);
    }
}
