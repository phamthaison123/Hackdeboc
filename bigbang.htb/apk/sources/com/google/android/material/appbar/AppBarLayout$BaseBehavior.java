package com.google.android.material.appbar;

import F.Q;
import Z.b;
import Z.d;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class AppBarLayout$BaseBehavior<T> extends b {
    public AppBarLayout$BaseBehavior() {
        this.f722d = -1;
        this.f724f = -1;
    }

    @Override // Z.c, s.AbstractC0214a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final void m(View view, Parcelable parcelable) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final Parcelable n(View view) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final boolean o(View view, int i2, int i3) {
        Q.g(view);
        throw null;
    }

    @Override // s.AbstractC0214a
    public final void p(View view, View view2, int i2) {
        Q.g(view);
        throw null;
    }

    public final int s() {
        d dVar = this.f726a;
        if (dVar != null) {
            return dVar.f731d;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            F.Q.i(r4)
            int r2 = r2.s()
            r4 = 0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 < r0) goto L1c
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 > r1) goto L1c
            if (r5 >= r0) goto L15
            r5 = r0
            goto L18
        L15:
            if (r5 <= r1) goto L18
            r5 = r1
        L18:
            if (r2 != r5) goto L1b
            goto L1c
        L1b:
            throw r4
        L1c:
            G.b r2 = G.b.f117f
            int r2 = r2.a()
            F.O.f(r3, r2)
            r2 = 0
            F.O.d(r3, r2)
            G.b r5 = G.b.f118g
            int r5 = r5.a()
            F.O.f(r3, r5)
            F.O.d(r3, r2)
            int r5 = r3.getChildCount()
        L39:
            if (r2 >= r5) goto L4f
            android.view.View r0 = r3.getChildAt(r2)
            boolean r1 = r0 instanceof F.InterfaceC0010k
            if (r1 != 0) goto L50
            boolean r1 = r0 instanceof android.widget.ListView
            if (r1 != 0) goto L50
            boolean r1 = r0 instanceof android.widget.ScrollView
            if (r1 == 0) goto L4c
            goto L50
        L4c:
            int r2 = r2 + 1
            goto L39
        L4f:
            r0 = r4
        L50:
            if (r0 != 0) goto L53
            return
        L53:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.t(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):void");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f722d = -1;
        this.f724f = -1;
    }
}
