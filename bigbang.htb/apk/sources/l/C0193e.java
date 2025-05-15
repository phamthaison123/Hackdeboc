package l;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0193e implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f3021e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3022a = false;

    /* renamed from: b, reason: collision with root package name */
    public long[] f3023b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3024c;

    /* renamed from: d, reason: collision with root package name */
    public int f3025d;

    public C0193e() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f3023b = new long[i5];
        this.f3024c = new Object[i5];
    }

    public final void a() {
        int i2 = this.f3025d;
        Object[] objArr = this.f3024c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f3025d = 0;
        this.f3022a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0193e clone() {
        try {
            C0193e c0193e = (C0193e) super.clone();
            c0193e.f3023b = (long[]) this.f3023b.clone();
            c0193e.f3024c = (Object[]) this.f3024c.clone();
            return c0193e;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i2 = this.f3025d;
        long[] jArr = this.f3023b;
        Object[] objArr = this.f3024c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3021e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f3022a = false;
        this.f3025d = i3;
    }

    public final Object d(long j2, Long l2) {
        Object obj;
        int b2 = AbstractC0192d.b(this.f3023b, this.f3025d, j2);
        return (b2 < 0 || (obj = this.f3024c[b2]) == f3021e) ? l2 : obj;
    }

    public final void e(long j2, Object obj) {
        int b2 = AbstractC0192d.b(this.f3023b, this.f3025d, j2);
        if (b2 >= 0) {
            this.f3024c[b2] = obj;
            return;
        }
        int i2 = ~b2;
        int i3 = this.f3025d;
        if (i2 < i3) {
            Object[] objArr = this.f3024c;
            if (objArr[i2] == f3021e) {
                this.f3023b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f3022a && i3 >= this.f3023b.length) {
            c();
            i2 = ~AbstractC0192d.b(this.f3023b, this.f3025d, j2);
        }
        int i4 = this.f3025d;
        if (i4 >= this.f3023b.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f3023b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3024c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3023b = jArr;
            this.f3024c = objArr2;
        }
        int i9 = this.f3025d - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f3023b;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f3024c;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f3025d - i2);
        }
        this.f3023b[i2] = j2;
        this.f3024c[i2] = obj;
        this.f3025d++;
    }

    public final int f() {
        if (this.f3022a) {
            c();
        }
        return this.f3025d;
    }

    public final Object g(int i2) {
        if (this.f3022a) {
            c();
        }
        return this.f3024c[i2];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3025d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3025d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f3022a) {
                c();
            }
            sb.append(this.f3023b[i2]);
            sb.append('=');
            Object g2 = g(i2);
            if (g2 != this) {
                sb.append(g2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
