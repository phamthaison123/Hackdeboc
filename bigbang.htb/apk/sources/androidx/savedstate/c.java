package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.B;
import java.util.Set;
import k.g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public g f1614a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1615b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1616c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.activity.d f1617d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1618e;

    public final Bundle a(String str) {
        if (!this.f1616c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f1615b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f1615b.remove(str);
        if (this.f1615b.isEmpty()) {
            this.f1615b = null;
        }
        return bundle2;
    }

    public final void b(String str, b bVar) {
        Object obj;
        g gVar = this.f1614a;
        k.c a2 = gVar.a(str);
        if (a2 != null) {
            obj = a2.f2994b;
        } else {
            k.c cVar = new k.c(str, bVar);
            gVar.f3005d++;
            k.c cVar2 = gVar.f3003b;
            if (cVar2 == null) {
                gVar.f3002a = cVar;
                gVar.f3003b = cVar;
            } else {
                cVar2.f2995c = cVar;
                cVar.f2996d = cVar2;
                gVar.f3003b = cVar;
            }
            obj = null;
        }
        if (((b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void c() {
        if (!this.f1618e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1617d == null) {
            this.f1617d = new androidx.activity.d(this);
        }
        try {
            B.class.getDeclaredConstructor(new Class[0]);
            ((Set) this.f1617d.f764b).add(B.class.getName());
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class" + B.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
