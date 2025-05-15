package h;

import android.view.MenuItem;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class v implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2513b;

    public v(w wVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2513b = wVar;
        this.f2512a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2512a.onMenuItemClick(this.f2513b.m(menuItem));
    }
}
