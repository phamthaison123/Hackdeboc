package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.AbstractC0192d;
import l.C0193e;

/* renamed from: i.y0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0181y0 {

    /* renamed from: g, reason: collision with root package name */
    public static C0181y0 f2953g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2955a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2956b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2957c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2958d;

    /* renamed from: e, reason: collision with root package name */
    public C0176w f2959e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2952f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final C0179x0 f2954h = new C0179x0(6);

    public static synchronized C0181y0 c() {
        C0181y0 c0181y0;
        synchronized (C0181y0.class) {
            try {
                if (f2953g == null) {
                    f2953g = new C0181y0();
                }
                c0181y0 = f2953g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0181y0;
    }

    public static synchronized PorterDuffColorFilter g(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0181y0.class) {
            C0179x0 c0179x0 = f2954h;
            c0179x0.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c0179x0.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0193e c0193e = (C0193e) this.f2956b.get(context);
                if (c0193e == null) {
                    c0193e = new C0193e();
                    this.f2956b.put(context, c0193e);
                }
                c0193e.e(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i2) {
        if (this.f2957c == null) {
            this.f2957c = new TypedValue();
        }
        TypedValue typedValue = this.f2957c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d2 = d(context, j2);
        if (d2 != null) {
            return d2;
        }
        LayerDrawable layerDrawable = null;
        if (this.f2959e != null) {
            if (i2 == 2131230743) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, 2131230742), e(context, 2131230744)});
            } else if (i2 == 2131230778) {
                layerDrawable = C0176w.c(this, context, 2131165243);
            } else if (i2 == 2131230777) {
                layerDrawable = C0176w.c(this, context, 2131165244);
            } else if (i2 == 2131230779) {
                layerDrawable = C0176w.c(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j2) {
        C0193e c0193e = (C0193e) this.f2956b.get(context);
        if (c0193e == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0193e.d(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b2 = AbstractC0192d.b(c0193e.f3023b, c0193e.f3025d, j2);
            if (b2 >= 0) {
                Object[] objArr = c0193e.f3024c;
                Object obj = objArr[b2];
                Object obj2 = C0193e.f3021e;
                if (obj != obj2) {
                    objArr[b2] = obj2;
                    c0193e.f3022a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i2) {
        return f(context, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r0.setTintMode(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r9, int r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f2958d     // Catch: java.lang.Throwable -> Lde
            if (r0 == 0) goto L6
            goto L26
        L6:
            r0 = 1
            r8.f2958d = r0     // Catch: java.lang.Throwable -> Lde
            r0 = 2131230805(0x7f080055, float:1.8077673E38)
            android.graphics.drawable.Drawable r0 = r8.e(r9, r0)     // Catch: java.lang.Throwable -> Lde
            if (r0 == 0) goto Le2
            boolean r1 = r0 instanceof V.b     // Catch: java.lang.Throwable -> Lde
            if (r1 != 0) goto L26
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lde
            if (r0 == 0) goto Le2
        L26:
            android.graphics.drawable.Drawable r0 = r8.b(r9, r10)     // Catch: java.lang.Throwable -> Lde
            if (r0 != 0) goto L32
            java.lang.Object r0 = w.e.f3731a     // Catch: java.lang.Throwable -> Lde
            android.graphics.drawable.Drawable r0 = w.AbstractC0235c.b(r9, r10)     // Catch: java.lang.Throwable -> Lde
        L32:
            if (r0 == 0) goto Ld8
            android.content.res.ColorStateList r1 = r8.h(r9, r10)     // Catch: java.lang.Throwable -> Lde
            r2 = 0
            if (r1 == 0) goto L5b
            boolean r9 = i.AbstractC0146g0.a(r0)     // Catch: java.lang.Throwable -> Lde
            if (r9 == 0) goto L45
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch: java.lang.Throwable -> Lde
        L45:
            r0.setTintList(r1)     // Catch: java.lang.Throwable -> Lde
            i.w r9 = r8.f2959e     // Catch: java.lang.Throwable -> Lde
            if (r9 != 0) goto L4d
            goto L54
        L4d:
            r9 = 2131230792(0x7f080048, float:1.8077647E38)
            if (r10 != r9) goto L54
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Throwable -> Lde
        L54:
            if (r2 == 0) goto Ld8
            r0.setTintMode(r2)     // Catch: java.lang.Throwable -> Lde
            goto Ld8
        L5b:
            i.w r1 = r8.f2959e     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto Lcf
            r1 = 2131230787(0x7f080043, float:1.8077637E38)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            r6 = 2130968773(0x7f0400c5, float:1.754621E38)
            r7 = 2130968775(0x7f0400c7, float:1.7546213E38)
            if (r10 != r1) goto L99
            r10 = r0
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10     // Catch: java.lang.Throwable -> Lde
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> Lde
            int r1 = i.Q0.c(r9, r7)     // Catch: java.lang.Throwable -> Lde
            android.graphics.PorterDuff$Mode r2 = i.C0178x.f2945b     // Catch: java.lang.Throwable -> Lde
            i.C0176w.e(r11, r1, r2)     // Catch: java.lang.Throwable -> Lde
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> Lde
            int r1 = i.Q0.c(r9, r7)     // Catch: java.lang.Throwable -> Lde
            i.C0176w.e(r11, r1, r2)     // Catch: java.lang.Throwable -> Lde
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> Lde
            int r9 = i.Q0.c(r9, r6)     // Catch: java.lang.Throwable -> Lde
            i.C0176w.e(r10, r9, r2)     // Catch: java.lang.Throwable -> Lde
            goto Ld8
        L99:
            r1 = 2131230778(0x7f08003a, float:1.8077618E38)
            if (r10 == r1) goto La8
            r1 = 2131230777(0x7f080039, float:1.8077616E38)
            if (r10 == r1) goto La8
            r1 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r10 != r1) goto Lcf
        La8:
            r10 = r0
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10     // Catch: java.lang.Throwable -> Lde
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> Lde
            int r1 = i.Q0.b(r9, r7)     // Catch: java.lang.Throwable -> Lde
            android.graphics.PorterDuff$Mode r2 = i.C0178x.f2945b     // Catch: java.lang.Throwable -> Lde
            i.C0176w.e(r11, r1, r2)     // Catch: java.lang.Throwable -> Lde
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> Lde
            int r1 = i.Q0.c(r9, r6)     // Catch: java.lang.Throwable -> Lde
            i.C0176w.e(r11, r1, r2)     // Catch: java.lang.Throwable -> Lde
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> Lde
            int r9 = i.Q0.c(r9, r6)     // Catch: java.lang.Throwable -> Lde
            i.C0176w.e(r10, r9, r2)     // Catch: java.lang.Throwable -> Lde
            goto Ld8
        Lcf:
            boolean r9 = r8.i(r9, r10, r0)     // Catch: java.lang.Throwable -> Lde
            if (r9 != 0) goto Ld8
            if (r11 == 0) goto Ld8
            r0 = r2
        Ld8:
            if (r0 == 0) goto Le0
            i.AbstractC0146g0.b(r0)     // Catch: java.lang.Throwable -> Lde
            goto Le0
        Lde:
            r9 = move-exception
            goto Led
        Le0:
            monitor-exit(r8)
            return r0
        Le2:
            r9 = 0
            r8.f2958d = r9     // Catch: java.lang.Throwable -> Lde
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lde
            java.lang.String r10 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lde
            throw r9     // Catch: java.lang.Throwable -> Lde
        Led:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0181y0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList h(Context context, int i2) {
        ColorStateList colorStateList;
        l.l lVar;
        WeakHashMap weakHashMap = this.f2955a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (lVar = (l.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.c(i2, null);
        if (colorStateList == null) {
            C0176w c0176w = this.f2959e;
            if (c0176w != null) {
                colorStateList2 = c0176w.d(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f2955a == null) {
                    this.f2955a = new WeakHashMap();
                }
                l.l lVar2 = (l.l) this.f2955a.get(context);
                if (lVar2 == null) {
                    lVar2 = new l.l();
                    this.f2955a.put(context, lVar2);
                }
                lVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            i.w r6 = r6.f2959e
            r0 = 0
            if (r6 == 0) goto L74
            android.graphics.PorterDuff$Mode r1 = i.C0178x.f2945b
            int[] r2 = r6.f2938a
            boolean r2 = i.C0176w.a(r2, r8)
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L17
            r6 = 2130968775(0x7f0400c7, float:1.7546213E38)
        L14:
            r2 = r3
        L15:
            r8 = r4
            goto L4f
        L17:
            int[] r2 = r6.f2940c
            boolean r2 = i.C0176w.a(r2, r8)
            if (r2 == 0) goto L23
            r6 = 2130968773(0x7f0400c5, float:1.754621E38)
            goto L14
        L23:
            int[] r6 = r6.f2941d
            boolean r6 = i.C0176w.a(r6, r8)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r6 == 0) goto L32
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L30:
            r6 = r2
            goto L14
        L32:
            r6 = 2131230764(0x7f08002c, float:1.807759E38)
            if (r8 != r6) goto L46
            r6 = 1109603123(0x42233333, float:40.8)
            int r6 = java.lang.Math.round(r6)
            r8 = 16842800(0x1010030, float:2.3693693E-38)
            r2 = r3
            r5 = r8
            r8 = r6
            r6 = r5
            goto L4f
        L46:
            r6 = 2131230746(0x7f08001a, float:1.8077553E38)
            if (r8 != r6) goto L4c
            goto L30
        L4c:
            r6 = r0
            r2 = r6
            goto L15
        L4f:
            if (r2 == 0) goto L74
            boolean r0 = i.AbstractC0146g0.a(r9)
            if (r0 == 0) goto L5b
            android.graphics.drawable.Drawable r9 = r9.mutate()
        L5b:
            int r6 = i.Q0.c(r7, r6)
            java.lang.Class<i.x> r7 = i.C0178x.class
            monitor-enter(r7)
            android.graphics.PorterDuffColorFilter r6 = g(r6, r1)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r7)
            r9.setColorFilter(r6)
            if (r8 == r4) goto L6f
            r9.setAlpha(r8)
        L6f:
            r0 = r3
            goto L74
        L71:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0181y0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
