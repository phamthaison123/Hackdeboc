package i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import g.C0101a;
import h.InterfaceC0114A;
import h.InterfaceC0115B;
import java.util.ArrayList;

/* renamed from: i.m, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0157m implements InterfaceC0115B {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2828a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2829b;

    /* renamed from: c, reason: collision with root package name */
    public h.o f2830c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f2831d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0114A f2832e;

    /* renamed from: h, reason: collision with root package name */
    public h.D f2835h;

    /* renamed from: i, reason: collision with root package name */
    public C0155l f2836i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2837j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2838k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2839l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2840m;

    /* renamed from: n, reason: collision with root package name */
    public int f2841n;

    /* renamed from: o, reason: collision with root package name */
    public int f2842o;

    /* renamed from: p, reason: collision with root package name */
    public int f2843p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2844q;

    /* renamed from: s, reason: collision with root package name */
    public C0147h f2846s;

    /* renamed from: t, reason: collision with root package name */
    public C0147h f2847t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0151j f2848u;

    /* renamed from: v, reason: collision with root package name */
    public C0149i f2849v;

    /* renamed from: f, reason: collision with root package name */
    public final int f2833f = 2131492867;

    /* renamed from: g, reason: collision with root package name */
    public final int f2834g = 2131492866;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f2845r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final e.z f2850w = new e.z(4, this);

    public C0157m(Context context) {
        this.f2828a = context;
        this.f2831d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [h.C] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(h.q qVar, View view, ViewGroup viewGroup) {
        View actionView = qVar.getActionView();
        if (actionView == null || qVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof h.C ? (h.C) view : (h.C) this.f2831d.inflate(this.f2834g, viewGroup, false);
            actionMenuItemView.c(qVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f2835h);
            if (this.f2849v == null) {
                this.f2849v = new C0149i(this);
            }
            actionMenuItemView2.setPopupCallback(this.f2849v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(qVar.f2479C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0161o)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // h.InterfaceC0115B
    public final void b(h.o oVar, boolean z2) {
        f();
        C0147h c0147h = this.f2847t;
        if (c0147h != null && c0147h.b()) {
            c0147h.f2527j.dismiss();
        }
        InterfaceC0114A interfaceC0114A = this.f2832e;
        if (interfaceC0114A != null) {
            interfaceC0114A.b(oVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.InterfaceC0115B
    public final void c() {
        int size;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f2835h;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            h.o oVar = this.f2830c;
            if (oVar != null) {
                oVar.i();
                ArrayList l2 = this.f2830c.l();
                int size2 = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    h.q qVar = (h.q) l2.get(i3);
                    if (qVar.f()) {
                        View childAt = viewGroup.getChildAt(i2);
                        h.q itemData = childAt instanceof h.C ? ((h.C) childAt).getItemData() : null;
                        View a2 = a(qVar, childAt, viewGroup);
                        if (qVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f2835h).addView(a2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f2836i) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f2835h).requestLayout();
        h.o oVar2 = this.f2830c;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f2458i;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                h.r rVar = ((h.q) arrayList2.get(i4)).f2477A;
            }
        }
        h.o oVar3 = this.f2830c;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f2459j;
        }
        if (!this.f2839l || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((h.q) arrayList.get(0)).f2479C))) {
            C0155l c0155l = this.f2836i;
            if (c0155l != null) {
                Object parent = c0155l.getParent();
                Object obj = this.f2835h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2836i);
                }
            }
        } else {
            if (this.f2836i == null) {
                this.f2836i = new C0155l(this, this.f2828a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2836i.getParent();
            if (viewGroup3 != this.f2835h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2836i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2835h;
                C0155l c0155l2 = this.f2836i;
                actionMenuView.getClass();
                C0161o l3 = ActionMenuView.l();
                l3.f2866a = true;
                actionMenuView.addView(c0155l2, l3);
            }
        }
        ((ActionMenuView) this.f2835h).setOverflowReserved(this.f2839l);
    }

    @Override // h.InterfaceC0115B
    public final /* bridge */ /* synthetic */ boolean d(h.q qVar) {
        return false;
    }

    @Override // h.InterfaceC0115B
    public final void e(InterfaceC0114A interfaceC0114A) {
        this.f2832e = interfaceC0114A;
    }

    public final boolean f() {
        Object obj;
        RunnableC0151j runnableC0151j = this.f2848u;
        if (runnableC0151j != null && (obj = this.f2835h) != null) {
            ((View) obj).removeCallbacks(runnableC0151j);
            this.f2848u = null;
            return true;
        }
        C0147h c0147h = this.f2846s;
        if (c0147h == null) {
            return false;
        }
        if (c0147h.b()) {
            c0147h.f2527j.dismiss();
        }
        return true;
    }

    @Override // h.InterfaceC0115B
    public final void g(Context context, h.o oVar) {
        this.f2829b = context;
        LayoutInflater.from(context);
        this.f2830c = oVar;
        Resources resources = context.getResources();
        C0101a c0101a = new C0101a(context, 0);
        if (!this.f2840m) {
            this.f2839l = true;
        }
        this.f2841n = c0101a.f2277a.getResources().getDisplayMetrics().widthPixels / 2;
        this.f2843p = c0101a.b();
        int i2 = this.f2841n;
        if (this.f2839l) {
            if (this.f2836i == null) {
                C0155l c0155l = new C0155l(this, this.f2828a);
                this.f2836i = c0155l;
                if (this.f2838k) {
                    c0155l.setImageDrawable(this.f2837j);
                    this.f2837j = null;
                    this.f2838k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2836i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f2836i.getMeasuredWidth();
        } else {
            this.f2836i = null;
        }
        this.f2842o = i2;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // h.InterfaceC0115B
    public final boolean h() {
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        h.o oVar = this.f2830c;
        if (oVar != null) {
            arrayList = oVar.l();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = this.f2843p;
        int i5 = this.f2842o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f2835h;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            h.q qVar = (h.q) arrayList.get(i6);
            int i9 = qVar.f2504y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (this.f2844q && qVar.f2479C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f2839l && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = this.f2845r;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            h.q qVar2 = (h.q) arrayList.get(i11);
            int i13 = qVar2.f2504y;
            boolean z4 = (i13 & 2) == i3 ? z2 : false;
            int i14 = qVar2.f2481b;
            if (z4) {
                View a2 = a(qVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                qVar2.g(z2);
            } else if ((i13 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i14);
                boolean z6 = ((i10 > 0 || z5) && i5 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(qVar2, null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z6 &= i5 + i12 > 0;
                }
                if (z6 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z5) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i11; i15++) {
                        h.q qVar3 = (h.q) arrayList.get(i15);
                        if (qVar3.f2481b == i14) {
                            if (qVar3.f()) {
                                i10++;
                            }
                            qVar3.g(false);
                        }
                    }
                }
                if (z6) {
                    i10--;
                }
                qVar2.g(z6);
            } else {
                qVar2.g(false);
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return z2;
    }

    public final boolean i() {
        C0147h c0147h = this.f2846s;
        return c0147h != null && c0147h.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.InterfaceC0115B
    public final boolean j(h.H h2) {
        boolean z2;
        if (!h2.hasVisibleItems()) {
            return false;
        }
        h.H h3 = h2;
        while (true) {
            h.o oVar = h3.f2376z;
            if (oVar == this.f2830c) {
                break;
            }
            h3 = (h.H) oVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f2835h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof h.C) && ((h.C) childAt).getItemData() == h3.f2375A) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        h2.f2375A.getClass();
        int size = h2.f2455f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = h2.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0147h c0147h = new C0147h(this, this.f2829b, h2, view);
        this.f2847t = c0147h;
        c0147h.f2525h = z2;
        h.x xVar = c0147h.f2527j;
        if (xVar != null) {
            xVar.o(z2);
        }
        C0147h c0147h2 = this.f2847t;
        if (!c0147h2.b()) {
            if (c0147h2.f2523f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0147h2.d(0, 0, false, false);
        }
        InterfaceC0114A interfaceC0114A = this.f2832e;
        if (interfaceC0114A != null) {
            interfaceC0114A.j(h2);
        }
        return true;
    }

    @Override // h.InterfaceC0115B
    public final /* bridge */ /* synthetic */ boolean k(h.q qVar) {
        return false;
    }

    public final boolean l() {
        h.o oVar;
        int i2 = 0;
        if (this.f2839l && !i() && (oVar = this.f2830c) != null && this.f2835h != null && this.f2848u == null) {
            oVar.i();
            if (!oVar.f2459j.isEmpty()) {
                RunnableC0151j runnableC0151j = new RunnableC0151j(i2, this, new C0147h(this, this.f2829b, this.f2830c, this.f2836i));
                this.f2848u = runnableC0151j;
                ((View) this.f2835h).post(runnableC0151j);
                return true;
            }
        }
        return false;
    }
}
