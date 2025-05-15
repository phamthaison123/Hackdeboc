package androidx.lifecycle;

import S.N;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l;
import j.C0184a;
import java.util.Map;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class u {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1484j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1485a;

    /* renamed from: b, reason: collision with root package name */
    public final k.g f1486b = new k.g();

    /* renamed from: c, reason: collision with root package name */
    public int f1487c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1488d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1489e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1490f;

    /* renamed from: g, reason: collision with root package name */
    public int f1491g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1492h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1493i;

    public u() {
        Object obj = f1484j;
        this.f1490f = obj;
        this.f1489e = obj;
        this.f1491g = -1;
    }

    public static void a(String str) {
        if (C0184a.k0().f2966c.k0()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(t tVar) {
        if (tVar.f1481b) {
            if (!tVar.e()) {
                tVar.c(false);
                return;
            }
            int i2 = tVar.f1482c;
            int i3 = this.f1491g;
            if (i2 >= i3) {
                return;
            }
            tVar.f1482c = i3;
            N n2 = tVar.f1480a;
            Object obj = this.f1489e;
            n2.getClass();
            if (((o) obj) != null) {
                DialogInterfaceOnCancelListenerC0071l dialogInterfaceOnCancelListenerC0071l = (DialogInterfaceOnCancelListenerC0071l) n2.f277b;
                if (dialogInterfaceOnCancelListenerC0071l.f1345Z) {
                    View C2 = dialogInterfaceOnCancelListenerC0071l.C();
                    if (C2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0071l.f1349d0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "DialogFragment " + n2 + " setting the content view on " + dialogInterfaceOnCancelListenerC0071l.f1349d0);
                        }
                        dialogInterfaceOnCancelListenerC0071l.f1349d0.setContentView(C2);
                    }
                }
            }
        }
    }

    public final void c(t tVar) {
        if (this.f1492h) {
            this.f1493i = true;
            return;
        }
        this.f1492h = true;
        do {
            this.f1493i = false;
            if (tVar != null) {
                b(tVar);
                tVar = null;
            } else {
                k.g gVar = this.f1486b;
                gVar.getClass();
                k.d dVar = new k.d(gVar);
                gVar.f3004c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((t) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1493i) {
                        break;
                    }
                }
            }
        } while (this.f1493i);
        this.f1492h = false;
    }

    public final void d(N n2) {
        Object obj;
        a("observeForever");
        s sVar = new s(this, n2);
        k.g gVar = this.f1486b;
        k.c a2 = gVar.a(n2);
        if (a2 != null) {
            obj = a2.f2994b;
        } else {
            k.c cVar = new k.c(n2, sVar);
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
        t tVar = (t) obj;
        if (tVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (tVar != null) {
            return;
        }
        sVar.c(true);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f1491g++;
        this.f1489e = obj;
        c(null);
    }
}
