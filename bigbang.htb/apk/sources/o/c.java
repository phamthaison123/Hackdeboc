package o;

import F.Q;
import java.util.HashSet;
import java.util.Iterator;
import n.AbstractC0204j;
import n.C0205k;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final d f3274b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3275c;

    /* renamed from: d, reason: collision with root package name */
    public c f3276d;

    /* renamed from: g, reason: collision with root package name */
    public C0205k f3279g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3273a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f3277e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f3278f = -1;

    public c(d dVar, int i2) {
        this.f3274b = dVar;
        this.f3275c = i2;
    }

    public final void a(c cVar, int i2, int i3) {
        if (cVar == null) {
            e();
            return;
        }
        this.f3276d = cVar;
        if (cVar.f3273a == null) {
            cVar.f3273a = new HashSet();
        }
        this.f3276d.f3273a.add(this);
        if (i2 > 0) {
            this.f3277e = i2;
        } else {
            this.f3277e = 0;
        }
        this.f3278f = i3;
    }

    public final int b() {
        c cVar;
        if (this.f3274b.f3301V == 8) {
            return 0;
        }
        int i2 = this.f3278f;
        return (i2 <= -1 || (cVar = this.f3276d) == null || cVar.f3274b.f3301V != 8) ? this.f3277e : i2;
    }

    public final boolean c() {
        c cVar;
        HashSet hashSet = this.f3273a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            int i2 = cVar2.f3275c;
            int a2 = AbstractC0204j.a(i2);
            d dVar = cVar2.f3274b;
            switch (a2) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    cVar = null;
                    break;
                case 1:
                    cVar = dVar.f3334z;
                    break;
                case 2:
                    cVar = dVar.f3280A;
                    break;
                case 3:
                    cVar = dVar.f3332x;
                    break;
                case 4:
                    cVar = dVar.f3333y;
                    break;
                default:
                    throw new AssertionError(Q.j(i2));
            }
            if (cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.f3276d != null;
    }

    public final void e() {
        HashSet hashSet;
        c cVar = this.f3276d;
        if (cVar != null && (hashSet = cVar.f3273a) != null) {
            hashSet.remove(this);
        }
        this.f3276d = null;
        this.f3277e = 0;
        this.f3278f = -1;
    }

    public final void f() {
        C0205k c0205k = this.f3279g;
        if (c0205k == null) {
            this.f3279g = new C0205k(1);
        } else {
            c0205k.c();
        }
    }

    public final String toString() {
        return this.f3274b.f3302W + ":" + Q.j(this.f3275c);
    }
}
