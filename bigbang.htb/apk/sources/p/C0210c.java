package p;

import F.Q;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0210c extends m {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3447k;

    /* renamed from: l, reason: collision with root package name */
    public int f3448l;

    public C0210c(o.d dVar, int i2) {
        super(dVar);
        o.d dVar2;
        this.f3447k = new ArrayList();
        this.f3480f = i2;
        o.d dVar3 = this.f3476b;
        o.d i3 = dVar3.i(i2);
        while (true) {
            o.d dVar4 = i3;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                i3 = dVar3.i(this.f3480f);
            }
        }
        this.f3476b = dVar2;
        int i4 = this.f3480f;
        InterfaceC0211d interfaceC0211d = i4 == 0 ? dVar2.f3312d : i4 == 1 ? dVar2.f3313e : null;
        ArrayList arrayList = this.f3447k;
        arrayList.add(interfaceC0211d);
        o.d h2 = dVar2.h(this.f3480f);
        while (h2 != null) {
            int i5 = this.f3480f;
            arrayList.add(i5 == 0 ? h2.f3312d : i5 == 1 ? h2.f3313e : null);
            h2 = h2.h(this.f3480f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            int i6 = this.f3480f;
            if (i6 == 0) {
                mVar.f3476b.f3308b = this;
            } else if (i6 == 1) {
                mVar.f3476b.f3310c = this;
            }
        }
        if (this.f3480f == 0 && ((o.e) this.f3476b.f3288I).f3339h0 && arrayList.size() > 1) {
            this.f3476b = ((m) arrayList.get(arrayList.size() - 1)).f3476b;
        }
        this.f3448l = this.f3480f == 0 ? this.f3476b.f3303X : this.f3476b.f3304Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a0, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c5, code lost:
    
        r1.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c2, code lost:
    
        r13 = r13 + 1;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c0, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03c6, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    @Override // p.InterfaceC0211d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(p.InterfaceC0211d r27) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0210c.a(p.d):void");
    }

    @Override // p.m
    public final void d() {
        ArrayList arrayList = this.f3447k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        o.d dVar = ((m) arrayList.get(0)).f3476b;
        o.d dVar2 = ((m) arrayList.get(size - 1)).f3476b;
        int i2 = this.f3480f;
        f fVar = this.f3483i;
        f fVar2 = this.f3482h;
        if (i2 == 0) {
            o.c cVar = dVar.f3332x;
            o.c cVar2 = dVar2.f3334z;
            f i3 = m.i(cVar, 0);
            int b2 = cVar.b();
            o.d m2 = m();
            if (m2 != null) {
                b2 = m2.f3332x.b();
            }
            if (i3 != null) {
                m.b(fVar2, i3, b2);
            }
            f i4 = m.i(cVar2, 0);
            int b3 = cVar2.b();
            o.d n2 = n();
            if (n2 != null) {
                b3 = n2.f3334z.b();
            }
            if (i4 != null) {
                m.b(fVar, i4, -b3);
            }
        } else {
            o.c cVar3 = dVar.f3333y;
            o.c cVar4 = dVar2.f3280A;
            f i5 = m.i(cVar3, 1);
            int b4 = cVar3.b();
            o.d m3 = m();
            if (m3 != null) {
                b4 = m3.f3333y.b();
            }
            if (i5 != null) {
                m.b(fVar2, i5, b4);
            }
            f i6 = m.i(cVar4, 1);
            int b5 = cVar4.b();
            o.d n3 = n();
            if (n3 != null) {
                b5 = n3.f3280A.b();
            }
            if (i6 != null) {
                m.b(fVar, i6, -b5);
            }
        }
        fVar2.f3457a = this;
        fVar.f3457a = this;
    }

    @Override // p.m
    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f3447k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i2)).e();
            i2++;
        }
    }

    @Override // p.m
    public final void f() {
        this.f3477c = null;
        Iterator it = this.f3447k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // p.m
    public final long j() {
        ArrayList arrayList = this.f3447k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = r4.f3483i.f3462f + ((m) arrayList.get(i2)).j() + j2 + r4.f3482h.f3462f;
        }
        return j2;
    }

    @Override // p.m
    public final boolean k() {
        ArrayList arrayList = this.f3447k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((m) arrayList.get(i2)).k()) {
                return false;
            }
        }
        return true;
    }

    public final o.d m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f3447k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            o.d dVar = ((m) arrayList.get(i2)).f3476b;
            if (dVar.f3301V != 8) {
                return dVar;
            }
            i2++;
        }
    }

    public final o.d n() {
        ArrayList arrayList = this.f3447k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o.d dVar = ((m) arrayList.get(size)).f3476b;
            if (dVar.f3301V != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String concat = "ChainRun ".concat(this.f3480f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f3447k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            concat = Q.d(Q.d(concat, "<") + mVar, "> ");
        }
        return concat;
    }
}
