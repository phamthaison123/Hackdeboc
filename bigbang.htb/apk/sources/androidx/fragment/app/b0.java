package androidx.fragment.app;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f1300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f1301c;

    public /* synthetic */ b0(d0 d0Var, c0 c0Var, int i2) {
        this.f1299a = i2;
        this.f1301c = d0Var;
        this.f1300b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f1299a;
        c0 c0Var = this.f1300b;
        d0 d0Var = this.f1301c;
        switch (i2) {
            case 0:
                if (d0Var.f1321b.contains(c0Var)) {
                    F.Q.a(c0Var.f1307a, c0Var.f1309c.f1374E);
                    break;
                }
                break;
            default:
                d0Var.f1321b.remove(c0Var);
                d0Var.f1322c.remove(c0Var);
                break;
        }
    }
}
