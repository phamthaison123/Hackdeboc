package S;

import F.AbstractC0023y;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public C0028d f282a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f283b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f284c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f285d;

    /* renamed from: e, reason: collision with root package name */
    public C0049z f286e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f287f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f289h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f290i;

    /* renamed from: j, reason: collision with root package name */
    public int f291j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f292k;

    /* renamed from: l, reason: collision with root package name */
    public int f293l;

    /* renamed from: m, reason: collision with root package name */
    public int f294m;

    /* renamed from: n, reason: collision with root package name */
    public int f295n;

    /* renamed from: o, reason: collision with root package name */
    public int f296o;

    public P() {
        N n2 = new N(0, this);
        N n3 = new N(1, this);
        this.f284c = new r0(n2);
        this.f285d = new r0(n3);
        this.f287f = false;
        this.f288g = false;
        this.f289h = true;
        this.f290i = true;
    }

    public static int D(View view) {
        return ((Q) view.getLayoutParams()).f297a.c();
    }

    public static O E(Context context, AttributeSet attributeSet, int i2, int i3) {
        O o2 = new O();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.a.f251a, i2, i3);
        o2.f278a = obtainStyledAttributes.getInt(0, 1);
        o2.f279b = obtainStyledAttributes.getInt(10, 1);
        o2.f280c = obtainStyledAttributes.getBoolean(9, false);
        o2.f281d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return o2;
    }

    public static boolean I(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    public static void J(View view, int i2, int i3, int i4, int i5) {
        Q q2 = (Q) view.getLayoutParams();
        Rect rect = q2.f298b;
        view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) q2).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) q2).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) q2).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) q2).bottomMargin);
    }

    public static int g(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S.P.w(boolean, int, int, int, int):int");
    }

    public static void y(View view, Rect rect) {
        int[] iArr = RecyclerView.s0;
        Q q2 = (Q) view.getLayoutParams();
        Rect rect2 = q2.f298b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) q2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) q2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) q2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) q2).bottomMargin);
    }

    public final int A() {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int F(X x2, c0 c0Var) {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView == null || recyclerView.f1568k == null || !e()) {
            return 1;
        }
        return this.f283b.f1568k.a();
    }

    public final void G(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((Q) view.getLayoutParams()).f298b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f283b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f283b.f1566j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean H();

    public void K(int i2) {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1556e.e();
            for (int i3 = 0; i3 < e2; i3++) {
                recyclerView.f1556e.d(i3).offsetLeftAndRight(i2);
            }
        }
    }

    public void L(int i2) {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1556e.e();
            for (int i3 = 0; i3 < e2; i3++) {
                recyclerView.f1556e.d(i3).offsetTopAndBottom(i2);
            }
        }
    }

    public abstract void M(RecyclerView recyclerView);

    public abstract View N(View view, int i2, X x2, c0 c0Var);

    public void O(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f283b;
        X x2 = recyclerView.f1550b;
        c0 c0Var = recyclerView.f1553c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f283b.canScrollVertically(-1) && !this.f283b.canScrollHorizontally(-1) && !this.f283b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        G g2 = this.f283b.f1568k;
        if (g2 != null) {
            accessibilityEvent.setItemCount(g2.a());
        }
    }

    public void P(X x2, c0 c0Var, View view, G.d dVar) {
        dVar.f(G.c.a(e() ? D(view) : 0, 1, d() ? D(view) : 0, 1, false));
    }

    public final void Q(View view, G.d dVar) {
        f0 I2 = RecyclerView.I(view);
        if (I2 == null || I2.j() || this.f282a.f350c.contains(I2.f367a)) {
            return;
        }
        RecyclerView recyclerView = this.f283b;
        P(recyclerView.f1550b, recyclerView.f1553c0, view, dVar);
    }

    public void R(int i2, int i3) {
    }

    public void S() {
    }

    public void T(int i2, int i3) {
    }

    public void U(int i2, int i3) {
    }

    public void V(int i2, int i3) {
    }

    public abstract void W(X x2, c0 c0Var);

    public abstract void X(c0 c0Var);

    public abstract void Y(Parcelable parcelable);

    public abstract Parcelable Z();

    public void a0(int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r7, int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.P.b(android.view.View, int, boolean):void");
    }

    public final void b0(X x2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.I(u(v2)).q()) {
                View u2 = u(v2);
                e0(v2);
                x2.f(u2);
            }
        }
    }

    public abstract void c(String str);

    public final void c0(X x2) {
        ArrayList arrayList;
        int size = x2.f307a.size();
        int i2 = size - 1;
        while (true) {
            arrayList = x2.f307a;
            if (i2 < 0) {
                break;
            }
            View view = ((f0) arrayList.get(i2)).f367a;
            f0 I2 = RecyclerView.I(view);
            if (!I2.q()) {
                I2.p(false);
                if (I2.l()) {
                    this.f283b.removeDetachedView(view, false);
                }
                L l2 = this.f283b.f1532H;
                if (l2 != null) {
                    l2.d(I2);
                }
                I2.p(true);
                f0 I3 = RecyclerView.I(view);
                I3.f380n = null;
                I3.f381o = false;
                I3.f376j &= -33;
                x2.g(I3);
            }
            i2--;
        }
        arrayList.clear();
        ArrayList arrayList2 = x2.f308b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f283b.invalidate();
        }
    }

    public abstract boolean d();

    public final void d0(View view, X x2) {
        C0028d c0028d = this.f282a;
        F f2 = c0028d.f348a;
        int indexOfChild = f2.f263a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (c0028d.f349b.f(indexOfChild)) {
                c0028d.k(view);
            }
            f2.h(indexOfChild);
        }
        x2.f(view);
    }

    public abstract boolean e();

    public final void e0(int i2) {
        if (u(i2) != null) {
            C0028d c0028d = this.f282a;
            int f2 = c0028d.f(i2);
            F f3 = c0028d.f348a;
            View childAt = f3.f263a.getChildAt(f2);
            if (childAt == null) {
                return;
            }
            if (c0028d.f349b.f(f2)) {
                c0028d.k(childAt);
            }
            f3.h(f2);
        }
    }

    public boolean f(Q q2) {
        return q2 != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        if ((r8.bottom - r1) > r13) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.A()
            int r1 = r8.C()
            int r2 = r8.f295n
            int r3 = r8.B()
            int r2 = r2 - r3
            int r3 = r8.f296o
            int r4 = r8.z()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f283b
            java.util.WeakHashMap r7 = F.O.f58a
            int r3 = F.AbstractC0024z.d(r3)
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            if (r13 == 0) goto Laa
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L78
            goto Laf
        L78:
            int r11 = r8.A()
            int r13 = r8.C()
            int r3 = r8.f295n
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r8.f296o
            int r5 = r8.z()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r8 = r8.f283b
            android.graphics.Rect r8 = r8.f1562h
            y(r10, r8)
            int r10 = r8.left
            int r10 = r10 - r2
            if (r10 >= r3) goto Laf
            int r10 = r8.right
            int r10 = r10 - r2
            if (r10 <= r11) goto Laf
            int r10 = r8.top
            int r10 = r10 - r1
            if (r10 >= r4) goto Laf
            int r8 = r8.bottom
            int r8 = r8 - r1
            if (r8 > r13) goto Laa
            goto Laf
        Laa:
            if (r2 != 0) goto Lb0
            if (r1 == 0) goto Laf
            goto Lb0
        Laf:
            return r0
        Lb0:
            if (r12 == 0) goto Lb6
            r9.scrollBy(r2, r1)
            goto Lb9
        Lb6:
            r9.b0(r2, r1, r0)
        Lb9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S.P.f0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void g0() {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract void h(int i2, int i3, c0 c0Var, C0041q c0041q);

    public abstract int h0(int i2, X x2, c0 c0Var);

    public void i(int i2, C0041q c0041q) {
    }

    public abstract void i0(int i2);

    public abstract int j(c0 c0Var);

    public abstract int j0(int i2, X x2, c0 c0Var);

    public abstract int k(c0 c0Var);

    public final void k0(RecyclerView recyclerView) {
        l0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int l(c0 c0Var);

    public final void l0(int i2, int i3) {
        this.f295n = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        this.f293l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.s0;
        }
        this.f296o = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f294m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.s0;
        }
    }

    public abstract int m(c0 c0Var);

    public void m0(Rect rect, int i2, int i3) {
        int B2 = B() + A() + rect.width();
        int z2 = z() + C() + rect.height();
        RecyclerView recyclerView = this.f283b;
        WeakHashMap weakHashMap = F.O.f58a;
        this.f283b.setMeasuredDimension(g(i2, B2, AbstractC0023y.e(recyclerView)), g(i3, z2, AbstractC0023y.d(this.f283b)));
    }

    public abstract int n(c0 c0Var);

    public final void n0(int i2, int i3) {
        int v2 = v();
        if (v2 == 0) {
            this.f283b.n(i2, i3);
            return;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < v2; i8++) {
            View u2 = u(i8);
            Rect rect = this.f283b.f1562h;
            y(u2, rect);
            int i9 = rect.left;
            if (i9 < i7) {
                i7 = i9;
            }
            int i10 = rect.right;
            if (i10 > i4) {
                i4 = i10;
            }
            int i11 = rect.top;
            if (i11 < i5) {
                i5 = i11;
            }
            int i12 = rect.bottom;
            if (i12 > i6) {
                i6 = i12;
            }
        }
        this.f283b.f1562h.set(i7, i5, i4, i6);
        m0(this.f283b.f1562h, i2, i3);
    }

    public abstract int o(c0 c0Var);

    public final void o0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f283b = null;
            this.f282a = null;
            this.f295n = 0;
            this.f296o = 0;
        } else {
            this.f283b = recyclerView;
            this.f282a = recyclerView.f1556e;
            this.f295n = recyclerView.getWidth();
            this.f296o = recyclerView.getHeight();
        }
        this.f293l = 1073741824;
        this.f294m = 1073741824;
    }

    public final void p(X x2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            f0 I2 = RecyclerView.I(u2);
            if (!I2.q()) {
                if (!I2.h() || I2.j() || this.f283b.f1568k.f265b) {
                    u(v2);
                    this.f282a.c(v2);
                    x2.h(u2);
                    this.f283b.f1558f.l(I2);
                } else {
                    e0(v2);
                    x2.g(I2);
                }
            }
        }
    }

    public final boolean p0(View view, int i2, int i3, Q q2) {
        return (!view.isLayoutRequested() && this.f289h && I(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) q2).width) && I(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) q2).height)) ? false : true;
    }

    public View q(int i2) {
        int v2 = v();
        for (int i3 = 0; i3 < v2; i3++) {
            View u2 = u(i3);
            f0 I2 = RecyclerView.I(u2);
            if (I2 != null && I2.c() == i2 && !I2.q() && (this.f283b.f1553c0.f340g || !I2.j())) {
                return u2;
            }
        }
        return null;
    }

    public boolean q0() {
        return false;
    }

    public abstract Q r();

    public final boolean r0(View view, int i2, int i3, Q q2) {
        return (this.f289h && I(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) q2).width) && I(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) q2).height)) ? false : true;
    }

    public Q s(Context context, AttributeSet attributeSet) {
        return new Q(context, attributeSet);
    }

    public abstract void s0(RecyclerView recyclerView, int i2);

    public Q t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Q ? new Q((Q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new Q((ViewGroup.MarginLayoutParams) layoutParams) : new Q(layoutParams);
    }

    public final void t0(C0049z c0049z) {
        C0049z c0049z2 = this.f286e;
        if (c0049z2 != null && c0049z != c0049z2 && c0049z2.f557e) {
            c0049z2.g();
        }
        this.f286e = c0049z;
        RecyclerView recyclerView = this.f283b;
        e0 e0Var = recyclerView.f1547W;
        e0Var.f360g.removeCallbacks(e0Var);
        e0Var.f356c.abortAnimation();
        if (c0049z.f560h) {
            Log.w("RecyclerView", "An instance of " + c0049z.getClass().getSimpleName() + " was started more than once. Each instance of" + c0049z.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0049z.f554b = recyclerView;
        c0049z.f555c = this;
        int i2 = c0049z.f553a;
        if (i2 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1553c0.f334a = i2;
        c0049z.f557e = true;
        c0049z.f556d = true;
        c0049z.f558f = recyclerView.f1569l.q(i2);
        c0049z.f554b.f1547W.a();
        c0049z.f560h = true;
    }

    public final View u(int i2) {
        C0028d c0028d = this.f282a;
        if (c0028d != null) {
            return c0028d.d(i2);
        }
        return null;
    }

    public abstract boolean u0();

    public final int v() {
        C0028d c0028d = this.f282a;
        if (c0028d != null) {
            return c0028d.e();
        }
        return 0;
    }

    public int x(X x2, c0 c0Var) {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView == null || recyclerView.f1568k == null || !d()) {
            return 1;
        }
        return this.f283b.f1568k.a();
    }

    public final int z() {
        RecyclerView recyclerView = this.f283b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }
}
