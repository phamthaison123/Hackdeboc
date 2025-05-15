package S;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f263a;

    public /* synthetic */ F(RecyclerView recyclerView) {
        this.f263a = recyclerView;
    }

    public final void a(C0025a c0025a) {
        int i2 = c0025a.f316a;
        RecyclerView recyclerView = this.f263a;
        if (i2 == 1) {
            recyclerView.f1569l.R(c0025a.f317b, c0025a.f319d);
            return;
        }
        if (i2 == 2) {
            recyclerView.f1569l.U(c0025a.f317b, c0025a.f319d);
        } else if (i2 == 4) {
            recyclerView.f1569l.V(c0025a.f317b, c0025a.f319d);
        } else {
            if (i2 != 8) {
                return;
            }
            recyclerView.f1569l.T(c0025a.f317b, c0025a.f319d);
        }
    }

    public final f0 b(int i2) {
        RecyclerView recyclerView = this.f263a;
        int h2 = recyclerView.f1556e.h();
        int i3 = 0;
        f0 f0Var = null;
        while (true) {
            if (i3 >= h2) {
                break;
            }
            f0 I2 = RecyclerView.I(recyclerView.f1556e.g(i3));
            if (I2 != null && !I2.j() && I2.f369c == i2) {
                if (!recyclerView.f1556e.j(I2.f367a)) {
                    f0Var = I2;
                    break;
                }
                f0Var = I2;
            }
            i3++;
        }
        if (f0Var == null || recyclerView.f1556e.j(f0Var.f367a)) {
            return null;
        }
        return f0Var;
    }

    public final void c(int i2, int i3, Object obj) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.f263a;
        int h2 = recyclerView.f1556e.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = recyclerView.f1556e.g(i7);
            f0 I2 = RecyclerView.I(g2);
            if (I2 != null && !I2.q() && (i5 = I2.f369c) >= i2 && i5 < i6) {
                I2.b(2);
                I2.a(obj);
                ((Q) g2.getLayoutParams()).f299c = true;
            }
        }
        X x2 = recyclerView.f1550b;
        ArrayList arrayList = x2.f309c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) arrayList.get(size);
            if (f0Var != null && (i4 = f0Var.f369c) >= i2 && i4 < i6) {
                f0Var.b(2);
                x2.e(size);
            }
        }
        recyclerView.f1561g0 = true;
    }

    public final void d(int i2, int i3) {
        RecyclerView recyclerView = this.f263a;
        int h2 = recyclerView.f1556e.h();
        for (int i4 = 0; i4 < h2; i4++) {
            f0 I2 = RecyclerView.I(recyclerView.f1556e.g(i4));
            if (I2 != null && !I2.q() && I2.f369c >= i2) {
                I2.n(i3, false);
                recyclerView.f1553c0.f339f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1550b.f309c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            f0 f0Var = (f0) arrayList.get(i5);
            if (f0Var != null && f0Var.f369c >= i2) {
                f0Var.n(i3, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1559f0 = true;
    }

    public final void e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f263a;
        int h2 = recyclerView.f1556e.h();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            f0 I2 = RecyclerView.I(recyclerView.f1556e.g(i12));
            if (I2 != null && (i10 = I2.f369c) >= i5 && i10 <= i4) {
                if (i10 == i2) {
                    I2.n(i3 - i2, false);
                } else {
                    I2.n(i6, false);
                }
                recyclerView.f1553c0.f339f = true;
            }
        }
        X x2 = recyclerView.f1550b;
        x2.getClass();
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        ArrayList arrayList = x2.f309c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            f0 f0Var = (f0) arrayList.get(i13);
            if (f0Var != null && (i9 = f0Var.f369c) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    f0Var.n(i3 - i2, false);
                } else {
                    f0Var.n(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1559f0 = true;
    }

    public final void f(f0 f0Var, K k2, K k3) {
        RecyclerView recyclerView = this.f263a;
        recyclerView.getClass();
        f0Var.p(false);
        C0035k c0035k = (C0035k) recyclerView.f1532H;
        if (k2 != null) {
            c0035k.getClass();
            int i2 = k2.f266a;
            int i3 = k3.f266a;
            if (i2 != i3 || k2.f267b != k3.f267b) {
                if (!c0035k.g(f0Var, i2, k2.f267b, i3, k3.f267b)) {
                    return;
                }
                recyclerView.S();
            }
        }
        c0035k.l(f0Var);
        f0Var.f367a.setAlpha(0.0f);
        c0035k.f423i.add(f0Var);
        recyclerView.S();
    }

    public final void g(f0 f0Var, K k2, K k3) {
        RecyclerView recyclerView = this.f263a;
        recyclerView.f1550b.j(f0Var);
        recyclerView.f(f0Var);
        f0Var.p(false);
        C0035k c0035k = (C0035k) recyclerView.f1532H;
        c0035k.getClass();
        int i2 = k2.f266a;
        int i3 = k2.f267b;
        View view = f0Var.f367a;
        int left = k3 == null ? view.getLeft() : k3.f266a;
        int top = k3 == null ? view.getTop() : k3.f267b;
        if (f0Var.j() || (i2 == left && i3 == top)) {
            c0035k.l(f0Var);
            c0035k.f422h.add(f0Var);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!c0035k.g(f0Var, i2, i3, left, top)) {
                return;
            }
        }
        recyclerView.S();
    }

    public final void h(int i2) {
        RecyclerView recyclerView = this.f263a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }
}
