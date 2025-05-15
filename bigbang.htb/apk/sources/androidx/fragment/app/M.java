package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i.C0182z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final C0182z f1223a;

    /* renamed from: b, reason: collision with root package name */
    public final N f1224b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0075p f1225c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1226d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1227e = -1;

    public M(C0182z c0182z, N n2, AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        this.f1223a = c0182z;
        this.f1224b = n2;
        this.f1225c = abstractComponentCallbacksC0075p;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0075p);
        }
        Bundle bundle = abstractComponentCallbacksC0075p.f1388b;
        abstractComponentCallbacksC0075p.f1406t.J();
        abstractComponentCallbacksC0075p.f1387a = 3;
        abstractComponentCallbacksC0075p.f1372C = true;
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0075p);
        }
        View view = abstractComponentCallbacksC0075p.f1374E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0075p.f1388b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0075p.f1389c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0075p.f1389c = null;
            }
            if (abstractComponentCallbacksC0075p.f1374E != null) {
                abstractComponentCallbacksC0075p.f1383N.f1264c.a(abstractComponentCallbacksC0075p.f1390d);
                abstractComponentCallbacksC0075p.f1390d = null;
            }
            abstractComponentCallbacksC0075p.f1372C = false;
            abstractComponentCallbacksC0075p.y(bundle2);
            if (!abstractComponentCallbacksC0075p.f1372C) {
                throw new e0("Fragment " + abstractComponentCallbacksC0075p + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0075p.f1374E != null) {
                abstractComponentCallbacksC0075p.f1383N.c(androidx.lifecycle.i.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0075p.f1388b = null;
        H h2 = abstractComponentCallbacksC0075p.f1406t;
        h2.f1161A = false;
        h2.f1162B = false;
        h2.f1168H.f1209g = false;
        h2.s(4);
        this.f1223a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        N n2 = this.f1224b;
        n2.getClass();
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        ViewGroup viewGroup = abstractComponentCallbacksC0075p.f1373D;
        int i2 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = n2.f1228a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0075p);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = (AbstractComponentCallbacksC0075p) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0075p2.f1373D == viewGroup && (view = abstractComponentCallbacksC0075p2.f1374E) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p3 = (AbstractComponentCallbacksC0075p) arrayList.get(i3);
                    if (abstractComponentCallbacksC0075p3.f1373D == viewGroup && (view2 = abstractComponentCallbacksC0075p3.f1374E) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        abstractComponentCallbacksC0075p.f1373D.addView(abstractComponentCallbacksC0075p.f1374E, i2);
    }

    public final void c() {
        M m2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0075p);
        }
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = abstractComponentCallbacksC0075p.f1393g;
        N n2 = this.f1224b;
        if (abstractComponentCallbacksC0075p2 != null) {
            m2 = (M) n2.f1229b.get(abstractComponentCallbacksC0075p2.f1391e);
            if (m2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0075p + " declared target fragment " + abstractComponentCallbacksC0075p.f1393g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0075p.f1394h = abstractComponentCallbacksC0075p.f1393g.f1391e;
            abstractComponentCallbacksC0075p.f1393g = null;
        } else {
            String str = abstractComponentCallbacksC0075p.f1394h;
            if (str != null) {
                m2 = (M) n2.f1229b.get(str);
                if (m2 == null) {
                    throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0075p + " declared target fragment " + abstractComponentCallbacksC0075p.f1394h + " that does not belong to this FragmentManager!");
                }
            } else {
                m2 = null;
            }
        }
        if (m2 != null) {
            m2.k();
        }
        H h2 = abstractComponentCallbacksC0075p.f1404r;
        abstractComponentCallbacksC0075p.f1405s = h2.f1185p;
        abstractComponentCallbacksC0075p.f1407u = h2.f1187r;
        C0182z c0182z = this.f1223a;
        c0182z.h(false);
        ArrayList arrayList = abstractComponentCallbacksC0075p.f1386Q;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            F.Q.i(it.next());
            throw null;
        }
        arrayList.clear();
        abstractComponentCallbacksC0075p.f1406t.b(abstractComponentCallbacksC0075p.f1405s, abstractComponentCallbacksC0075p.c(), abstractComponentCallbacksC0075p);
        abstractComponentCallbacksC0075p.f1387a = 0;
        abstractComponentCallbacksC0075p.f1372C = false;
        abstractComponentCallbacksC0075p.p(abstractComponentCallbacksC0075p.f1405s.f1416d);
        if (!abstractComponentCallbacksC0075p.f1372C) {
            throw new e0("Fragment " + abstractComponentCallbacksC0075p + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0075p.f1404r.f1183n.iterator();
        while (it2.hasNext()) {
            ((K) it2.next()).f();
        }
        H h3 = abstractComponentCallbacksC0075p.f1406t;
        h3.f1161A = false;
        h3.f1162B = false;
        h3.f1168H.f1209g = false;
        h3.s(0);
        c0182z.b(false);
    }

    public final int d() {
        c0 c0Var;
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (abstractComponentCallbacksC0075p.f1404r == null) {
            return abstractComponentCallbacksC0075p.f1387a;
        }
        int i2 = this.f1227e;
        int ordinal = abstractComponentCallbacksC0075p.f1381L.ordinal();
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        if (abstractComponentCallbacksC0075p.f1399m) {
            if (abstractComponentCallbacksC0075p.f1400n) {
                i2 = Math.max(this.f1227e, 2);
                View view = abstractComponentCallbacksC0075p.f1374E;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f1227e < 4 ? Math.min(i2, abstractComponentCallbacksC0075p.f1387a) : Math.min(i2, 1);
            }
        }
        if (!abstractComponentCallbacksC0075p.f1397k) {
            i2 = Math.min(i2, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0075p.f1373D;
        if (viewGroup != null) {
            d0 f2 = d0.f(viewGroup, abstractComponentCallbacksC0075p.j().C());
            f2.getClass();
            c0 d2 = f2.d(abstractComponentCallbacksC0075p);
            r6 = d2 != null ? d2.f1308b : 0;
            Iterator it = f2.f1322c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0Var = null;
                    break;
                }
                c0Var = (c0) it.next();
                if (c0Var.f1309c.equals(abstractComponentCallbacksC0075p) && !c0Var.f1312f) {
                    break;
                }
            }
            if (c0Var != null && (r6 == 0 || r6 == 1)) {
                r6 = c0Var.f1308b;
            }
        }
        if (r6 == 2) {
            i2 = Math.min(i2, 6);
        } else if (r6 == 3) {
            i2 = Math.max(i2, 3);
        } else if (abstractComponentCallbacksC0075p.f1398l) {
            i2 = abstractComponentCallbacksC0075p.f1403q > 0 ? Math.min(i2, 1) : Math.min(i2, -1);
        }
        if (abstractComponentCallbacksC0075p.f1375F && abstractComponentCallbacksC0075p.f1387a < 5) {
            i2 = Math.min(i2, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + abstractComponentCallbacksC0075p);
        }
        return i2;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        final AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0075p);
        }
        if (abstractComponentCallbacksC0075p.f1380K) {
            Bundle bundle = abstractComponentCallbacksC0075p.f1388b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0075p.f1406t.O(parcelable);
                H h2 = abstractComponentCallbacksC0075p.f1406t;
                h2.f1161A = false;
                h2.f1162B = false;
                h2.f1168H.f1209g = false;
                h2.s(1);
            }
            abstractComponentCallbacksC0075p.f1387a = 1;
            return;
        }
        C0182z c0182z = this.f1223a;
        c0182z.i(false);
        Bundle bundle2 = abstractComponentCallbacksC0075p.f1388b;
        abstractComponentCallbacksC0075p.f1406t.J();
        abstractComponentCallbacksC0075p.f1387a = 1;
        abstractComponentCallbacksC0075p.f1372C = false;
        abstractComponentCallbacksC0075p.f1382M.a(new androidx.lifecycle.m() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.m
            public final void b(androidx.lifecycle.o oVar, androidx.lifecycle.i iVar) {
                View view;
                if (iVar != androidx.lifecycle.i.ON_STOP || (view = AbstractComponentCallbacksC0075p.this.f1374E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0075p.f1385P.a(bundle2);
        abstractComponentCallbacksC0075p.q(bundle2);
        abstractComponentCallbacksC0075p.f1380K = true;
        if (abstractComponentCallbacksC0075p.f1372C) {
            abstractComponentCallbacksC0075p.f1382M.g(androidx.lifecycle.i.ON_CREATE);
            c0182z.c(false);
        } else {
            throw new e0("Fragment " + abstractComponentCallbacksC0075p + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (abstractComponentCallbacksC0075p.f1399m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0075p);
        }
        LayoutInflater u2 = abstractComponentCallbacksC0075p.u(abstractComponentCallbacksC0075p.f1388b);
        ViewGroup viewGroup = abstractComponentCallbacksC0075p.f1373D;
        if (viewGroup == null) {
            int i2 = abstractComponentCallbacksC0075p.f1409w;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0075p + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0075p.f1404r.f1186q.R(i2);
                if (viewGroup == null && !abstractComponentCallbacksC0075p.f1401o) {
                    try {
                        str = abstractComponentCallbacksC0075p.B().getResources().getResourceName(abstractComponentCallbacksC0075p.f1409w);
                    } catch (Resources.NotFoundException unused) {
                        str = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0075p.f1409w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0075p);
                }
            }
        }
        abstractComponentCallbacksC0075p.f1373D = viewGroup;
        abstractComponentCallbacksC0075p.z(u2, viewGroup, abstractComponentCallbacksC0075p.f1388b);
        View view = abstractComponentCallbacksC0075p.f1374E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0075p.f1374E.setTag(2131296432, abstractComponentCallbacksC0075p);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0075p.f1411y) {
                abstractComponentCallbacksC0075p.f1374E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0075p.f1374E;
            WeakHashMap weakHashMap = F.O.f58a;
            if (F.B.b(view2)) {
                F.C.c(abstractComponentCallbacksC0075p.f1374E);
            } else {
                View view3 = abstractComponentCallbacksC0075p.f1374E;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0083y(this, view3));
            }
            abstractComponentCallbacksC0075p.f1406t.s(2);
            this.f1223a.n(false);
            int visibility = abstractComponentCallbacksC0075p.f1374E.getVisibility();
            abstractComponentCallbacksC0075p.f().f1367n = abstractComponentCallbacksC0075p.f1374E.getAlpha();
            if (abstractComponentCallbacksC0075p.f1373D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0075p.f1374E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0075p.f().f1368o = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0075p);
                    }
                }
                abstractComponentCallbacksC0075p.f1374E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0075p.f1387a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0075p b2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0075p);
        }
        boolean z3 = abstractComponentCallbacksC0075p.f1398l && abstractComponentCallbacksC0075p.f1403q <= 0;
        N n2 = this.f1224b;
        if (!z3) {
            J j2 = n2.f1230c;
            if (j2.f1204b.containsKey(abstractComponentCallbacksC0075p.f1391e) && j2.f1207e && !j2.f1208f) {
                String str = abstractComponentCallbacksC0075p.f1394h;
                if (str != null && (b2 = n2.b(str)) != null && b2.f1370A) {
                    abstractComponentCallbacksC0075p.f1393g = b2;
                }
                abstractComponentCallbacksC0075p.f1387a = 0;
                return;
            }
        }
        C0077s c0077s = abstractComponentCallbacksC0075p.f1405s;
        if (c0077s instanceof androidx.lifecycle.E) {
            z2 = n2.f1230c.f1208f;
        } else {
            z2 = c0077s.f1416d instanceof Activity ? !((Activity) r7).isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            J j3 = n2.f1230c;
            j3.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0075p);
            }
            HashMap hashMap = j3.f1205c;
            J j4 = (J) hashMap.get(abstractComponentCallbacksC0075p.f1391e);
            if (j4 != null) {
                j4.a();
                hashMap.remove(abstractComponentCallbacksC0075p.f1391e);
            }
            HashMap hashMap2 = j3.f1206d;
            androidx.lifecycle.D d2 = (androidx.lifecycle.D) hashMap2.get(abstractComponentCallbacksC0075p.f1391e);
            if (d2 != null) {
                d2.a();
                hashMap2.remove(abstractComponentCallbacksC0075p.f1391e);
            }
        }
        abstractComponentCallbacksC0075p.f1406t.k();
        abstractComponentCallbacksC0075p.f1382M.g(androidx.lifecycle.i.ON_DESTROY);
        abstractComponentCallbacksC0075p.f1387a = 0;
        abstractComponentCallbacksC0075p.f1380K = false;
        abstractComponentCallbacksC0075p.f1372C = true;
        this.f1223a.e(false);
        Iterator it = n2.d().iterator();
        while (it.hasNext()) {
            M m2 = (M) it.next();
            if (m2 != null) {
                String str2 = abstractComponentCallbacksC0075p.f1391e;
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = m2.f1225c;
                if (str2.equals(abstractComponentCallbacksC0075p2.f1394h)) {
                    abstractComponentCallbacksC0075p2.f1393g = abstractComponentCallbacksC0075p;
                    abstractComponentCallbacksC0075p2.f1394h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0075p.f1394h;
        if (str3 != null) {
            abstractComponentCallbacksC0075p.f1393g = n2.b(str3);
        }
        n2.h(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0075p);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0075p.f1373D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0075p.f1374E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0075p.A();
        this.f1223a.p(false);
        abstractComponentCallbacksC0075p.f1373D = null;
        abstractComponentCallbacksC0075p.f1374E = null;
        abstractComponentCallbacksC0075p.f1383N = null;
        abstractComponentCallbacksC0075p.f1384O.e(null);
        abstractComponentCallbacksC0075p.f1400n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0075p);
        }
        abstractComponentCallbacksC0075p.f1387a = -1;
        abstractComponentCallbacksC0075p.f1372C = false;
        abstractComponentCallbacksC0075p.t();
        if (!abstractComponentCallbacksC0075p.f1372C) {
            throw new e0("Fragment " + abstractComponentCallbacksC0075p + " did not call through to super.onDetach()");
        }
        H h2 = abstractComponentCallbacksC0075p.f1406t;
        if (!h2.f1163C) {
            h2.k();
            abstractComponentCallbacksC0075p.f1406t = new H();
        }
        this.f1223a.f(false);
        abstractComponentCallbacksC0075p.f1387a = -1;
        abstractComponentCallbacksC0075p.f1405s = null;
        abstractComponentCallbacksC0075p.f1407u = null;
        abstractComponentCallbacksC0075p.f1404r = null;
        if (!abstractComponentCallbacksC0075p.f1398l || abstractComponentCallbacksC0075p.f1403q > 0) {
            J j2 = this.f1224b.f1230c;
            if (j2.f1204b.containsKey(abstractComponentCallbacksC0075p.f1391e) && j2.f1207e && !j2.f1208f) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0075p);
        }
        abstractComponentCallbacksC0075p.f1382M = new androidx.lifecycle.q(abstractComponentCallbacksC0075p);
        abstractComponentCallbacksC0075p.f1385P = new androidx.savedstate.d(abstractComponentCallbacksC0075p);
        abstractComponentCallbacksC0075p.f1391e = UUID.randomUUID().toString();
        abstractComponentCallbacksC0075p.f1397k = false;
        abstractComponentCallbacksC0075p.f1398l = false;
        abstractComponentCallbacksC0075p.f1399m = false;
        abstractComponentCallbacksC0075p.f1400n = false;
        abstractComponentCallbacksC0075p.f1401o = false;
        abstractComponentCallbacksC0075p.f1403q = 0;
        abstractComponentCallbacksC0075p.f1404r = null;
        abstractComponentCallbacksC0075p.f1406t = new H();
        abstractComponentCallbacksC0075p.f1405s = null;
        abstractComponentCallbacksC0075p.f1408v = 0;
        abstractComponentCallbacksC0075p.f1409w = 0;
        abstractComponentCallbacksC0075p.f1410x = null;
        abstractComponentCallbacksC0075p.f1411y = false;
        abstractComponentCallbacksC0075p.f1412z = false;
    }

    public final void j() {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (abstractComponentCallbacksC0075p.f1399m && abstractComponentCallbacksC0075p.f1400n && !abstractComponentCallbacksC0075p.f1402p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0075p);
            }
            abstractComponentCallbacksC0075p.z(abstractComponentCallbacksC0075p.u(abstractComponentCallbacksC0075p.f1388b), null, abstractComponentCallbacksC0075p.f1388b);
            View view = abstractComponentCallbacksC0075p.f1374E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0075p.f1374E.setTag(2131296432, abstractComponentCallbacksC0075p);
                if (abstractComponentCallbacksC0075p.f1411y) {
                    abstractComponentCallbacksC0075p.f1374E.setVisibility(8);
                }
                abstractComponentCallbacksC0075p.f1406t.s(2);
                this.f1223a.n(false);
                abstractComponentCallbacksC0075p.f1387a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z2 = this.f1226d;
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0075p);
                return;
            }
            return;
        }
        try {
            this.f1226d = true;
            while (true) {
                int d2 = d();
                int i2 = abstractComponentCallbacksC0075p.f1387a;
                if (d2 == i2) {
                    if (abstractComponentCallbacksC0075p.f1378I) {
                        if (abstractComponentCallbacksC0075p.f1374E != null && (viewGroup = abstractComponentCallbacksC0075p.f1373D) != null) {
                            d0 f2 = d0.f(viewGroup, abstractComponentCallbacksC0075p.j().C());
                            if (abstractComponentCallbacksC0075p.f1411y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0075p);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0075p);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        H h2 = abstractComponentCallbacksC0075p.f1404r;
                        if (h2 != null && abstractComponentCallbacksC0075p.f1397k && H.E(abstractComponentCallbacksC0075p)) {
                            h2.f1195z = true;
                        }
                        abstractComponentCallbacksC0075p.f1378I = false;
                    }
                    this.f1226d = false;
                    return;
                }
                if (d2 <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0075p.f1387a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0075p.f1400n = false;
                            abstractComponentCallbacksC0075p.f1387a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0075p);
                            }
                            if (abstractComponentCallbacksC0075p.f1374E != null && abstractComponentCallbacksC0075p.f1389c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0075p.f1374E != null && (viewGroup3 = abstractComponentCallbacksC0075p.f1373D) != null) {
                                d0 f3 = d0.f(viewGroup3, abstractComponentCallbacksC0075p.j().C());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0075p);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0075p.f1387a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0075p.f1387a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0075p.f1374E != null && (viewGroup2 = abstractComponentCallbacksC0075p.f1373D) != null) {
                                d0 f4 = d0.f(viewGroup2, abstractComponentCallbacksC0075p.j().C());
                                int b2 = F.Q.b(abstractComponentCallbacksC0075p.f1374E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0075p);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0075p.f1387a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0075p.f1387a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f1226d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0075p);
        }
        abstractComponentCallbacksC0075p.f1406t.s(5);
        if (abstractComponentCallbacksC0075p.f1374E != null) {
            abstractComponentCallbacksC0075p.f1383N.c(androidx.lifecycle.i.ON_PAUSE);
        }
        abstractComponentCallbacksC0075p.f1382M.g(androidx.lifecycle.i.ON_PAUSE);
        abstractComponentCallbacksC0075p.f1387a = 6;
        abstractComponentCallbacksC0075p.f1372C = true;
        this.f1223a.g(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        Bundle bundle = abstractComponentCallbacksC0075p.f1388b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0075p.f1389c = abstractComponentCallbacksC0075p.f1388b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0075p.f1390d = abstractComponentCallbacksC0075p.f1388b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0075p.f1388b.getString("android:target_state");
        abstractComponentCallbacksC0075p.f1394h = string;
        if (string != null) {
            abstractComponentCallbacksC0075p.f1395i = abstractComponentCallbacksC0075p.f1388b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0075p.f1388b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0075p.f1376G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0075p.f1375F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0075p);
        }
        C0073n c0073n = abstractComponentCallbacksC0075p.f1377H;
        View view = c0073n == null ? null : c0073n.f1368o;
        if (view != null) {
            if (view != abstractComponentCallbacksC0075p.f1374E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0075p.f1374E) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0075p);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0075p.f1374E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0075p.f().f1368o = null;
        abstractComponentCallbacksC0075p.f1406t.J();
        abstractComponentCallbacksC0075p.f1406t.x(true);
        abstractComponentCallbacksC0075p.f1387a = 7;
        abstractComponentCallbacksC0075p.f1372C = true;
        androidx.lifecycle.q qVar = abstractComponentCallbacksC0075p.f1382M;
        androidx.lifecycle.i iVar = androidx.lifecycle.i.ON_RESUME;
        qVar.g(iVar);
        if (abstractComponentCallbacksC0075p.f1374E != null) {
            abstractComponentCallbacksC0075p.f1383N.c(iVar);
        }
        H h2 = abstractComponentCallbacksC0075p.f1406t;
        h2.f1161A = false;
        h2.f1162B = false;
        h2.f1168H.f1209g = false;
        h2.s(7);
        this.f1223a.j(false);
        abstractComponentCallbacksC0075p.f1388b = null;
        abstractComponentCallbacksC0075p.f1389c = null;
        abstractComponentCallbacksC0075p.f1390d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (abstractComponentCallbacksC0075p.f1374E == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0075p.f1374E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0075p.f1389c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0075p.f1383N.f1264c.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0075p.f1390d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0075p);
        }
        abstractComponentCallbacksC0075p.f1406t.J();
        abstractComponentCallbacksC0075p.f1406t.x(true);
        abstractComponentCallbacksC0075p.f1387a = 5;
        abstractComponentCallbacksC0075p.f1372C = false;
        abstractComponentCallbacksC0075p.w();
        if (!abstractComponentCallbacksC0075p.f1372C) {
            throw new e0("Fragment " + abstractComponentCallbacksC0075p + " did not call through to super.onStart()");
        }
        androidx.lifecycle.q qVar = abstractComponentCallbacksC0075p.f1382M;
        androidx.lifecycle.i iVar = androidx.lifecycle.i.ON_START;
        qVar.g(iVar);
        if (abstractComponentCallbacksC0075p.f1374E != null) {
            abstractComponentCallbacksC0075p.f1383N.c(iVar);
        }
        H h2 = abstractComponentCallbacksC0075p.f1406t;
        h2.f1161A = false;
        h2.f1162B = false;
        h2.f1168H.f1209g = false;
        h2.s(5);
        this.f1223a.l(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1225c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0075p);
        }
        H h2 = abstractComponentCallbacksC0075p.f1406t;
        h2.f1162B = true;
        h2.f1168H.f1209g = true;
        h2.s(4);
        if (abstractComponentCallbacksC0075p.f1374E != null) {
            abstractComponentCallbacksC0075p.f1383N.c(androidx.lifecycle.i.ON_STOP);
        }
        abstractComponentCallbacksC0075p.f1382M.g(androidx.lifecycle.i.ON_STOP);
        abstractComponentCallbacksC0075p.f1387a = 4;
        abstractComponentCallbacksC0075p.f1372C = false;
        abstractComponentCallbacksC0075p.x();
        if (abstractComponentCallbacksC0075p.f1372C) {
            this.f1223a.m(false);
            return;
        }
        throw new e0("Fragment " + abstractComponentCallbacksC0075p + " did not call through to super.onStop()");
    }

    public M(C0182z c0182z, N n2, ClassLoader classLoader, C c2, L l2) {
        this.f1223a = c0182z;
        this.f1224b = n2;
        AbstractComponentCallbacksC0075p a2 = c2.a(l2.f1210a);
        this.f1225c = a2;
        Bundle bundle = l2.f1219j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.E(bundle);
        a2.f1391e = l2.f1211b;
        a2.f1399m = l2.f1212c;
        a2.f1401o = true;
        a2.f1408v = l2.f1213d;
        a2.f1409w = l2.f1214e;
        a2.f1410x = l2.f1215f;
        a2.f1370A = l2.f1216g;
        a2.f1398l = l2.f1217h;
        a2.f1412z = l2.f1218i;
        a2.f1411y = l2.f1220k;
        a2.f1381L = androidx.lifecycle.j.values()[l2.f1221l];
        Bundle bundle2 = l2.f1222m;
        if (bundle2 != null) {
            a2.f1388b = bundle2;
        } else {
            a2.f1388b = new Bundle();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public M(C0182z c0182z, N n2, AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, L l2) {
        this.f1223a = c0182z;
        this.f1224b = n2;
        this.f1225c = abstractComponentCallbacksC0075p;
        abstractComponentCallbacksC0075p.f1389c = null;
        abstractComponentCallbacksC0075p.f1390d = null;
        abstractComponentCallbacksC0075p.f1403q = 0;
        abstractComponentCallbacksC0075p.f1400n = false;
        abstractComponentCallbacksC0075p.f1397k = false;
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = abstractComponentCallbacksC0075p.f1393g;
        abstractComponentCallbacksC0075p.f1394h = abstractComponentCallbacksC0075p2 != null ? abstractComponentCallbacksC0075p2.f1391e : null;
        abstractComponentCallbacksC0075p.f1393g = null;
        Bundle bundle = l2.f1222m;
        if (bundle != null) {
            abstractComponentCallbacksC0075p.f1388b = bundle;
        } else {
            abstractComponentCallbacksC0075p.f1388b = new Bundle();
        }
    }
}
