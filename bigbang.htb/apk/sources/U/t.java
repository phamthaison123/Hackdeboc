package U;

import F.O;
import F.Q;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.C0190b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final C0050a f654a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f655b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f656c;

    static {
        C0050a c0050a = new C0050a();
        c0050a.f661y = false;
        c0050a.H(new i(2));
        c0050a.H(new C0056g());
        c0050a.H(new i(1));
        f654a = c0050a;
        f655b = new ThreadLocal();
        f656c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, q qVar) {
        ArrayList arrayList = f656c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = O.f58a;
        if (F.B.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (qVar == null) {
                qVar = f654a;
            }
            q clone = qVar.clone();
            ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).u(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            Q.i(viewGroup.getTag(2131296674));
            viewGroup.setTag(2131296674, null);
            if (clone != null) {
                s sVar = new s();
                sVar.f652a = clone;
                sVar.f653b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(sVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(sVar);
            }
        }
    }

    public static C0190b b() {
        C0190b c0190b;
        ThreadLocal threadLocal = f655b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0190b = (C0190b) weakReference.get()) != null) {
            return c0190b;
        }
        C0190b c0190b2 = new C0190b();
        threadLocal.set(new WeakReference(c0190b2));
        return c0190b2;
    }
}
