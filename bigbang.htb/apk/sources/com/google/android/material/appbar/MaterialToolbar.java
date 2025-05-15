package com.google.android.material.appbar;

import F.AbstractC0023y;
import F.E;
import F.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import h0.k;
import java.util.WeakHashMap;
import m0.h;
import p0.a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: O, reason: collision with root package name */
    public Integer f1666O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1667P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f1668Q;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969531, 2131821557), attributeSet, 0);
        Context context2 = getContext();
        TypedArray j2 = k.j(context2, attributeSet, X.a.f699t, 2130969531, 2131821557, new int[0]);
        if (j2.hasValue(0)) {
            setNavigationIconTint(j2.getColor(0, -1));
        }
        this.f1667P = j2.getBoolean(2, false);
        this.f1668Q = j2.getBoolean(1, false);
        j2.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            h hVar = new h();
            hVar.k(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            hVar.i(context2);
            WeakHashMap weakHashMap = O.f58a;
            hVar.j(E.i(this));
            AbstractC0023y.q(this, hVar);
        }
    }

    public Integer getNavigationIconTint() {
        return this.f1666O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof h) {
            k.n(this, (h) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f1667P || this.f1668Q) {
            TextView E2 = B.a.E(this, getTitle());
            TextView E3 = B.a.E(this, getSubtitle());
            if (E2 == null && E3 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i6 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && childAt != E2 && childAt != E3) {
                    if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.f1667P && E2 != null) {
                u(E2, pair);
            }
            if (!this.f1668Q || E3 == null) {
                return;
            }
            u(E3, pair);
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof h) {
            ((h) background).j(f2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f1666O != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f1666O.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.f1666O = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f1668Q != z2) {
            this.f1668Q = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f1667P != z2) {
            this.f1667P = z2;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i3 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i3, textView.getBottom());
    }
}
