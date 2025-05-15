package com.google.android.material.snackbar;

import F.Q;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g.C0107g;
import m0.f;
import n0.d;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final f f1871h;

    public BaseTransientBottomBar$Behavior() {
        f fVar = new f();
        this.f1676e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1677f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f1674c = 0;
        this.f1871h = fVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, s.AbstractC0214a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar = this.f1871h;
        fVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0107g.f2291e == null) {
                    C0107g.f2291e = new C0107g(6);
                }
                C0107g c0107g = C0107g.f2291e;
                Q.h(fVar.f3071a);
                synchronized (c0107g.f2292a) {
                    Q.i(c0107g.f2294c);
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0107g.f2291e == null) {
                C0107g.f2291e = new C0107g(6);
            }
            C0107g c0107g2 = C0107g.f2291e;
            Q.h(fVar.f3071a);
            synchronized (c0107g2.f2292a) {
                Q.i(c0107g2.f2294c);
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f1871h.getClass();
        return view instanceof d;
    }
}
