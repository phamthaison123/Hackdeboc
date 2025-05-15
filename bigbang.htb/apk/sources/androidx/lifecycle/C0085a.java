package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0085a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1451a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f1452b;

    public C0085a(HashMap hashMap) {
        this.f1452b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar = (i) entry.getValue();
            List list = (List) this.f1451a.get(iVar);
            if (list == null) {
                list = new ArrayList();
                this.f1451a.put(iVar, list);
            }
            list.add((C0086b) entry.getKey());
        }
    }

    public static void a(List list, o oVar, i iVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0086b c0086b = (C0086b) list.get(size);
                c0086b.getClass();
                try {
                    int i2 = c0086b.f1453a;
                    Method method = c0086b.f1454b;
                    if (i2 == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i2 == 1) {
                        method.invoke(obj, oVar);
                    } else if (i2 == 2) {
                        method.invoke(obj, oVar, iVar);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
