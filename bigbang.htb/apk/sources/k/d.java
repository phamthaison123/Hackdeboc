package k;

import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d implements Iterator, f {

    /* renamed from: a, reason: collision with root package name */
    public c f2997a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2998b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f2999c;

    public d(g gVar) {
        this.f2999c = gVar;
    }

    @Override // k.f
    public final void a(c cVar) {
        c cVar2 = this.f2997a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f2996d;
            this.f2997a = cVar3;
            this.f2998b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2998b) {
            return this.f2999c.f3002a != null;
        }
        c cVar = this.f2997a;
        return (cVar == null || cVar.f2995c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2998b) {
            this.f2998b = false;
            this.f2997a = this.f2999c.f3002a;
        } else {
            c cVar = this.f2997a;
            this.f2997a = cVar != null ? cVar.f2995c : null;
        }
        return this.f2997a;
    }
}
