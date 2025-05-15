package h;

import F.AbstractC0024z;
import F.O;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import i.C0150i0;
import i.C0177w0;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class G extends x implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2355b;

    /* renamed from: c, reason: collision with root package name */
    public final o f2356c;

    /* renamed from: d, reason: collision with root package name */
    public final l f2357d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2358e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2359f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2360g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2361h;

    /* renamed from: i, reason: collision with root package name */
    public final C0177w0 f2362i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0120e f2363j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0121f f2364k;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2365l;

    /* renamed from: m, reason: collision with root package name */
    public View f2366m;

    /* renamed from: n, reason: collision with root package name */
    public View f2367n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0114A f2368o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f2369p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2370q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2371r;

    /* renamed from: s, reason: collision with root package name */
    public int f2372s;

    /* renamed from: t, reason: collision with root package name */
    public int f2373t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2374u;

    public G(int i2, int i3, Context context, View view, o oVar, boolean z2) {
        int i4 = 1;
        this.f2363j = new ViewTreeObserverOnGlobalLayoutListenerC0120e(i4, this);
        this.f2364k = new ViewOnAttachStateChangeListenerC0121f(this, i4);
        this.f2355b = context;
        this.f2356c = oVar;
        this.f2358e = z2;
        this.f2357d = new l(oVar, LayoutInflater.from(context), z2, 2131492883);
        this.f2360g = i2;
        this.f2361h = i3;
        Resources resources = context.getResources();
        this.f2359f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f2366m = view;
        this.f2362i = new C0177w0(context, null, i2, i3);
        oVar.b(this, context);
    }

    @Override // h.F
    public final boolean a() {
        return !this.f2370q && this.f2362i.f2922y.isShowing();
    }

    @Override // h.InterfaceC0115B
    public final void b(o oVar, boolean z2) {
        if (oVar != this.f2356c) {
            return;
        }
        dismiss();
        InterfaceC0114A interfaceC0114A = this.f2368o;
        if (interfaceC0114A != null) {
            interfaceC0114A.b(oVar, z2);
        }
    }

    @Override // h.InterfaceC0115B
    public final void c() {
        this.f2371r = false;
        l lVar = this.f2357d;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // h.F
    public final void dismiss() {
        if (a()) {
            this.f2362i.dismiss();
        }
    }

    @Override // h.InterfaceC0115B
    public final void e(InterfaceC0114A interfaceC0114A) {
        this.f2368o = interfaceC0114A;
    }

    @Override // h.F
    public final C0150i0 f() {
        return this.f2362i.f2900c;
    }

    @Override // h.InterfaceC0115B
    public final boolean h() {
        return false;
    }

    @Override // h.F
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2370q || (view = this.f2366m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2367n = view;
        C0177w0 c0177w0 = this.f2362i;
        c0177w0.f2922y.setOnDismissListener(this);
        c0177w0.f2913p = this;
        c0177w0.f2921x = true;
        c0177w0.f2922y.setFocusable(true);
        View view2 = this.f2367n;
        boolean z2 = this.f2369p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2369p = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2363j);
        }
        view2.addOnAttachStateChangeListener(this.f2364k);
        c0177w0.f2912o = view2;
        c0177w0.f2909l = this.f2373t;
        boolean z3 = this.f2371r;
        Context context = this.f2355b;
        l lVar = this.f2357d;
        if (!z3) {
            this.f2372s = x.m(lVar, context, this.f2359f);
            this.f2371r = true;
        }
        c0177w0.r(this.f2372s);
        c0177w0.f2922y.setInputMethodMode(2);
        Rect rect = this.f2516a;
        c0177w0.f2920w = rect != null ? new Rect(rect) : null;
        c0177w0.i();
        C0150i0 c0150i0 = c0177w0.f2900c;
        c0150i0.setOnKeyListener(this);
        if (this.f2374u) {
            o oVar = this.f2356c;
            if (oVar.f2462m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) c0150i0, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(oVar.f2462m);
                }
                frameLayout.setEnabled(false);
                c0150i0.addHeaderView(frameLayout, null, false);
            }
        }
        c0177w0.o(lVar);
        c0177w0.i();
    }

    @Override // h.InterfaceC0115B
    public final boolean j(H h2) {
        if (h2.hasVisibleItems()) {
            View view = this.f2367n;
            z zVar = new z(this.f2360g, this.f2361h, this.f2355b, view, h2, this.f2358e);
            InterfaceC0114A interfaceC0114A = this.f2368o;
            zVar.f2526i = interfaceC0114A;
            x xVar = zVar.f2527j;
            if (xVar != null) {
                xVar.e(interfaceC0114A);
            }
            boolean u2 = x.u(h2);
            zVar.f2525h = u2;
            x xVar2 = zVar.f2527j;
            if (xVar2 != null) {
                xVar2.o(u2);
            }
            zVar.f2528k = this.f2365l;
            this.f2365l = null;
            this.f2356c.c(false);
            C0177w0 c0177w0 = this.f2362i;
            int i2 = c0177w0.f2903f;
            int j2 = c0177w0.j();
            int i3 = this.f2373t;
            View view2 = this.f2366m;
            WeakHashMap weakHashMap = O.f58a;
            if ((Gravity.getAbsoluteGravity(i3, AbstractC0024z.d(view2)) & 7) == 5) {
                i2 += this.f2366m.getWidth();
            }
            if (!zVar.b()) {
                if (zVar.f2523f != null) {
                    zVar.d(i2, j2, true, true);
                }
            }
            InterfaceC0114A interfaceC0114A2 = this.f2368o;
            if (interfaceC0114A2 != null) {
                interfaceC0114A2.j(h2);
            }
            return true;
        }
        return false;
    }

    @Override // h.x
    public final void l(o oVar) {
    }

    @Override // h.x
    public final void n(View view) {
        this.f2366m = view;
    }

    @Override // h.x
    public final void o(boolean z2) {
        this.f2357d.f2445c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2370q = true;
        this.f2356c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2369p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2369p = this.f2367n.getViewTreeObserver();
            }
            this.f2369p.removeGlobalOnLayoutListener(this.f2363j);
            this.f2369p = null;
        }
        this.f2367n.removeOnAttachStateChangeListener(this.f2364k);
        PopupWindow.OnDismissListener onDismissListener = this.f2365l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f2373t = i2;
    }

    @Override // h.x
    public final void q(int i2) {
        this.f2362i.f2903f = i2;
    }

    @Override // h.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2365l = onDismissListener;
    }

    @Override // h.x
    public final void s(boolean z2) {
        this.f2374u = z2;
    }

    @Override // h.x
    public final void t(int i2) {
        this.f2362i.l(i2);
    }
}
