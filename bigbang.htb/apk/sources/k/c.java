package k;

import java.util.Map;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2993a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2994b;

    /* renamed from: c, reason: collision with root package name */
    public c f2995c;

    /* renamed from: d, reason: collision with root package name */
    public c f2996d;

    public c(Object obj, Object obj2) {
        this.f2993a = obj;
        this.f2994b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2993a.equals(cVar.f2993a) && this.f2994b.equals(cVar.f2994b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2993a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2994b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2994b.hashCode() ^ this.f2993a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2993a + "=" + this.f2994b;
    }
}
