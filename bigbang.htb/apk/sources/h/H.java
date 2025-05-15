package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class H extends o implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final q f2375A;

    /* renamed from: z, reason: collision with root package name */
    public final o f2376z;

    public H(Context context, o oVar, q qVar) {
        super(context);
        this.f2376z = oVar;
        this.f2375A = qVar;
    }

    @Override // h.o
    public final boolean d(q qVar) {
        return this.f2376z.d(qVar);
    }

    @Override // h.o
    public final boolean e(o oVar, MenuItem menuItem) {
        return super.e(oVar, menuItem) || this.f2376z.e(oVar, menuItem);
    }

    @Override // h.o
    public final boolean f(q qVar) {
        return this.f2376z.f(qVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2375A;
    }

    @Override // h.o
    public final String j() {
        q qVar = this.f2375A;
        int i2 = qVar != null ? qVar.f2480a : 0;
        if (i2 == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i2;
    }

    @Override // h.o
    public final o k() {
        return this.f2376z.k();
    }

    @Override // h.o
    public final boolean m() {
        return this.f2376z.m();
    }

    @Override // h.o
    public final boolean n() {
        return this.f2376z.n();
    }

    @Override // h.o
    public final boolean o() {
        return this.f2376z.o();
    }

    @Override // h.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2376z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        u(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        u(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2375A.setIcon(drawable);
        return this;
    }

    @Override // h.o, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2376z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f2375A.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }
}
