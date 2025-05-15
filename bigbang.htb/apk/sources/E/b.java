package E;

import n.C0200f;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b extends C0200f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f55d;

    public b() {
        super(12, 1);
        this.f55d = new Object();
    }

    @Override // n.C0200f
    public final Object a() {
        Object a2;
        synchronized (this.f55d) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // n.C0200f
    public final boolean b(Object obj) {
        boolean b2;
        synchronized (this.f55d) {
            b2 = super.b(obj);
        }
        return b2;
    }
}
