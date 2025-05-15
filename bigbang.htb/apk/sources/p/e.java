package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public o.e f3449a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3450b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3451c;

    /* renamed from: d, reason: collision with root package name */
    public o.e f3452d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3453e;

    /* renamed from: f, reason: collision with root package name */
    public q.e f3454f;

    /* renamed from: g, reason: collision with root package name */
    public C0209b f3455g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3456h;

    public final void a(f fVar, int i2, ArrayList arrayList, k kVar) {
        m mVar = fVar.f3460d;
        if (mVar.f3477c == null) {
            o.e eVar = this.f3449a;
            if (mVar == eVar.f3312d || mVar == eVar.f3313e) {
                return;
            }
            if (kVar == null) {
                kVar = new k();
                kVar.f3471a = null;
                kVar.f3472b = new ArrayList();
                kVar.f3471a = mVar;
                arrayList.add(kVar);
            }
            mVar.f3477c = kVar;
            kVar.f3472b.add(mVar);
            f fVar2 = mVar.f3482h;
            Iterator it = fVar2.f3467k.iterator();
            while (it.hasNext()) {
                InterfaceC0211d interfaceC0211d = (InterfaceC0211d) it.next();
                if (interfaceC0211d instanceof f) {
                    a((f) interfaceC0211d, i2, arrayList, kVar);
                }
            }
            f fVar3 = mVar.f3483i;
            Iterator it2 = fVar3.f3467k.iterator();
            while (it2.hasNext()) {
                InterfaceC0211d interfaceC0211d2 = (InterfaceC0211d) it2.next();
                if (interfaceC0211d2 instanceof f) {
                    a((f) interfaceC0211d2, i2, arrayList, kVar);
                }
            }
            if (i2 == 1 && (mVar instanceof l)) {
                Iterator it3 = ((l) mVar).f3473k.f3467k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0211d interfaceC0211d3 = (InterfaceC0211d) it3.next();
                    if (interfaceC0211d3 instanceof f) {
                        a((f) interfaceC0211d3, i2, arrayList, kVar);
                    }
                }
            }
            Iterator it4 = fVar2.f3468l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i2, arrayList, kVar);
            }
            Iterator it5 = fVar3.f3468l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i2, arrayList, kVar);
            }
            if (i2 == 1 && (mVar instanceof l)) {
                Iterator it6 = ((l) mVar).f3473k.f3468l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i2, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(o.e r20) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.b(o.e):void");
    }

    public final void c() {
        ArrayList arrayList = this.f3453e;
        arrayList.clear();
        o.e eVar = this.f3452d;
        eVar.f3312d.f();
        l lVar = eVar.f3313e;
        lVar.f();
        arrayList.add(eVar.f3312d);
        arrayList.add(lVar);
        Iterator it = eVar.f3335d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            o.d dVar = (o.d) it.next();
            if (dVar instanceof o.f) {
                h hVar = new h(dVar);
                dVar.f3312d.f();
                dVar.f3313e.f();
                hVar.f3480f = ((o.f) dVar).f3352h0;
                arrayList.add(hVar);
            } else {
                if (dVar.o()) {
                    if (dVar.f3308b == null) {
                        dVar.f3308b = new C0210c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3308b);
                } else {
                    arrayList.add(dVar.f3312d);
                }
                if (dVar.p()) {
                    if (dVar.f3310c == null) {
                        dVar.f3310c = new C0210c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3310c);
                } else {
                    arrayList.add(dVar.f3313e);
                }
                if (dVar instanceof o.h) {
                    arrayList.add(new i(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f3476b != eVar) {
                mVar.d();
            }
        }
        ArrayList arrayList2 = this.f3456h;
        arrayList2.clear();
        o.e eVar2 = this.f3449a;
        e(eVar2.f3312d, 0, arrayList2);
        e(eVar2.f3313e, 1, arrayList2);
        this.f3450b = false;
    }

    public final int d(o.e eVar, int i2) {
        ArrayList arrayList;
        int i3;
        long max;
        float f2;
        o.e eVar2 = eVar;
        ArrayList arrayList2 = this.f3456h;
        int size = arrayList2.size();
        long j2 = 0;
        int i4 = 0;
        long j3 = 0;
        while (i4 < size) {
            m mVar = ((k) arrayList2.get(i4)).f3471a;
            if (!(mVar instanceof C0210c) ? !(i2 != 0 ? (mVar instanceof l) : (mVar instanceof j)) : ((C0210c) mVar).f3480f != i2) {
                f fVar = (i2 == 0 ? eVar2.f3312d : eVar2.f3313e).f3482h;
                f fVar2 = (i2 == 0 ? eVar2.f3312d : eVar2.f3313e).f3483i;
                boolean contains = mVar.f3482h.f3468l.contains(fVar);
                f fVar3 = mVar.f3483i;
                boolean contains2 = fVar3.f3468l.contains(fVar2);
                long j4 = mVar.j();
                f fVar4 = mVar.f3482h;
                if (contains && contains2) {
                    long b2 = k.b(fVar4, j2);
                    arrayList = arrayList2;
                    long a2 = k.a(fVar3, j2);
                    long j5 = b2 - j4;
                    int i5 = fVar3.f3462f;
                    i3 = i4;
                    if (j5 >= (-i5)) {
                        j5 += i5;
                    }
                    long j6 = fVar4.f3462f;
                    long j7 = ((-a2) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    o.d dVar = mVar.f3476b;
                    if (i2 == 0) {
                        f2 = dVar.f3298S;
                    } else if (i2 == 1) {
                        f2 = dVar.f3299T;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j5 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (fVar4.f3462f + ((((long) ((f3 * f2) + 0.5f)) + j4) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - fVar3.f3462f;
                } else {
                    arrayList = arrayList2;
                    i3 = i4;
                    max = contains ? Math.max(k.b(fVar4, fVar4.f3462f), fVar4.f3462f + j4) : contains2 ? Math.max(-k.a(fVar3, fVar3.f3462f), (-fVar3.f3462f) + j4) : (mVar.j() + fVar4.f3462f) - fVar3.f3462f;
                }
            } else {
                arrayList = arrayList2;
                max = j2;
                i3 = i4;
            }
            j3 = Math.max(j3, max);
            i4 = i3 + 1;
            arrayList2 = arrayList;
            eVar2 = eVar;
            j2 = 0;
        }
        return (int) j3;
    }

    public final void e(m mVar, int i2, ArrayList arrayList) {
        f fVar;
        Iterator it = mVar.f3482h.f3467k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = mVar.f3483i;
            if (!hasNext) {
                break;
            }
            InterfaceC0211d interfaceC0211d = (InterfaceC0211d) it.next();
            if (interfaceC0211d instanceof f) {
                a((f) interfaceC0211d, i2, arrayList, null);
            } else if (interfaceC0211d instanceof m) {
                a(((m) interfaceC0211d).f3482h, i2, arrayList, null);
            }
        }
        Iterator it2 = fVar.f3467k.iterator();
        while (it2.hasNext()) {
            InterfaceC0211d interfaceC0211d2 = (InterfaceC0211d) it2.next();
            if (interfaceC0211d2 instanceof f) {
                a((f) interfaceC0211d2, i2, arrayList, null);
            } else if (interfaceC0211d2 instanceof m) {
                a(((m) interfaceC0211d2).f3483i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            Iterator it3 = ((l) mVar).f3473k.f3467k.iterator();
            while (it3.hasNext()) {
                InterfaceC0211d interfaceC0211d3 = (InterfaceC0211d) it3.next();
                if (interfaceC0211d3 instanceof f) {
                    a((f) interfaceC0211d3, i2, arrayList, null);
                }
            }
        }
    }

    public final void f(o.d dVar, int i2, int i3, int i4, int i5) {
        C0209b c0209b = this.f3455g;
        c0209b.f3437a = i2;
        c0209b.f3438b = i4;
        c0209b.f3439c = i3;
        c0209b.f3440d = i5;
        this.f3454f.a(dVar, c0209b);
        dVar.v(c0209b.f3441e);
        dVar.s(c0209b.f3442f);
        dVar.f3331w = c0209b.f3444h;
        int i6 = c0209b.f3443g;
        dVar.f3295P = i6;
        dVar.f3331w = i6 > 0;
    }

    public final void g() {
        C0208a c0208a;
        Iterator it = this.f3449a.f3335d0.iterator();
        while (it.hasNext()) {
            o.d dVar = (o.d) it.next();
            if (!dVar.f3306a) {
                int[] iArr = dVar.f3311c0;
                boolean z2 = false;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = dVar.f3318j;
                int i5 = dVar.f3319k;
                boolean z3 = i2 == 2 || (i2 == 3 && i4 == 1);
                if (i3 == 2 || (i3 == 3 && i5 == 1)) {
                    z2 = true;
                }
                j jVar = dVar.f3312d;
                g gVar = jVar.f3479e;
                boolean z4 = gVar.f3466j;
                l lVar = dVar.f3313e;
                g gVar2 = lVar.f3479e;
                boolean z5 = gVar2.f3466j;
                if (z4 && z5) {
                    f(dVar, 1, gVar.f3463g, 1, gVar2.f3463g);
                    dVar.f3306a = true;
                } else if (z4 && z2) {
                    f(dVar, 1, gVar.f3463g, 2, gVar2.f3463g);
                    if (i3 == 3) {
                        lVar.f3479e.f3469m = dVar.g();
                    } else {
                        lVar.f3479e.d(dVar.g());
                        dVar.f3306a = true;
                    }
                } else if (z5 && z3) {
                    f(dVar, 2, gVar.f3463g, 1, gVar2.f3463g);
                    if (i2 == 3) {
                        jVar.f3479e.f3469m = dVar.j();
                    } else {
                        jVar.f3479e.d(dVar.j());
                        dVar.f3306a = true;
                    }
                }
                if (dVar.f3306a && (c0208a = lVar.f3474l) != null) {
                    c0208a.d(dVar.f3295P);
                }
            }
        }
    }
}
