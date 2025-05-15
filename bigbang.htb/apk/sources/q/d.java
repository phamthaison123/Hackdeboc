package q;

import android.view.ViewGroup;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public float f3500A;

    /* renamed from: B, reason: collision with root package name */
    public String f3501B;

    /* renamed from: C, reason: collision with root package name */
    public int f3502C;

    /* renamed from: D, reason: collision with root package name */
    public float f3503D;

    /* renamed from: E, reason: collision with root package name */
    public float f3504E;

    /* renamed from: F, reason: collision with root package name */
    public int f3505F;

    /* renamed from: G, reason: collision with root package name */
    public int f3506G;

    /* renamed from: H, reason: collision with root package name */
    public int f3507H;

    /* renamed from: I, reason: collision with root package name */
    public int f3508I;

    /* renamed from: J, reason: collision with root package name */
    public int f3509J;

    /* renamed from: K, reason: collision with root package name */
    public int f3510K;

    /* renamed from: L, reason: collision with root package name */
    public int f3511L;

    /* renamed from: M, reason: collision with root package name */
    public int f3512M;

    /* renamed from: N, reason: collision with root package name */
    public float f3513N;

    /* renamed from: O, reason: collision with root package name */
    public float f3514O;

    /* renamed from: P, reason: collision with root package name */
    public int f3515P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3516Q;

    /* renamed from: R, reason: collision with root package name */
    public int f3517R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3518S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3519T;

    /* renamed from: U, reason: collision with root package name */
    public String f3520U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3521V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3522W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3523X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f3524Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f3525Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3526a;

    /* renamed from: a0, reason: collision with root package name */
    public int f3527a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3528b;

    /* renamed from: b0, reason: collision with root package name */
    public int f3529b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3530c;

    /* renamed from: c0, reason: collision with root package name */
    public int f3531c0;

    /* renamed from: d, reason: collision with root package name */
    public int f3532d;

    /* renamed from: d0, reason: collision with root package name */
    public int f3533d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3534e;

    /* renamed from: e0, reason: collision with root package name */
    public int f3535e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3536f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3537f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3538g;

    /* renamed from: g0, reason: collision with root package name */
    public float f3539g0;

    /* renamed from: h, reason: collision with root package name */
    public int f3540h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3541h0;

    /* renamed from: i, reason: collision with root package name */
    public int f3542i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3543i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3544j;

    /* renamed from: j0, reason: collision with root package name */
    public float f3545j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3546k;
    public o.d k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3547l;

    /* renamed from: m, reason: collision with root package name */
    public int f3548m;

    /* renamed from: n, reason: collision with root package name */
    public int f3549n;

    /* renamed from: o, reason: collision with root package name */
    public float f3550o;

    /* renamed from: p, reason: collision with root package name */
    public int f3551p;

    /* renamed from: q, reason: collision with root package name */
    public int f3552q;

    /* renamed from: r, reason: collision with root package name */
    public int f3553r;

    /* renamed from: s, reason: collision with root package name */
    public int f3554s;

    /* renamed from: t, reason: collision with root package name */
    public int f3555t;

    /* renamed from: u, reason: collision with root package name */
    public int f3556u;

    /* renamed from: v, reason: collision with root package name */
    public int f3557v;

    /* renamed from: w, reason: collision with root package name */
    public int f3558w;

    /* renamed from: x, reason: collision with root package name */
    public int f3559x;

    /* renamed from: y, reason: collision with root package name */
    public int f3560y;

    /* renamed from: z, reason: collision with root package name */
    public float f3561z;

    public final void a() {
        this.f3524Y = false;
        this.f3521V = true;
        this.f3522W = true;
        int i2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i2 == -2 && this.f3518S) {
            this.f3521V = false;
            if (this.f3507H == 0) {
                this.f3507H = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.f3519T) {
            this.f3522W = false;
            if (this.f3508I == 0) {
                this.f3508I = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3521V = false;
            if (i2 == 0 && this.f3507H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3518S = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f3522W = false;
            if (i3 == 0 && this.f3508I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3519T = true;
            }
        }
        if (this.f3530c == -1.0f && this.f3526a == -1 && this.f3528b == -1) {
            return;
        }
        this.f3524Y = true;
        this.f3521V = true;
        this.f3522W = true;
        if (!(this.k0 instanceof o.f)) {
            this.k0 = new o.f();
        }
        ((o.f) this.k0).y(this.f3517R);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.resolveLayoutDirection(int):void");
    }
}
