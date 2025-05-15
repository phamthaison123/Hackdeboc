package h;

import F.AbstractC0024z;
import F.O;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import i.C0150i0;
import i.C0177w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i extends x implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f2409A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2410b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2411c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2412d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2413e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2414f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f2415g;

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0120e f2418j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0121f f2419k;

    /* renamed from: o, reason: collision with root package name */
    public View f2423o;

    /* renamed from: p, reason: collision with root package name */
    public View f2424p;

    /* renamed from: q, reason: collision with root package name */
    public int f2425q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2426r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2427s;

    /* renamed from: t, reason: collision with root package name */
    public int f2428t;

    /* renamed from: u, reason: collision with root package name */
    public int f2429u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2431w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC0114A f2432x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f2433y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2434z;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2416h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2417i = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final e.z f2420l = new e.z(2, this);

    /* renamed from: m, reason: collision with root package name */
    public int f2421m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f2422n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2430v = false;

    public i(Context context, View view, int i2, int i3, boolean z2) {
        this.f2418j = new ViewTreeObserverOnGlobalLayoutListenerC0120e(r1, this);
        this.f2419k = new ViewOnAttachStateChangeListenerC0121f(this, r1);
        this.f2410b = context;
        this.f2423o = view;
        this.f2412d = i2;
        this.f2413e = i3;
        this.f2414f = z2;
        WeakHashMap weakHashMap = O.f58a;
        this.f2425q = AbstractC0024z.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2411c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f2415g = new Handler();
    }

    @Override // h.F
    public final boolean a() {
        ArrayList arrayList = this.f2417i;
        return arrayList.size() > 0 && ((C0123h) arrayList.get(0)).f2406a.f2922y.isShowing();
    }

    @Override // h.InterfaceC0115B
    public final void b(o oVar, boolean z2) {
        ArrayList arrayList = this.f2417i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (oVar == ((C0123h) arrayList.get(i2)).f2407b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0123h) arrayList.get(i3)).f2407b.c(false);
        }
        C0123h c0123h = (C0123h) arrayList.remove(i2);
        c0123h.f2407b.r(this);
        boolean z3 = this.f2409A;
        C0177w0 c0177w0 = c0123h.f2406a;
        if (z3) {
            c0177w0.f2922y.setExitTransition(null);
            c0177w0.f2922y.setAnimationStyle(0);
        }
        c0177w0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2425q = ((C0123h) arrayList.get(size2 - 1)).f2408c;
        } else {
            View view = this.f2423o;
            WeakHashMap weakHashMap = O.f58a;
            this.f2425q = AbstractC0024z.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0123h) arrayList.get(0)).f2407b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0114A interfaceC0114A = this.f2432x;
        if (interfaceC0114A != null) {
            interfaceC0114A.b(oVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2433y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2433y.removeGlobalOnLayoutListener(this.f2418j);
            }
            this.f2433y = null;
        }
        this.f2424p.removeOnAttachStateChangeListener(this.f2419k);
        this.f2434z.onDismiss();
    }

    @Override // h.InterfaceC0115B
    public final void c() {
        Iterator it = this.f2417i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0123h) it.next()).f2406a.f2900c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // h.F
    public final void dismiss() {
        ArrayList arrayList = this.f2417i;
        int size = arrayList.size();
        if (size > 0) {
            C0123h[] c0123hArr = (C0123h[]) arrayList.toArray(new C0123h[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0123h c0123h = c0123hArr[i2];
                if (c0123h.f2406a.f2922y.isShowing()) {
                    c0123h.f2406a.dismiss();
                }
            }
        }
    }

    @Override // h.InterfaceC0115B
    public final void e(InterfaceC0114A interfaceC0114A) {
        this.f2432x = interfaceC0114A;
    }

    @Override // h.F
    public final C0150i0 f() {
        ArrayList arrayList = this.f2417i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0123h) arrayList.get(arrayList.size() - 1)).f2406a.f2900c;
    }

    @Override // h.InterfaceC0115B
    public final boolean h() {
        return false;
    }

    @Override // h.F
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2416h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((o) it.next());
        }
        arrayList.clear();
        View view = this.f2423o;
        this.f2424p = view;
        if (view != null) {
            boolean z2 = this.f2433y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2433y = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2418j);
            }
            this.f2424p.addOnAttachStateChangeListener(this.f2419k);
        }
    }

    @Override // h.InterfaceC0115B
    public final boolean j(H h2) {
        Iterator it = this.f2417i.iterator();
        while (it.hasNext()) {
            C0123h c0123h = (C0123h) it.next();
            if (h2 == c0123h.f2407b) {
                c0123h.f2406a.f2900c.requestFocus();
                return true;
            }
        }
        if (!h2.hasVisibleItems()) {
            return false;
        }
        l(h2);
        InterfaceC0114A interfaceC0114A = this.f2432x;
        if (interfaceC0114A != null) {
            interfaceC0114A.j(h2);
        }
        return true;
    }

    @Override // h.x
    public final void l(o oVar) {
        oVar.b(this, this.f2410b);
        if (a()) {
            v(oVar);
        } else {
            this.f2416h.add(oVar);
        }
    }

    @Override // h.x
    public final void n(View view) {
        if (this.f2423o != view) {
            this.f2423o = view;
            int i2 = this.f2421m;
            WeakHashMap weakHashMap = O.f58a;
            this.f2422n = Gravity.getAbsoluteGravity(i2, AbstractC0024z.d(view));
        }
    }

    @Override // h.x
    public final void o(boolean z2) {
        this.f2430v = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0123h c0123h;
        ArrayList arrayList = this.f2417i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0123h = null;
                break;
            }
            c0123h = (C0123h) arrayList.get(i2);
            if (!c0123h.f2406a.f2922y.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0123h != null) {
            c0123h.f2407b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // h.x
    public final void p(int i2) {
        if (this.f2421m != i2) {
            this.f2421m = i2;
            View view = this.f2423o;
            WeakHashMap weakHashMap = O.f58a;
            this.f2422n = Gravity.getAbsoluteGravity(i2, AbstractC0024z.d(view));
        }
    }

    @Override // h.x
    public final void q(int i2) {
        this.f2426r = true;
        this.f2428t = i2;
    }

    @Override // h.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2434z = onDismissListener;
    }

    @Override // h.x
    public final void s(boolean z2) {
        this.f2431w = z2;
    }

    @Override // h.x
    public final void t(int i2) {
        this.f2427s = true;
        this.f2429u = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0125, code lost:
    
        if (((r8.getWidth() + r10[0]) + r5) > r11.right) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0127, code lost:
    
        r10 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        r8 = 1;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0130, code lost:
    
        if ((r10[0] - r5) < 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(h.o r17) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.i.v(h.o):void");
    }
}
