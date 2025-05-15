package S;

import F.AbstractC0023y;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: S.d, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0028d {

    /* renamed from: a, reason: collision with root package name */
    public final F f348a;

    /* renamed from: b, reason: collision with root package name */
    public final C0027c f349b = new C0027c();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f350c = new ArrayList();

    public C0028d(F f2) {
        this.f348a = f2;
    }

    public final void a(View view, int i2, boolean z2) {
        F f2 = this.f348a;
        int childCount = i2 < 0 ? f2.f263a.getChildCount() : f(i2);
        this.f349b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        f2.f263a.addView(view, childCount);
        RecyclerView.I(view);
    }

    public final void b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        F f2 = this.f348a;
        int childCount = i2 < 0 ? f2.f263a.getChildCount() : f(i2);
        this.f349b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        f2.getClass();
        f0 I2 = RecyclerView.I(view);
        RecyclerView recyclerView = f2.f263a;
        if (I2 != null) {
            if (!I2.l() && !I2.q()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f376j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i2) {
        f0 I2;
        int f2 = f(i2);
        this.f349b.f(f2);
        RecyclerView recyclerView = this.f348a.f263a;
        View childAt = recyclerView.getChildAt(f2);
        if (childAt != null && (I2 = RecyclerView.I(childAt)) != null) {
            if (I2.l() && !I2.q()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I2 + recyclerView.y());
            }
            I2.b(256);
        }
        recyclerView.detachViewFromParent(f2);
    }

    public final View d(int i2) {
        return this.f348a.f263a.getChildAt(f(i2));
    }

    public final int e() {
        return this.f348a.f263a.getChildCount() - this.f350c.size();
    }

    public final int f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = this.f348a.f263a.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            C0027c c0027c = this.f349b;
            int b2 = i2 - (i3 - c0027c.b(i3));
            if (b2 == 0) {
                while (c0027c.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b2;
        }
        return -1;
    }

    public final View g(int i2) {
        return this.f348a.f263a.getChildAt(i2);
    }

    public final int h() {
        return this.f348a.f263a.getChildCount();
    }

    public final void i(View view) {
        this.f350c.add(view);
        F f2 = this.f348a;
        f2.getClass();
        f0 I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i2 = I2.f383q;
            View view2 = I2.f367a;
            if (i2 != -1) {
                I2.f382p = i2;
            } else {
                WeakHashMap weakHashMap = F.O.f58a;
                I2.f382p = AbstractC0023y.c(view2);
            }
            RecyclerView recyclerView = f2.f263a;
            if (recyclerView.L()) {
                I2.f383q = 4;
                recyclerView.f1578p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = F.O.f58a;
                AbstractC0023y.s(view2, 4);
            }
        }
    }

    public final boolean j(View view) {
        return this.f350c.contains(view);
    }

    public final void k(View view) {
        if (this.f350c.remove(view)) {
            F f2 = this.f348a;
            f2.getClass();
            f0 I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i2 = I2.f382p;
                RecyclerView recyclerView = f2.f263a;
                if (recyclerView.L()) {
                    I2.f383q = i2;
                    recyclerView.f1578p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = F.O.f58a;
                    AbstractC0023y.s(I2.f367a, i2);
                }
                I2.f382p = 0;
            }
        }
    }

    public final String toString() {
        return this.f349b.toString() + ", hidden list:" + this.f350c.size();
    }
}
