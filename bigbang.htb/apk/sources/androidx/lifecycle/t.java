package androidx.lifecycle;

import S.N;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final N f1480a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1481b;

    /* renamed from: c, reason: collision with root package name */
    public int f1482c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f1483d;

    public t(u uVar, N n2) {
        this.f1483d = uVar;
        this.f1480a = n2;
    }

    public final void c(boolean z2) {
        if (z2 == this.f1481b) {
            return;
        }
        this.f1481b = z2;
        int i2 = z2 ? 1 : -1;
        u uVar = this.f1483d;
        int i3 = uVar.f1487c;
        uVar.f1487c = i2 + i3;
        if (!uVar.f1488d) {
            uVar.f1488d = true;
            while (true) {
                try {
                    int i4 = uVar.f1487c;
                    if (i3 == i4) {
                        break;
                    } else {
                        i3 = i4;
                    }
                } finally {
                    uVar.f1488d = false;
                }
            }
        }
        if (this.f1481b) {
            uVar.c(this);
        }
    }

    public void d() {
    }

    public abstract boolean e();
}
