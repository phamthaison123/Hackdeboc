package androidx.fragment.app;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final l.k f1147b = new l.k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f1148a;

    public C(H h2) {
        this.f1148a = h2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        l.k kVar = f1147b;
        l.k kVar2 = (l.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new l.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new C0074o("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new C0074o("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    public final AbstractComponentCallbacksC0075p a(String str) {
        Context context = this.f1148a.f1185p.f1416d;
        Object obj = AbstractComponentCallbacksC0075p.f1369R;
        try {
            return (AbstractComponentCallbacksC0075p) c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new C0074o("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0074o("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0074o("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0074o("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }
}
