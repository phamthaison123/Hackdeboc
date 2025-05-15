package androidx.appcompat.widget;

import F.AbstractC0023y;
import F.C;
import F.C0014o;
import F.InterfaceC0012m;
import F.InterfaceC0013n;
import F.O;
import F.X;
import F.f0;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import e.E;
import e.m;
import g.C0113m;
import h.o;
import i.C0139d;
import i.C0145g;
import i.C0157m;
import i.InterfaceC0142e0;
import i.InterfaceC0143f;
import i.InterfaceC0144f0;
import i.RunnableC0141e;
import i.U0;
import i.Y0;
import java.util.WeakHashMap;
import y.C0238b;

@SuppressLint({"UnknownNullness"})
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0142e0, InterfaceC0012m, InterfaceC0013n {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f841B = {2130968579, R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final C0014o f842A;

    /* renamed from: a, reason: collision with root package name */
    public int f843a;

    /* renamed from: b, reason: collision with root package name */
    public int f844b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f845c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f846d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0144f0 f847e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f848f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f849g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f850h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f851i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f852j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f853k;

    /* renamed from: l, reason: collision with root package name */
    public int f854l;

    /* renamed from: m, reason: collision with root package name */
    public int f855m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f856n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f857o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f858p;

    /* renamed from: q, reason: collision with root package name */
    public f0 f859q;

    /* renamed from: r, reason: collision with root package name */
    public f0 f860r;

    /* renamed from: s, reason: collision with root package name */
    public f0 f861s;

    /* renamed from: t, reason: collision with root package name */
    public f0 f862t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0143f f863u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f864v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f865w;

    /* renamed from: x, reason: collision with root package name */
    public final C0139d f866x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0141e f867y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0141e f868z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f844b = 0;
        this.f856n = new Rect();
        this.f857o = new Rect();
        this.f858p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        f0 f0Var = f0.f93b;
        this.f859q = f0Var;
        this.f860r = f0Var;
        this.f861s = f0Var;
        this.f862t = f0Var;
        this.f866x = new C0139d(0, this);
        this.f867y = new RunnableC0141e(this, 0);
        this.f868z = new RunnableC0141e(this, 1);
        i(context);
        this.f842A = new C0014o();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z2) {
        boolean z3;
        C0145g c0145g = (C0145g) frameLayout.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0145g).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0145g).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0145g).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0145g).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0145g).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0145g).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0145g).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0145g).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // F.InterfaceC0012m
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // F.InterfaceC0013n
    public final void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c(view, i2, i3, i4, i5, i6);
    }

    @Override // F.InterfaceC0012m
    public final void c(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0145g;
    }

    @Override // F.InterfaceC0012m
    public final void d(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f848f == null || this.f849g) {
            return;
        }
        if (this.f846d.getVisibility() == 0) {
            i2 = (int) (this.f846d.getTranslationY() + this.f846d.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f848f.setBounds(0, i2, getWidth(), this.f848f.getIntrinsicHeight() + i2);
        this.f848f.draw(canvas);
    }

    @Override // F.InterfaceC0012m
    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // F.InterfaceC0012m
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0145g(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0145g(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f846d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0014o c0014o = this.f842A;
        return c0014o.f103b | c0014o.f102a;
    }

    public CharSequence getTitle() {
        k();
        return ((Y0) this.f847e).f2750a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f867y);
        removeCallbacks(this.f868z);
        ViewPropertyAnimator viewPropertyAnimator = this.f865w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f841B);
        this.f843a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f848f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f849g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f864v = new OverScroller(context);
    }

    public final void j(int i2) {
        k();
        if (i2 == 2) {
            ((Y0) this.f847e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((Y0) this.f847e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0144f0 wrapper;
        if (this.f845c == null) {
            this.f845c = (ContentFrameLayout) findViewById(2131296305);
            this.f846d = (ActionBarContainer) findViewById(2131296306);
            KeyEvent.Callback findViewById = findViewById(2131296304);
            if (findViewById instanceof InterfaceC0144f0) {
                wrapper = (InterfaceC0144f0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f847e = wrapper;
        }
    }

    public final void l(o oVar, m mVar) {
        k();
        Y0 y0 = (Y0) this.f847e;
        C0157m c0157m = y0.f2762m;
        Toolbar toolbar = y0.f2750a;
        if (c0157m == null) {
            y0.f2762m = new C0157m(toolbar.getContext());
        }
        C0157m c0157m2 = y0.f2762m;
        c0157m2.f2832e = mVar;
        if (oVar == null && toolbar.f954a == null) {
            return;
        }
        toolbar.f();
        o oVar2 = toolbar.f954a.f870p;
        if (oVar2 == oVar) {
            return;
        }
        if (oVar2 != null) {
            oVar2.r(toolbar.f950K);
            oVar2.r(toolbar.f951L);
        }
        if (toolbar.f951L == null) {
            toolbar.f951L = new U0(toolbar);
        }
        c0157m2.f2844q = true;
        if (oVar != null) {
            oVar.b(c0157m2, toolbar.f963j);
            oVar.b(toolbar.f951L, toolbar.f963j);
        } else {
            c0157m2.g(toolbar.f963j, null);
            toolbar.f951L.g(toolbar.f963j, null);
            c0157m2.c();
            toolbar.f951L.c();
        }
        toolbar.f954a.setPopupTheme(toolbar.f964k);
        toolbar.f954a.setPresenter(c0157m2);
        toolbar.f950K = c0157m2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            r6.k()
            F.f0 r7 = F.f0.f(r7, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.b()
            int r2 = r7.d()
            int r3 = r7.c()
            int r4 = r7.a()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.f846d
            r2 = 0
            boolean r0 = g(r1, r0, r2)
            java.util.WeakHashMap r1 = F.O.f58a
            android.graphics.Rect r1 = r6.f856n
            F.E.b(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            F.e0 r7 = r7.f94a
            F.f0 r2 = r7.i(r2, r3, r4, r5)
            r6.f859q = r2
            F.f0 r3 = r6.f860r
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L47
            F.f0 r0 = r6.f859q
            r6.f860r = r0
            r0 = 1
        L47:
            android.graphics.Rect r2 = r6.f857o
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L53
            r2.set(r1)
            goto L55
        L53:
            if (r0 == 0) goto L58
        L55:
            r6.requestLayout()
        L58:
            F.f0 r6 = r7.a()
            F.e0 r6 = r6.f94a
            F.f0 r6 = r6.c()
            F.e0 r6 = r6.f94a
            F.f0 r6 = r6.b()
            android.view.WindowInsets r6 = r6.e()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = O.f58a;
        C.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0145g c0145g = (C0145g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0145g).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0145g).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f846d, i2, 0, i3, 0);
        C0145g c0145g = (C0145g) this.f846d.getLayoutParams();
        int max = Math.max(0, this.f846d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0145g).leftMargin + ((ViewGroup.MarginLayoutParams) c0145g).rightMargin);
        int max2 = Math.max(0, this.f846d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0145g).topMargin + ((ViewGroup.MarginLayoutParams) c0145g).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f846d.getMeasuredState());
        WeakHashMap weakHashMap = O.f58a;
        boolean z2 = (AbstractC0023y.g(this) & 256) != 0;
        if (z2) {
            measuredHeight = this.f843a;
            if (this.f851i && this.f846d.getTabContainer() != null) {
                measuredHeight += this.f843a;
            }
        } else {
            measuredHeight = this.f846d.getVisibility() != 8 ? this.f846d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f856n;
        Rect rect2 = this.f858p;
        rect2.set(rect);
        f0 f0Var = this.f859q;
        this.f861s = f0Var;
        if (this.f850h || z2) {
            C0238b a2 = C0238b.a(f0Var.b(), this.f861s.d() + measuredHeight, this.f861s.c(), this.f861s.a());
            X x2 = new X(this.f861s);
            x2.d(a2);
            this.f861s = x2.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f861s = f0Var.f94a.i(0, measuredHeight, 0, 0);
        }
        g(this.f845c, rect2, true);
        if (!this.f862t.equals(this.f861s)) {
            f0 f0Var2 = this.f861s;
            this.f862t = f0Var2;
            ContentFrameLayout contentFrameLayout = this.f845c;
            WindowInsets e2 = f0Var2.e();
            if (e2 != null) {
                WindowInsets a3 = C.a(contentFrameLayout, e2);
                if (!a3.equals(e2)) {
                    f0.f(a3, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f845c, i2, 0, i3, 0);
        C0145g c0145g2 = (C0145g) this.f845c.getLayoutParams();
        int max3 = Math.max(max, this.f845c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0145g2).leftMargin + ((ViewGroup.MarginLayoutParams) c0145g2).rightMargin);
        int max4 = Math.max(max2, this.f845c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0145g2).topMargin + ((ViewGroup.MarginLayoutParams) c0145g2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f845c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f852j || !z2) {
            return false;
        }
        this.f864v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f864v.getFinalY() > this.f846d.getHeight()) {
            h();
            this.f868z.run();
        } else {
            h();
            this.f867y.run();
        }
        this.f853k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f854l + i3;
        this.f854l = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        E e2;
        C0113m c0113m;
        this.f842A.f102a = i2;
        this.f854l = getActionBarHideOffset();
        h();
        InterfaceC0143f interfaceC0143f = this.f863u;
        if (interfaceC0143f == null || (c0113m = (e2 = (E) interfaceC0143f).f2068u) == null) {
            return;
        }
        c0113m.a();
        e2.f2068u = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f846d.getVisibility() != 0) {
            return false;
        }
        return this.f852j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f852j || this.f853k) {
            return;
        }
        if (this.f854l <= this.f846d.getHeight()) {
            h();
            postDelayed(this.f867y, 600L);
        } else {
            h();
            postDelayed(this.f868z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        k();
        int i3 = this.f855m ^ i2;
        this.f855m = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        InterfaceC0143f interfaceC0143f = this.f863u;
        if (interfaceC0143f != null) {
            ((E) interfaceC0143f).f2064q = !z3;
            if (z2 || !z3) {
                E e2 = (E) interfaceC0143f;
                if (e2.f2065r) {
                    e2.f2065r = false;
                    e2.q0(true);
                }
            } else {
                E e3 = (E) interfaceC0143f;
                if (!e3.f2065r) {
                    e3.f2065r = true;
                    e3.q0(true);
                }
            }
        }
        if ((i3 & 256) == 0 || this.f863u == null) {
            return;
        }
        WeakHashMap weakHashMap = O.f58a;
        C.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f844b = i2;
        InterfaceC0143f interfaceC0143f = this.f863u;
        if (interfaceC0143f != null) {
            ((E) interfaceC0143f).f2063p = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.f846d.setTranslationY(-Math.max(0, Math.min(i2, this.f846d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0143f interfaceC0143f) {
        this.f863u = interfaceC0143f;
        if (getWindowToken() != null) {
            ((E) this.f863u).f2063p = this.f844b;
            int i2 = this.f855m;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = O.f58a;
                C.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f851i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f852j) {
            this.f852j = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        k();
        Y0 y0 = (Y0) this.f847e;
        y0.f2753d = i2 != 0 ? B.a.A(y0.f2750a.getContext(), i2) : null;
        y0.c();
    }

    public void setLogo(int i2) {
        k();
        Y0 y0 = (Y0) this.f847e;
        y0.f2754e = i2 != 0 ? B.a.A(y0.f2750a.getContext(), i2) : null;
        y0.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f850h = z2;
        this.f849g = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // i.InterfaceC0142e0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((Y0) this.f847e).f2760k = callback;
    }

    @Override // i.InterfaceC0142e0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        Y0 y0 = (Y0) this.f847e;
        if (y0.f2756g) {
            return;
        }
        y0.f2757h = charSequence;
        if ((y0.f2751b & 8) != 0) {
            Toolbar toolbar = y0.f2750a;
            toolbar.setTitle(charSequence);
            if (y0.f2756g) {
                O.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0145g(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        Y0 y0 = (Y0) this.f847e;
        y0.f2753d = drawable;
        y0.c();
    }
}
