package U;

import F.AbstractC0023y;
import F.O;
import F.Q;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import g.C0107g;
import i.C0139d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.AbstractC0192d;
import l.C0190b;
import l.C0193e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class q implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f629u = {2, 1, 3, 4};

    /* renamed from: v, reason: collision with root package name */
    public static final m0.e f630v = new m0.e(14);

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f631w = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f642k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f643l;

    /* renamed from: s, reason: collision with root package name */
    public B.a f650s;

    /* renamed from: a, reason: collision with root package name */
    public final String f632a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f633b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f634c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f635d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f636e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f637f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public C0107g f638g = new C0107g(5);

    /* renamed from: h, reason: collision with root package name */
    public C0107g f639h = new C0107g(5);

    /* renamed from: i, reason: collision with root package name */
    public v f640i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f641j = f629u;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f644m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f645n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f646o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f647p = false;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f648q = null;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f649r = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public m0.e f651t = f630v;

    public static void c(C0107g c0107g, View view, w wVar) {
        ((C0190b) c0107g.f2292a).put(view, wVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) c0107g.f2293b).indexOfKey(id) >= 0) {
                ((SparseArray) c0107g.f2293b).put(id, null);
            } else {
                ((SparseArray) c0107g.f2293b).put(id, view);
            }
        }
        WeakHashMap weakHashMap = O.f58a;
        String k2 = F.E.k(view);
        if (k2 != null) {
            if (((C0190b) c0107g.f2295d).containsKey(k2)) {
                ((C0190b) c0107g.f2295d).put(k2, null);
            } else {
                ((C0190b) c0107g.f2295d).put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0193e c0193e = (C0193e) c0107g.f2294c;
                if (c0193e.f3022a) {
                    c0193e.c();
                }
                if (AbstractC0192d.b(c0193e.f3023b, c0193e.f3025d, itemIdAtPosition) < 0) {
                    AbstractC0023y.r(view, true);
                    ((C0193e) c0107g.f2294c).e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ((C0193e) c0107g.f2294c).d(itemIdAtPosition, null);
                if (view2 != null) {
                    AbstractC0023y.r(view2, false);
                    ((C0193e) c0107g.f2294c).e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C0190b o() {
        ThreadLocal threadLocal = f631w;
        C0190b c0190b = (C0190b) threadLocal.get();
        if (c0190b != null) {
            return c0190b;
        }
        C0190b c0190b2 = new C0190b();
        threadLocal.set(c0190b2);
        return c0190b2;
    }

    public static boolean t(w wVar, w wVar2, String str) {
        Object obj = wVar.f663a.get(str);
        Object obj2 = wVar2.f663a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(B.a aVar) {
        this.f650s = aVar;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.f635d = timeInterpolator;
    }

    public void C(m0.e eVar) {
        if (eVar == null) {
            this.f651t = f630v;
        } else {
            this.f651t = eVar;
        }
    }

    public void D() {
    }

    public void E(long j2) {
        this.f633b = j2;
    }

    public final void F() {
        if (this.f645n == 0) {
            ArrayList arrayList = this.f648q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f648q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((p) arrayList2.get(i2)).d();
                }
            }
            this.f647p = false;
        }
        this.f645n++;
    }

    public String G(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f634c != -1) {
            str2 = str2 + "dur(" + this.f634c + ") ";
        }
        if (this.f633b != -1) {
            str2 = str2 + "dly(" + this.f633b + ") ";
        }
        if (this.f635d != null) {
            str2 = str2 + "interp(" + this.f635d + ") ";
        }
        ArrayList arrayList = this.f636e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f637f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String d2 = Q.d(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    d2 = Q.d(d2, ", ");
                }
                d2 = d2 + arrayList.get(i2);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (i3 > 0) {
                    d2 = Q.d(d2, ", ");
                }
                d2 = d2 + arrayList2.get(i3);
            }
        }
        return Q.d(d2, ")");
    }

    public void a(p pVar) {
        if (this.f648q == null) {
            this.f648q = new ArrayList();
        }
        this.f648q.add(pVar);
    }

    public void b(View view) {
        this.f637f.add(view);
    }

    public abstract void d(w wVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            w wVar = new w(view);
            if (z2) {
                g(wVar);
            } else {
                d(wVar);
            }
            wVar.f665c.add(this);
            f(wVar);
            if (z2) {
                c(this.f638g, view, wVar);
            } else {
                c(this.f639h, view, wVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    public void f(w wVar) {
    }

    public abstract void g(w wVar);

    public final void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f636e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f637f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (findViewById != null) {
                w wVar = new w(findViewById);
                if (z2) {
                    g(wVar);
                } else {
                    d(wVar);
                }
                wVar.f665c.add(this);
                f(wVar);
                if (z2) {
                    c(this.f638g, findViewById, wVar);
                } else {
                    c(this.f639h, findViewById, wVar);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            w wVar2 = new w(view);
            if (z2) {
                g(wVar2);
            } else {
                d(wVar2);
            }
            wVar2.f665c.add(this);
            f(wVar2);
            if (z2) {
                c(this.f638g, view, wVar2);
            } else {
                c(this.f639h, view, wVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((C0190b) this.f638g.f2292a).clear();
            ((SparseArray) this.f638g.f2293b).clear();
            ((C0193e) this.f638g.f2294c).a();
        } else {
            ((C0190b) this.f639h.f2292a).clear();
            ((SparseArray) this.f639h.f2293b).clear();
            ((C0193e) this.f639h.f2294c).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            q qVar = (q) super.clone();
            qVar.f649r = new ArrayList();
            qVar.f638g = new C0107g(5);
            qVar.f639h = new C0107g(5);
            qVar.f642k = null;
            qVar.f643l = null;
            return qVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, C0107g c0107g, C0107g c0107g2, ArrayList arrayList, ArrayList arrayList2) {
        Animator k2;
        int i2;
        View view;
        w wVar;
        Animator animator;
        C0190b o2 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            w wVar2 = (w) arrayList.get(i3);
            w wVar3 = (w) arrayList2.get(i3);
            w wVar4 = null;
            if (wVar2 != null && !wVar2.f665c.contains(this)) {
                wVar2 = null;
            }
            if (wVar3 != null && !wVar3.f665c.contains(this)) {
                wVar3 = null;
            }
            if (!(wVar2 == null && wVar3 == null) && ((wVar2 == null || wVar3 == null || r(wVar2, wVar3)) && (k2 = k(viewGroup, wVar2, wVar3)) != null)) {
                String str = this.f632a;
                if (wVar3 != null) {
                    String[] p2 = p();
                    view = wVar3.f664b;
                    if (p2 != null && p2.length > 0) {
                        wVar = new w(view);
                        w wVar5 = (w) ((C0190b) c0107g2.f2292a).getOrDefault(view, null);
                        i2 = size;
                        if (wVar5 != null) {
                            int i4 = 0;
                            while (i4 < p2.length) {
                                HashMap hashMap = wVar.f663a;
                                String str2 = p2[i4];
                                hashMap.put(str2, wVar5.f663a.get(str2));
                                i4++;
                                p2 = p2;
                            }
                        }
                        int i5 = o2.f3049c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            animator = null;
                            o oVar = (o) o2.getOrDefault((Animator) o2.h(i6), null);
                            if (oVar.f626c != null && oVar.f624a == view && oVar.f625b.equals(str) && oVar.f626c.equals(wVar)) {
                                break;
                            }
                        }
                    } else {
                        i2 = size;
                        wVar = null;
                    }
                    animator = k2;
                    k2 = animator;
                    wVar4 = wVar;
                } else {
                    i2 = size;
                    view = wVar2.f664b;
                }
                if (k2 != null) {
                    C0052c c0052c = x.f666a;
                    G g2 = new G(viewGroup);
                    o oVar2 = new o();
                    oVar2.f624a = view;
                    oVar2.f625b = str;
                    oVar2.f626c = wVar4;
                    oVar2.f627d = g2;
                    oVar2.f628e = this;
                    o2.put(k2, oVar2);
                    this.f649r.add(k2);
                }
            } else {
                i2 = size;
            }
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator2 = (Animator) this.f649r.get(sparseIntArray.keyAt(i7));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i2 = this.f645n - 1;
        this.f645n = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f648q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f648q.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((p) arrayList2.get(i3)).c(this);
                }
            }
            for (int i4 = 0; i4 < ((C0193e) this.f638g.f2294c).f(); i4++) {
                View view = (View) ((C0193e) this.f638g.f2294c).g(i4);
                if (view != null) {
                    WeakHashMap weakHashMap = O.f58a;
                    AbstractC0023y.r(view, false);
                }
            }
            for (int i5 = 0; i5 < ((C0193e) this.f639h.f2294c).f(); i5++) {
                View view2 = (View) ((C0193e) this.f639h.f2294c).g(i5);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = O.f58a;
                    AbstractC0023y.r(view2, false);
                }
            }
            this.f647p = true;
        }
    }

    public final w n(View view, boolean z2) {
        v vVar = this.f640i;
        if (vVar != null) {
            return vVar.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f642k : this.f643l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            w wVar = (w) arrayList.get(i2);
            if (wVar == null) {
                return null;
            }
            if (wVar.f664b == view) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return (w) (z2 ? this.f643l : this.f642k).get(i2);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public final w q(View view, boolean z2) {
        v vVar = this.f640i;
        if (vVar != null) {
            return vVar.q(view, z2);
        }
        return (w) ((C0190b) (z2 ? this.f638g : this.f639h).f2292a).getOrDefault(view, null);
    }

    public boolean r(w wVar, w wVar2) {
        if (wVar == null || wVar2 == null) {
            return false;
        }
        String[] p2 = p();
        if (p2 == null) {
            Iterator it = wVar.f663a.keySet().iterator();
            while (it.hasNext()) {
                if (t(wVar, wVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : p2) {
            if (!t(wVar, wVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean s(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f636e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f637f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return G("");
    }

    public void u(View view) {
        if (this.f647p) {
            return;
        }
        C0190b o2 = o();
        int i2 = o2.f3049c;
        C0052c c0052c = x.f666a;
        WindowId windowId = view.getWindowId();
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            o oVar = (o) o2.j(i3);
            if (oVar.f624a != null) {
                H h2 = oVar.f627d;
                if ((h2 instanceof G) && ((G) h2).f590a.equals(windowId)) {
                    ((Animator) o2.h(i3)).pause();
                }
            }
        }
        ArrayList arrayList = this.f648q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f648q.clone();
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((p) arrayList2.get(i4)).b();
            }
        }
        this.f646o = true;
    }

    public void v(p pVar) {
        ArrayList arrayList = this.f648q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(pVar);
        if (this.f648q.size() == 0) {
            this.f648q = null;
        }
    }

    public void w(View view) {
        this.f637f.remove(view);
    }

    public void x(ViewGroup viewGroup) {
        if (this.f646o) {
            if (!this.f647p) {
                C0190b o2 = o();
                int i2 = o2.f3049c;
                C0052c c0052c = x.f666a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    o oVar = (o) o2.j(i3);
                    if (oVar.f624a != null) {
                        H h2 = oVar.f627d;
                        if ((h2 instanceof G) && ((G) h2).f590a.equals(windowId)) {
                            ((Animator) o2.h(i3)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.f648q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f648q.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((p) arrayList2.get(i4)).e();
                    }
                }
            }
            this.f646o = false;
        }
    }

    public void y() {
        F();
        C0190b o2 = o();
        Iterator it = this.f649r.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o2.containsKey(animator)) {
                F();
                if (animator != null) {
                    animator.addListener(new n(this, o2));
                    long j2 = this.f634c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f633b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f635d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0139d(1, this));
                    animator.start();
                }
            }
        }
        this.f649r.clear();
        m();
    }

    public void z(long j2) {
        this.f634c = j2;
    }
}
