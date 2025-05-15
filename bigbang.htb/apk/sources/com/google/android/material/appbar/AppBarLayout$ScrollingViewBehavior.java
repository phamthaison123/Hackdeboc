package com.google.android.material.appbar;

import F.O;
import X.a;
import Z.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s.AbstractC0214a;
import s.C0217d;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends c {

    /* renamed from: c, reason: collision with root package name */
    public final int f1665c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    @Override // s.AbstractC0214a
    public final boolean d(View view, View view2) {
        int i2;
        AbstractC0214a abstractC0214a = ((C0217d) view2.getLayoutParams()).f3691a;
        if (abstractC0214a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0214a).getClass();
            int i3 = this.f1665c;
            if (i3 == 0 || (i2 = (int) (0.0f * i3)) < 0) {
                i3 = 0;
            } else if (i2 <= i3) {
                i3 = i2;
            }
            int i4 = bottom - i3;
            WeakHashMap weakHashMap = O.f58a;
            view.offsetTopAndBottom(i4);
        }
        return false;
    }

    @Override // s.AbstractC0214a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // s.AbstractC0214a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // Z.c
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f701v);
        this.f1665c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
