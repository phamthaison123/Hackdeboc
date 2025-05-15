package j0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import h0.k;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2977a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2980d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2981e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2982f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2983g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2984h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2985i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f2986j;

    /* renamed from: k, reason: collision with root package name */
    public float f2987k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2988l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2989m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f2990n;

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, X.a.f704y);
        this.f2987k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2986j = k.f(context, obtainStyledAttributes, 3);
        k.f(context, obtainStyledAttributes, 4);
        k.f(context, obtainStyledAttributes, 5);
        this.f2979c = obtainStyledAttributes.getInt(2, 0);
        this.f2980d = obtainStyledAttributes.getInt(1, 1);
        int i3 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f2988l = obtainStyledAttributes.getResourceId(i3, 0);
        this.f2978b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2977a = k.f(context, obtainStyledAttributes, 6);
        this.f2981e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f2982f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f2983g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, X.a.f697r);
        this.f2984h = obtainStyledAttributes2.hasValue(0);
        this.f2985i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f2990n;
        int i2 = this.f2979c;
        if (typeface == null && (str = this.f2978b) != null) {
            this.f2990n = Typeface.create(str, i2);
        }
        if (this.f2990n == null) {
            int i3 = this.f2980d;
            if (i3 == 1) {
                this.f2990n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f2990n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f2990n = Typeface.DEFAULT;
            } else {
                this.f2990n = Typeface.MONOSPACE;
            }
            this.f2990n = Typeface.create(this.f2990n, i2);
        }
    }

    public final Typeface b(Context context) {
        if (this.f2989m) {
            return this.f2990n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = x.k.a(context, this.f2988l);
                this.f2990n = a2;
                if (a2 != null) {
                    this.f2990n = Typeface.create(a2, this.f2979c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f2978b, e2);
            }
        }
        a();
        this.f2989m = true;
        return this.f2990n;
    }

    public final void c(Context context, B.a aVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f2988l;
        if (i2 == 0) {
            this.f2989m = true;
        }
        if (this.f2989m) {
            aVar.U(this.f2990n, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = x.k.f3762a;
            if (context.isRestricted()) {
                bVar.k(-4);
            } else {
                x.k.b(context, i2, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f2989m = true;
            aVar.S(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f2978b, e2);
            this.f2989m = true;
            aVar.S(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i2 = this.f2988l;
        if (i2 != 0) {
            ThreadLocal threadLocal = x.k.f3762a;
            if (!context.isRestricted()) {
                typeface = x.k.b(context, i2, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, B.a aVar) {
        f(context, textPaint, aVar);
        ColorStateList colorStateList = this.f2986j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f2977a;
        textPaint.setShadowLayer(this.f2983g, this.f2981e, this.f2982f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, B.a aVar) {
        if (d(context)) {
            g(textPaint, b(context));
            return;
        }
        a();
        g(textPaint, this.f2990n);
        c(context, new c(this, textPaint, aVar));
    }

    public final void g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f2979c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2987k);
        if (this.f2984h) {
            textPaint.setLetterSpacing(this.f2985i);
        }
    }
}
