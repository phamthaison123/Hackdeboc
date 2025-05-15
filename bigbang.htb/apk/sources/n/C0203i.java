package n;

import java.util.Arrays;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0203i extends C0197c {

    /* renamed from: f, reason: collision with root package name */
    public C0205k[] f3217f;

    /* renamed from: g, reason: collision with root package name */
    public C0205k[] f3218g;

    /* renamed from: h, reason: collision with root package name */
    public int f3219h;

    /* renamed from: i, reason: collision with root package name */
    public C0202h f3220i;

    @Override // n.C0197c
    public final C0205k d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f3219h; i3++) {
            C0205k[] c0205kArr = this.f3217f;
            C0205k c0205k = c0205kArr[i3];
            if (!zArr[c0205k.f3222b]) {
                C0202h c0202h = this.f3220i;
                c0202h.f3215a = c0205k;
                int i4 = 8;
                if (i2 == -1) {
                    while (i4 >= 0) {
                        float f2 = c0202h.f3215a.f3228h[i4];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i2 = i3;
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    C0205k c0205k2 = c0205kArr[i2];
                    while (true) {
                        if (i4 >= 0) {
                            float f3 = c0205k2.f3228h[i4];
                            float f4 = c0202h.f3215a.f3228h[i4];
                            if (f4 == f3) {
                                i4--;
                            } else if (f4 >= f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f3217f[i2];
    }

    @Override // n.C0197c
    public final void h(C0197c c0197c, boolean z2) {
        C0205k c0205k = c0197c.f3189a;
        if (c0205k == null) {
            return;
        }
        InterfaceC0196b interfaceC0196b = c0197c.f3192d;
        int k2 = interfaceC0196b.k();
        for (int i2 = 0; i2 < k2; i2++) {
            C0205k b2 = interfaceC0196b.b(i2);
            float a2 = interfaceC0196b.a(i2);
            C0202h c0202h = this.f3220i;
            c0202h.f3215a = b2;
            boolean z3 = b2.f3221a;
            float[] fArr = c0205k.f3228h;
            if (z3) {
                boolean z4 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = c0202h.f3215a.f3228h;
                    float f2 = (fArr[i3] * a2) + fArr2[i3];
                    fArr2[i3] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        c0202h.f3215a.f3228h[i3] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    c0202h.f3216b.j(c0202h.f3215a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f3 = fArr[i4];
                    if (f3 != 0.0f) {
                        float f4 = f3 * a2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        c0202h.f3215a.f3228h[i4] = f4;
                    } else {
                        c0202h.f3215a.f3228h[i4] = 0.0f;
                    }
                }
                i(b2);
            }
            this.f3190b = (c0197c.f3190b * a2) + this.f3190b;
        }
        j(c0205k);
    }

    public final void i(C0205k c0205k) {
        int i2;
        int i3 = this.f3219h + 1;
        C0205k[] c0205kArr = this.f3217f;
        if (i3 > c0205kArr.length) {
            C0205k[] c0205kArr2 = (C0205k[]) Arrays.copyOf(c0205kArr, c0205kArr.length * 2);
            this.f3217f = c0205kArr2;
            this.f3218g = (C0205k[]) Arrays.copyOf(c0205kArr2, c0205kArr2.length * 2);
        }
        C0205k[] c0205kArr3 = this.f3217f;
        int i4 = this.f3219h;
        c0205kArr3[i4] = c0205k;
        int i5 = i4 + 1;
        this.f3219h = i5;
        if (i5 > 1 && c0205kArr3[i4].f3222b > c0205k.f3222b) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i2 = this.f3219h;
                if (i7 >= i2) {
                    break;
                }
                this.f3218g[i7] = this.f3217f[i7];
                i7++;
            }
            Arrays.sort(this.f3218g, 0, i2, new C0201g(i6, this));
            while (i6 < this.f3219h) {
                this.f3217f[i6] = this.f3218g[i6];
                i6++;
            }
        }
        c0205k.f3221a = true;
        c0205k.a(this);
    }

    public final void j(C0205k c0205k) {
        int i2 = 0;
        while (i2 < this.f3219h) {
            if (this.f3217f[i2] == c0205k) {
                while (true) {
                    int i3 = this.f3219h;
                    if (i2 >= i3 - 1) {
                        this.f3219h = i3 - 1;
                        c0205k.f3221a = false;
                        return;
                    } else {
                        C0205k[] c0205kArr = this.f3217f;
                        int i4 = i2 + 1;
                        c0205kArr[i2] = c0205kArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // n.C0197c
    public final String toString() {
        String str = " goal -> (" + this.f3190b + ") : ";
        for (int i2 = 0; i2 < this.f3219h; i2++) {
            C0205k c0205k = this.f3217f[i2];
            C0202h c0202h = this.f3220i;
            c0202h.f3215a = c0205k;
            str = str + c0202h + " ";
        }
        return str;
    }
}
