package com.google.android.material.bottomsheet;

import F.AbstractC0023y;
import F.AbstractC0024z;
import F.B;
import F.C;
import F.C0000a;
import F.C0001b;
import F.E;
import F.J;
import F.O;
import F.Q;
import G.b;
import L.e;
import S.K;
import S.N;
import X.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.c;
import b0.d;
import h0.k;
import i.C0182z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import m0.g;
import m0.h;
import m0.l;
import s.AbstractC0214a;
import s.C0217d;
import u.RunnableC0223a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0214a {

    /* renamed from: A, reason: collision with root package name */
    public final float f1679A;

    /* renamed from: B, reason: collision with root package name */
    public int f1680B;

    /* renamed from: C, reason: collision with root package name */
    public final float f1681C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1682D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1683E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f1684F;

    /* renamed from: G, reason: collision with root package name */
    public int f1685G;

    /* renamed from: H, reason: collision with root package name */
    public e f1686H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1687I;

    /* renamed from: J, reason: collision with root package name */
    public int f1688J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1689K;

    /* renamed from: L, reason: collision with root package name */
    public int f1690L;

    /* renamed from: M, reason: collision with root package name */
    public int f1691M;

    /* renamed from: N, reason: collision with root package name */
    public int f1692N;

    /* renamed from: O, reason: collision with root package name */
    public WeakReference f1693O;

    /* renamed from: P, reason: collision with root package name */
    public WeakReference f1694P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1695Q;

    /* renamed from: R, reason: collision with root package name */
    public VelocityTracker f1696R;

    /* renamed from: S, reason: collision with root package name */
    public int f1697S;

    /* renamed from: T, reason: collision with root package name */
    public int f1698T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f1699U;

    /* renamed from: V, reason: collision with root package name */
    public HashMap f1700V;

    /* renamed from: W, reason: collision with root package name */
    public int f1701W;

    /* renamed from: X, reason: collision with root package name */
    public final c f1702X;

    /* renamed from: a, reason: collision with root package name */
    public final int f1703a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1704b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1705c;

    /* renamed from: d, reason: collision with root package name */
    public int f1706d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1707e;

    /* renamed from: f, reason: collision with root package name */
    public int f1708f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1709g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1710h;

    /* renamed from: i, reason: collision with root package name */
    public h f1711i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1712j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1713k;

    /* renamed from: l, reason: collision with root package name */
    public int f1714l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1715m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1716n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1717o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1718p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1719q;

    /* renamed from: r, reason: collision with root package name */
    public int f1720r;

    /* renamed from: s, reason: collision with root package name */
    public int f1721s;

    /* renamed from: t, reason: collision with root package name */
    public l f1722t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1723u;

    /* renamed from: v, reason: collision with root package name */
    public b0.e f1724v;

    /* renamed from: w, reason: collision with root package name */
    public final ValueAnimator f1725w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1726x;

    /* renamed from: y, reason: collision with root package name */
    public int f1727y;

    /* renamed from: z, reason: collision with root package name */
    public int f1728z;

    public BottomSheetBehavior() {
        this.f1703a = 0;
        this.f1704b = true;
        this.f1712j = -1;
        this.f1713k = -1;
        this.f1724v = null;
        this.f1679A = 0.5f;
        this.f1681C = -1.0f;
        this.f1684F = true;
        this.f1685G = 4;
        this.f1695Q = new ArrayList();
        this.f1701W = -1;
        this.f1702X = new c(this);
    }

    public static View v(View view) {
        WeakHashMap weakHashMap = O.f58a;
        if (E.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View v2 = v(viewGroup.getChildAt(i2));
            if (v2 != null) {
                return v2;
            }
        }
        return null;
    }

    public static int w(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    public final void A(int i2) {
        if (this.f1685G == i2) {
            return;
        }
        this.f1685G = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z2 = this.f1682D;
        }
        WeakReference weakReference = this.f1693O;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            H(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            H(false);
        }
        G(i2);
        ArrayList arrayList = this.f1695Q;
        if (arrayList.size() <= 0) {
            F();
        } else {
            Q.i(arrayList.get(0));
            throw null;
        }
    }

    public final void B(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.f1680B;
        } else if (i2 == 6) {
            i3 = this.f1728z;
            if (this.f1704b && i3 <= (i4 = this.f1727y)) {
                i2 = 3;
                i3 = i4;
            }
        } else if (i2 == 3) {
            i3 = x();
        } else {
            if (!this.f1682D || i2 != 5) {
                Log.w("BottomSheetBehavior", "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
                return;
            }
            i3 = this.f1692N;
        }
        E(view, i2, i3, false);
    }

    public final void C(int i2) {
        View view = (View) this.f1693O.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = O.f58a;
            if (B.b(view)) {
                view.post(new RunnableC0223a(this, view, i2, 3));
                return;
            }
        }
        B(view, i2);
    }

    public final boolean D(View view, float f2) {
        if (this.f1683E) {
            return true;
        }
        if (view.getTop() < this.f1680B) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.f1680B)) / ((float) s()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r5.f1634b != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r5.f1635c = r4;
        r4 = F.O.f58a;
        F.AbstractC0023y.m(r3, r5);
        r2.f1724v.f1634b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r5.f1635c = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0.o(r3.getLeft(), r5) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        A(2);
        G(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r2.f1724v != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        r2.f1724v = new b0.e(r2, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r5 = r2.f1724v;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, int r5, boolean r6) {
        /*
            r2 = this;
            L.e r0 = r2.f1686H
            if (r0 == 0) goto L56
            if (r6 == 0) goto L11
            int r6 = r3.getLeft()
            boolean r5 = r0.o(r6, r5)
            if (r5 == 0) goto L56
            goto L2e
        L11:
            int r6 = r3.getLeft()
            r0.f211r = r3
            r1 = -1
            r0.f196c = r1
            r1 = 0
            boolean r5 = r0.h(r6, r5, r1, r1)
            if (r5 != 0) goto L2c
            int r6 = r0.f194a
            if (r6 != 0) goto L2c
            android.view.View r6 = r0.f211r
            if (r6 == 0) goto L2c
            r6 = 0
            r0.f211r = r6
        L2c:
            if (r5 == 0) goto L56
        L2e:
            r5 = 2
            r2.A(r5)
            r2.G(r4)
            b0.e r5 = r2.f1724v
            if (r5 != 0) goto L40
            b0.e r5 = new b0.e
            r5.<init>(r2, r3, r4)
            r2.f1724v = r5
        L40:
            b0.e r5 = r2.f1724v
            boolean r6 = r5.f1634b
            if (r6 != 0) goto L53
            r5.f1635c = r4
            java.util.WeakHashMap r4 = F.O.f58a
            F.AbstractC0023y.m(r3, r5)
            b0.e r2 = r2.f1724v
            r3 = 1
            r2.f1634b = r3
            goto L59
        L53:
            r5.f1635c = r4
            goto L59
        L56:
            r2.A(r4)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, int, boolean):void");
    }

    public final void F() {
        View view;
        int i2;
        WeakReference weakReference = this.f1693O;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        O.f(view, 524288);
        O.d(view, 0);
        O.f(view, 262144);
        O.d(view, 0);
        O.f(view, 1048576);
        O.d(view, 0);
        int i3 = this.f1701W;
        if (i3 != -1) {
            O.f(view, i3);
            O.d(view, 0);
        }
        if (!this.f1704b && this.f1685G != 6) {
            String string = view.getResources().getString(2131755039);
            N n2 = new N(this, 6);
            ArrayList b2 = O.b(view);
            int i4 = 0;
            while (true) {
                if (i4 >= b2.size()) {
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int[] iArr = O.f59b;
                        if (i5 >= iArr.length || i6 != -1) {
                            break;
                        }
                        int i7 = iArr[i5];
                        boolean z2 = true;
                        for (int i8 = 0; i8 < b2.size(); i8++) {
                            z2 &= ((b) b2.get(i8)).a() != i7;
                        }
                        if (z2) {
                            i6 = i7;
                        }
                        i5++;
                    }
                    i2 = i6;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((b) b2.get(i4)).f124a).getLabel())) {
                        i2 = ((b) b2.get(i4)).a();
                        break;
                    }
                    i4++;
                }
            }
            if (i2 != -1) {
                b bVar = new b(null, i2, string, n2, null);
                View.AccessibilityDelegate a2 = J.a(view);
                C0001b c0001b = a2 == null ? null : a2 instanceof C0000a ? ((C0000a) a2).f77a : new C0001b(a2);
                if (c0001b == null) {
                    c0001b = new C0001b();
                }
                O.h(view, c0001b);
                O.f(view, bVar.a());
                O.b(view).add(bVar);
                O.d(view, 0);
            }
            this.f1701W = i2;
        }
        if (this.f1682D && this.f1685G != 5) {
            O.g(view, b.f121j, new N(this, 5));
        }
        int i9 = this.f1685G;
        if (i9 == 3) {
            O.g(view, b.f120i, new N(this, this.f1704b ? 4 : 6));
            return;
        }
        if (i9 == 4) {
            O.g(view, b.f119h, new N(this, this.f1704b ? 3 : 6));
        } else {
            if (i9 != 6) {
                return;
            }
            O.g(view, b.f120i, new N(this, 4));
            O.g(view, b.f119h, new N(this, 3));
        }
    }

    public final void G(int i2) {
        ValueAnimator valueAnimator = this.f1725w;
        if (i2 == 2) {
            return;
        }
        boolean z2 = i2 == 3;
        if (this.f1723u != z2) {
            this.f1723u = z2;
            if (this.f1711i == null || valueAnimator == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f2 = z2 ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f2, f2);
            valueAnimator.start();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f1693O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f1700V != null) {
                    return;
                } else {
                    this.f1700V = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f1693O.get() && z2) {
                    this.f1700V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f1700V = null;
        }
    }

    public final void I() {
        View view;
        if (this.f1693O != null) {
            r();
            if (this.f1685G != 4 || (view = (View) this.f1693O.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // s.AbstractC0214a
    public final void c(C0217d c0217d) {
        this.f1693O = null;
        this.f1686H = null;
    }

    @Override // s.AbstractC0214a
    public final void e() {
        this.f1693O = null;
        this.f1686H = null;
    }

    @Override // s.AbstractC0214a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        if (!view.isShown() || !this.f1684F) {
            this.f1687I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1697S = -1;
            VelocityTracker velocityTracker = this.f1696R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1696R = null;
            }
        }
        if (this.f1696R == null) {
            this.f1696R = VelocityTracker.obtain();
        }
        this.f1696R.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f1698T = (int) motionEvent.getY();
            if (this.f1685G != 2) {
                WeakReference weakReference = this.f1694P;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f1698T)) {
                    this.f1697S = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1699U = true;
                }
            }
            this.f1687I = this.f1697S == -1 && !coordinatorLayout.o(view, x2, this.f1698T);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1699U = false;
            this.f1697S = -1;
            if (this.f1687I) {
                this.f1687I = false;
                return false;
            }
        }
        if (!this.f1687I && (eVar = this.f1686H) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f1694P;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f1687I || this.f1685G == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1686H == null || Math.abs(((float) this.f1698T) - motionEvent.getY()) <= ((float) this.f1686H.f195b)) ? false : true;
    }

    @Override // s.AbstractC0214a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        h hVar;
        WeakHashMap weakHashMap = O.f58a;
        if (AbstractC0023y.b(coordinatorLayout) && !AbstractC0023y.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1693O == null) {
            this.f1708f = coordinatorLayout.getResources().getDimensionPixelSize(2131165295);
            boolean z2 = (this.f1715m || this.f1707e) ? false : true;
            if (this.f1716n || this.f1717o || this.f1718p || z2) {
                b0.b bVar = new b0.b(this, z2);
                int f2 = AbstractC0024z.f(view);
                int paddingTop = view.getPaddingTop();
                int e2 = AbstractC0024z.e(view);
                int paddingBottom = view.getPaddingBottom();
                K k2 = new K();
                k2.f266a = f2;
                k2.f267b = paddingTop;
                k2.f268c = e2;
                k2.f269d = paddingBottom;
                E.u(view, new C0182z(bVar, k2));
                if (B.b(view)) {
                    C.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new h0.l());
                }
            }
            this.f1693O = new WeakReference(view);
            if (this.f1710h && (hVar = this.f1711i) != null) {
                AbstractC0023y.q(view, hVar);
            }
            h hVar2 = this.f1711i;
            if (hVar2 != null) {
                float f3 = this.f1681C;
                if (f3 == -1.0f) {
                    f3 = E.i(view);
                }
                hVar2.j(f3);
                boolean z3 = this.f1685G == 3;
                this.f1723u = z3;
                h hVar3 = this.f1711i;
                float f4 = z3 ? 0.0f : 1.0f;
                g gVar = hVar3.f3094a;
                if (gVar.f3081j != f4) {
                    gVar.f3081j = f4;
                    hVar3.f3098e = true;
                    hVar3.invalidateSelf();
                }
            }
            F();
            if (AbstractC0023y.c(view) == 0) {
                AbstractC0023y.s(view, 1);
            }
        }
        if (this.f1686H == null) {
            this.f1686H = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1702X);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i2);
        this.f1691M = coordinatorLayout.getWidth();
        this.f1692N = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1690L = height;
        int i3 = this.f1692N;
        int i4 = i3 - height;
        int i5 = this.f1721s;
        if (i4 < i5) {
            if (this.f1719q) {
                this.f1690L = i3;
            } else {
                this.f1690L = i3 - i5;
            }
        }
        this.f1727y = Math.max(0, i3 - this.f1690L);
        this.f1728z = (int) ((1.0f - this.f1679A) * this.f1692N);
        r();
        int i6 = this.f1685G;
        if (i6 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i6 == 6) {
            view.offsetTopAndBottom(this.f1728z);
        } else if (this.f1682D && i6 == 5) {
            view.offsetTopAndBottom(this.f1692N);
        } else if (i6 == 4) {
            view.offsetTopAndBottom(this.f1680B);
        } else if (i6 == 1 || i6 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.f1694P = new WeakReference(v(view));
        return true;
    }

    @Override // s.AbstractC0214a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f1712j, marginLayoutParams.width), w(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1713k, marginLayoutParams.height));
        return true;
    }

    @Override // s.AbstractC0214a
    public final boolean i(View view) {
        WeakReference weakReference = this.f1694P;
        return (weakReference == null || view != weakReference.get() || this.f1685G == 3) ? false : true;
    }

    @Override // s.AbstractC0214a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 1) {
            return;
        }
        WeakReference weakReference = this.f1694P;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i3;
        if (i3 > 0) {
            if (i5 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                int i6 = -x2;
                WeakHashMap weakHashMap = O.f58a;
                view.offsetTopAndBottom(i6);
                A(3);
            } else {
                if (!this.f1684F) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap2 = O.f58a;
                view.offsetTopAndBottom(-i3);
                A(1);
            }
        } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
            int i7 = this.f1680B;
            if (i5 > i7 && !this.f1682D) {
                int i8 = top - i7;
                iArr[1] = i8;
                int i9 = -i8;
                WeakHashMap weakHashMap3 = O.f58a;
                view.offsetTopAndBottom(i9);
                A(4);
            } else {
                if (!this.f1684F) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap4 = O.f58a;
                view.offsetTopAndBottom(-i3);
                A(1);
            }
        }
        u(view.getTop());
        this.f1688J = i3;
        this.f1689K = true;
    }

    @Override // s.AbstractC0214a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }

    @Override // s.AbstractC0214a
    public final void m(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i2 = this.f1703a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f1706d = dVar.f1629d;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f1704b = dVar.f1630e;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.f1682D = dVar.f1631f;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.f1683E = dVar.f1632g;
            }
        }
        int i3 = dVar.f1628c;
        if (i3 == 1 || i3 == 2) {
            this.f1685G = 4;
        } else {
            this.f1685G = i3;
        }
    }

    @Override // s.AbstractC0214a
    public final Parcelable n(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // s.AbstractC0214a
    public final boolean o(View view, int i2, int i3) {
        this.f1688J = 0;
        this.f1689K = false;
        return (i2 & 2) != 0;
    }

    @Override // s.AbstractC0214a
    public final void p(View view, View view2, int i2) {
        int i3;
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == x()) {
            A(3);
            return;
        }
        WeakReference weakReference = this.f1694P;
        if (weakReference != null && view2 == weakReference.get() && this.f1689K) {
            if (this.f1688J <= 0) {
                if (this.f1682D) {
                    VelocityTracker velocityTracker = this.f1696R;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f1705c);
                        yVelocity = this.f1696R.getYVelocity(this.f1697S);
                    }
                    if (D(view, yVelocity)) {
                        i3 = this.f1692N;
                        i4 = 5;
                    }
                }
                if (this.f1688J == 0) {
                    int top = view.getTop();
                    if (!this.f1704b) {
                        int i5 = this.f1728z;
                        if (top < i5) {
                            if (top < Math.abs(top - this.f1680B)) {
                                i3 = x();
                            } else {
                                i3 = this.f1728z;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.f1680B)) {
                            i3 = this.f1728z;
                        } else {
                            i3 = this.f1680B;
                            i4 = 4;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f1727y) < Math.abs(top - this.f1680B)) {
                        i3 = this.f1727y;
                    } else {
                        i3 = this.f1680B;
                        i4 = 4;
                    }
                } else {
                    if (this.f1704b) {
                        i3 = this.f1680B;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - this.f1728z) < Math.abs(top2 - this.f1680B)) {
                            i3 = this.f1728z;
                            i4 = 6;
                        } else {
                            i3 = this.f1680B;
                        }
                    }
                    i4 = 4;
                }
            } else if (this.f1704b) {
                i3 = this.f1727y;
            } else {
                int top3 = view.getTop();
                int i6 = this.f1728z;
                if (top3 > i6) {
                    i4 = 6;
                    i3 = i6;
                } else {
                    i3 = x();
                }
            }
            E(view, i4, i3, false);
            this.f1689K = false;
        }
    }

    @Override // s.AbstractC0214a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f1685G;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f1686H;
        if (eVar != null && (this.f1684F || i2 == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1697S = -1;
            VelocityTracker velocityTracker = this.f1696R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1696R = null;
            }
        }
        if (this.f1696R == null) {
            this.f1696R = VelocityTracker.obtain();
        }
        this.f1696R.addMovement(motionEvent);
        if (this.f1686H != null && ((this.f1684F || this.f1685G == 1) && actionMasked == 2 && !this.f1687I)) {
            float abs = Math.abs(this.f1698T - motionEvent.getY());
            e eVar2 = this.f1686H;
            if (abs > eVar2.f195b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1687I;
    }

    public final void r() {
        int s2 = s();
        if (this.f1704b) {
            this.f1680B = Math.max(this.f1692N - s2, this.f1727y);
        } else {
            this.f1680B = this.f1692N - s2;
        }
    }

    public final int s() {
        int i2;
        int i3;
        int i4;
        if (this.f1707e) {
            i2 = Math.min(Math.max(this.f1708f, this.f1692N - ((this.f1691M * 9) / 16)), this.f1690L);
            i3 = this.f1720r;
        } else {
            if (!this.f1715m && !this.f1716n && (i4 = this.f1714l) > 0) {
                return Math.max(this.f1706d, i4 + this.f1709g);
            }
            i2 = this.f1706d;
            i3 = this.f1720r;
        }
        return i2 + i3;
    }

    public final void t(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.f1710h) {
            this.f1722t = l.b(context, attributeSet, 2130968674, 2131821293).a();
            h hVar = new h(this.f1722t);
            this.f1711i = hVar;
            hVar.i(context);
            if (z2 && colorStateList != null) {
                this.f1711i.k(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f1711i.setTint(typedValue.data);
        }
    }

    public final void u(int i2) {
        if (((View) this.f1693O.get()) != null) {
            ArrayList arrayList = this.f1695Q;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.f1680B;
            if (i2 <= i3 && i3 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            Q.i(arrayList.get(0));
            throw null;
        }
    }

    public final int x() {
        if (this.f1704b) {
            return this.f1727y;
        }
        return Math.max(this.f1726x, this.f1719q ? 0 : this.f1721s);
    }

    public final void y(int i2) {
        if (i2 == -1) {
            if (this.f1707e) {
                return;
            } else {
                this.f1707e = true;
            }
        } else {
            if (!this.f1707e && this.f1706d == i2) {
                return;
            }
            this.f1707e = false;
            this.f1706d = Math.max(0, i2);
        }
        I();
    }

    public final void z(int i2) {
        if (i2 == this.f1685G) {
            return;
        }
        if (this.f1693O != null) {
            C(i2);
            return;
        }
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.f1682D && i2 == 5)) {
            this.f1685G = i2;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        int i3 = 0;
        this.f1703a = 0;
        this.f1704b = true;
        this.f1712j = -1;
        this.f1713k = -1;
        this.f1724v = null;
        this.f1679A = 0.5f;
        this.f1681C = -1.0f;
        this.f1684F = true;
        this.f1685G = 4;
        this.f1695Q = new ArrayList();
        this.f1701W = -1;
        this.f1702X = new c(this);
        this.f1709g = context.getResources().getDimensionPixelSize(2131165663);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f680a);
        this.f1710h = obtainStyledAttributes.hasValue(17);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        if (hasValue) {
            t(context, attributeSet, hasValue, k.f(context, obtainStyledAttributes, 3));
        } else {
            t(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1725w = ofFloat;
        ofFloat.setDuration(500L);
        this.f1725w.addUpdateListener(new b0.a(i3, this));
        this.f1681C = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1712j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1713k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i2 = peekValue.data) == -1) {
            y(i2);
        } else {
            y(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f1682D != z2) {
            this.f1682D = z2;
            if (!z2 && this.f1685G == 5) {
                z(4);
            }
            F();
        }
        this.f1715m = obtainStyledAttributes.getBoolean(12, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1704b != z3) {
            this.f1704b = z3;
            if (this.f1693O != null) {
                r();
            }
            A((this.f1704b && this.f1685G == 6) ? 3 : this.f1685G);
            F();
        }
        this.f1683E = obtainStyledAttributes.getBoolean(11, false);
        this.f1684F = obtainStyledAttributes.getBoolean(4, true);
        this.f1703a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f1679A = f2;
            if (this.f1693O != null) {
                this.f1728z = (int) ((1.0f - f2) * this.f1692N);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i4 = peekValue2.data;
                if (i4 >= 0) {
                    this.f1726x = i4;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f1726x = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f1716n = obtainStyledAttributes.getBoolean(13, false);
            this.f1717o = obtainStyledAttributes.getBoolean(14, false);
            this.f1718p = obtainStyledAttributes.getBoolean(15, false);
            this.f1719q = obtainStyledAttributes.getBoolean(16, true);
            obtainStyledAttributes.recycle();
            this.f1705c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
