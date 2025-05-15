package U;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class u extends r {

    /* renamed from: a, reason: collision with root package name */
    public v f657a;

    @Override // U.p
    public final void c(q qVar) {
        v vVar = this.f657a;
        int i2 = vVar.f662z - 1;
        vVar.f662z = i2;
        if (i2 == 0) {
            vVar.f658A = false;
            vVar.m();
        }
        qVar.v(this);
    }

    @Override // U.r, U.p
    public final void d() {
        v vVar = this.f657a;
        if (vVar.f658A) {
            return;
        }
        vVar.F();
        vVar.f658A = true;
    }
}
