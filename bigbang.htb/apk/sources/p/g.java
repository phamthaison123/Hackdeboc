package p;

import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f3469m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f3461e = 2;
        } else {
            this.f3461e = 3;
        }
    }

    @Override // p.f
    public final void d(int i2) {
        if (this.f3466j) {
            return;
        }
        this.f3466j = true;
        this.f3463g = i2;
        Iterator it = this.f3467k.iterator();
        while (it.hasNext()) {
            InterfaceC0211d interfaceC0211d = (InterfaceC0211d) it.next();
            interfaceC0211d.a(interfaceC0211d);
        }
    }
}
