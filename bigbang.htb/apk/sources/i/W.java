package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import d.AbstractC0092a;
import e.C0097c;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2730a;

    /* renamed from: b, reason: collision with root package name */
    public S0 f2731b;

    /* renamed from: c, reason: collision with root package name */
    public S0 f2732c;

    /* renamed from: d, reason: collision with root package name */
    public S0 f2733d;

    /* renamed from: e, reason: collision with root package name */
    public S0 f2734e;

    /* renamed from: f, reason: collision with root package name */
    public S0 f2735f;

    /* renamed from: g, reason: collision with root package name */
    public S0 f2736g;

    /* renamed from: h, reason: collision with root package name */
    public S0 f2737h;

    /* renamed from: i, reason: collision with root package name */
    public final C0136b0 f2738i;

    /* renamed from: j, reason: collision with root package name */
    public int f2739j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2740k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2741l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2742m;

    public W(TextView textView) {
        this.f2730a = textView;
        this.f2738i = new C0136b0(textView);
    }

    public static S0 c(Context context, C0178x c0178x, int i2) {
        ColorStateList h2;
        synchronized (c0178x) {
            h2 = c0178x.f2947a.h(context, i2);
        }
        if (h2 == null) {
            return null;
        }
        S0 s0 = new S0(0);
        s0.f2707b = true;
        s0.f2708c = h2;
        return s0;
    }

    public final void a(Drawable drawable, S0 s0) {
        if (drawable == null || s0 == null) {
            return;
        }
        C0178x.d(drawable, s0, this.f2730a.getDrawableState());
    }

    public final void b() {
        S0 s0 = this.f2731b;
        TextView textView = this.f2730a;
        if (s0 != null || this.f2732c != null || this.f2733d != null || this.f2734e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2731b);
            a(compoundDrawables[1], this.f2732c);
            a(compoundDrawables[2], this.f2733d);
            a(compoundDrawables[3], this.f2734e);
        }
        if (this.f2735f == null && this.f2736g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2735f);
        a(compoundDrawablesRelative[2], this.f2736g);
    }

    public final void d(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        int i3;
        int i4;
        int i5;
        int resourceId;
        TextView textView = this.f2730a;
        Context context = textView.getContext();
        C0178x a2 = C0178x.a();
        int[] iArr = AbstractC0092a.f2013h;
        C0097c t2 = C0097c.t(context, attributeSet, iArr, i2, 0);
        Context context2 = textView.getContext();
        TypedArray typedArray = (TypedArray) t2.f2079b;
        WeakHashMap weakHashMap = F.O.f58a;
        F.J.c(textView, context2, iArr, attributeSet, typedArray, i2, 0);
        int m2 = t2.m(0, -1);
        if (t2.r(3)) {
            this.f2731b = c(context, a2, t2.m(3, 0));
        }
        if (t2.r(1)) {
            this.f2732c = c(context, a2, t2.m(1, 0));
        }
        if (t2.r(4)) {
            this.f2733d = c(context, a2, t2.m(4, 0));
        }
        if (t2.r(2)) {
            this.f2734e = c(context, a2, t2.m(2, 0));
        }
        if (t2.r(5)) {
            this.f2735f = c(context, a2, t2.m(5, 0));
        }
        if (t2.r(6)) {
            this.f2736g = c(context, a2, t2.m(6, 0));
        }
        t2.u();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0092a.f2028w;
        if (m2 != -1) {
            C0097c c0097c = new C0097c(context, context.obtainStyledAttributes(m2, iArr2));
            if (z4 || !c0097c.r(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = c0097c.a(14, false);
                z3 = true;
            }
            f(context, c0097c);
            str = c0097c.r(15) ? c0097c.o(15) : null;
            str2 = c0097c.r(13) ? c0097c.o(13) : null;
            c0097c.u();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        C0097c c0097c2 = new C0097c(context, context.obtainStyledAttributes(attributeSet, iArr2, i2, 0));
        if (!z4 && c0097c2.r(14)) {
            z2 = c0097c2.a(14, false);
            z3 = true;
        }
        if (c0097c2.r(15)) {
            str = c0097c2.o(15);
        }
        if (c0097c2.r(13)) {
            str2 = c0097c2.o(13);
        }
        String str3 = str2;
        if (c0097c2.r(0) && c0097c2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0097c2);
        c0097c2.u();
        if (!z4 && z3) {
            textView.setAllCaps(z2);
        }
        Typeface typeface = this.f2741l;
        if (typeface != null) {
            if (this.f2740k == -1) {
                textView.setTypeface(typeface, this.f2739j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            textView.setFontVariationSettings(str3);
        }
        if (str != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(str));
        }
        int[] iArr3 = AbstractC0092a.f2014i;
        C0136b0 c0136b0 = this.f2738i;
        Context context3 = c0136b0.f2778i;
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = c0136b0.f2777h;
        F.J.c(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i2, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            c0136b0.f2770a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                c0136b0.f2775f = C0136b0.a(iArr4);
                c0136b0.c();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!c0136b0.d()) {
            c0136b0.f2770a = 0;
        } else if (c0136b0.f2770a == 1) {
            if (!c0136b0.f2776g) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0136b0.e(dimension2, dimension3, dimension);
            }
            c0136b0.b();
        }
        if (c0136b0.f2770a != 0) {
            int[] iArr5 = c0136b0.f2775f;
            if (iArr5.length > 0) {
                if (textView.getAutoSizeStepGranularity() != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0136b0.f2773d), Math.round(c0136b0.f2774e), Math.round(c0136b0.f2772c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr5, 0);
                }
            }
        }
        C0097c c0097c3 = new C0097c(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int m3 = c0097c3.m(8, -1);
        Drawable b2 = m3 != -1 ? a2.b(context, m3) : null;
        int m4 = c0097c3.m(13, -1);
        Drawable b3 = m4 != -1 ? a2.b(context, m4) : null;
        int m5 = c0097c3.m(9, -1);
        Drawable b4 = m5 != -1 ? a2.b(context, m5) : null;
        int m6 = c0097c3.m(6, -1);
        Drawable b5 = m6 != -1 ? a2.b(context, m6) : null;
        int m7 = c0097c3.m(10, -1);
        Drawable b6 = m7 != -1 ? a2.b(context, m7) : null;
        int m8 = c0097c3.m(7, -1);
        Drawable b7 = m8 != -1 ? a2.b(context, m8) : null;
        if (b6 != null || b7 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b6 == null) {
                b6 = compoundDrawablesRelative[0];
            }
            if (b3 == null) {
                b3 = compoundDrawablesRelative[1];
            }
            if (b7 == null) {
                b7 = compoundDrawablesRelative[2];
            }
            if (b5 == null) {
                b5 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b6, b3, b7, b5);
        } else if (b2 != null || b3 != null || b4 != null || b5 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[2];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, b5);
            } else {
                if (b3 == null) {
                    b3 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (b5 == null) {
                    b5 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b3, drawable2, b5);
            }
        }
        if (c0097c3.r(11)) {
            textView.setCompoundDrawableTintList(c0097c3.b(11));
        }
        if (c0097c3.r(12)) {
            i3 = -1;
            textView.setCompoundDrawableTintMode(AbstractC0146g0.c(c0097c3.j(12, -1), null));
        } else {
            i3 = -1;
        }
        int d2 = c0097c3.d(15, i3);
        int d3 = c0097c3.d(18, i3);
        int d4 = c0097c3.d(19, i3);
        c0097c3.u();
        if (d2 != i3) {
            B.a.n(d2);
            textView.setFirstBaselineToTopHeight(d2);
        }
        if (d3 != i3) {
            B.a.n(d3);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i7 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (d3 > Math.abs(i7)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), d3 - i7);
            }
            i4 = -1;
        } else {
            i4 = i3;
        }
        if (d4 != i4) {
            B.a.n(d4);
            if (d4 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(d4 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i2) {
        String o2;
        C0097c c0097c = new C0097c(context, context.obtainStyledAttributes(i2, AbstractC0092a.f2028w));
        boolean r2 = c0097c.r(14);
        TextView textView = this.f2730a;
        if (r2) {
            textView.setAllCaps(c0097c.a(14, false));
        }
        if (c0097c.r(0) && c0097c.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0097c);
        if (c0097c.r(13) && (o2 = c0097c.o(13)) != null) {
            textView.setFontVariationSettings(o2);
        }
        c0097c.u();
        Typeface typeface = this.f2741l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2739j);
        }
    }

    public final void f(Context context, C0097c c0097c) {
        String o2;
        this.f2739j = c0097c.j(2, this.f2739j);
        int j2 = c0097c.j(11, -1);
        this.f2740k = j2;
        if (j2 != -1) {
            this.f2739j &= 2;
        }
        if (!c0097c.r(10) && !c0097c.r(12)) {
            if (c0097c.r(1)) {
                this.f2742m = false;
                int j3 = c0097c.j(1, 1);
                if (j3 == 1) {
                    this.f2741l = Typeface.SANS_SERIF;
                    return;
                } else if (j3 == 2) {
                    this.f2741l = Typeface.SERIF;
                    return;
                } else {
                    if (j3 != 3) {
                        return;
                    }
                    this.f2741l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2741l = null;
        int i2 = c0097c.r(12) ? 12 : 10;
        int i3 = this.f2740k;
        int i4 = this.f2739j;
        if (!context.isRestricted()) {
            try {
                Typeface i5 = c0097c.i(i2, this.f2739j, new U(this, i3, i4, new WeakReference(this.f2730a)));
                if (i5 != null) {
                    if (this.f2740k != -1) {
                        this.f2741l = Typeface.create(Typeface.create(i5, 0), this.f2740k, (this.f2739j & 2) != 0);
                    } else {
                        this.f2741l = i5;
                    }
                }
                this.f2742m = this.f2741l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2741l != null || (o2 = c0097c.o(i2)) == null) {
            return;
        }
        if (this.f2740k != -1) {
            this.f2741l = Typeface.create(Typeface.create(o2, 0), this.f2740k, (this.f2739j & 2) != 0);
        } else {
            this.f2741l = Typeface.create(o2, this.f2739j);
        }
    }
}
