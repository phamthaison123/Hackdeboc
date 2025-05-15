package androidx.lifecycle;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
final class SavedStateHandleController implements m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1450a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1, reason: invalid class name */
    class AnonymousClass1 implements m {
        @Override // androidx.lifecycle.m
        public final void b(o oVar, i iVar) {
            if (iVar == i.ON_START) {
                throw null;
            }
        }
    }

    @Override // androidx.lifecycle.m
    public final void b(o oVar, i iVar) {
        if (iVar == i.ON_DESTROY) {
            this.f1450a = false;
            oVar.d().d(this);
        }
    }
}
