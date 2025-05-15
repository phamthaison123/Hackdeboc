package F;

import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f93b = d0.f84g;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f94a;

    public f0(WindowInsets windowInsets) {
        this.f94a = new d0(this, windowInsets);
    }

    public static f0 f(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        f0 f0Var = new f0(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = O.f58a;
            if (B.b(view)) {
                f0 a2 = F.a(view);
                e0 e0Var = f0Var.f94a;
                e0Var.m(a2);
                e0Var.d(view.getRootView());
            }
        }
        return f0Var;
    }

    public final int a() {
        return this.f94a.h().f3780d;
    }

    public final int b() {
        return this.f94a.h().f3777a;
    }

    public final int c() {
        return this.f94a.h().f3779c;
    }

    public final int d() {
        return this.f94a.h().f3778b;
    }

    public final WindowInsets e() {
        e0 e0Var = this.f94a;
        if (e0Var instanceof Z) {
            return ((Z) e0Var).f75c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        return Objects.equals(this.f94a, ((f0) obj).f94a);
    }

    public final int hashCode() {
        e0 e0Var = this.f94a;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.hashCode();
    }

    public f0() {
        this.f94a = new e0(this);
    }
}
