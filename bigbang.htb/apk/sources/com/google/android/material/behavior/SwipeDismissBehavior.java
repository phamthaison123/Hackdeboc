package com.google.android.material.behavior;

import F.AbstractC0023y;
import F.O;
import G.b;
import L.e;
import a0.a;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e.z;
import java.util.WeakHashMap;
import s.AbstractC0214a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0214a {

    /* renamed from: a, reason: collision with root package name */
    public e f1672a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1673b;

    /* renamed from: c, reason: collision with root package name */
    public int f1674c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final float f1675d = 0.5f;

    /* renamed from: e, reason: collision with root package name */
    public float f1676e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1677f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final a f1678g = new a(this);

    @Override // s.AbstractC0214a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f1673b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1673b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1673b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f1672a == null) {
            this.f1672a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f1678g);
        }
        return this.f1672a.p(motionEvent);
    }

    @Override // s.AbstractC0214a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = O.f58a;
        if (AbstractC0023y.c(view) == 0) {
            AbstractC0023y.s(view, 1);
            O.f(view, 1048576);
            O.d(view, 0);
            if (r(view)) {
                O.g(view, b.f121j, new z(26, this));
            }
        }
        return false;
    }

    @Override // s.AbstractC0214a
    public final boolean q(View view, MotionEvent motionEvent) {
        e eVar = this.f1672a;
        if (eVar == null) {
            return false;
        }
        eVar.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
