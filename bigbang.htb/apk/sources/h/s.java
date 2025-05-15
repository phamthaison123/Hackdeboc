package h;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class s extends r implements ActionProvider.VisibilityListener {

    /* renamed from: c, reason: collision with root package name */
    public e.z f2508c;

    @Override // h.r
    public final boolean a() {
        return this.f2506a.isVisible();
    }

    @Override // h.r
    public final View b(MenuItem menuItem) {
        return this.f2506a.onCreateActionView(menuItem);
    }

    @Override // h.r
    public final boolean c() {
        return this.f2506a.overridesItemVisibility();
    }

    @Override // h.r
    public final void d(e.z zVar) {
        this.f2508c = zVar;
        this.f2506a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        e.z zVar = this.f2508c;
        if (zVar != null) {
            o oVar = ((q) zVar.f2221b).f2493n;
            oVar.f2457h = true;
            oVar.p(true);
        }
    }
}
