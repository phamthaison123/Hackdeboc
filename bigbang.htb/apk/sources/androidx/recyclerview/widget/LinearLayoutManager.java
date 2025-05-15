package androidx.recyclerview.widget;

import B.a;
import F.AbstractC0024z;
import F.O;
import S.A;
import S.B;
import S.C0041q;
import S.C0045v;
import S.C0046w;
import S.C0047x;
import S.C0048y;
import S.C0049z;
import S.P;
import S.Q;
import S.X;
import S.b0;
import S.c0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class LinearLayoutManager extends P implements b0 {

    /* renamed from: A, reason: collision with root package name */
    public final C0045v f1510A;

    /* renamed from: B, reason: collision with root package name */
    public final C0046w f1511B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1512C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1513D;

    /* renamed from: p, reason: collision with root package name */
    public int f1514p;

    /* renamed from: q, reason: collision with root package name */
    public C0047x f1515q;

    /* renamed from: r, reason: collision with root package name */
    public A f1516r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1517s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1518t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1519u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1520v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1521w;

    /* renamed from: x, reason: collision with root package name */
    public int f1522x;

    /* renamed from: y, reason: collision with root package name */
    public int f1523y;

    /* renamed from: z, reason: collision with root package name */
    public C0048y f1524z;

    public LinearLayoutManager(int i2) {
        this.f1514p = 1;
        this.f1518t = false;
        this.f1519u = false;
        this.f1520v = false;
        this.f1521w = true;
        this.f1522x = -1;
        this.f1523y = Integer.MIN_VALUE;
        this.f1524z = null;
        this.f1510A = new C0045v();
        this.f1511B = new C0046w();
        this.f1512C = 2;
        this.f1513D = new int[2];
        U0(i2);
        c(null);
        if (this.f1518t) {
            this.f1518t = false;
            g0();
        }
    }

    public final int A0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f1514p == 1) ? 1 : Integer.MIN_VALUE : this.f1514p == 0 ? 1 : Integer.MIN_VALUE : this.f1514p == 1 ? -1 : Integer.MIN_VALUE : this.f1514p == 0 ? -1 : Integer.MIN_VALUE : (this.f1514p != 1 && N0()) ? -1 : 1 : (this.f1514p != 1 && N0()) ? 1 : -1;
    }

    public final void B0() {
        if (this.f1515q == null) {
            C0047x c0047x = new C0047x();
            c0047x.f538a = true;
            c0047x.f545h = 0;
            c0047x.f546i = 0;
            c0047x.f548k = null;
            this.f1515q = c0047x;
        }
    }

    public final int C0(X x2, C0047x c0047x, c0 c0Var, boolean z2) {
        int i2;
        int i3 = c0047x.f540c;
        int i4 = c0047x.f544g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                c0047x.f544g = i4 + i3;
            }
            Q0(x2, c0047x);
        }
        int i5 = c0047x.f540c + c0047x.f545h;
        while (true) {
            if ((!c0047x.f549l && i5 <= 0) || (i2 = c0047x.f541d) < 0 || i2 >= c0Var.b()) {
                break;
            }
            C0046w c0046w = this.f1511B;
            c0046w.f534a = 0;
            c0046w.f535b = false;
            c0046w.f536c = false;
            c0046w.f537d = false;
            O0(x2, c0Var, c0047x, c0046w);
            if (!c0046w.f535b) {
                int i6 = c0047x.f539b;
                int i7 = c0046w.f534a;
                c0047x.f539b = (c0047x.f543f * i7) + i6;
                if (!c0046w.f536c || c0047x.f548k != null || !c0Var.f340g) {
                    c0047x.f540c -= i7;
                    i5 -= i7;
                }
                int i8 = c0047x.f544g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + i7;
                    c0047x.f544g = i9;
                    int i10 = c0047x.f540c;
                    if (i10 < 0) {
                        c0047x.f544g = i9 + i10;
                    }
                    Q0(x2, c0047x);
                }
                if (z2 && c0046w.f537d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - c0047x.f540c;
    }

    public final View D0(boolean z2) {
        return this.f1519u ? H0(0, v(), z2) : H0(v() - 1, -1, z2);
    }

    public final View E0(boolean z2) {
        return this.f1519u ? H0(v() - 1, -1, z2) : H0(0, v(), z2);
    }

    public final int F0() {
        View H0 = H0(v() - 1, -1, false);
        if (H0 == null) {
            return -1;
        }
        return P.D(H0);
    }

    public final View G0(int i2, int i3) {
        int i4;
        int i5;
        B0();
        if (i3 <= i2 && i3 >= i2) {
            return u(i2);
        }
        if (this.f1516r.d(u(i2)) < this.f1516r.f()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.f1514p == 0 ? this.f284c.f(i2, i3, i4, i5) : this.f285d.f(i2, i3, i4, i5);
    }

    @Override // S.P
    public final boolean H() {
        return true;
    }

    public final View H0(int i2, int i3, boolean z2) {
        B0();
        int i4 = z2 ? 24579 : 320;
        return this.f1514p == 0 ? this.f284c.f(i2, i3, i4, 320) : this.f285d.f(i2, i3, i4, 320);
    }

    public View I0(X x2, c0 c0Var, int i2, int i3, int i4) {
        B0();
        int f2 = this.f1516r.f();
        int e2 = this.f1516r.e();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View u2 = u(i2);
            int D2 = P.D(u2);
            if (D2 >= 0 && D2 < i4) {
                if (((Q) u2.getLayoutParams()).f297a.j()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f1516r.d(u2) < e2 && this.f1516r.b(u2) >= f2) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    public final int J0(int i2, X x2, c0 c0Var, boolean z2) {
        int e2;
        int e3 = this.f1516r.e() - i2;
        if (e3 <= 0) {
            return 0;
        }
        int i3 = -T0(-e3, x2, c0Var);
        int i4 = i2 + i3;
        if (!z2 || (e2 = this.f1516r.e() - i4) <= 0) {
            return i3;
        }
        this.f1516r.k(e2);
        return e2 + i3;
    }

    public final int K0(int i2, X x2, c0 c0Var, boolean z2) {
        int f2;
        int f3 = i2 - this.f1516r.f();
        if (f3 <= 0) {
            return 0;
        }
        int i3 = -T0(f3, x2, c0Var);
        int i4 = i2 + i3;
        if (!z2 || (f2 = i4 - this.f1516r.f()) <= 0) {
            return i3;
        }
        this.f1516r.k(-f2);
        return i3 - f2;
    }

    public final View L0() {
        return u(this.f1519u ? 0 : v() - 1);
    }

    @Override // S.P
    public final void M(RecyclerView recyclerView) {
    }

    public final View M0() {
        return u(this.f1519u ? v() - 1 : 0);
    }

    @Override // S.P
    public View N(View view, int i2, X x2, c0 c0Var) {
        int A0;
        S0();
        if (v() == 0 || (A0 = A0(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        B0();
        W0(A0, (int) (this.f1516r.g() * 0.33333334f), false, c0Var);
        C0047x c0047x = this.f1515q;
        c0047x.f544g = Integer.MIN_VALUE;
        c0047x.f538a = false;
        C0(x2, c0047x, c0Var, true);
        View G0 = A0 == -1 ? this.f1519u ? G0(v() - 1, -1) : G0(0, v()) : this.f1519u ? G0(0, v()) : G0(v() - 1, -1);
        View M0 = A0 == -1 ? M0() : L0();
        if (!M0.hasFocusable()) {
            return G0;
        }
        if (G0 == null) {
            return null;
        }
        return M0;
    }

    public final boolean N0() {
        RecyclerView recyclerView = this.f283b;
        WeakHashMap weakHashMap = O.f58a;
        return AbstractC0024z.d(recyclerView) == 1;
    }

    @Override // S.P
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (v() > 0) {
            View H0 = H0(0, v(), false);
            accessibilityEvent.setFromIndex(H0 == null ? -1 : P.D(H0));
            accessibilityEvent.setToIndex(F0());
        }
    }

    public void O0(X x2, c0 c0Var, C0047x c0047x, C0046w c0046w) {
        int C2;
        int i2;
        int i3;
        int i4;
        int i5;
        View b2 = c0047x.b(x2);
        if (b2 == null) {
            c0046w.f535b = true;
            return;
        }
        Q q2 = (Q) b2.getLayoutParams();
        if (c0047x.f548k == null) {
            if (this.f1519u == (c0047x.f543f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1519u == (c0047x.f543f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        Q q3 = (Q) b2.getLayoutParams();
        Rect J2 = this.f283b.J(b2);
        int i6 = J2.left + J2.right;
        int i7 = J2.top + J2.bottom;
        int w2 = P.w(d(), this.f295n, this.f293l, B() + A() + ((ViewGroup.MarginLayoutParams) q3).leftMargin + ((ViewGroup.MarginLayoutParams) q3).rightMargin + i6, ((ViewGroup.MarginLayoutParams) q3).width);
        int w3 = P.w(e(), this.f296o, this.f294m, z() + C() + ((ViewGroup.MarginLayoutParams) q3).topMargin + ((ViewGroup.MarginLayoutParams) q3).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) q3).height);
        if (p0(b2, w2, w3, q3)) {
            b2.measure(w2, w3);
        }
        c0046w.f534a = this.f1516r.c(b2);
        if (this.f1514p == 1) {
            if (N0()) {
                i3 = this.f295n - B();
                i5 = i3 - this.f1516r.l(b2);
            } else {
                int A2 = A();
                i3 = this.f1516r.l(b2) + A2;
                i5 = A2;
            }
            if (c0047x.f543f == -1) {
                i4 = c0047x.f539b;
                C2 = i4 - c0046w.f534a;
            } else {
                C2 = c0047x.f539b;
                i4 = c0046w.f534a + C2;
            }
        } else {
            C2 = C();
            int l2 = this.f1516r.l(b2) + C2;
            if (c0047x.f543f == -1) {
                i3 = c0047x.f539b;
                i2 = i3 - c0046w.f534a;
            } else {
                i2 = c0047x.f539b;
                i3 = c0046w.f534a + i2;
            }
            int i8 = i2;
            i4 = l2;
            i5 = i8;
        }
        P.J(b2, i5, C2, i3, i4);
        if (q2.f297a.j() || q2.f297a.m()) {
            c0046w.f536c = true;
        }
        c0046w.f537d = b2.hasFocusable();
    }

    public void P0(X x2, c0 c0Var, C0045v c0045v, int i2) {
    }

    public final void Q0(X x2, C0047x c0047x) {
        int i2;
        if (!c0047x.f538a || c0047x.f549l) {
            return;
        }
        int i3 = c0047x.f544g;
        int i4 = c0047x.f546i;
        if (c0047x.f543f != -1) {
            if (i3 < 0) {
                return;
            }
            int i5 = i3 - i4;
            int v2 = v();
            if (!this.f1519u) {
                for (int i6 = 0; i6 < v2; i6++) {
                    View u2 = u(i6);
                    if (this.f1516r.b(u2) > i5 || this.f1516r.i(u2) > i5) {
                        R0(x2, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = v2 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View u3 = u(i8);
                if (this.f1516r.b(u3) > i5 || this.f1516r.i(u3) > i5) {
                    R0(x2, i7, i8);
                    return;
                }
            }
            return;
        }
        int v3 = v();
        if (i3 < 0) {
            return;
        }
        A a2 = this.f1516r;
        int i9 = a2.f252d;
        P p2 = a2.f253a;
        switch (i9) {
            case 0:
                i2 = p2.f295n;
                break;
            default:
                i2 = p2.f296o;
                break;
        }
        int i10 = (i2 - i3) + i4;
        if (this.f1519u) {
            for (int i11 = 0; i11 < v3; i11++) {
                View u4 = u(i11);
                if (this.f1516r.d(u4) < i10 || this.f1516r.j(u4) < i10) {
                    R0(x2, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = v3 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View u5 = u(i13);
            if (this.f1516r.d(u5) < i10 || this.f1516r.j(u5) < i10) {
                R0(x2, i12, i13);
                return;
            }
        }
    }

    public final void R0(X x2, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                View u2 = u(i2);
                e0(i2);
                x2.f(u2);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            View u3 = u(i4);
            e0(i4);
            x2.f(u3);
        }
    }

    public final void S0() {
        if (this.f1514p == 1 || !N0()) {
            this.f1519u = this.f1518t;
        } else {
            this.f1519u = !this.f1518t;
        }
    }

    public final int T0(int i2, X x2, c0 c0Var) {
        if (v() == 0 || i2 == 0) {
            return 0;
        }
        B0();
        this.f1515q.f538a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        W0(i3, abs, true, c0Var);
        C0047x c0047x = this.f1515q;
        int C0 = C0(x2, c0047x, c0Var, false) + c0047x.f544g;
        if (C0 < 0) {
            return 0;
        }
        if (abs > C0) {
            i2 = i3 * C0;
        }
        this.f1516r.k(-i2);
        this.f1515q.f547j = i2;
        return i2;
    }

    public final void U0(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        c(null);
        if (i2 != this.f1514p || this.f1516r == null) {
            A a2 = B.a(this, i2);
            this.f1516r = a2;
            this.f1510A.f529a = a2;
            this.f1514p = i2;
            g0();
        }
    }

    public void V0(boolean z2) {
        c(null);
        if (this.f1520v == z2) {
            return;
        }
        this.f1520v = z2;
        g0();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0413  */
    @Override // S.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W(S.X r18, S.c0 r19) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.W(S.X, S.c0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(int r7, int r8, boolean r9, S.c0 r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.W0(int, int, boolean, S.c0):void");
    }

    @Override // S.P
    public void X(c0 c0Var) {
        this.f1524z = null;
        this.f1522x = -1;
        this.f1523y = Integer.MIN_VALUE;
        this.f1510A.d();
    }

    public final void X0(int i2, int i3) {
        this.f1515q.f540c = this.f1516r.e() - i3;
        C0047x c0047x = this.f1515q;
        c0047x.f542e = this.f1519u ? -1 : 1;
        c0047x.f541d = i2;
        c0047x.f543f = 1;
        c0047x.f539b = i3;
        c0047x.f544g = Integer.MIN_VALUE;
    }

    @Override // S.P
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof C0048y) {
            this.f1524z = (C0048y) parcelable;
            g0();
        }
    }

    public final void Y0(int i2, int i3) {
        this.f1515q.f540c = i3 - this.f1516r.f();
        C0047x c0047x = this.f1515q;
        c0047x.f541d = i2;
        c0047x.f542e = this.f1519u ? 1 : -1;
        c0047x.f543f = -1;
        c0047x.f539b = i3;
        c0047x.f544g = Integer.MIN_VALUE;
    }

    @Override // S.P
    public final Parcelable Z() {
        C0048y c0048y = this.f1524z;
        if (c0048y != null) {
            C0048y c0048y2 = new C0048y();
            c0048y2.f550a = c0048y.f550a;
            c0048y2.f551b = c0048y.f551b;
            c0048y2.f552c = c0048y.f552c;
            return c0048y2;
        }
        C0048y c0048y3 = new C0048y();
        if (v() > 0) {
            B0();
            boolean z2 = this.f1517s ^ this.f1519u;
            c0048y3.f552c = z2;
            if (z2) {
                View L0 = L0();
                c0048y3.f551b = this.f1516r.e() - this.f1516r.b(L0);
                c0048y3.f550a = P.D(L0);
            } else {
                View M0 = M0();
                c0048y3.f550a = P.D(M0);
                c0048y3.f551b = this.f1516r.d(M0) - this.f1516r.f();
            }
        } else {
            c0048y3.f550a = -1;
        }
        return c0048y3;
    }

    @Override // S.b0
    public final PointF a(int i2) {
        if (v() == 0) {
            return null;
        }
        int i3 = (i2 < P.D(u(0))) != this.f1519u ? -1 : 1;
        return this.f1514p == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // S.P
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f1524z != null || (recyclerView = this.f283b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    @Override // S.P
    public final boolean d() {
        return this.f1514p == 0;
    }

    @Override // S.P
    public final boolean e() {
        return this.f1514p == 1;
    }

    @Override // S.P
    public final void h(int i2, int i3, c0 c0Var, C0041q c0041q) {
        if (this.f1514p != 0) {
            i2 = i3;
        }
        if (v() == 0 || i2 == 0) {
            return;
        }
        B0();
        W0(i2 > 0 ? 1 : -1, Math.abs(i2), true, c0Var);
        w0(c0Var, this.f1515q, c0041q);
    }

    @Override // S.P
    public int h0(int i2, X x2, c0 c0Var) {
        if (this.f1514p == 1) {
            return 0;
        }
        return T0(i2, x2, c0Var);
    }

    @Override // S.P
    public final void i(int i2, C0041q c0041q) {
        boolean z2;
        int i3;
        C0048y c0048y = this.f1524z;
        if (c0048y == null || (i3 = c0048y.f550a) < 0) {
            S0();
            z2 = this.f1519u;
            i3 = this.f1522x;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            z2 = c0048y.f552c;
        }
        int i4 = z2 ? -1 : 1;
        for (int i5 = 0; i5 < this.f1512C && i3 >= 0 && i3 < i2; i5++) {
            c0041q.a(i3, 0);
            i3 += i4;
        }
    }

    @Override // S.P
    public final void i0(int i2) {
        this.f1522x = i2;
        this.f1523y = Integer.MIN_VALUE;
        C0048y c0048y = this.f1524z;
        if (c0048y != null) {
            c0048y.f550a = -1;
        }
        g0();
    }

    @Override // S.P
    public final int j(c0 c0Var) {
        return x0(c0Var);
    }

    @Override // S.P
    public int j0(int i2, X x2, c0 c0Var) {
        if (this.f1514p == 0) {
            return 0;
        }
        return T0(i2, x2, c0Var);
    }

    @Override // S.P
    public int k(c0 c0Var) {
        return y0(c0Var);
    }

    @Override // S.P
    public int l(c0 c0Var) {
        return z0(c0Var);
    }

    @Override // S.P
    public final int m(c0 c0Var) {
        return x0(c0Var);
    }

    @Override // S.P
    public int n(c0 c0Var) {
        return y0(c0Var);
    }

    @Override // S.P
    public int o(c0 c0Var) {
        return z0(c0Var);
    }

    @Override // S.P
    public final View q(int i2) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int D2 = i2 - P.D(u(0));
        if (D2 >= 0 && D2 < v2) {
            View u2 = u(D2);
            if (P.D(u2) == i2) {
                return u2;
            }
        }
        return super.q(i2);
    }

    @Override // S.P
    public final boolean q0() {
        if (this.f294m == 1073741824 || this.f293l == 1073741824) {
            return false;
        }
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            ViewGroup.LayoutParams layoutParams = u(i2).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // S.P
    public Q r() {
        return new Q(-2, -2);
    }

    @Override // S.P
    public void s0(RecyclerView recyclerView, int i2) {
        C0049z c0049z = new C0049z(recyclerView.getContext());
        c0049z.f553a = i2;
        t0(c0049z);
    }

    @Override // S.P
    public boolean u0() {
        return this.f1524z == null && this.f1517s == this.f1520v;
    }

    public void v0(c0 c0Var, int[] iArr) {
        int i2;
        int g2 = c0Var.f334a != -1 ? this.f1516r.g() : 0;
        if (this.f1515q.f543f == -1) {
            i2 = 0;
        } else {
            i2 = g2;
            g2 = 0;
        }
        iArr[0] = g2;
        iArr[1] = i2;
    }

    public void w0(c0 c0Var, C0047x c0047x, C0041q c0041q) {
        int i2 = c0047x.f541d;
        if (i2 < 0 || i2 >= c0Var.b()) {
            return;
        }
        c0041q.a(i2, Math.max(0, c0047x.f544g));
    }

    public final int x0(c0 c0Var) {
        if (v() == 0) {
            return 0;
        }
        B0();
        A a2 = this.f1516r;
        boolean z2 = !this.f1521w;
        return a.s(c0Var, a2, E0(z2), D0(z2), this, this.f1521w);
    }

    public final int y0(c0 c0Var) {
        if (v() == 0) {
            return 0;
        }
        B0();
        A a2 = this.f1516r;
        boolean z2 = !this.f1521w;
        return a.t(c0Var, a2, E0(z2), D0(z2), this, this.f1521w, this.f1519u);
    }

    public final int z0(c0 c0Var) {
        if (v() == 0) {
            return 0;
        }
        B0();
        A a2 = this.f1516r;
        boolean z2 = !this.f1521w;
        return a.u(c0Var, a2, E0(z2), D0(z2), this, this.f1521w);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1514p = 1;
        this.f1518t = false;
        this.f1519u = false;
        this.f1520v = false;
        this.f1521w = true;
        this.f1522x = -1;
        this.f1523y = Integer.MIN_VALUE;
        this.f1524z = null;
        this.f1510A = new C0045v();
        this.f1511B = new C0046w();
        this.f1512C = 2;
        this.f1513D = new int[2];
        S.O E2 = P.E(context, attributeSet, i2, i3);
        U0(E2.f278a);
        boolean z2 = E2.f280c;
        c(null);
        if (z2 != this.f1518t) {
            this.f1518t = z2;
            g0();
        }
        V0(E2.f281d);
    }
}
