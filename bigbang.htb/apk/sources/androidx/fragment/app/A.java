package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class A implements androidx.activity.result.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f1143b;

    public /* synthetic */ A(H h2, int i2) {
        this.f1142a = i2;
        this.f1143b = h2;
    }

    public final void a(androidx.activity.result.b bVar) {
        int i2 = this.f1142a;
        H h2 = this.f1143b;
        switch (i2) {
            case 0:
                E e2 = (E) h2.f1194y.pollFirst();
                if (e2 != null) {
                    String str = e2.f1150a;
                    AbstractComponentCallbacksC0075p c2 = h2.f1172c.c(str);
                    if (c2 != null) {
                        c2.o(e2.f1151b, bVar.f773a, bVar.f774b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                }
            default:
                E e3 = (E) h2.f1194y.pollFirst();
                if (e3 != null) {
                    String str2 = e3.f1150a;
                    AbstractComponentCallbacksC0075p c3 = h2.f1172c.c(str2);
                    if (c3 != null) {
                        c3.o(e3.f1151b, bVar.f773a, bVar.f774b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
        }
    }

    public final void b(Object obj) {
        switch (this.f1142a) {
            case 0:
                a((androidx.activity.result.b) obj);
                break;
            case 1:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                H h2 = this.f1143b;
                E e2 = (E) h2.f1194y.pollFirst();
                if (e2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = e2.f1150a;
                    if (h2.f1172c.c(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            default:
                a((androidx.activity.result.b) obj);
                break;
        }
    }

    public final void c(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, B.c cVar) {
        boolean z2;
        synchronized (cVar) {
            z2 = cVar.f2a;
        }
        if (z2) {
            return;
        }
        H h2 = this.f1143b;
        HashSet hashSet = (HashSet) h2.f1180k.get(abstractComponentCallbacksC0075p);
        if (hashSet != null && hashSet.remove(cVar) && hashSet.isEmpty()) {
            h2.f1180k.remove(abstractComponentCallbacksC0075p);
            if (abstractComponentCallbacksC0075p.f1387a < 5) {
                abstractComponentCallbacksC0075p.A();
                h2.f1182m.p(false);
                abstractComponentCallbacksC0075p.f1373D = null;
                abstractComponentCallbacksC0075p.f1374E = null;
                abstractComponentCallbacksC0075p.f1383N = null;
                abstractComponentCallbacksC0075p.f1384O.e(null);
                abstractComponentCallbacksC0075p.f1400n = false;
                h2.H(h2.f1184o, abstractComponentCallbacksC0075p);
            }
        }
    }

    public final void d(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, B.c cVar) {
        H h2 = this.f1143b;
        if (h2.f1180k.get(abstractComponentCallbacksC0075p) == null) {
            h2.f1180k.put(abstractComponentCallbacksC0075p, new HashSet());
        }
        ((HashSet) h2.f1180k.get(abstractComponentCallbacksC0075p)).add(cVar);
    }
}
