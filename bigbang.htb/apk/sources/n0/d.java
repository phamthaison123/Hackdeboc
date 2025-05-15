package n0;

import F.AbstractC0023y;
import F.C;
import F.E;
import F.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import h0.k;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class d extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final c f3244h = new c();

    /* renamed from: a, reason: collision with root package name */
    public int f3245a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3246b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3247c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3248d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3249e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f3250f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f3251g;

    public d(Context context, AttributeSet attributeSet) {
        super(p0.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, X.a.f703x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = O.f58a;
            E.s(this, dimensionPixelSize);
        }
        this.f3245a = obtainStyledAttributes.getInt(2, 0);
        this.f3246b = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(k.f(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(k.k(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f3247c = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f3248d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f3249e = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f3244h);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(2131165709);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(B.a.K(B.a.w(this, 2130968802), B.a.w(this, 2130968787), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.f3250f;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = O.f58a;
            AbstractC0023y.q(this, gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f3247c;
    }

    public int getAnimationMode() {
        return this.f3245a;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f3246b;
    }

    public int getMaxInlineActionWidth() {
        return this.f3249e;
    }

    public int getMaxWidth() {
        return this.f3248d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = O.f58a;
        C.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f3248d;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f3245a = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f3250f != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f3250f);
            drawable.setTintMode(this.f3251g);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f3250f = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f3251g);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f3251g = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(a aVar) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f3244h);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(b bVar) {
    }
}
