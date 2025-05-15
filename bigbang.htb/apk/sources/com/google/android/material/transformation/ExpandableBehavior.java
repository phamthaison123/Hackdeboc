package com.google.android.material.transformation;

import F.B;
import F.O;
import F.Q;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s.AbstractC0214a;

@Deprecated
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class ExpandableBehavior extends AbstractC0214a {
    public ExpandableBehavior() {
    }

    @Override // s.AbstractC0214a
    public abstract void b(View view);

    @Override // s.AbstractC0214a
    public final boolean d(View view, View view2) {
        Q.i(view2);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = O.f58a;
        if (!B.c(view)) {
            ArrayList j2 = coordinatorLayout.j(view);
            int size = j2.size();
            for (int i3 = 0; i3 < size; i3++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
