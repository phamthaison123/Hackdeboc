package o;

import e.C0097c;
import g.C0107g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import n.C0199e;
import n.C0205k;
import p.C0209b;
import p.C0210c;
import p.j;
import p.l;
import p.m;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e extends d {

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f3335d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final C0097c f3336e0;

    /* renamed from: f0, reason: collision with root package name */
    public final p.e f3337f0;

    /* renamed from: g0, reason: collision with root package name */
    public q.e f3338g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f3339h0;

    /* renamed from: i0, reason: collision with root package name */
    public final C0199e f3340i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f3341j0;
    public int k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f3342l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f3343m0;

    /* renamed from: n0, reason: collision with root package name */
    public b[] f3344n0;

    /* renamed from: o0, reason: collision with root package name */
    public b[] f3345o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f3346p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3347q0;
    public boolean r0;

    public e() {
        C0097c c0097c = new C0097c();
        c0097c.f2078a = new ArrayList();
        c0097c.f2079b = new C0209b();
        c0097c.f2080c = this;
        this.f3336e0 = c0097c;
        p.e eVar = new p.e();
        eVar.f3450b = true;
        eVar.f3451c = true;
        eVar.f3453e = new ArrayList();
        new ArrayList();
        eVar.f3454f = null;
        eVar.f3455g = new C0209b();
        eVar.f3456h = new ArrayList();
        eVar.f3449a = this;
        eVar.f3452d = this;
        this.f3337f0 = eVar;
        this.f3338g0 = null;
        this.f3339h0 = false;
        this.f3340i0 = new C0199e();
        this.f3342l0 = 0;
        this.f3343m0 = 0;
        this.f3344n0 = new b[4];
        this.f3345o0 = new b[4];
        this.f3346p0 = 263;
        this.f3347q0 = false;
        this.r0 = false;
    }

    public final boolean A(int i2, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = z2 & true;
        p.e eVar = this.f3337f0;
        e eVar2 = eVar.f3449a;
        int f2 = eVar2.f(0);
        int f3 = eVar2.f(1);
        int k2 = eVar2.k();
        int l2 = eVar2.l();
        ArrayList arrayList = eVar.f3453e;
        l lVar = eVar2.f3313e;
        j jVar = eVar2.f3312d;
        if (z6 && (f2 == 2 || f3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f3480f == i2 && !mVar.k()) {
                    z6 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z6 && f2 == 2) {
                    eVar2.t(1);
                    eVar2.v(eVar.d(eVar2, 0));
                    jVar.f3479e.d(eVar2.j());
                }
            } else if (z6 && f3 == 2) {
                eVar2.u(1);
                eVar2.s(eVar.d(eVar2, 1));
                lVar.f3479e.d(eVar2.g());
            }
        }
        int[] iArr = eVar2.f3311c0;
        if (i2 == 0) {
            z3 = false;
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int j2 = eVar2.j() + k2;
                jVar.f3483i.d(j2);
                jVar.f3479e.d(j2 - k2);
                z4 = true;
            }
            z4 = z3;
        } else {
            z3 = false;
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int g2 = eVar2.g() + l2;
                lVar.f3483i.d(g2);
                lVar.f3479e.d(g2 - l2);
                z4 = true;
            }
            z4 = z3;
        }
        eVar.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f3480f == i2 && (mVar2.f3476b != eVar2 || mVar2.f3481g)) {
                mVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (mVar3.f3480f == i2 && (z4 || mVar3.f3476b != eVar2)) {
                if (!mVar3.f3482h.f3466j || !mVar3.f3483i.f3466j || (!(mVar3 instanceof C0210c) && !mVar3.f3479e.f3466j)) {
                    z5 = z3;
                    break;
                }
            }
        }
        eVar2.t(f2);
        eVar2.u(f3);
        return z5;
    }

    public final boolean B() {
        return this.r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff A[LOOP:4: B:48:0x00fd->B:49:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.C():void");
    }

    @Override // o.d
    public final void q() {
        this.f3340i0.r();
        this.f3341j0 = 0;
        this.k0 = 0;
        this.f3335d0.clear();
        super.q();
    }

    @Override // o.d
    public final void r(C0107g c0107g) {
        super.r(c0107g);
        int size = this.f3335d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((d) this.f3335d0.get(i2)).r(c0107g);
        }
    }

    @Override // o.d
    public final void w(boolean z2, boolean z3) {
        super.w(z2, z3);
        int size = this.f3335d0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((d) this.f3335d0.get(i2)).w(z2, z3);
        }
    }

    public final void y(d dVar, int i2) {
        if (i2 == 0) {
            int i3 = this.f3342l0 + 1;
            b[] bVarArr = this.f3345o0;
            if (i3 >= bVarArr.length) {
                this.f3345o0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f3345o0;
            int i4 = this.f3342l0;
            bVarArr2[i4] = new b(dVar, 0, this.f3339h0);
            this.f3342l0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f3343m0 + 1;
            b[] bVarArr3 = this.f3344n0;
            if (i5 >= bVarArr3.length) {
                this.f3344n0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f3344n0;
            int i6 = this.f3343m0;
            bVarArr4[i6] = new b(dVar, 1, this.f3339h0);
            this.f3343m0 = i6 + 1;
        }
    }

    public final void z(C0199e c0199e) {
        a(c0199e);
        int size = this.f3335d0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) this.f3335d0.get(i2);
            boolean[] zArr = dVar.f3287H;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0207a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                d dVar2 = (d) this.f3335d0.get(i3);
                if (dVar2 instanceof C0207a) {
                    C0207a c0207a = (C0207a) dVar2;
                    for (int i4 = 0; i4 < c0207a.f3354e0; i4++) {
                        d dVar3 = c0207a.f3353d0[i4];
                        int i5 = c0207a.f3253f0;
                        if (i5 == 0 || i5 == 1) {
                            dVar3.f3287H[0] = true;
                        } else if (i5 == 2 || i5 == 3) {
                            dVar3.f3287H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            d dVar4 = (d) this.f3335d0.get(i6);
            dVar4.getClass();
            if (dVar4 instanceof f) {
                dVar4.a(c0199e);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            d dVar5 = (d) this.f3335d0.get(i7);
            if (dVar5 instanceof e) {
                int[] iArr = dVar5.f3311c0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                if (i8 == 2) {
                    dVar5.t(1);
                }
                if (i9 == 2) {
                    dVar5.u(1);
                }
                dVar5.a(c0199e);
                if (i8 == 2) {
                    dVar5.t(i8);
                }
                if (i9 == 2) {
                    dVar5.u(i9);
                }
            } else {
                dVar5.f3316h = -1;
                dVar5.f3317i = -1;
                int[] iArr2 = this.f3311c0;
                int i10 = iArr2[0];
                int[] iArr3 = dVar5.f3311c0;
                if (i10 != 2 && iArr3[0] == 4) {
                    c cVar = dVar5.f3332x;
                    int i11 = cVar.f3277e;
                    int j2 = j();
                    c cVar2 = dVar5.f3334z;
                    int i12 = j2 - cVar2.f3277e;
                    cVar.f3279g = c0199e.j(cVar);
                    cVar2.f3279g = c0199e.j(cVar2);
                    c0199e.d(cVar.f3279g, i11);
                    c0199e.d(cVar2.f3279g, i12);
                    dVar5.f3316h = 2;
                    dVar5.f3293N = i11;
                    int i13 = i12 - i11;
                    dVar5.f3289J = i13;
                    int i14 = dVar5.f3296Q;
                    if (i13 < i14) {
                        dVar5.f3289J = i14;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    c cVar3 = dVar5.f3333y;
                    int i15 = cVar3.f3277e;
                    int g2 = g();
                    c cVar4 = dVar5.f3280A;
                    int i16 = g2 - cVar4.f3277e;
                    cVar3.f3279g = c0199e.j(cVar3);
                    cVar4.f3279g = c0199e.j(cVar4);
                    c0199e.d(cVar3.f3279g, i15);
                    c0199e.d(cVar4.f3279g, i16);
                    if (dVar5.f3295P > 0 || dVar5.f3301V == 8) {
                        c cVar5 = dVar5.f3281B;
                        C0205k j3 = c0199e.j(cVar5);
                        cVar5.f3279g = j3;
                        c0199e.d(j3, dVar5.f3295P + i15);
                    }
                    dVar5.f3317i = 2;
                    dVar5.f3294O = i15;
                    int i17 = i16 - i15;
                    dVar5.f3290K = i17;
                    int i18 = dVar5.f3297R;
                    if (i17 < i18) {
                        dVar5.f3290K = i18;
                    }
                }
                if (!(dVar5 instanceof f)) {
                    dVar5.a(c0199e);
                }
            }
        }
        if (this.f3342l0 > 0) {
            B.a.h(this, c0199e, 0);
        }
        if (this.f3343m0 > 0) {
            B.a.h(this, c0199e, 1);
        }
    }
}
