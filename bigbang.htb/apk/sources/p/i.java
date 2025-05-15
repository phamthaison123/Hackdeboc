package p;

import java.util.Iterator;
import o.C0207a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i extends m {
    @Override // p.InterfaceC0211d
    public final void a(InterfaceC0211d interfaceC0211d) {
        C0207a c0207a = (C0207a) this.f3476b;
        int i2 = c0207a.f3253f0;
        f fVar = this.f3482h;
        Iterator it = fVar.f3468l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((f) it.next()).f3463g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            fVar.d(i4 + c0207a.f3255h0);
        } else {
            fVar.d(i3 + c0207a.f3255h0);
        }
    }

    @Override // p.m
    public final void d() {
        o.d dVar = this.f3476b;
        if (dVar instanceof C0207a) {
            f fVar = this.f3482h;
            fVar.f3458b = true;
            C0207a c0207a = (C0207a) dVar;
            int i2 = c0207a.f3253f0;
            boolean z2 = c0207a.f3254g0;
            int i3 = 0;
            if (i2 == 0) {
                fVar.f3461e = 4;
                while (i3 < c0207a.f3354e0) {
                    o.d dVar2 = c0207a.f3353d0[i3];
                    if (z2 || dVar2.f3301V != 8) {
                        f fVar2 = dVar2.f3312d.f3482h;
                        fVar2.f3467k.add(fVar);
                        fVar.f3468l.add(fVar2);
                    }
                    i3++;
                }
                m(this.f3476b.f3312d.f3482h);
                m(this.f3476b.f3312d.f3483i);
                return;
            }
            if (i2 == 1) {
                fVar.f3461e = 5;
                while (i3 < c0207a.f3354e0) {
                    o.d dVar3 = c0207a.f3353d0[i3];
                    if (z2 || dVar3.f3301V != 8) {
                        f fVar3 = dVar3.f3312d.f3483i;
                        fVar3.f3467k.add(fVar);
                        fVar.f3468l.add(fVar3);
                    }
                    i3++;
                }
                m(this.f3476b.f3312d.f3482h);
                m(this.f3476b.f3312d.f3483i);
                return;
            }
            if (i2 == 2) {
                fVar.f3461e = 6;
                while (i3 < c0207a.f3354e0) {
                    o.d dVar4 = c0207a.f3353d0[i3];
                    if (z2 || dVar4.f3301V != 8) {
                        f fVar4 = dVar4.f3313e.f3482h;
                        fVar4.f3467k.add(fVar);
                        fVar.f3468l.add(fVar4);
                    }
                    i3++;
                }
                m(this.f3476b.f3313e.f3482h);
                m(this.f3476b.f3313e.f3483i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            fVar.f3461e = 7;
            while (i3 < c0207a.f3354e0) {
                o.d dVar5 = c0207a.f3353d0[i3];
                if (z2 || dVar5.f3301V != 8) {
                    f fVar5 = dVar5.f3313e.f3483i;
                    fVar5.f3467k.add(fVar);
                    fVar.f3468l.add(fVar5);
                }
                i3++;
            }
            m(this.f3476b.f3313e.f3482h);
            m(this.f3476b.f3313e.f3483i);
        }
    }

    @Override // p.m
    public final void e() {
        o.d dVar = this.f3476b;
        if (dVar instanceof C0207a) {
            int i2 = ((C0207a) dVar).f3253f0;
            f fVar = this.f3482h;
            if (i2 == 0 || i2 == 1) {
                dVar.f3293N = fVar.f3463g;
            } else {
                dVar.f3294O = fVar.f3463g;
            }
        }
    }

    @Override // p.m
    public final void f() {
        this.f3477c = null;
        this.f3482h.c();
    }

    @Override // p.m
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f3482h;
        fVar2.f3467k.add(fVar);
        fVar.f3468l.add(fVar2);
    }
}
