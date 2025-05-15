package androidx.emoji2.text;

import g.C0107g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1085c;

    public c(d dVar) {
        this.f1085c = dVar;
    }

    @Override // B.a
    public final void Q(Throwable th) {
        ((i) this.f1085c.f2221b).d(th);
    }

    @Override // B.a
    public final void W(C0107g c0107g) {
        d dVar = this.f1085c;
        dVar.f1087d = c0107g;
        C0107g c0107g2 = dVar.f1087d;
        m0.e eVar = new m0.e();
        Object obj = dVar.f2221b;
        n nVar = ((i) obj).f1100h;
        ((i) obj).getClass();
        dVar.f1086c = new p(c0107g2, eVar, nVar);
        ((i) dVar.f2221b).e();
    }
}
