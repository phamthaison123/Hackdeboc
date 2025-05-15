package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0060a implements F {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1265a;

    /* renamed from: b, reason: collision with root package name */
    public int f1266b;

    /* renamed from: c, reason: collision with root package name */
    public int f1267c;

    /* renamed from: d, reason: collision with root package name */
    public int f1268d;

    /* renamed from: e, reason: collision with root package name */
    public int f1269e;

    /* renamed from: f, reason: collision with root package name */
    public int f1270f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1271g;

    /* renamed from: h, reason: collision with root package name */
    public String f1272h;

    /* renamed from: i, reason: collision with root package name */
    public int f1273i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1274j;

    /* renamed from: k, reason: collision with root package name */
    public int f1275k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1276l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1277m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1278n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1279o;

    /* renamed from: p, reason: collision with root package name */
    public final H f1280p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1281q;

    /* renamed from: r, reason: collision with root package name */
    public int f1282r;

    public C0060a(H h2) {
        h2.B();
        C0077s c0077s = h2.f1185p;
        if (c0077s != null) {
            c0077s.f1416d.getClassLoader();
        }
        this.f1265a = new ArrayList();
        this.f1279o = false;
        this.f1282r = -1;
        this.f1280p = h2;
    }

    @Override // androidx.fragment.app.F
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1271g) {
            return true;
        }
        H h2 = this.f1280p;
        if (h2.f1173d == null) {
            h2.f1173d = new ArrayList();
        }
        h2.f1173d.add(this);
        return true;
    }

    public final void b(O o2) {
        this.f1265a.add(o2);
        o2.f1233c = this.f1266b;
        o2.f1234d = this.f1267c;
        o2.f1235e = this.f1268d;
        o2.f1236f = this.f1269e;
    }

    public final void c(int i2) {
        if (this.f1271g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f1265a.size();
            for (int i3 = 0; i3 < size; i3++) {
                O o2 = (O) this.f1265a.get(i3);
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = o2.f1232b;
                if (abstractComponentCallbacksC0075p != null) {
                    abstractComponentCallbacksC0075p.f1403q += i2;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + o2.f1232b + " to " + o2.f1232b.f1403q);
                    }
                }
            }
        }
    }

    public final int d(boolean z2) {
        if (this.f1281q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new a0());
            e("  ", printWriter, true);
            printWriter.close();
        }
        this.f1281q = true;
        boolean z3 = this.f1271g;
        H h2 = this.f1280p;
        if (z3) {
            this.f1282r = h2.f1178i.getAndIncrement();
        } else {
            this.f1282r = -1;
        }
        h2.v(this, z2);
        return this.f1282r;
    }

    public final void e(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1272h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1282r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1281q);
            if (this.f1270f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1270f));
            }
            if (this.f1266b != 0 || this.f1267c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1266b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1267c));
            }
            if (this.f1268d != 0 || this.f1269e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1268d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1269e));
            }
            if (this.f1273i != 0 || this.f1274j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1273i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1274j);
            }
            if (this.f1275k != 0 || this.f1276l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1275k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1276l);
            }
        }
        if (this.f1265a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1265a.size();
        for (int i2 = 0; i2 < size; i2++) {
            O o2 = (O) this.f1265a.get(i2);
            switch (o2.f1231a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + o2.f1231a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(o2.f1232b);
            if (z2) {
                if (o2.f1233c != 0 || o2.f1234d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(o2.f1233c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(o2.f1234d));
                }
                if (o2.f1235e != 0 || o2.f1236f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(o2.f1235e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(o2.f1236f));
                }
            }
        }
    }

    public final void f() {
        int size = this.f1265a.size();
        for (int i2 = 0; i2 < size; i2++) {
            O o2 = (O) this.f1265a.get(i2);
            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = o2.f1232b;
            if (abstractComponentCallbacksC0075p != null) {
                if (abstractComponentCallbacksC0075p.f1377H != null) {
                    abstractComponentCallbacksC0075p.f().f1356c = false;
                }
                int i3 = this.f1270f;
                if (abstractComponentCallbacksC0075p.f1377H != null || i3 != 0) {
                    abstractComponentCallbacksC0075p.f();
                    abstractComponentCallbacksC0075p.f1377H.f1361h = i3;
                }
                ArrayList arrayList = this.f1277m;
                ArrayList arrayList2 = this.f1278n;
                abstractComponentCallbacksC0075p.f();
                C0073n c0073n = abstractComponentCallbacksC0075p.f1377H;
                c0073n.f1362i = arrayList;
                c0073n.f1363j = arrayList2;
            }
            int i4 = o2.f1231a;
            H h2 = this.f1280p;
            switch (i4) {
                case 1:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.R(abstractComponentCallbacksC0075p, false);
                    h2.a(abstractComponentCallbacksC0075p);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + o2.f1231a);
                case 3:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.M(abstractComponentCallbacksC0075p);
                    break;
                case 4:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.D(abstractComponentCallbacksC0075p);
                    break;
                case 5:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.R(abstractComponentCallbacksC0075p, false);
                    H.V(abstractComponentCallbacksC0075p);
                    break;
                case 6:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.g(abstractComponentCallbacksC0075p);
                    break;
                case 7:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.R(abstractComponentCallbacksC0075p, false);
                    h2.c(abstractComponentCallbacksC0075p);
                    break;
                case 8:
                    h2.T(abstractComponentCallbacksC0075p);
                    break;
                case 9:
                    h2.T(null);
                    break;
                case 10:
                    h2.S(abstractComponentCallbacksC0075p, o2.f1238h);
                    break;
            }
        }
    }

    public final void g() {
        for (int size = this.f1265a.size() - 1; size >= 0; size--) {
            O o2 = (O) this.f1265a.get(size);
            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = o2.f1232b;
            if (abstractComponentCallbacksC0075p != null) {
                if (abstractComponentCallbacksC0075p.f1377H != null) {
                    abstractComponentCallbacksC0075p.f().f1356c = true;
                }
                int i2 = this.f1270f;
                int i3 = i2 != 4097 ? i2 != 4099 ? i2 != 8194 ? 0 : 4097 : 4099 : 8194;
                if (abstractComponentCallbacksC0075p.f1377H != null || i3 != 0) {
                    abstractComponentCallbacksC0075p.f();
                    abstractComponentCallbacksC0075p.f1377H.f1361h = i3;
                }
                ArrayList arrayList = this.f1278n;
                ArrayList arrayList2 = this.f1277m;
                abstractComponentCallbacksC0075p.f();
                C0073n c0073n = abstractComponentCallbacksC0075p.f1377H;
                c0073n.f1362i = arrayList;
                c0073n.f1363j = arrayList2;
            }
            int i4 = o2.f1231a;
            H h2 = this.f1280p;
            switch (i4) {
                case 1:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.R(abstractComponentCallbacksC0075p, true);
                    h2.M(abstractComponentCallbacksC0075p);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + o2.f1231a);
                case 3:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.a(abstractComponentCallbacksC0075p);
                    break;
                case 4:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.getClass();
                    H.V(abstractComponentCallbacksC0075p);
                    break;
                case 5:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.R(abstractComponentCallbacksC0075p, true);
                    h2.D(abstractComponentCallbacksC0075p);
                    break;
                case 6:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.c(abstractComponentCallbacksC0075p);
                    break;
                case 7:
                    abstractComponentCallbacksC0075p.D(o2.f1233c, o2.f1234d, o2.f1235e, o2.f1236f);
                    h2.R(abstractComponentCallbacksC0075p, true);
                    h2.g(abstractComponentCallbacksC0075p);
                    break;
                case 8:
                    h2.T(null);
                    break;
                case 9:
                    h2.T(abstractComponentCallbacksC0075p);
                    break;
                case 10:
                    h2.S(abstractComponentCallbacksC0075p, o2.f1237g);
                    break;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1282r >= 0) {
            sb.append(" #");
            sb.append(this.f1282r);
        }
        if (this.f1272h != null) {
            sb.append(" ");
            sb.append(this.f1272h);
        }
        sb.append("}");
        return sb.toString();
    }
}
