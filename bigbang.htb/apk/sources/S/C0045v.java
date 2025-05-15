package S;

import android.view.View;

/* renamed from: S.v, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0045v {

    /* renamed from: a, reason: collision with root package name */
    public A f529a;

    /* renamed from: b, reason: collision with root package name */
    public int f530b;

    /* renamed from: c, reason: collision with root package name */
    public int f531c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f532d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f533e;

    public C0045v() {
        d();
    }

    public final void a() {
        this.f531c = this.f532d ? this.f529a.e() : this.f529a.f();
    }

    public final void b(View view, int i2) {
        if (this.f532d) {
            this.f531c = this.f529a.h() + this.f529a.b(view);
        } else {
            this.f531c = this.f529a.d(view);
        }
        this.f530b = i2;
    }

    public final void c(View view, int i2) {
        int h2 = this.f529a.h();
        if (h2 >= 0) {
            b(view, i2);
            return;
        }
        this.f530b = i2;
        if (!this.f532d) {
            int d2 = this.f529a.d(view);
            int f2 = d2 - this.f529a.f();
            this.f531c = d2;
            if (f2 > 0) {
                int e2 = (this.f529a.e() - Math.min(0, (this.f529a.e() - h2) - this.f529a.b(view))) - (this.f529a.c(view) + d2);
                if (e2 < 0) {
                    this.f531c -= Math.min(f2, -e2);
                    return;
                }
                return;
            }
            return;
        }
        int e3 = (this.f529a.e() - h2) - this.f529a.b(view);
        this.f531c = this.f529a.e() - e3;
        if (e3 > 0) {
            int c2 = this.f531c - this.f529a.c(view);
            int f3 = this.f529a.f();
            int min = c2 - (Math.min(this.f529a.d(view) - f3, 0) + f3);
            if (min < 0) {
                this.f531c = Math.min(e3, -min) + this.f531c;
            }
        }
    }

    public final void d() {
        this.f530b = -1;
        this.f531c = Integer.MIN_VALUE;
        this.f532d = false;
        this.f533e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f530b + ", mCoordinate=" + this.f531c + ", mLayoutFromEnd=" + this.f532d + ", mValid=" + this.f533e + '}';
    }
}
