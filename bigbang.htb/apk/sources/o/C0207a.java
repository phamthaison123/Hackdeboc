package o;

import F.Q;
import n.C0197c;
import n.C0199e;
import n.C0205k;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0207a extends h {

    /* renamed from: f0, reason: collision with root package name */
    public int f3253f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f3254g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f3255h0;

    @Override // o.d
    public final void a(C0199e c0199e) {
        boolean z2;
        int i2;
        int i3;
        c[] cVarArr = this.f3285F;
        c cVar = this.f3332x;
        cVarArr[0] = cVar;
        c cVar2 = this.f3333y;
        int i4 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.f3334z;
        cVarArr[1] = cVar3;
        c cVar4 = this.f3280A;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f3279g = c0199e.j(cVar5);
        }
        int i5 = this.f3253f0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i5];
        for (int i6 = 0; i6 < this.f3354e0; i6++) {
            d dVar = this.f3353d0[i6];
            if ((this.f3254g0 || dVar.b()) && ((((i3 = this.f3253f0) == 0 || i3 == 1) && dVar.f3311c0[0] == 3 && dVar.f3332x.f3276d != null && dVar.f3334z.f3276d != null) || ((i3 == 2 || i3 == 3) && dVar.f3311c0[1] == 3 && dVar.f3333y.f3276d != null && dVar.f3280A.f3276d != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = cVar.c() || cVar3.c();
        boolean z4 = cVar2.c() || cVar4.c();
        int i7 = (z2 || !(((i2 = this.f3253f0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3354e0) {
            d dVar2 = this.f3353d0[i8];
            if (this.f3254g0 || dVar2.b()) {
                C0205k j2 = c0199e.j(dVar2.f3285F[this.f3253f0]);
                int i9 = this.f3253f0;
                c cVar7 = dVar2.f3285F[i9];
                cVar7.f3279g = j2;
                c cVar8 = cVar7.f3276d;
                int i10 = (cVar8 == null || cVar8.f3274b != this) ? 0 : cVar7.f3277e;
                if (i9 == 0 || i9 == i4) {
                    C0205k c0205k = cVar6.f3279g;
                    int i11 = this.f3255h0 - i10;
                    C0197c k2 = c0199e.k();
                    C0205k l2 = c0199e.l();
                    l2.f3224d = 0;
                    k2.c(c0205k, j2, l2, i11);
                    c0199e.c(k2);
                } else {
                    C0205k c0205k2 = cVar6.f3279g;
                    int i12 = this.f3255h0 + i10;
                    C0197c k3 = c0199e.k();
                    C0205k l3 = c0199e.l();
                    l3.f3224d = 0;
                    k3.b(c0205k2, j2, l3, i12);
                    c0199e.c(k3);
                }
                c0199e.e(cVar6.f3279g, j2, this.f3255h0 + i10, i7);
            }
            i8++;
            i4 = 2;
        }
        int i13 = this.f3253f0;
        if (i13 == 0) {
            c0199e.e(cVar3.f3279g, cVar.f3279g, 0, 8);
            c0199e.e(cVar.f3279g, this.f3288I.f3334z.f3279g, 0, 4);
            c0199e.e(cVar.f3279g, this.f3288I.f3332x.f3279g, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0199e.e(cVar.f3279g, cVar3.f3279g, 0, 8);
            c0199e.e(cVar.f3279g, this.f3288I.f3332x.f3279g, 0, 4);
            c0199e.e(cVar.f3279g, this.f3288I.f3334z.f3279g, 0, 0);
        } else if (i13 == 2) {
            c0199e.e(cVar4.f3279g, cVar2.f3279g, 0, 8);
            c0199e.e(cVar2.f3279g, this.f3288I.f3280A.f3279g, 0, 4);
            c0199e.e(cVar2.f3279g, this.f3288I.f3333y.f3279g, 0, 0);
        } else if (i13 == 3) {
            c0199e.e(cVar2.f3279g, cVar4.f3279g, 0, 8);
            c0199e.e(cVar2.f3279g, this.f3288I.f3333y.f3279g, 0, 4);
            c0199e.e(cVar2.f3279g, this.f3288I.f3280A.f3279g, 0, 0);
        }
    }

    @Override // o.d
    public final boolean b() {
        return true;
    }

    @Override // o.d
    public final String toString() {
        String str = "[Barrier] " + this.f3302W + " {";
        for (int i2 = 0; i2 < this.f3354e0; i2++) {
            d dVar = this.f3353d0[i2];
            if (i2 > 0) {
                str = Q.d(str, ", ");
            }
            str = str + dVar.f3302W;
        }
        return Q.d(str, "}");
    }
}
