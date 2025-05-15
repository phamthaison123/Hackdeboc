package androidx.recyclerview.widget;

import F.AbstractC0023y;
import F.O;
import G.c;
import G.d;
import S.C0041q;
import S.C0043t;
import S.C0045v;
import S.C0047x;
import S.P;
import S.Q;
import S.X;
import S.c0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import i.S0;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1502E;

    /* renamed from: F, reason: collision with root package name */
    public int f1503F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f1504G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f1505H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1506I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1507J;

    /* renamed from: K, reason: collision with root package name */
    public final S0 f1508K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1509L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1502E = false;
        this.f1503F = -1;
        this.f1506I = new SparseIntArray();
        this.f1507J = new SparseIntArray();
        this.f1508K = new S0(1);
        this.f1509L = new Rect();
        g1(P.E(context, attributeSet, i2, i3).f279b);
    }

    @Override // S.P
    public final int F(X x2, c0 c0Var) {
        if (this.f1514p == 0) {
            return this.f1503F;
        }
        if (c0Var.b() < 1) {
            return 0;
        }
        return c1(c0Var.b() - 1, x2, c0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View I0(X x2, c0 c0Var, int i2, int i3, int i4) {
        B0();
        int f2 = this.f1516r.f();
        int e2 = this.f1516r.e();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View u2 = u(i2);
            int D2 = P.D(u2);
            if (D2 >= 0 && D2 < i4 && d1(D2, x2, c0Var) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010b, code lost:
    
        if (r13 == (r2 > r8 ? r9 : false)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x001e, code lost:
    
        if (r22.f282a.j(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View N(android.view.View r23, int r24, S.X r25, S.c0 r26) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N(android.view.View, int, S.X, S.c0):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r22.f535b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(S.X r19, S.c0 r20, S.C0047x r21, S.C0046w r22) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.O0(S.X, S.c0, S.x, S.w):void");
    }

    @Override // S.P
    public final void P(X x2, c0 c0Var, View view, d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0043t)) {
            Q(view, dVar);
            return;
        }
        C0043t c0043t = (C0043t) layoutParams;
        int c1 = c1(c0043t.f297a.c(), x2, c0Var);
        if (this.f1514p == 0) {
            dVar.f(c.a(c0043t.f518e, c0043t.f519f, c1, 1, false));
        } else {
            dVar.f(c.a(c1, 1, c0043t.f518e, c0043t.f519f, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void P0(X x2, c0 c0Var, C0045v c0045v, int i2) {
        h1();
        if (c0Var.b() > 0 && !c0Var.f340g) {
            boolean z2 = i2 == 1;
            int d1 = d1(c0045v.f530b, x2, c0Var);
            if (z2) {
                while (d1 > 0) {
                    int i3 = c0045v.f530b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    c0045v.f530b = i4;
                    d1 = d1(i4, x2, c0Var);
                }
            } else {
                int b2 = c0Var.b() - 1;
                int i5 = c0045v.f530b;
                while (i5 < b2) {
                    int i6 = i5 + 1;
                    int d12 = d1(i6, x2, c0Var);
                    if (d12 <= d1) {
                        break;
                    }
                    i5 = i6;
                    d1 = d12;
                }
                c0045v.f530b = i5;
            }
        }
        a1();
    }

    @Override // S.P
    public final void R(int i2, int i3) {
        S0 s0 = this.f1508K;
        s0.d();
        ((SparseIntArray) s0.f2709d).clear();
    }

    @Override // S.P
    public final void S() {
        S0 s0 = this.f1508K;
        s0.d();
        ((SparseIntArray) s0.f2709d).clear();
    }

    @Override // S.P
    public final void T(int i2, int i3) {
        S0 s0 = this.f1508K;
        s0.d();
        ((SparseIntArray) s0.f2709d).clear();
    }

    @Override // S.P
    public final void U(int i2, int i3) {
        S0 s0 = this.f1508K;
        s0.d();
        ((SparseIntArray) s0.f2709d).clear();
    }

    @Override // S.P
    public final void V(int i2, int i3) {
        S0 s0 = this.f1508K;
        s0.d();
        ((SparseIntArray) s0.f2709d).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.V0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final void W(X x2, c0 c0Var) {
        boolean z2 = c0Var.f340g;
        SparseIntArray sparseIntArray = this.f1507J;
        SparseIntArray sparseIntArray2 = this.f1506I;
        if (z2) {
            int v2 = v();
            for (int i2 = 0; i2 < v2; i2++) {
                C0043t c0043t = (C0043t) u(i2).getLayoutParams();
                int c2 = c0043t.f297a.c();
                sparseIntArray2.put(c2, c0043t.f519f);
                sparseIntArray.put(c2, c0043t.f518e);
            }
        }
        super.W(x2, c0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final void X(c0 c0Var) {
        super.X(c0Var);
        this.f1502E = false;
    }

    public final void Z0(int i2) {
        int i3;
        int[] iArr = this.f1504G;
        int i4 = this.f1503F;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f1504G = iArr;
    }

    public final void a1() {
        View[] viewArr = this.f1505H;
        if (viewArr == null || viewArr.length != this.f1503F) {
            this.f1505H = new View[this.f1503F];
        }
    }

    public final int b1(int i2, int i3) {
        if (this.f1514p != 1 || !N0()) {
            int[] iArr = this.f1504G;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f1504G;
        int i4 = this.f1503F;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public final int c1(int i2, X x2, c0 c0Var) {
        boolean z2 = c0Var.f340g;
        S0 s0 = this.f1508K;
        if (!z2) {
            return s0.a(i2, this.f1503F);
        }
        int b2 = x2.b(i2);
        if (b2 != -1) {
            return s0.a(b2, this.f1503F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    public final int d1(int i2, X x2, c0 c0Var) {
        boolean z2 = c0Var.f340g;
        S0 s0 = this.f1508K;
        if (!z2) {
            return s0.b(i2, this.f1503F);
        }
        int i3 = this.f1507J.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = x2.b(i2);
        if (b2 != -1) {
            return s0.b(b2, this.f1503F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    public final int e1(int i2, X x2, c0 c0Var) {
        boolean z2 = c0Var.f340g;
        S0 s0 = this.f1508K;
        if (!z2) {
            s0.getClass();
            return 1;
        }
        int i3 = this.f1506I.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (x2.b(i2) != -1) {
            s0.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    @Override // S.P
    public final boolean f(Q q2) {
        return q2 instanceof C0043t;
    }

    public final void f1(View view, int i2, boolean z2) {
        int i3;
        int i4;
        C0043t c0043t = (C0043t) view.getLayoutParams();
        Rect rect = c0043t.f298b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0043t).topMargin + ((ViewGroup.MarginLayoutParams) c0043t).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0043t).leftMargin + ((ViewGroup.MarginLayoutParams) c0043t).rightMargin;
        int b1 = b1(c0043t.f518e, c0043t.f519f);
        if (this.f1514p == 1) {
            i4 = P.w(false, b1, i2, i6, ((ViewGroup.MarginLayoutParams) c0043t).width);
            i3 = P.w(true, this.f1516r.g(), this.f294m, i5, ((ViewGroup.MarginLayoutParams) c0043t).height);
        } else {
            int w2 = P.w(false, b1, i2, i5, ((ViewGroup.MarginLayoutParams) c0043t).height);
            int w3 = P.w(true, this.f1516r.g(), this.f293l, i6, ((ViewGroup.MarginLayoutParams) c0043t).width);
            i3 = w2;
            i4 = w3;
        }
        Q q2 = (Q) view.getLayoutParams();
        if (z2 ? r0(view, i4, i3, q2) : p0(view, i4, i3, q2)) {
            view.measure(i4, i3);
        }
    }

    public final void g1(int i2) {
        if (i2 == this.f1503F) {
            return;
        }
        this.f1502E = true;
        if (i2 < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
        this.f1503F = i2;
        this.f1508K.d();
        g0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final int h0(int i2, X x2, c0 c0Var) {
        h1();
        a1();
        return super.h0(i2, x2, c0Var);
    }

    public final void h1() {
        int z2;
        int C2;
        if (this.f1514p == 1) {
            z2 = this.f295n - B();
            C2 = A();
        } else {
            z2 = this.f296o - z();
            C2 = C();
        }
        Z0(z2 - C2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final int j0(int i2, X x2, c0 c0Var) {
        h1();
        a1();
        return super.j0(i2, x2, c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final int k(c0 c0Var) {
        return y0(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final int l(c0 c0Var) {
        return z0(c0Var);
    }

    @Override // S.P
    public final void m0(Rect rect, int i2, int i3) {
        int g2;
        int g3;
        if (this.f1504G == null) {
            super.m0(rect, i2, i3);
        }
        int B2 = B() + A();
        int z2 = z() + C();
        if (this.f1514p == 1) {
            int height = rect.height() + z2;
            RecyclerView recyclerView = this.f283b;
            WeakHashMap weakHashMap = O.f58a;
            g3 = P.g(i3, height, AbstractC0023y.d(recyclerView));
            int[] iArr = this.f1504G;
            g2 = P.g(i2, iArr[iArr.length - 1] + B2, AbstractC0023y.e(this.f283b));
        } else {
            int width = rect.width() + B2;
            RecyclerView recyclerView2 = this.f283b;
            WeakHashMap weakHashMap2 = O.f58a;
            g2 = P.g(i2, width, AbstractC0023y.e(recyclerView2));
            int[] iArr2 = this.f1504G;
            g3 = P.g(i3, iArr2[iArr2.length - 1] + z2, AbstractC0023y.d(this.f283b));
        }
        this.f283b.setMeasuredDimension(g2, g3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final int n(c0 c0Var) {
        return y0(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final int o(c0 c0Var) {
        return z0(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final Q r() {
        return this.f1514p == 0 ? new C0043t(-2, -1) : new C0043t(-1, -2);
    }

    @Override // S.P
    public final Q s(Context context, AttributeSet attributeSet) {
        C0043t c0043t = new C0043t(context, attributeSet);
        c0043t.f518e = -1;
        c0043t.f519f = 0;
        return c0043t;
    }

    @Override // S.P
    public final Q t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0043t c0043t = new C0043t((ViewGroup.MarginLayoutParams) layoutParams);
            c0043t.f518e = -1;
            c0043t.f519f = 0;
            return c0043t;
        }
        C0043t c0043t2 = new C0043t(layoutParams);
        c0043t2.f518e = -1;
        c0043t2.f519f = 0;
        return c0043t2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final boolean u0() {
        return this.f1524z == null && !this.f1502E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w0(c0 c0Var, C0047x c0047x, C0041q c0041q) {
        int i2;
        int i3 = this.f1503F;
        for (int i4 = 0; i4 < this.f1503F && (i2 = c0047x.f541d) >= 0 && i2 < c0Var.b() && i3 > 0; i4++) {
            c0041q.a(c0047x.f541d, Math.max(0, c0047x.f544g));
            this.f1508K.getClass();
            i3--;
            c0047x.f541d += c0047x.f542e;
        }
    }

    @Override // S.P
    public final int x(X x2, c0 c0Var) {
        if (this.f1514p == 1) {
            return this.f1503F;
        }
        if (c0Var.b() < 1) {
            return 0;
        }
        return c1(c0Var.b() - 1, x2, c0Var) + 1;
    }

    public GridLayoutManager(int i2) {
        super(1);
        this.f1502E = false;
        this.f1503F = -1;
        this.f1506I = new SparseIntArray();
        this.f1507J = new SparseIntArray();
        this.f1508K = new S0(1);
        this.f1509L = new Rect();
        g1(i2);
    }
}
