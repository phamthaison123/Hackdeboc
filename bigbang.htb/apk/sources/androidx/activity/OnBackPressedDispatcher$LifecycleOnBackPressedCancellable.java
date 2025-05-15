package androidx.activity;

import androidx.fragment.app.B;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import java.util.ArrayDeque;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements m, a {

    /* renamed from: a, reason: collision with root package name */
    public final D.g f749a;

    /* renamed from: b, reason: collision with root package name */
    public final B f750b;

    /* renamed from: c, reason: collision with root package name */
    public g f751c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f752d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(h hVar, D.g gVar, B b2) {
        this.f752d = hVar;
        this.f749a = gVar;
        this.f750b = b2;
        gVar.a(this);
    }

    @Override // androidx.lifecycle.m
    public final void b(o oVar, androidx.lifecycle.i iVar) {
        if (iVar == androidx.lifecycle.i.ON_START) {
            h hVar = this.f752d;
            ArrayDeque arrayDeque = hVar.f771b;
            B b2 = this.f750b;
            arrayDeque.add(b2);
            g gVar = new g(hVar, b2);
            b2.f1145b.add(gVar);
            this.f751c = gVar;
            return;
        }
        if (iVar != androidx.lifecycle.i.ON_STOP) {
            if (iVar == androidx.lifecycle.i.ON_DESTROY) {
                cancel();
            }
        } else {
            g gVar2 = this.f751c;
            if (gVar2 != null) {
                gVar2.cancel();
            }
        }
    }

    @Override // androidx.activity.a
    public final void cancel() {
        this.f749a.d(this);
        this.f750b.f1145b.remove(this);
        g gVar = this.f751c;
        if (gVar != null) {
            gVar.cancel();
            this.f751c = null;
        }
    }
}
