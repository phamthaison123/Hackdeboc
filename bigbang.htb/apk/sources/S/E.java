package S;

import F.AbstractC0023y;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f262a;

    public /* synthetic */ E(RecyclerView recyclerView) {
        this.f262a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        RecyclerView recyclerView = this.f262a;
        L l2 = recyclerView.f1532H;
        if (l2 != null) {
            C0035k c0035k = (C0035k) l2;
            ArrayList arrayList = c0035k.f422h;
            boolean z2 = !arrayList.isEmpty();
            ArrayList arrayList2 = c0035k.f424j;
            boolean z3 = !arrayList2.isEmpty();
            ArrayList arrayList3 = c0035k.f425k;
            boolean z4 = !arrayList3.isEmpty();
            ArrayList arrayList4 = c0035k.f423i;
            boolean z5 = !arrayList4.isEmpty();
            if (z2 || z3 || z5 || z4) {
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    j2 = c0035k.f273d;
                    if (!hasNext) {
                        break;
                    }
                    f0 f0Var = (f0) it.next();
                    View view = f0Var.f367a;
                    ViewPropertyAnimator animate = view.animate();
                    c0035k.f431q.add(f0Var);
                    animate.setDuration(j2).alpha(0.0f).setListener(new C0030f(c0035k, f0Var, animate, view)).start();
                    it = it;
                }
                arrayList.clear();
                if (z3) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.addAll(arrayList2);
                    c0035k.f427m.add(arrayList5);
                    arrayList2.clear();
                    RunnableC0029e runnableC0029e = new RunnableC0029e(c0035k, arrayList5, 0);
                    if (z2) {
                        View view2 = ((C0034j) arrayList5.get(0)).f408a.f367a;
                        WeakHashMap weakHashMap = F.O.f58a;
                        AbstractC0023y.n(view2, runnableC0029e, j2);
                    } else {
                        runnableC0029e.run();
                    }
                }
                if (z4) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(arrayList3);
                    c0035k.f428n.add(arrayList6);
                    arrayList3.clear();
                    RunnableC0029e runnableC0029e2 = new RunnableC0029e(c0035k, arrayList6, 1);
                    if (z2) {
                        View view3 = ((C0033i) arrayList6.get(0)).f400a.f367a;
                        WeakHashMap weakHashMap2 = F.O.f58a;
                        AbstractC0023y.n(view3, runnableC0029e2, j2);
                    } else {
                        runnableC0029e2.run();
                    }
                }
                if (z5) {
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    c0035k.f426l.add(arrayList7);
                    arrayList4.clear();
                    RunnableC0029e runnableC0029e3 = new RunnableC0029e(c0035k, arrayList7, 2);
                    if (z2 || z3 || z4) {
                        if (!z2) {
                            j2 = 0;
                        }
                        long max = Math.max(z3 ? c0035k.f274e : 0L, z4 ? c0035k.f275f : 0L) + j2;
                        View view4 = ((f0) arrayList7.get(0)).f367a;
                        WeakHashMap weakHashMap3 = F.O.f58a;
                        AbstractC0023y.n(view4, runnableC0029e3, max);
                    } else {
                        runnableC0029e3.run();
                    }
                }
            }
        }
        recyclerView.f1565i0 = false;
    }
}
