package androidx.lifecycle;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
class FullLifecycleObserverAdapter implements m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0088d f1446a;

    /* renamed from: b, reason: collision with root package name */
    public final m f1447b;

    public FullLifecycleObserverAdapter(InterfaceC0088d interfaceC0088d, m mVar) {
        this.f1446a = interfaceC0088d;
        this.f1447b = mVar;
    }

    @Override // androidx.lifecycle.m
    public final void b(o oVar, i iVar) {
        int i2 = f.f1458a[iVar.ordinal()];
        InterfaceC0088d interfaceC0088d = this.f1446a;
        switch (i2) {
            case 1:
                interfaceC0088d.getClass();
                break;
            case 2:
                interfaceC0088d.getClass();
                break;
            case 3:
                interfaceC0088d.a();
                break;
            case 4:
                interfaceC0088d.getClass();
                break;
            case 5:
                interfaceC0088d.getClass();
                break;
            case 6:
                interfaceC0088d.getClass();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        m mVar = this.f1447b;
        if (mVar != null) {
            mVar.b(oVar, iVar);
        }
    }
}
