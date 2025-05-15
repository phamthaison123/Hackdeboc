package k;

import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class e implements Iterator, f {

    /* renamed from: a, reason: collision with root package name */
    public c f3000a;

    /* renamed from: b, reason: collision with root package name */
    public c f3001b;

    @Override // k.f
    public final void a(c cVar) {
        c cVar2;
        c cVar3;
        c cVar4 = null;
        if (this.f3000a == cVar && cVar == this.f3001b) {
            this.f3001b = null;
            this.f3000a = null;
        }
        c cVar5 = this.f3000a;
        if (cVar5 == cVar) {
            switch (((C0188b) this).f2992c) {
                case 0:
                    cVar3 = cVar5.f2996d;
                    break;
                default:
                    cVar3 = cVar5.f2995c;
                    break;
            }
            this.f3000a = cVar3;
        }
        c cVar6 = this.f3001b;
        if (cVar6 == cVar) {
            c cVar7 = this.f3000a;
            if (cVar6 != cVar7 && cVar7 != null) {
                switch (((C0188b) this).f2992c) {
                    case 0:
                        cVar2 = cVar6.f2995c;
                        break;
                    default:
                        cVar2 = cVar6.f2996d;
                        break;
                }
                cVar4 = cVar2;
            }
            this.f3001b = cVar4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3001b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f3001b;
        c cVar3 = this.f3000a;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (((C0188b) this).f2992c) {
                case 0:
                    cVar = cVar2.f2995c;
                    break;
                default:
                    cVar = cVar2.f2996d;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f3001b = cVar;
        return cVar2;
    }
}
