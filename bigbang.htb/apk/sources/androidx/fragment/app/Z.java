package androidx.fragment.app;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class Z implements androidx.savedstate.e, androidx.lifecycle.E {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.D f1262a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.q f1263b = null;

    /* renamed from: c, reason: collision with root package name */
    public androidx.savedstate.d f1264c = null;

    public Z(androidx.lifecycle.D d2) {
        this.f1262a = d2;
    }

    @Override // androidx.savedstate.e
    public final androidx.savedstate.c a() {
        e();
        return this.f1264c.f1620b;
    }

    @Override // androidx.lifecycle.E
    public final androidx.lifecycle.D b() {
        e();
        return this.f1262a;
    }

    public final void c(androidx.lifecycle.i iVar) {
        this.f1263b.g(iVar);
    }

    @Override // androidx.lifecycle.o
    public final androidx.lifecycle.q d() {
        e();
        return this.f1263b;
    }

    public final void e() {
        if (this.f1263b == null) {
            this.f1263b = new androidx.lifecycle.q(this);
            this.f1264c = new androidx.savedstate.d(this);
        }
    }
}
