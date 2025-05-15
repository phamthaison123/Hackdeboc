package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1320a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1321b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1322c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1323d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1324e = false;

    public d0(ViewGroup viewGroup) {
        this.f1320a = viewGroup;
    }

    public static d0 f(ViewGroup viewGroup, A a2) {
        Object tag = viewGroup.getTag(2131296609);
        if (tag instanceof d0) {
            return (d0) tag;
        }
        a2.getClass();
        C0067h c0067h = new C0067h(viewGroup);
        viewGroup.setTag(2131296609, c0067h);
        return c0067h;
    }

    public final void a(int i2, int i3, M m2) {
        synchronized (this.f1321b) {
            try {
                B.c cVar = new B.c();
                c0 d2 = d(m2.f1225c);
                if (d2 != null) {
                    d2.c(i2, i3);
                    return;
                }
                c0 c0Var = new c0(i2, i3, m2, cVar);
                this.f1321b.add(c0Var);
                c0Var.f1310d.add(new b0(this, c0Var, 0));
                c0Var.f1310d.add(new b0(this, c0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(ArrayList arrayList, boolean z2);

    public final void c() {
        if (this.f1324e) {
            return;
        }
        ViewGroup viewGroup = this.f1320a;
        WeakHashMap weakHashMap = F.O.f58a;
        if (!F.B.b(viewGroup)) {
            e();
            this.f1323d = false;
            return;
        }
        synchronized (this.f1321b) {
            try {
                if (!this.f1321b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1322c);
                    this.f1322c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c0 c0Var = (c0) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0Var);
                        }
                        c0Var.a();
                        if (!c0Var.f1313g) {
                            this.f1322c.add(c0Var);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.f1321b);
                    this.f1321b.clear();
                    this.f1322c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((c0) it2.next()).d();
                    }
                    b(arrayList2, this.f1323d);
                    this.f1323d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c0 d(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        Iterator it = this.f1321b.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var.f1309c.equals(abstractComponentCallbacksC0075p) && !c0Var.f1312f) {
                return c0Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1320a;
        WeakHashMap weakHashMap = F.O.f58a;
        boolean b2 = F.B.b(viewGroup);
        synchronized (this.f1321b) {
            try {
                h();
                Iterator it = this.f1321b.iterator();
                while (it.hasNext()) {
                    ((c0) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f1322c).iterator();
                while (it2.hasNext()) {
                    c0 c0Var = (c0) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (b2) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1320a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(c0Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c0Var.a();
                }
                Iterator it3 = new ArrayList(this.f1321b).iterator();
                while (it3.hasNext()) {
                    c0 c0Var2 = (c0) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (b2) {
                            str = "";
                        } else {
                            str = "Container " + this.f1320a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(c0Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    c0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f1321b) {
            try {
                h();
                this.f1324e = false;
                int size = this.f1321b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    c0 c0Var = (c0) this.f1321b.get(size);
                    int c2 = F.Q.c(c0Var.f1309c.f1374E);
                    if (c0Var.f1307a == 2 && c2 != 2) {
                        c0Var.f1309c.getClass();
                        this.f1324e = false;
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        Iterator it = this.f1321b.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var.f1308b == 2) {
                c0Var.c(F.Q.b(c0Var.f1309c.C().getVisibility()), 1);
            }
        }
    }
}
