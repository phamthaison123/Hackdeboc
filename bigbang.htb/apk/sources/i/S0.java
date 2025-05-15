package i;

import android.util.SparseIntArray;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2706a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2707b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2708c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2709d;

    public S0(int i2) {
        if (i2 != 1) {
            return;
        }
        this.f2708c = new SparseIntArray();
        this.f2709d = new SparseIntArray();
        this.f2706a = false;
        this.f2707b = false;
    }

    public final int a(int i2, int i3) {
        if (!this.f2707b) {
            return c(i2, i3);
        }
        int i4 = ((SparseIntArray) this.f2709d).get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int c2 = c(i2, i3);
        ((SparseIntArray) this.f2709d).put(i2, c2);
        return c2;
    }

    public final int b(int i2, int i3) {
        if (!this.f2706a) {
            return i2 % i3;
        }
        int i4 = ((SparseIntArray) this.f2708c).get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int i5 = i2 % i3;
        ((SparseIntArray) this.f2708c).put(i2, i5);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.f2707b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.f2709d
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            int r3 = r3 - r1
            r4 = r2
        L10:
            if (r4 > r3) goto L22
            int r5 = r4 + r3
            int r5 = r5 >>> r1
            int r6 = r0.keyAt(r5)
            if (r6 >= r8) goto L1e
            int r4 = r5 + 1
            goto L10
        L1e:
            int r5 = r5 + (-1)
            r3 = r5
            goto L10
        L22:
            int r4 = r4 - r1
            r3 = -1
            if (r4 < 0) goto L31
            int r5 = r0.size()
            if (r4 >= r5) goto L31
            int r0 = r0.keyAt(r4)
            goto L32
        L31:
            r0 = r3
        L32:
            if (r0 == r3) goto L49
            java.lang.Object r3 = r7.f2709d
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r7 = r7.b(r0, r9)
            int r7 = r7 + r1
            if (r7 != r9) goto L4c
            int r3 = r3 + 1
            r7 = r2
            goto L4c
        L49:
            r7 = r2
            r3 = r7
            r4 = r3
        L4c:
            if (r4 >= r8) goto L5e
            int r7 = r7 + 1
            if (r7 != r9) goto L56
            int r3 = r3 + 1
            r7 = r2
            goto L5b
        L56:
            if (r7 <= r9) goto L5b
            int r3 = r3 + 1
            r7 = r1
        L5b:
            int r4 = r4 + 1
            goto L4c
        L5e:
            int r7 = r7 + r1
            if (r7 <= r9) goto L63
            int r3 = r3 + 1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.S0.c(int, int):int");
    }

    public final void d() {
        ((SparseIntArray) this.f2708c).clear();
    }
}
