package l;

import h.AbstractC0119d;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0189a extends AbstractC0119d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3007e;

    public C0189a(int i2, Object obj) {
        this.f3006d = i2;
        this.f3007e = obj;
    }

    @Override // h.AbstractC0119d
    public final void c() {
        int i2 = this.f3006d;
        Object obj = this.f3007e;
        switch (i2) {
            case 0:
                ((C0190b) obj).clear();
                break;
            default:
                ((C0191c) obj).clear();
                break;
        }
    }

    @Override // h.AbstractC0119d
    public final Object d(int i2, int i3) {
        int i4 = this.f3006d;
        Object obj = this.f3007e;
        switch (i4) {
            case 0:
                return ((C0190b) obj).f3048b[(i2 << 1) + i3];
            default:
                return ((C0191c) obj).f3016b[i2];
        }
    }

    @Override // h.AbstractC0119d
    public final C0190b e() {
        switch (this.f3006d) {
            case 0:
                return (C0190b) this.f3007e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // h.AbstractC0119d
    public final int f() {
        int i2 = this.f3006d;
        Object obj = this.f3007e;
        switch (i2) {
            case 0:
                return ((C0190b) obj).f3049c;
            default:
                return ((C0191c) obj).f3017c;
        }
    }

    @Override // h.AbstractC0119d
    public final int g(Object obj) {
        int i2 = this.f3006d;
        Object obj2 = this.f3007e;
        switch (i2) {
            case 0:
                return ((C0190b) obj2).e(obj);
            default:
                return ((C0191c) obj2).d(obj);
        }
    }

    @Override // h.AbstractC0119d
    public final int h(Object obj) {
        int i2 = this.f3006d;
        Object obj2 = this.f3007e;
        switch (i2) {
            case 0:
                return ((C0190b) obj2).g(obj);
            default:
                return ((C0191c) obj2).d(obj);
        }
    }

    @Override // h.AbstractC0119d
    public final void i(Object obj, Object obj2) {
        int i2 = this.f3006d;
        Object obj3 = this.f3007e;
        switch (i2) {
            case 0:
                ((C0190b) obj3).put(obj, obj2);
                break;
            default:
                ((C0191c) obj3).add(obj);
                break;
        }
    }

    @Override // h.AbstractC0119d
    public final void j(int i2) {
        int i3 = this.f3006d;
        Object obj = this.f3007e;
        switch (i3) {
            case 0:
                ((C0190b) obj).i(i2);
                break;
            default:
                ((C0191c) obj).f(i2);
                break;
        }
    }

    @Override // h.AbstractC0119d
    public final Object k(int i2, Object obj) {
        switch (this.f3006d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((C0190b) this.f3007e).f3048b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
