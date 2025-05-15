package e;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import i.C0178x;
import i.U;
import p.C0209b;

/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0097c implements I.e, H.b {

    /* renamed from: d, reason: collision with root package name */
    public static C0097c f2077d;

    /* renamed from: a, reason: collision with root package name */
    public Object f2078a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2079b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2080c;

    public C0097c(Context context, TypedArray typedArray) {
        this.f2078a = context;
        this.f2079b = typedArray;
    }

    public static C0097c t(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new C0097c(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public final boolean a(int i2, boolean z2) {
        return ((TypedArray) this.f2079b).getBoolean(i2, z2);
    }

    public final ColorStateList b(int i2) {
        int resourceId;
        ColorStateList x2;
        TypedArray typedArray = (TypedArray) this.f2079b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (x2 = B.a.x((Context) this.f2078a, resourceId)) == null) ? typedArray.getColorStateList(i2) : x2;
    }

    public final int c(int i2, int i3) {
        return ((TypedArray) this.f2079b).getDimensionPixelOffset(i2, i3);
    }

    public final int d(int i2, int i3) {
        return ((TypedArray) this.f2079b).getDimensionPixelSize(i2, i3);
    }

    @Override // H.b
    public final ClipDescription e() {
        return (ClipDescription) this.f2079b;
    }

    @Override // H.b
    public final void f() {
    }

    public final Drawable g(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f2079b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : B.a.A((Context) this.f2078a, resourceId);
    }

    public final Drawable h(int i2) {
        int resourceId;
        Drawable f2;
        if (!((TypedArray) this.f2079b).hasValue(i2) || (resourceId = ((TypedArray) this.f2079b).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C0178x a2 = C0178x.a();
        Context context = (Context) this.f2078a;
        synchronized (a2) {
            f2 = a2.f2947a.f(context, resourceId, true);
        }
        return f2;
    }

    public final Typeface i(int i2, int i3, U u2) {
        int resourceId = ((TypedArray) this.f2079b).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f2080c) == null) {
            this.f2080c = new TypedValue();
        }
        Context context = (Context) this.f2078a;
        TypedValue typedValue = (TypedValue) this.f2080c;
        ThreadLocal threadLocal = x.k.f3762a;
        if (context.isRestricted()) {
            return null;
        }
        return x.k.b(context, resourceId, typedValue, i3, u2, true, false);
    }

    public final int j(int i2, int i3) {
        return ((TypedArray) this.f2079b).getInt(i2, i3);
    }

    @Override // H.b
    public final Uri k() {
        return (Uri) this.f2080c;
    }

    public final Location l(String str) {
        Object obj = this.f2079b;
        try {
            if (((LocationManager) obj).isProviderEnabled(str)) {
                return ((LocationManager) obj).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    public final int m(int i2, int i3) {
        return ((TypedArray) this.f2079b).getResourceId(i2, i3);
    }

    @Override // H.b
    public final Object n() {
        return null;
    }

    public final String o(int i2) {
        return ((TypedArray) this.f2079b).getString(i2);
    }

    public final CharSequence p(int i2) {
        return ((TypedArray) this.f2079b).getText(i2);
    }

    @Override // H.b
    public final Uri q() {
        return (Uri) this.f2078a;
    }

    public final boolean r(int i2) {
        return ((TypedArray) this.f2079b).hasValue(i2);
    }

    public final boolean s(q.e eVar, o.d dVar, boolean z2) {
        C0209b c0209b = (C0209b) this.f2079b;
        int[] iArr = dVar.f3311c0;
        c0209b.f3437a = iArr[0];
        c0209b.f3438b = iArr[1];
        c0209b.f3439c = dVar.j();
        c0209b.f3440d = dVar.g();
        c0209b.f3445i = false;
        c0209b.f3446j = z2;
        boolean z3 = c0209b.f3437a == 3;
        boolean z4 = c0209b.f3438b == 3;
        boolean z5 = z3 && dVar.f3291L > 0.0f;
        boolean z6 = z4 && dVar.f3291L > 0.0f;
        int[] iArr2 = dVar.f3320l;
        if (z5 && iArr2[0] == 4) {
            c0209b.f3437a = 1;
        }
        if (z6 && iArr2[1] == 4) {
            c0209b.f3438b = 1;
        }
        eVar.a(dVar, c0209b);
        dVar.v(c0209b.f3441e);
        dVar.s(c0209b.f3442f);
        dVar.f3331w = c0209b.f3444h;
        int i2 = c0209b.f3443g;
        dVar.f3295P = i2;
        dVar.f3331w = i2 > 0;
        c0209b.f3446j = false;
        return c0209b.f3445i;
    }

    public final void u() {
        ((TypedArray) this.f2079b).recycle();
    }

    public final void v(o.e eVar, int i2, int i3) {
        int i4 = eVar.f3296Q;
        int i5 = eVar.f3297R;
        eVar.f3296Q = 0;
        eVar.f3297R = 0;
        eVar.v(i2);
        eVar.s(i3);
        if (i4 < 0) {
            eVar.f3296Q = 0;
        } else {
            eVar.f3296Q = i4;
        }
        if (i5 < 0) {
            eVar.f3297R = 0;
        } else {
            eVar.f3297R = i5;
        }
        ((o.e) this.f2080c).C();
    }
}
