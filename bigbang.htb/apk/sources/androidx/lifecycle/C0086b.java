package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0086b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1453a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1454b;

    public C0086b(int i2, Method method) {
        this.f1453a = i2;
        this.f1454b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0086b)) {
            return false;
        }
        C0086b c0086b = (C0086b) obj;
        return this.f1453a == c0086b.f1453a && this.f1454b.getName().equals(c0086b.f1454b.getName());
    }

    public final int hashCode() {
        return this.f1454b.getName().hashCode() + (this.f1453a * 31);
    }
}
