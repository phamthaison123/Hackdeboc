package l;

import h.AbstractC0119d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0119d f3037b;

    public /* synthetic */ h(AbstractC0119d abstractC0119d, int i2) {
        this.f3036a = i2;
        this.f3037b = abstractC0119d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3036a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3036a) {
            case 0:
                AbstractC0119d abstractC0119d = this.f3037b;
                int f2 = abstractC0119d.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    abstractC0119d.i(entry.getKey(), entry.getValue());
                }
                return f2 != abstractC0119d.f();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i2 = this.f3036a;
        AbstractC0119d abstractC0119d = this.f3037b;
        switch (i2) {
            case 0:
                abstractC0119d.c();
                break;
            default:
                abstractC0119d.c();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i2 = this.f3036a;
        AbstractC0119d abstractC0119d = this.f3037b;
        switch (i2) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int g2 = abstractC0119d.g(entry.getKey());
                    if (g2 >= 0) {
                        Object d2 = abstractC0119d.d(g2, 1);
                        Object value = entry.getValue();
                        if (d2 == value || (d2 != null && d2.equals(value))) {
                            break;
                        }
                    }
                }
                break;
            default:
                if (abstractC0119d.g(obj) >= 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3036a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                C0190b e2 = this.f3037b.e();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!e2.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f3036a) {
        }
        return AbstractC0119d.l(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i2 = this.f3036a;
        AbstractC0119d abstractC0119d = this.f3037b;
        switch (i2) {
            case 0:
                int i3 = 0;
                for (int f2 = abstractC0119d.f() - 1; f2 >= 0; f2--) {
                    Object d2 = abstractC0119d.d(f2, 0);
                    Object d3 = abstractC0119d.d(f2, 1);
                    i3 += (d2 == null ? 0 : d2.hashCode()) ^ (d3 == null ? 0 : d3.hashCode());
                }
                return i3;
            default:
                int i4 = 0;
                for (int f3 = abstractC0119d.f() - 1; f3 >= 0; f3--) {
                    Object d4 = abstractC0119d.d(f3, 0);
                    i4 += d4 == null ? 0 : d4.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i2 = this.f3036a;
        AbstractC0119d abstractC0119d = this.f3037b;
        switch (i2) {
            case 0:
                if (abstractC0119d.f() == 0) {
                    break;
                }
                break;
            default:
                if (abstractC0119d.f() == 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.f3036a;
        AbstractC0119d abstractC0119d = this.f3037b;
        switch (i2) {
            case 0:
                return new i(abstractC0119d);
            default:
                return new g(abstractC0119d, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3036a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                AbstractC0119d abstractC0119d = this.f3037b;
                int g2 = abstractC0119d.g(obj);
                if (g2 < 0) {
                    return false;
                }
                abstractC0119d.j(g2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3036a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0190b e2 = this.f3037b.e();
                int i2 = e2.f3049c;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    e2.remove(it.next());
                }
                return i2 != e2.f3049c;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3036a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return AbstractC0119d.n(this.f3037b.e(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i2 = this.f3036a;
        AbstractC0119d abstractC0119d = this.f3037b;
        switch (i2) {
        }
        return abstractC0119d.f();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f3036a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                AbstractC0119d abstractC0119d = this.f3037b;
                int f2 = abstractC0119d.f();
                Object[] objArr = new Object[f2];
                for (int i2 = 0; i2 < f2; i2++) {
                    objArr[i2] = abstractC0119d.d(i2, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3036a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3037b.o(0, objArr);
        }
    }
}
