package e;

import F.AbstractC0023y;
import F.F;
import F.O;
import F.T;
import F.f0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import d.AbstractC0092a;
import g.AbstractC0103c;
import g.C0105e;
import g.C0111k;
import i.C0147h;
import i.C0157m;
import i.C0178x;
import i.InterfaceC0142e0;
import i.Y0;
import i.b1;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class v extends k implements h.m, LayoutInflater.Factory2 {

    /* renamed from: Z, reason: collision with root package name */
    public static final l.k f2157Z = new l.k();

    /* renamed from: a0, reason: collision with root package name */
    public static final int[] f2158a0 = {R.attr.windowBackground};

    /* renamed from: b0, reason: collision with root package name */
    public static final boolean f2159b0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: c0, reason: collision with root package name */
    public static final boolean f2160c0 = true;

    /* renamed from: A, reason: collision with root package name */
    public boolean f2161A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2162B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2163C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2164D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2165E;

    /* renamed from: F, reason: collision with root package name */
    public u[] f2166F;

    /* renamed from: G, reason: collision with root package name */
    public u f2167G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2168H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2169I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2170J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2171K;

    /* renamed from: L, reason: collision with root package name */
    public Configuration f2172L;

    /* renamed from: M, reason: collision with root package name */
    public final int f2173M;

    /* renamed from: N, reason: collision with root package name */
    public int f2174N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2175O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2176P;

    /* renamed from: Q, reason: collision with root package name */
    public q f2177Q;

    /* renamed from: R, reason: collision with root package name */
    public q f2178R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2179S;

    /* renamed from: T, reason: collision with root package name */
    public int f2180T;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2182V;

    /* renamed from: W, reason: collision with root package name */
    public Rect f2183W;

    /* renamed from: X, reason: collision with root package name */
    public Rect f2184X;

    /* renamed from: Y, reason: collision with root package name */
    public y f2185Y;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2186c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f2187d;

    /* renamed from: e, reason: collision with root package name */
    public Window f2188e;

    /* renamed from: f, reason: collision with root package name */
    public p f2189f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2190g;

    /* renamed from: h, reason: collision with root package name */
    public E f2191h;

    /* renamed from: i, reason: collision with root package name */
    public C0111k f2192i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2193j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0142e0 f2194k;

    /* renamed from: l, reason: collision with root package name */
    public m f2195l;

    /* renamed from: m, reason: collision with root package name */
    public m f2196m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0103c f2197n;

    /* renamed from: o, reason: collision with root package name */
    public ActionBarContextView f2198o;

    /* renamed from: p, reason: collision with root package name */
    public PopupWindow f2199p;

    /* renamed from: q, reason: collision with root package name */
    public l f2200q;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2203t;

    /* renamed from: u, reason: collision with root package name */
    public ViewGroup f2204u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f2205v;

    /* renamed from: w, reason: collision with root package name */
    public View f2206w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2207x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2208y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2209z;

    /* renamed from: r, reason: collision with root package name */
    public T f2201r = null;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2202s = true;

    /* renamed from: U, reason: collision with root package name */
    public final l f2181U = new l(this, 0);

    public v(Context context, Window window, j jVar, Object obj) {
        AppCompatActivity appCompatActivity;
        this.f2173M = -100;
        this.f2187d = context;
        this.f2190g = jVar;
        this.f2186c = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f2173M = ((v) appCompatActivity.j()).f2173M;
            }
        }
        if (this.f2173M == -100) {
            l.k kVar = f2157Z;
            Integer num = (Integer) kVar.getOrDefault(this.f2186c.getClass().getName(), null);
            if (num != null) {
                this.f2173M = num.intValue();
                kVar.remove(this.f2186c.getClass().getName());
            }
        }
        if (window != null) {
            k(window);
        }
        C0178x.c();
    }

    public static Configuration o(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final boolean A(u uVar, KeyEvent keyEvent) {
        InterfaceC0142e0 interfaceC0142e0;
        InterfaceC0142e0 interfaceC0142e02;
        Resources.Theme theme;
        InterfaceC0142e0 interfaceC0142e03;
        InterfaceC0142e0 interfaceC0142e04;
        if (this.f2171K) {
            return false;
        }
        if (uVar.f2151k) {
            return true;
        }
        u uVar2 = this.f2167G;
        if (uVar2 != null && uVar2 != uVar) {
            n(uVar2, false);
        }
        Window.Callback callback = this.f2188e.getCallback();
        int i2 = uVar.f2141a;
        if (callback != null) {
            uVar.f2147g = callback.onCreatePanelView(i2);
        }
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (interfaceC0142e04 = this.f2194k) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0142e04;
            actionBarOverlayLayout.k();
            ((Y0) actionBarOverlayLayout.f847e).f2761l = true;
        }
        if (uVar.f2147g == null) {
            h.o oVar = uVar.f2148h;
            if (oVar == null || uVar.f2155o) {
                if (oVar == null) {
                    Context context = this.f2187d;
                    if ((i2 == 0 || i2 == 108) && this.f2194k != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(2130968585, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(2130968586, typedValue, true);
                        } else {
                            theme2.resolveAttribute(2130968586, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0105e c0105e = new C0105e(context, 0);
                            c0105e.getTheme().setTo(theme);
                            context = c0105e;
                        }
                    }
                    h.o oVar2 = new h.o(context);
                    oVar2.f2454e = this;
                    h.o oVar3 = uVar.f2148h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(uVar.f2149i);
                        }
                        uVar.f2148h = oVar2;
                        h.k kVar = uVar.f2149i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.f2450a);
                        }
                    }
                    if (uVar.f2148h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0142e02 = this.f2194k) != null) {
                    if (this.f2195l == null) {
                        this.f2195l = new m(this, 3);
                    }
                    ((ActionBarOverlayLayout) interfaceC0142e02).l(uVar.f2148h, this.f2195l);
                }
                uVar.f2148h.w();
                if (!callback.onCreatePanelMenu(i2, uVar.f2148h)) {
                    h.o oVar4 = uVar.f2148h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(uVar.f2149i);
                        }
                        uVar.f2148h = null;
                    }
                    if (z2 && (interfaceC0142e0 = this.f2194k) != null) {
                        ((ActionBarOverlayLayout) interfaceC0142e0).l(null, this.f2195l);
                    }
                    return false;
                }
                uVar.f2155o = false;
            }
            uVar.f2148h.w();
            Bundle bundle = uVar.f2156p;
            if (bundle != null) {
                uVar.f2148h.s(bundle);
                uVar.f2156p = null;
            }
            if (!callback.onPreparePanel(0, uVar.f2147g, uVar.f2148h)) {
                if (z2 && (interfaceC0142e03 = this.f2194k) != null) {
                    ((ActionBarOverlayLayout) interfaceC0142e03).l(null, this.f2195l);
                }
                uVar.f2148h.v();
                return false;
            }
            uVar.f2148h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            uVar.f2148h.v();
        }
        uVar.f2151k = true;
        uVar.f2152l = false;
        this.f2167G = uVar;
        return true;
    }

    public final void B() {
        if (this.f2203t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int C(f0 f0Var, Rect rect) {
        boolean z2;
        boolean z3;
        int a2;
        int d2 = f0Var != null ? f0Var.d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f2198o;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2198o.getLayoutParams();
            if (this.f2198o.isShown()) {
                if (this.f2183W == null) {
                    this.f2183W = new Rect();
                    this.f2184X = new Rect();
                }
                Rect rect2 = this.f2183W;
                Rect rect3 = this.f2184X;
                if (f0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(f0Var.b(), f0Var.d(), f0Var.c(), f0Var.a());
                }
                ViewGroup viewGroup = this.f2204u;
                Method method = b1.f2779a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                ViewGroup viewGroup2 = this.f2204u;
                WeakHashMap weakHashMap = O.f58a;
                f0 a3 = F.a(viewGroup2);
                int b2 = a3 == null ? 0 : a3.b();
                int c2 = a3 == null ? 0 : a3.c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                Context context = this.f2187d;
                if (i2 <= 0 || this.f2206w != null) {
                    View view = this.f2206w;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            this.f2206w.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(context);
                    this.f2206w = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    this.f2204u.addView(this.f2206w, -1, layoutParams);
                }
                View view3 = this.f2206w;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    View view4 = this.f2206w;
                    if ((AbstractC0023y.g(view4) & 8192) != 0) {
                        Object obj = w.e.f3731a;
                        a2 = w.d.a(context, 2131099654);
                    } else {
                        Object obj2 = w.e.f3731a;
                        a2 = w.d.a(context, 2131099653);
                    }
                    view4.setBackgroundColor(a2);
                }
                if (!this.f2162B && r5) {
                    d2 = 0;
                }
                z2 = r5;
                r5 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                r5 = false;
            }
            if (r5) {
                this.f2198o.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f2206w;
        if (view5 != null) {
            view5.setVisibility(z2 ? 0 : 8);
        }
        return d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // h.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(h.o r6) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.a(h.o):void");
    }

    @Override // e.k
    public final void b() {
        LayoutInflater from = LayoutInflater.from(this.f2187d);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // e.k
    public final void c() {
        String str;
        this.f2169I = true;
        j(false);
        s();
        Object obj = this.f2186c;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = B.a.D(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                E e3 = this.f2191h;
                if (e3 == null) {
                    this.f2182V = true;
                } else {
                    e3.n0(true);
                }
            }
            synchronized (k.f2123b) {
                k.f(this);
                k.f2122a.add(new WeakReference(this));
            }
        }
        this.f2172L = new Configuration(this.f2187d.getResources().getConfiguration());
        this.f2170J = true;
    }

    @Override // h.m
    public final boolean d(h.o oVar, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f2188e.getCallback();
        if (callback != null && !this.f2171K) {
            h.o k2 = oVar.k();
            u[] uVarArr = this.f2166F;
            int length = uVarArr != null ? uVarArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    uVar = uVarArr[i2];
                    if (uVar != null && uVar.f2148h == k2) {
                        break;
                    }
                    i2++;
                } else {
                    uVar = null;
                    break;
                }
            }
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f2141a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // e.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2186c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = e.k.f2123b
            monitor-enter(r0)
            e.k.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.f2179S
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f2188e
            android.view.View r0 = r0.getDecorView()
            e.l r1 = r3.f2181U
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f2171K = r0
            int r0 = r3.f2173M
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f2186c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            l.k r0 = e.v.f2157Z
            java.lang.Object r1 = r3.f2186c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f2173M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            l.k r0 = e.v.f2157Z
            java.lang.Object r1 = r3.f2186c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            e.q r0 = r3.f2177Q
            if (r0 == 0) goto L63
            r0.a()
        L63:
            e.q r3 = r3.f2178R
            if (r3 == 0) goto L6a
            r3.a()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.e():void");
    }

    @Override // e.k
    public final boolean g(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f2164D && i2 == 108) {
            return false;
        }
        if (this.f2209z && i2 == 1) {
            this.f2209z = false;
        }
        if (i2 == 1) {
            B();
            this.f2164D = true;
            return true;
        }
        if (i2 == 2) {
            B();
            this.f2207x = true;
            return true;
        }
        if (i2 == 5) {
            B();
            this.f2208y = true;
            return true;
        }
        if (i2 == 10) {
            B();
            this.f2162B = true;
            return true;
        }
        if (i2 == 108) {
            B();
            this.f2209z = true;
            return true;
        }
        if (i2 != 109) {
            return this.f2188e.requestFeature(i2);
        }
        B();
        this.f2161A = true;
        return true;
    }

    @Override // e.k
    public final void h(int i2) {
        r();
        ViewGroup viewGroup = (ViewGroup) this.f2204u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2187d).inflate(i2, viewGroup);
        this.f2189f.f2132a.onContentChanged();
    }

    @Override // e.k
    public final void i(CharSequence charSequence) {
        this.f2193j = charSequence;
        InterfaceC0142e0 interfaceC0142e0 = this.f2194k;
        if (interfaceC0142e0 != null) {
            interfaceC0142e0.setWindowTitle(charSequence);
            return;
        }
        E e2 = this.f2191h;
        if (e2 != null) {
            e2.p0(charSequence);
            return;
        }
        TextView textView = this.f2205v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(boolean r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.j(boolean):boolean");
    }

    public final void k(Window window) {
        int resourceId;
        Drawable f2;
        if (this.f2188e != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof p) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        p pVar = new p(this, callback);
        this.f2189f = pVar;
        window.setCallback(pVar);
        int[] iArr = f2158a0;
        Context context = this.f2187d;
        Drawable drawable = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            C0178x a2 = C0178x.a();
            synchronized (a2) {
                f2 = a2.f2947a.f(context, resourceId, true);
            }
            drawable = f2;
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f2188e = window;
    }

    public final void l(int i2, u uVar, h.o oVar) {
        if (oVar == null) {
            if (uVar == null && i2 >= 0) {
                u[] uVarArr = this.f2166F;
                if (i2 < uVarArr.length) {
                    uVar = uVarArr[i2];
                }
            }
            if (uVar != null) {
                oVar = uVar.f2148h;
            }
        }
        if ((uVar == null || uVar.f2153m) && !this.f2171K) {
            this.f2189f.f2132a.onPanelClosed(i2, oVar);
        }
    }

    public final void m(h.o oVar) {
        C0157m c0157m;
        if (this.f2165E) {
            return;
        }
        this.f2165E = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2194k;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f847e).f2750a.f954a;
        if (actionMenuView != null && (c0157m = actionMenuView.f874t) != null) {
            c0157m.f();
            C0147h c0147h = c0157m.f2847t;
            if (c0147h != null && c0147h.b()) {
                c0147h.f2527j.dismiss();
            }
        }
        Window.Callback callback = this.f2188e.getCallback();
        if (callback != null && !this.f2171K) {
            callback.onPanelClosed(108, oVar);
        }
        this.f2165E = false;
    }

    public final void n(u uVar, boolean z2) {
        t tVar;
        InterfaceC0142e0 interfaceC0142e0;
        C0157m c0157m;
        if (z2 && uVar.f2141a == 0 && (interfaceC0142e0 = this.f2194k) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0142e0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f847e).f2750a.f954a;
            if (actionMenuView != null && (c0157m = actionMenuView.f874t) != null && c0157m.i()) {
                m(uVar.f2148h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2187d.getSystemService("window");
        if (windowManager != null && uVar.f2153m && (tVar = uVar.f2145e) != null) {
            windowManager.removeView(tVar);
            if (z2) {
                l(uVar.f2141a, uVar, null);
            }
        }
        uVar.f2151k = false;
        uVar.f2152l = false;
        uVar.f2153m = false;
        uVar.f2146f = null;
        uVar.f2154n = true;
        if (this.f2167G == uVar) {
            this.f2167G = null;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.p(android.view.KeyEvent):boolean");
    }

    public final void q(int i2) {
        u u2 = u(i2);
        if (u2.f2148h != null) {
            Bundle bundle = new Bundle();
            u2.f2148h.t(bundle);
            if (bundle.size() > 0) {
                u2.f2156p = bundle;
            }
            u2.f2148h.w();
            u2.f2148h.clear();
        }
        u2.f2155o = true;
        u2.f2154n = true;
        if ((i2 == 108 || i2 == 0) && this.f2194k != null) {
            u u3 = u(0);
            u3.f2151k = false;
            A(u3, null);
        }
    }

    public final void r() {
        ViewGroup viewGroup;
        if (this.f2203t) {
            return;
        }
        int[] iArr = AbstractC0092a.f2015j;
        Context context = this.f2187d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i2 = 0;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f2163C = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        s();
        this.f2188e.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        int i3 = 2;
        if (this.f2164D) {
            viewGroup = this.f2162B ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
        } else if (this.f2163C) {
            viewGroup = (ViewGroup) from.inflate(2131492876, (ViewGroup) null);
            this.f2161A = false;
            this.f2209z = false;
        } else if (this.f2209z) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968585, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0105e(context, typedValue.resourceId) : context).inflate(2131492887, (ViewGroup) null);
            InterfaceC0142e0 interfaceC0142e0 = (InterfaceC0142e0) viewGroup.findViewById(2131296382);
            this.f2194k = interfaceC0142e0;
            interfaceC0142e0.setWindowCallback(this.f2188e.getCallback());
            if (this.f2161A) {
                ((ActionBarOverlayLayout) this.f2194k).j(109);
            }
            if (this.f2207x) {
                ((ActionBarOverlayLayout) this.f2194k).j(2);
            }
            if (this.f2208y) {
                ((ActionBarOverlayLayout) this.f2194k).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2209z + ", windowActionBarOverlay: " + this.f2161A + ", android:windowIsFloating: " + this.f2163C + ", windowActionModeOverlay: " + this.f2162B + ", windowNoTitle: " + this.f2164D + " }");
        }
        m mVar = new m(this, i2);
        WeakHashMap weakHashMap = O.f58a;
        F.E.u(viewGroup, mVar);
        if (this.f2194k == null) {
            this.f2205v = (TextView) viewGroup.findViewById(2131296665);
        }
        Method method = b1.f2779a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296305);
        ViewGroup viewGroup2 = (ViewGroup) this.f2188e.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f2188e.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new m(this, i3));
        this.f2204u = viewGroup;
        Object obj = this.f2186c;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2193j;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0142e0 interfaceC0142e02 = this.f2194k;
            if (interfaceC0142e02 != null) {
                interfaceC0142e02.setWindowTitle(title);
            } else {
                E e4 = this.f2191h;
                if (e4 != null) {
                    e4.p0(title);
                } else {
                    TextView textView = this.f2205v;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2204u.findViewById(R.id.content);
        View decorView = this.f2188e.getDecorView();
        contentFrameLayout2.f891g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = O.f58a;
        if (F.B.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f2203t = true;
        u u2 = u(0);
        if (this.f2171K || u2.f2148h != null) {
            return;
        }
        w(108);
    }

    public final void s() {
        if (this.f2188e == null) {
            Object obj = this.f2186c;
            if (obj instanceof Activity) {
                k(((Activity) obj).getWindow());
            }
        }
        if (this.f2188e == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final s t(Context context) {
        if (this.f2177Q == null) {
            if (C0097c.f2077d == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                C0097c c0097c = new C0097c();
                c0097c.f2080c = new C0094B();
                c0097c.f2078a = applicationContext;
                c0097c.f2079b = locationManager;
                C0097c.f2077d = c0097c;
            }
            this.f2177Q = new q(this, C0097c.f2077d);
        }
        return this.f2177Q;
    }

    public final u u(int i2) {
        u[] uVarArr = this.f2166F;
        if (uVarArr == null || uVarArr.length <= i2) {
            u[] uVarArr2 = new u[i2 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f2166F = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i2];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.f2141a = i2;
        uVar2.f2154n = false;
        uVarArr[i2] = uVar2;
        return uVar2;
    }

    public final void v() {
        r();
        if (this.f2209z && this.f2191h == null) {
            Object obj = this.f2186c;
            if (obj instanceof Activity) {
                this.f2191h = new E((Activity) obj, this.f2161A);
            } else if (obj instanceof Dialog) {
                this.f2191h = new E((Dialog) obj);
            }
            E e2 = this.f2191h;
            if (e2 != null) {
                e2.n0(this.f2182V);
            }
        }
    }

    public final void w(int i2) {
        this.f2180T = (1 << i2) | this.f2180T;
        if (this.f2179S) {
            return;
        }
        View decorView = this.f2188e.getDecorView();
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.m(decorView, this.f2181U);
        this.f2179S = true;
    }

    public final int x(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return t(context).d();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f2178R == null) {
                    this.f2178R = new q(this, context);
                }
                return this.f2178R.d();
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0172, code lost:
    
        if (r0.f2442f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        if (r0 != null) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(e.u r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.y(e.u, android.view.KeyEvent):void");
    }

    public final boolean z(u uVar, int i2, KeyEvent keyEvent) {
        h.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f2151k || A(uVar, keyEvent)) && (oVar = uVar.f2148h) != null) {
            return oVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x010d, code lost:
    
        if (r9.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
