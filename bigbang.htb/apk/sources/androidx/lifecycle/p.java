package androidx.lifecycle;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public j f1468a;

    /* renamed from: b, reason: collision with root package name */
    public m f1469b;

    public final void a(o oVar, i iVar) {
        j a2 = iVar.a();
        j jVar = this.f1468a;
        if (a2.compareTo(jVar) < 0) {
            jVar = a2;
        }
        this.f1468a = jVar;
        this.f1469b.b(oVar, iVar);
        this.f1468a = a2;
    }
}
