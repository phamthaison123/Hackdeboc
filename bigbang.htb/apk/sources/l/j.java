package l;

import h.AbstractC0119d;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0119d f3042a;

    public j(AbstractC0119d abstractC0119d) {
        this.f3042a = abstractC0119d;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f3042a.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3042a.h(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3042a.f() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f3042a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC0119d abstractC0119d = this.f3042a;
        int h2 = abstractC0119d.h(obj);
        if (h2 < 0) {
            return false;
        }
        abstractC0119d.j(h2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC0119d abstractC0119d = this.f3042a;
        int f2 = abstractC0119d.f();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < f2) {
            if (collection.contains(abstractC0119d.d(i2, 1))) {
                abstractC0119d.j(i2);
                i2--;
                f2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC0119d abstractC0119d = this.f3042a;
        int f2 = abstractC0119d.f();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < f2) {
            if (!collection.contains(abstractC0119d.d(i2, 1))) {
                abstractC0119d.j(i2);
                i2--;
                f2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3042a.f();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3042a.o(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        AbstractC0119d abstractC0119d = this.f3042a;
        int f2 = abstractC0119d.f();
        Object[] objArr = new Object[f2];
        for (int i2 = 0; i2 < f2; i2++) {
            objArr[i2] = abstractC0119d.d(i2, 1);
        }
        return objArr;
    }
}
