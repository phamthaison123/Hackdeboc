package p;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j extends m {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3470k = new int[2];

    public static void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // p.InterfaceC0211d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(p.InterfaceC0211d r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j.a(p.d):void");
    }

    @Override // p.m
    public final void d() {
        o.d dVar;
        o.d dVar2;
        o.d dVar3;
        o.d dVar4;
        o.d dVar5 = this.f3476b;
        boolean z2 = dVar5.f3306a;
        g gVar = this.f3479e;
        if (z2) {
            gVar.d(dVar5.j());
        }
        boolean z3 = gVar.f3466j;
        f fVar = this.f3483i;
        f fVar2 = this.f3482h;
        if (!z3) {
            o.d dVar6 = this.f3476b;
            int i2 = dVar6.f3311c0[0];
            this.f3478d = i2;
            if (i2 != 3) {
                if (i2 == 4 && (((dVar4 = dVar6.f3288I) != null && dVar4.f3311c0[0] == 1) || dVar4.f3311c0[0] == 4)) {
                    int j2 = (dVar4.j() - this.f3476b.f3332x.b()) - this.f3476b.f3334z.b();
                    j jVar = dVar4.f3312d;
                    m.b(fVar2, jVar.f3482h, this.f3476b.f3332x.b());
                    m.b(fVar, jVar.f3483i, -this.f3476b.f3334z.b());
                    gVar.d(j2);
                    return;
                }
                if (i2 == 1) {
                    gVar.d(dVar6.j());
                }
            }
        } else if (this.f3478d == 4 && (((dVar2 = (dVar = this.f3476b).f3288I) != null && dVar2.f3311c0[0] == 1) || dVar2.f3311c0[0] == 4)) {
            m.b(fVar2, dVar2.f3312d.f3482h, dVar.f3332x.b());
            m.b(fVar, dVar2.f3312d.f3483i, -this.f3476b.f3334z.b());
            return;
        }
        if (gVar.f3466j) {
            o.d dVar7 = this.f3476b;
            if (dVar7.f3306a) {
                o.c[] cVarArr = dVar7.f3285F;
                o.c cVar = cVarArr[0];
                o.c cVar2 = cVar.f3276d;
                if (cVar2 != null && cVarArr[1].f3276d != null) {
                    if (dVar7.o()) {
                        fVar2.f3462f = this.f3476b.f3285F[0].b();
                        fVar.f3462f = -this.f3476b.f3285F[1].b();
                        return;
                    }
                    f h2 = m.h(this.f3476b.f3285F[0]);
                    if (h2 != null) {
                        m.b(fVar2, h2, this.f3476b.f3285F[0].b());
                    }
                    f h3 = m.h(this.f3476b.f3285F[1]);
                    if (h3 != null) {
                        m.b(fVar, h3, -this.f3476b.f3285F[1].b());
                    }
                    fVar2.f3458b = true;
                    fVar.f3458b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h4 = m.h(cVar);
                    if (h4 != null) {
                        m.b(fVar2, h4, this.f3476b.f3285F[0].b());
                        m.b(fVar, fVar2, gVar.f3463g);
                        return;
                    }
                    return;
                }
                o.c cVar3 = cVarArr[1];
                if (cVar3.f3276d != null) {
                    f h5 = m.h(cVar3);
                    if (h5 != null) {
                        m.b(fVar, h5, -this.f3476b.f3285F[1].b());
                        m.b(fVar2, fVar, -gVar.f3463g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof o.g) || dVar7.f3288I == null || dVar7.e(7).f3276d != null) {
                    return;
                }
                o.d dVar8 = this.f3476b;
                m.b(fVar2, dVar8.f3288I.f3312d.f3482h, dVar8.k());
                m.b(fVar, fVar2, gVar.f3463g);
                return;
            }
        }
        if (this.f3478d == 3) {
            o.d dVar9 = this.f3476b;
            int i3 = dVar9.f3318j;
            if (i3 == 2) {
                o.d dVar10 = dVar9.f3288I;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f3313e.f3479e;
                    gVar.f3468l.add(gVar2);
                    gVar2.f3467k.add(gVar);
                    gVar.f3458b = true;
                    gVar.f3467k.add(fVar2);
                    gVar.f3467k.add(fVar);
                }
            } else if (i3 == 3) {
                if (dVar9.f3319k == 3) {
                    fVar2.f3457a = this;
                    fVar.f3457a = this;
                    l lVar = dVar9.f3313e;
                    lVar.f3482h.f3457a = this;
                    lVar.f3483i.f3457a = this;
                    gVar.f3457a = this;
                    if (dVar9.p()) {
                        gVar.f3468l.add(this.f3476b.f3313e.f3479e);
                        this.f3476b.f3313e.f3479e.f3467k.add(gVar);
                        l lVar2 = this.f3476b.f3313e;
                        lVar2.f3479e.f3457a = this;
                        gVar.f3468l.add(lVar2.f3482h);
                        gVar.f3468l.add(this.f3476b.f3313e.f3483i);
                        this.f3476b.f3313e.f3482h.f3467k.add(gVar);
                        this.f3476b.f3313e.f3483i.f3467k.add(gVar);
                    } else if (this.f3476b.o()) {
                        this.f3476b.f3313e.f3479e.f3468l.add(gVar);
                        gVar.f3467k.add(this.f3476b.f3313e.f3479e);
                    } else {
                        this.f3476b.f3313e.f3479e.f3468l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f3313e.f3479e;
                    gVar.f3468l.add(gVar3);
                    gVar3.f3467k.add(gVar);
                    this.f3476b.f3313e.f3482h.f3467k.add(gVar);
                    this.f3476b.f3313e.f3483i.f3467k.add(gVar);
                    gVar.f3458b = true;
                    gVar.f3467k.add(fVar2);
                    gVar.f3467k.add(fVar);
                    fVar2.f3468l.add(gVar);
                    fVar.f3468l.add(gVar);
                }
            }
        }
        o.d dVar11 = this.f3476b;
        o.c[] cVarArr2 = dVar11.f3285F;
        o.c cVar4 = cVarArr2[0];
        o.c cVar5 = cVar4.f3276d;
        if (cVar5 != null && cVarArr2[1].f3276d != null) {
            if (dVar11.o()) {
                fVar2.f3462f = this.f3476b.f3285F[0].b();
                fVar.f3462f = -this.f3476b.f3285F[1].b();
                return;
            }
            f h6 = m.h(this.f3476b.f3285F[0]);
            f h7 = m.h(this.f3476b.f3285F[1]);
            h6.b(this);
            h7.b(this);
            this.f3484j = 4;
            return;
        }
        if (cVar5 != null) {
            f h8 = m.h(cVar4);
            if (h8 != null) {
                m.b(fVar2, h8, this.f3476b.f3285F[0].b());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        o.c cVar6 = cVarArr2[1];
        if (cVar6.f3276d != null) {
            f h9 = m.h(cVar6);
            if (h9 != null) {
                m.b(fVar, h9, -this.f3476b.f3285F[1].b());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof o.g) || (dVar3 = dVar11.f3288I) == null) {
            return;
        }
        m.b(fVar2, dVar3.f3312d.f3482h, dVar11.k());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // p.m
    public final void e() {
        f fVar = this.f3482h;
        if (fVar.f3466j) {
            this.f3476b.f3293N = fVar.f3463g;
        }
    }

    @Override // p.m
    public final void f() {
        this.f3477c = null;
        this.f3482h.c();
        this.f3483i.c();
        this.f3479e.c();
        this.f3481g = false;
    }

    @Override // p.m
    public final boolean k() {
        return this.f3478d != 3 || this.f3476b.f3318j == 0;
    }

    public final void n() {
        this.f3481g = false;
        f fVar = this.f3482h;
        fVar.c();
        fVar.f3466j = false;
        f fVar2 = this.f3483i;
        fVar2.c();
        fVar2.f3466j = false;
        this.f3479e.f3466j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3476b.f3302W;
    }
}
