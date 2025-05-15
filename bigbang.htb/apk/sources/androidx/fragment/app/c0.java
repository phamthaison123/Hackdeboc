package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n.AbstractC0204j;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1307a;

    /* renamed from: b, reason: collision with root package name */
    public int f1308b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0075p f1309c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1310d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1311e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1312f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1313g;

    /* renamed from: h, reason: collision with root package name */
    public final M f1314h;

    public c0(int i2, int i3, M m2, B.c cVar) {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
        this.f1310d = new ArrayList();
        this.f1311e = new HashSet();
        this.f1312f = false;
        this.f1313g = false;
        this.f1307a = i2;
        this.f1308b = i3;
        this.f1309c = abstractComponentCallbacksC0075p;
        cVar.b(new S.N(3, this));
        this.f1314h = m2;
    }

    public final void a() {
        if (this.f1312f) {
            return;
        }
        this.f1312f = true;
        HashSet hashSet = this.f1311e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((B.c) it.next()).a();
        }
    }

    public final void b() {
        if (!this.f1313g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1313g = true;
            Iterator it = this.f1310d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1314h.k();
    }

    public final void c(int i2, int i3) {
        int a2 = AbstractC0204j.a(i3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1309c;
        if (a2 == 0) {
            if (this.f1307a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0075p + " mFinalState = " + F.Q.l(this.f1307a) + " -> " + F.Q.l(i2) + ". ");
                }
                this.f1307a = i2;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1307a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0075p + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + F.Q.k(this.f1308b) + " to ADDING.");
                }
                this.f1307a = 2;
                this.f1308b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0075p + " mFinalState = " + F.Q.l(this.f1307a) + " -> REMOVED. mLifecycleImpact  = " + F.Q.k(this.f1308b) + " to REMOVING.");
        }
        this.f1307a = 1;
        this.f1308b = 3;
    }

    public final void d() {
        if (this.f1308b == 2) {
            M m2 = this.f1314h;
            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
            View findFocus = abstractComponentCallbacksC0075p.f1374E.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC0075p.f().f1368o = findFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0075p);
                }
            }
            View C2 = this.f1309c.C();
            if (C2.getParent() == null) {
                m2.b();
                C2.setAlpha(0.0f);
            }
            if (C2.getAlpha() == 0.0f && C2.getVisibility() == 0) {
                C2.setVisibility(4);
            }
            C0073n c0073n = abstractComponentCallbacksC0075p.f1377H;
            C2.setAlpha(c0073n == null ? 1.0f : c0073n.f1367n);
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + F.Q.l(this.f1307a) + "} {mLifecycleImpact = " + F.Q.k(this.f1308b) + "} {mFragment = " + this.f1309c + "}";
    }
}
