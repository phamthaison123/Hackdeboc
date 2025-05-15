package p;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h extends m {
    @Override // p.InterfaceC0211d
    public final void a(InterfaceC0211d interfaceC0211d) {
        f fVar = this.f3482h;
        if (fVar.f3459c && !fVar.f3466j) {
            fVar.d((int) ((((f) fVar.f3468l.get(0)).f3463g * ((o.f) this.f3476b).f3348d0) + 0.5f));
        }
    }

    @Override // p.m
    public final void d() {
        o.d dVar = this.f3476b;
        o.f fVar = (o.f) dVar;
        int i2 = fVar.f3349e0;
        int i3 = fVar.f3350f0;
        int i4 = fVar.f3352h0;
        f fVar2 = this.f3482h;
        if (i4 == 1) {
            if (i2 != -1) {
                fVar2.f3468l.add(dVar.f3288I.f3312d.f3482h);
                this.f3476b.f3288I.f3312d.f3482h.f3467k.add(fVar2);
                fVar2.f3462f = i2;
            } else if (i3 != -1) {
                fVar2.f3468l.add(dVar.f3288I.f3312d.f3483i);
                this.f3476b.f3288I.f3312d.f3483i.f3467k.add(fVar2);
                fVar2.f3462f = -i3;
            } else {
                fVar2.f3458b = true;
                fVar2.f3468l.add(dVar.f3288I.f3312d.f3483i);
                this.f3476b.f3288I.f3312d.f3483i.f3467k.add(fVar2);
            }
            m(this.f3476b.f3312d.f3482h);
            m(this.f3476b.f3312d.f3483i);
            return;
        }
        if (i2 != -1) {
            fVar2.f3468l.add(dVar.f3288I.f3313e.f3482h);
            this.f3476b.f3288I.f3313e.f3482h.f3467k.add(fVar2);
            fVar2.f3462f = i2;
        } else if (i3 != -1) {
            fVar2.f3468l.add(dVar.f3288I.f3313e.f3483i);
            this.f3476b.f3288I.f3313e.f3483i.f3467k.add(fVar2);
            fVar2.f3462f = -i3;
        } else {
            fVar2.f3458b = true;
            fVar2.f3468l.add(dVar.f3288I.f3313e.f3483i);
            this.f3476b.f3288I.f3313e.f3483i.f3467k.add(fVar2);
        }
        m(this.f3476b.f3313e.f3482h);
        m(this.f3476b.f3313e.f3483i);
    }

    @Override // p.m
    public final void e() {
        o.d dVar = this.f3476b;
        int i2 = ((o.f) dVar).f3352h0;
        f fVar = this.f3482h;
        if (i2 == 1) {
            dVar.f3293N = fVar.f3463g;
        } else {
            dVar.f3294O = fVar.f3463g;
        }
    }

    @Override // p.m
    public final void f() {
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
