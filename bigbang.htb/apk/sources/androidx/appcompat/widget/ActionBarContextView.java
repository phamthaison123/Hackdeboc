package androidx.appcompat.widget;

import F.AbstractC0023y;
import F.O;
import F.T;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.AbstractC0092a;
import g.AbstractC0103c;
import h.D;
import h.o;
import i.C0133a;
import i.C0147h;
import i.C0157m;
import i.ViewOnClickListenerC0137c;
import i.b1;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0133a f821a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f822b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f823c;

    /* renamed from: d, reason: collision with root package name */
    public C0157m f824d;

    /* renamed from: e, reason: collision with root package name */
    public int f825e;

    /* renamed from: f, reason: collision with root package name */
    public T f826f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f827g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f828h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f829i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f830j;

    /* renamed from: k, reason: collision with root package name */
    public View f831k;

    /* renamed from: l, reason: collision with root package name */
    public View f832l;

    /* renamed from: m, reason: collision with root package name */
    public View f833m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f834n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f835o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f836p;

    /* renamed from: q, reason: collision with root package name */
    public final int f837q;

    /* renamed from: r, reason: collision with root package name */
    public final int f838r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f839s;

    /* renamed from: t, reason: collision with root package name */
    public final int f840t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968604);
        int resourceId;
        this.f821a = new C0133a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130968578, typedValue, true) || typedValue.resourceId == 0) {
            this.f822b = context;
        } else {
            this.f822b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0092a.f2009d, 2130968604, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : B.a.A(context, resourceId);
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.q(this, drawable);
        this.f837q = obtainStyledAttributes.getResourceId(5, 0);
        this.f838r = obtainStyledAttributes.getResourceId(4, 0);
        this.f825e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f840t = obtainStyledAttributes.getResourceId(2, 2131492869);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public static int j(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0103c abstractC0103c) {
        View view = this.f831k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f840t, (ViewGroup) this, false);
            this.f831k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f831k);
        }
        View findViewById = this.f831k.findViewById(2131296319);
        this.f832l = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC0137c(this, abstractC0103c));
        o e2 = abstractC0103c.e();
        C0157m c0157m = this.f824d;
        if (c0157m != null) {
            c0157m.f();
            C0147h c0147h = c0157m.f2847t;
            if (c0147h != null && c0147h.b()) {
                c0147h.f2527j.dismiss();
            }
        }
        C0157m c0157m2 = new C0157m(getContext());
        this.f824d = c0157m2;
        c0157m2.f2839l = true;
        c0157m2.f2840m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e2.b(this.f824d, this.f822b);
        C0157m c0157m3 = this.f824d;
        D d2 = c0157m3.f2835h;
        if (d2 == null) {
            D d3 = (D) c0157m3.f2831d.inflate(c0157m3.f2833f, (ViewGroup) this, false);
            c0157m3.f2835h = d3;
            d3.b(c0157m3.f2830c);
            c0157m3.c();
        }
        D d4 = c0157m3.f2835h;
        if (d2 != d4) {
            ((ActionMenuView) d4).setPresenter(c0157m3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) d4;
        this.f823c = actionMenuView;
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.q(actionMenuView, null);
        addView(this.f823c, layoutParams);
    }

    public final void d() {
        if (this.f834n == null) {
            LayoutInflater.from(getContext()).inflate(2131492864, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f834n = linearLayout;
            this.f835o = (TextView) linearLayout.findViewById(2131296310);
            this.f836p = (TextView) this.f834n.findViewById(2131296309);
            int i2 = this.f837q;
            if (i2 != 0) {
                this.f835o.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f838r;
            if (i3 != 0) {
                this.f836p.setTextAppearance(getContext(), i3);
            }
        }
        this.f835o.setText(this.f829i);
        this.f836p.setText(this.f830j);
        boolean z2 = !TextUtils.isEmpty(this.f829i);
        boolean z3 = !TextUtils.isEmpty(this.f830j);
        this.f836p.setVisibility(z3 ? 0 : 8);
        this.f834n.setVisibility((z2 || z3) ? 0 : 8);
        if (this.f834n.getParent() == null) {
            addView(this.f834n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f833m = null;
        this.f823c = null;
        this.f824d = null;
        View view = this.f832l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0092a.f2006a, 2130968581, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0157m c0157m = this.f824d;
        if (c0157m != null) {
            Configuration configuration2 = c0157m.f2829b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            c0157m.f2843p = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            o oVar = c0157m.f2830c;
            if (oVar != null) {
                oVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f826f != null ? this.f821a.f2767b : getVisibility();
    }

    public int getContentHeight() {
        return this.f825e;
    }

    public CharSequence getSubtitle() {
        return this.f830j;
    }

    public CharSequence getTitle() {
        return this.f829i;
    }

    public final boolean h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f828h = false;
        }
        if (!this.f828h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f828h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f828h = false;
        }
        return true;
    }

    public final boolean i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f827g = false;
        }
        if (!this.f827g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f827g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f827g = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            T t2 = this.f826f;
            if (t2 != null) {
                t2.b();
            }
            super.setVisibility(i2);
        }
    }

    public final T l(int i2, long j2) {
        T t2 = this.f826f;
        if (t2 != null) {
            t2.b();
        }
        C0133a c0133a = this.f821a;
        if (i2 != 0) {
            T a2 = O.a(this);
            a2.a(0.0f);
            a2.c(j2);
            c0133a.f2768c.f826f = a2;
            c0133a.f2767b = i2;
            a2.d(c0133a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        T a3 = O.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0133a.f2768c.f826f = a3;
        c0133a.f2767b = i2;
        a3.d(c0133a);
        return a3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0157m c0157m = this.f824d;
        if (c0157m != null) {
            c0157m.f();
            C0147h c0147h = this.f824d.f2847t;
            if (c0147h == null || !c0147h.b()) {
                return;
            }
            c0147h.f2527j.dismiss();
        }
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        h(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean a2 = b1.a(this);
        int paddingRight = a2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f831k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f831k.getLayoutParams();
            int i6 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = a2 ? paddingRight - i6 : paddingRight + i6;
            int j2 = j(this.f831k, i8, paddingTop, paddingTop2, a2) + i8;
            paddingRight = a2 ? j2 - i7 : j2 + i7;
        }
        LinearLayout linearLayout = this.f834n;
        if (linearLayout != null && this.f833m == null && linearLayout.getVisibility() != 8) {
            paddingRight += j(this.f834n, paddingRight, paddingTop, paddingTop2, a2);
        }
        View view2 = this.f833m;
        if (view2 != null) {
            j(view2, paddingRight, paddingTop, paddingTop2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f823c;
        if (actionMenuView != null) {
            j(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f825e;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        View view = this.f831k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f831k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f823c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f823c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f834n;
        if (linearLayout != null && this.f833m == null) {
            if (this.f839s) {
                this.f834n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f834n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f834n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f833m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                i5 = Math.min(i8, i5);
            }
            this.f833m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
        }
        if (this.f825e > 0) {
            setMeasuredDimension(size, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        i(motionEvent);
        return true;
    }

    public void setContentHeight(int i2) {
        this.f825e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f833m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f833m = view;
        if (view != null && (linearLayout = this.f834n) != null) {
            removeView(linearLayout);
            this.f834n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f830j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f829i = charSequence;
        d();
        O.i(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f839s) {
            requestLayout();
        }
        this.f839s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
