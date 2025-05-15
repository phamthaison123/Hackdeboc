package androidx.core.widget;

import B.a;
import F.AbstractC0023y;
import F.C0011l;
import F.C0014o;
import F.E;
import F.InterfaceC0010k;
import F.InterfaceC0013n;
import F.O;
import I.b;
import I.d;
import I.e;
import I.f;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import e.C0097c;
import e.h;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0013n, InterfaceC0010k {

    /* renamed from: A, reason: collision with root package name */
    public static final d f1054A = new d();

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f1055B = {R.attr.fillViewport};

    /* renamed from: a, reason: collision with root package name */
    public long f1056a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1057b;

    /* renamed from: c, reason: collision with root package name */
    public final OverScroller f1058c;

    /* renamed from: d, reason: collision with root package name */
    public final EdgeEffect f1059d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f1060e;

    /* renamed from: f, reason: collision with root package name */
    public int f1061f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1062g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1063h;

    /* renamed from: i, reason: collision with root package name */
    public View f1064i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1065j;

    /* renamed from: k, reason: collision with root package name */
    public VelocityTracker f1066k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1067l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1068m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1069n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1070o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1071p;

    /* renamed from: q, reason: collision with root package name */
    public int f1072q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f1073r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1074s;

    /* renamed from: t, reason: collision with root package name */
    public int f1075t;

    /* renamed from: u, reason: collision with root package name */
    public int f1076u;

    /* renamed from: v, reason: collision with root package name */
    public f f1077v;

    /* renamed from: w, reason: collision with root package name */
    public final C0014o f1078w;

    /* renamed from: x, reason: collision with root package name */
    public final C0011l f1079x;

    /* renamed from: y, reason: collision with root package name */
    public float f1080y;

    /* renamed from: z, reason: collision with root package name */
    public e f1081z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969266);
        this.f1057b = new Rect();
        this.f1062g = true;
        this.f1063h = false;
        this.f1064i = null;
        this.f1065j = false;
        this.f1068m = true;
        this.f1072q = -1;
        this.f1073r = new int[2];
        this.f1074s = new int[2];
        this.f1059d = a.H() ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f1060e = a.H() ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f1058c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1069n = viewConfiguration.getScaledTouchSlop();
        this.f1070o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1071p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1055B, 2130969266, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1078w = new C0014o();
        this.f1079x = new C0011l(this);
        setNestedScrollingEnabled(true);
        O.h(this, f1054A);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1080y == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1080y = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1080y;
    }

    public static boolean m(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, view2);
    }

    @Override // F.InterfaceC0012m
    public final void a(View view, View view2, int i2, int i3) {
        C0014o c0014o = this.f1078w;
        if (i3 == 1) {
            c0014o.f103b = i2;
        } else {
            c0014o.f102a = i2;
        }
        this.f1079x.h(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // F.InterfaceC0013n
    public final void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        o(i5, i6, iArr);
    }

    @Override // F.InterfaceC0012m
    public final void c(View view, int i2, int i3, int i4, int i5, int i6) {
        o(i5, i6, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f1058c.isFinished()) {
            return;
        }
        this.f1058c.computeScrollOffset();
        int currY = this.f1058c.getCurrY();
        int i2 = currY - this.f1076u;
        this.f1076u = currY;
        int[] iArr = this.f1074s;
        iArr[1] = 0;
        this.f1079x.c(0, i2, iArr, null, 1);
        int i3 = i2 - iArr[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            q(i3, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            iArr[1] = 0;
            this.f1079x.e(0, scrollY2, 0, i4, this.f1073r, 1, iArr);
            i3 = i4 - iArr[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i3 < 0) {
                    EdgeEffect edgeEffect = this.f1059d;
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1058c.getCurrVelocity());
                    }
                } else {
                    EdgeEffect edgeEffect2 = this.f1060e;
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f1058c.getCurrVelocity());
                    }
                }
            }
            this.f1058c.abortAnimation();
            u(1);
        }
        if (this.f1058c.isFinished()) {
            u(1);
        } else {
            WeakHashMap weakHashMap = O.f58a;
            AbstractC0023y.k(this);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // F.InterfaceC0012m
    public final void d(View view, int i2) {
        C0014o c0014o = this.f1078w;
        if (i2 == 1) {
            c0014o.f103b = 0;
        } else {
            c0014o.f102a = 0;
        }
        u(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1079x.a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1079x.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f1079x.c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1079x.e(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1059d;
        int i3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = O.f58a;
                AbstractC0023y.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1060e;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i3 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap weakHashMap2 = O.f58a;
            AbstractC0023y.k(this);
        }
        canvas.restoreToCount(save2);
    }

    @Override // F.InterfaceC0012m
    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
        this.f1079x.c(i2, i3, iArr, null, i4);
    }

    @Override // F.InterfaceC0012m
    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            i(maxScrollAmount);
        } else {
            Rect rect = this.f1057b;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            i(h(rect));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && (!n(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0014o c0014o = this.f1078w;
        return c0014o.f103b | c0014o.f102a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1079x.g(0);
    }

    public final void i(int i2) {
        if (i2 != 0) {
            if (this.f1068m) {
                s(0, i2, false);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1079x.f100d;
    }

    public final boolean j(KeyEvent keyEvent) {
        Rect rect = this.f1057b;
        rect.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return !keyEvent.isAltPressed() ? g(33) : l(33);
                }
                if (keyCode == 20) {
                    return !keyEvent.isAltPressed() ? g(130) : l(130);
                }
                if (keyCode != 62) {
                    return false;
                }
                int i2 = keyEvent.isShiftPressed() ? 33 : 130;
                boolean z2 = i2 == 130;
                int height = getHeight();
                if (z2) {
                    rect.top = getScrollY() + height;
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View childAt2 = getChildAt(childCount - 1);
                        int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                        if (rect.top + height > paddingBottom) {
                            rect.top = paddingBottom - height;
                        }
                    }
                } else {
                    int scrollY = getScrollY() - height;
                    rect.top = scrollY;
                    if (scrollY < 0) {
                        rect.top = 0;
                    }
                }
                int i3 = rect.top;
                int i4 = height + i3;
                rect.bottom = i4;
                r(i2, i3, i4);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    public final void k(int i2) {
        if (getChildCount() > 0) {
            this.f1058c.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1079x.h(2, 1);
            this.f1076u = getScrollY();
            WeakHashMap weakHashMap = O.f58a;
            AbstractC0023y.k(this);
        }
    }

    public final boolean l(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1057b;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i2, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i2, int i3) {
        Rect rect = this.f1057b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    public final void o(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1079x.d(scrollY2, i2 - scrollY2, i3, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1063h = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1065j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    scrollRange = 0;
                } else if (i2 <= scrollRange) {
                    scrollRange = i2;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1065j) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f1072q;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1061f) > this.f1069n && (2 & getNestedScrollAxes()) == 0) {
                                this.f1065j = true;
                                this.f1061f = y2;
                                if (this.f1066k == null) {
                                    this.f1066k = VelocityTracker.obtain();
                                }
                                this.f1066k.addMovement(motionEvent);
                                this.f1075t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.f1065j = false;
            this.f1072q = -1;
            VelocityTracker velocityTracker = this.f1066k;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1066k = null;
            }
            if (this.f1058c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = O.f58a;
                AbstractC0023y.k(this);
            }
            u(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f1061f = y3;
                    this.f1072q = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1066k;
                    if (velocityTracker2 == null) {
                        this.f1066k = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1066k.addMovement(motionEvent);
                    this.f1058c.computeScrollOffset();
                    if (!t(motionEvent) && this.f1058c.isFinished()) {
                        z2 = false;
                    }
                    this.f1065j = z2;
                    this.f1079x.h(2, 0);
                }
            }
            if (!t(motionEvent) && this.f1058c.isFinished()) {
                z2 = false;
            }
            this.f1065j = z2;
            VelocityTracker velocityTracker3 = this.f1066k;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1066k = null;
            }
        }
        return this.f1065j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        int i7 = 0;
        this.f1062g = false;
        View view = this.f1064i;
        if (view != null && m(view, this)) {
            View view2 = this.f1064i;
            Rect rect = this.f1057b;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f1064i = null;
        if (!this.f1063h) {
            if (this.f1077v != null) {
                scrollTo(getScrollX(), this.f1077v.f161a);
                this.f1077v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i6 = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i6 && scrollY >= 0) {
                i7 = paddingTop + scrollY > i6 ? i6 - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1063h = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1067l && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        k((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1079x.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.f1079x.c(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        o(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (findNextFocus == null || (!n(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f1077v = fVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f161a = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        e eVar = this.f1081z;
        if (eVar != null) {
            C0097c c0097c = (C0097c) eVar;
            h.a(this, (View) c0097c.f2078a, (View) c0097c.f2079b);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !n(findFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1057b;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        i(h(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1072q) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1061f = (int) motionEvent.getY(i2);
            this.f1072q = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1066k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z2 = false;
        } else {
            i3 = 0;
            z2 = true;
        }
        if (i6 <= i5) {
            if (i6 >= 0) {
                i5 = i6;
                z3 = false;
                if (z3 && !this.f1079x.g(1)) {
                    this.f1058c.springBack(i3, i5, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i3, i5);
                return z2 || z3;
            }
            i5 = 0;
        }
        z3 = true;
        if (z3) {
            this.f1058c.springBack(i3, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i5);
        if (z2) {
            return true;
        }
    }

    public final boolean r(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            i(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1062g) {
            this.f1064i = view2;
        } else {
            Rect rect = this.f1057b;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        boolean z3 = h2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, h2);
            } else {
                s(0, h2, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1066k) != null) {
            velocityTracker.recycle();
            this.f1066k = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1062g = true;
        super.requestLayout();
    }

    public final void s(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1056a > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1058c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f1079x.h(2, 1);
            } else {
                u(1);
            }
            this.f1076u = getScrollY();
            WeakHashMap weakHashMap = O.f58a;
            AbstractC0023y.k(this);
        } else {
            if (!this.f1058c.isFinished()) {
                this.f1058c.abortAnimation();
                u(1);
            }
            scrollBy(i2, i3);
        }
        this.f1056a = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1067l) {
            this.f1067l = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0011l c0011l = this.f1079x;
        if (c0011l.f100d) {
            WeakHashMap weakHashMap = O.f58a;
            E.z(c0011l.f99c);
        }
        c0011l.f100d = z2;
    }

    public void setOnScrollChangeListener(e eVar) {
        this.f1081z = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1068m = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1079x.h(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        u(0);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1059d;
        if (a.z(edgeEffect) != 0.0f) {
            a.X(edgeEffect, 0.0f, motionEvent.getY() / getHeight());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1060e;
        if (a.z(edgeEffect2) == 0.0f) {
            return z2;
        }
        a.X(edgeEffect2, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
        return true;
    }

    public final void u(int i2) {
        this.f1079x.i(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
