package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0087c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0087c f1455c = new C0087c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1456a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1457b = new HashMap();

    public static void b(HashMap hashMap, C0086b c0086b, i iVar, Class cls) {
        i iVar2 = (i) hashMap.get(c0086b);
        if (iVar2 == null || iVar == iVar2) {
            if (iVar2 == null) {
                hashMap.put(c0086b, iVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0086b.f1454b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + iVar2 + ", new value " + iVar);
    }

    public final C0085a a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1456a;
        if (superclass != null) {
            C0085a c0085a = (C0085a) hashMap2.get(superclass);
            if (c0085a == null) {
                c0085a = a(superclass, null);
            }
            hashMap.putAll(c0085a.f1452b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0085a c0085a2 = (C0085a) hashMap2.get(cls2);
            if (c0085a2 == null) {
                c0085a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0085a2.f1452b.entrySet()) {
                b(hashMap, (C0086b) entry.getKey(), (i) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            v vVar = (v) method.getAnnotation(v.class);
            if (vVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(o.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                i value = vVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(i.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != i.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0086b(i2, method), value, cls);
                z2 = true;
            }
        }
        C0085a c0085a3 = new C0085a(hashMap);
        hashMap2.put(cls, c0085a3);
        this.f1457b.put(cls, Boolean.valueOf(z2));
        return c0085a3;
    }
}
