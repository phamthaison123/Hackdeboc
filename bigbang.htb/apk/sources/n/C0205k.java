package n;

import java.util.Arrays;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0205k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3221a;

    /* renamed from: e, reason: collision with root package name */
    public float f3225e;

    /* renamed from: l, reason: collision with root package name */
    public int f3232l;

    /* renamed from: b, reason: collision with root package name */
    public int f3222b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3223c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f3224d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3226f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f3227g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f3228h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public C0197c[] f3229i = new C0197c[16];

    /* renamed from: j, reason: collision with root package name */
    public int f3230j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3231k = 0;

    public C0205k(int i2) {
        this.f3232l = i2;
    }

    public final void a(C0197c c0197c) {
        int i2 = 0;
        while (true) {
            int i3 = this.f3230j;
            if (i2 >= i3) {
                C0197c[] c0197cArr = this.f3229i;
                if (i3 >= c0197cArr.length) {
                    this.f3229i = (C0197c[]) Arrays.copyOf(c0197cArr, c0197cArr.length * 2);
                }
                C0197c[] c0197cArr2 = this.f3229i;
                int i4 = this.f3230j;
                c0197cArr2[i4] = c0197c;
                this.f3230j = i4 + 1;
                return;
            }
            if (this.f3229i[i2] == c0197c) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void b(C0197c c0197c) {
        int i2 = this.f3230j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f3229i[i3] == c0197c) {
                while (i3 < i2 - 1) {
                    C0197c[] c0197cArr = this.f3229i;
                    int i4 = i3 + 1;
                    c0197cArr[i3] = c0197cArr[i4];
                    i3 = i4;
                }
                this.f3230j--;
                return;
            }
            i3++;
        }
    }

    public final void c() {
        this.f3232l = 5;
        this.f3224d = 0;
        this.f3222b = -1;
        this.f3223c = -1;
        this.f3225e = 0.0f;
        this.f3226f = false;
        int i2 = this.f3230j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3229i[i3] = null;
        }
        this.f3230j = 0;
        this.f3231k = 0;
        this.f3221a = false;
        Arrays.fill(this.f3228h, 0.0f);
    }

    public final void d(C0197c c0197c) {
        int i2 = this.f3230j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3229i[i3].h(c0197c, false);
        }
        this.f3230j = 0;
    }

    public final String toString() {
        return "" + this.f3222b;
    }
}
