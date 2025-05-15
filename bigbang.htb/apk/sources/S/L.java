package S;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public F f270a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f271b;

    /* renamed from: c, reason: collision with root package name */
    public long f272c;

    /* renamed from: d, reason: collision with root package name */
    public long f273d;

    /* renamed from: e, reason: collision with root package name */
    public long f274e;

    /* renamed from: f, reason: collision with root package name */
    public long f275f;

    public static void b(f0 f0Var) {
        RecyclerView recyclerView;
        int i2 = f0Var.f376j;
        if (f0Var.h() || (i2 & 4) != 0 || (recyclerView = f0Var.f384r) == null) {
            return;
        }
        recyclerView.F(f0Var);
    }

    public abstract boolean a(f0 f0Var, f0 f0Var2, K k2, K k3);

    public final void c(f0 f0Var) {
        F f2 = this.f270a;
        if (f2 != null) {
            boolean z2 = true;
            f0Var.p(true);
            if (f0Var.f374h != null && f0Var.f375i == null) {
                f0Var.f374h = null;
            }
            f0Var.f375i = null;
            if ((f0Var.f376j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = f2.f263a;
            recyclerView.c0();
            C0028d c0028d = recyclerView.f1556e;
            F f3 = c0028d.f348a;
            RecyclerView recyclerView2 = f3.f263a;
            View view = f0Var.f367a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0028d.k(view);
            } else {
                C0027c c0027c = c0028d.f349b;
                if (c0027c.d(indexOfChild)) {
                    c0027c.f(indexOfChild);
                    c0028d.k(view);
                    f3.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                f0 I2 = RecyclerView.I(view);
                X x2 = recyclerView.f1550b;
                x2.j(I2);
                x2.g(I2);
            }
            recyclerView.d0(!z2);
            if (z2 || !f0Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(f0 f0Var);

    public abstract void e();

    public abstract boolean f();
}
