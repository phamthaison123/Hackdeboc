package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
class ReflectiveGenericLifecycleObserver implements m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1448a;

    /* renamed from: b, reason: collision with root package name */
    public final C0085a f1449b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1448a = obj;
        C0087c c0087c = C0087c.f1455c;
        Class<?> cls = obj.getClass();
        C0085a c0085a = (C0085a) c0087c.f1456a.get(cls);
        this.f1449b = c0085a == null ? c0087c.a(cls, null) : c0085a;
    }

    @Override // androidx.lifecycle.m
    public final void b(o oVar, i iVar) {
        HashMap hashMap = this.f1449b.f1451a;
        List list = (List) hashMap.get(iVar);
        Object obj = this.f1448a;
        C0085a.a(list, oVar, iVar, obj);
        C0085a.a((List) hashMap.get(i.ON_ANY), oVar, iVar, obj);
    }
}
