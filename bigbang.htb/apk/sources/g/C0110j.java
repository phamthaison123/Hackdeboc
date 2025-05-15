package g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import h.q;
import h.r;
import h.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: g.j, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0110j {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2301A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2302B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0111k f2305E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f2306a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2313h;

    /* renamed from: i, reason: collision with root package name */
    public int f2314i;

    /* renamed from: j, reason: collision with root package name */
    public int f2315j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2316k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2317l;

    /* renamed from: m, reason: collision with root package name */
    public int f2318m;

    /* renamed from: n, reason: collision with root package name */
    public char f2319n;

    /* renamed from: o, reason: collision with root package name */
    public int f2320o;

    /* renamed from: p, reason: collision with root package name */
    public char f2321p;

    /* renamed from: q, reason: collision with root package name */
    public int f2322q;

    /* renamed from: r, reason: collision with root package name */
    public int f2323r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2324s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2325t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2326u;

    /* renamed from: v, reason: collision with root package name */
    public int f2327v;

    /* renamed from: w, reason: collision with root package name */
    public int f2328w;

    /* renamed from: x, reason: collision with root package name */
    public String f2329x;

    /* renamed from: y, reason: collision with root package name */
    public String f2330y;

    /* renamed from: z, reason: collision with root package name */
    public r f2331z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2303C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f2304D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2307b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2308c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2309d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2310e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2311f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2312g = true;

    public C0110j(C0111k c0111k, Menu menu) {
        this.f2305E = c0111k;
        this.f2306a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f2305E.f2336c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f2324s).setVisible(this.f2325t).setEnabled(this.f2326u).setCheckable(this.f2323r >= 1).setTitleCondensed(this.f2317l).setIcon(this.f2318m);
        int i2 = this.f2327v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f2330y;
        C0111k c0111k = this.f2305E;
        if (str != null) {
            if (c0111k.f2336c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0111k.f2337d == null) {
                c0111k.f2337d = C0111k.a(c0111k.f2336c);
            }
            Object obj = c0111k.f2337d;
            String str2 = this.f2330y;
            MenuItemOnMenuItemClickListenerC0109i menuItemOnMenuItemClickListenerC0109i = new MenuItemOnMenuItemClickListenerC0109i();
            menuItemOnMenuItemClickListenerC0109i.f2299a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0109i.f2300b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0109i.f2298c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0109i);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2323r >= 2) {
            if (menuItem instanceof q) {
                q qVar = (q) menuItem;
                qVar.f2503x = (qVar.f2503x & (-5)) | 4;
            } else if (menuItem instanceof w) {
                w wVar = (w) menuItem;
                try {
                    Method method = wVar.f2515e;
                    A.b bVar = wVar.f2514d;
                    if (method == null) {
                        wVar.f2515e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wVar.f2515e.invoke(bVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f2329x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0111k.f2332e, c0111k.f2334a));
            z2 = true;
        }
        int i3 = this.f2328w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        r rVar = this.f2331z;
        if (rVar != null) {
            if (menuItem instanceof A.b) {
                ((A.b) menuItem).b(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f2301A;
        boolean z3 = menuItem instanceof A.b;
        if (z3) {
            ((A.b) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f2302B;
        if (z3) {
            ((A.b) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c2 = this.f2319n;
        int i4 = this.f2320o;
        if (z3) {
            ((A.b) menuItem).setAlphabeticShortcut(c2, i4);
        } else {
            menuItem.setAlphabeticShortcut(c2, i4);
        }
        char c3 = this.f2321p;
        int i5 = this.f2322q;
        if (z3) {
            ((A.b) menuItem).setNumericShortcut(c3, i5);
        } else {
            menuItem.setNumericShortcut(c3, i5);
        }
        PorterDuff.Mode mode = this.f2304D;
        if (mode != null) {
            if (z3) {
                ((A.b) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f2303C;
        if (colorStateList != null) {
            if (z3) {
                ((A.b) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
