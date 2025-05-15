package androidx.lifecycle;

import j.C0184a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k.C0187a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class q extends D.g {

    /* renamed from: b, reason: collision with root package name */
    public final C0187a f1470b;

    /* renamed from: c, reason: collision with root package name */
    public j f1471c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1472d;

    /* renamed from: e, reason: collision with root package name */
    public int f1473e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1474f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1475g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1476h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1477i;

    public q(o oVar) {
        this.f48a = new AtomicReference();
        C0187a c0187a = new C0187a();
        c0187a.f2991e = new HashMap();
        this.f1470b = c0187a;
        this.f1473e = 0;
        this.f1474f = false;
        this.f1475g = false;
        this.f1476h = new ArrayList();
        this.f1472d = new WeakReference(oVar);
        this.f1471c = j.f1462b;
        this.f1477i = true;
    }

    @Override // D.g
    public final void a(n nVar) {
        m reflectiveGenericLifecycleObserver;
        o oVar;
        f("addObserver");
        j jVar = this.f1471c;
        j jVar2 = j.f1461a;
        if (jVar != jVar2) {
            jVar2 = j.f1462b;
        }
        p pVar = new p();
        HashMap hashMap = r.f1478a;
        boolean z2 = nVar instanceof m;
        boolean z3 = nVar instanceof InterfaceC0088d;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((InterfaceC0088d) nVar, (m) nVar);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((InterfaceC0088d) nVar, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (m) nVar;
        } else {
            Class<?> cls = nVar.getClass();
            if (r.c(cls) == 2) {
                List list = (List) r.f1479b.get(cls);
                if (list.size() == 1) {
                    r.a((Constructor) list.get(0), nVar);
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver();
                } else {
                    g[] gVarArr = new g[list.size()];
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        r.a((Constructor) list.get(i2), nVar);
                        gVarArr[i2] = null;
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(nVar);
            }
        }
        pVar.f1469b = reflectiveGenericLifecycleObserver;
        pVar.f1468a = jVar2;
        C0187a c0187a = this.f1470b;
        if (((p) c0187a.c(nVar, pVar)) == null && (oVar = (o) this.f1472d.get()) != null) {
            boolean z4 = this.f1473e != 0 || this.f1474f;
            j e2 = e(nVar);
            this.f1473e++;
            while (pVar.f1468a.compareTo(e2) < 0 && c0187a.f2991e.containsKey(nVar)) {
                this.f1476h.add(pVar.f1468a);
                int ordinal = pVar.f1468a.ordinal();
                i iVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : i.ON_RESUME : i.ON_START : i.ON_CREATE;
                if (iVar == null) {
                    throw new IllegalStateException("no event up from " + pVar.f1468a);
                }
                pVar.a(oVar, iVar);
                ArrayList arrayList = this.f1476h;
                arrayList.remove(arrayList.size() - 1);
                e2 = e(nVar);
            }
            if (!z4) {
                i();
            }
            this.f1473e--;
        }
    }

    @Override // D.g
    public final void d(n nVar) {
        f("removeObserver");
        this.f1470b.b(nVar);
    }

    public final j e(n nVar) {
        HashMap hashMap = this.f1470b.f2991e;
        k.c cVar = hashMap.containsKey(nVar) ? ((k.c) hashMap.get(nVar)).f2996d : null;
        j jVar = cVar != null ? ((p) cVar.f2994b).f1468a : null;
        ArrayList arrayList = this.f1476h;
        j jVar2 = arrayList.isEmpty() ? null : (j) arrayList.get(arrayList.size() - 1);
        j jVar3 = this.f1471c;
        if (jVar == null || jVar.compareTo(jVar3) >= 0) {
            jVar = jVar3;
        }
        return (jVar2 == null || jVar2.compareTo(jVar) >= 0) ? jVar : jVar2;
    }

    public final void f(String str) {
        if (!this.f1477i || C0184a.k0().f2966c.k0()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    public final void g(i iVar) {
        f("handleLifecycleEvent");
        h(iVar.a());
    }

    public final void h(j jVar) {
        if (this.f1471c == jVar) {
            return;
        }
        this.f1471c = jVar;
        if (this.f1474f || this.f1473e != 0) {
            this.f1475g = true;
            return;
        }
        this.f1474f = true;
        i();
        this.f1474f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r12.f1475g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0049, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e3, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.q.i():void");
    }
}
