package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class B implements androidx.savedstate.a {
    public final void a(androidx.savedstate.e eVar) {
        Object obj;
        boolean z2;
        if (!(eVar instanceof E)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
        D b2 = ((E) eVar).b();
        androidx.savedstate.c a2 = eVar.a();
        b2.getClass();
        Iterator it = new HashSet(b2.f1445a.keySet()).iterator();
        while (it.hasNext()) {
            C c2 = (C) b2.f1445a.get((String) it.next());
            q d2 = eVar.d();
            HashMap hashMap = c2.f1443a;
            if (hashMap == null) {
                obj = null;
            } else {
                synchronized (hashMap) {
                    obj = c2.f1443a.get("androidx.lifecycle.savedstate.vm.tag");
                }
            }
            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
            if (savedStateHandleController != null && !(z2 = savedStateHandleController.f1450a)) {
                if (z2) {
                    throw new IllegalStateException("Already attached to lifecycleOwner");
                }
                savedStateHandleController.f1450a = true;
                d2.a(savedStateHandleController);
                throw null;
            }
        }
        if (new HashSet(b2.f1445a.keySet()).isEmpty()) {
            return;
        }
        a2.c();
    }
}
