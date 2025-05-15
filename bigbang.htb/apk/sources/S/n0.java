package S;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f454a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f455b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f456c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f457d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f459f;

    public n0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f459f = staggeredGridLayoutManager;
        this.f458e = i2;
    }

    public final void a() {
        View view = (View) this.f454a.get(r0.size() - 1);
        k0 k0Var = (k0) view.getLayoutParams();
        this.f456c = this.f459f.f1603r.b(view);
        k0Var.getClass();
    }

    public final void b() {
        this.f454a.clear();
        this.f455b = Integer.MIN_VALUE;
        this.f456c = Integer.MIN_VALUE;
        this.f457d = 0;
    }

    public final int c() {
        return this.f459f.f1608w ? e(r1.size() - 1, -1) : e(0, this.f454a.size());
    }

    public final int d() {
        return this.f459f.f1608w ? e(0, this.f454a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f459f;
        int f2 = staggeredGridLayoutManager.f1603r.f();
        int e2 = staggeredGridLayoutManager.f1603r.e();
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View view = (View) this.f454a.get(i2);
            int d2 = staggeredGridLayoutManager.f1603r.d(view);
            int b2 = staggeredGridLayoutManager.f1603r.b(view);
            boolean z2 = d2 <= e2;
            boolean z3 = b2 >= f2;
            if (z2 && z3 && (d2 < f2 || b2 > e2)) {
                return P.D(view);
            }
            i2 += i4;
        }
        return -1;
    }

    public final int f(int i2) {
        int i3 = this.f456c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f454a.size() == 0) {
            return i2;
        }
        a();
        return this.f456c;
    }

    public final View g(int i2, int i3) {
        ArrayList arrayList = this.f454a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f459f;
        View view = null;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1608w && P.D(view2) >= i2) || ((!staggeredGridLayoutManager.f1608w && P.D(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                View view3 = (View) arrayList.get(i4);
                if ((staggeredGridLayoutManager.f1608w && P.D(view3) <= i2) || ((!staggeredGridLayoutManager.f1608w && P.D(view3) >= i2) || !view3.hasFocusable())) {
                    break;
                }
                i4++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i2) {
        int i3 = this.f455b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f454a.size() == 0) {
            return i2;
        }
        View view = (View) this.f454a.get(0);
        k0 k0Var = (k0) view.getLayoutParams();
        this.f455b = this.f459f.f1603r.d(view);
        k0Var.getClass();
        return this.f455b;
    }
}
