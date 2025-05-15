package n;

import F.Q;
import g.C0107g;
import java.util.Arrays;

/* renamed from: n.l, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0206l implements InterfaceC0196b {

    /* renamed from: a, reason: collision with root package name */
    public int f3233a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3234b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f3235c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f3236d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public float[] f3237e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3238f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public int[] f3239g = new int[16];

    /* renamed from: h, reason: collision with root package name */
    public int f3240h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f3241i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final C0197c f3242j;

    /* renamed from: k, reason: collision with root package name */
    public final C0107g f3243k;

    public C0206l(C0197c c0197c, C0107g c0107g) {
        this.f3242j = c0197c;
        this.f3243k = c0107g;
        clear();
    }

    @Override // n.InterfaceC0196b
    public final float a(int i2) {
        int i3 = this.f3240h;
        int i4 = this.f3241i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f3237e[i4];
            }
            i4 = this.f3239g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // n.InterfaceC0196b
    public final C0205k b(int i2) {
        int i3 = this.f3240h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f3241i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return ((C0205k[]) this.f3243k.f2295d)[this.f3236d[i4]];
            }
            i4 = this.f3239g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // n.InterfaceC0196b
    public final float c(C0205k c0205k) {
        int n2 = n(c0205k);
        if (n2 != -1) {
            return this.f3237e[n2];
        }
        return 0.0f;
    }

    @Override // n.InterfaceC0196b
    public final void clear() {
        int i2 = this.f3240h;
        for (int i3 = 0; i3 < i2; i3++) {
            C0205k b2 = b(i3);
            if (b2 != null) {
                b2.b(this.f3242j);
            }
        }
        for (int i4 = 0; i4 < this.f3233a; i4++) {
            this.f3236d[i4] = -1;
            this.f3235c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.f3234b[i5] = -1;
        }
        this.f3240h = 0;
        this.f3241i = -1;
    }

    @Override // n.InterfaceC0196b
    public final void d(C0205k c0205k, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int n2 = n(c0205k);
            if (n2 == -1) {
                e(c0205k, f2);
                return;
            }
            float[] fArr = this.f3237e;
            float f3 = fArr[n2] + f2;
            fArr[n2] = f3;
            if (f3 <= -0.001f || f3 >= 0.001f) {
                return;
            }
            fArr[n2] = 0.0f;
            g(c0205k, z2);
        }
    }

    @Override // n.InterfaceC0196b
    public final void e(C0205k c0205k, float f2) {
        if (f2 > -0.001f && f2 < 0.001f) {
            g(c0205k, true);
            return;
        }
        int i2 = 0;
        if (this.f3240h == 0) {
            m(0, c0205k, f2);
            l(c0205k, 0);
            this.f3241i = 0;
            return;
        }
        int n2 = n(c0205k);
        if (n2 != -1) {
            this.f3237e[n2] = f2;
            return;
        }
        int i3 = this.f3240h + 1;
        int i4 = this.f3233a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f3236d = Arrays.copyOf(this.f3236d, i5);
            this.f3237e = Arrays.copyOf(this.f3237e, i5);
            this.f3238f = Arrays.copyOf(this.f3238f, i5);
            this.f3239g = Arrays.copyOf(this.f3239g, i5);
            this.f3235c = Arrays.copyOf(this.f3235c, i5);
            for (int i6 = this.f3233a; i6 < i5; i6++) {
                this.f3236d[i6] = -1;
                this.f3235c[i6] = -1;
            }
            this.f3233a = i5;
        }
        int i7 = this.f3240h;
        int i8 = this.f3241i;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f3236d[i8];
            int i12 = c0205k.f3222b;
            if (i11 == i12) {
                this.f3237e[i8] = f2;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f3239g[i8];
            if (i8 == -1) {
                break;
            }
        }
        while (true) {
            if (i2 >= this.f3233a) {
                i2 = -1;
                break;
            } else if (this.f3236d[i2] == -1) {
                break;
            } else {
                i2++;
            }
        }
        m(i2, c0205k, f2);
        if (i9 != -1) {
            this.f3238f[i2] = i9;
            int[] iArr = this.f3239g;
            iArr[i2] = iArr[i9];
            iArr[i9] = i2;
        } else {
            this.f3238f[i2] = -1;
            if (this.f3240h > 0) {
                this.f3239g[i2] = this.f3241i;
                this.f3241i = i2;
            } else {
                this.f3239g[i2] = -1;
            }
        }
        int i13 = this.f3239g[i2];
        if (i13 != -1) {
            this.f3238f[i13] = i2;
        }
        l(c0205k, i2);
    }

    @Override // n.InterfaceC0196b
    public final void f(float f2) {
        int i2 = this.f3240h;
        int i3 = this.f3241i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3237e;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f3239g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // n.InterfaceC0196b
    public final float g(C0205k c0205k, boolean z2) {
        int[] iArr;
        int i2;
        int n2 = n(c0205k);
        if (n2 == -1) {
            return 0.0f;
        }
        int i3 = c0205k.f3222b;
        int i4 = i3 % 16;
        int[] iArr2 = this.f3234b;
        int i5 = iArr2[i4];
        if (i5 != -1) {
            if (this.f3236d[i5] == i3) {
                int[] iArr3 = this.f3235c;
                iArr2[i4] = iArr3[i5];
                iArr3[i5] = -1;
            } else {
                while (true) {
                    iArr = this.f3235c;
                    i2 = iArr[i5];
                    if (i2 == -1 || this.f3236d[i2] == i3) {
                        break;
                    }
                    i5 = i2;
                }
                if (i2 != -1 && this.f3236d[i2] == i3) {
                    iArr[i5] = iArr[i2];
                    iArr[i2] = -1;
                }
            }
        }
        float f2 = this.f3237e[n2];
        if (this.f3241i == n2) {
            this.f3241i = this.f3239g[n2];
        }
        this.f3236d[n2] = -1;
        int[] iArr4 = this.f3238f;
        int i6 = iArr4[n2];
        if (i6 != -1) {
            int[] iArr5 = this.f3239g;
            iArr5[i6] = iArr5[n2];
        }
        int i7 = this.f3239g[n2];
        if (i7 != -1) {
            iArr4[i7] = iArr4[n2];
        }
        this.f3240h--;
        c0205k.f3231k--;
        if (z2) {
            c0205k.b(this.f3242j);
        }
        return f2;
    }

    @Override // n.InterfaceC0196b
    public final float h(C0197c c0197c, boolean z2) {
        float c2 = c(c0197c.f3189a);
        g(c0197c.f3189a, z2);
        C0206l c0206l = (C0206l) c0197c.f3192d;
        int i2 = c0206l.f3240h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = c0206l.f3236d[i4];
            if (i5 != -1) {
                d(((C0205k[]) this.f3243k.f2295d)[i5], c0206l.f3237e[i4] * c2, z2);
                i3++;
            }
            i4++;
        }
        return c2;
    }

    @Override // n.InterfaceC0196b
    public final boolean i(C0205k c0205k) {
        return n(c0205k) != -1;
    }

    @Override // n.InterfaceC0196b
    public final void j() {
        int i2 = this.f3240h;
        int i3 = this.f3241i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3237e;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f3239g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // n.InterfaceC0196b
    public final int k() {
        return this.f3240h;
    }

    public final void l(C0205k c0205k, int i2) {
        int[] iArr;
        int i3 = c0205k.f3222b % 16;
        int[] iArr2 = this.f3234b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f3235c;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                } else {
                    i4 = i5;
                }
            }
            iArr[i4] = i2;
        }
        this.f3235c[i2] = -1;
    }

    public final void m(int i2, C0205k c0205k, float f2) {
        this.f3236d[i2] = c0205k.f3222b;
        this.f3237e[i2] = f2;
        this.f3238f[i2] = -1;
        this.f3239g[i2] = -1;
        c0205k.a(this.f3242j);
        c0205k.f3231k++;
        this.f3240h++;
    }

    public final int n(C0205k c0205k) {
        if (this.f3240h == 0) {
            return -1;
        }
        int i2 = c0205k.f3222b;
        int i3 = this.f3234b[i2 % 16];
        if (i3 == -1) {
            return -1;
        }
        if (this.f3236d[i3] == i2) {
            return i3;
        }
        do {
            i3 = this.f3235c[i3];
            if (i3 == -1) {
                break;
            }
        } while (this.f3236d[i3] != i2);
        if (i3 != -1 && this.f3236d[i3] == i2) {
            return i3;
        }
        return -1;
    }

    public final String toString() {
        String str = hashCode() + " { ";
        int i2 = this.f3240h;
        for (int i3 = 0; i3 < i2; i3++) {
            C0205k b2 = b(i3);
            if (b2 != null) {
                String str2 = str + b2 + " = " + a(i3) + " ";
                int n2 = n(b2);
                String d2 = Q.d(str2, "[p: ");
                int i4 = this.f3238f[n2];
                C0107g c0107g = this.f3243k;
                String d3 = Q.d(i4 != -1 ? d2 + ((C0205k[]) c0107g.f2295d)[this.f3236d[this.f3238f[n2]]] : Q.d(d2, "none"), ", n: ");
                str = Q.d(this.f3239g[n2] != -1 ? d3 + ((C0205k[]) c0107g.f2295d)[this.f3236d[this.f3239g[n2]]] : Q.d(d3, "none"), "]");
            }
        }
        return Q.d(str, " }");
    }
}
