package k;

import java.util.HashMap;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0187a extends g {

    /* renamed from: e, reason: collision with root package name */
    public HashMap f2991e;

    @Override // k.g
    public final c a(Object obj) {
        return (c) this.f2991e.get(obj);
    }

    @Override // k.g
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f2991e.remove(obj);
        return b2;
    }

    public final Object c(Object obj, Object obj2) {
        c a2 = a(obj);
        if (a2 != null) {
            return a2.f2994b;
        }
        HashMap hashMap = this.f2991e;
        c cVar = new c(obj, obj2);
        this.f3005d++;
        c cVar2 = this.f3003b;
        if (cVar2 == null) {
            this.f3002a = cVar;
            this.f3003b = cVar;
        } else {
            cVar2.f2995c = cVar;
            cVar.f2996d = cVar2;
            this.f3003b = cVar;
        }
        hashMap.put(obj, cVar);
        return null;
    }
}
