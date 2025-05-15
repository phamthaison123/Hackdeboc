package e;

import F.Q;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.fragment.app.c0;
import java.util.HashSet;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public Object f2138a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2139b;

    public s(c0 c0Var, B.c cVar) {
        this.f2138a = c0Var;
        this.f2139b = cVar;
    }

    public final void a() {
        Object obj = this.f2138a;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((v) this.f2139b).f2187d.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f2138a = null;
        }
    }

    public final void b() {
        c0 c0Var = (c0) this.f2138a;
        B.c cVar = (B.c) this.f2139b;
        HashSet hashSet = c0Var.f1311e;
        if (hashSet.remove(cVar) && hashSet.isEmpty()) {
            c0Var.b();
        }
    }

    public abstract IntentFilter c();

    public abstract int d();

    public final boolean e() {
        int c2 = Q.c(((c0) this.f2138a).f1309c.f1374E);
        int i2 = ((c0) this.f2138a).f1307a;
        return c2 == i2 || !(c2 == 2 || i2 == 2);
    }

    public abstract void f();

    public final void g() {
        a();
        IntentFilter c2 = c();
        if (c2.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f2138a) == null) {
            this.f2138a = new r(this);
        }
        ((v) this.f2139b).f2187d.registerReceiver((BroadcastReceiver) this.f2138a, c2);
    }

    public s(v vVar) {
        this.f2139b = vVar;
    }
}
