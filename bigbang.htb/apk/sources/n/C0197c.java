package n;

import g.C0107g;
import java.util.ArrayList;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0197c {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0196b f3192d;

    /* renamed from: a, reason: collision with root package name */
    public C0205k f3189a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3190b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3191c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3193e = false;

    public C0197c(C0107g c0107g) {
        this.f3192d = new C0195a(this, c0107g);
    }

    public final void a(C0199e c0199e, int i2) {
        this.f3192d.e(c0199e.i(i2), 1.0f);
        this.f3192d.e(c0199e.i(i2), -1.0f);
    }

    public final void b(C0205k c0205k, C0205k c0205k2, C0205k c0205k3, int i2) {
        boolean z2;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            } else {
                z2 = false;
            }
            this.f3190b = i2;
            if (z2) {
                this.f3192d.e(c0205k, 1.0f);
                this.f3192d.e(c0205k2, -1.0f);
                this.f3192d.e(c0205k3, -1.0f);
                return;
            }
        }
        this.f3192d.e(c0205k, -1.0f);
        this.f3192d.e(c0205k2, 1.0f);
        this.f3192d.e(c0205k3, 1.0f);
    }

    public final void c(C0205k c0205k, C0205k c0205k2, C0205k c0205k3, int i2) {
        boolean z2;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            } else {
                z2 = false;
            }
            this.f3190b = i2;
            if (z2) {
                this.f3192d.e(c0205k, 1.0f);
                this.f3192d.e(c0205k2, -1.0f);
                this.f3192d.e(c0205k3, 1.0f);
                return;
            }
        }
        this.f3192d.e(c0205k, -1.0f);
        this.f3192d.e(c0205k2, 1.0f);
        this.f3192d.e(c0205k3, -1.0f);
    }

    public C0205k d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final C0205k e(boolean[] zArr, C0205k c0205k) {
        int i2;
        int k2 = this.f3192d.k();
        C0205k c0205k2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < k2; i3++) {
            float a2 = this.f3192d.a(i3);
            if (a2 < 0.0f) {
                C0205k b2 = this.f3192d.b(i3);
                if ((zArr == null || !zArr[b2.f3222b]) && b2 != c0205k && (((i2 = b2.f3232l) == 3 || i2 == 4) && a2 < f2)) {
                    f2 = a2;
                    c0205k2 = b2;
                }
            }
        }
        return c0205k2;
    }

    public final void f(C0205k c0205k) {
        C0205k c0205k2 = this.f3189a;
        if (c0205k2 != null) {
            this.f3192d.e(c0205k2, -1.0f);
            this.f3189a = null;
        }
        float g2 = this.f3192d.g(c0205k, true) * (-1.0f);
        this.f3189a = c0205k;
        if (g2 == 1.0f) {
            return;
        }
        this.f3190b /= g2;
        this.f3192d.f(g2);
    }

    public final void g(C0205k c0205k, boolean z2) {
        if (c0205k.f3226f) {
            float c2 = this.f3192d.c(c0205k);
            this.f3190b = (c0205k.f3225e * c2) + this.f3190b;
            this.f3192d.g(c0205k, z2);
            if (z2) {
                c0205k.b(this);
            }
        }
    }

    public void h(C0197c c0197c, boolean z2) {
        float h2 = this.f3192d.h(c0197c, z2);
        this.f3190b = (c0197c.f3190b * h2) + this.f3190b;
        if (z2) {
            c0197c.f3189a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            n.k r0 = r10.f3189a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            n.k r1 = r10.f3189a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = F.Q.d(r0, r1)
            float r1 = r10.f3190b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f3190b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            n.b r5 = r10.f3192d
            int r5 = r5.k()
        L40:
            if (r4 >= r5) goto La0
            n.b r6 = r10.f3192d
            n.k r6 = r6.b(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            n.b r7 = r10.f3192d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = F.Q.d(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = F.Q.d(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = F.Q.d(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = F.Q.d(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r10 = "0.0"
            java.lang.String r0 = F.Q.d(r0, r10)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0197c.toString():java.lang.String");
    }
}
