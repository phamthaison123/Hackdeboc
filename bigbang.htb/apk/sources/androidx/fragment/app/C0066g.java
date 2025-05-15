package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0066g extends e.s {

    /* renamed from: c, reason: collision with root package name */
    public final Object f1331c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1332d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1333e;

    public C0066g(c0 c0Var, B.c cVar, boolean z2, boolean z3) {
        super(c0Var, cVar);
        Object obj;
        Object obj2;
        int i2 = c0Var.f1307a;
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = c0Var.f1309c;
        if (i2 == 2) {
            if (z2) {
                obj2 = abstractComponentCallbacksC0075p.k();
            } else {
                abstractComponentCallbacksC0075p.getClass();
                obj2 = null;
            }
            this.f1331c = obj2;
            if (z2) {
                abstractComponentCallbacksC0075p.getClass();
            } else {
                abstractComponentCallbacksC0075p.getClass();
            }
            this.f1332d = true;
        } else {
            if (z2) {
                obj = abstractComponentCallbacksC0075p.l();
            } else {
                abstractComponentCallbacksC0075p.getClass();
                obj = null;
            }
            this.f1331c = obj;
            this.f1332d = true;
        }
        if (!z3) {
            this.f1333e = null;
        } else if (z2) {
            this.f1333e = abstractComponentCallbacksC0075p.m();
        } else {
            abstractComponentCallbacksC0075p.getClass();
            this.f1333e = null;
        }
    }

    public final Y h(Object obj) {
        if (obj == null) {
            return null;
        }
        W w2 = Q.f1243a;
        if (obj instanceof Transition) {
            return w2;
        }
        Y y2 = Q.f1244b;
        if (y2 != null && y2.e(obj)) {
            return y2;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((c0) this.f2138a).f1309c + " is not a valid framework Transition or AndroidX Transition");
    }
}
