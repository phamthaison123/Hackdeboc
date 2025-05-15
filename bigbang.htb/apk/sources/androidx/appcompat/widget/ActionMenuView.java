package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import e.z;
import h.D;
import h.InterfaceC0114A;
import h.m;
import h.n;
import h.o;
import h.q;
import i.AbstractC0160n0;
import i.C0147h;
import i.C0155l;
import i.C0157m;
import i.C0158m0;
import i.C0161o;
import i.InterfaceC0159n;
import i.InterfaceC0163p;
import i.b1;
import m0.e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ActionMenuView extends AbstractC0160n0 implements n, D {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC0163p f869A;

    /* renamed from: p, reason: collision with root package name */
    public o f870p;

    /* renamed from: q, reason: collision with root package name */
    public Context f871q;

    /* renamed from: r, reason: collision with root package name */
    public int f872r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f873s;

    /* renamed from: t, reason: collision with root package name */
    public C0157m f874t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0114A f875u;

    /* renamed from: v, reason: collision with root package name */
    public m f876v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f877w;

    /* renamed from: x, reason: collision with root package name */
    public int f878x;

    /* renamed from: y, reason: collision with root package name */
    public final int f879y;

    /* renamed from: z, reason: collision with root package name */
    public final int f880z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f879y = (int) (56.0f * f2);
        this.f880z = (int) (f2 * 4.0f);
        this.f871q = context;
        this.f872r = 0;
    }

    public static C0161o l() {
        C0161o c0161o = new C0161o(-2, -2);
        c0161o.f2866a = false;
        ((LinearLayout.LayoutParams) c0161o).gravity = 16;
        return c0161o;
    }

    public static C0161o m(ViewGroup.LayoutParams layoutParams) {
        C0161o c0161o;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof C0161o) {
            C0161o c0161o2 = (C0161o) layoutParams;
            c0161o = new C0161o(c0161o2);
            c0161o.f2866a = c0161o2.f2866a;
        } else {
            c0161o = new C0161o(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0161o).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0161o).gravity = 16;
        }
        return c0161o;
    }

    @Override // h.D
    public final void b(o oVar) {
        this.f870p = oVar;
    }

    @Override // i.AbstractC0160n0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0161o;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // h.n
    public final boolean e(q qVar) {
        return this.f870p.q(qVar, null, 0);
    }

    @Override // i.AbstractC0160n0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // i.AbstractC0160n0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f870p == null) {
            Context context = getContext();
            o oVar = new o(context);
            this.f870p = oVar;
            oVar.f2454e = new z(5, this);
            C0157m c0157m = new C0157m(context);
            this.f874t = c0157m;
            c0157m.f2839l = true;
            c0157m.f2840m = true;
            InterfaceC0114A interfaceC0114A = this.f875u;
            if (interfaceC0114A == null) {
                interfaceC0114A = new e();
            }
            c0157m.f2832e = interfaceC0114A;
            this.f870p.b(c0157m, this.f871q);
            C0157m c0157m2 = this.f874t;
            c0157m2.f2835h = this;
            this.f870p = c0157m2.f2830c;
        }
        return this.f870p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0157m c0157m = this.f874t;
        C0155l c0155l = c0157m.f2836i;
        if (c0155l != null) {
            return c0155l.getDrawable();
        }
        if (c0157m.f2838k) {
            return c0157m.f2837j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f872r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // i.AbstractC0160n0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0158m0 generateDefaultLayoutParams() {
        return l();
    }

    @Override // i.AbstractC0160n0
    /* renamed from: i */
    public final C0158m0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0161o(getContext(), attributeSet);
    }

    @Override // i.AbstractC0160n0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0158m0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0159n)) {
            z2 = ((InterfaceC0159n) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0159n)) ? z2 : z2 | ((InterfaceC0159n) childAt2).a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0157m c0157m = this.f874t;
        if (c0157m != null) {
            c0157m.c();
            if (this.f874t.i()) {
                this.f874t.f();
                this.f874t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0157m c0157m = this.f874t;
        if (c0157m != null) {
            c0157m.f();
            C0147h c0147h = c0157m.f2847t;
            if (c0147h == null || !c0147h.b()) {
                return;
            }
            c0147h.f2527j.dismiss();
        }
    }

    @Override // i.AbstractC0160n0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.f877w) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = b1.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0161o c0161o = (C0161o) childAt.getLayoutParams();
                if (c0161o.f2866a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0161o).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0161o).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0161o).leftMargin) + ((LinearLayout.LayoutParams) c0161o).rightMargin;
                    n(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0161o c0161o2 = (C0161o) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0161o2.f2866a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c0161o2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0161o2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0161o c0161o3 = (C0161o) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0161o3.f2866a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) c0161o3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0161o3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // i.AbstractC0160n0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r1;
        int i11;
        int i12;
        int i13;
        o oVar;
        boolean z3 = this.f877w;
        boolean z4 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f877w = z4;
        if (z3 != z4) {
            this.f878x = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f877w && (oVar = this.f870p) != null && size != this.f878x) {
            this.f878x = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f877w || childCount <= 0) {
            for (int i14 = 0; i14 < childCount; i14++) {
                C0161o c0161o = (C0161o) getChildAt(i14).getLayoutParams();
                ((LinearLayout.LayoutParams) c0161o).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0161o).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.f879y;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z5 = false;
        int i23 = 0;
        int i24 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f880z;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i25 = size3;
            if (childAt.getVisibility() == 8) {
                i11 = i15;
                i12 = paddingBottom;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i26 = i20 + 1;
                if (z6) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0161o c0161o2 = (C0161o) childAt.getLayoutParams();
                c0161o2.f2871f = false;
                c0161o2.f2868c = 0;
                c0161o2.f2867b = 0;
                c0161o2.f2869d = false;
                ((LinearLayout.LayoutParams) c0161o2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0161o2).rightMargin = 0;
                c0161o2.f2870e = z6 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i27 = c0161o2.f2866a ? 1 : i17;
                C0161o c0161o3 = (C0161o) childAt.getLayoutParams();
                i11 = i15;
                i12 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i27 <= 0 || (z7 && i27 < 2)) {
                    i13 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i13 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i13++;
                    }
                    if (z7 && i13 < 2) {
                        i13 = 2;
                    }
                }
                c0161o3.f2869d = !c0161o3.f2866a && z7;
                c0161o3.f2867b = i13;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i19, 1073741824), makeMeasureSpec);
                i21 = Math.max(i21, i13);
                if (c0161o2.f2869d) {
                    i23++;
                }
                if (c0161o2.f2866a) {
                    z5 = true;
                }
                i17 -= i13;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (i13 == 1) {
                    j2 |= 1 << i22;
                }
                i20 = i26;
            }
            i22++;
            size3 = i25;
            paddingBottom = i12;
            i15 = i11;
        }
        int i28 = i15;
        int i29 = size3;
        int i30 = i24;
        boolean z8 = z5 && i20 == 2;
        boolean z9 = false;
        while (i23 > 0 && i17 > 0) {
            int i31 = Integer.MAX_VALUE;
            int i32 = 0;
            int i33 = 0;
            long j3 = 0;
            while (i33 < childCount2) {
                int i34 = i30;
                C0161o c0161o4 = (C0161o) getChildAt(i33).getLayoutParams();
                boolean z10 = z9;
                if (c0161o4.f2869d) {
                    int i35 = c0161o4.f2867b;
                    if (i35 < i31) {
                        j3 = 1 << i33;
                        i31 = i35;
                        i32 = 1;
                    } else if (i35 == i31) {
                        i32++;
                        j3 |= 1 << i33;
                    }
                }
                i33++;
                z9 = z10;
                i30 = i34;
            }
            i6 = i30;
            z2 = z9;
            j2 |= j3;
            if (i32 > i17) {
                i5 = mode;
                break;
            }
            int i36 = i31 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                C0161o c0161o5 = (C0161o) childAt2.getLayoutParams();
                int i38 = mode;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j4 = 1 << i37;
                if ((j3 & j4) != 0) {
                    if (z8 && c0161o5.f2870e) {
                        r1 = 1;
                        r1 = 1;
                        if (i17 == 1) {
                            childAt2.setPadding(i4 + i19, 0, i4, 0);
                        }
                    } else {
                        r1 = 1;
                    }
                    c0161o5.f2867b += r1;
                    c0161o5.f2871f = r1;
                    i17--;
                } else if (c0161o5.f2867b == i36) {
                    j2 |= j4;
                }
                i37++;
                childMeasureSpec = i39;
                mode = i38;
                childCount2 = i40;
            }
            i30 = i6;
            z9 = true;
        }
        i5 = mode;
        i6 = i30;
        z2 = z9;
        int i41 = childMeasureSpec;
        int i42 = childCount2;
        boolean z11 = !z5 && i20 == 1;
        if (i17 <= 0 || j2 == 0 || (i17 >= i20 - 1 && !z11 && i21 <= 1)) {
            i7 = i42;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z11) {
                if ((j2 & 1) != 0 && !((C0161o) getChildAt(0).getLayoutParams()).f2870e) {
                    bitCount -= 0.5f;
                }
                int i43 = i42 - 1;
                if ((j2 & (1 << i43)) != 0 && !((C0161o) getChildAt(i43).getLayoutParams()).f2870e) {
                    bitCount -= 0.5f;
                }
            }
            int i44 = bitCount > 0.0f ? (int) ((i17 * i19) / bitCount) : 0;
            i7 = i42;
            for (int i45 = 0; i45 < i7; i45++) {
                if ((j2 & (1 << i45)) != 0) {
                    View childAt3 = getChildAt(i45);
                    C0161o c0161o6 = (C0161o) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0161o6.f2868c = i44;
                        c0161o6.f2871f = true;
                        if (i45 == 0 && !c0161o6.f2870e) {
                            ((LinearLayout.LayoutParams) c0161o6).leftMargin = (-i44) / 2;
                        }
                        z2 = true;
                    } else if (c0161o6.f2866a) {
                        c0161o6.f2868c = i44;
                        c0161o6.f2871f = true;
                        ((LinearLayout.LayoutParams) c0161o6).rightMargin = (-i44) / 2;
                        z2 = true;
                    } else {
                        if (i45 != 0) {
                            ((LinearLayout.LayoutParams) c0161o6).leftMargin = i44 / 2;
                        }
                        if (i45 != i7 - 1) {
                            ((LinearLayout.LayoutParams) c0161o6).rightMargin = i44 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            int i46 = 0;
            while (i46 < i7) {
                View childAt4 = getChildAt(i46);
                C0161o c0161o7 = (C0161o) childAt4.getLayoutParams();
                if (c0161o7.f2871f) {
                    i10 = i41;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0161o7.f2867b * i19) + c0161o7.f2868c, 1073741824), i10);
                } else {
                    i10 = i41;
                }
                i46++;
                i41 = i10;
            }
        }
        if (i5 != 1073741824) {
            i9 = i28;
            i8 = i6;
        } else {
            i8 = i29;
            i9 = i28;
        }
        setMeasuredDimension(i9, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f874t.f2844q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0163p interfaceC0163p) {
        this.f869A = interfaceC0163p;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0157m c0157m = this.f874t;
        C0155l c0155l = c0157m.f2836i;
        if (c0155l != null) {
            c0155l.setImageDrawable(drawable);
        } else {
            c0157m.f2838k = true;
            c0157m.f2837j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f873s = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f872r != i2) {
            this.f872r = i2;
            if (i2 == 0) {
                this.f871q = getContext();
            } else {
                this.f871q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0157m c0157m) {
        this.f874t = c0157m;
        c0157m.f2835h = this;
        this.f870p = c0157m.f2830c;
    }

    @Override // i.AbstractC0160n0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0161o(getContext(), attributeSet);
    }
}
