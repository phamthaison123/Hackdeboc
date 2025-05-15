package n;

import g.C0107g;
import java.util.Arrays;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0199e {

    /* renamed from: o, reason: collision with root package name */
    public static int f3194o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3195p = true;

    /* renamed from: b, reason: collision with root package name */
    public final C0203i f3197b;

    /* renamed from: e, reason: collision with root package name */
    public C0197c[] f3200e;

    /* renamed from: k, reason: collision with root package name */
    public final C0107g f3206k;

    /* renamed from: n, reason: collision with root package name */
    public C0197c f3209n;

    /* renamed from: a, reason: collision with root package name */
    public int f3196a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3198c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f3199d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3201f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f3202g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f3203h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f3204i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f3205j = 32;

    /* renamed from: l, reason: collision with root package name */
    public C0205k[] f3207l = new C0205k[f3194o];

    /* renamed from: m, reason: collision with root package name */
    public int f3208m = 0;

    public C0199e() {
        this.f3200e = null;
        this.f3200e = new C0197c[32];
        q();
        C0107g c0107g = new C0107g(1);
        this.f3206k = c0107g;
        C0203i c0203i = new C0203i(c0107g);
        c0203i.f3217f = new C0205k[128];
        c0203i.f3218g = new C0205k[128];
        c0203i.f3219h = 0;
        c0203i.f3220i = new C0202h(c0203i);
        this.f3197b = c0203i;
        if (f3195p) {
            this.f3209n = new C0198d(c0107g);
        } else {
            this.f3209n = new C0197c(c0107g);
        }
    }

    public static int m(o.c cVar) {
        C0205k c0205k = cVar.f3279g;
        if (c0205k != null) {
            return (int) (c0205k.f3225e + 0.5f);
        }
        return 0;
    }

    public final C0205k a(int i2) {
        C0205k c0205k = (C0205k) ((C0200f) this.f3206k.f2294c).a();
        if (c0205k == null) {
            c0205k = new C0205k(i2);
            c0205k.f3232l = i2;
        } else {
            c0205k.c();
            c0205k.f3232l = i2;
        }
        int i3 = this.f3208m;
        int i4 = f3194o;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f3194o = i5;
            this.f3207l = (C0205k[]) Arrays.copyOf(this.f3207l, i5);
        }
        C0205k[] c0205kArr = this.f3207l;
        int i6 = this.f3208m;
        this.f3208m = i6 + 1;
        c0205kArr[i6] = c0205k;
        return c0205k;
    }

    public final void b(C0205k c0205k, C0205k c0205k2, int i2, float f2, C0205k c0205k3, C0205k c0205k4, int i3, int i4) {
        C0197c k2 = k();
        if (c0205k2 == c0205k3) {
            k2.f3192d.e(c0205k, 1.0f);
            k2.f3192d.e(c0205k4, 1.0f);
            k2.f3192d.e(c0205k2, -2.0f);
        } else if (f2 == 0.5f) {
            k2.f3192d.e(c0205k, 1.0f);
            k2.f3192d.e(c0205k2, -1.0f);
            k2.f3192d.e(c0205k3, -1.0f);
            k2.f3192d.e(c0205k4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                k2.f3190b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            k2.f3192d.e(c0205k, -1.0f);
            k2.f3192d.e(c0205k2, 1.0f);
            k2.f3190b = i2;
        } else if (f2 >= 1.0f) {
            k2.f3192d.e(c0205k4, -1.0f);
            k2.f3192d.e(c0205k3, 1.0f);
            k2.f3190b = -i3;
        } else {
            float f3 = 1.0f - f2;
            k2.f3192d.e(c0205k, f3 * 1.0f);
            k2.f3192d.e(c0205k2, f3 * (-1.0f));
            k2.f3192d.e(c0205k3, (-1.0f) * f2);
            k2.f3192d.e(c0205k4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                k2.f3190b = (i3 * f2) + ((-i2) * f3);
            }
        }
        if (i4 != 8) {
            k2.a(this, i4);
        }
        c(k2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
    
        if (r5.f3231k <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bc, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c6, code lost:
    
        if (r5.f3231k <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00db, code lost:
    
        if (r5.f3231k <= 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00de, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e8, code lost:
    
        if (r5.f3231k <= 1) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(n.C0197c r17) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0199e.c(n.c):void");
    }

    public final void d(C0205k c0205k, int i2) {
        int i3 = c0205k.f3223c;
        if (i3 == -1) {
            c0205k.f3225e = i2;
            c0205k.f3226f = true;
            int i4 = c0205k.f3230j;
            for (int i5 = 0; i5 < i4; i5++) {
                c0205k.f3229i[i5].g(c0205k, false);
            }
            c0205k.f3230j = 0;
            return;
        }
        if (i3 == -1) {
            C0197c k2 = k();
            k2.f3189a = c0205k;
            float f2 = i2;
            c0205k.f3225e = f2;
            k2.f3190b = f2;
            k2.f3193e = true;
            c(k2);
            return;
        }
        C0197c c0197c = this.f3200e[i3];
        if (c0197c.f3193e) {
            c0197c.f3190b = i2;
            return;
        }
        if (c0197c.f3192d.k() == 0) {
            c0197c.f3193e = true;
            c0197c.f3190b = i2;
            return;
        }
        C0197c k3 = k();
        if (i2 < 0) {
            k3.f3190b = i2 * (-1);
            k3.f3192d.e(c0205k, 1.0f);
        } else {
            k3.f3190b = i2;
            k3.f3192d.e(c0205k, -1.0f);
        }
        c(k3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(n.C0205k r7, n.C0205k r8, int r9, int r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 8
            if (r10 != r2) goto L29
            boolean r3 = r8.f3226f
            if (r3 == 0) goto L29
            int r3 = r7.f3223c
            r4 = -1
            if (r3 != r4) goto L29
            float r6 = r8.f3225e
            float r8 = (float) r9
            float r6 = r6 + r8
            r7.f3225e = r6
            r7.f3226f = r1
            int r6 = r7.f3230j
            r8 = r0
        L1a:
            if (r8 >= r6) goto L26
            n.c[] r9 = r7.f3229i
            r9 = r9[r8]
            r9.g(r7, r0)
            int r8 = r8 + 1
            goto L1a
        L26:
            r7.f3230j = r0
            return
        L29:
            n.c r3 = r6.k()
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L49
            if (r9 >= 0) goto L38
            int r9 = r9 * (-1)
            r0 = r1
        L38:
            float r9 = (float) r9
            r3.f3190b = r9
            if (r0 != 0) goto L3e
            goto L49
        L3e:
            n.b r9 = r3.f3192d
            r9.e(r7, r4)
            n.b r7 = r3.f3192d
            r7.e(r8, r5)
            goto L53
        L49:
            n.b r9 = r3.f3192d
            r9.e(r7, r5)
            n.b r7 = r3.f3192d
            r7.e(r8, r4)
        L53:
            if (r10 == r2) goto L58
            r3.a(r6, r10)
        L58:
            r6.c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0199e.e(n.k, n.k, int, int):void");
    }

    public final void f(C0205k c0205k, C0205k c0205k2, int i2, int i3) {
        C0197c k2 = k();
        C0205k l2 = l();
        l2.f3224d = 0;
        k2.b(c0205k, c0205k2, l2, i2);
        if (i3 != 8) {
            k2.f3192d.e(i(i3), (int) (k2.f3192d.c(l2) * (-1.0f)));
        }
        c(k2);
    }

    public final void g(C0205k c0205k, C0205k c0205k2, int i2, int i3) {
        C0197c k2 = k();
        C0205k l2 = l();
        l2.f3224d = 0;
        k2.c(c0205k, c0205k2, l2, i2);
        if (i3 != 8) {
            k2.f3192d.e(i(i3), (int) (k2.f3192d.c(l2) * (-1.0f)));
        }
        c(k2);
    }

    public final void h(C0197c c0197c) {
        boolean z2 = f3195p;
        C0107g c0107g = this.f3206k;
        if (z2) {
            C0197c c0197c2 = this.f3200e[this.f3204i];
            if (c0197c2 != null) {
                ((C0200f) c0107g.f2292a).b(c0197c2);
            }
        } else {
            C0197c c0197c3 = this.f3200e[this.f3204i];
            if (c0197c3 != null) {
                ((C0200f) c0107g.f2293b).b(c0197c3);
            }
        }
        C0197c[] c0197cArr = this.f3200e;
        int i2 = this.f3204i;
        c0197cArr[i2] = c0197c;
        C0205k c0205k = c0197c.f3189a;
        c0205k.f3223c = i2;
        this.f3204i = i2 + 1;
        c0205k.d(c0197c);
    }

    public final C0205k i(int i2) {
        if (this.f3203h + 1 >= this.f3199d) {
            n();
        }
        C0205k a2 = a(4);
        int i3 = this.f3196a + 1;
        this.f3196a = i3;
        this.f3203h++;
        a2.f3222b = i3;
        a2.f3224d = i2;
        ((C0205k[]) this.f3206k.f2295d)[i3] = a2;
        C0203i c0203i = this.f3197b;
        c0203i.f3220i.f3215a = a2;
        float[] fArr = a2.f3228h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.f3224d] = 1.0f;
        c0203i.i(a2);
        return a2;
    }

    public final C0205k j(Object obj) {
        C0205k c0205k = null;
        if (obj == null) {
            return null;
        }
        if (this.f3203h + 1 >= this.f3199d) {
            n();
        }
        if (obj instanceof o.c) {
            o.c cVar = (o.c) obj;
            c0205k = cVar.f3279g;
            if (c0205k == null) {
                cVar.f();
                c0205k = cVar.f3279g;
            }
            int i2 = c0205k.f3222b;
            C0107g c0107g = this.f3206k;
            if (i2 == -1 || i2 > this.f3196a || ((C0205k[]) c0107g.f2295d)[i2] == null) {
                if (i2 != -1) {
                    c0205k.c();
                }
                int i3 = this.f3196a + 1;
                this.f3196a = i3;
                this.f3203h++;
                c0205k.f3222b = i3;
                c0205k.f3232l = 1;
                ((C0205k[]) c0107g.f2295d)[i3] = c0205k;
            }
        }
        return c0205k;
    }

    public final C0197c k() {
        boolean z2 = f3195p;
        C0107g c0107g = this.f3206k;
        if (z2) {
            C0197c c0197c = (C0197c) ((C0200f) c0107g.f2292a).a();
            if (c0197c == null) {
                return new C0198d(c0107g);
            }
            c0197c.f3189a = null;
            c0197c.f3192d.clear();
            c0197c.f3190b = 0.0f;
            c0197c.f3193e = false;
            return c0197c;
        }
        C0197c c0197c2 = (C0197c) ((C0200f) c0107g.f2293b).a();
        if (c0197c2 == null) {
            return new C0197c(c0107g);
        }
        c0197c2.f3189a = null;
        c0197c2.f3192d.clear();
        c0197c2.f3190b = 0.0f;
        c0197c2.f3193e = false;
        return c0197c2;
    }

    public final C0205k l() {
        if (this.f3203h + 1 >= this.f3199d) {
            n();
        }
        C0205k a2 = a(3);
        int i2 = this.f3196a + 1;
        this.f3196a = i2;
        this.f3203h++;
        a2.f3222b = i2;
        ((C0205k[]) this.f3206k.f2295d)[i2] = a2;
        return a2;
    }

    public final void n() {
        int i2 = this.f3198c * 2;
        this.f3198c = i2;
        this.f3200e = (C0197c[]) Arrays.copyOf(this.f3200e, i2);
        C0107g c0107g = this.f3206k;
        c0107g.f2295d = (C0205k[]) Arrays.copyOf((C0205k[]) c0107g.f2295d, this.f3198c);
        int i3 = this.f3198c;
        this.f3202g = new boolean[i3];
        this.f3199d = i3;
        this.f3205j = i3;
    }

    public final void o(C0203i c0203i) {
        C0107g c0107g;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f3204i) {
                break;
            }
            C0197c c0197c = this.f3200e[i2];
            int i3 = 1;
            if (c0197c.f3189a.f3232l != 1) {
                float f2 = 0.0f;
                if (c0197c.f3190b < 0.0f) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (!z2) {
                        i4 += i3;
                        float f3 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            int i9 = this.f3204i;
                            c0107g = this.f3206k;
                            if (i7 >= i9) {
                                break;
                            }
                            C0197c c0197c2 = this.f3200e[i7];
                            if (c0197c2.f3189a.f3232l != i3 && !c0197c2.f3193e && c0197c2.f3190b < f2) {
                                int i10 = i3;
                                while (i10 < this.f3203h) {
                                    C0205k c0205k = ((C0205k[]) c0107g.f2295d)[i10];
                                    float c2 = c0197c2.f3192d.c(c0205k);
                                    if (c2 > f2) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f4 = c0205k.f3227g[i11] / c2;
                                            if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                                i8 = i11;
                                                f3 = f4;
                                                i5 = i7;
                                                i6 = i10;
                                            }
                                        }
                                    }
                                    i10++;
                                    f2 = 0.0f;
                                }
                            }
                            i7++;
                            f2 = 0.0f;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            C0197c c0197c3 = this.f3200e[i5];
                            c0197c3.f3189a.f3223c = -1;
                            c0197c3.f(((C0205k[]) c0107g.f2295d)[i6]);
                            C0205k c0205k2 = c0197c3.f3189a;
                            c0205k2.f3223c = i5;
                            c0205k2.d(c0197c3);
                        } else {
                            z2 = true;
                        }
                        if (i4 > this.f3203h / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        p(c0203i);
        for (int i12 = 0; i12 < this.f3204i; i12++) {
            C0197c c0197c4 = this.f3200e[i12];
            c0197c4.f3189a.f3225e = c0197c4.f3190b;
        }
    }

    public final void p(C0197c c0197c) {
        for (int i2 = 0; i2 < this.f3203h; i2++) {
            this.f3202g[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f3203h * 2) {
                return;
            }
            C0205k c0205k = c0197c.f3189a;
            if (c0205k != null) {
                this.f3202g[c0205k.f3222b] = true;
            }
            C0205k d2 = c0197c.d(this.f3202g);
            if (d2 != null) {
                boolean[] zArr = this.f3202g;
                int i4 = d2.f3222b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (d2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f3204i; i6++) {
                    C0197c c0197c2 = this.f3200e[i6];
                    if (c0197c2.f3189a.f3232l != 1 && !c0197c2.f3193e && c0197c2.f3192d.i(d2)) {
                        float c2 = c0197c2.f3192d.c(d2);
                        if (c2 < 0.0f) {
                            float f3 = (-c0197c2.f3190b) / c2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    C0197c c0197c3 = this.f3200e[i5];
                    c0197c3.f3189a.f3223c = -1;
                    c0197c3.f(d2);
                    C0205k c0205k2 = c0197c3.f3189a;
                    c0205k2.f3223c = i5;
                    c0205k2.d(c0197c3);
                }
            } else {
                z2 = true;
            }
        }
    }

    public final void q() {
        boolean z2 = f3195p;
        C0107g c0107g = this.f3206k;
        int i2 = 0;
        if (z2) {
            while (true) {
                C0197c[] c0197cArr = this.f3200e;
                if (i2 >= c0197cArr.length) {
                    return;
                }
                C0197c c0197c = c0197cArr[i2];
                if (c0197c != null) {
                    ((C0200f) c0107g.f2292a).b(c0197c);
                }
                this.f3200e[i2] = null;
                i2++;
            }
        } else {
            while (true) {
                C0197c[] c0197cArr2 = this.f3200e;
                if (i2 >= c0197cArr2.length) {
                    return;
                }
                C0197c c0197c2 = c0197cArr2[i2];
                if (c0197c2 != null) {
                    ((C0200f) c0107g.f2293b).b(c0197c2);
                }
                this.f3200e[i2] = null;
                i2++;
            }
        }
    }

    public final void r() {
        C0107g c0107g;
        int i2 = 0;
        while (true) {
            c0107g = this.f3206k;
            C0205k[] c0205kArr = (C0205k[]) c0107g.f2295d;
            if (i2 >= c0205kArr.length) {
                break;
            }
            C0205k c0205k = c0205kArr[i2];
            if (c0205k != null) {
                c0205k.c();
            }
            i2++;
        }
        C0200f c0200f = (C0200f) c0107g.f2294c;
        C0205k[] c0205kArr2 = this.f3207l;
        int i3 = this.f3208m;
        c0200f.getClass();
        if (i3 > c0205kArr2.length) {
            i3 = c0205kArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            C0205k c0205k2 = c0205kArr2[i4];
            int i5 = c0200f.f3212c;
            Object[] objArr = c0200f.f3211b;
            if (i5 < objArr.length) {
                objArr[i5] = c0205k2;
                c0200f.f3212c = i5 + 1;
            }
        }
        this.f3208m = 0;
        Arrays.fill((C0205k[]) c0107g.f2295d, (Object) null);
        this.f3196a = 0;
        C0203i c0203i = this.f3197b;
        c0203i.f3219h = 0;
        c0203i.f3190b = 0.0f;
        this.f3203h = 1;
        for (int i6 = 0; i6 < this.f3204i; i6++) {
            this.f3200e[i6].getClass();
        }
        q();
        this.f3204i = 0;
        if (f3195p) {
            this.f3209n = new C0198d(c0107g);
        } else {
            this.f3209n = new C0197c(c0107g);
        }
    }
}
