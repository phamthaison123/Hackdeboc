package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractComponentCallbacksC0075p implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.o, androidx.lifecycle.E, androidx.savedstate.e {

    /* renamed from: R, reason: collision with root package name */
    public static final Object f1369R = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1370A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1372C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1373D;

    /* renamed from: E, reason: collision with root package name */
    public View f1374E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1375F;

    /* renamed from: H, reason: collision with root package name */
    public C0073n f1377H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1378I;

    /* renamed from: J, reason: collision with root package name */
    public float f1379J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1380K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.q f1382M;

    /* renamed from: N, reason: collision with root package name */
    public Z f1383N;

    /* renamed from: P, reason: collision with root package name */
    public androidx.savedstate.d f1385P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1386Q;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1388b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1389c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1390d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1392f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0075p f1393g;

    /* renamed from: i, reason: collision with root package name */
    public int f1395i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1397k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1398l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1399m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1400n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1401o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1402p;

    /* renamed from: q, reason: collision with root package name */
    public int f1403q;

    /* renamed from: r, reason: collision with root package name */
    public H f1404r;

    /* renamed from: s, reason: collision with root package name */
    public C0077s f1405s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0075p f1407u;

    /* renamed from: v, reason: collision with root package name */
    public int f1408v;

    /* renamed from: w, reason: collision with root package name */
    public int f1409w;

    /* renamed from: x, reason: collision with root package name */
    public String f1410x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1411y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1412z;

    /* renamed from: a, reason: collision with root package name */
    public int f1387a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1391e = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public String f1394h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1396j = null;

    /* renamed from: t, reason: collision with root package name */
    public H f1406t = new H();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1371B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1376G = true;

    /* renamed from: L, reason: collision with root package name */
    public androidx.lifecycle.j f1381L = androidx.lifecycle.j.f1465e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.u f1384O = new androidx.lifecycle.u();

    public AbstractComponentCallbacksC0075p() {
        new AtomicInteger();
        this.f1386Q = new ArrayList();
        this.f1382M = new androidx.lifecycle.q(this);
        this.f1385P = new androidx.savedstate.d(this);
    }

    public final void A() {
        this.f1406t.s(1);
        if (this.f1374E != null) {
            Z z2 = this.f1383N;
            z2.e();
            if (z2.f1263b.f1471c.compareTo(androidx.lifecycle.j.f1463c) >= 0) {
                this.f1383N.c(androidx.lifecycle.i.ON_DESTROY);
            }
        }
        this.f1387a = 1;
        this.f1372C = false;
        s();
        if (!this.f1372C) {
            throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        androidx.lifecycle.D b2 = b();
        String canonicalName = Q.a.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        Object obj = (androidx.lifecycle.C) b2.f1445a.get(concat);
        if (!Q.a.class.isInstance(obj)) {
            obj = new Q.a();
            androidx.lifecycle.C c2 = (androidx.lifecycle.C) b2.f1445a.put(concat, obj);
            if (c2 != null) {
                c2.a();
            }
        }
        l.l lVar = ((Q.a) obj).f250b;
        if (lVar.f3053c <= 0) {
            this.f1402p = false;
        } else {
            F.Q.i(lVar.f3052b[0]);
            throw null;
        }
    }

    public final Context B() {
        Context h2 = h();
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View C() {
        View view = this.f1374E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void D(int i2, int i3, int i4, int i5) {
        if (this.f1377H == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        f().f1357d = i2;
        f().f1358e = i3;
        f().f1359f = i4;
        f().f1360g = i5;
    }

    public final void E(Bundle bundle) {
        H h2 = this.f1404r;
        if (h2 != null && (h2.f1161A || h2.f1162B)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1392f = bundle;
    }

    @Override // androidx.savedstate.e
    public final androidx.savedstate.c a() {
        return this.f1385P.f1620b;
    }

    @Override // androidx.lifecycle.E
    public final androidx.lifecycle.D b() {
        if (this.f1404r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1404r.f1168H.f1206d;
        androidx.lifecycle.D d2 = (androidx.lifecycle.D) hashMap.get(this.f1391e);
        if (d2 != null) {
            return d2;
        }
        androidx.lifecycle.D d3 = new androidx.lifecycle.D();
        hashMap.put(this.f1391e, d3);
        return d3;
    }

    public B.a c() {
        return new C0072m(this);
    }

    @Override // androidx.lifecycle.o
    public final androidx.lifecycle.q d() {
        return this.f1382M;
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1408v));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1409w));
        printWriter.print(" mTag=");
        printWriter.println(this.f1410x);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1387a);
        printWriter.print(" mWho=");
        printWriter.print(this.f1391e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1403q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1397k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1398l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1399m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1400n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1411y);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1412z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1371B);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1370A);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1376G);
        if (this.f1404r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1404r);
        }
        if (this.f1405s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1405s);
        }
        if (this.f1407u != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1407u);
        }
        if (this.f1392f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1392f);
        }
        if (this.f1388b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1388b);
        }
        if (this.f1389c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1389c);
        }
        if (this.f1390d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1390d);
        }
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1393g;
        if (abstractComponentCallbacksC0075p == null) {
            H h2 = this.f1404r;
            abstractComponentCallbacksC0075p = (h2 == null || (str2 = this.f1394h) == null) ? null : h2.f1172c.b(str2);
        }
        if (abstractComponentCallbacksC0075p != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC0075p);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1395i);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C0073n c0073n = this.f1377H;
        printWriter.println(c0073n == null ? false : c0073n.f1356c);
        C0073n c0073n2 = this.f1377H;
        if (c0073n2 != null && c0073n2.f1357d != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C0073n c0073n3 = this.f1377H;
            printWriter.println(c0073n3 == null ? 0 : c0073n3.f1357d);
        }
        C0073n c0073n4 = this.f1377H;
        if (c0073n4 != null && c0073n4.f1358e != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C0073n c0073n5 = this.f1377H;
            printWriter.println(c0073n5 == null ? 0 : c0073n5.f1358e);
        }
        C0073n c0073n6 = this.f1377H;
        if (c0073n6 != null && c0073n6.f1359f != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C0073n c0073n7 = this.f1377H;
            printWriter.println(c0073n7 == null ? 0 : c0073n7.f1359f);
        }
        C0073n c0073n8 = this.f1377H;
        if (c0073n8 != null && c0073n8.f1360g != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C0073n c0073n9 = this.f1377H;
            printWriter.println(c0073n9 == null ? 0 : c0073n9.f1360g);
        }
        if (this.f1373D != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1373D);
        }
        if (this.f1374E != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1374E);
        }
        C0073n c0073n10 = this.f1377H;
        if ((c0073n10 == null ? null : c0073n10.f1354a) != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            C0073n c0073n11 = this.f1377H;
            printWriter.println(c0073n11 == null ? null : c0073n11.f1354a);
        }
        if (h() != null) {
            androidx.lifecycle.D b2 = b();
            String canonicalName = Q.a.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            Object obj = (androidx.lifecycle.C) b2.f1445a.get(concat);
            if (!Q.a.class.isInstance(obj)) {
                obj = new Q.a();
                androidx.lifecycle.C c2 = (androidx.lifecycle.C) b2.f1445a.put(concat, obj);
                if (c2 != null) {
                    c2.a();
                }
            }
            l.l lVar = ((Q.a) obj).f250b;
            if (lVar.f3053c > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (lVar.f3053c > 0) {
                    F.Q.i(lVar.f3052b[0]);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3051a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f1406t + ":");
        this.f1406t.u(F.Q.d(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final C0073n f() {
        if (this.f1377H == null) {
            C0073n c0073n = new C0073n();
            Object obj = f1369R;
            c0073n.f1364k = obj;
            c0073n.f1365l = obj;
            c0073n.f1366m = obj;
            c0073n.f1367n = 1.0f;
            c0073n.f1368o = null;
            this.f1377H = c0073n;
        }
        return this.f1377H;
    }

    public final H g() {
        if (this.f1405s != null) {
            return this.f1406t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0077s c0077s = this.f1405s;
        if (c0077s == null) {
            return null;
        }
        return c0077s.f1416d;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final int i() {
        androidx.lifecycle.j jVar = this.f1381L;
        return (jVar == androidx.lifecycle.j.f1462b || this.f1407u == null) ? jVar.ordinal() : Math.min(jVar.ordinal(), this.f1407u.i());
    }

    public final H j() {
        H h2 = this.f1404r;
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object k() {
        Object obj;
        C0073n c0073n = this.f1377H;
        if (c0073n == null || (obj = c0073n.f1365l) == f1369R) {
            return null;
        }
        return obj;
    }

    public final Object l() {
        Object obj;
        C0073n c0073n = this.f1377H;
        if (c0073n == null || (obj = c0073n.f1364k) == f1369R) {
            return null;
        }
        return obj;
    }

    public final Object m() {
        Object obj;
        C0073n c0073n = this.f1377H;
        if (c0073n == null || (obj = c0073n.f1366m) == f1369R) {
            return null;
        }
        return obj;
    }

    public final boolean n() {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1407u;
        return abstractComponentCallbacksC0075p != null && (abstractComponentCallbacksC0075p.f1398l || abstractComponentCallbacksC0075p.n());
    }

    public final void o(int i2, int i3, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1372C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0077s c0077s = this.f1405s;
        FragmentActivity fragmentActivity = c0077s == null ? null : (FragmentActivity) c0077s.f1415c;
        if (fragmentActivity != null) {
            fragmentActivity.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1372C = true;
    }

    public void p(Context context) {
        this.f1372C = true;
        C0077s c0077s = this.f1405s;
        if ((c0077s == null ? null : c0077s.f1415c) != null) {
            this.f1372C = true;
        }
    }

    public void q(Bundle bundle) {
        Parcelable parcelable;
        this.f1372C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1406t.O(parcelable);
            H h2 = this.f1406t;
            h2.f1161A = false;
            h2.f1162B = false;
            h2.f1168H.f1209g = false;
            h2.s(1);
        }
        H h3 = this.f1406t;
        if (h3.f1184o >= 1) {
            return;
        }
        h3.f1161A = false;
        h3.f1162B = false;
        h3.f1168H.f1209g = false;
        h3.s(1);
    }

    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void s() {
        this.f1372C = true;
    }

    public void t() {
        this.f1372C = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1391e);
        if (this.f1408v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1408v));
        }
        if (this.f1410x != null) {
            sb.append(" tag=");
            sb.append(this.f1410x);
        }
        sb.append(")");
        return sb.toString();
    }

    public LayoutInflater u(Bundle bundle) {
        C0077s c0077s = this.f1405s;
        if (c0077s == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        FragmentActivity fragmentActivity = c0077s.f1419g;
        LayoutInflater cloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        cloneInContext.setFactory2(this.f1406t.f1175f);
        return cloneInContext;
    }

    public abstract void v(Bundle bundle);

    public void w() {
        this.f1372C = true;
    }

    public void x() {
        this.f1372C = true;
    }

    public void y(Bundle bundle) {
        this.f1372C = true;
    }

    public void z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1406t.J();
        this.f1402p = true;
        this.f1383N = new Z(b());
        View r2 = r(layoutInflater, viewGroup);
        this.f1374E = r2;
        if (r2 == null) {
            if (this.f1383N.f1263b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1383N = null;
        } else {
            this.f1383N.e();
            this.f1374E.setTag(2131296686, this.f1383N);
            this.f1374E.setTag(2131296688, this.f1383N);
            this.f1374E.setTag(2131296687, this.f1383N);
            this.f1384O.e(this.f1383N);
        }
    }
}
