package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1228a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1229b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public J f1230c;

    public final void a(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (this.f1228a.contains(abstractComponentCallbacksC0075p)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0075p);
        }
        synchronized (this.f1228a) {
            this.f1228a.add(abstractComponentCallbacksC0075p);
        }
        abstractComponentCallbacksC0075p.f1397k = true;
    }

    public final AbstractComponentCallbacksC0075p b(String str) {
        M m2 = (M) this.f1229b.get(str);
        if (m2 != null) {
            return m2.f1225c;
        }
        return null;
    }

    public final AbstractComponentCallbacksC0075p c(String str) {
        for (M m2 : this.f1229b.values()) {
            if (m2 != null) {
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
                if (!str.equals(abstractComponentCallbacksC0075p.f1391e)) {
                    abstractComponentCallbacksC0075p = abstractComponentCallbacksC0075p.f1406t.f1172c.c(str);
                }
                if (abstractComponentCallbacksC0075p != null) {
                    return abstractComponentCallbacksC0075p;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (M m2 : this.f1229b.values()) {
            if (m2 != null) {
                arrayList.add(m2);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (M m2 : this.f1229b.values()) {
            if (m2 != null) {
                arrayList.add(m2.f1225c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f1228a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1228a) {
            arrayList = new ArrayList(this.f1228a);
        }
        return arrayList;
    }

    public final void g(M m2) {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
        String str = abstractComponentCallbacksC0075p.f1391e;
        HashMap hashMap = this.f1229b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0075p.f1391e, m2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0075p);
        }
    }

    public final void h(M m2) {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
        if (abstractComponentCallbacksC0075p.f1370A) {
            this.f1230c.b(abstractComponentCallbacksC0075p);
        }
        if (((M) this.f1229b.put(abstractComponentCallbacksC0075p.f1391e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0075p);
        }
    }
}
