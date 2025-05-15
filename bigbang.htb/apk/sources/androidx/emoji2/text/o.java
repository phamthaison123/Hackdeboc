package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f1112a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f1113b;

    /* renamed from: c, reason: collision with root package name */
    public t f1114c;

    /* renamed from: d, reason: collision with root package name */
    public t f1115d;

    /* renamed from: e, reason: collision with root package name */
    public int f1116e;

    /* renamed from: f, reason: collision with root package name */
    public int f1117f;

    public o(t tVar) {
        this.f1113b = tVar;
        this.f1114c = tVar;
    }

    public final int a(int i2) {
        SparseArray sparseArray = this.f1114c.f1133a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(i2);
        int i3 = 1;
        int i4 = 2;
        if (this.f1112a == 2) {
            if (tVar != null) {
                this.f1114c = tVar;
                this.f1117f++;
            } else if (i2 == 65038) {
                b();
            } else if (i2 != 65039) {
                t tVar2 = this.f1114c;
                if (tVar2.f1134b != null) {
                    i4 = 3;
                    if (this.f1117f != 1) {
                        this.f1115d = tVar2;
                        b();
                    } else if (c()) {
                        this.f1115d = this.f1114c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i3 = i4;
        } else if (tVar == null) {
            b();
        } else {
            this.f1112a = 2;
            this.f1114c = tVar;
            this.f1117f = 1;
            i3 = i4;
        }
        this.f1116e = i2;
        return i3;
    }

    public final void b() {
        this.f1112a = 1;
        this.f1114c = this.f1113b;
        this.f1117f = 0;
    }

    public final boolean c() {
        M.a c2 = this.f1114c.f1134b.c();
        int a2 = c2.a(6);
        return !(a2 == 0 || c2.f216b.get(a2 + c2.f215a) == 0) || this.f1116e == 65039;
    }
}
