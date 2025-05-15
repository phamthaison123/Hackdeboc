package S;

/* renamed from: S.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0027c {

    /* renamed from: a, reason: collision with root package name */
    public long f332a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0027c f333b;

    public final void a(int i2) {
        if (i2 < 64) {
            this.f332a &= ~(1 << i2);
            return;
        }
        C0027c c0027c = this.f333b;
        if (c0027c != null) {
            c0027c.a(i2 - 64);
        }
    }

    public final int b(int i2) {
        C0027c c0027c = this.f333b;
        if (c0027c == null) {
            if (i2 >= 64) {
                return Long.bitCount(this.f332a);
            }
            return Long.bitCount(((1 << i2) - 1) & this.f332a);
        }
        if (i2 < 64) {
            return Long.bitCount(((1 << i2) - 1) & this.f332a);
        }
        return Long.bitCount(this.f332a) + c0027c.b(i2 - 64);
    }

    public final void c() {
        if (this.f333b == null) {
            this.f333b = new C0027c();
        }
    }

    public final boolean d(int i2) {
        if (i2 < 64) {
            return ((1 << i2) & this.f332a) != 0;
        }
        c();
        return this.f333b.d(i2 - 64);
    }

    public final void e(int i2, boolean z2) {
        if (i2 >= 64) {
            c();
            this.f333b.e(i2 - 64, z2);
            return;
        }
        long j2 = this.f332a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        this.f332a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            h(i2);
        } else {
            a(i2);
        }
        if (z3 || this.f333b != null) {
            c();
            this.f333b.e(0, z3);
        }
    }

    public final boolean f(int i2) {
        if (i2 >= 64) {
            c();
            return this.f333b.f(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.f332a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f332a = j4;
        long j5 = j2 - 1;
        this.f332a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0027c c0027c = this.f333b;
        if (c0027c != null) {
            if (c0027c.d(0)) {
                h(63);
            }
            this.f333b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.f332a = 0L;
        C0027c c0027c = this.f333b;
        if (c0027c != null) {
            c0027c.g();
        }
    }

    public final void h(int i2) {
        if (i2 < 64) {
            this.f332a |= 1 << i2;
        } else {
            c();
            this.f333b.h(i2 - 64);
        }
    }

    public final String toString() {
        if (this.f333b == null) {
            return Long.toBinaryString(this.f332a);
        }
        return this.f333b.toString() + "xx" + Long.toBinaryString(this.f332a);
    }
}
