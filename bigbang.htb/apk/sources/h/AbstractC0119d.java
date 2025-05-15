package h;

import android.content.Context;
import android.view.MenuItem;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l.C0190b;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractC0119d {

    /* renamed from: a, reason: collision with root package name */
    public Object f2394a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2395b;

    /* renamed from: c, reason: collision with root package name */
    public l.j f2396c;

    public AbstractC0119d(Context context) {
        this.f2394a = context;
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean n(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void c();

    public abstract Object d(int i2, int i3);

    public abstract C0190b e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i2);

    public abstract Object k(int i2, Object obj);

    public final MenuItem m(MenuItem menuItem) {
        if (!(menuItem instanceof A.b)) {
            return menuItem;
        }
        A.b bVar = (A.b) menuItem;
        if (((l.k) this.f2395b) == null) {
            this.f2395b = new l.k();
        }
        MenuItem menuItem2 = (MenuItem) ((l.k) this.f2395b).getOrDefault(menuItem, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        w wVar = new w((Context) this.f2394a, bVar);
        ((l.k) this.f2395b).put(bVar, wVar);
        return wVar;
    }

    public final Object[] o(int i2, Object[] objArr) {
        int f2 = f();
        if (objArr.length < f2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), f2);
        }
        for (int i3 = 0; i3 < f2; i3++) {
            objArr[i3] = d(i3, i2);
        }
        if (objArr.length > f2) {
            objArr[f2] = null;
        }
        return objArr;
    }
}
