package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class J extends androidx.lifecycle.C {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1207e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1204b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1205c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1206d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1208f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1209g = false;

    public J(boolean z2) {
        this.f1207e = z2;
    }

    @Override // androidx.lifecycle.C
    public final void a() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1208f = true;
    }

    public final void b(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        if (this.f1209g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1204b.remove(abstractComponentCallbacksC0075p.f1391e) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0075p);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j2 = (J) obj;
        return this.f1204b.equals(j2.f1204b) && this.f1205c.equals(j2.f1205c) && this.f1206d.equals(j2.f1206d);
    }

    public final int hashCode() {
        return this.f1206d.hashCode() + ((this.f1205c.hashCode() + (this.f1204b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1204b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1205c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1206d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
