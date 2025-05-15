package h;

import android.view.MenuItem;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class u implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2511b;

    public u(w wVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2511b = wVar;
        this.f2510a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2510a.onMenuItemActionCollapse(this.f2511b.m(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2510a.onMenuItemActionExpand(this.f2511b.m(menuItem));
    }
}
