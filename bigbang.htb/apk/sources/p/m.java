package p;

import n.AbstractC0204j;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class m implements InterfaceC0211d {

    /* renamed from: a, reason: collision with root package name */
    public int f3475a;

    /* renamed from: b, reason: collision with root package name */
    public o.d f3476b;

    /* renamed from: c, reason: collision with root package name */
    public k f3477c;

    /* renamed from: d, reason: collision with root package name */
    public int f3478d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3479e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f3480f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3481g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f3482h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f3483i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f3484j = 1;

    public m(o.d dVar) {
        this.f3476b = dVar;
    }

    public static void b(f fVar, f fVar2, int i2) {
        fVar.f3468l.add(fVar2);
        fVar.f3462f = i2;
        fVar2.f3467k.add(fVar);
    }

    public static f h(o.c cVar) {
        o.c cVar2 = cVar.f3276d;
        if (cVar2 == null) {
            return null;
        }
        int a2 = AbstractC0204j.a(cVar2.f3275c);
        o.d dVar = cVar2.f3274b;
        if (a2 == 1) {
            return dVar.f3312d.f3482h;
        }
        if (a2 == 2) {
            return dVar.f3313e.f3482h;
        }
        if (a2 == 3) {
            return dVar.f3312d.f3483i;
        }
        if (a2 == 4) {
            return dVar.f3313e.f3483i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.f3313e.f3473k;
    }

    public static f i(o.c cVar, int i2) {
        o.c cVar2 = cVar.f3276d;
        if (cVar2 == null) {
            return null;
        }
        o.d dVar = cVar2.f3274b;
        m mVar = i2 == 0 ? dVar.f3312d : dVar.f3313e;
        int a2 = AbstractC0204j.a(cVar2.f3275c);
        if (a2 == 1 || a2 == 2) {
            return mVar.f3482h;
        }
        if (a2 == 3 || a2 == 4) {
            return mVar.f3483i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f3468l.add(fVar2);
        fVar.f3468l.add(this.f3479e);
        fVar.f3464h = i2;
        fVar.f3465i = gVar;
        fVar2.f3467k.add(fVar);
        gVar.f3467k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int max;
        if (i3 == 0) {
            o.d dVar = this.f3476b;
            int i4 = dVar.f3322n;
            max = Math.max(dVar.f3321m, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max == i2) {
                return i2;
            }
        } else {
            o.d dVar2 = this.f3476b;
            int i5 = dVar2.f3325q;
            max = Math.max(dVar2.f3324p, i2);
            if (i5 > 0) {
                max = Math.min(i5, i2);
            }
            if (max == i2) {
                return i2;
            }
        }
        return max;
    }

    public long j() {
        if (this.f3479e.f3466j) {
            return r2.f3463g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(o.c cVar, o.c cVar2, int i2) {
        f h2 = h(cVar);
        f h3 = h(cVar2);
        if (h2.f3466j && h3.f3466j) {
            int b2 = cVar.b() + h2.f3463g;
            int b3 = h3.f3463g - cVar2.b();
            int i3 = b3 - b2;
            g gVar = this.f3479e;
            if (!gVar.f3466j && this.f3478d == 3) {
                int i4 = this.f3475a;
                if (i4 == 0) {
                    gVar.d(g(i3, i2));
                } else if (i4 == 1) {
                    gVar.d(Math.min(g(gVar.f3469m, i2), i3));
                } else if (i4 == 2) {
                    o.d dVar = this.f3476b;
                    o.d dVar2 = dVar.f3288I;
                    if (dVar2 != null) {
                        if ((i2 == 0 ? dVar2.f3312d : dVar2.f3313e).f3479e.f3466j) {
                            gVar.d(g((int) ((r6.f3463g * (i2 == 0 ? dVar.f3323o : dVar.f3326r)) + 0.5f), i2));
                        }
                    }
                } else if (i4 == 3) {
                    o.d dVar3 = this.f3476b;
                    m mVar = dVar3.f3312d;
                    int i5 = mVar.f3478d;
                    m mVar2 = dVar3.f3313e;
                    if (i5 != 3 || mVar.f3475a != 3 || mVar2.f3478d != 3 || mVar2.f3475a != 3) {
                        if (i2 == 0) {
                            mVar = mVar2;
                        }
                        if (mVar.f3479e.f3466j) {
                            float f2 = dVar3.f3291L;
                            gVar.d(i2 == 1 ? (int) ((r6.f3463g / f2) + 0.5f) : (int) ((f2 * r6.f3463g) + 0.5f));
                        }
                    }
                }
            }
            if (gVar.f3466j) {
                int i6 = gVar.f3463g;
                f fVar = this.f3483i;
                f fVar2 = this.f3482h;
                if (i6 == i3) {
                    fVar2.d(b2);
                    fVar.d(b3);
                    return;
                }
                o.d dVar4 = this.f3476b;
                float f3 = i2 == 0 ? dVar4.f3298S : dVar4.f3299T;
                if (h2 == h3) {
                    b2 = h2.f3463g;
                    b3 = h3.f3463g;
                    f3 = 0.5f;
                }
                fVar2.d((int) ((((b3 - b2) - i6) * f3) + b2 + 0.5f));
                fVar.d(fVar2.f3463g + gVar.f3463g);
            }
        }
    }
}
