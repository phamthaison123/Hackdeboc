package androidx.recyclerview.widget;

import B.a;
import F.AbstractC0023y;
import F.AbstractC0024z;
import G.c;
import G.d;
import S.A;
import S.B;
import S.C0041q;
import S.C0044u;
import S.C0049z;
import S.O;
import S.P;
import S.Q;
import S.RunnableC0036l;
import S.X;
import S.b0;
import S.c0;
import S.j0;
import S.k0;
import S.m0;
import S.n0;
import S.r0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class StaggeredGridLayoutManager extends P implements b0 {

    /* renamed from: B, reason: collision with root package name */
    public final r0 f1591B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1592C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1593D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1594E;

    /* renamed from: F, reason: collision with root package name */
    public m0 f1595F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f1596G;

    /* renamed from: H, reason: collision with root package name */
    public final j0 f1597H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1598I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1599J;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC0036l f1600K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1601p;

    /* renamed from: q, reason: collision with root package name */
    public final n0[] f1602q;

    /* renamed from: r, reason: collision with root package name */
    public final B f1603r;

    /* renamed from: s, reason: collision with root package name */
    public final B f1604s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1605t;

    /* renamed from: u, reason: collision with root package name */
    public int f1606u;

    /* renamed from: v, reason: collision with root package name */
    public final C0044u f1607v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1608w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1610y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1609x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1611z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1590A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1601p = -1;
        this.f1608w = false;
        r0 r0Var = new r0(1);
        this.f1591B = r0Var;
        this.f1592C = 2;
        this.f1596G = new Rect();
        this.f1597H = new j0(this);
        this.f1598I = true;
        this.f1600K = new RunnableC0036l(1, this);
        O E2 = P.E(context, attributeSet, i2, i3);
        int i4 = E2.f278a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i4 != this.f1605t) {
            this.f1605t = i4;
            B b2 = this.f1603r;
            this.f1603r = this.f1604s;
            this.f1604s = b2;
            g0();
        }
        int i5 = E2.f279b;
        c(null);
        if (i5 != this.f1601p) {
            r0Var.d();
            g0();
            this.f1601p = i5;
            this.f1610y = new BitSet(this.f1601p);
            this.f1602q = new n0[this.f1601p];
            for (int i6 = 0; i6 < this.f1601p; i6++) {
                this.f1602q[i6] = new n0(this, i6);
            }
            g0();
        }
        boolean z2 = E2.f280c;
        c(null);
        m0 m0Var = this.f1595F;
        if (m0Var != null && m0Var.f448h != z2) {
            m0Var.f448h = z2;
        }
        this.f1608w = z2;
        g0();
        C0044u c0044u = new C0044u();
        c0044u.f520a = true;
        c0044u.f525f = 0;
        c0044u.f526g = 0;
        this.f1607v = c0044u;
        this.f1603r = B.a(this, this.f1605t);
        this.f1604s = B.a(this, 1 - this.f1605t);
    }

    public static int Y0(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int A0(X x2, C0044u c0044u, c0 c0Var) {
        n0 n0Var;
        ?? r6;
        int i2;
        int h2;
        int c2;
        int f2;
        int c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 1;
        this.f1610y.set(0, this.f1601p, true);
        C0044u c0044u2 = this.f1607v;
        int i9 = c0044u2.f528i ? c0044u.f524e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0044u.f524e == 1 ? c0044u.f526g + c0044u.f521b : c0044u.f525f - c0044u.f521b;
        int i10 = c0044u.f524e;
        for (int i11 = 0; i11 < this.f1601p; i11++) {
            if (!this.f1602q[i11].f454a.isEmpty()) {
                X0(this.f1602q[i11], i10, i9);
            }
        }
        int e2 = this.f1609x ? this.f1603r.e() : this.f1603r.f();
        boolean z2 = false;
        while (true) {
            int i12 = c0044u.f522c;
            if (((i12 < 0 || i12 >= c0Var.b()) ? i7 : i8) == 0 || (!c0044u2.f528i && this.f1610y.isEmpty())) {
                break;
            }
            View view = x2.i(c0044u.f522c, Long.MAX_VALUE).f367a;
            c0044u.f522c += c0044u.f523d;
            k0 k0Var = (k0) view.getLayoutParams();
            int c4 = k0Var.f297a.c();
            r0 r0Var = this.f1591B;
            int[] iArr = (int[]) r0Var.f510b;
            int i13 = (iArr == null || c4 >= iArr.length) ? -1 : iArr[c4];
            if (i13 == -1) {
                if (O0(c0044u.f524e)) {
                    i6 = this.f1601p - i8;
                    i5 = -1;
                    i4 = -1;
                } else {
                    i4 = i8;
                    i5 = this.f1601p;
                    i6 = i7;
                }
                n0 n0Var2 = null;
                if (c0044u.f524e == i8) {
                    int f3 = this.f1603r.f();
                    int i14 = Integer.MAX_VALUE;
                    while (i6 != i5) {
                        n0 n0Var3 = this.f1602q[i6];
                        int f4 = n0Var3.f(f3);
                        if (f4 < i14) {
                            i14 = f4;
                            n0Var2 = n0Var3;
                        }
                        i6 += i4;
                    }
                } else {
                    int e3 = this.f1603r.e();
                    int i15 = Integer.MIN_VALUE;
                    while (i6 != i5) {
                        n0 n0Var4 = this.f1602q[i6];
                        int h3 = n0Var4.h(e3);
                        if (h3 > i15) {
                            n0Var2 = n0Var4;
                            i15 = h3;
                        }
                        i6 += i4;
                    }
                }
                n0Var = n0Var2;
                r0Var.e(c4);
                ((int[]) r0Var.f510b)[c4] = n0Var.f458e;
            } else {
                n0Var = this.f1602q[i13];
            }
            k0Var.f433e = n0Var;
            if (c0044u.f524e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1605t == 1) {
                i2 = 1;
                M0(view, P.w(r6, this.f1606u, this.f293l, r6, ((ViewGroup.MarginLayoutParams) k0Var).width), P.w(true, this.f296o, this.f294m, z() + C(), ((ViewGroup.MarginLayoutParams) k0Var).height));
            } else {
                i2 = 1;
                M0(view, P.w(true, this.f295n, this.f293l, B() + A(), ((ViewGroup.MarginLayoutParams) k0Var).width), P.w(false, this.f1606u, this.f294m, 0, ((ViewGroup.MarginLayoutParams) k0Var).height));
            }
            if (c0044u.f524e == i2) {
                c2 = n0Var.f(e2);
                h2 = this.f1603r.c(view) + c2;
            } else {
                h2 = n0Var.h(e2);
                c2 = h2 - this.f1603r.c(view);
            }
            if (c0044u.f524e == 1) {
                n0 n0Var5 = k0Var.f433e;
                n0Var5.getClass();
                k0 k0Var2 = (k0) view.getLayoutParams();
                k0Var2.f433e = n0Var5;
                ArrayList arrayList = n0Var5.f454a;
                arrayList.add(view);
                n0Var5.f456c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    n0Var5.f455b = Integer.MIN_VALUE;
                }
                if (k0Var2.f297a.j() || k0Var2.f297a.m()) {
                    n0Var5.f457d = n0Var5.f459f.f1603r.c(view) + n0Var5.f457d;
                }
            } else {
                n0 n0Var6 = k0Var.f433e;
                n0Var6.getClass();
                k0 k0Var3 = (k0) view.getLayoutParams();
                k0Var3.f433e = n0Var6;
                ArrayList arrayList2 = n0Var6.f454a;
                arrayList2.add(0, view);
                n0Var6.f455b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    n0Var6.f456c = Integer.MIN_VALUE;
                }
                if (k0Var3.f297a.j() || k0Var3.f297a.m()) {
                    n0Var6.f457d = n0Var6.f459f.f1603r.c(view) + n0Var6.f457d;
                }
            }
            if (L0() && this.f1605t == 1) {
                c3 = this.f1604s.e() - (((this.f1601p - 1) - n0Var.f458e) * this.f1606u);
                f2 = c3 - this.f1604s.c(view);
            } else {
                f2 = this.f1604s.f() + (n0Var.f458e * this.f1606u);
                c3 = this.f1604s.c(view) + f2;
            }
            if (this.f1605t == 1) {
                P.J(view, f2, c2, c3, h2);
            } else {
                P.J(view, c2, f2, h2, c3);
            }
            X0(n0Var, c0044u2.f524e, i9);
            Q0(x2, c0044u2);
            if (c0044u2.f527h && view.hasFocusable()) {
                i3 = 0;
                this.f1610y.set(n0Var.f458e, false);
            } else {
                i3 = 0;
            }
            i7 = i3;
            i8 = 1;
            z2 = true;
        }
        int i16 = i7;
        if (!z2) {
            Q0(x2, c0044u2);
        }
        int f5 = c0044u2.f524e == -1 ? this.f1603r.f() - I0(this.f1603r.f()) : H0(this.f1603r.e()) - this.f1603r.e();
        return f5 > 0 ? Math.min(c0044u.f521b, f5) : i16;
    }

    public final View B0(boolean z2) {
        int f2 = this.f1603r.f();
        int e2 = this.f1603r.e();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int d2 = this.f1603r.d(u2);
            int b2 = this.f1603r.b(u2);
            if (b2 > f2 && d2 < e2) {
                if (b2 <= e2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final View C0(boolean z2) {
        int f2 = this.f1603r.f();
        int e2 = this.f1603r.e();
        int v2 = v();
        View view = null;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            int d2 = this.f1603r.d(u2);
            if (this.f1603r.b(u2) > f2 && d2 < e2) {
                if (d2 >= f2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void D0(X x2, c0 c0Var, boolean z2) {
        int e2;
        int H0 = H0(Integer.MIN_VALUE);
        if (H0 != Integer.MIN_VALUE && (e2 = this.f1603r.e() - H0) > 0) {
            int i2 = e2 - (-U0(-e2, x2, c0Var));
            if (!z2 || i2 <= 0) {
                return;
            }
            this.f1603r.k(i2);
        }
    }

    public final void E0(X x2, c0 c0Var, boolean z2) {
        int f2;
        int I0 = I0(Integer.MAX_VALUE);
        if (I0 != Integer.MAX_VALUE && (f2 = I0 - this.f1603r.f()) > 0) {
            int U0 = f2 - U0(f2, x2, c0Var);
            if (!z2 || U0 <= 0) {
                return;
            }
            this.f1603r.k(-U0);
        }
    }

    @Override // S.P
    public final int F(X x2, c0 c0Var) {
        return this.f1605t == 0 ? this.f1601p : super.F(x2, c0Var);
    }

    public final int F0() {
        if (v() == 0) {
            return 0;
        }
        return P.D(u(0));
    }

    public final int G0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return P.D(u(v2 - 1));
    }

    @Override // S.P
    public final boolean H() {
        return this.f1592C != 0;
    }

    public final int H0(int i2) {
        int f2 = this.f1602q[0].f(i2);
        for (int i3 = 1; i3 < this.f1601p; i3++) {
            int f3 = this.f1602q[i3].f(i2);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    public final int I0(int i2) {
        int h2 = this.f1602q[0].h(i2);
        for (int i3 = 1; i3 < this.f1601p; i3++) {
            int h3 = this.f1602q[i3].h(i2);
            if (h3 < h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f1609x
            if (r0 == 0) goto L9
            int r0 = r7.G0()
            goto Ld
        L9:
            int r0 = r7.F0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            S.r0 r4 = r7.f1591B
            r4.g(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.j(r8, r5)
            r4.i(r9, r5)
            goto L3a
        L33:
            r4.j(r8, r9)
            goto L3a
        L37:
            r4.i(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.f1609x
            if (r8 == 0) goto L46
            int r8 = r7.F0()
            goto L4a
        L46:
            int r8 = r7.G0()
        L4a:
            if (r3 > r8) goto L4f
            r7.g0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.J0(int, int, int):void");
    }

    @Override // S.P
    public final void K(int i2) {
        super.K(i2);
        for (int i3 = 0; i3 < this.f1601p; i3++) {
            n0 n0Var = this.f1602q[i3];
            int i4 = n0Var.f455b;
            if (i4 != Integer.MIN_VALUE) {
                n0Var.f455b = i4 + i2;
            }
            int i5 = n0Var.f456c;
            if (i5 != Integer.MIN_VALUE) {
                n0Var.f456c = i5 + i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View K0() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K0():android.view.View");
    }

    @Override // S.P
    public final void L(int i2) {
        super.L(i2);
        for (int i3 = 0; i3 < this.f1601p; i3++) {
            n0 n0Var = this.f1602q[i3];
            int i4 = n0Var.f455b;
            if (i4 != Integer.MIN_VALUE) {
                n0Var.f455b = i4 + i2;
            }
            int i5 = n0Var.f456c;
            if (i5 != Integer.MIN_VALUE) {
                n0Var.f456c = i5 + i2;
            }
        }
    }

    public final boolean L0() {
        RecyclerView recyclerView = this.f283b;
        WeakHashMap weakHashMap = F.O.f58a;
        return AbstractC0024z.d(recyclerView) == 1;
    }

    @Override // S.P
    public final void M(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f283b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1600K);
        }
        for (int i2 = 0; i2 < this.f1601p; i2++) {
            this.f1602q[i2].b();
        }
        recyclerView.requestLayout();
    }

    public final void M0(View view, int i2, int i3) {
        RecyclerView recyclerView = this.f283b;
        Rect rect = this.f1596G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        k0 k0Var = (k0) view.getLayoutParams();
        int Y0 = Y0(i2, ((ViewGroup.MarginLayoutParams) k0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) k0Var).rightMargin + rect.right);
        int Y02 = Y0(i3, ((ViewGroup.MarginLayoutParams) k0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin + rect.bottom);
        if (p0(view, Y0, Y02, k0Var)) {
            view.measure(Y0, Y02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004b, code lost:
    
        if (r8.f1605t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0050, code lost:
    
        if (r8.f1605t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005d, code lost:
    
        if (L0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006a, code lost:
    
        if (L0() == false) goto L46;
     */
    @Override // S.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View N(android.view.View r9, int r10, S.X r11, S.c0 r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N(android.view.View, int, S.X, S.c0):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x0429, code lost:
    
        if (w0() != false) goto L262;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(S.X r17, S.c0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0(S.X, S.c0, boolean):void");
    }

    @Override // S.P
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (v() > 0) {
            View C0 = C0(false);
            View B0 = B0(false);
            if (C0 == null || B0 == null) {
                return;
            }
            int D2 = P.D(C0);
            int D3 = P.D(B0);
            if (D2 < D3) {
                accessibilityEvent.setFromIndex(D2);
                accessibilityEvent.setToIndex(D3);
            } else {
                accessibilityEvent.setFromIndex(D3);
                accessibilityEvent.setToIndex(D2);
            }
        }
    }

    public final boolean O0(int i2) {
        if (this.f1605t == 0) {
            return (i2 == -1) != this.f1609x;
        }
        return ((i2 == -1) == this.f1609x) == L0();
    }

    @Override // S.P
    public final void P(X x2, c0 c0Var, View view, d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof k0)) {
            Q(view, dVar);
            return;
        }
        k0 k0Var = (k0) layoutParams;
        if (this.f1605t == 0) {
            n0 n0Var = k0Var.f433e;
            dVar.f(c.a(n0Var == null ? -1 : n0Var.f458e, 1, -1, -1, false));
        } else {
            n0 n0Var2 = k0Var.f433e;
            dVar.f(c.a(-1, -1, n0Var2 == null ? -1 : n0Var2.f458e, 1, false));
        }
    }

    public final void P0(int i2, c0 c0Var) {
        int F0;
        int i3;
        if (i2 > 0) {
            F0 = G0();
            i3 = 1;
        } else {
            F0 = F0();
            i3 = -1;
        }
        C0044u c0044u = this.f1607v;
        c0044u.f520a = true;
        W0(F0, c0Var);
        V0(i3);
        c0044u.f522c = F0 + c0044u.f523d;
        c0044u.f521b = Math.abs(i2);
    }

    public final void Q0(X x2, C0044u c0044u) {
        if (!c0044u.f520a || c0044u.f528i) {
            return;
        }
        if (c0044u.f521b == 0) {
            if (c0044u.f524e == -1) {
                R0(c0044u.f526g, x2);
                return;
            } else {
                S0(c0044u.f525f, x2);
                return;
            }
        }
        int i2 = 1;
        if (c0044u.f524e == -1) {
            int i3 = c0044u.f525f;
            int h2 = this.f1602q[0].h(i3);
            while (i2 < this.f1601p) {
                int h3 = this.f1602q[i2].h(i3);
                if (h3 > h2) {
                    h2 = h3;
                }
                i2++;
            }
            int i4 = i3 - h2;
            R0(i4 < 0 ? c0044u.f526g : c0044u.f526g - Math.min(i4, c0044u.f521b), x2);
            return;
        }
        int i5 = c0044u.f526g;
        int f2 = this.f1602q[0].f(i5);
        while (i2 < this.f1601p) {
            int f3 = this.f1602q[i2].f(i5);
            if (f3 < f2) {
                f2 = f3;
            }
            i2++;
        }
        int i6 = f2 - c0044u.f526g;
        S0(i6 < 0 ? c0044u.f525f : Math.min(i6, c0044u.f521b) + c0044u.f525f, x2);
    }

    @Override // S.P
    public final void R(int i2, int i3) {
        J0(i2, i3, 1);
    }

    public final void R0(int i2, X x2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1603r.d(u2) < i2 || this.f1603r.j(u2) < i2) {
                return;
            }
            k0 k0Var = (k0) u2.getLayoutParams();
            k0Var.getClass();
            if (k0Var.f433e.f454a.size() == 1) {
                return;
            }
            n0 n0Var = k0Var.f433e;
            ArrayList arrayList = n0Var.f454a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            k0 k0Var2 = (k0) view.getLayoutParams();
            k0Var2.f433e = null;
            if (k0Var2.f297a.j() || k0Var2.f297a.m()) {
                n0Var.f457d -= n0Var.f459f.f1603r.c(view);
            }
            if (size == 1) {
                n0Var.f455b = Integer.MIN_VALUE;
            }
            n0Var.f456c = Integer.MIN_VALUE;
            d0(u2, x2);
        }
    }

    @Override // S.P
    public final void S() {
        this.f1591B.d();
        g0();
    }

    public final void S0(int i2, X x2) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1603r.b(u2) > i2 || this.f1603r.i(u2) > i2) {
                return;
            }
            k0 k0Var = (k0) u2.getLayoutParams();
            k0Var.getClass();
            if (k0Var.f433e.f454a.size() == 1) {
                return;
            }
            n0 n0Var = k0Var.f433e;
            ArrayList arrayList = n0Var.f454a;
            View view = (View) arrayList.remove(0);
            k0 k0Var2 = (k0) view.getLayoutParams();
            k0Var2.f433e = null;
            if (arrayList.size() == 0) {
                n0Var.f456c = Integer.MIN_VALUE;
            }
            if (k0Var2.f297a.j() || k0Var2.f297a.m()) {
                n0Var.f457d -= n0Var.f459f.f1603r.c(view);
            }
            n0Var.f455b = Integer.MIN_VALUE;
            d0(u2, x2);
        }
    }

    @Override // S.P
    public final void T(int i2, int i3) {
        J0(i2, i3, 8);
    }

    public final void T0() {
        if (this.f1605t == 1 || !L0()) {
            this.f1609x = this.f1608w;
        } else {
            this.f1609x = !this.f1608w;
        }
    }

    @Override // S.P
    public final void U(int i2, int i3) {
        J0(i2, i3, 2);
    }

    public final int U0(int i2, X x2, c0 c0Var) {
        if (v() == 0 || i2 == 0) {
            return 0;
        }
        P0(i2, c0Var);
        C0044u c0044u = this.f1607v;
        int A0 = A0(x2, c0044u, c0Var);
        if (c0044u.f521b >= A0) {
            i2 = i2 < 0 ? -A0 : A0;
        }
        this.f1603r.k(-i2);
        this.f1593D = this.f1609x;
        c0044u.f521b = 0;
        Q0(x2, c0044u);
        return i2;
    }

    @Override // S.P
    public final void V(int i2, int i3) {
        J0(i2, i3, 4);
    }

    public final void V0(int i2) {
        C0044u c0044u = this.f1607v;
        c0044u.f524e = i2;
        c0044u.f523d = this.f1609x != (i2 == -1) ? -1 : 1;
    }

    @Override // S.P
    public final void W(X x2, c0 c0Var) {
        N0(x2, c0Var, true);
    }

    public final void W0(int i2, c0 c0Var) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C0044u c0044u = this.f1607v;
        boolean z2 = false;
        c0044u.f521b = 0;
        c0044u.f522c = i2;
        C0049z c0049z = this.f286e;
        if (!(c0049z != null && c0049z.f557e) || (i8 = c0Var.f334a) == -1) {
            i3 = 0;
            i4 = 0;
        } else {
            if (this.f1609x == (i8 < i2)) {
                i3 = this.f1603r.g();
                i4 = 0;
            } else {
                i4 = this.f1603r.g();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.f283b;
        if (recyclerView == null || !recyclerView.f1560g) {
            A a2 = (A) this.f1603r;
            int i9 = a2.f252d;
            P p2 = a2.f253a;
            switch (i9) {
                case 0:
                    i5 = p2.f295n;
                    break;
                default:
                    i5 = p2.f296o;
                    break;
            }
            c0044u.f526g = i5 + i3;
            c0044u.f525f = -i4;
        } else {
            c0044u.f525f = this.f1603r.f() - i4;
            c0044u.f526g = this.f1603r.e() + i3;
        }
        c0044u.f527h = false;
        c0044u.f520a = true;
        B b2 = this.f1603r;
        A a3 = (A) b2;
        int i10 = a3.f252d;
        P p3 = a3.f253a;
        switch (i10) {
            case 0:
                i6 = p3.f293l;
                break;
            default:
                i6 = p3.f294m;
                break;
        }
        if (i6 == 0) {
            A a4 = (A) b2;
            int i11 = a4.f252d;
            P p4 = a4.f253a;
            switch (i11) {
                case 0:
                    i7 = p4.f295n;
                    break;
                default:
                    i7 = p4.f296o;
                    break;
            }
            if (i7 == 0) {
                z2 = true;
            }
        }
        c0044u.f528i = z2;
    }

    @Override // S.P
    public final void X(c0 c0Var) {
        this.f1611z = -1;
        this.f1590A = Integer.MIN_VALUE;
        this.f1595F = null;
        this.f1597H.a();
    }

    public final void X0(n0 n0Var, int i2, int i3) {
        int i4 = n0Var.f457d;
        int i5 = n0Var.f458e;
        if (i2 != -1) {
            int i6 = n0Var.f456c;
            if (i6 == Integer.MIN_VALUE) {
                n0Var.a();
                i6 = n0Var.f456c;
            }
            if (i6 - i4 >= i3) {
                this.f1610y.set(i5, false);
                return;
            }
            return;
        }
        int i7 = n0Var.f455b;
        if (i7 == Integer.MIN_VALUE) {
            View view = (View) n0Var.f454a.get(0);
            k0 k0Var = (k0) view.getLayoutParams();
            n0Var.f455b = n0Var.f459f.f1603r.d(view);
            k0Var.getClass();
            i7 = n0Var.f455b;
        }
        if (i7 + i4 <= i3) {
            this.f1610y.set(i5, false);
        }
    }

    @Override // S.P
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof m0) {
            this.f1595F = (m0) parcelable;
            g0();
        }
    }

    @Override // S.P
    public final Parcelable Z() {
        int h2;
        int f2;
        int[] iArr;
        m0 m0Var = this.f1595F;
        if (m0Var != null) {
            m0 m0Var2 = new m0();
            m0Var2.f443c = m0Var.f443c;
            m0Var2.f441a = m0Var.f441a;
            m0Var2.f442b = m0Var.f442b;
            m0Var2.f444d = m0Var.f444d;
            m0Var2.f445e = m0Var.f445e;
            m0Var2.f446f = m0Var.f446f;
            m0Var2.f448h = m0Var.f448h;
            m0Var2.f449i = m0Var.f449i;
            m0Var2.f450j = m0Var.f450j;
            m0Var2.f447g = m0Var.f447g;
            return m0Var2;
        }
        m0 m0Var3 = new m0();
        m0Var3.f448h = this.f1608w;
        m0Var3.f449i = this.f1593D;
        m0Var3.f450j = this.f1594E;
        r0 r0Var = this.f1591B;
        if (r0Var == null || (iArr = (int[]) r0Var.f510b) == null) {
            m0Var3.f445e = 0;
        } else {
            m0Var3.f446f = iArr;
            m0Var3.f445e = iArr.length;
            m0Var3.f447g = (List) r0Var.f511c;
        }
        if (v() > 0) {
            m0Var3.f441a = this.f1593D ? G0() : F0();
            View B0 = this.f1609x ? B0(true) : C0(true);
            m0Var3.f442b = B0 != null ? P.D(B0) : -1;
            int i2 = this.f1601p;
            m0Var3.f443c = i2;
            m0Var3.f444d = new int[i2];
            for (int i3 = 0; i3 < this.f1601p; i3++) {
                if (this.f1593D) {
                    h2 = this.f1602q[i3].f(Integer.MIN_VALUE);
                    if (h2 != Integer.MIN_VALUE) {
                        f2 = this.f1603r.e();
                        h2 -= f2;
                        m0Var3.f444d[i3] = h2;
                    } else {
                        m0Var3.f444d[i3] = h2;
                    }
                } else {
                    h2 = this.f1602q[i3].h(Integer.MIN_VALUE);
                    if (h2 != Integer.MIN_VALUE) {
                        f2 = this.f1603r.f();
                        h2 -= f2;
                        m0Var3.f444d[i3] = h2;
                    } else {
                        m0Var3.f444d[i3] = h2;
                    }
                }
            }
        } else {
            m0Var3.f441a = -1;
            m0Var3.f442b = -1;
            m0Var3.f443c = 0;
        }
        return m0Var3;
    }

    @Override // S.b0
    public final PointF a(int i2) {
        int v0 = v0(i2);
        PointF pointF = new PointF();
        if (v0 == 0) {
            return null;
        }
        if (this.f1605t == 0) {
            pointF.x = v0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = v0;
        }
        return pointF;
    }

    @Override // S.P
    public final void a0(int i2) {
        if (i2 == 0) {
            w0();
        }
    }

    @Override // S.P
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f1595F != null || (recyclerView = this.f283b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    @Override // S.P
    public final boolean d() {
        return this.f1605t == 0;
    }

    @Override // S.P
    public final boolean e() {
        return this.f1605t == 1;
    }

    @Override // S.P
    public final boolean f(Q q2) {
        return q2 instanceof k0;
    }

    @Override // S.P
    public final void h(int i2, int i3, c0 c0Var, C0041q c0041q) {
        C0044u c0044u;
        int f2;
        int i4;
        if (this.f1605t != 0) {
            i2 = i3;
        }
        if (v() == 0 || i2 == 0) {
            return;
        }
        P0(i2, c0Var);
        int[] iArr = this.f1599J;
        if (iArr == null || iArr.length < this.f1601p) {
            this.f1599J = new int[this.f1601p];
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = this.f1601p;
            c0044u = this.f1607v;
            if (i5 >= i7) {
                break;
            }
            if (c0044u.f523d == -1) {
                f2 = c0044u.f525f;
                i4 = this.f1602q[i5].h(f2);
            } else {
                f2 = this.f1602q[i5].f(c0044u.f526g);
                i4 = c0044u.f526g;
            }
            int i8 = f2 - i4;
            if (i8 >= 0) {
                this.f1599J[i6] = i8;
                i6++;
            }
            i5++;
        }
        Arrays.sort(this.f1599J, 0, i6);
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = c0044u.f522c;
            if (i10 < 0 || i10 >= c0Var.b()) {
                return;
            }
            c0041q.a(c0044u.f522c, this.f1599J[i9]);
            c0044u.f522c += c0044u.f523d;
        }
    }

    @Override // S.P
    public final int h0(int i2, X x2, c0 c0Var) {
        return U0(i2, x2, c0Var);
    }

    @Override // S.P
    public final void i0(int i2) {
        m0 m0Var = this.f1595F;
        if (m0Var != null && m0Var.f441a != i2) {
            m0Var.f444d = null;
            m0Var.f443c = 0;
            m0Var.f441a = -1;
            m0Var.f442b = -1;
        }
        this.f1611z = i2;
        this.f1590A = Integer.MIN_VALUE;
        g0();
    }

    @Override // S.P
    public final int j(c0 c0Var) {
        return x0(c0Var);
    }

    @Override // S.P
    public final int j0(int i2, X x2, c0 c0Var) {
        return U0(i2, x2, c0Var);
    }

    @Override // S.P
    public final int k(c0 c0Var) {
        return y0(c0Var);
    }

    @Override // S.P
    public final int l(c0 c0Var) {
        return z0(c0Var);
    }

    @Override // S.P
    public final int m(c0 c0Var) {
        return x0(c0Var);
    }

    @Override // S.P
    public final void m0(Rect rect, int i2, int i3) {
        int g2;
        int g3;
        int B2 = B() + A();
        int z2 = z() + C();
        if (this.f1605t == 1) {
            int height = rect.height() + z2;
            RecyclerView recyclerView = this.f283b;
            WeakHashMap weakHashMap = F.O.f58a;
            g3 = P.g(i3, height, AbstractC0023y.d(recyclerView));
            g2 = P.g(i2, (this.f1606u * this.f1601p) + B2, AbstractC0023y.e(this.f283b));
        } else {
            int width = rect.width() + B2;
            RecyclerView recyclerView2 = this.f283b;
            WeakHashMap weakHashMap2 = F.O.f58a;
            g2 = P.g(i2, width, AbstractC0023y.e(recyclerView2));
            g3 = P.g(i3, (this.f1606u * this.f1601p) + z2, AbstractC0023y.d(this.f283b));
        }
        this.f283b.setMeasuredDimension(g2, g3);
    }

    @Override // S.P
    public final int n(c0 c0Var) {
        return y0(c0Var);
    }

    @Override // S.P
    public final int o(c0 c0Var) {
        return z0(c0Var);
    }

    @Override // S.P
    public final Q r() {
        return this.f1605t == 0 ? new k0(-2, -1) : new k0(-1, -2);
    }

    @Override // S.P
    public final Q s(Context context, AttributeSet attributeSet) {
        return new k0(context, attributeSet);
    }

    @Override // S.P
    public final void s0(RecyclerView recyclerView, int i2) {
        C0049z c0049z = new C0049z(recyclerView.getContext());
        c0049z.f553a = i2;
        t0(c0049z);
    }

    @Override // S.P
    public final Q t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new k0((ViewGroup.MarginLayoutParams) layoutParams) : new k0(layoutParams);
    }

    @Override // S.P
    public final boolean u0() {
        return this.f1595F == null;
    }

    public final int v0(int i2) {
        if (v() == 0) {
            return this.f1609x ? 1 : -1;
        }
        return (i2 < F0()) != this.f1609x ? -1 : 1;
    }

    public final boolean w0() {
        int F0;
        if (v() != 0 && this.f1592C != 0 && this.f288g) {
            if (this.f1609x) {
                F0 = G0();
                F0();
            } else {
                F0 = F0();
                G0();
            }
            r0 r0Var = this.f1591B;
            if (F0 == 0 && K0() != null) {
                r0Var.d();
                this.f287f = true;
                g0();
                return true;
            }
        }
        return false;
    }

    @Override // S.P
    public final int x(X x2, c0 c0Var) {
        return this.f1605t == 1 ? this.f1601p : super.x(x2, c0Var);
    }

    public final int x0(c0 c0Var) {
        if (v() == 0) {
            return 0;
        }
        B b2 = this.f1603r;
        boolean z2 = this.f1598I;
        return a.s(c0Var, b2, C0(!z2), B0(!z2), this, this.f1598I);
    }

    public final int y0(c0 c0Var) {
        if (v() == 0) {
            return 0;
        }
        B b2 = this.f1603r;
        boolean z2 = this.f1598I;
        return a.t(c0Var, b2, C0(!z2), B0(!z2), this, this.f1598I, this.f1609x);
    }

    public final int z0(c0 c0Var) {
        if (v() == 0) {
            return 0;
        }
        B b2 = this.f1603r;
        boolean z2 = this.f1598I;
        return a.u(c0Var, b2, C0(!z2), B0(!z2), this, this.f1598I);
    }
}
