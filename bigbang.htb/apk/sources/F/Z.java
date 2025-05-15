package F;

import android.view.WindowInsets;
import y.C0238b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class Z extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f75c;

    /* renamed from: d, reason: collision with root package name */
    public C0238b f76d;

    public Z(f0 f0Var, WindowInsets windowInsets) {
        super(f0Var);
        this.f76d = null;
        this.f75c = windowInsets;
    }

    @Override // F.e0
    public final C0238b h() {
        if (this.f76d == null) {
            WindowInsets windowInsets = this.f75c;
            this.f76d = C0238b.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f76d;
    }

    @Override // F.e0
    public boolean k() {
        return this.f75c.isRound();
    }

    @Override // F.e0
    public void l(C0238b[] c0238bArr) {
    }

    @Override // F.e0
    public void m(f0 f0Var) {
    }
}
