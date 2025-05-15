package com.google.android.material.timepicker;

import F.O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
class ClockFaceView extends f implements d {

    /* renamed from: A, reason: collision with root package name */
    public final int f1944A;

    /* renamed from: B, reason: collision with root package name */
    public final int f1945B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1946C;

    /* renamed from: D, reason: collision with root package name */
    public final String[] f1947D;

    /* renamed from: E, reason: collision with root package name */
    public float f1948E;

    /* renamed from: F, reason: collision with root package name */
    public final ColorStateList f1949F;

    /* renamed from: s, reason: collision with root package name */
    public final ClockHandView f1950s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1951t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1952u;

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f1953v;

    /* renamed from: w, reason: collision with root package name */
    public final c f1954w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1955x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f1956y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1957z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1951t = new Rect();
        this.f1952u = new RectF();
        SparseArray sparseArray = new SparseArray();
        this.f1953v = sparseArray;
        this.f1956y = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f683d, 2130969206, 2131821549);
        Resources resources = getResources();
        ColorStateList f2 = h0.k.f(context, obtainStyledAttributes, 1);
        this.f1949F = f2;
        LayoutInflater.from(context).inflate(2131492921, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131296478);
        this.f1950s = clockHandView;
        this.f1957z = resources.getDimensionPixelSize(2131165503);
        int colorForState = f2.getColorForState(new int[]{R.attr.state_selected}, f2.getDefaultColor());
        this.f1955x = new int[]{colorForState, colorForState, f2.getDefaultColor()};
        clockHandView.f1958a.add(this);
        int defaultColor = B.a.x(context, 2131100156).getDefaultColor();
        ColorStateList f3 = h0.k.f(context, obtainStyledAttributes, 0);
        setBackgroundColor(f3 != null ? f3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f1954w = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f1947D = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.f1947D.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f1947D.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(2131492920, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f1947D[i2]);
                textView.setTag(2131296494, Integer.valueOf(i2));
                O.h(textView, this.f1954w);
                textView.setTextColor(this.f1949F);
            }
        }
        this.f1944A = resources.getDimensionPixelSize(2131165533);
        this.f1945B = resources.getDimensionPixelSize(2131165534);
        this.f1946C = resources.getDimensionPixelSize(2131165509);
    }

    public final void g() {
        RadialGradient radialGradient;
        RectF rectF = this.f1950s.f1962e;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f1953v;
            if (i2 >= sparseArray.size()) {
                return;
            }
            TextView textView = (TextView) sparseArray.get(i2);
            if (textView != null) {
                Rect rect = this.f1951t;
                textView.getDrawingRect(rect);
                rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, rect);
                RectF rectF2 = this.f1952u;
                rectF2.set(rect);
                if (RectF.intersects(rectF, rectF2)) {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.f1955x, this.f1956y, Shader.TileMode.CLAMP);
                } else {
                    radialGradient = null;
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
            i2++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f1947D.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f1946C / Math.max(Math.max(this.f1944A / displayMetrics.heightPixels, this.f1945B / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
