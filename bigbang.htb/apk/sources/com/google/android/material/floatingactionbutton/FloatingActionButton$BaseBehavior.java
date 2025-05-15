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
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0214a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // s.AbstractC0214a
    public final boolean a(View view) {
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

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f686g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
