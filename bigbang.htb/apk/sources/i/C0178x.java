package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* renamed from: i.x, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0178x {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2945b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0178x f2946c;

    /* renamed from: a, reason: collision with root package name */
    public C0181y0 f2947a;

    public static synchronized C0178x a() {
        C0178x c0178x;
        synchronized (C0178x.class) {
            try {
                if (f2946c == null) {
                    c();
                }
                c0178x = f2946c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0178x;
    }

    public static synchronized void c() {
        synchronized (C0178x.class) {
            if (f2946c == null) {
                C0178x c0178x = new C0178x();
                f2946c = c0178x;
                c0178x.f2947a = C0181y0.c();
                C0181y0 c0181y0 = f2946c.f2947a;
                C0176w c0176w = new C0176w();
                synchronized (c0181y0) {
                    c0181y0.f2959e = c0176w;
                }
            }
        }
    }

    public static void d(Drawable drawable, S0 s0, int[] iArr) {
        PorterDuff.Mode mode = C0181y0.f2952f;
        if (AbstractC0146g0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = s0.f2707b;
        if (!z2 && !s0.f2706a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) s0.f2708c : null;
        PorterDuff.Mode mode2 = s0.f2706a ? (PorterDuff.Mode) s0.f2709d : C0181y0.f2952f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = C0181y0.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f2947a.e(context, i2);
    }
}
