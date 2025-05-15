package h0;

import F.AbstractC0023y;
import F.AbstractC0024z;
import F.O;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public float f2531A;

    /* renamed from: B, reason: collision with root package name */
    public float f2532B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f2533C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2534D;

    /* renamed from: E, reason: collision with root package name */
    public final TextPaint f2535E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f2536F;

    /* renamed from: G, reason: collision with root package name */
    public TimeInterpolator f2537G;

    /* renamed from: H, reason: collision with root package name */
    public TimeInterpolator f2538H;

    /* renamed from: I, reason: collision with root package name */
    public float f2539I;

    /* renamed from: J, reason: collision with root package name */
    public float f2540J;

    /* renamed from: K, reason: collision with root package name */
    public float f2541K;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f2542L;

    /* renamed from: M, reason: collision with root package name */
    public float f2543M;

    /* renamed from: N, reason: collision with root package name */
    public StaticLayout f2544N;

    /* renamed from: O, reason: collision with root package name */
    public float f2545O;

    /* renamed from: P, reason: collision with root package name */
    public CharSequence f2546P;

    /* renamed from: a, reason: collision with root package name */
    public final View f2547a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2548b;

    /* renamed from: c, reason: collision with root package name */
    public float f2549c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2550d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2551e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f2552f;

    /* renamed from: g, reason: collision with root package name */
    public int f2553g = 16;

    /* renamed from: h, reason: collision with root package name */
    public int f2554h = 16;

    /* renamed from: i, reason: collision with root package name */
    public float f2555i = 15.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f2556j = 15.0f;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2557k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2558l;

    /* renamed from: m, reason: collision with root package name */
    public float f2559m;

    /* renamed from: n, reason: collision with root package name */
    public float f2560n;

    /* renamed from: o, reason: collision with root package name */
    public float f2561o;

    /* renamed from: p, reason: collision with root package name */
    public float f2562p;

    /* renamed from: q, reason: collision with root package name */
    public float f2563q;

    /* renamed from: r, reason: collision with root package name */
    public float f2564r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f2565s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f2566t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f2567u;

    /* renamed from: v, reason: collision with root package name */
    public j0.a f2568v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f2569w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f2570x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2571y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f2572z;

    public b(View view) {
        this.f2547a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f2535E = textPaint;
        this.f2536F = new TextPaint(textPaint);
        this.f2551e = new Rect();
        this.f2550d = new Rect();
        this.f2552f = new RectF();
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i3) * f2) + (Color.alpha(i2) * f3)), (int) ((Color.red(i3) * f2) + (Color.red(i2) * f3)), (int) ((Color.green(i3) * f2) + (Color.green(i2) * f3)), (int) ((Color.blue(i3) * f2) + (Color.blue(i2) * f3)));
    }

    public static float e(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        LinearInterpolator linearInterpolator = Y.a.f706a;
        return ((f3 - f2) * f4) + f2;
    }

    public final void b(float f2) {
        boolean z2;
        float f3;
        boolean z3;
        if (this.f2569w == null) {
            return;
        }
        float width = this.f2551e.width();
        float width2 = this.f2550d.width();
        if (Math.abs(f2 - this.f2556j) < 0.001f) {
            f3 = this.f2556j;
            this.f2531A = 1.0f;
            Typeface typeface = this.f2567u;
            Typeface typeface2 = this.f2565s;
            if (typeface != typeface2) {
                this.f2567u = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f4 = this.f2555i;
            Typeface typeface3 = this.f2567u;
            Typeface typeface4 = this.f2566t;
            if (typeface3 != typeface4) {
                this.f2567u = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f2 - f4) < 0.001f) {
                this.f2531A = 1.0f;
            } else {
                this.f2531A = f2 / this.f2555i;
            }
            float f5 = this.f2556j / this.f2555i;
            width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
            f3 = f4;
            z3 = z2;
        }
        if (width > 0.0f) {
            z3 = this.f2532B != f3 || this.f2534D || z3;
            this.f2532B = f3;
            this.f2534D = false;
        }
        if (this.f2570x == null || z3) {
            TextPaint textPaint = this.f2535E;
            textPaint.setTextSize(this.f2532B);
            textPaint.setTypeface(this.f2567u);
            textPaint.setLinearText(this.f2531A != 1.0f);
            CharSequence charSequence = this.f2569w;
            WeakHashMap weakHashMap = O.f58a;
            boolean c2 = (AbstractC0024z.d(this.f2547a) == 1 ? D.i.f53d : D.i.f52c).c(charSequence, charSequence.length());
            this.f2571y = c2;
            g gVar = new g(this.f2569w, textPaint, (int) width);
            gVar.f2596l = TextUtils.TruncateAt.END;
            gVar.f2595k = c2;
            gVar.f2589e = Layout.Alignment.ALIGN_NORMAL;
            gVar.f2594j = false;
            gVar.f2590f = 1;
            gVar.f2591g = 0.0f;
            gVar.f2592h = 1.0f;
            gVar.f2593i = 1;
            StaticLayout a2 = gVar.a();
            a2.getClass();
            this.f2544N = a2;
            this.f2570x = a2.getText();
        }
    }

    public final float c() {
        TextPaint textPaint = this.f2536F;
        textPaint.setTextSize(this.f2556j);
        textPaint.setTypeface(this.f2565s);
        textPaint.setLetterSpacing(this.f2543M);
        return -textPaint.ascent();
    }

    public final int d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f2533C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void f() {
        boolean z2;
        Rect rect = this.f2551e;
        if (rect.width() > 0 && rect.height() > 0) {
            Rect rect2 = this.f2550d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z2 = true;
                this.f2548b = z2;
            }
        }
        z2 = false;
        this.f2548b = z2;
    }

    public final void g() {
        StaticLayout staticLayout;
        View view = this.f2547a;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            return;
        }
        float f2 = this.f2532B;
        b(this.f2556j);
        CharSequence charSequence = this.f2570x;
        TextPaint textPaint = this.f2535E;
        if (charSequence != null && (staticLayout = this.f2544N) != null) {
            this.f2546P = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        if (this.f2546P != null) {
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setLetterSpacing(this.f2543M);
            CharSequence charSequence2 = this.f2546P;
            this.f2545O = textPaint2.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f2545O = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f2554h, this.f2571y ? 1 : 0);
        int i2 = absoluteGravity & 112;
        Rect rect = this.f2551e;
        if (i2 == 48) {
            this.f2560n = rect.top;
        } else if (i2 != 80) {
            this.f2560n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f2560n = textPaint.ascent() + rect.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.f2562p = rect.centerX() - (this.f2545O / 2.0f);
        } else if (i3 != 5) {
            this.f2562p = rect.left;
        } else {
            this.f2562p = rect.right - this.f2545O;
        }
        b(this.f2555i);
        float height = this.f2544N != null ? r3.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f2544N;
        if (staticLayout2 != null) {
            staticLayout2.getLineCount();
        }
        CharSequence charSequence3 = this.f2570x;
        float measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f2544N;
        if (staticLayout3 != null) {
            staticLayout3.getLineLeft(0);
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f2553g, this.f2571y ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        Rect rect2 = this.f2550d;
        if (i4 == 48) {
            this.f2559m = rect2.top;
        } else if (i4 != 80) {
            this.f2559m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f2559m = textPaint.descent() + (rect2.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.f2561o = rect2.centerX() - (measureText / 2.0f);
        } else if (i5 != 5) {
            this.f2561o = rect2.left;
        } else {
            this.f2561o = rect2.right - measureText;
        }
        Bitmap bitmap = this.f2572z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f2572z = null;
        }
        j(f2);
        float f3 = this.f2549c;
        RectF rectF = this.f2552f;
        rectF.left = e(rect2.left, rect.left, f3, this.f2537G);
        rectF.top = e(this.f2559m, this.f2560n, f3, this.f2537G);
        rectF.right = e(rect2.right, rect.right, f3, this.f2537G);
        rectF.bottom = e(rect2.bottom, rect.bottom, f3, this.f2537G);
        this.f2563q = e(this.f2561o, this.f2562p, f3, this.f2537G);
        this.f2564r = e(this.f2559m, this.f2560n, f3, this.f2537G);
        j(e(this.f2555i, this.f2556j, f3, this.f2538H));
        P.b bVar = Y.a.f707b;
        e(0.0f, 1.0f, 1.0f - f3, bVar);
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.k(view);
        e(1.0f, 0.0f, f3, bVar);
        AbstractC0023y.k(view);
        ColorStateList colorStateList = this.f2558l;
        ColorStateList colorStateList2 = this.f2557k;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(d(colorStateList2), d(this.f2558l), f3));
        } else {
            textPaint.setColor(d(colorStateList));
        }
        float f4 = this.f2543M;
        if (f4 != 0.0f) {
            textPaint.setLetterSpacing(e(0.0f, f4, f3, bVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        textPaint.setShadowLayer(e(0.0f, this.f2539I, f3, null), e(0.0f, this.f2540J, f3, null), e(0.0f, this.f2541K, f3, null), a(d(null), d(this.f2542L), f3));
        AbstractC0023y.k(view);
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f2558l != colorStateList) {
            this.f2558l = colorStateList;
            g();
        }
    }

    public final void i(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f2549c) {
            this.f2549c = f2;
            RectF rectF = this.f2552f;
            float f3 = this.f2550d.left;
            Rect rect = this.f2551e;
            rectF.left = e(f3, rect.left, f2, this.f2537G);
            rectF.top = e(this.f2559m, this.f2560n, f2, this.f2537G);
            rectF.right = e(r3.right, rect.right, f2, this.f2537G);
            rectF.bottom = e(r3.bottom, rect.bottom, f2, this.f2537G);
            this.f2563q = e(this.f2561o, this.f2562p, f2, this.f2537G);
            this.f2564r = e(this.f2559m, this.f2560n, f2, this.f2537G);
            j(e(this.f2555i, this.f2556j, f2, this.f2538H));
            P.b bVar = Y.a.f707b;
            e(0.0f, 1.0f, 1.0f - f2, bVar);
            WeakHashMap weakHashMap = O.f58a;
            View view = this.f2547a;
            AbstractC0023y.k(view);
            e(1.0f, 0.0f, f2, bVar);
            AbstractC0023y.k(view);
            ColorStateList colorStateList = this.f2558l;
            ColorStateList colorStateList2 = this.f2557k;
            TextPaint textPaint = this.f2535E;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(d(colorStateList2), d(this.f2558l), f2));
            } else {
                textPaint.setColor(d(colorStateList));
            }
            float f4 = this.f2543M;
            if (f4 != 0.0f) {
                textPaint.setLetterSpacing(e(0.0f, f4, f2, bVar));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            textPaint.setShadowLayer(e(0.0f, this.f2539I, f2, null), e(0.0f, this.f2540J, f2, null), e(0.0f, this.f2541K, f2, null), a(d(null), d(this.f2542L), f2));
            AbstractC0023y.k(view);
        }
    }

    public final void j(float f2) {
        b(f2);
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.k(this.f2547a);
    }
}
