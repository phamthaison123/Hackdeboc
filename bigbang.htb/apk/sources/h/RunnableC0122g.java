package h;

import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Y;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0122g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2405e;

    public /* synthetic */ RunnableC0122g(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f2401a = i2;
        this.f2405e = obj;
        this.f2402b = obj2;
        this.f2403c = obj3;
        this.f2404d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f2401a;
        Object obj = this.f2404d;
        Object obj2 = this.f2403c;
        Object obj3 = this.f2402b;
        switch (i2) {
            case 0:
                C0123h c0123h = (C0123h) obj3;
                if (c0123h != null) {
                    e.z zVar = (e.z) this.f2405e;
                    ((i) zVar.f2221b).f2409A = true;
                    c0123h.f2407b.c(false);
                    ((i) zVar.f2221b).f2409A = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) obj).q(menuItem, null, 4);
                    break;
                }
                break;
            default:
                ((Y) obj3).getClass();
                Y.g((View) obj2, (Rect) obj);
                break;
        }
    }
}
