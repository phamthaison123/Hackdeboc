package F;

import android.view.WindowInsets;
import y.C0238b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class W extends Y {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f74a;

    public W() {
        this.f74a = new WindowInsets.Builder();
    }

    @Override // F.Y
    public f0 b() {
        a();
        f0 f2 = f0.f(this.f74a.build(), null);
        f2.f94a.l(null);
        return f2;
    }

    @Override // F.Y
    public void c(C0238b c0238b) {
        this.f74a.setStableInsets(c0238b.b());
    }

    @Override // F.Y
    public void d(C0238b c0238b) {
        this.f74a.setSystemWindowInsets(c0238b.b());
    }

    public W(f0 f0Var) {
        super(f0Var);
        WindowInsets.Builder builder;
        WindowInsets e2 = f0Var.e();
        if (e2 != null) {
            builder = new WindowInsets.Builder(e2);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f74a = builder;
    }
}
