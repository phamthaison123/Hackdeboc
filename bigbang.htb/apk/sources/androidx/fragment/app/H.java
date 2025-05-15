package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.C0090a;
import i.C0182z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class H {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1161A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1162B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1163C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1164D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayList f1165E;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f1166F;

    /* renamed from: G, reason: collision with root package name */
    public ArrayList f1167G;

    /* renamed from: H, reason: collision with root package name */
    public J f1168H;

    /* renamed from: I, reason: collision with root package name */
    public final RunnableC0078t f1169I;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1171b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1173d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1174e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.h f1176g;

    /* renamed from: k, reason: collision with root package name */
    public final Map f1180k;

    /* renamed from: l, reason: collision with root package name */
    public final A f1181l;

    /* renamed from: m, reason: collision with root package name */
    public final C0182z f1182m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1183n;

    /* renamed from: o, reason: collision with root package name */
    public int f1184o;

    /* renamed from: p, reason: collision with root package name */
    public C0077s f1185p;

    /* renamed from: q, reason: collision with root package name */
    public B.a f1186q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractComponentCallbacksC0075p f1187r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractComponentCallbacksC0075p f1188s;

    /* renamed from: t, reason: collision with root package name */
    public final C f1189t;

    /* renamed from: u, reason: collision with root package name */
    public final A f1190u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.activity.result.d f1191v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.activity.result.d f1192w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.activity.result.d f1193x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayDeque f1194y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1195z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1170a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final N f1172c = new N();

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C0084z f1175f = new LayoutInflaterFactory2C0084z(this);

    /* renamed from: h, reason: collision with root package name */
    public final B f1177h = new B(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1178i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1179j = Collections.synchronizedMap(new HashMap());

    public H() {
        Collections.synchronizedMap(new HashMap());
        this.f1180k = Collections.synchronizedMap(new HashMap());
        this.f1181l = new A(this, 2);
        C0182z c0182z = new C0182z();
        c0182z.f2960a = new CopyOnWriteArrayList();
        c0182z.f2961b = this;
        this.f1182m = c0182z;
        this.f1183n = new CopyOnWriteArrayList();
        this.f1184o = -1;
        this.f1189t = new C(this);
        int i2 = 3;
        this.f1190u = new A(this, i2);
        this.f1194y = new ArrayDeque();
        this.f1169I = new RunnableC0078t(i2, this);
    }

    public static boolean E(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        abstractComponentCallbacksC0075p.getClass();
        Iterator it = abstractComponentCallbacksC0075p.f1406t.f1172c.e().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = (AbstractComponentCallbacksC0075p) it.next();
            if (abstractComponentCallbacksC0075p2 != null) {
                z2 = E(abstractComponentCallbacksC0075p2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (abstractComponentCallbacksC0075p == null) {
            return true;
        }
        return abstractComponentCallbacksC0075p.f1371B && (abstractComponentCallbacksC0075p.f1404r == null || F(abstractComponentCallbacksC0075p.f1407u));
    }

    public static boolean G(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (abstractComponentCallbacksC0075p == null) {
            return true;
        }
        H h2 = abstractComponentCallbacksC0075p.f1404r;
        return abstractComponentCallbacksC0075p.equals(h2.f1188s) && G(h2.f1187r);
    }

    public static void V(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0075p);
        }
        if (abstractComponentCallbacksC0075p.f1411y) {
            abstractComponentCallbacksC0075p.f1411y = false;
            abstractComponentCallbacksC0075p.f1378I = !abstractComponentCallbacksC0075p.f1378I;
        }
    }

    public final ViewGroup A(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        ViewGroup viewGroup = abstractComponentCallbacksC0075p.f1373D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0075p.f1409w > 0 && this.f1186q.V()) {
            View R2 = this.f1186q.R(abstractComponentCallbacksC0075p.f1409w);
            if (R2 instanceof ViewGroup) {
                return (ViewGroup) R2;
            }
        }
        return null;
    }

    public final C B() {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1187r;
        return abstractComponentCallbacksC0075p != null ? abstractComponentCallbacksC0075p.f1404r.B() : this.f1189t;
    }

    public final A C() {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1187r;
        return abstractComponentCallbacksC0075p != null ? abstractComponentCallbacksC0075p.f1404r.C() : this.f1190u;
    }

    public final void D(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0075p);
        }
        if (abstractComponentCallbacksC0075p.f1411y) {
            return;
        }
        abstractComponentCallbacksC0075p.f1411y = true;
        abstractComponentCallbacksC0075p.f1378I = true ^ abstractComponentCallbacksC0075p.f1378I;
        U(abstractComponentCallbacksC0075p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r0 != 5) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(int r18, androidx.fragment.app.AbstractComponentCallbacksC0075p r19) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.H.H(int, androidx.fragment.app.p):void");
    }

    public final void I(int i2, boolean z2) {
        HashMap hashMap;
        C0077s c0077s;
        if (this.f1185p == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f1184o) {
            this.f1184o = i2;
            N n2 = this.f1172c;
            Iterator it = n2.f1228a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = n2.f1229b;
                if (!hasNext) {
                    break;
                }
                M m2 = (M) hashMap.get(((AbstractComponentCallbacksC0075p) it.next()).f1391e);
                if (m2 != null) {
                    m2.k();
                }
            }
            for (M m3 : hashMap.values()) {
                if (m3 != null) {
                    m3.k();
                    AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m3.f1225c;
                    if (abstractComponentCallbacksC0075p.f1398l && abstractComponentCallbacksC0075p.f1403q <= 0) {
                        n2.h(m3);
                    }
                }
            }
            W();
            if (this.f1195z && (c0077s = this.f1185p) != null && this.f1184o == 7) {
                c0077s.f1419g.e();
                this.f1195z = false;
            }
        }
    }

    public final void J() {
        if (this.f1185p == null) {
            return;
        }
        this.f1161A = false;
        this.f1162B = false;
        this.f1168H.f1209g = false;
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null) {
                abstractComponentCallbacksC0075p.f1406t.J();
            }
        }
    }

    public final boolean K() {
        x(false);
        w(true);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1188s;
        if (abstractComponentCallbacksC0075p != null && abstractComponentCallbacksC0075p.g().K()) {
            return true;
        }
        boolean L2 = L(this.f1165E, this.f1166F, -1, 0);
        if (L2) {
            this.f1171b = true;
            try {
                N(this.f1165E, this.f1166F);
            } finally {
                d();
            }
        }
        Y();
        t();
        this.f1172c.f1229b.values().removeAll(Collections.singleton(null));
        return L2;
    }

    public final boolean L(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        int i4;
        C0060a c0060a;
        ArrayList arrayList3 = this.f1173d;
        if (arrayList3 == null) {
            return false;
        }
        if (i2 >= 0 || (i3 & 1) != 0) {
            if (i2 >= 0) {
                i4 = arrayList3.size() - 1;
                while (i4 >= 0) {
                    C0060a c0060a2 = (C0060a) this.f1173d.get(i4);
                    if (i2 >= 0 && i2 == c0060a2.f1282r) {
                        break;
                    }
                    i4--;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    do {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        c0060a = (C0060a) this.f1173d.get(i4);
                        if (i2 < 0) {
                            break;
                        }
                    } while (i2 == c0060a.f1282r);
                }
            } else {
                i4 = -1;
            }
            if (i4 == this.f1173d.size() - 1) {
                return false;
            }
            for (int size = this.f1173d.size() - 1; size > i4; size--) {
                arrayList.add(this.f1173d.remove(size));
                arrayList2.add(Boolean.TRUE);
            }
        } else {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f1173d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void M(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0075p + " nesting=" + abstractComponentCallbacksC0075p.f1403q);
        }
        boolean z2 = !(abstractComponentCallbacksC0075p.f1403q > 0);
        if (!abstractComponentCallbacksC0075p.f1412z || z2) {
            N n2 = this.f1172c;
            synchronized (n2.f1228a) {
                n2.f1228a.remove(abstractComponentCallbacksC0075p);
            }
            abstractComponentCallbacksC0075p.f1397k = false;
            if (E(abstractComponentCallbacksC0075p)) {
                this.f1195z = true;
            }
            abstractComponentCallbacksC0075p.f1398l = true;
            U(abstractComponentCallbacksC0075p);
        }
    }

    public final void N(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((C0060a) arrayList.get(i2)).f1279o) {
                if (i3 != i2) {
                    y(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((C0060a) arrayList.get(i3)).f1279o) {
                        i3++;
                    }
                }
                y(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            y(arrayList, arrayList2, i3, size);
        }
    }

    public final void O(Parcelable parcelable) {
        int i2;
        C0182z c0182z;
        int i3;
        M m2;
        if (parcelable == null) {
            return;
        }
        I i4 = (I) parcelable;
        if (i4.f1196a == null) {
            return;
        }
        N n2 = this.f1172c;
        n2.f1229b.clear();
        Iterator it = i4.f1196a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i2 = 2;
            c0182z = this.f1182m;
            if (!hasNext) {
                break;
            }
            L l2 = (L) it.next();
            if (l2 != null) {
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = (AbstractComponentCallbacksC0075p) this.f1168H.f1204b.get(l2.f1211b);
                if (abstractComponentCallbacksC0075p != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0075p);
                    }
                    m2 = new M(c0182z, n2, abstractComponentCallbacksC0075p, l2);
                } else {
                    m2 = new M(this.f1182m, this.f1172c, this.f1185p.f1416d.getClassLoader(), B(), l2);
                }
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = m2.f1225c;
                abstractComponentCallbacksC0075p2.f1404r = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0075p2.f1391e + "): " + abstractComponentCallbacksC0075p2);
                }
                m2.m(this.f1185p.f1416d.getClassLoader());
                n2.g(m2);
                m2.f1227e = this.f1184o;
            }
        }
        J j2 = this.f1168H;
        j2.getClass();
        Iterator it2 = new ArrayList(j2.f1204b.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p3 = (AbstractComponentCallbacksC0075p) it2.next();
            if (!(n2.f1229b.get(abstractComponentCallbacksC0075p3.f1391e) != null)) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0075p3 + " that was not found in the set of active Fragments " + i4.f1196a);
                }
                this.f1168H.b(abstractComponentCallbacksC0075p3);
                abstractComponentCallbacksC0075p3.f1404r = this;
                M m3 = new M(c0182z, n2, abstractComponentCallbacksC0075p3);
                m3.f1227e = 1;
                m3.k();
                abstractComponentCallbacksC0075p3.f1398l = true;
                m3.k();
            }
        }
        ArrayList<String> arrayList = i4.f1197b;
        n2.f1228a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                AbstractComponentCallbacksC0075p b2 = n2.b(str);
                if (b2 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + b2);
                }
                n2.a(b2);
            }
        }
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p4 = null;
        if (i4.f1198c != null) {
            this.f1173d = new ArrayList(i4.f1198c.length);
            int i5 = 0;
            while (true) {
                C0061b[] c0061bArr = i4.f1198c;
                if (i5 >= c0061bArr.length) {
                    break;
                }
                C0061b c0061b = c0061bArr[i5];
                c0061b.getClass();
                C0060a c0060a = new C0060a(this);
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    int[] iArr = c0061b.f1285a;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    O o2 = new O();
                    int i8 = i6 + 1;
                    o2.f1231a = iArr[i6];
                    if (Log.isLoggable("FragmentManager", i2)) {
                        Log.v("FragmentManager", "Instantiate " + c0060a + " op #" + i7 + " base fragment #" + iArr[i8]);
                    }
                    String str2 = (String) c0061b.f1286b.get(i7);
                    if (str2 != null) {
                        o2.f1232b = n2.b(str2);
                    } else {
                        o2.f1232b = abstractComponentCallbacksC0075p4;
                    }
                    o2.f1237g = androidx.lifecycle.j.values()[c0061b.f1287c[i7]];
                    o2.f1238h = androidx.lifecycle.j.values()[c0061b.f1288d[i7]];
                    int i9 = iArr[i8];
                    o2.f1233c = i9;
                    int i10 = iArr[i6 + 2];
                    o2.f1234d = i10;
                    int i11 = i6 + 4;
                    int i12 = iArr[i6 + 3];
                    o2.f1235e = i12;
                    i6 += 5;
                    int i13 = iArr[i11];
                    o2.f1236f = i13;
                    c0060a.f1266b = i9;
                    c0060a.f1267c = i10;
                    c0060a.f1268d = i12;
                    c0060a.f1269e = i13;
                    c0060a.b(o2);
                    i7++;
                    abstractComponentCallbacksC0075p4 = null;
                    i2 = 2;
                }
                c0060a.f1270f = c0061b.f1289e;
                c0060a.f1272h = c0061b.f1290f;
                c0060a.f1282r = c0061b.f1291g;
                c0060a.f1271g = true;
                c0060a.f1273i = c0061b.f1292h;
                c0060a.f1274j = c0061b.f1293i;
                c0060a.f1275k = c0061b.f1294j;
                c0060a.f1276l = c0061b.f1295k;
                c0060a.f1277m = c0061b.f1296l;
                c0060a.f1278n = c0061b.f1297m;
                c0060a.f1279o = c0061b.f1298n;
                c0060a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + c0060a.f1282r + "): " + c0060a);
                    PrintWriter printWriter = new PrintWriter(new a0());
                    c0060a.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1173d.add(c0060a);
                i5++;
                i2 = 2;
                abstractComponentCallbacksC0075p4 = null;
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.f1173d = null;
        }
        this.f1178i.set(i4.f1199d);
        String str3 = i4.f1200e;
        if (str3 != null) {
            AbstractComponentCallbacksC0075p b3 = n2.b(str3);
            this.f1188s = b3;
            p(b3);
        }
        ArrayList arrayList2 = i4.f1201f;
        if (arrayList2 != null) {
            while (i3 < arrayList2.size()) {
                Bundle bundle = (Bundle) i4.f1202g.get(i3);
                bundle.setClassLoader(this.f1185p.f1416d.getClassLoader());
                this.f1179j.put(arrayList2.get(i3), bundle);
                i3++;
            }
        }
        this.f1194y = new ArrayDeque(i4.f1203h);
    }

    public final I P() {
        int i2;
        ArrayList arrayList;
        C0061b[] c0061bArr;
        int size;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d0 d0Var = (d0) it.next();
            if (d0Var.f1324e) {
                d0Var.f1324e = false;
                d0Var.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((d0) it2.next()).e();
        }
        x(true);
        this.f1161A = true;
        this.f1168H.f1209g = true;
        N n2 = this.f1172c;
        n2.getClass();
        HashMap hashMap = n2.f1229b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            M m2 = (M) it3.next();
            if (m2 != null) {
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
                L l2 = new L(abstractComponentCallbacksC0075p);
                if (abstractComponentCallbacksC0075p.f1387a <= -1 || l2.f1222m != null) {
                    l2.f1222m = abstractComponentCallbacksC0075p.f1388b;
                } else {
                    Bundle bundle = new Bundle();
                    abstractComponentCallbacksC0075p.v(bundle);
                    abstractComponentCallbacksC0075p.f1385P.b(bundle);
                    I P2 = abstractComponentCallbacksC0075p.f1406t.P();
                    if (P2 != null) {
                        bundle.putParcelable("android:support:fragments", P2);
                    }
                    m2.f1223a.k(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (abstractComponentCallbacksC0075p.f1374E != null) {
                        m2.o();
                    }
                    if (abstractComponentCallbacksC0075p.f1389c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0075p.f1389c);
                    }
                    if (abstractComponentCallbacksC0075p.f1390d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0075p.f1390d);
                    }
                    if (!abstractComponentCallbacksC0075p.f1376G) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0075p.f1376G);
                    }
                    l2.f1222m = bundle2;
                    if (abstractComponentCallbacksC0075p.f1394h != null) {
                        if (bundle2 == null) {
                            l2.f1222m = new Bundle();
                        }
                        l2.f1222m.putString("android:target_state", abstractComponentCallbacksC0075p.f1394h);
                        int i3 = abstractComponentCallbacksC0075p.f1395i;
                        if (i3 != 0) {
                            l2.f1222m.putInt("android:target_req_state", i3);
                        }
                    }
                }
                arrayList2.add(l2);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0075p + ": " + l2.f1222m);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (!Log.isLoggable("FragmentManager", 2)) {
                return null;
            }
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
        N n3 = this.f1172c;
        synchronized (n3.f1228a) {
            try {
                if (n3.f1228a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(n3.f1228a.size());
                    Iterator it4 = n3.f1228a.iterator();
                    while (it4.hasNext()) {
                        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = (AbstractComponentCallbacksC0075p) it4.next();
                        arrayList.add(abstractComponentCallbacksC0075p2.f1391e);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0075p2.f1391e + "): " + abstractComponentCallbacksC0075p2);
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList3 = this.f1173d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            c0061bArr = null;
        } else {
            c0061bArr = new C0061b[size];
            for (i2 = 0; i2 < size; i2++) {
                c0061bArr[i2] = new C0061b((C0060a) this.f1173d.get(i2));
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1173d.get(i2));
                }
            }
        }
        I i4 = new I();
        i4.f1200e = null;
        ArrayList arrayList4 = new ArrayList();
        i4.f1201f = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        i4.f1202g = arrayList5;
        i4.f1196a = arrayList2;
        i4.f1197b = arrayList;
        i4.f1198c = c0061bArr;
        i4.f1199d = this.f1178i.get();
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p3 = this.f1188s;
        if (abstractComponentCallbacksC0075p3 != null) {
            i4.f1200e = abstractComponentCallbacksC0075p3.f1391e;
        }
        arrayList4.addAll(this.f1179j.keySet());
        arrayList5.addAll(this.f1179j.values());
        i4.f1203h = new ArrayList(this.f1194y);
        return i4;
    }

    public final void Q() {
        synchronized (this.f1170a) {
            try {
                if (this.f1170a.size() == 1) {
                    this.f1185p.f1417e.removeCallbacks(this.f1169I);
                    this.f1185p.f1417e.post(this.f1169I);
                    Y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void R(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, boolean z2) {
        ViewGroup A2 = A(abstractComponentCallbacksC0075p);
        if (A2 == null || !(A2 instanceof C0082x)) {
            return;
        }
        ((C0082x) A2).setDrawDisappearingViewsLast(!z2);
    }

    public final void S(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, androidx.lifecycle.j jVar) {
        if (abstractComponentCallbacksC0075p.equals(this.f1172c.b(abstractComponentCallbacksC0075p.f1391e)) && (abstractComponentCallbacksC0075p.f1405s == null || abstractComponentCallbacksC0075p.f1404r == this)) {
            abstractComponentCallbacksC0075p.f1381L = jVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0075p + " is not an active fragment of FragmentManager " + this);
    }

    public final void T(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (abstractComponentCallbacksC0075p != null) {
            if (!abstractComponentCallbacksC0075p.equals(this.f1172c.b(abstractComponentCallbacksC0075p.f1391e)) || (abstractComponentCallbacksC0075p.f1405s != null && abstractComponentCallbacksC0075p.f1404r != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0075p + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = this.f1188s;
        this.f1188s = abstractComponentCallbacksC0075p;
        p(abstractComponentCallbacksC0075p2);
        p(this.f1188s);
    }

    public final void U(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        ViewGroup A2 = A(abstractComponentCallbacksC0075p);
        if (A2 != null) {
            C0073n c0073n = abstractComponentCallbacksC0075p.f1377H;
            if ((c0073n == null ? 0 : c0073n.f1360g) + (c0073n == null ? 0 : c0073n.f1359f) + (c0073n == null ? 0 : c0073n.f1358e) + (c0073n == null ? 0 : c0073n.f1357d) > 0) {
                if (A2.getTag(2131296690) == null) {
                    A2.setTag(2131296690, abstractComponentCallbacksC0075p);
                }
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = (AbstractComponentCallbacksC0075p) A2.getTag(2131296690);
                C0073n c0073n2 = abstractComponentCallbacksC0075p.f1377H;
                boolean z2 = c0073n2 != null ? c0073n2.f1356c : false;
                if (abstractComponentCallbacksC0075p2.f1377H == null) {
                    return;
                }
                abstractComponentCallbacksC0075p2.f().f1356c = z2;
            }
        }
    }

    public final void W() {
        Iterator it = this.f1172c.d().iterator();
        while (it.hasNext()) {
            M m2 = (M) it.next();
            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
            if (abstractComponentCallbacksC0075p.f1375F) {
                if (this.f1171b) {
                    this.f1164D = true;
                } else {
                    abstractComponentCallbacksC0075p.f1375F = false;
                    m2.k();
                }
            }
        }
    }

    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1187r;
        if (abstractComponentCallbacksC0075p != null) {
            sb.append(abstractComponentCallbacksC0075p.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1187r)));
            sb.append("}");
        } else {
            C0077s c0077s = this.f1185p;
            if (c0077s != null) {
                sb.append(c0077s.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1185p)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void Y() {
        synchronized (this.f1170a) {
            try {
                if (!this.f1170a.isEmpty()) {
                    this.f1177h.f1144a = true;
                    return;
                }
                B b2 = this.f1177h;
                ArrayList arrayList = this.f1173d;
                b2.f1144a = arrayList != null && arrayList.size() > 0 && G(this.f1187r);
            } finally {
            }
        }
    }

    public final M a(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0075p);
        }
        M f2 = f(abstractComponentCallbacksC0075p);
        abstractComponentCallbacksC0075p.f1404r = this;
        N n2 = this.f1172c;
        n2.g(f2);
        if (!abstractComponentCallbacksC0075p.f1412z) {
            n2.a(abstractComponentCallbacksC0075p);
            abstractComponentCallbacksC0075p.f1398l = false;
            if (abstractComponentCallbacksC0075p.f1374E == null) {
                abstractComponentCallbacksC0075p.f1378I = false;
            }
            if (E(abstractComponentCallbacksC0075p)) {
                this.f1195z = true;
            }
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0077s c0077s, B.a aVar, AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        String str;
        if (this.f1185p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1185p = c0077s;
        this.f1186q = aVar;
        this.f1187r = abstractComponentCallbacksC0075p;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1183n;
        if (abstractComponentCallbacksC0075p != 0) {
            copyOnWriteArrayList.add(new D(abstractComponentCallbacksC0075p));
        } else if (c0077s instanceof K) {
            copyOnWriteArrayList.add(c0077s);
        }
        if (this.f1187r != null) {
            Y();
        }
        if (c0077s instanceof androidx.activity.i) {
            androidx.activity.h hVar = c0077s.f1419g.f743f;
            this.f1176g = hVar;
            hVar.a(abstractComponentCallbacksC0075p != 0 ? abstractComponentCallbacksC0075p : c0077s, this.f1177h);
        }
        int i2 = 1;
        int i3 = 0;
        if (abstractComponentCallbacksC0075p != 0) {
            J j2 = abstractComponentCallbacksC0075p.f1404r.f1168H;
            HashMap hashMap = j2.f1205c;
            J j3 = (J) hashMap.get(abstractComponentCallbacksC0075p.f1391e);
            if (j3 == null) {
                j3 = new J(j2.f1207e);
                hashMap.put(abstractComponentCallbacksC0075p.f1391e, j3);
            }
            this.f1168H = j3;
        } else if (c0077s instanceof androidx.lifecycle.E) {
            androidx.lifecycle.D b2 = c0077s.f1419g.b();
            String canonicalName = J.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            Object obj = (androidx.lifecycle.C) b2.f1445a.get(concat);
            if (!J.class.isInstance(obj)) {
                obj = new J(true);
                androidx.lifecycle.C c2 = (androidx.lifecycle.C) b2.f1445a.put(concat, obj);
                if (c2 != null) {
                    c2.a();
                }
            }
            this.f1168H = (J) obj;
        } else {
            this.f1168H = new J(false);
        }
        J j4 = this.f1168H;
        j4.f1209g = this.f1161A || this.f1162B;
        this.f1172c.f1230c = j4;
        C0077s c0077s2 = this.f1185p;
        if (c0077s2 instanceof androidx.activity.result.f) {
            androidx.activity.c cVar = c0077s2.f1419g.f744g;
            if (abstractComponentCallbacksC0075p != 0) {
                str = abstractComponentCallbacksC0075p.f1391e + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f1191v = cVar.b(F.Q.d(str2, "StartActivityForResult"), new C0090a(i2), new A(this, 4));
            this.f1192w = cVar.b(F.Q.d(str2, "StartIntentSenderForResult"), new C0090a(2), new A(this, i3));
            this.f1193x = cVar.b(F.Q.d(str2, "RequestPermissions"), new C0090a(i3), new A(this, i2));
        }
    }

    public final void c(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0075p);
        }
        if (abstractComponentCallbacksC0075p.f1412z) {
            abstractComponentCallbacksC0075p.f1412z = false;
            if (abstractComponentCallbacksC0075p.f1397k) {
                return;
            }
            this.f1172c.a(abstractComponentCallbacksC0075p);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0075p);
            }
            if (E(abstractComponentCallbacksC0075p)) {
                this.f1195z = true;
            }
        }
    }

    public final void d() {
        this.f1171b = false;
        this.f1166F.clear();
        this.f1165E.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1172c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((M) it.next()).f1225c.f1373D;
            if (viewGroup != null) {
                hashSet.add(d0.f(viewGroup, C()));
            }
        }
        return hashSet;
    }

    public final M f(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        String str = abstractComponentCallbacksC0075p.f1391e;
        N n2 = this.f1172c;
        M m2 = (M) n2.f1229b.get(str);
        if (m2 != null) {
            return m2;
        }
        M m3 = new M(this.f1182m, n2, abstractComponentCallbacksC0075p);
        m3.m(this.f1185p.f1416d.getClassLoader());
        m3.f1227e = this.f1184o;
        return m3;
    }

    public final void g(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0075p);
        }
        if (abstractComponentCallbacksC0075p.f1412z) {
            return;
        }
        abstractComponentCallbacksC0075p.f1412z = true;
        if (abstractComponentCallbacksC0075p.f1397k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0075p);
            }
            N n2 = this.f1172c;
            synchronized (n2.f1228a) {
                n2.f1228a.remove(abstractComponentCallbacksC0075p);
            }
            abstractComponentCallbacksC0075p.f1397k = false;
            if (E(abstractComponentCallbacksC0075p)) {
                this.f1195z = true;
            }
            U(abstractComponentCallbacksC0075p);
        }
    }

    public final void h() {
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null) {
                abstractComponentCallbacksC0075p.f1372C = true;
                abstractComponentCallbacksC0075p.f1406t.h();
            }
        }
    }

    public final boolean i() {
        if (this.f1184o < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null && !abstractComponentCallbacksC0075p.f1411y && abstractComponentCallbacksC0075p.f1406t.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1184o < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null && F(abstractComponentCallbacksC0075p) && !abstractComponentCallbacksC0075p.f1411y && abstractComponentCallbacksC0075p.f1406t.j()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC0075p);
                z2 = true;
            }
        }
        if (this.f1174e != null) {
            for (int i2 = 0; i2 < this.f1174e.size(); i2++) {
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = (AbstractComponentCallbacksC0075p) this.f1174e.get(i2);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0075p2)) {
                    abstractComponentCallbacksC0075p2.getClass();
                }
            }
        }
        this.f1174e = arrayList;
        return z2;
    }

    public final void k() {
        Integer num;
        Integer num2;
        Integer num3;
        this.f1163C = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((d0) it.next()).e();
        }
        s(-1);
        this.f1185p = null;
        this.f1186q = null;
        this.f1187r = null;
        if (this.f1176g != null) {
            Iterator it2 = this.f1177h.f1145b.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.a) it2.next()).cancel();
            }
            this.f1176g = null;
        }
        androidx.activity.result.d dVar = this.f1191v;
        if (dVar != null) {
            androidx.activity.c cVar = dVar.f776b;
            ArrayList arrayList = cVar.f759e;
            String str = dVar.f775a;
            if (!arrayList.contains(str) && (num3 = (Integer) cVar.f757c.remove(str)) != null) {
                cVar.f756b.remove(num3);
            }
            cVar.f760f.remove(str);
            HashMap hashMap = cVar.f761g;
            if (hashMap.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
                hashMap.remove(str);
            }
            Bundle bundle = cVar.f762h;
            if (bundle.containsKey(str)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
                bundle.remove(str);
            }
            F.Q.i(cVar.f758d.get(str));
            androidx.activity.result.d dVar2 = this.f1192w;
            androidx.activity.c cVar2 = dVar2.f776b;
            ArrayList arrayList2 = cVar2.f759e;
            String str2 = dVar2.f775a;
            if (!arrayList2.contains(str2) && (num2 = (Integer) cVar2.f757c.remove(str2)) != null) {
                cVar2.f756b.remove(num2);
            }
            cVar2.f760f.remove(str2);
            HashMap hashMap2 = cVar2.f761g;
            if (hashMap2.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + hashMap2.get(str2));
                hashMap2.remove(str2);
            }
            Bundle bundle2 = cVar2.f762h;
            if (bundle2.containsKey(str2)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + bundle2.getParcelable(str2));
                bundle2.remove(str2);
            }
            F.Q.i(cVar2.f758d.get(str2));
            androidx.activity.result.d dVar3 = this.f1193x;
            androidx.activity.c cVar3 = dVar3.f776b;
            ArrayList arrayList3 = cVar3.f759e;
            String str3 = dVar3.f775a;
            if (!arrayList3.contains(str3) && (num = (Integer) cVar3.f757c.remove(str3)) != null) {
                cVar3.f756b.remove(num);
            }
            cVar3.f760f.remove(str3);
            HashMap hashMap3 = cVar3.f761g;
            if (hashMap3.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + hashMap3.get(str3));
                hashMap3.remove(str3);
            }
            Bundle bundle3 = cVar3.f762h;
            if (bundle3.containsKey(str3)) {
                Log.w("ActivityResultRegistry", "Dropping pending result for request " + str3 + ": " + bundle3.getParcelable(str3));
                bundle3.remove(str3);
            }
            F.Q.i(cVar3.f758d.get(str3));
        }
    }

    public final void l() {
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null) {
                abstractComponentCallbacksC0075p.f1372C = true;
                abstractComponentCallbacksC0075p.f1406t.l();
            }
        }
    }

    public final void m(boolean z2) {
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null) {
                abstractComponentCallbacksC0075p.f1406t.m(z2);
            }
        }
    }

    public final boolean n() {
        if (this.f1184o < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null && !abstractComponentCallbacksC0075p.f1411y && abstractComponentCallbacksC0075p.f1406t.n()) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.f1184o < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null && !abstractComponentCallbacksC0075p.f1411y) {
                abstractComponentCallbacksC0075p.f1406t.o();
            }
        }
    }

    public final void p(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (abstractComponentCallbacksC0075p != null) {
            if (abstractComponentCallbacksC0075p.equals(this.f1172c.b(abstractComponentCallbacksC0075p.f1391e))) {
                abstractComponentCallbacksC0075p.f1404r.getClass();
                boolean G2 = G(abstractComponentCallbacksC0075p);
                Boolean bool = abstractComponentCallbacksC0075p.f1396j;
                if (bool == null || bool.booleanValue() != G2) {
                    abstractComponentCallbacksC0075p.f1396j = Boolean.valueOf(G2);
                    H h2 = abstractComponentCallbacksC0075p.f1406t;
                    h2.Y();
                    h2.p(h2.f1188s);
                }
            }
        }
    }

    public final void q(boolean z2) {
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null) {
                abstractComponentCallbacksC0075p.f1406t.q(z2);
            }
        }
    }

    public final boolean r() {
        boolean z2 = false;
        if (this.f1184o >= 1) {
            for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : this.f1172c.f()) {
                if (abstractComponentCallbacksC0075p != null && F(abstractComponentCallbacksC0075p) && !abstractComponentCallbacksC0075p.f1411y && abstractComponentCallbacksC0075p.f1406t.r()) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void s(int i2) {
        try {
            this.f1171b = true;
            for (M m2 : this.f1172c.f1229b.values()) {
                if (m2 != null) {
                    m2.f1227e = i2;
                }
            }
            I(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((d0) it.next()).e();
            }
            this.f1171b = false;
            x(true);
        } catch (Throwable th) {
            this.f1171b = false;
            throw th;
        }
    }

    public final void t() {
        if (this.f1164D) {
            this.f1164D = false;
            W();
        }
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String d2 = F.Q.d(str, "    ");
        N n2 = this.f1172c;
        n2.getClass();
        String str2 = str + "    ";
        HashMap hashMap = n2.f1229b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (M m2 : hashMap.values()) {
                printWriter.print(str);
                if (m2 != null) {
                    AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
                    printWriter.println(abstractComponentCallbacksC0075p);
                    abstractComponentCallbacksC0075p.e(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = n2.f1228a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = (AbstractComponentCallbacksC0075p) arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0075p2.toString());
            }
        }
        ArrayList arrayList2 = this.f1174e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p3 = (AbstractComponentCallbacksC0075p) this.f1174e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0075p3.toString());
            }
        }
        ArrayList arrayList3 = this.f1173d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                C0060a c0060a = (C0060a) this.f1173d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c0060a.toString());
                c0060a.e(d2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1178i.get());
        synchronized (this.f1170a) {
            try {
                int size4 = this.f1170a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (F) this.f1170a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1185p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1186q);
        if (this.f1187r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1187r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1184o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1161A);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1162B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1163C);
        if (this.f1195z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1195z);
        }
    }

    public final void v(F f2, boolean z2) {
        if (!z2) {
            if (this.f1185p == null) {
                if (!this.f1163C) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1161A || this.f1162B) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1170a) {
            try {
                if (this.f1185p == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1170a.add(f2);
                    Q();
                }
            } finally {
            }
        }
    }

    public final void w(boolean z2) {
        if (this.f1171b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1185p == null) {
            if (!this.f1163C) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1185p.f1417e.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1161A || this.f1162B)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1165E == null) {
            this.f1165E = new ArrayList();
            this.f1166F = new ArrayList();
        }
        this.f1171b = false;
    }

    public final boolean x(boolean z2) {
        w(z2);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f1165E;
            ArrayList arrayList2 = this.f1166F;
            synchronized (this.f1170a) {
                try {
                    if (this.f1170a.isEmpty()) {
                        break;
                    }
                    int size = this.f1170a.size();
                    boolean z4 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z4 |= ((F) this.f1170a.get(i2)).a(arrayList, arrayList2);
                    }
                    this.f1170a.clear();
                    this.f1185p.f1417e.removeCallbacks(this.f1169I);
                    if (!z4) {
                        break;
                    }
                    z3 = true;
                    this.f1171b = true;
                    try {
                        N(this.f1165E, this.f1166F);
                    } finally {
                        d();
                    }
                } finally {
                }
            }
        }
        Y();
        t();
        this.f1172c.f1229b.values().removeAll(Collections.singleton(null));
        return z3;
    }

    public final void y(ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        N n2;
        N n3;
        N n4;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList2;
        boolean z2 = ((C0060a) arrayList.get(i2)).f1279o;
        ArrayList arrayList4 = this.f1167G;
        if (arrayList4 == null) {
            this.f1167G = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f1167G;
        N n5 = this.f1172c;
        arrayList5.addAll(n5.f());
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1188s;
        int i6 = i2;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i3) {
                N n6 = n5;
                this.f1167G.clear();
                if (!z2 && this.f1184o >= 1) {
                    for (int i8 = i2; i8 < i3; i8++) {
                        Iterator it = ((C0060a) arrayList.get(i8)).f1265a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = ((O) it.next()).f1232b;
                            if (abstractComponentCallbacksC0075p2 == null || abstractComponentCallbacksC0075p2.f1404r == null) {
                                n2 = n6;
                            } else {
                                n2 = n6;
                                n2.g(f(abstractComponentCallbacksC0075p2));
                            }
                            n6 = n2;
                        }
                    }
                }
                for (int i9 = i2; i9 < i3; i9++) {
                    C0060a c0060a = (C0060a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0060a.c(-1);
                        c0060a.g();
                    } else {
                        c0060a.c(1);
                        c0060a.f();
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
                for (int i10 = i2; i10 < i3; i10++) {
                    C0060a c0060a2 = (C0060a) arrayList.get(i10);
                    if (booleanValue) {
                        for (int size = c0060a2.f1265a.size() - 1; size >= 0; size--) {
                            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p3 = ((O) c0060a2.f1265a.get(size)).f1232b;
                            if (abstractComponentCallbacksC0075p3 != null) {
                                f(abstractComponentCallbacksC0075p3).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0060a2.f1265a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p4 = ((O) it2.next()).f1232b;
                            if (abstractComponentCallbacksC0075p4 != null) {
                                f(abstractComponentCallbacksC0075p4).k();
                            }
                        }
                    }
                }
                I(this.f1184o, true);
                HashSet hashSet = new HashSet();
                for (int i11 = i2; i11 < i3; i11++) {
                    Iterator it3 = ((C0060a) arrayList.get(i11)).f1265a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p5 = ((O) it3.next()).f1232b;
                        if (abstractComponentCallbacksC0075p5 != null && (viewGroup = abstractComponentCallbacksC0075p5.f1373D) != null) {
                            hashSet.add(d0.f(viewGroup, C()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    d0 d0Var = (d0) it4.next();
                    d0Var.f1323d = booleanValue;
                    d0Var.g();
                    d0Var.c();
                }
                for (int i12 = i2; i12 < i3; i12++) {
                    C0060a c0060a3 = (C0060a) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue() && c0060a3.f1282r >= 0) {
                        c0060a3.f1282r = -1;
                    }
                    c0060a3.getClass();
                }
                return;
            }
            C0060a c0060a4 = (C0060a) arrayList.get(i6);
            if (((Boolean) arrayList3.get(i6)).booleanValue()) {
                n3 = n5;
                int i13 = 1;
                ArrayList arrayList6 = this.f1167G;
                int size2 = c0060a4.f1265a.size() - 1;
                while (size2 >= 0) {
                    O o2 = (O) c0060a4.f1265a.get(size2);
                    int i14 = o2.f1231a;
                    if (i14 != i13) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 8:
                                    abstractComponentCallbacksC0075p = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0075p = o2.f1232b;
                                    break;
                                case 10:
                                    o2.f1238h = o2.f1237g;
                                    break;
                            }
                            size2--;
                            i13 = 1;
                        }
                        arrayList6.add(o2.f1232b);
                        size2--;
                        i13 = 1;
                    }
                    arrayList6.remove(o2.f1232b);
                    size2--;
                    i13 = 1;
                }
            } else {
                ArrayList arrayList7 = this.f1167G;
                int i15 = 0;
                while (i15 < c0060a4.f1265a.size()) {
                    O o3 = (O) c0060a4.f1265a.get(i15);
                    int i16 = o3.f1231a;
                    if (i16 == i7) {
                        n4 = n5;
                        i4 = i7;
                    } else if (i16 != 2) {
                        if (i16 == 3 || i16 == 6) {
                            arrayList7.remove(o3.f1232b);
                            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p6 = o3.f1232b;
                            if (abstractComponentCallbacksC0075p6 == abstractComponentCallbacksC0075p) {
                                c0060a4.f1265a.add(i15, new O(9, abstractComponentCallbacksC0075p6));
                                i15++;
                                n4 = n5;
                                i4 = 1;
                                abstractComponentCallbacksC0075p = null;
                                i15 += i4;
                                i7 = i4;
                                n5 = n4;
                            }
                        } else if (i16 == 7) {
                            n4 = n5;
                            i4 = 1;
                        } else if (i16 == 8) {
                            c0060a4.f1265a.add(i15, new O(9, abstractComponentCallbacksC0075p));
                            i15++;
                            abstractComponentCallbacksC0075p = o3.f1232b;
                        }
                        n4 = n5;
                        i4 = 1;
                        i15 += i4;
                        i7 = i4;
                        n5 = n4;
                    } else {
                        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p7 = o3.f1232b;
                        int i17 = abstractComponentCallbacksC0075p7.f1409w;
                        int size3 = arrayList7.size() - 1;
                        boolean z4 = false;
                        while (size3 >= 0) {
                            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p8 = (AbstractComponentCallbacksC0075p) arrayList7.get(size3);
                            N n7 = n5;
                            if (abstractComponentCallbacksC0075p8.f1409w != i17) {
                                i5 = i17;
                            } else if (abstractComponentCallbacksC0075p8 == abstractComponentCallbacksC0075p7) {
                                i5 = i17;
                                z4 = true;
                            } else {
                                if (abstractComponentCallbacksC0075p8 == abstractComponentCallbacksC0075p) {
                                    i5 = i17;
                                    c0060a4.f1265a.add(i15, new O(9, abstractComponentCallbacksC0075p8));
                                    i15++;
                                    abstractComponentCallbacksC0075p = null;
                                } else {
                                    i5 = i17;
                                }
                                O o4 = new O(3, abstractComponentCallbacksC0075p8);
                                o4.f1233c = o3.f1233c;
                                o4.f1235e = o3.f1235e;
                                o4.f1234d = o3.f1234d;
                                o4.f1236f = o3.f1236f;
                                c0060a4.f1265a.add(i15, o4);
                                arrayList7.remove(abstractComponentCallbacksC0075p8);
                                i15++;
                            }
                            size3--;
                            n5 = n7;
                            i17 = i5;
                        }
                        n4 = n5;
                        if (z4) {
                            c0060a4.f1265a.remove(i15);
                            i15--;
                            i4 = 1;
                            i15 += i4;
                            i7 = i4;
                            n5 = n4;
                        } else {
                            i4 = 1;
                            o3.f1231a = 1;
                            arrayList7.add(abstractComponentCallbacksC0075p7);
                            i15 += i4;
                            i7 = i4;
                            n5 = n4;
                        }
                    }
                    arrayList7.add(o3.f1232b);
                    i15 += i4;
                    i7 = i4;
                    n5 = n4;
                }
                n3 = n5;
            }
            z3 = z3 || c0060a4.f1271g;
            i6++;
            arrayList3 = arrayList2;
            n5 = n3;
        }
    }

    public final AbstractComponentCallbacksC0075p z(int i2) {
        N n2 = this.f1172c;
        ArrayList arrayList = n2.f1228a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = (AbstractComponentCallbacksC0075p) arrayList.get(size);
            if (abstractComponentCallbacksC0075p != null && abstractComponentCallbacksC0075p.f1408v == i2) {
                return abstractComponentCallbacksC0075p;
            }
        }
        for (M m2 : n2.f1229b.values()) {
            if (m2 != null) {
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2 = m2.f1225c;
                if (abstractComponentCallbacksC0075p2.f1408v == i2) {
                    return abstractComponentCallbacksC0075p2;
                }
            }
        }
        return null;
    }
}
