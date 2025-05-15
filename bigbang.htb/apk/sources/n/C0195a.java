package n;

import F.Q;
import g.C0107g;
import java.util.Arrays;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0195a implements InterfaceC0196b {

    /* renamed from: b, reason: collision with root package name */
    public final C0197c f3180b;

    /* renamed from: c, reason: collision with root package name */
    public final C0107g f3181c;

    /* renamed from: a, reason: collision with root package name */
    public int f3179a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f3182d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3183e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f3184f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f3185g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f3186h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f3187i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3188j = false;

    public C0195a(C0197c c0197c, C0107g c0107g) {
        this.f3180b = c0197c;
        this.f3181c = c0107g;
    }

    @Override // n.InterfaceC0196b
    public final float a(int i2) {
        int i3 = this.f3186h;
        for (int i4 = 0; i3 != -1 && i4 < this.f3179a; i4++) {
            if (i4 == i2) {
                return this.f3185g[i3];
            }
            i3 = this.f3184f[i3];
        }
        return 0.0f;
    }

    @Override // n.InterfaceC0196b
    public final C0205k b(int i2) {
        int i3 = this.f3186h;
        for (int i4 = 0; i3 != -1 && i4 < this.f3179a; i4++) {
            if (i4 == i2) {
                return ((C0205k[]) this.f3181c.f2295d)[this.f3183e[i3]];
            }
            i3 = this.f3184f[i3];
        }
        return null;
    }

    @Override // n.InterfaceC0196b
    public final float c(C0205k c0205k) {
        int i2 = this.f3186h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3179a; i3++) {
            if (this.f3183e[i2] == c0205k.f3222b) {
                return this.f3185g[i2];
            }
            i2 = this.f3184f[i2];
        }
        return 0.0f;
    }

    @Override // n.InterfaceC0196b
    public final void clear() {
        int i2 = this.f3186h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3179a; i3++) {
            C0205k c0205k = ((C0205k[]) this.f3181c.f2295d)[this.f3183e[i2]];
            if (c0205k != null) {
                c0205k.b(this.f3180b);
            }
            i2 = this.f3184f[i2];
        }
        this.f3186h = -1;
        this.f3187i = -1;
        this.f3188j = false;
        this.f3179a = 0;
    }

    @Override // n.InterfaceC0196b
    public final void d(C0205k c0205k, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f3186h;
            C0197c c0197c = this.f3180b;
            if (i2 == -1) {
                this.f3186h = 0;
                this.f3185g[0] = f2;
                this.f3183e[0] = c0205k.f3222b;
                this.f3184f[0] = -1;
                c0205k.f3231k++;
                c0205k.a(c0197c);
                this.f3179a++;
                if (this.f3188j) {
                    return;
                }
                int i3 = this.f3187i + 1;
                this.f3187i = i3;
                int[] iArr = this.f3183e;
                if (i3 >= iArr.length) {
                    this.f3188j = true;
                    this.f3187i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f3179a; i5++) {
                int i6 = this.f3183e[i2];
                int i7 = c0205k.f3222b;
                if (i6 == i7) {
                    float[] fArr = this.f3185g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f3186h) {
                            this.f3186h = this.f3184f[i2];
                        } else {
                            int[] iArr2 = this.f3184f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            c0205k.b(c0197c);
                        }
                        if (this.f3188j) {
                            this.f3187i = i2;
                        }
                        c0205k.f3231k--;
                        this.f3179a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f3184f[i2];
            }
            int i8 = this.f3187i;
            int i9 = i8 + 1;
            if (this.f3188j) {
                int[] iArr3 = this.f3183e;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.f3183e;
            if (i8 >= iArr4.length && this.f3179a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.f3183e;
                    if (i10 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            int[] iArr6 = this.f3183e;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.f3182d * 2;
                this.f3182d = i11;
                this.f3188j = false;
                this.f3187i = i8 - 1;
                this.f3185g = Arrays.copyOf(this.f3185g, i11);
                this.f3183e = Arrays.copyOf(this.f3183e, this.f3182d);
                this.f3184f = Arrays.copyOf(this.f3184f, this.f3182d);
            }
            this.f3183e[i8] = c0205k.f3222b;
            this.f3185g[i8] = f2;
            if (i4 != -1) {
                int[] iArr7 = this.f3184f;
                iArr7[i8] = iArr7[i4];
                iArr7[i4] = i8;
            } else {
                this.f3184f[i8] = this.f3186h;
                this.f3186h = i8;
            }
            c0205k.f3231k++;
            c0205k.a(c0197c);
            this.f3179a++;
            if (!this.f3188j) {
                this.f3187i++;
            }
            int i12 = this.f3187i;
            int[] iArr8 = this.f3183e;
            if (i12 >= iArr8.length) {
                this.f3188j = true;
                this.f3187i = iArr8.length - 1;
            }
        }
    }

    @Override // n.InterfaceC0196b
    public final void e(C0205k c0205k, float f2) {
        if (f2 == 0.0f) {
            g(c0205k, true);
            return;
        }
        int i2 = this.f3186h;
        C0197c c0197c = this.f3180b;
        if (i2 == -1) {
            this.f3186h = 0;
            this.f3185g[0] = f2;
            this.f3183e[0] = c0205k.f3222b;
            this.f3184f[0] = -1;
            c0205k.f3231k++;
            c0205k.a(c0197c);
            this.f3179a++;
            if (this.f3188j) {
                return;
            }
            int i3 = this.f3187i + 1;
            this.f3187i = i3;
            int[] iArr = this.f3183e;
            if (i3 >= iArr.length) {
                this.f3188j = true;
                this.f3187i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f3179a; i5++) {
            int i6 = this.f3183e[i2];
            int i7 = c0205k.f3222b;
            if (i6 == i7) {
                this.f3185g[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f3184f[i2];
        }
        int i8 = this.f3187i;
        int i9 = i8 + 1;
        if (this.f3188j) {
            int[] iArr2 = this.f3183e;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.f3183e;
        if (i8 >= iArr3.length && this.f3179a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.f3183e;
                if (i10 >= iArr4.length) {
                    break;
                }
                if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                }
                i10++;
            }
        }
        int[] iArr5 = this.f3183e;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.f3182d * 2;
            this.f3182d = i11;
            this.f3188j = false;
            this.f3187i = i8 - 1;
            this.f3185g = Arrays.copyOf(this.f3185g, i11);
            this.f3183e = Arrays.copyOf(this.f3183e, this.f3182d);
            this.f3184f = Arrays.copyOf(this.f3184f, this.f3182d);
        }
        this.f3183e[i8] = c0205k.f3222b;
        this.f3185g[i8] = f2;
        if (i4 != -1) {
            int[] iArr6 = this.f3184f;
            iArr6[i8] = iArr6[i4];
            iArr6[i4] = i8;
        } else {
            this.f3184f[i8] = this.f3186h;
            this.f3186h = i8;
        }
        c0205k.f3231k++;
        c0205k.a(c0197c);
        int i12 = this.f3179a + 1;
        this.f3179a = i12;
        if (!this.f3188j) {
            this.f3187i++;
        }
        int[] iArr7 = this.f3183e;
        if (i12 >= iArr7.length) {
            this.f3188j = true;
        }
        if (this.f3187i >= iArr7.length) {
            this.f3188j = true;
            this.f3187i = iArr7.length - 1;
        }
    }

    @Override // n.InterfaceC0196b
    public final void f(float f2) {
        int i2 = this.f3186h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3179a; i3++) {
            float[] fArr = this.f3185g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f3184f[i2];
        }
    }

    @Override // n.InterfaceC0196b
    public final float g(C0205k c0205k, boolean z2) {
        int i2 = this.f3186h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f3179a) {
            if (this.f3183e[i2] == c0205k.f3222b) {
                if (i2 == this.f3186h) {
                    this.f3186h = this.f3184f[i2];
                } else {
                    int[] iArr = this.f3184f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    c0205k.b(this.f3180b);
                }
                c0205k.f3231k--;
                this.f3179a--;
                this.f3183e[i2] = -1;
                if (this.f3188j) {
                    this.f3187i = i2;
                }
                return this.f3185g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f3184f[i2];
        }
        return 0.0f;
    }

    @Override // n.InterfaceC0196b
    public final float h(C0197c c0197c, boolean z2) {
        float c2 = c(c0197c.f3189a);
        g(c0197c.f3189a, z2);
        InterfaceC0196b interfaceC0196b = c0197c.f3192d;
        int k2 = interfaceC0196b.k();
        for (int i2 = 0; i2 < k2; i2++) {
            C0205k b2 = interfaceC0196b.b(i2);
            d(b2, interfaceC0196b.c(b2) * c2, z2);
        }
        return c2;
    }

    @Override // n.InterfaceC0196b
    public final boolean i(C0205k c0205k) {
        int i2 = this.f3186h;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f3179a; i3++) {
            if (this.f3183e[i2] == c0205k.f3222b) {
                return true;
            }
            i2 = this.f3184f[i2];
        }
        return false;
    }

    @Override // n.InterfaceC0196b
    public final void j() {
        int i2 = this.f3186h;
        for (int i3 = 0; i2 != -1 && i3 < this.f3179a; i3++) {
            float[] fArr = this.f3185g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f3184f[i2];
        }
    }

    @Override // n.InterfaceC0196b
    public final int k() {
        return this.f3179a;
    }

    public final String toString() {
        int i2 = this.f3186h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f3179a; i3++) {
            str = (Q.d(str, " -> ") + this.f3185g[i2] + " : ") + ((C0205k[]) this.f3181c.f2295d)[this.f3183e[i2]];
            i2 = this.f3184f[i2];
        }
        return str;
    }
}
