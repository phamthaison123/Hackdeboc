package h0;

import F.E;
import F.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import e.C0097c;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2603a = {2130968793};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2604b = {2130968798};

    public static void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f679B, i2, i3);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130969049, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f2604b, "Theme.MaterialComponents");
            }
        }
        c(context, f2603a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = X.a.f679B
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.k.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static B.a d(int i2) {
        if (i2 != 0 && i2 == 1) {
            return new m0.d();
        }
        return new m0.j();
    }

    public static m0.e e() {
        return new m0.e();
    }

    public static ColorStateList f(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList x2;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (x2 = B.a.x(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : x2;
    }

    public static ColorStateList g(Context context, C0097c c0097c, int i2) {
        int m2;
        ColorStateList x2;
        return (!c0097c.r(i2) || (m2 = c0097c.m(i2, 0)) == 0 || (x2 = B.a.x(context, m2)) == null) ? c0097c.b(i2) : x2;
    }

    public static Drawable h(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable A2;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (A2 = B.a.A(context, resourceId)) == null) ? typedArray.getDrawable(i2) : A2;
    }

    public static boolean i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static TypedArray j(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        a(context, attributeSet, i2, i3);
        b(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static PorterDuff.Mode k(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static TypedValue l(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int m(Context context, int i2, String str) {
        TypedValue l2 = l(context, i2);
        if (l2 != null) {
            return l2.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static void n(View view, m0.h hVar) {
        g0.a aVar = hVar.f3094a.f3073b;
        if (aVar == null || !aVar.f2349a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = O.f58a;
            f2 += E.i((View) parent);
        }
        m0.g gVar = hVar.f3094a;
        if (gVar.f3084m != f2) {
            gVar.f3084m = f2;
            hVar.n();
        }
    }
}
