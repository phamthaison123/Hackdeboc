package T;

import android.content.Context;
import android.os.Trace;
import androidx.fragment.app.C0074o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f569d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f570e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f573c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f572b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f571a = new HashMap();

    public a(Context context) {
        this.f573c = context.getApplicationContext();
    }

    public static a b(Context context) {
        if (f569d == null) {
            synchronized (f570e) {
                try {
                    if (f569d == null) {
                        f569d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f569d;
    }

    public final Object a(Class cls, HashSet hashSet) {
        Object obj;
        synchronized (f570e) {
            if (B.a.J()) {
                try {
                    Trace.beginSection(cls.getSimpleName());
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            if (hashSet.contains(cls)) {
                throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
            }
            if (this.f571a.containsKey(cls)) {
                obj = this.f571a.get(cls);
            } else {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class> a2 = bVar.a();
                    if (!a2.isEmpty()) {
                        for (Class cls2 : a2) {
                            if (!this.f571a.containsKey(cls2)) {
                                a(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.b(this.f573c);
                    hashSet.remove(cls);
                    this.f571a.put(cls, obj);
                } catch (Throwable th2) {
                    throw new C0074o(th2);
                }
            }
            Trace.endSection();
        }
        return obj;
    }
}
