package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import d.AbstractC0092a;
import e.C0097c;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2882a;

    /* renamed from: b, reason: collision with root package name */
    public int f2883b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2884c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2885d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2886e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2887f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2888g;

    public r(View view) {
        this.f2882a = 0;
        this.f2883b = -1;
        this.f2884c = view;
        this.f2885d = C0178x.a();
    }

    public static r b(Context context, int i2) {
        B.a.m(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, X.a.f693n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList f2 = h0.k.f(context, obtainStyledAttributes, 4);
        ColorStateList f3 = h0.k.f(context, obtainStyledAttributes, 9);
        ColorStateList f4 = h0.k.f(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        m0.l a2 = m0.l.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new m0.a(0)).a();
        obtainStyledAttributes.recycle();
        return new r(f2, f3, f4, dimensionPixelSize, a2, rect);
    }

    public final void a() {
        View view = (View) this.f2884c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((S0) this.f2886e) != null) {
                if (((S0) this.f2888g) == null) {
                    this.f2888g = new S0(0);
                }
                S0 s0 = (S0) this.f2888g;
                s0.f2708c = null;
                s0.f2707b = false;
                s0.f2709d = null;
                s0.f2706a = false;
                WeakHashMap weakHashMap = F.O.f58a;
                ColorStateList g2 = F.E.g(view);
                if (g2 != null) {
                    s0.f2707b = true;
                    s0.f2708c = g2;
                }
                PorterDuff.Mode h2 = F.E.h(view);
                if (h2 != null) {
                    s0.f2706a = true;
                    s0.f2709d = h2;
                }
                if (s0.f2707b || s0.f2706a) {
                    C0178x.d(background, s0, view.getDrawableState());
                    return;
                }
            }
            S0 s02 = (S0) this.f2887f;
            if (s02 != null) {
                C0178x.d(background, s02, view.getDrawableState());
                return;
            }
            S0 s03 = (S0) this.f2886e;
            if (s03 != null) {
                C0178x.d(background, s03, view.getDrawableState());
            }
        }
    }

    public final ColorStateList c() {
        Object obj = this.f2887f;
        if (((S0) obj) != null) {
            return (ColorStateList) ((S0) obj).f2708c;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        Object obj = this.f2887f;
        if (((S0) obj) != null) {
            return (PorterDuff.Mode) ((S0) obj).f2709d;
        }
        return null;
    }

    public final void e(AttributeSet attributeSet, int i2) {
        ColorStateList h2;
        Object obj = this.f2884c;
        View view = (View) obj;
        Context context = view.getContext();
        int[] iArr = AbstractC0092a.f2031z;
        C0097c t2 = C0097c.t(context, attributeSet, iArr, i2, 0);
        Context context2 = view.getContext();
        TypedArray typedArray = (TypedArray) t2.f2079b;
        WeakHashMap weakHashMap = F.O.f58a;
        F.J.c(view, context2, iArr, attributeSet, typedArray, i2, 0);
        try {
            if (t2.r(0)) {
                this.f2883b = t2.m(0, -1);
                C0178x c0178x = (C0178x) this.f2885d;
                Context context3 = ((View) obj).getContext();
                int i3 = this.f2883b;
                synchronized (c0178x) {
                    h2 = c0178x.f2947a.h(context3, i3);
                }
                if (h2 != null) {
                    h(h2);
                }
            }
            if (t2.r(1)) {
                F.E.q((View) obj, t2.b(1));
            }
            if (t2.r(2)) {
                F.E.r((View) obj, AbstractC0146g0.c(t2.j(2, -1), null));
            }
            t2.u();
        } catch (Throwable th) {
            t2.u();
            throw th;
        }
    }

    public final void f() {
        this.f2883b = -1;
        h(null);
        a();
    }

    public final void g(int i2) {
        ColorStateList colorStateList;
        this.f2883b = i2;
        C0178x c0178x = (C0178x) this.f2885d;
        if (c0178x != null) {
            Context context = ((View) this.f2884c).getContext();
            synchronized (c0178x) {
                colorStateList = c0178x.f2947a.h(context, i2);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((S0) this.f2886e) == null) {
                this.f2886e = new S0(0);
            }
            Object obj = this.f2886e;
            ((S0) obj).f2708c = colorStateList;
            ((S0) obj).f2707b = true;
        } else {
            this.f2886e = null;
        }
        a();
    }

    public final void i(ColorStateList colorStateList) {
        if (((S0) this.f2887f) == null) {
            this.f2887f = new S0(0);
        }
        S0 s0 = (S0) this.f2887f;
        s0.f2708c = colorStateList;
        s0.f2707b = true;
        a();
    }

    public final void j(PorterDuff.Mode mode) {
        if (((S0) this.f2887f) == null) {
            this.f2887f = new S0(0);
        }
        S0 s0 = (S0) this.f2887f;
        s0.f2709d = mode;
        s0.f2706a = true;
        a();
    }

    public final String toString() {
        switch (this.f2882a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f2884c) + ", mProviderPackage: " + ((String) this.f2885d) + ", mQuery: " + ((String) this.f2886e) + ", mCertificates:");
                for (int i2 = 0; i2 < ((List) this.f2887f).size(); i2++) {
                    sb.append(" [");
                    List list = (List) ((List) this.f2887f).get(i2);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}");
                sb.append("mCertificatesArray: " + this.f2883b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public r(String str, String str2, String str3, List list) {
        this.f2882a = 1;
        str.getClass();
        this.f2884c = str;
        str2.getClass();
        this.f2885d = str2;
        this.f2886e = str3;
        list.getClass();
        this.f2887f = list;
        this.f2883b = 0;
        this.f2888g = str + "-" + str2 + "-" + str3;
    }

    public r(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, m0.l lVar, Rect rect) {
        this.f2882a = 2;
        B.a.n(rect.left);
        B.a.n(rect.top);
        B.a.n(rect.right);
        B.a.n(rect.bottom);
        this.f2884c = rect;
        this.f2885d = colorStateList2;
        this.f2886e = colorStateList;
        this.f2887f = colorStateList3;
        this.f2883b = i2;
        this.f2888g = lVar;
    }
}
