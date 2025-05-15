package S;

import android.view.View;
import java.util.List;

/* renamed from: S.x, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0047x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f538a;

    /* renamed from: b, reason: collision with root package name */
    public int f539b;

    /* renamed from: c, reason: collision with root package name */
    public int f540c;

    /* renamed from: d, reason: collision with root package name */
    public int f541d;

    /* renamed from: e, reason: collision with root package name */
    public int f542e;

    /* renamed from: f, reason: collision with root package name */
    public int f543f;

    /* renamed from: g, reason: collision with root package name */
    public int f544g;

    /* renamed from: h, reason: collision with root package name */
    public int f545h;

    /* renamed from: i, reason: collision with root package name */
    public int f546i;

    /* renamed from: j, reason: collision with root package name */
    public int f547j;

    /* renamed from: k, reason: collision with root package name */
    public List f548k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f549l;

    public final void a(View view) {
        int c2;
        int size = this.f548k.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((f0) this.f548k.get(i3)).f367a;
            Q q2 = (Q) view3.getLayoutParams();
            if (view3 != view && !q2.f297a.j() && (c2 = (q2.f297a.c() - this.f541d) * this.f542e) >= 0 && c2 < i2) {
                view2 = view3;
                if (c2 == 0) {
                    break;
                } else {
                    i2 = c2;
                }
            }
        }
        if (view2 == null) {
            this.f541d = -1;
        } else {
            this.f541d = ((Q) view2.getLayoutParams()).f297a.c();
        }
    }

    public final View b(X x2) {
        List list = this.f548k;
        if (list == null) {
            View view = x2.i(this.f541d, Long.MAX_VALUE).f367a;
            this.f541d += this.f542e;
            return view;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = ((f0) this.f548k.get(i2)).f367a;
            Q q2 = (Q) view2.getLayoutParams();
            if (!q2.f297a.j() && this.f541d == q2.f297a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
