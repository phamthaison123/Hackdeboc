package androidx.appcompat.widget;

import F.AbstractC0024z;
import F.J;
import F.O;
import F.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import d.AbstractC0092a;
import e.AbstractC0095a;
import e.C0097c;
import e.ViewOnClickListenerC0096b;
import e.z;
import g.C0111k;
import h.o;
import h.q;
import i.A0;
import i.C0125B;
import i.C0127D;
import i.C0157m;
import i.InterfaceC0144f0;
import i.U0;
import i.V0;
import i.ViewOnClickListenerC0137c;
import i.W0;
import i.X;
import i.X0;
import i.Y0;
import i.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f940A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f941B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f942C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f943D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f944E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f945F;

    /* renamed from: G, reason: collision with root package name */
    public final C0097c f946G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f947H;

    /* renamed from: I, reason: collision with root package name */
    public final z f948I;

    /* renamed from: J, reason: collision with root package name */
    public Y0 f949J;

    /* renamed from: K, reason: collision with root package name */
    public C0157m f950K;

    /* renamed from: L, reason: collision with root package name */
    public U0 f951L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f952M;

    /* renamed from: N, reason: collision with root package name */
    public final androidx.activity.b f953N;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f954a;

    /* renamed from: b, reason: collision with root package name */
    public X f955b;

    /* renamed from: c, reason: collision with root package name */
    public X f956c;

    /* renamed from: d, reason: collision with root package name */
    public C0125B f957d;

    /* renamed from: e, reason: collision with root package name */
    public C0127D f958e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f959f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f960g;

    /* renamed from: h, reason: collision with root package name */
    public C0125B f961h;

    /* renamed from: i, reason: collision with root package name */
    public View f962i;

    /* renamed from: j, reason: collision with root package name */
    public Context f963j;

    /* renamed from: k, reason: collision with root package name */
    public int f964k;

    /* renamed from: l, reason: collision with root package name */
    public int f965l;

    /* renamed from: m, reason: collision with root package name */
    public int f966m;

    /* renamed from: n, reason: collision with root package name */
    public final int f967n;

    /* renamed from: o, reason: collision with root package name */
    public final int f968o;

    /* renamed from: p, reason: collision with root package name */
    public int f969p;

    /* renamed from: q, reason: collision with root package name */
    public int f970q;

    /* renamed from: r, reason: collision with root package name */
    public int f971r;

    /* renamed from: s, reason: collision with root package name */
    public int f972s;

    /* renamed from: t, reason: collision with root package name */
    public A0 f973t;

    /* renamed from: u, reason: collision with root package name */
    public int f974u;

    /* renamed from: v, reason: collision with root package name */
    public int f975v;

    /* renamed from: w, reason: collision with root package name */
    public final int f976w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f977x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f978y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f979z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0111k(getContext());
    }

    public static V0 h() {
        V0 v0 = new V0(-2, -2);
        v0.f2729b = 0;
        v0.f2074a = 8388627;
        return v0;
    }

    public static V0 i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof V0) {
            V0 v0 = (V0) layoutParams;
            V0 v02 = new V0(v0);
            v02.f2729b = 0;
            v02.f2729b = v0.f2729b;
            return v02;
        }
        if (layoutParams instanceof AbstractC0095a) {
            V0 v03 = new V0((AbstractC0095a) layoutParams);
            v03.f2729b = 0;
            return v03;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            V0 v04 = new V0(layoutParams);
            v04.f2729b = 0;
            return v04;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        V0 v05 = new V0(marginLayoutParams);
        v05.f2729b = 0;
        ((ViewGroup.MarginLayoutParams) v05).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) v05).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) v05).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) v05).bottomMargin = marginLayoutParams.bottomMargin;
        return v05;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        WeakHashMap weakHashMap = O.f58a;
        boolean z2 = AbstractC0024z.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, AbstractC0024z.d(this));
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                V0 v0 = (V0) childAt.getLayoutParams();
                if (v0.f2729b == 0 && t(childAt) && j(v0.f2074a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            V0 v02 = (V0) childAt2.getLayoutParams();
            if (v02.f2729b == 0 && t(childAt2) && j(v02.f2074a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        V0 h2 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (V0) layoutParams;
        h2.f2729b = 1;
        if (!z2 || this.f962i == null) {
            addView(view, h2);
        } else {
            view.setLayoutParams(h2);
            this.f944E.add(view);
        }
    }

    public final void c() {
        if (this.f961h == null) {
            C0125B c0125b = new C0125B(getContext(), null, 2130969530);
            this.f961h = c0125b;
            c0125b.setImageDrawable(this.f959f);
            this.f961h.setContentDescription(this.f960g);
            V0 h2 = h();
            h2.f2074a = (this.f967n & 112) | 8388611;
            h2.f2729b = 2;
            this.f961h.setLayoutParams(h2);
            this.f961h.setOnClickListener(new ViewOnClickListenerC0096b(1, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof V0);
    }

    public final void d() {
        if (this.f973t == null) {
            A0 a02 = new A0();
            a02.f2607a = 0;
            a02.f2608b = 0;
            a02.f2609c = Integer.MIN_VALUE;
            a02.f2610d = Integer.MIN_VALUE;
            a02.f2611e = 0;
            a02.f2612f = 0;
            a02.f2613g = false;
            a02.f2614h = false;
            this.f973t = a02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f954a;
        if (actionMenuView.f870p == null) {
            o oVar = (o) actionMenuView.getMenu();
            if (this.f951L == null) {
                this.f951L = new U0(this);
            }
            this.f954a.setExpandedActionViewsExclusive(true);
            oVar.b(this.f951L, this.f963j);
        }
    }

    public final void f() {
        if (this.f954a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f954a = actionMenuView;
            actionMenuView.setPopupTheme(this.f964k);
            this.f954a.setOnMenuItemClickListener(this.f948I);
            ActionMenuView actionMenuView2 = this.f954a;
            actionMenuView2.f875u = null;
            actionMenuView2.f876v = null;
            V0 h2 = h();
            h2.f2074a = (this.f967n & 112) | 8388613;
            this.f954a.setLayoutParams(h2);
            b(this.f954a, false);
        }
    }

    public final void g() {
        if (this.f957d == null) {
            this.f957d = new C0125B(getContext(), null, 2130969530);
            V0 h2 = h();
            h2.f2074a = (this.f967n & 112) | 8388611;
            this.f957d.setLayoutParams(h2);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0125B c0125b = this.f961h;
        if (c0125b != null) {
            return c0125b.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0125B c0125b = this.f961h;
        if (c0125b != null) {
            return c0125b.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        A0 a02 = this.f973t;
        if (a02 != null) {
            return a02.f2613g ? a02.f2607a : a02.f2608b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f975v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        A0 a02 = this.f973t;
        if (a02 != null) {
            return a02.f2607a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        A0 a02 = this.f973t;
        if (a02 != null) {
            return a02.f2608b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        A0 a02 = this.f973t;
        if (a02 != null) {
            return a02.f2613g ? a02.f2608b : a02.f2607a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f974u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        o oVar;
        ActionMenuView actionMenuView = this.f954a;
        return (actionMenuView == null || (oVar = actionMenuView.f870p) == null || !oVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f975v, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = O.f58a;
        return AbstractC0024z.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = O.f58a;
        return AbstractC0024z.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f974u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0127D c0127d = this.f958e;
        if (c0127d != null) {
            return c0127d.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0127D c0127d = this.f958e;
        if (c0127d != null) {
            return c0127d.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f954a.getMenu();
    }

    public View getNavButtonView() {
        return this.f957d;
    }

    public CharSequence getNavigationContentDescription() {
        C0125B c0125b = this.f957d;
        if (c0125b != null) {
            return c0125b.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0125B c0125b = this.f957d;
        if (c0125b != null) {
            return c0125b.getDrawable();
        }
        return null;
    }

    public C0157m getOuterActionMenuPresenter() {
        return this.f950K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f954a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f963j;
    }

    public int getPopupTheme() {
        return this.f964k;
    }

    public CharSequence getSubtitle() {
        return this.f978y;
    }

    public final TextView getSubtitleTextView() {
        return this.f956c;
    }

    public CharSequence getTitle() {
        return this.f977x;
    }

    public int getTitleMarginBottom() {
        return this.f972s;
    }

    public int getTitleMarginEnd() {
        return this.f970q;
    }

    public int getTitleMarginStart() {
        return this.f969p;
    }

    public int getTitleMarginTop() {
        return this.f971r;
    }

    public final TextView getTitleTextView() {
        return this.f955b;
    }

    public InterfaceC0144f0 getWrapper() {
        Drawable drawable;
        if (this.f949J == null) {
            Y0 y0 = new Y0();
            y0.f2763n = 0;
            y0.f2750a = this;
            y0.f2757h = getTitle();
            y0.f2758i = getSubtitle();
            y0.f2756g = y0.f2757h != null;
            y0.f2755f = getNavigationIcon();
            C0097c t2 = C0097c.t(getContext(), null, AbstractC0092a.f2006a, 2130968581, 0);
            y0.f2764o = t2.g(15);
            CharSequence p2 = t2.p(27);
            if (!TextUtils.isEmpty(p2)) {
                y0.f2756g = true;
                y0.f2757h = p2;
                if ((y0.f2751b & 8) != 0) {
                    Toolbar toolbar = y0.f2750a;
                    toolbar.setTitle(p2);
                    if (y0.f2756g) {
                        O.i(toolbar.getRootView(), p2);
                    }
                }
            }
            CharSequence p3 = t2.p(25);
            if (!TextUtils.isEmpty(p3)) {
                y0.f2758i = p3;
                if ((y0.f2751b & 8) != 0) {
                    setSubtitle(p3);
                }
            }
            Drawable g2 = t2.g(20);
            if (g2 != null) {
                y0.f2754e = g2;
                y0.c();
            }
            Drawable g3 = t2.g(17);
            if (g3 != null) {
                y0.f2753d = g3;
                y0.c();
            }
            if (y0.f2755f == null && (drawable = y0.f2764o) != null) {
                y0.f2755f = drawable;
                int i2 = y0.f2751b & 4;
                Toolbar toolbar2 = y0.f2750a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            y0.a(t2.j(10, 0));
            int m2 = t2.m(9, 0);
            if (m2 != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(m2, (ViewGroup) this, false);
                View view = y0.f2752c;
                if (view != null && (y0.f2751b & 16) != 0) {
                    removeView(view);
                }
                y0.f2752c = inflate;
                if (inflate != null && (y0.f2751b & 16) != 0) {
                    addView(inflate);
                }
                y0.a(y0.f2751b | 16);
            }
            int layoutDimension = ((TypedArray) t2.f2079b).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int c2 = t2.c(7, -1);
            int c3 = t2.c(3, -1);
            if (c2 >= 0 || c3 >= 0) {
                int max = Math.max(c2, 0);
                int max2 = Math.max(c3, 0);
                d();
                this.f973t.a(max, max2);
            }
            int m3 = t2.m(28, 0);
            if (m3 != 0) {
                Context context = getContext();
                this.f965l = m3;
                X x2 = this.f955b;
                if (x2 != null) {
                    x2.setTextAppearance(context, m3);
                }
            }
            int m4 = t2.m(26, 0);
            if (m4 != 0) {
                Context context2 = getContext();
                this.f966m = m4;
                X x3 = this.f956c;
                if (x3 != null) {
                    x3.setTextAppearance(context2, m4);
                }
            }
            int m5 = t2.m(22, 0);
            if (m5 != 0) {
                setPopupTheme(m5);
            }
            t2.u();
            if (2131755009 != y0.f2763n) {
                y0.f2763n = 2131755009;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = y0.f2763n;
                    y0.f2759j = i3 != 0 ? getContext().getString(i3) : null;
                    y0.b();
                }
            }
            y0.f2759j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0137c(y0));
            this.f949J = y0;
        }
        return this.f949J;
    }

    public final int j(int i2) {
        WeakHashMap weakHashMap = O.f58a;
        int d2 = AbstractC0024z.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, d2) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : d2 == 1 ? 5 : 3;
    }

    public final int k(View view, int i2) {
        V0 v0 = (V0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = v0.f2074a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f976w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) v0).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) v0).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) v0).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final void n() {
        Iterator it = this.f947H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenu();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f946G.f2079b).iterator();
        if (it2.hasNext()) {
            Q.i(it2.next());
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f947H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f944E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f953N);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f942C = false;
        }
        if (!this.f942C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f942C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f942C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0293 A[LOOP:0: B:40:0x0291->B:41:0x0293, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02af A[LOOP:1: B:44:0x02ad->B:45:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ce A[LOOP:2: B:48:0x02cc->B:49:0x02ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031c A[LOOP:3: B:57:0x031a->B:58:0x031c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean a2 = b1.a(this);
        int i11 = !a2 ? 1 : 0;
        int i12 = 0;
        if (t(this.f957d)) {
            s(this.f957d, i2, 0, i3, this.f968o);
            i4 = l(this.f957d) + this.f957d.getMeasuredWidth();
            i5 = Math.max(0, m(this.f957d) + this.f957d.getMeasuredHeight());
            i6 = View.combineMeasuredStates(0, this.f957d.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (t(this.f961h)) {
            s(this.f961h, i2, 0, i3, this.f968o);
            i4 = l(this.f961h) + this.f961h.getMeasuredWidth();
            i5 = Math.max(i5, m(this.f961h) + this.f961h.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f961h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        int max2 = Math.max(0, currentContentInsetStart - i4);
        int[] iArr = this.f945F;
        iArr[a2 ? 1 : 0] = max2;
        if (t(this.f954a)) {
            s(this.f954a, i2, max, i3, this.f968o);
            i7 = l(this.f954a) + this.f954a.getMeasuredWidth();
            i5 = Math.max(i5, m(this.f954a) + this.f954a.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f954a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (t(this.f962i)) {
            max3 += r(this.f962i, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f962i) + this.f962i.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f962i.getMeasuredState());
        }
        if (t(this.f958e)) {
            max3 += r(this.f958e, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f958e) + this.f958e.getMeasuredHeight());
            i6 = View.combineMeasuredStates(i6, this.f958e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((V0) childAt.getLayoutParams()).f2729b == 0 && t(childAt)) {
                max3 += r(childAt, i2, max3, i3, 0, iArr);
                i5 = Math.max(i5, m(childAt) + childAt.getMeasuredHeight());
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i14 = this.f971r + this.f972s;
        int i15 = this.f969p + this.f970q;
        if (t(this.f955b)) {
            r(this.f955b, i2, max3 + i15, i3, i14, iArr);
            int l2 = l(this.f955b) + this.f955b.getMeasuredWidth();
            i8 = m(this.f955b) + this.f955b.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i6, this.f955b.getMeasuredState());
            i10 = l2;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (t(this.f956c)) {
            i10 = Math.max(i10, r(this.f956c, i2, max3 + i15, i3, i8 + i14, iArr));
            i8 += m(this.f956c) + this.f956c.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.f956c.getMeasuredState());
        }
        int max4 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i10, getSuggestedMinimumWidth()), i2, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i9 << 16);
        if (this.f952M) {
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i12);
        }
        i12 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof X0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        X0 x0 = (X0) parcelable;
        super.onRestoreInstanceState(x0.f173a);
        ActionMenuView actionMenuView = this.f954a;
        o oVar = actionMenuView != null ? actionMenuView.f870p : null;
        int i2 = x0.f2748c;
        if (i2 != 0 && this.f951L != null && oVar != null && (findItem = oVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (x0.f2749d) {
            androidx.activity.b bVar = this.f953N;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        A0 a02 = this.f973t;
        boolean z2 = i2 == 1;
        if (z2 == a02.f2613g) {
            return;
        }
        a02.f2613g = z2;
        if (!a02.f2614h) {
            a02.f2607a = a02.f2611e;
            a02.f2608b = a02.f2612f;
            return;
        }
        if (z2) {
            int i3 = a02.f2610d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = a02.f2611e;
            }
            a02.f2607a = i3;
            int i4 = a02.f2609c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = a02.f2612f;
            }
            a02.f2608b = i4;
            return;
        }
        int i5 = a02.f2609c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = a02.f2611e;
        }
        a02.f2607a = i5;
        int i6 = a02.f2610d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = a02.f2612f;
        }
        a02.f2608b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0157m c0157m;
        q qVar;
        X0 x0 = new X0(super.onSaveInstanceState());
        U0 u0 = this.f951L;
        if (u0 != null && (qVar = u0.f2724b) != null) {
            x0.f2748c = qVar.f2480a;
        }
        ActionMenuView actionMenuView = this.f954a;
        x0.f2749d = (actionMenuView == null || (c0157m = actionMenuView.f874t) == null || !c0157m.i()) ? false : true;
        return x0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f941B = false;
        }
        if (!this.f941B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f941B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f941B = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i3, int[] iArr) {
        V0 v0 = (V0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) v0).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) v0).rightMargin + max;
    }

    public final int q(View view, int i2, int i3, int[] iArr) {
        V0 v0 = (V0) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) v0).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) v0).leftMargin);
    }

    public final int r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(B.a.A(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f952M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f975v) {
            this.f975v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f974u) {
            this.f974u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(B.a.A(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(B.a.A(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f957d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(W0 w0) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f954a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f964k != i2) {
            this.f964k = i2;
            if (i2 == 0) {
                this.f963j = getContext();
            } else {
                this.f963j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f972s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f970q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f969p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f971r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 2130969531);
        this.f976w = 8388627;
        this.f943D = new ArrayList();
        this.f944E = new ArrayList();
        this.f945F = new int[2];
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q(2, this);
        C0097c c0097c = new C0097c();
        c0097c.f2079b = new CopyOnWriteArrayList();
        c0097c.f2080c = new HashMap();
        c0097c.f2078a = qVar;
        this.f946G = c0097c;
        this.f947H = new ArrayList();
        this.f948I = new z(6, this);
        this.f953N = new androidx.activity.b(3, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0092a.f2029x;
        C0097c t2 = C0097c.t(context2, attributeSet, iArr, 2130969531, 0);
        TypedArray typedArray = (TypedArray) t2.f2079b;
        WeakHashMap weakHashMap = O.f58a;
        J.c(this, context, iArr, attributeSet, typedArray, 2130969531, 0);
        this.f965l = t2.m(28, 0);
        this.f966m = t2.m(19, 0);
        this.f976w = ((TypedArray) t2.f2079b).getInteger(0, 8388627);
        this.f967n = ((TypedArray) t2.f2079b).getInteger(2, 48);
        int c2 = t2.c(22, 0);
        c2 = t2.r(27) ? t2.c(27, c2) : c2;
        this.f972s = c2;
        this.f971r = c2;
        this.f970q = c2;
        this.f969p = c2;
        int c3 = t2.c(25, -1);
        if (c3 >= 0) {
            this.f969p = c3;
        }
        int c4 = t2.c(24, -1);
        if (c4 >= 0) {
            this.f970q = c4;
        }
        int c5 = t2.c(26, -1);
        if (c5 >= 0) {
            this.f971r = c5;
        }
        int c6 = t2.c(23, -1);
        if (c6 >= 0) {
            this.f972s = c6;
        }
        this.f968o = t2.d(13, -1);
        int c7 = t2.c(9, Integer.MIN_VALUE);
        int c8 = t2.c(5, Integer.MIN_VALUE);
        int d2 = t2.d(7, 0);
        int d3 = t2.d(8, 0);
        d();
        A0 a02 = this.f973t;
        a02.f2614h = false;
        if (d2 != Integer.MIN_VALUE) {
            a02.f2611e = d2;
            a02.f2607a = d2;
        }
        if (d3 != Integer.MIN_VALUE) {
            a02.f2612f = d3;
            a02.f2608b = d3;
        }
        if (c7 != Integer.MIN_VALUE || c8 != Integer.MIN_VALUE) {
            a02.a(c7, c8);
        }
        this.f974u = t2.c(10, Integer.MIN_VALUE);
        this.f975v = t2.c(6, Integer.MIN_VALUE);
        this.f959f = t2.g(4);
        this.f960g = t2.p(3);
        CharSequence p2 = t2.p(21);
        if (!TextUtils.isEmpty(p2)) {
            setTitle(p2);
        }
        CharSequence p3 = t2.p(18);
        if (!TextUtils.isEmpty(p3)) {
            setSubtitle(p3);
        }
        this.f963j = getContext();
        setPopupTheme(t2.m(17, 0));
        Drawable g2 = t2.g(16);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence p4 = t2.p(15);
        if (!TextUtils.isEmpty(p4)) {
            setNavigationContentDescription(p4);
        }
        Drawable g3 = t2.g(11);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence p5 = t2.p(12);
        if (!TextUtils.isEmpty(p5)) {
            setLogoDescription(p5);
        }
        if (t2.r(29)) {
            setTitleTextColor(t2.b(29));
        }
        if (t2.r(20)) {
            setSubtitleTextColor(t2.b(20));
        }
        if (t2.r(14)) {
            getMenuInflater().inflate(t2.m(14, 0), getMenu());
        }
        t2.u();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        V0 v0 = new V0(context, attributeSet);
        v0.f2074a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0092a.f2007b);
        v0.f2074a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        v0.f2729b = 0;
        return v0;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0125B c0125b = this.f961h;
        if (c0125b != null) {
            c0125b.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f961h.setImageDrawable(drawable);
        } else {
            C0125B c0125b = this.f961h;
            if (c0125b != null) {
                c0125b.setImageDrawable(this.f959f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f958e == null) {
                this.f958e = new C0127D(getContext(), null, 0);
            }
            if (!o(this.f958e)) {
                b(this.f958e, true);
            }
        } else {
            C0127D c0127d = this.f958e;
            if (c0127d != null && o(c0127d)) {
                removeView(this.f958e);
                this.f944E.remove(this.f958e);
            }
        }
        C0127D c0127d2 = this.f958e;
        if (c0127d2 != null) {
            c0127d2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f958e == null) {
            this.f958e = new C0127D(getContext(), null, 0);
        }
        C0127D c0127d = this.f958e;
        if (c0127d != null) {
            c0127d.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0125B c0125b = this.f957d;
        if (c0125b != null) {
            c0125b.setContentDescription(charSequence);
            this.f957d.setTooltipText(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f957d)) {
                b(this.f957d, true);
            }
        } else {
            C0125B c0125b = this.f957d;
            if (c0125b != null && o(c0125b)) {
                removeView(this.f957d);
                this.f944E.remove(this.f957d);
            }
        }
        C0125B c0125b2 = this.f957d;
        if (c0125b2 != null) {
            c0125b2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            X x2 = this.f956c;
            if (x2 != null && o(x2)) {
                removeView(this.f956c);
                this.f944E.remove(this.f956c);
            }
        } else {
            if (this.f956c == null) {
                Context context = getContext();
                X x3 = new X(context, null);
                this.f956c = x3;
                x3.setSingleLine();
                this.f956c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f966m;
                if (i2 != 0) {
                    this.f956c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f940A;
                if (colorStateList != null) {
                    this.f956c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f956c)) {
                b(this.f956c, true);
            }
        }
        X x4 = this.f956c;
        if (x4 != null) {
            x4.setText(charSequence);
        }
        this.f978y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f940A = colorStateList;
        X x2 = this.f956c;
        if (x2 != null) {
            x2.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            X x2 = this.f955b;
            if (x2 != null && o(x2)) {
                removeView(this.f955b);
                this.f944E.remove(this.f955b);
            }
        } else {
            if (this.f955b == null) {
                Context context = getContext();
                X x3 = new X(context, null);
                this.f955b = x3;
                x3.setSingleLine();
                this.f955b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f965l;
                if (i2 != 0) {
                    this.f955b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f979z;
                if (colorStateList != null) {
                    this.f955b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f955b)) {
                b(this.f955b, true);
            }
        }
        X x4 = this.f955b;
        if (x4 != null) {
            x4.setText(charSequence);
        }
        this.f977x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f979z = colorStateList;
        X x2 = this.f955b;
        if (x2 != null) {
            x2.setTextColor(colorStateList);
        }
    }
}
