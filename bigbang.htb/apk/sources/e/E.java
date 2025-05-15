package e;

import F.O;
import F.S;
import F.T;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import d.AbstractC0092a;
import g.C0112l;
import g.C0113m;
import g.InterfaceC0102b;
import i.InterfaceC0143f;
import i.InterfaceC0144f0;
import i.Y0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class E extends B.a implements InterfaceC0143f {

    /* renamed from: A, reason: collision with root package name */
    public static final AccelerateInterpolator f2048A = new AccelerateInterpolator();

    /* renamed from: B, reason: collision with root package name */
    public static final DecelerateInterpolator f2049B = new DecelerateInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public Context f2050c;

    /* renamed from: d, reason: collision with root package name */
    public Context f2051d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarOverlayLayout f2052e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContainer f2053f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0144f0 f2054g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContextView f2055h;

    /* renamed from: i, reason: collision with root package name */
    public final View f2056i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2057j;

    /* renamed from: k, reason: collision with root package name */
    public D f2058k;

    /* renamed from: l, reason: collision with root package name */
    public D f2059l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0102b f2060m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2061n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2062o;

    /* renamed from: p, reason: collision with root package name */
    public int f2063p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2064q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2065r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2066s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2067t;

    /* renamed from: u, reason: collision with root package name */
    public C0113m f2068u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2069v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2070w;

    /* renamed from: x, reason: collision with root package name */
    public final C f2071x;

    /* renamed from: y, reason: collision with root package name */
    public final C f2072y;

    /* renamed from: z, reason: collision with root package name */
    public final z f2073z;

    public E(Activity activity, boolean z2) {
        new ArrayList();
        this.f2062o = new ArrayList();
        this.f2063p = 0;
        this.f2064q = true;
        this.f2067t = true;
        this.f2071x = new C(this, 0);
        this.f2072y = new C(this, 1);
        this.f2073z = new z(1, this);
        View decorView = activity.getWindow().getDecorView();
        m0(decorView);
        if (z2) {
            return;
        }
        this.f2056i = decorView.findViewById(R.id.content);
    }

    public final void k0(boolean z2) {
        T l2;
        T t2;
        if (z2) {
            if (!this.f2066s) {
                this.f2066s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2052e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                q0(false);
            }
        } else if (this.f2066s) {
            this.f2066s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2052e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            q0(false);
        }
        ActionBarContainer actionBarContainer = this.f2053f;
        WeakHashMap weakHashMap = O.f58a;
        if (!F.B.c(actionBarContainer)) {
            if (z2) {
                ((Y0) this.f2054g).f2750a.setVisibility(4);
                this.f2055h.setVisibility(0);
                return;
            } else {
                ((Y0) this.f2054g).f2750a.setVisibility(0);
                this.f2055h.setVisibility(8);
                return;
            }
        }
        if (z2) {
            Y0 y0 = (Y0) this.f2054g;
            l2 = O.a(y0.f2750a);
            l2.a(0.0f);
            l2.c(100L);
            l2.d(new C0112l(y0, 4));
            t2 = this.f2055h.l(0, 200L);
        } else {
            Y0 y02 = (Y0) this.f2054g;
            T a2 = O.a(y02.f2750a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new C0112l(y02, 0));
            l2 = this.f2055h.l(8, 100L);
            t2 = a2;
        }
        C0113m c0113m = new C0113m();
        ArrayList arrayList = c0113m.f2342a;
        arrayList.add(l2);
        View view = (View) l2.f69a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) t2.f69a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(t2);
        c0113m.b();
    }

    public final Context l0() {
        if (this.f2051d == null) {
            TypedValue typedValue = new TypedValue();
            this.f2050c.getTheme().resolveAttribute(2130968586, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f2051d = new ContextThemeWrapper(this.f2050c, i2);
            } else {
                this.f2051d = this.f2050c;
            }
        }
        return this.f2051d;
    }

    public final void m0(View view) {
        InterfaceC0144f0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296382);
        this.f2052e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(2131296304);
        if (findViewById instanceof InterfaceC0144f0) {
            wrapper = (InterfaceC0144f0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2054g = wrapper;
        this.f2055h = (ActionBarContextView) view.findViewById(2131296312);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296306);
        this.f2053f = actionBarContainer;
        InterfaceC0144f0 interfaceC0144f0 = this.f2054g;
        if (interfaceC0144f0 == null || this.f2055h == null || actionBarContainer == null) {
            throw new IllegalStateException(E.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((Y0) interfaceC0144f0).f2750a.getContext();
        this.f2050c = context;
        if ((((Y0) this.f2054g).f2751b & 4) != 0) {
            this.f2057j = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f2054g.getClass();
        o0(context.getResources().getBoolean(2131034112));
        TypedArray obtainStyledAttributes = this.f2050c.obtainStyledAttributes(null, AbstractC0092a.f2006a, 2130968581, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2052e;
            if (!actionBarOverlayLayout2.f850h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2070w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2053f;
            WeakHashMap weakHashMap = O.f58a;
            F.E.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void n0(boolean z2) {
        if (this.f2057j) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        Y0 y0 = (Y0) this.f2054g;
        int i3 = y0.f2751b;
        this.f2057j = true;
        y0.a((i2 & 4) | (i3 & (-5)));
    }

    public final void o0(boolean z2) {
        if (z2) {
            this.f2053f.setTabContainer(null);
            ((Y0) this.f2054g).getClass();
        } else {
            ((Y0) this.f2054g).getClass();
            this.f2053f.setTabContainer(null);
        }
        this.f2054g.getClass();
        ((Y0) this.f2054g).f2750a.setCollapsible(false);
        this.f2052e.setHasNonEmbeddedTabs(false);
    }

    public final void p0(CharSequence charSequence) {
        Y0 y0 = (Y0) this.f2054g;
        if (y0.f2756g) {
            return;
        }
        y0.f2757h = charSequence;
        if ((y0.f2751b & 8) != 0) {
            Toolbar toolbar = y0.f2750a;
            toolbar.setTitle(charSequence);
            if (y0.f2756g) {
                O.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void q0(boolean z2) {
        int i2 = 0;
        boolean z3 = this.f2066s || !this.f2065r;
        z zVar = this.f2073z;
        View view = this.f2056i;
        if (!z3) {
            if (this.f2067t) {
                this.f2067t = false;
                C0113m c0113m = this.f2068u;
                if (c0113m != null) {
                    c0113m.a();
                }
                int i3 = this.f2063p;
                C c2 = this.f2071x;
                if (i3 != 0 || (!this.f2069v && !z2)) {
                    c2.c();
                    return;
                }
                this.f2053f.setAlpha(1.0f);
                this.f2053f.setTransitioning(true);
                C0113m c0113m2 = new C0113m();
                float f2 = -this.f2053f.getHeight();
                if (z2) {
                    this.f2053f.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                T a2 = O.a(this.f2053f);
                a2.e(f2);
                View view2 = (View) a2.f69a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(zVar != null ? new S(a2, zVar, view2, i2) : null);
                }
                boolean z4 = c0113m2.f2346e;
                ArrayList arrayList = c0113m2.f2342a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2064q && view != null) {
                    T a3 = O.a(view);
                    a3.e(f2);
                    if (!c0113m2.f2346e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2048A;
                boolean z5 = c0113m2.f2346e;
                if (!z5) {
                    c0113m2.f2344c = accelerateInterpolator;
                }
                if (!z5) {
                    c0113m2.f2343b = 250L;
                }
                if (!z5) {
                    c0113m2.f2345d = c2;
                }
                this.f2068u = c0113m2;
                c0113m2.b();
                return;
            }
            return;
        }
        if (this.f2067t) {
            return;
        }
        this.f2067t = true;
        C0113m c0113m3 = this.f2068u;
        if (c0113m3 != null) {
            c0113m3.a();
        }
        this.f2053f.setVisibility(0);
        int i4 = this.f2063p;
        C c3 = this.f2072y;
        if (i4 == 0 && (this.f2069v || z2)) {
            this.f2053f.setTranslationY(0.0f);
            float f3 = -this.f2053f.getHeight();
            if (z2) {
                this.f2053f.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2053f.setTranslationY(f3);
            C0113m c0113m4 = new C0113m();
            T a4 = O.a(this.f2053f);
            a4.e(0.0f);
            View view3 = (View) a4.f69a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(zVar != null ? new S(a4, zVar, view3, i2) : null);
            }
            boolean z6 = c0113m4.f2346e;
            ArrayList arrayList2 = c0113m4.f2342a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2064q && view != null) {
                view.setTranslationY(f3);
                T a5 = O.a(view);
                a5.e(0.0f);
                if (!c0113m4.f2346e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2049B;
            boolean z7 = c0113m4.f2346e;
            if (!z7) {
                c0113m4.f2344c = decelerateInterpolator;
            }
            if (!z7) {
                c0113m4.f2343b = 250L;
            }
            if (!z7) {
                c0113m4.f2345d = c3;
            }
            this.f2068u = c0113m4;
            c0113m4.b();
        } else {
            this.f2053f.setAlpha(1.0f);
            this.f2053f.setTranslationY(0.0f);
            if (this.f2064q && view != null) {
                view.setTranslationY(0.0f);
            }
            c3.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2052e;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = O.f58a;
            F.C.c(actionBarOverlayLayout);
        }
    }

    public E(Dialog dialog) {
        new ArrayList();
        this.f2062o = new ArrayList();
        this.f2063p = 0;
        this.f2064q = true;
        this.f2067t = true;
        this.f2071x = new C(this, 0);
        this.f2072y = new C(this, 1);
        this.f2073z = new z(1, this);
        m0(dialog.getWindow().getDecorView());
    }
}
