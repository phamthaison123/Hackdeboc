package androidx.coordinatorlayout.widget;

import E.b;
import F.AbstractC0023y;
import F.AbstractC0024z;
import F.C;
import F.C0014o;
import F.E;
import F.InterfaceC0012m;
import F.InterfaceC0013n;
import F.O;
import F.f0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.z;
import g.C0107g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import l.k;
import n.C0200f;
import r.AbstractC0213a;
import s.AbstractC0214a;
import s.AbstractC0221h;
import s.C0217d;
import s.C0219f;
import s.C0220g;
import s.InterfaceC0215b;
import s.ViewGroupOnHierarchyChangeListenerC0216c;
import s.ViewTreeObserverOnPreDrawListenerC0218e;
import w.AbstractC0235c;
import w.e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0012m, InterfaceC0013n {

    /* renamed from: t, reason: collision with root package name */
    public static final String f1005t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f1006u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f1007v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0220g f1008w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f1009x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1010a;

    /* renamed from: b, reason: collision with root package name */
    public final C0107g f1011b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1012c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1013d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f1014e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1015f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1016g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1017h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f1018i;

    /* renamed from: j, reason: collision with root package name */
    public View f1019j;

    /* renamed from: k, reason: collision with root package name */
    public View f1020k;

    /* renamed from: l, reason: collision with root package name */
    public ViewTreeObserverOnPreDrawListenerC0218e f1021l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1022m;

    /* renamed from: n, reason: collision with root package name */
    public f0 f1023n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1024o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1025p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1026q;

    /* renamed from: r, reason: collision with root package name */
    public z f1027r;

    /* renamed from: s, reason: collision with root package name */
    public final C0014o f1028s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1005t = r0 != null ? r0.getName() : null;
        f1008w = new C0220g(0);
        f1006u = new Class[]{Context.class, AttributeSet.class};
        f1007v = new ThreadLocal();
        f1009x = new b();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968832);
        this.f1010a = new ArrayList();
        this.f1011b = new C0107g(2);
        this.f1012c = new ArrayList();
        this.f1013d = new ArrayList();
        this.f1014e = new int[2];
        this.f1015f = new int[2];
        this.f1028s = new C0014o();
        int[] iArr = AbstractC0213a.f3688a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 2130968832, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 2130968832, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1018i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1018i[i2] = (int) (r0[i2] * f2);
            }
        }
        this.f1025p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0216c(this));
        WeakHashMap weakHashMap = O.f58a;
        if (AbstractC0023y.c(this) == 0) {
            AbstractC0023y.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1009x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i2, Rect rect, Rect rect2, C0217d c0217d, int i3, int i4) {
        int i5 = c0217d.f3693c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = c0217d.f3694d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i3 / 2;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 / 2;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    public static C0217d n(View view) {
        C0217d c0217d = (C0217d) view.getLayoutParams();
        if (!c0217d.f3692b) {
            InterfaceC0215b interfaceC0215b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC0215b = (InterfaceC0215b) cls.getAnnotation(InterfaceC0215b.class);
                if (interfaceC0215b != null) {
                    break;
                }
            }
            if (interfaceC0215b != null) {
                try {
                    AbstractC0214a abstractC0214a = (AbstractC0214a) interfaceC0215b.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC0214a abstractC0214a2 = c0217d.f3691a;
                    if (abstractC0214a2 != abstractC0214a) {
                        if (abstractC0214a2 != null) {
                            abstractC0214a2.e();
                        }
                        c0217d.f3691a = abstractC0214a;
                        c0217d.f3692b = true;
                        if (abstractC0214a != null) {
                            abstractC0214a.c(c0217d);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0215b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            c0217d.f3692b = true;
        }
        return c0217d;
    }

    public static void u(View view, int i2) {
        C0217d c0217d = (C0217d) view.getLayoutParams();
        int i3 = c0217d.f3699i;
        if (i3 != i2) {
            WeakHashMap weakHashMap = O.f58a;
            view.offsetLeftAndRight(i2 - i3);
            c0217d.f3699i = i2;
        }
    }

    public static void v(View view, int i2) {
        C0217d c0217d = (C0217d) view.getLayoutParams();
        int i3 = c0217d.f3700j;
        if (i3 != i2) {
            WeakHashMap weakHashMap = O.f58a;
            view.offsetTopAndBottom(i2 - i3);
            c0217d.f3700j = i2;
        }
    }

    @Override // F.InterfaceC0012m
    public final void a(View view, View view2, int i2, int i3) {
        C0014o c0014o = this.f1028s;
        if (i3 == 1) {
            c0014o.f103b = i2;
        } else {
            c0014o.f102a = i2;
        }
        this.f1020k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((C0217d) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // F.InterfaceC0013n
    public final void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        AbstractC0214a abstractC0214a;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0217d c0217d = (C0217d) childAt.getLayoutParams();
                if (c0217d.a(i6) && (abstractC0214a = c0217d.f3691a) != null) {
                    int[] iArr2 = this.f1014e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0214a.k(this, childAt, i3, i4, i5, iArr2);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[0]) : Math.min(i7, iArr2[0]);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[1]) : Math.min(i8, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            p(1);
        }
    }

    @Override // F.InterfaceC0012m
    public final void c(View view, int i2, int i3, int i4, int i5, int i6) {
        b(view, i2, i3, i4, i5, 0, this.f1015f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0217d) && super.checkLayoutParams(layoutParams);
    }

    @Override // F.InterfaceC0012m
    public final void d(View view, int i2) {
        C0014o c0014o = this.f1028s;
        if (i2 == 1) {
            c0014o.f103b = 0;
        } else {
            c0014o.f102a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0217d c0217d = (C0217d) childAt.getLayoutParams();
            if (c0217d.a(i2)) {
                AbstractC0214a abstractC0214a = c0217d.f3691a;
                if (abstractC0214a != null) {
                    abstractC0214a.p(childAt, view, i2);
                }
                if (i2 == 0) {
                    c0217d.f3704n = false;
                } else if (i2 == 1) {
                    c0217d.f3705o = false;
                }
                c0217d.getClass();
            }
        }
        this.f1020k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0214a abstractC0214a = ((C0217d) view.getLayoutParams()).f3691a;
        if (abstractC0214a != null) {
            abstractC0214a.getClass();
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1025p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // F.InterfaceC0012m
    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
        AbstractC0214a abstractC0214a;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0217d c0217d = (C0217d) childAt.getLayoutParams();
                if (c0217d.a(i4) && (abstractC0214a = c0217d.f3691a) != null) {
                    int[] iArr2 = this.f1014e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0214a.j(this, childAt, view, i2, i3, iArr2, i4);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[0]) : Math.min(i5, iArr2[0]);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[1]) : Math.min(i6, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            p(1);
        }
    }

    @Override // F.InterfaceC0012m
    public final boolean f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0217d c0217d = (C0217d) childAt.getLayoutParams();
                AbstractC0214a abstractC0214a = c0217d.f3691a;
                if (abstractC0214a != null) {
                    boolean o2 = abstractC0214a.o(childAt, i2, i3);
                    z2 |= o2;
                    if (i3 == 0) {
                        c0217d.f3704n = o2;
                    } else if (i3 == 1) {
                        c0217d.f3705o = o2;
                    }
                } else if (i3 == 0) {
                    c0217d.f3704n = false;
                } else if (i3 == 1) {
                    c0217d.f3705o = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0217d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0217d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f1010a);
    }

    public final f0 getLastWindowInsets() {
        return this.f1023n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0014o c0014o = this.f1028s;
        return c0014o.f103b | c0014o.f102a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1025p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C0217d c0217d, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0217d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) c0217d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0217d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) c0217d).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        C0107g c0107g = this.f1011b;
        int i2 = ((k) c0107g.f2295d).f3049c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ((k) c0107g.f2295d).j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((k) c0107g.f2295d).h(i3));
            }
        }
        ArrayList arrayList3 = this.f1013d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC0221h.f3710a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC0221h.f3710a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC0221h.a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC0221h.f3711b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i2) {
        int[] iArr = this.f1018i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i2, int i3) {
        b bVar = f1009x;
        Rect g2 = g();
        k(view, g2);
        try {
            return g2.contains(i2, i3);
        } finally {
            g2.setEmpty();
            bVar.b(g2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1022m) {
            if (this.f1021l == null) {
                this.f1021l = new ViewTreeObserverOnPreDrawListenerC0218e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1021l);
        }
        if (this.f1023n == null) {
            WeakHashMap weakHashMap = O.f58a;
            if (AbstractC0023y.b(this)) {
                C.c(this);
            }
        }
        this.f1017h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1022m && this.f1021l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1021l);
        }
        View view = this.f1020k;
        if (view != null) {
            d(view, 0);
        }
        this.f1017h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1024o || this.f1025p == null) {
            return;
        }
        f0 f0Var = this.f1023n;
        int d2 = f0Var != null ? f0Var.d() : 0;
        if (d2 > 0) {
            this.f1025p.setBounds(0, 0, getWidth(), d2);
            this.f1025p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r2 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        AbstractC0214a abstractC0214a;
        WeakHashMap weakHashMap = O.f58a;
        int d2 = AbstractC0024z.d(this);
        ArrayList arrayList = this.f1010a;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((abstractC0214a = ((C0217d) view.getLayoutParams()).f3691a) == null || !abstractC0214a.g(this, view, d2))) {
                q(view, d2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0190, code lost:
    
        if (r0.h(r30, r19, r25, r20, r26) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0217d c0217d = (C0217d) childAt.getLayoutParams();
                if (c0217d.a(0)) {
                    AbstractC0214a abstractC0214a = c0217d.f3691a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC0214a abstractC0214a;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0217d c0217d = (C0217d) childAt.getLayoutParams();
                if (c0217d.a(0) && (abstractC0214a = c0217d.f3691a) != null) {
                    z2 |= abstractC0214a.i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        e(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        c(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0219f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0219f c0219f = (C0219f) parcelable;
        super.onRestoreInstanceState(c0219f.f173a);
        SparseArray sparseArray = c0219f.f3708c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC0214a abstractC0214a = n(childAt).f3691a;
            if (id != -1 && abstractC0214a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0214a.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n2;
        C0219f c0219f = new C0219f(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC0214a abstractC0214a = ((C0217d) childAt.getLayoutParams()).f3691a;
            if (id != -1 && abstractC0214a != null && (n2 = abstractC0214a.n(childAt)) != null) {
                sparseArray.append(id, n2);
            }
        }
        c0219f.f3708c = sparseArray;
        return c0219f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1019j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f1019j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            s.d r6 = (s.C0217d) r6
            s.a r6 = r6.f3691a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f1019j
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f1019j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i2) {
        Rect g2;
        Rect g3;
        C0217d c0217d = (C0217d) view.getLayoutParams();
        View view2 = c0217d.f3701k;
        if (view2 == null && c0217d.f3696f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        b bVar = f1009x;
        if (view2 != null) {
            g2 = g();
            g3 = g();
            try {
                k(view2, g2);
                C0217d c0217d2 = (C0217d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i2, g2, g3, c0217d2, measuredWidth, measuredHeight);
                h(c0217d2, g3, measuredWidth, measuredHeight);
                view.layout(g3.left, g3.top, g3.right, g3.bottom);
                return;
            } finally {
                g2.setEmpty();
                bVar.b(g2);
                g3.setEmpty();
                bVar.b(g3);
            }
        }
        int i3 = c0217d.f3695e;
        if (i3 < 0) {
            C0217d c0217d3 = (C0217d) view.getLayoutParams();
            g2 = g();
            g2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0217d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0217d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0217d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0217d3).bottomMargin);
            if (this.f1023n != null) {
                WeakHashMap weakHashMap = O.f58a;
                if (AbstractC0023y.b(this) && !AbstractC0023y.b(view)) {
                    g2.left = this.f1023n.b() + g2.left;
                    g2.top = this.f1023n.d() + g2.top;
                    g2.right -= this.f1023n.c();
                    g2.bottom -= this.f1023n.a();
                }
            }
            g3 = g();
            int i4 = c0217d3.f3693c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), g2, g3, i2);
            view.layout(g3.left, g3.top, g3.right, g3.bottom);
            return;
        }
        C0217d c0217d4 = (C0217d) view.getLayoutParams();
        int i5 = c0217d4.f3693c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int m2 = m(i3) - measuredWidth2;
        if (i6 == 1) {
            m2 += measuredWidth2 / 2;
        } else if (i6 == 5) {
            m2 += measuredWidth2;
        }
        int i8 = i7 != 16 ? i7 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0217d4).leftMargin, Math.min(m2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0217d4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0217d4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0217d4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i2) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1012c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        C0220g c0220g = f1008w;
        if (c0220g != null) {
            Collections.sort(arrayList, c0220g);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            C0217d c0217d = (C0217d) view.getLayoutParams();
            AbstractC0214a abstractC0214a = c0217d.f3691a;
            if (!(z3 || z4) || actionMasked == 0) {
                if (!z3 && abstractC0214a != null) {
                    if (i2 == 0) {
                        z3 = abstractC0214a.f(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z3 = abstractC0214a.q(view, motionEvent);
                    }
                    if (z3) {
                        this.f1019j = view;
                    }
                }
                if (c0217d.f3691a == null) {
                    c0217d.f3703m = false;
                }
                boolean z5 = c0217d.f3703m;
                if (z5) {
                    z2 = true;
                } else {
                    c0217d.f3703m = z5;
                    z2 = z5;
                }
                z4 = z2 && !z5;
                if (z2 && !z4) {
                    break;
                }
            } else if (abstractC0214a != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    abstractC0214a.f(this, view, motionEvent2);
                } else if (i2 == 1) {
                    abstractC0214a.q(view, motionEvent2);
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AbstractC0214a abstractC0214a = ((C0217d) view.getLayoutParams()).f3691a;
        if (abstractC0214a != null) {
            abstractC0214a.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1016g) {
            return;
        }
        t(false);
        this.f1016g = true;
    }

    public final void s() {
        ArrayList arrayList = this.f1010a;
        arrayList.clear();
        C0107g c0107g = this.f1011b;
        int i2 = ((k) c0107g.f2295d).f3049c;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ((k) c0107g.f2295d).j(i3);
            if (arrayList2 != null) {
                arrayList2.clear();
                ((C0200f) c0107g.f2292a).b(arrayList2);
            }
        }
        ((k) c0107g.f2295d).clear();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C0217d n2 = n(childAt);
            int i5 = n2.f3696f;
            if (i5 == -1) {
                n2.f3702l = null;
                n2.f3701k = null;
            } else {
                View view = n2.f3701k;
                if (view != null && view.getId() == i5) {
                    View view2 = n2.f3701k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n2.f3702l = null;
                            n2.f3701k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n2.f3702l = view2;
                }
                View findViewById = findViewById(i5);
                n2.f3701k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i5) + " to anchor view " + childAt);
                    }
                    n2.f3702l = null;
                    n2.f3701k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            n2.f3702l = null;
                            n2.f3701k = null;
                        }
                    }
                    n2.f3702l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n2.f3702l = null;
                    n2.f3701k = null;
                }
            }
            if (!((k) c0107g.f2295d).containsKey(childAt)) {
                ((k) c0107g.f2295d).put(childAt, null);
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                if (i6 != i4) {
                    View childAt2 = getChildAt(i6);
                    if (childAt2 != n2.f3702l) {
                        WeakHashMap weakHashMap = O.f58a;
                        int d2 = AbstractC0024z.d(this);
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C0217d) childAt2.getLayoutParams()).f3697g, d2);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n2.f3698h, d2) & absoluteGravity) != absoluteGravity) {
                            AbstractC0214a abstractC0214a = n2.f3691a;
                            if (abstractC0214a != null) {
                                abstractC0214a.b(childAt);
                            }
                        }
                    }
                    if (!((k) c0107g.f2295d).containsKey(childAt2) && !((k) c0107g.f2295d).containsKey(childAt2)) {
                        ((k) c0107g.f2295d).put(childAt2, null);
                    }
                    if (!((k) c0107g.f2295d).containsKey(childAt2) || !((k) c0107g.f2295d).containsKey(childAt)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList3 = (ArrayList) ((k) c0107g.f2295d).getOrDefault(childAt2, null);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) ((C0200f) c0107g.f2292a).a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        ((k) c0107g.f2295d).put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ((ArrayList) c0107g.f2294c).clear();
        ((HashSet) c0107g.f2293b).clear();
        int i7 = ((k) c0107g.f2295d).f3049c;
        for (int i8 = 0; i8 < i7; i8++) {
            c0107g.f(((k) c0107g.f2295d).h(i8), (ArrayList) c0107g.f2294c, (HashSet) c0107g.f2293b);
        }
        arrayList.addAll((ArrayList) c0107g.f2294c);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1026q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1025p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1025p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1025p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1025p;
                WeakHashMap weakHashMap = O.f58a;
                drawable3.setLayoutDirection(AbstractC0024z.d(this));
                this.f1025p.setVisible(getVisibility() == 0, false);
                this.f1025p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = O.f58a;
            AbstractC0023y.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            Context context = getContext();
            Object obj = e.f3731a;
            drawable = AbstractC0235c.b(context, i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1025p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1025p.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC0214a abstractC0214a = ((C0217d) childAt.getLayoutParams()).f3691a;
            if (abstractC0214a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    abstractC0214a.f(this, childAt, obtain);
                } else {
                    abstractC0214a.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0217d) getChildAt(i3).getLayoutParams()).f3703m = false;
        }
        this.f1019j = null;
        this.f1016g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1025p;
    }

    public final void w() {
        WeakHashMap weakHashMap = O.f58a;
        if (!AbstractC0023y.b(this)) {
            E.u(this, null);
            return;
        }
        if (this.f1027r == null) {
            this.f1027r = new z(7, this);
        }
        E.u(this, this.f1027r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0217d ? new C0217d((C0217d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0217d((ViewGroup.MarginLayoutParams) layoutParams) : new C0217d(layoutParams);
    }
}
