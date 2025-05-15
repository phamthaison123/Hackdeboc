package e;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import l.C0191c;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final C0191c f2122a = new C0191c();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2123b = new Object();

    public static void f(k kVar) {
        synchronized (f2123b) {
            try {
                Iterator it = f2122a.iterator();
                while (it.hasNext()) {
                    k kVar2 = (k) ((WeakReference) it.next()).get();
                    if (kVar2 == kVar || kVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void e();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(CharSequence charSequence);
}
