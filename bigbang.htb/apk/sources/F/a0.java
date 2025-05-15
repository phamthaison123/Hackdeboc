package F;

import android.view.WindowInsets;
import y.C0238b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class a0 extends Z {

    /* renamed from: e, reason: collision with root package name */
    public C0238b f78e;

    public a0(f0 f0Var, WindowInsets windowInsets) {
        super(f0Var, windowInsets);
        this.f78e = null;
    }

    @Override // F.e0
    public f0 b() {
        return f0.f(this.f75c.consumeStableInsets(), null);
    }

    @Override // F.e0
    public f0 c() {
        return f0.f(this.f75c.consumeSystemWindowInsets(), null);
    }

    @Override // F.e0
    public final C0238b g() {
        if (this.f78e == null) {
            WindowInsets windowInsets = this.f75c;
            this.f78e = C0238b.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f78e;
    }

    @Override // F.e0
    public boolean j() {
        return this.f75c.isConsumed();
    }
}
