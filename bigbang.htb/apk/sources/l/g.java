package l;

import h.AbstractC0119d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f3031a;

    /* renamed from: b, reason: collision with root package name */
    public int f3032b;

    /* renamed from: c, reason: collision with root package name */
    public int f3033c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3034d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0119d f3035e;

    public g(AbstractC0119d abstractC0119d, int i2) {
        this.f3035e = abstractC0119d;
        this.f3031a = i2;
        this.f3032b = abstractC0119d.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3033c < this.f3032b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object d2 = this.f3035e.d(this.f3033c, this.f3031a);
        this.f3033c++;
        this.f3034d = true;
        return d2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3034d) {
            throw new IllegalStateException();
        }
        int i2 = this.f3033c - 1;
        this.f3033c = i2;
        this.f3032b--;
        this.f3034d = false;
        this.f3035e.j(i2);
    }
}
