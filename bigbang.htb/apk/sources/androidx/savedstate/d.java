package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import java.util.Map;
import k.g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f1619a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1620b;

    public d(e eVar) {
        this.f1619a = eVar;
        c cVar = new c();
        cVar.f1614a = new g();
        cVar.f1618e = true;
        this.f1620b = cVar;
    }

    public final void a(Bundle bundle) {
        e eVar = this.f1619a;
        q d2 = eVar.d();
        if (d2.f1471c != j.f1462b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        d2.a(new Recreator(eVar));
        final c cVar = this.f1620b;
        if (cVar.f1616c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            cVar.f1615b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        d2.a(new m() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // androidx.lifecycle.m
            public final void b(o oVar, i iVar) {
                i iVar2 = i.ON_START;
                c cVar2 = c.this;
                if (iVar == iVar2) {
                    cVar2.f1618e = true;
                } else if (iVar == i.ON_STOP) {
                    cVar2.f1618e = false;
                }
            }
        });
        cVar.f1616c = true;
    }

    public final void b(Bundle bundle) {
        c cVar = this.f1620b;
        cVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = cVar.f1615b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        g gVar = cVar.f1614a;
        gVar.getClass();
        k.d dVar = new k.d(gVar);
        gVar.f3004c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
