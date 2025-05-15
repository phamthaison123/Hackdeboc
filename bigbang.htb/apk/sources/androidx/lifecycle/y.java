package androidx.lifecycle;

import android.os.Handler;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class y implements o {

    /* renamed from: h, reason: collision with root package name */
    public static final y f1494h = new y();

    /* renamed from: e, reason: collision with root package name */
    public Handler f1499e;

    /* renamed from: a, reason: collision with root package name */
    public int f1495a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1496b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1497c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1498d = true;

    /* renamed from: f, reason: collision with root package name */
    public final q f1500f = new q(this);

    /* renamed from: g, reason: collision with root package name */
    public final androidx.activity.b f1501g = new androidx.activity.b(8, this);

    public final void b() {
        int i2 = this.f1496b + 1;
        this.f1496b = i2;
        if (i2 == 1) {
            if (!this.f1497c) {
                this.f1499e.removeCallbacks(this.f1501g);
            } else {
                this.f1500f.g(i.ON_RESUME);
                this.f1497c = false;
            }
        }
    }

    @Override // androidx.lifecycle.o
    public final q d() {
        return this.f1500f;
    }
}
