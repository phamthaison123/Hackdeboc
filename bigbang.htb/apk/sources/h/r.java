package h;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final ActionProvider f2506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2507b;

    public r(w wVar, ActionProvider actionProvider) {
        this.f2507b = wVar;
        this.f2506a = actionProvider;
    }

    public abstract /* bridge */ /* synthetic */ boolean a();

    public abstract View b(MenuItem menuItem);

    public abstract /* bridge */ /* synthetic */ boolean c();

    public abstract void d(e.z zVar);
}
