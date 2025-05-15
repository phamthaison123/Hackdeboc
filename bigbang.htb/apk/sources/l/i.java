package l;

import h.AbstractC0119d;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f3038a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0119d f3041d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3040c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f3039b = -1;

    public i(AbstractC0119d abstractC0119d) {
        this.f3041d = abstractC0119d;
        this.f3038a = abstractC0119d.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3040c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f3039b;
        AbstractC0119d abstractC0119d = this.f3041d;
        Object d2 = abstractC0119d.d(i2, 0);
        if (key != d2 && (key == null || !key.equals(d2))) {
            return false;
        }
        Object value = entry.getValue();
        Object d3 = abstractC0119d.d(this.f3039b, 1);
        return value == d3 || (value != null && value.equals(d3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3040c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3041d.d(this.f3039b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3040c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3041d.d(this.f3039b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3039b < this.f3038a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3040c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f3039b;
        AbstractC0119d abstractC0119d = this.f3041d;
        Object d2 = abstractC0119d.d(i2, 0);
        Object d3 = abstractC0119d.d(this.f3039b, 1);
        return (d2 == null ? 0 : d2.hashCode()) ^ (d3 != null ? d3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3039b++;
        this.f3040c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3040c) {
            throw new IllegalStateException();
        }
        this.f3041d.j(this.f3039b);
        this.f3039b--;
        this.f3038a--;
        this.f3040c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f3040c) {
            return this.f3041d.k(this.f3039b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
