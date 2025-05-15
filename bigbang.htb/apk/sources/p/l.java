package p;

import n.AbstractC0204j;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public f f3473k;

    /* renamed from: l, reason: collision with root package name */
    public C0208a f3474l;

    @Override // p.InterfaceC0211d
    public final void a(InterfaceC0211d interfaceC0211d) {
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC0204j.a(this.f3484j) == 3) {
            o.d dVar = this.f3476b;
            l(dVar.f3333y, dVar.f3280A, 1);
            return;
        }
        g gVar = this.f3479e;
        if (gVar.f3459c && !gVar.f3466j && this.f3478d == 3) {
            o.d dVar2 = this.f3476b;
            int i3 = dVar2.f3319k;
            if (i3 == 2) {
                o.d dVar3 = dVar2.f3288I;
                if (dVar3 != null) {
                    if (dVar3.f3313e.f3479e.f3466j) {
                        gVar.d((int) ((r5.f3463g * dVar2.f3326r) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                g gVar2 = dVar2.f3312d.f3479e;
                if (gVar2.f3466j) {
                    int i4 = dVar2.f3292M;
                    if (i4 == -1) {
                        f2 = gVar2.f3463g;
                        f3 = dVar2.f3291L;
                    } else if (i4 == 0) {
                        f4 = gVar2.f3463g * dVar2.f3291L;
                        i2 = (int) (f4 + 0.5f);
                        gVar.d(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        gVar.d(i2);
                    } else {
                        f2 = gVar2.f3463g;
                        f3 = dVar2.f3291L;
                    }
                    f4 = f2 / f3;
                    i2 = (int) (f4 + 0.5f);
                    gVar.d(i2);
                }
            }
        }
        f fVar = this.f3482h;
        if (fVar.f3459c) {
            f fVar2 = this.f3483i;
            if (fVar2.f3459c) {
                if (fVar.f3466j && fVar2.f3466j && gVar.f3466j) {
                    return;
                }
                if (!gVar.f3466j && this.f3478d == 3) {
                    o.d dVar4 = this.f3476b;
                    if (dVar4.f3318j == 0 && !dVar4.p()) {
                        f fVar3 = (f) fVar.f3468l.get(0);
                        f fVar4 = (f) fVar2.f3468l.get(0);
                        int i5 = fVar3.f3463g + fVar.f3462f;
                        int i6 = fVar4.f3463g + fVar2.f3462f;
                        fVar.d(i5);
                        fVar2.d(i6);
                        gVar.d(i6 - i5);
                        return;
                    }
                }
                if (!gVar.f3466j && this.f3478d == 3 && this.f3475a == 1 && fVar.f3468l.size() > 0 && fVar2.f3468l.size() > 0) {
                    f fVar5 = (f) fVar.f3468l.get(0);
                    int i7 = (((f) fVar2.f3468l.get(0)).f3463g + fVar2.f3462f) - (fVar5.f3463g + fVar.f3462f);
                    int i8 = gVar.f3469m;
                    if (i7 < i8) {
                        gVar.d(i7);
                    } else {
                        gVar.d(i8);
                    }
                }
                if (gVar.f3466j && fVar.f3468l.size() > 0 && fVar2.f3468l.size() > 0) {
                    f fVar6 = (f) fVar.f3468l.get(0);
                    f fVar7 = (f) fVar2.f3468l.get(0);
                    int i9 = fVar6.f3463g;
                    int i10 = fVar.f3462f + i9;
                    int i11 = fVar7.f3463g;
                    int i12 = fVar2.f3462f + i11;
                    float f5 = this.f3476b.f3299T;
                    if (fVar6 == fVar7) {
                        f5 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    fVar.d((int) ((((i11 - i9) - gVar.f3463g) * f5) + i9 + 0.5f));
                    fVar2.d(fVar.f3463g + gVar.f3463g);
                }
            }
        }
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
            gVar.d(dVar5.g());
        }
        boolean z3 = gVar.f3466j;
        f fVar = this.f3483i;
        f fVar2 = this.f3482h;
        if (!z3) {
            o.d dVar6 = this.f3476b;
            this.f3478d = dVar6.f3311c0[1];
            if (dVar6.f3331w) {
                this.f3474l = new C0208a(this);
            }
            int i2 = this.f3478d;
            if (i2 != 3) {
                if (i2 == 4 && (dVar4 = this.f3476b.f3288I) != null && dVar4.f3311c0[1] == 1) {
                    int g2 = (dVar4.g() - this.f3476b.f3333y.b()) - this.f3476b.f3280A.b();
                    l lVar = dVar4.f3313e;
                    m.b(fVar2, lVar.f3482h, this.f3476b.f3333y.b());
                    m.b(fVar, lVar.f3483i, -this.f3476b.f3280A.b());
                    gVar.d(g2);
                    return;
                }
                if (i2 == 1) {
                    gVar.d(this.f3476b.g());
                }
            }
        } else if (this.f3478d == 4 && (dVar2 = (dVar = this.f3476b).f3288I) != null && dVar2.f3311c0[1] == 1) {
            l lVar2 = dVar2.f3313e;
            m.b(fVar2, lVar2.f3482h, dVar.f3333y.b());
            m.b(fVar, lVar2.f3483i, -this.f3476b.f3280A.b());
            return;
        }
        boolean z4 = gVar.f3466j;
        f fVar3 = this.f3473k;
        if (z4) {
            o.d dVar7 = this.f3476b;
            if (dVar7.f3306a) {
                o.c[] cVarArr = dVar7.f3285F;
                o.c cVar = cVarArr[2];
                o.c cVar2 = cVar.f3276d;
                if (cVar2 != null && cVarArr[3].f3276d != null) {
                    if (dVar7.p()) {
                        fVar2.f3462f = this.f3476b.f3285F[2].b();
                        fVar.f3462f = -this.f3476b.f3285F[3].b();
                    } else {
                        f h2 = m.h(this.f3476b.f3285F[2]);
                        if (h2 != null) {
                            m.b(fVar2, h2, this.f3476b.f3285F[2].b());
                        }
                        f h3 = m.h(this.f3476b.f3285F[3]);
                        if (h3 != null) {
                            m.b(fVar, h3, -this.f3476b.f3285F[3].b());
                        }
                        fVar2.f3458b = true;
                        fVar.f3458b = true;
                    }
                    o.d dVar8 = this.f3476b;
                    if (dVar8.f3331w) {
                        m.b(fVar3, fVar2, dVar8.f3295P);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h4 = m.h(cVar);
                    if (h4 != null) {
                        m.b(fVar2, h4, this.f3476b.f3285F[2].b());
                        m.b(fVar, fVar2, gVar.f3463g);
                        o.d dVar9 = this.f3476b;
                        if (dVar9.f3331w) {
                            m.b(fVar3, fVar2, dVar9.f3295P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o.c cVar3 = cVarArr[3];
                if (cVar3.f3276d != null) {
                    f h5 = m.h(cVar3);
                    if (h5 != null) {
                        m.b(fVar, h5, -this.f3476b.f3285F[3].b());
                        m.b(fVar2, fVar, -gVar.f3463g);
                    }
                    o.d dVar10 = this.f3476b;
                    if (dVar10.f3331w) {
                        m.b(fVar3, fVar2, dVar10.f3295P);
                        return;
                    }
                    return;
                }
                o.c cVar4 = cVarArr[4];
                if (cVar4.f3276d != null) {
                    f h6 = m.h(cVar4);
                    if (h6 != null) {
                        m.b(fVar3, h6, 0);
                        m.b(fVar2, fVar3, -this.f3476b.f3295P);
                        m.b(fVar, fVar2, gVar.f3463g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof o.g) || dVar7.f3288I == null || dVar7.e(7).f3276d != null) {
                    return;
                }
                o.d dVar11 = this.f3476b;
                m.b(fVar2, dVar11.f3288I.f3313e.f3482h, dVar11.l());
                m.b(fVar, fVar2, gVar.f3463g);
                o.d dVar12 = this.f3476b;
                if (dVar12.f3331w) {
                    m.b(fVar3, fVar2, dVar12.f3295P);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f3478d != 3) {
            gVar.b(this);
        } else {
            o.d dVar13 = this.f3476b;
            int i3 = dVar13.f3319k;
            if (i3 == 2) {
                o.d dVar14 = dVar13.f3288I;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f3313e.f3479e;
                    gVar.f3468l.add(gVar2);
                    gVar2.f3467k.add(gVar);
                    gVar.f3458b = true;
                    gVar.f3467k.add(fVar2);
                    gVar.f3467k.add(fVar);
                }
            } else if (i3 == 3 && !dVar13.p()) {
                o.d dVar15 = this.f3476b;
                if (dVar15.f3318j != 3) {
                    g gVar3 = dVar15.f3312d.f3479e;
                    gVar.f3468l.add(gVar3);
                    gVar3.f3467k.add(gVar);
                    gVar.f3458b = true;
                    gVar.f3467k.add(fVar2);
                    gVar.f3467k.add(fVar);
                }
            }
        }
        o.d dVar16 = this.f3476b;
        o.c[] cVarArr2 = dVar16.f3285F;
        o.c cVar5 = cVarArr2[2];
        o.c cVar6 = cVar5.f3276d;
        if (cVar6 != null && cVarArr2[3].f3276d != null) {
            if (dVar16.p()) {
                fVar2.f3462f = this.f3476b.f3285F[2].b();
                fVar.f3462f = -this.f3476b.f3285F[3].b();
            } else {
                f h7 = m.h(this.f3476b.f3285F[2]);
                f h8 = m.h(this.f3476b.f3285F[3]);
                h7.b(this);
                h8.b(this);
                this.f3484j = 4;
            }
            if (this.f3476b.f3331w) {
                c(fVar3, fVar2, 1, this.f3474l);
            }
        } else if (cVar6 != null) {
            f h9 = m.h(cVar5);
            if (h9 != null) {
                m.b(fVar2, h9, this.f3476b.f3285F[2].b());
                c(fVar, fVar2, 1, gVar);
                if (this.f3476b.f3331w) {
                    c(fVar3, fVar2, 1, this.f3474l);
                }
                if (this.f3478d == 3) {
                    o.d dVar17 = this.f3476b;
                    if (dVar17.f3291L > 0.0f) {
                        j jVar = dVar17.f3312d;
                        if (jVar.f3478d == 3) {
                            jVar.f3479e.f3467k.add(gVar);
                            gVar.f3468l.add(this.f3476b.f3312d.f3479e);
                            gVar.f3457a = this;
                        }
                    }
                }
            }
        } else {
            o.c cVar7 = cVarArr2[3];
            if (cVar7.f3276d != null) {
                f h10 = m.h(cVar7);
                if (h10 != null) {
                    m.b(fVar, h10, -this.f3476b.f3285F[3].b());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f3476b.f3331w) {
                        c(fVar3, fVar2, 1, this.f3474l);
                    }
                }
            } else {
                o.c cVar8 = cVarArr2[4];
                if (cVar8.f3276d != null) {
                    f h11 = m.h(cVar8);
                    if (h11 != null) {
                        m.b(fVar3, h11, 0);
                        c(fVar2, fVar3, -1, this.f3474l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof o.g) && (dVar3 = dVar16.f3288I) != null) {
                    m.b(fVar2, dVar3.f3313e.f3482h, dVar16.l());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f3476b.f3331w) {
                        c(fVar3, fVar2, 1, this.f3474l);
                    }
                    if (this.f3478d == 3) {
                        o.d dVar18 = this.f3476b;
                        if (dVar18.f3291L > 0.0f) {
                            j jVar2 = dVar18.f3312d;
                            if (jVar2.f3478d == 3) {
                                jVar2.f3479e.f3467k.add(gVar);
                                gVar.f3468l.add(this.f3476b.f3312d.f3479e);
                                gVar.f3457a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f3468l.size() == 0) {
            gVar.f3459c = true;
        }
    }

    @Override // p.m
    public final void e() {
        f fVar = this.f3482h;
        if (fVar.f3466j) {
            this.f3476b.f3294O = fVar.f3463g;
        }
    }

    @Override // p.m
    public final void f() {
        this.f3477c = null;
        this.f3482h.c();
        this.f3483i.c();
        this.f3473k.c();
        this.f3479e.c();
        this.f3481g = false;
    }

    @Override // p.m
    public final boolean k() {
        return this.f3478d != 3 || this.f3476b.f3319k == 0;
    }

    public final void m() {
        this.f3481g = false;
        f fVar = this.f3482h;
        fVar.c();
        fVar.f3466j = false;
        f fVar2 = this.f3483i;
        fVar2.c();
        fVar2.f3466j = false;
        f fVar3 = this.f3473k;
        fVar3.c();
        fVar3.f3466j = false;
        this.f3479e.f3466j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3476b.f3302W;
    }
}
