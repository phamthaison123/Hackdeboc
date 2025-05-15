package com.google.android.material.floatingactionbutton;

import F.Q;
import X.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s.AbstractC0214a;
import s.C0217d;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC0214a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // s.AbstractC0214a
    public final /* bridge */ /* synthetic */ boolean a(View view) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final void c(C0217d c0217d) {
        if (c0217d.f3698h == 0) {
            c0217d.f3698h = 80;
        }
    }

    @Override // s.AbstractC0214a
    public final boolean d(View view, View view2) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        Q.g(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f685f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
