package androidx.lifecycle;

import F.Q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1478a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1479b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Q.i(constructor.newInstance(obj));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r7.booleanValue() != false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.Class r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.r.c(java.lang.Class):int");
    }
}
