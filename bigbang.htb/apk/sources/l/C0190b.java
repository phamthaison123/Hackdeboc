package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0190b extends k implements Map {

    /* renamed from: h, reason: collision with root package name */
    public C0189a f3008h;

    public C0190b(C0190b c0190b) {
        if (c0190b != null) {
            int i2 = c0190b.f3049c;
            b(i2);
            if (this.f3049c != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    put(c0190b.h(i3), c0190b.j(i3));
                }
            } else if (i2 > 0) {
                System.arraycopy(c0190b.f3047a, 0, this.f3047a, 0, i2);
                System.arraycopy(c0190b.f3048b, 0, this.f3048b, 0, i2 << 1);
                this.f3049c = i2;
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i2 = 0;
        if (this.f3008h == null) {
            this.f3008h = new C0189a(0, this);
        }
        C0189a c0189a = this.f3008h;
        if (((h) c0189a.f2394a) == null) {
            c0189a.f2394a = new h(c0189a, i2);
        }
        return (h) c0189a.f2394a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f3008h == null) {
            this.f3008h = new C0189a(0, this);
        }
        C0189a c0189a = this.f3008h;
        if (((h) c0189a.f2395b) == null) {
            c0189a.f2395b = new h(c0189a, 1);
        }
        return (h) c0189a.f2395b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f3049c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f3008h == null) {
            this.f3008h = new C0189a(0, this);
        }
        C0189a c0189a = this.f3008h;
        if (c0189a.f2396c == null) {
            c0189a.f2396c = new j(c0189a);
        }
        return c0189a.f2396c;
    }
}
