package S;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class D extends S {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f258a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f259b = new i0(this);

    /* renamed from: c, reason: collision with root package name */
    public A f260c;

    /* renamed from: d, reason: collision with root package name */
    public A f261d;

    public static int b(View view, B b2) {
        return ((b2.c(view) / 2) + b2.d(view)) - ((b2.g() / 2) + b2.f());
    }

    public static View c(P p2, B b2) {
        int v2 = p2.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int g2 = (b2.g() / 2) + b2.f();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < v2; i3++) {
            View u2 = p2.u(i3);
            int abs = Math.abs(((b2.c(u2) / 2) + b2.d(u2)) - g2);
            if (abs < i2) {
                view = u2;
                i2 = abs;
            }
        }
        return view;
    }

    public final int[] a(P p2, View view) {
        int[] iArr = new int[2];
        if (p2.d()) {
            iArr[0] = b(view, d(p2));
        } else {
            iArr[0] = 0;
        }
        if (p2.e()) {
            iArr[1] = b(view, e(p2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final B d(P p2) {
        A a2 = this.f261d;
        if (a2 == null || a2.f253a != p2) {
            this.f261d = new A(p2, 0);
        }
        return this.f261d;
    }

    public final B e(P p2) {
        A a2 = this.f260c;
        if (a2 == null || a2.f253a != p2) {
            this.f260c = new A(p2, 1);
        }
        return this.f260c;
    }

    public final void f() {
        P layoutManager;
        RecyclerView recyclerView = this.f258a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c2 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c2 == null) {
            return;
        }
        int[] a2 = a(layoutManager, c2);
        int i2 = a2[0];
        if (i2 == 0 && a2[1] == 0) {
            return;
        }
        this.f258a.b0(i2, a2[1], false);
    }
}
