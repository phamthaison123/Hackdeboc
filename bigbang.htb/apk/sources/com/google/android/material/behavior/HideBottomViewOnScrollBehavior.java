package com.google.android.material.behavior;

import Y.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i.C0139d;
import s.AbstractC0214a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0214a {

    /* renamed from: a, reason: collision with root package name */
    public int f1669a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1670b = 2;

    /* renamed from: c, reason: collision with root package name */
    public ViewPropertyAnimator f1671c;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // s.AbstractC0214a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f1669a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // s.AbstractC0214a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        int i5 = 2;
        if (i2 > 0) {
            if (this.f1670b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f1671c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1670b = 1;
            this.f1671c = view.animate().translationY(this.f1669a).setInterpolator(a.f708c).setDuration(175L).setListener(new C0139d(i5, this));
            return;
        }
        if (i2 >= 0 || this.f1670b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f1671c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1670b = 2;
        this.f1671c = view.animate().translationY(0).setInterpolator(a.f709d).setDuration(225L).setListener(new C0139d(i5, this));
    }

    @Override // s.AbstractC0214a
    public boolean o(View view, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
