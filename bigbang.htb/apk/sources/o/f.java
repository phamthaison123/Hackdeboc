package o;

import F.Q;
import java.util.ArrayList;
import n.AbstractC0204j;
import n.C0197c;
import n.C0199e;
import n.C0205k;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f extends d {

    /* renamed from: d0, reason: collision with root package name */
    public float f3348d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f3349e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f3350f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public c f3351g0 = this.f3333y;

    /* renamed from: h0, reason: collision with root package name */
    public int f3352h0 = 0;

    public f() {
        this.f3286G.clear();
        this.f3286G.add(this.f3351g0);
        int length = this.f3285F.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f3285F[i2] = this.f3351g0;
        }
    }

    @Override // o.d
    public final void a(C0199e c0199e) {
        e eVar = (e) this.f3288I;
        if (eVar == null) {
            return;
        }
        c e2 = eVar.e(2);
        c e3 = eVar.e(4);
        d dVar = this.f3288I;
        boolean z2 = dVar != null && dVar.f3311c0[0] == 2;
        if (this.f3352h0 == 0) {
            e2 = eVar.e(3);
            e3 = eVar.e(5);
            d dVar2 = this.f3288I;
            z2 = dVar2 != null && dVar2.f3311c0[1] == 2;
        }
        if (this.f3349e0 != -1) {
            C0205k j2 = c0199e.j(this.f3351g0);
            c0199e.e(j2, c0199e.j(e2), this.f3349e0, 8);
            if (z2) {
                c0199e.f(c0199e.j(e3), j2, 0, 5);
                return;
            }
            return;
        }
        if (this.f3350f0 != -1) {
            C0205k j3 = c0199e.j(this.f3351g0);
            C0205k j4 = c0199e.j(e3);
            c0199e.e(j3, j4, -this.f3350f0, 8);
            if (z2) {
                c0199e.f(j3, c0199e.j(e2), 0, 5);
                c0199e.f(j4, j3, 0, 5);
                return;
            }
            return;
        }
        if (this.f3348d0 != -1.0f) {
            C0205k j5 = c0199e.j(this.f3351g0);
            C0205k j6 = c0199e.j(e3);
            float f2 = this.f3348d0;
            C0197c k2 = c0199e.k();
            k2.f3192d.e(j5, -1.0f);
            k2.f3192d.e(j6, f2);
            c0199e.c(k2);
        }
    }

    @Override // o.d
    public final boolean b() {
        return true;
    }

    @Override // o.d
    public final c e(int i2) {
        switch (AbstractC0204j.a(i2)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f3352h0 == 1) {
                    return this.f3351g0;
                }
                break;
            case 2:
            case 4:
                if (this.f3352h0 == 0) {
                    return this.f3351g0;
                }
                break;
        }
        throw new AssertionError(Q.j(i2));
    }

    @Override // o.d
    public final void x(C0199e c0199e) {
        if (this.f3288I == null) {
            return;
        }
        c cVar = this.f3351g0;
        c0199e.getClass();
        int m2 = C0199e.m(cVar);
        if (this.f3352h0 == 1) {
            this.f3293N = m2;
            this.f3294O = 0;
            s(this.f3288I.g());
            v(0);
            return;
        }
        this.f3293N = 0;
        this.f3294O = m2;
        v(this.f3288I.j());
        s(0);
    }

    public final void y(int i2) {
        if (this.f3352h0 == i2) {
            return;
        }
        this.f3352h0 = i2;
        ArrayList arrayList = this.f3286G;
        arrayList.clear();
        if (this.f3352h0 == 1) {
            this.f3351g0 = this.f3332x;
        } else {
            this.f3351g0 = this.f3333y;
        }
        arrayList.add(this.f3351g0);
        c[] cVarArr = this.f3285F;
        int length = cVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            cVarArr[i3] = this.f3351g0;
        }
    }
}
