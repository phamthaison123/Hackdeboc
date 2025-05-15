package androidx.recyclerview.widget;

import F.AbstractC0023y;
import F.C0011l;
import F.InterfaceC0010k;
import F.O;
import L.d;
import R.a;
import S.C0025a;
import S.C0026b;
import S.C0028d;
import S.C0035k;
import S.C0040p;
import S.C0041q;
import S.C0049z;
import S.E;
import S.F;
import S.G;
import S.I;
import S.J;
import S.K;
import S.L;
import S.M;
import S.P;
import S.Q;
import S.RunnableC0042s;
import S.S;
import S.T;
import S.U;
import S.V;
import S.W;
import S.X;
import S.Y;
import S.Z;
import S.c0;
import S.d0;
import S.e0;
import S.f0;
import S.h0;
import S.q0;
import S.r0;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0193e;
import m0.e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0010k {
    public static final int[] s0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] t0;
    public static final d u0;

    /* renamed from: A, reason: collision with root package name */
    public int f1525A;

    /* renamed from: B, reason: collision with root package name */
    public int f1526B;

    /* renamed from: C, reason: collision with root package name */
    public J f1527C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1528D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1529E;

    /* renamed from: F, reason: collision with root package name */
    public EdgeEffect f1530F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1531G;

    /* renamed from: H, reason: collision with root package name */
    public L f1532H;

    /* renamed from: I, reason: collision with root package name */
    public int f1533I;

    /* renamed from: J, reason: collision with root package name */
    public int f1534J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1535K;

    /* renamed from: L, reason: collision with root package name */
    public int f1536L;

    /* renamed from: M, reason: collision with root package name */
    public int f1537M;

    /* renamed from: N, reason: collision with root package name */
    public int f1538N;

    /* renamed from: O, reason: collision with root package name */
    public int f1539O;

    /* renamed from: P, reason: collision with root package name */
    public int f1540P;

    /* renamed from: Q, reason: collision with root package name */
    public S f1541Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1542R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1543S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1544T;

    /* renamed from: U, reason: collision with root package name */
    public final float f1545U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1546V;

    /* renamed from: W, reason: collision with root package name */
    public final e0 f1547W;

    /* renamed from: a, reason: collision with root package name */
    public final e f1548a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0042s f1549a0;

    /* renamed from: b, reason: collision with root package name */
    public final X f1550b;

    /* renamed from: b0, reason: collision with root package name */
    public final C0041q f1551b0;

    /* renamed from: c, reason: collision with root package name */
    public Z f1552c;

    /* renamed from: c0, reason: collision with root package name */
    public final c0 f1553c0;

    /* renamed from: d, reason: collision with root package name */
    public final C0026b f1554d;

    /* renamed from: d0, reason: collision with root package name */
    public U f1555d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0028d f1556e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f1557e0;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f1558f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1559f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1560g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1561g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f1562h;

    /* renamed from: h0, reason: collision with root package name */
    public final F f1563h0;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f1564i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1565i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1566j;

    /* renamed from: j0, reason: collision with root package name */
    public h0 f1567j0;

    /* renamed from: k, reason: collision with root package name */
    public G f1568k;
    public final int[] k0;

    /* renamed from: l, reason: collision with root package name */
    public P f1569l;

    /* renamed from: l0, reason: collision with root package name */
    public C0011l f1570l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1571m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f1572m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1573n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f1574n0;

    /* renamed from: o, reason: collision with root package name */
    public T f1575o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1576o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1577p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f1578p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1579q;

    /* renamed from: q0, reason: collision with root package name */
    public final E f1580q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1581r;
    public final F r0;

    /* renamed from: s, reason: collision with root package name */
    public int f1582s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1583t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1584u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1585v;

    /* renamed from: w, reason: collision with root package name */
    public int f1586w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1587x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1588y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1589z;

    static {
        Class cls = Integer.TYPE;
        t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        u0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969325);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i2));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static f0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((Q) view.getLayoutParams()).f297a;
    }

    private C0011l getScrollingChildHelper() {
        if (this.f1570l0 == null) {
            this.f1570l0 = new C0011l(this);
        }
        return this.f1570l0;
    }

    public static void j(f0 f0Var) {
        WeakReference weakReference = f0Var.f368b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == f0Var.f367a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            f0Var.f368b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A(android.view.View):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r7 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            java.util.ArrayList r1 = r12.f1573n
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L6c
            java.lang.Object r5 = r1.get(r4)
            S.T r5 = (S.T) r5
            r6 = r5
            S.p r6 = (S.C0040p) r6
            int r7 = r6.f491v
            r8 = 1
            r9 = 2
            if (r7 != r8) goto L5c
            float r7 = r13.getX()
            float r10 = r13.getY()
            boolean r7 = r6.d(r7, r10)
            float r10 = r13.getX()
            float r11 = r13.getY()
            boolean r10 = r6.c(r10, r11)
            int r11 = r13.getAction()
            if (r11 != 0) goto L60
            if (r7 != 0) goto L3f
            if (r10 == 0) goto L60
        L3f:
            if (r10 == 0) goto L4c
            r6.f492w = r8
            float r7 = r13.getX()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f485p = r7
            goto L58
        L4c:
            if (r7 == 0) goto L58
            r6.f492w = r9
            float r7 = r13.getY()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f482m = r7
        L58:
            r6.f(r9)
            goto L5e
        L5c:
            if (r7 != r9) goto L60
        L5e:
            r6 = r8
            goto L61
        L60:
            r6 = r3
        L61:
            if (r6 == 0) goto L69
            r6 = 3
            if (r0 == r6) goto L69
            r12.f1575o = r5
            return r8
        L69:
            int r4 = r4 + 1
            goto Lc
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.MotionEvent):boolean");
    }

    public final void C(int[] iArr) {
        int e2 = this.f1556e.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            f0 I2 = I(this.f1556e.d(i4));
            if (!I2.q()) {
                int c2 = I2.c();
                if (c2 < i2) {
                    i2 = c2;
                }
                if (c2 > i3) {
                    i3 = c2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final f0 E(int i2) {
        f0 f0Var = null;
        if (this.f1588y) {
            return null;
        }
        int h2 = this.f1556e.h();
        for (int i3 = 0; i3 < h2; i3++) {
            f0 I2 = I(this.f1556e.g(i3));
            if (I2 != null && !I2.j() && F(I2) == i2) {
                if (!this.f1556e.j(I2.f367a)) {
                    return I2;
                }
                f0Var = I2;
            }
        }
        return f0Var;
    }

    public final int F(f0 f0Var) {
        if (f0Var.e(524) || !f0Var.g()) {
            return -1;
        }
        C0026b c0026b = this.f1554d;
        int i2 = f0Var.f369c;
        ArrayList arrayList = c0026b.f328b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0025a c0025a = (C0025a) arrayList.get(i3);
            int i4 = c0025a.f316a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = c0025a.f317b;
                    if (i5 <= i2) {
                        int i6 = c0025a.f319d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = c0025a.f317b;
                    if (i7 == i2) {
                        i2 = c0025a.f319d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (c0025a.f319d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (c0025a.f317b <= i2) {
                i2 += c0025a.f319d;
            }
        }
        return i2;
    }

    public final long G(f0 f0Var) {
        return this.f1568k.f265b ? f0Var.f371e : f0Var.f369c;
    }

    public final f0 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        Q q2 = (Q) view.getLayoutParams();
        boolean z2 = q2.f299c;
        Rect rect = q2.f298b;
        if (!z2) {
            return rect;
        }
        if (this.f1553c0.f340g && (q2.f297a.m() || q2.f297a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1571m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f1562h;
            rect2.set(0, 0, 0, 0);
            ((M) arrayList.get(i2)).getClass();
            ((Q) view.getLayoutParams()).f297a.c();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        q2.f299c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f1581r || this.f1588y || this.f1554d.g();
    }

    public final boolean L() {
        return this.f1525A > 0;
    }

    public final void M(int i2) {
        if (this.f1569l == null) {
            return;
        }
        setScrollState(2);
        this.f1569l.i0(i2);
        awakenScrollBars();
    }

    public final void N() {
        int h2 = this.f1556e.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((Q) this.f1556e.g(i2).getLayoutParams()).f299c = true;
        }
        ArrayList arrayList = this.f1550b.f309c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Q q2 = (Q) ((f0) arrayList.get(i3)).f367a.getLayoutParams();
            if (q2 != null) {
                q2.f299c = true;
            }
        }
    }

    public final void O(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.f1556e.h();
        for (int i5 = 0; i5 < h2; i5++) {
            f0 I2 = I(this.f1556e.g(i5));
            if (I2 != null && !I2.q()) {
                int i6 = I2.f369c;
                c0 c0Var = this.f1553c0;
                if (i6 >= i4) {
                    I2.n(-i3, z2);
                    c0Var.f339f = true;
                } else if (i6 >= i2) {
                    I2.b(8);
                    I2.n(-i3, z2);
                    I2.f369c = i2 - 1;
                    c0Var.f339f = true;
                }
            }
        }
        X x2 = this.f1550b;
        ArrayList arrayList = x2.f309c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) arrayList.get(size);
            if (f0Var != null) {
                int i7 = f0Var.f369c;
                if (i7 >= i4) {
                    f0Var.n(-i3, z2);
                } else if (i7 >= i2) {
                    f0Var.b(8);
                    x2.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1525A++;
    }

    public final void Q(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.f1525A - 1;
        this.f1525A = i3;
        if (i3 < 1) {
            this.f1525A = 0;
            if (z2) {
                int i4 = this.f1586w;
                this.f1586w = 0;
                if (i4 != 0 && (accessibilityManager = this.f1587x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1578p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    f0 f0Var = (f0) arrayList.get(size);
                    if (f0Var.f367a.getParent() == this && !f0Var.q() && (i2 = f0Var.f383q) != -1) {
                        WeakHashMap weakHashMap = O.f58a;
                        AbstractC0023y.s(f0Var.f367a, i2);
                        f0Var.f383q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1534J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1534J = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f1538N = x2;
            this.f1536L = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f1539O = y2;
            this.f1537M = y2;
        }
    }

    public final void S() {
        if (this.f1565i0 || !this.f1577p) {
            return;
        }
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.m(this, this.f1580q0);
        this.f1565i0 = true;
    }

    public final void T() {
        boolean z2;
        if (this.f1588y) {
            C0026b c0026b = this.f1554d;
            c0026b.l(c0026b.f328b);
            c0026b.l(c0026b.f329c);
            if (this.f1589z) {
                this.f1569l.S();
            }
        }
        if (this.f1532H == null || !this.f1569l.u0()) {
            this.f1554d.c();
        } else {
            this.f1554d.j();
        }
        boolean z3 = this.f1559f0 || this.f1561g0;
        boolean z4 = this.f1581r && this.f1532H != null && ((z2 = this.f1588y) || z3 || this.f1569l.f287f) && (!z2 || this.f1568k.f265b);
        c0 c0Var = this.f1553c0;
        c0Var.f343j = z4;
        c0Var.f344k = z4 && z3 && !this.f1588y && this.f1532H != null && this.f1569l.u0();
    }

    public final void U(boolean z2) {
        this.f1589z = z2 | this.f1589z;
        this.f1588y = true;
        int h2 = this.f1556e.h();
        for (int i2 = 0; i2 < h2; i2++) {
            f0 I2 = I(this.f1556e.g(i2));
            if (I2 != null && !I2.q()) {
                I2.b(6);
            }
        }
        N();
        X x2 = this.f1550b;
        ArrayList arrayList = x2.f309c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            f0 f0Var = (f0) arrayList.get(i3);
            if (f0Var != null) {
                f0Var.b(6);
                f0Var.a(null);
            }
        }
        G g2 = x2.f314h.f1568k;
        if (g2 == null || !g2.f265b) {
            x2.d();
        }
    }

    public final void V(f0 f0Var, K k2) {
        f0Var.f376j &= -8193;
        boolean z2 = this.f1553c0.f341h;
        r0 r0Var = this.f1558f;
        if (z2 && f0Var.m() && !f0Var.j() && !f0Var.q()) {
            ((C0193e) r0Var.f511c).e(G(f0Var), f0Var);
        }
        r0Var.c(f0Var, k2);
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1562h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof Q) {
            Q q2 = (Q) layoutParams;
            if (!q2.f299c) {
                int i2 = rect.left;
                Rect rect2 = q2.f298b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1569l.f0(this, view, this.f1562h, !this.f1581r, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.f1535K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        e0(0);
        EdgeEffect edgeEffect = this.f1528D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1528D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1529E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1529E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1530F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1530F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1531G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1531G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = O.f58a;
            AbstractC0023y.k(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010b, code lost:
    
        if (r3 == 0.0f) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y(int r19, int r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent):boolean");
    }

    public final void Z(int i2, int i3, int[] iArr) {
        f0 f0Var;
        c0();
        P();
        Trace.beginSection("RV Scroll");
        c0 c0Var = this.f1553c0;
        z(c0Var);
        X x2 = this.f1550b;
        int h02 = i2 != 0 ? this.f1569l.h0(i2, x2, c0Var) : 0;
        int j02 = i3 != 0 ? this.f1569l.j0(i3, x2, c0Var) : 0;
        Trace.endSection();
        int e2 = this.f1556e.e();
        for (int i4 = 0; i4 < e2; i4++) {
            View d2 = this.f1556e.d(i4);
            f0 H2 = H(d2);
            if (H2 != null && (f0Var = H2.f375i) != null) {
                int left = d2.getLeft();
                int top = d2.getTop();
                View view = f0Var.f367a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = h02;
            iArr[1] = j02;
        }
    }

    public final void a0(int i2) {
        C0049z c0049z;
        if (this.f1584u) {
            return;
        }
        setScrollState(0);
        e0 e0Var = this.f1547W;
        e0Var.f360g.removeCallbacks(e0Var);
        e0Var.f356c.abortAnimation();
        P p2 = this.f1569l;
        if (p2 != null && (c0049z = p2.f286e) != null) {
            c0049z.g();
        }
        P p3 = this.f1569l;
        if (p3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            p3.i0(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        P p2 = this.f1569l;
        if (p2 != null) {
            p2.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b0(int i2, int i3, boolean z2) {
        P p2 = this.f1569l;
        if (p2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1584u) {
            return;
        }
        if (!p2.d()) {
            i2 = 0;
        }
        if (!this.f1569l.e()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (z2) {
            int i4 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().h(i4, 1);
        }
        this.f1547W.b(i2, i3, Integer.MIN_VALUE, null);
    }

    public final void c0() {
        int i2 = this.f1582s + 1;
        this.f1582s = i2;
        if (i2 != 1 || this.f1584u) {
            return;
        }
        this.f1583t = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof Q) && this.f1569l.f((Q) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        P p2 = this.f1569l;
        if (p2 != null && p2.d()) {
            return this.f1569l.j(this.f1553c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        P p2 = this.f1569l;
        if (p2 != null && p2.d()) {
            return this.f1569l.k(this.f1553c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        P p2 = this.f1569l;
        if (p2 != null && p2.d()) {
            return this.f1569l.l(this.f1553c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        P p2 = this.f1569l;
        if (p2 != null && p2.e()) {
            return this.f1569l.m(this.f1553c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        P p2 = this.f1569l;
        if (p2 != null && p2.e()) {
            return this.f1569l.n(this.f1553c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        P p2 = this.f1569l;
        if (p2 != null && p2.e()) {
            return this.f1569l.o(this.f1553c0);
        }
        return 0;
    }

    public final void d0(boolean z2) {
        if (this.f1582s < 1) {
            this.f1582s = 1;
        }
        if (!z2 && !this.f1584u) {
            this.f1583t = false;
        }
        if (this.f1582s == 1) {
            if (z2 && this.f1583t && !this.f1584u && this.f1569l != null && this.f1568k != null) {
                o();
            }
            if (!this.f1584u) {
                this.f1583t = false;
            }
        }
        this.f1582s--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f1571m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((M) arrayList.get(i2)).b(canvas);
        }
        EdgeEffect edgeEffect = this.f1528D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1560g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1528D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1529E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1560g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1529E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1530F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1560g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1530F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1531G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1560g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1531G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1532H == null || arrayList.size() <= 0 || !this.f1532H.f()) && !z2) {
            return;
        }
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.k(this);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i2) {
        getScrollingChildHelper().i(i2);
    }

    public final void f(f0 f0Var) {
        View view = f0Var.f367a;
        boolean z2 = view.getParent() == this;
        this.f1550b.j(H(view));
        if (f0Var.l()) {
            this.f1556e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1556e.a(view, -1, true);
            return;
        }
        C0028d c0028d = this.f1556e;
        int indexOfChild = c0028d.f348a.f263a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0028d.f349b.h(indexOfChild);
            c0028d.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x007b, code lost:
    
        m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0082, code lost:
    
        if (A(r18) != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0084, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0085, code lost:
    
        c0();
        r17.f1569l.N(r18, r19, r8, r7);
        d0(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0079, code lost:
    
        if (r3 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r6.findNextFocus(r17, r18, (F.AbstractC0024z.d(r3) == 1) ^ (r19 == 2) ? 66 : 17) == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        r3 = r6.findNextFocus(r17, r18, r19);
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(M m2) {
        P p2 = this.f1569l;
        if (p2 != null) {
            p2.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1571m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(m2);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        P p2 = this.f1569l;
        if (p2 != null) {
            return p2.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        P p2 = this.f1569l;
        if (p2 != null) {
            return p2.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public G getAdapter() {
        return this.f1568k;
    }

    @Override // android.view.View
    public int getBaseline() {
        P p2 = this.f1569l;
        if (p2 == null) {
            return super.getBaseline();
        }
        p2.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1560g;
    }

    public h0 getCompatAccessibilityDelegate() {
        return this.f1567j0;
    }

    public J getEdgeEffectFactory() {
        return this.f1527C;
    }

    public L getItemAnimator() {
        return this.f1532H;
    }

    public int getItemDecorationCount() {
        return this.f1571m.size();
    }

    public P getLayoutManager() {
        return this.f1569l;
    }

    public int getMaxFlingVelocity() {
        return this.f1543S;
    }

    public int getMinFlingVelocity() {
        return this.f1542R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public S getOnFlingListener() {
        return this.f1541Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1546V;
    }

    public W getRecycledViewPool() {
        return this.f1550b.c();
    }

    public int getScrollState() {
        return this.f1533I;
    }

    public final void h(U u2) {
        if (this.f1557e0 == null) {
            this.f1557e0 = new ArrayList();
        }
        this.f1557e0.add(u2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f1526B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1577p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1584u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f100d;
    }

    public final void k() {
        int h2 = this.f1556e.h();
        for (int i2 = 0; i2 < h2; i2++) {
            f0 I2 = I(this.f1556e.g(i2));
            if (!I2.q()) {
                I2.f370d = -1;
                I2.f373g = -1;
            }
        }
        X x2 = this.f1550b;
        ArrayList arrayList = x2.f309c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            f0 f0Var = (f0) arrayList.get(i3);
            f0Var.f370d = -1;
            f0Var.f373g = -1;
        }
        ArrayList arrayList2 = x2.f307a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            f0 f0Var2 = (f0) arrayList2.get(i4);
            f0Var2.f370d = -1;
            f0Var2.f373g = -1;
        }
        ArrayList arrayList3 = x2.f308b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                f0 f0Var3 = (f0) x2.f308b.get(i5);
                f0Var3.f370d = -1;
                f0Var3.f373g = -1;
            }
        }
    }

    public final void l(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1528D;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.f1528D.onRelease();
            z2 = this.f1528D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1530F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1530F.onRelease();
            z2 |= this.f1530F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1529E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1529E.onRelease();
            z2 |= this.f1529E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1531G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f1531G.onRelease();
            z2 |= this.f1531G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = O.f58a;
            AbstractC0023y.k(this);
        }
    }

    public final void m() {
        if (!this.f1581r || this.f1588y) {
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
        } else if (this.f1554d.g()) {
            this.f1554d.getClass();
            if (this.f1554d.g()) {
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = O.f58a;
        setMeasuredDimension(P.g(i2, paddingRight, AbstractC0023y.e(this)), P.g(i3, getPaddingBottom() + getPaddingTop(), AbstractC0023y.d(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0311, code lost:
    
        if (r18.f1556e.f350c.contains(getFocusedChild()) == false) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b7  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [S.f0] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f1525A = r0
            r1 = 1
            r5.f1577p = r1
            boolean r2 = r5.f1581r
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f1581r = r2
            S.P r2 = r5.f1569l
            if (r2 == 0) goto L1e
            r2.f288g = r1
        L1e:
            r5.f1565i0 = r0
            java.lang.ThreadLocal r0 = S.RunnableC0042s.f512e
            java.lang.Object r1 = r0.get()
            S.s r1 = (S.RunnableC0042s) r1
            r5.f1549a0 = r1
            if (r1 != 0) goto L68
            S.s r1 = new S.s
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f514a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f517d = r2
            r5.f1549a0 = r1
            java.util.WeakHashMap r1 = F.O.f58a
            android.view.Display r1 = F.AbstractC0024z.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5a
            if (r1 == 0) goto L5a
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5a
            goto L5c
        L5a:
            r1 = 1114636288(0x42700000, float:60.0)
        L5c:
            S.s r2 = r5.f1549a0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f516c = r3
            r0.set(r2)
        L68:
            S.s r0 = r5.f1549a0
            java.util.ArrayList r0 = r0.f514a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0049z c0049z;
        super.onDetachedFromWindow();
        L l2 = this.f1532H;
        if (l2 != null) {
            l2.e();
        }
        setScrollState(0);
        e0 e0Var = this.f1547W;
        e0Var.f360g.removeCallbacks(e0Var);
        e0Var.f356c.abortAnimation();
        P p2 = this.f1569l;
        if (p2 != null && (c0049z = p2.f286e) != null) {
            c0049z.g();
        }
        this.f1577p = false;
        P p3 = this.f1569l;
        if (p3 != null) {
            p3.f288g = false;
            p3.M(this);
        }
        this.f1578p0.clear();
        removeCallbacks(this.f1580q0);
        this.f1558f.getClass();
        while (q0.f500d.a() != null) {
        }
        RunnableC0042s runnableC0042s = this.f1549a0;
        if (runnableC0042s != null) {
            runnableC0042s.f514a.remove(this);
            this.f1549a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1571m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((M) arrayList.get(i2)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            S.P r0 = r5.f1569l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f1584u
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            S.P r0 = r5.f1569l
            boolean r0 = r0.e()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            S.P r3 = r5.f1569l
            boolean r3 = r3.d()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            S.P r3 = r5.f1569l
            boolean r3 = r3.e()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            S.P r3 = r5.f1569l
            boolean r3 = r3.d()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f1544T
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f1545U
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.Y(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f1581r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        P p2 = this.f1569l;
        if (p2 == null) {
            n(i2, i3);
            return;
        }
        boolean H2 = p2.H();
        c0 c0Var = this.f1553c0;
        if (!H2) {
            if (this.f1579q) {
                this.f1569l.f283b.n(i2, i3);
                return;
            }
            if (c0Var.f344k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            G g2 = this.f1568k;
            if (g2 != null) {
                c0Var.f338e = g2.a();
            } else {
                c0Var.f338e = 0;
            }
            c0();
            this.f1569l.f283b.n(i2, i3);
            d0(false);
            c0Var.f340g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        this.f1569l.f283b.n(i2, i3);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1568k == null) {
            return;
        }
        if (c0Var.f337d == 1) {
            p();
        }
        this.f1569l.l0(i2, i3);
        c0Var.f342i = true;
        q();
        this.f1569l.n0(i2, i3);
        if (this.f1569l.q0()) {
            this.f1569l.l0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c0Var.f342i = true;
            q();
            this.f1569l.n0(i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof Z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Z z2 = (Z) parcelable;
        this.f1552c = z2;
        super.onRestoreInstanceState(z2.f173a);
        P p2 = this.f1569l;
        if (p2 == null || (parcelable2 = this.f1552c.f315c) == null) {
            return;
        }
        p2.Y(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Z z2 = new Z(super.onSaveInstanceState());
        Z z3 = this.f1552c;
        if (z3 != null) {
            z2.f315c = z3.f315c;
        } else {
            P p2 = this.f1569l;
            if (p2 != null) {
                z2.f315c = p2.Z();
            } else {
                z2.f315c = null;
            }
        }
        return z2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        this.f1531G = null;
        this.f1529E = null;
        this.f1530F = null;
        this.f1528D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        c0();
        P();
        c0 c0Var = this.f1553c0;
        c0Var.a(6);
        this.f1554d.c();
        c0Var.f338e = this.f1568k.a();
        c0Var.f336c = 0;
        c0Var.f340g = false;
        this.f1569l.W(this.f1550b, c0Var);
        c0Var.f339f = false;
        this.f1552c = null;
        c0Var.f343j = c0Var.f343j && this.f1532H != null;
        c0Var.f337d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        f0 I2 = I(view);
        if (I2 != null) {
            if (I2.l()) {
                I2.f376j &= -257;
            } else if (!I2.q()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0049z c0049z = this.f1569l.f286e;
        if ((c0049z == null || !c0049z.f557e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1569l.f0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1573n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((T) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1582s != 0 || this.f1584u) {
            this.f1583t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        P p2 = this.f1569l;
        if (p2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1584u) {
            return;
        }
        boolean d2 = p2.d();
        boolean e2 = this.f1569l.e();
        if (d2 || e2) {
            if (!d2) {
                i2 = 0;
            }
            if (!e2) {
                i3 = 0;
            }
            Y(i2, i3, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1586w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(h0 h0Var) {
        this.f1567j0 = h0Var;
        O.h(this, h0Var);
    }

    public void setAdapter(G g2) {
        setLayoutFrozen(false);
        G g3 = this.f1568k;
        e eVar = this.f1548a;
        if (g3 != null) {
            g3.f264a.unregisterObserver(eVar);
            this.f1568k.getClass();
        }
        L l2 = this.f1532H;
        if (l2 != null) {
            l2.e();
        }
        P p2 = this.f1569l;
        X x2 = this.f1550b;
        if (p2 != null) {
            p2.b0(x2);
            this.f1569l.c0(x2);
        }
        x2.f307a.clear();
        x2.d();
        C0026b c0026b = this.f1554d;
        c0026b.l(c0026b.f328b);
        c0026b.l(c0026b.f329c);
        G g4 = this.f1568k;
        this.f1568k = g2;
        if (g2 != null) {
            g2.f264a.registerObserver(eVar);
        }
        G g5 = this.f1568k;
        x2.f307a.clear();
        x2.d();
        W c2 = x2.c();
        if (g4 != null) {
            c2.f306b--;
        }
        if (c2.f306b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c2.f305a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((V) sparseArray.valueAt(i2)).f301a.clear();
                i2++;
            }
        }
        if (g5 != null) {
            c2.f306b++;
        }
        this.f1553c0.f339f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(I i2) {
        if (i2 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1560g) {
            this.f1531G = null;
            this.f1529E = null;
            this.f1530F = null;
            this.f1528D = null;
        }
        this.f1560g = z2;
        super.setClipToPadding(z2);
        if (this.f1581r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(J j2) {
        j2.getClass();
        this.f1527C = j2;
        this.f1531G = null;
        this.f1529E = null;
        this.f1530F = null;
        this.f1528D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1579q = z2;
    }

    public void setItemAnimator(L l2) {
        L l3 = this.f1532H;
        if (l3 != null) {
            l3.e();
            this.f1532H.f270a = null;
        }
        this.f1532H = l2;
        if (l2 != null) {
            l2.f270a = this.f1563h0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        X x2 = this.f1550b;
        x2.f311e = i2;
        x2.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(P p2) {
        F f2;
        C0049z c0049z;
        if (p2 == this.f1569l) {
            return;
        }
        setScrollState(0);
        e0 e0Var = this.f1547W;
        e0Var.f360g.removeCallbacks(e0Var);
        e0Var.f356c.abortAnimation();
        P p3 = this.f1569l;
        if (p3 != null && (c0049z = p3.f286e) != null) {
            c0049z.g();
        }
        P p4 = this.f1569l;
        X x2 = this.f1550b;
        if (p4 != null) {
            L l2 = this.f1532H;
            if (l2 != null) {
                l2.e();
            }
            this.f1569l.b0(x2);
            this.f1569l.c0(x2);
            x2.f307a.clear();
            x2.d();
            if (this.f1577p) {
                P p5 = this.f1569l;
                p5.f288g = false;
                p5.M(this);
            }
            this.f1569l.o0(null);
            this.f1569l = null;
        } else {
            x2.f307a.clear();
            x2.d();
        }
        C0028d c0028d = this.f1556e;
        c0028d.f349b.g();
        ArrayList arrayList = c0028d.f350c;
        int size = arrayList.size() - 1;
        while (true) {
            f2 = c0028d.f348a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            f2.getClass();
            f0 I2 = I(view);
            if (I2 != null) {
                int i2 = I2.f382p;
                RecyclerView recyclerView = f2.f263a;
                if (recyclerView.L()) {
                    I2.f383q = i2;
                    recyclerView.f1578p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = O.f58a;
                    AbstractC0023y.s(I2.f367a, i2);
                }
                I2.f382p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = f2.f263a;
        int childCount = recyclerView2.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView2.getChildAt(i3);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.f1569l = p2;
        if (p2 != null) {
            if (p2.f283b != null) {
                throw new IllegalArgumentException("LayoutManager " + p2 + " is already attached to a RecyclerView:" + p2.f283b.y());
            }
            p2.o0(this);
            if (this.f1577p) {
                this.f1569l.f288g = true;
            }
        }
        x2.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0011l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f100d) {
            WeakHashMap weakHashMap = O.f58a;
            F.E.z(scrollingChildHelper.f99c);
        }
        scrollingChildHelper.f100d = z2;
    }

    public void setOnFlingListener(S s2) {
        this.f1541Q = s2;
    }

    @Deprecated
    public void setOnScrollListener(U u2) {
        this.f1555d0 = u2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1546V = z2;
    }

    public void setRecycledViewPool(W w2) {
        X x2 = this.f1550b;
        if (x2.f313g != null) {
            r0.f306b--;
        }
        x2.f313g = w2;
        if (w2 == null || x2.f314h.getAdapter() == null) {
            return;
        }
        x2.f313g.f306b++;
    }

    public void setRecyclerListener(Y y2) {
    }

    public void setScrollState(int i2) {
        C0049z c0049z;
        if (i2 == this.f1533I) {
            return;
        }
        this.f1533I = i2;
        if (i2 != 2) {
            e0 e0Var = this.f1547W;
            e0Var.f360g.removeCallbacks(e0Var);
            e0Var.f356c.abortAnimation();
            P p2 = this.f1569l;
            if (p2 != null && (c0049z = p2.f286e) != null) {
                c0049z.g();
            }
        }
        P p3 = this.f1569l;
        if (p3 != null) {
            p3.a0(i2);
        }
        U u2 = this.f1555d0;
        if (u2 != null) {
            u2.a(this, i2);
        }
        ArrayList arrayList = this.f1557e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((U) this.f1557e0.get(size)).a(this, i2);
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.f1540P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.f1540P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.f1550b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().h(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0049z c0049z;
        if (z2 != this.f1584u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1584u = false;
                if (this.f1583t && this.f1569l != null && this.f1568k != null) {
                    requestLayout();
                }
                this.f1583t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1584u = true;
            this.f1585v = true;
            setScrollState(0);
            e0 e0Var = this.f1547W;
            e0Var.f360g.removeCallbacks(e0Var);
            e0Var.f356c.abortAnimation();
            P p2 = this.f1569l;
            if (p2 == null || (c0049z = p2.f286e) == null) {
                return;
            }
            c0049z.g();
        }
    }

    public final void t(int i2, int i3) {
        this.f1526B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        U u2 = this.f1555d0;
        if (u2 != null) {
            u2.b(this, i2, i3);
        }
        ArrayList arrayList = this.f1557e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((U) this.f1557e0.get(size)).b(this, i2, i3);
            }
        }
        this.f1526B--;
    }

    public final void u() {
        if (this.f1531G != null) {
            return;
        }
        this.f1527C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1531G = edgeEffect;
        if (this.f1560g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f1528D != null) {
            return;
        }
        this.f1527C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1528D = edgeEffect;
        if (this.f1560g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f1530F != null) {
            return;
        }
        this.f1527C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1530F = edgeEffect;
        if (this.f1560g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1529E != null) {
            return;
        }
        this.f1527C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1529E = edgeEffect;
        if (this.f1560g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1568k + ", layout:" + this.f1569l + ", context:" + getContext();
    }

    public final void z(c0 c0Var) {
        if (getScrollState() != 2) {
            c0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f1547W.f356c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        char c2;
        boolean z2;
        Object[] objArr;
        Constructor constructor;
        this.f1548a = new e(this);
        this.f1550b = new X(this);
        this.f1558f = new r0(0);
        this.f1562h = new Rect();
        this.f1564i = new Rect();
        this.f1566j = new RectF();
        this.f1571m = new ArrayList();
        this.f1573n = new ArrayList();
        this.f1582s = 0;
        this.f1588y = false;
        this.f1589z = false;
        this.f1525A = 0;
        this.f1526B = 0;
        this.f1527C = new J();
        C0035k c0035k = new C0035k();
        c0035k.f270a = null;
        c0035k.f271b = new ArrayList();
        c0035k.f272c = 120L;
        c0035k.f273d = 120L;
        c0035k.f274e = 250L;
        c0035k.f275f = 250L;
        c0035k.f421g = true;
        c0035k.f422h = new ArrayList();
        c0035k.f423i = new ArrayList();
        c0035k.f424j = new ArrayList();
        c0035k.f425k = new ArrayList();
        c0035k.f426l = new ArrayList();
        c0035k.f427m = new ArrayList();
        c0035k.f428n = new ArrayList();
        c0035k.f429o = new ArrayList();
        c0035k.f430p = new ArrayList();
        c0035k.f431q = new ArrayList();
        c0035k.f432r = new ArrayList();
        this.f1532H = c0035k;
        this.f1533I = 0;
        this.f1534J = -1;
        this.f1544T = Float.MIN_VALUE;
        this.f1545U = Float.MIN_VALUE;
        this.f1546V = true;
        this.f1547W = new e0(this);
        this.f1551b0 = new C0041q();
        c0 c0Var = new c0();
        c0Var.f334a = -1;
        c0Var.f335b = 0;
        c0Var.f336c = 0;
        c0Var.f337d = 1;
        c0Var.f338e = 0;
        c0Var.f339f = false;
        c0Var.f340g = false;
        c0Var.f341h = false;
        c0Var.f342i = false;
        c0Var.f343j = false;
        c0Var.f344k = false;
        this.f1553c0 = c0Var;
        this.f1559f0 = false;
        this.f1561g0 = false;
        F f2 = new F(this);
        this.f1563h0 = f2;
        this.f1565i0 = false;
        this.k0 = new int[2];
        this.f1572m0 = new int[2];
        this.f1574n0 = new int[2];
        this.f1576o0 = new int[2];
        this.f1578p0 = new ArrayList();
        this.f1580q0 = new E(this);
        this.r0 = new F(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1540P = viewConfiguration.getScaledTouchSlop();
        this.f1544T = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f1545U = viewConfiguration.getScaledVerticalScrollFactor();
        this.f1542R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1543S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1532H.f270a = f2;
        this.f1554d = new C0026b(new F(this));
        this.f1556e = new C0028d(new F(this));
        WeakHashMap weakHashMap = O.f58a;
        if (F.G.b(this) == 0) {
            F.G.l(this, 8);
        }
        if (AbstractC0023y.c(this) == 0) {
            AbstractC0023y.s(this, 1);
        }
        this.f1587x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new h0(this));
        int[] iArr = a.f251a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1560g = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            i3 = 4;
            c2 = 2;
            z2 = 1;
            new C0040p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131165330), resources.getDimensionPixelSize(2131165332), resources.getDimensionPixelOffset(2131165331));
        } else {
            i3 = 4;
            c2 = 2;
            z2 = 1;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(P.class);
                    try {
                        Constructor constructor2 = asSubclass.getConstructor(t0);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = context;
                        objArr2[z2] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[3] = 0;
                        objArr = objArr2;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            objArr = null;
                            constructor = asSubclass.getConstructor(new Class[0]);
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                        }
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((P) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                }
            }
        }
        int[] iArr2 = s0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        P p2 = this.f1569l;
        if (p2 != null) {
            return p2.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
