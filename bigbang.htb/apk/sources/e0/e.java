package e0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import m0.k;
import y.AbstractC0237a;
import z.AbstractC0241b;
import z.InterfaceC0240a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e extends m0.h implements Drawable.Callback, h0.h {
    public static final int[] G0 = {R.attr.state_enabled};
    public static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f2226A;
    public ColorStateList A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2227B;
    public WeakReference B0;

    /* renamed from: C, reason: collision with root package name */
    public float f2228C;
    public TextUtils.TruncateAt C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f2229D;
    public boolean D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f2230E;
    public int E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2231F;
    public boolean F0;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f2232G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f2233H;

    /* renamed from: I, reason: collision with root package name */
    public float f2234I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2235J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2236K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f2237L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f2238M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f2239N;

    /* renamed from: O, reason: collision with root package name */
    public float f2240O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f2241P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2242Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2243R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f2244S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f2245T;

    /* renamed from: U, reason: collision with root package name */
    public Y.b f2246U;

    /* renamed from: V, reason: collision with root package name */
    public Y.b f2247V;

    /* renamed from: W, reason: collision with root package name */
    public float f2248W;

    /* renamed from: X, reason: collision with root package name */
    public float f2249X;

    /* renamed from: Y, reason: collision with root package name */
    public float f2250Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f2251Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f2252a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f2253b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f2254c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f2255d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f2256e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f2257f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f2258g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f2259h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f2260i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f2261j0;
    public final h0.i k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f2262l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f2263m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f2264n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f2265o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f2266p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2267q0;
    public boolean r0;
    public int s0;
    public int t0;
    public ColorFilter u0;
    public PorterDuffColorFilter v0;
    public ColorStateList w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f2268x;
    public PorterDuff.Mode x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2269y;
    public int[] y0;

    /* renamed from: z, reason: collision with root package name */
    public float f2270z;
    public boolean z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968740, 2131821472);
        this.f2226A = -1.0f;
        this.f2257f0 = new Paint(1);
        this.f2258g0 = new Paint.FontMetrics();
        this.f2259h0 = new RectF();
        this.f2260i0 = new PointF();
        this.f2261j0 = new Path();
        this.t0 = 255;
        this.x0 = PorterDuff.Mode.SRC_IN;
        this.B0 = new WeakReference(null);
        i(context);
        this.f2256e0 = context;
        h0.i iVar = new h0.i(this);
        this.k0 = iVar;
        this.f2230E = "";
        iVar.f2597a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = G0;
        setState(iArr);
        if (!Arrays.equals(this.y0, iArr)) {
            this.y0 = iArr;
            if (U()) {
                w(getState(), iArr);
            }
        }
        this.D0 = true;
        H0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z2) {
        if (this.f2243R != z2) {
            boolean S2 = S();
            this.f2243R = z2;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    o(this.f2244S);
                } else {
                    V(this.f2244S);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void B(float f2) {
        if (this.f2226A != f2) {
            this.f2226A = f2;
            k e2 = this.f3094a.f3072a.e();
            e2.f3121e = new m0.a(f2);
            e2.f3122f = new m0.a(f2);
            e2.f3123g = new m0.a(f2);
            e2.f3124h = new m0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2232G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0240a;
            drawable2 = drawable3;
            if (z2) {
                ((AbstractC0241b) ((InterfaceC0240a) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q2 = q();
            this.f2232G = drawable != null ? drawable.mutate() : null;
            float q3 = q();
            V(drawable2);
            if (T()) {
                o(this.f2232G);
            }
            invalidateSelf();
            if (q2 != q3) {
                v();
            }
        }
    }

    public final void D(float f2) {
        if (this.f2234I != f2) {
            float q2 = q();
            this.f2234I = f2;
            float q3 = q();
            invalidateSelf();
            if (q2 != q3) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f2235J = true;
        if (this.f2233H != colorStateList) {
            this.f2233H = colorStateList;
            if (T()) {
                this.f2232G.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z2) {
        if (this.f2231F != z2) {
            boolean T2 = T();
            this.f2231F = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    o(this.f2232G);
                } else {
                    V(this.f2232G);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.f2227B != colorStateList) {
            this.f2227B = colorStateList;
            if (this.F0) {
                m0.g gVar = this.f3094a;
                if (gVar.f3075d != colorStateList) {
                    gVar.f3075d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f2) {
        if (this.f2228C != f2) {
            this.f2228C = f2;
            this.f2257f0.setStrokeWidth(f2);
            if (this.F0) {
                this.f3094a.f3082k = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2237L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof InterfaceC0240a;
            drawable2 = drawable3;
            if (z2) {
                ((AbstractC0241b) ((InterfaceC0240a) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float r2 = r();
            this.f2237L = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateList = this.f2229D;
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.f2238M = new RippleDrawable(colorStateList, this.f2237L, H0);
            float r3 = r();
            V(drawable2);
            if (U()) {
                o(this.f2237L);
            }
            invalidateSelf();
            if (r2 != r3) {
                v();
            }
        }
    }

    public final void J(float f2) {
        if (this.f2254c0 != f2) {
            this.f2254c0 = f2;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void K(float f2) {
        if (this.f2240O != f2) {
            this.f2240O = f2;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void L(float f2) {
        if (this.f2253b0 != f2) {
            this.f2253b0 = f2;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f2239N != colorStateList) {
            this.f2239N = colorStateList;
            if (U()) {
                this.f2237L.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z2) {
        if (this.f2236K != z2) {
            boolean U2 = U();
            this.f2236K = z2;
            boolean U3 = U();
            if (U2 != U3) {
                if (U3) {
                    o(this.f2237L);
                } else {
                    V(this.f2237L);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f2) {
        if (this.f2250Y != f2) {
            float q2 = q();
            this.f2250Y = f2;
            float q3 = q();
            invalidateSelf();
            if (q2 != q3) {
                v();
            }
        }
    }

    public final void P(float f2) {
        if (this.f2249X != f2) {
            float q2 = q();
            this.f2249X = f2;
            float q3 = q();
            invalidateSelf();
            if (q2 != q3) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f2229D != colorStateList) {
            this.f2229D = colorStateList;
            if (!this.z0) {
                colorStateList = null;
            } else if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.A0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void R(j0.d dVar) {
        h0.i iVar = this.k0;
        if (iVar.f2602f != dVar) {
            iVar.f2602f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f2597a;
                Context context = this.f2256e0;
                a aVar = iVar.f2598b;
                dVar.f(context, textPaint, aVar);
                h0.h hVar = (h0.h) iVar.f2601e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                iVar.f2600d = true;
            }
            h0.h hVar2 = (h0.h) iVar.f2601e.get();
            if (hVar2 != null) {
                e eVar = (e) hVar2;
                eVar.v();
                eVar.invalidateSelf();
                eVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean S() {
        return this.f2243R && this.f2244S != null && this.r0;
    }

    public final boolean T() {
        return this.f2231F && this.f2232G != null;
    }

    public final boolean U() {
        return this.f2236K && this.f2237L != null;
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2;
        RectF rectF;
        int i3;
        int i4;
        int i5;
        RectF rectF2;
        float f2;
        int i6;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i2 = this.t0) == 0) {
            return;
        }
        int saveLayerAlpha = i2 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2) : 0;
        boolean z2 = this.F0;
        Paint paint = this.f2257f0;
        RectF rectF3 = this.f2259h0;
        if (!z2) {
            paint.setColor(this.f2262l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (!this.F0) {
            paint.setColor(this.f2263m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.u0;
            if (colorFilter == null) {
                colorFilter = this.v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (this.F0) {
            super.draw(canvas);
        }
        if (this.f2228C > 0.0f && !this.F0) {
            paint.setColor(this.f2265o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.F0) {
                ColorFilter colorFilter2 = this.u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.f2228C / 2.0f;
            rectF3.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.f2226A - (this.f2228C / 2.0f);
            canvas.drawRoundRect(rectF3, f5, f5, paint);
        }
        paint.setColor(this.f2266p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.F0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f2261j0;
            m0.g gVar = this.f3094a;
            this.f3111r.a(gVar.f3072a, gVar.f3081j, rectF4, this.f3110q, path);
            e(canvas, paint, path, this.f3094a.f3072a, g());
        } else {
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (T()) {
            p(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f2232G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f2232G.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (S()) {
            p(bounds, rectF3);
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.f2244S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f2244S.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.D0 || this.f2230E == null) {
            rectF = rectF3;
            i3 = saveLayerAlpha;
            i4 = 255;
            i5 = 0;
        } else {
            PointF pointF = this.f2260i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f2230E;
            h0.i iVar = this.k0;
            if (charSequence != null) {
                float q2 = q() + this.f2248W + this.f2251Z;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + q2;
                } else {
                    pointF.x = bounds.right - q2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f2597a;
                Paint.FontMetrics fontMetrics = this.f2258g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f2230E != null) {
                float q3 = q() + this.f2248W + this.f2251Z;
                float r2 = r() + this.f2255d0 + this.f2252a0;
                if (getLayoutDirection() == 0) {
                    rectF3.left = bounds.left + q3;
                    rectF3.right = bounds.right - r2;
                } else {
                    rectF3.left = bounds.left + r2;
                    rectF3.right = bounds.right - q3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            j0.d dVar = iVar.f2602f;
            TextPaint textPaint2 = iVar.f2597a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f2602f.e(this.f2256e0, textPaint2, iVar.f2598b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f2230E.toString();
            if (iVar.f2600d) {
                float measureText = charSequence2 != null ? textPaint2.measureText((CharSequence) charSequence2, 0, charSequence2.length()) : 0.0f;
                iVar.f2599c = measureText;
                iVar.f2600d = false;
                f2 = measureText;
            } else {
                f2 = iVar.f2599c;
            }
            boolean z3 = Math.round(f2) > Math.round(rectF3.width());
            if (z3) {
                i6 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i6 = 0;
            }
            CharSequence charSequence3 = this.f2230E;
            if (z3 && this.C0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.C0);
            }
            CharSequence charSequence4 = charSequence3;
            int length = charSequence4.length();
            float f10 = pointF.x;
            float f11 = pointF.y;
            rectF = rectF3;
            i3 = saveLayerAlpha;
            i4 = 255;
            i5 = 0;
            canvas.drawText(charSequence4, 0, length, f10, f11, textPaint2);
            if (z3) {
                canvas.restoreToCount(i6);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f12 = this.f2255d0 + this.f2254c0;
                if (getLayoutDirection() == 0) {
                    float f13 = bounds.right - f12;
                    rectF2 = rectF;
                    rectF2.right = f13;
                    rectF2.left = f13 - this.f2240O;
                } else {
                    rectF2 = rectF;
                    float f14 = bounds.left + f12;
                    rectF2.left = f14;
                    rectF2.right = f14 + this.f2240O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f15 = this.f2240O;
                float f16 = exactCenterY - (f15 / 2.0f);
                rectF2.top = f16;
                rectF2.bottom = f16 + f15;
            } else {
                rectF2 = rectF;
            }
            float f17 = rectF2.left;
            float f18 = rectF2.top;
            canvas.translate(f17, f18);
            this.f2237L.setBounds(i5, i5, (int) rectF2.width(), (int) rectF2.height());
            this.f2238M.setBounds(this.f2237L.getBounds());
            this.f2238M.jumpToCurrentState();
            this.f2238M.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.t0 < i4) {
            canvas.restoreToCount(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f2270z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float measureText;
        float q2 = q() + this.f2248W + this.f2251Z;
        String charSequence = this.f2230E.toString();
        h0.i iVar = this.k0;
        if (iVar.f2600d) {
            measureText = charSequence == null ? 0.0f : iVar.f2597a.measureText((CharSequence) charSequence, 0, charSequence.length());
            iVar.f2599c = measureText;
            iVar.f2600d = false;
        } else {
            measureText = iVar.f2599c;
        }
        return Math.min(Math.round(r() + measureText + q2 + this.f2252a0 + this.f2255d0), this.E0);
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f2270z, this.f2226A);
        } else {
            outline.setRoundRect(bounds, this.f2226A);
        }
        outline.setAlpha(this.t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        j0.d dVar;
        ColorStateList colorStateList;
        return t(this.f2268x) || t(this.f2269y) || t(this.f2227B) || (this.z0 && t(this.A0)) || (!((dVar = this.k0.f2602f) == null || (colorStateList = dVar.f2986j) == null || !colorStateList.isStateful()) || ((this.f2243R && this.f2244S != null && this.f2242Q) || u(this.f2232G) || u(this.f2244S) || t(this.w0)));
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f2237L) {
            if (drawable.isStateful()) {
                drawable.setState(this.y0);
            }
            drawable.setTintList(this.f2239N);
            return;
        }
        Drawable drawable2 = this.f2232G;
        if (drawable == drawable2 && this.f2235J) {
            drawable2.setTintList(this.f2233H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (T()) {
            onLayoutDirectionChanged |= this.f2232G.setLayoutDirection(i2);
        }
        if (S()) {
            onLayoutDirectionChanged |= this.f2244S.setLayoutDirection(i2);
        }
        if (U()) {
            onLayoutDirectionChanged |= this.f2237L.setLayoutDirection(i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (T()) {
            onLevelChange |= this.f2232G.setLevel(i2);
        }
        if (S()) {
            onLevelChange |= this.f2244S.setLevel(i2);
        }
        if (U()) {
            onLevelChange |= this.f2237L.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.y0);
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f2 = this.f2248W + this.f2249X;
            Drawable drawable = this.r0 ? this.f2244S : this.f2232G;
            float f3 = this.f2234I;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            Drawable drawable2 = this.r0 ? this.f2244S : this.f2232G;
            float f6 = this.f2234I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f2256e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f6 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f6;
        }
    }

    public final float q() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f2 = this.f2249X;
        Drawable drawable = this.r0 ? this.f2244S : this.f2232G;
        float f3 = this.f2234I;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f2250Y;
    }

    public final float r() {
        if (U()) {
            return this.f2253b0 + this.f2240O + this.f2254c0;
        }
        return 0.0f;
    }

    public final float s() {
        return this.F0 ? this.f3094a.f3072a.f3133e.a(g()) : this.f2226A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.t0 != i2) {
            this.t0 = i2;
            invalidateSelf();
        }
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.u0 != colorFilter) {
            this.u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            ColorStateList colorStateList = this.w0;
            this.v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (T()) {
            visible |= this.f2232G.setVisible(z2, z3);
        }
        if (S()) {
            visible |= this.f2244S.setVisible(z2, z3);
        }
        if (U()) {
            visible |= this.f2237L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        d dVar = (d) this.B0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f1769p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f2268x;
        int c2 = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f2262l0) : 0);
        boolean z4 = true;
        if (this.f2262l0 != c2) {
            this.f2262l0 = c2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f2269y;
        int c3 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f2263m0) : 0);
        if (this.f2263m0 != c3) {
            this.f2263m0 = c3;
            onStateChange = true;
        }
        int b2 = AbstractC0237a.b(c3, c2);
        if ((this.f2264n0 != b2) | (this.f3094a.f3074c == null)) {
            this.f2264n0 = b2;
            k(ColorStateList.valueOf(b2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f2227B;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f2265o0) : 0;
        if (this.f2265o0 != colorForState) {
            this.f2265o0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.A0 == null || !B.a.h0(iArr)) ? 0 : this.A0.getColorForState(iArr, this.f2266p0);
        if (this.f2266p0 != colorForState2) {
            this.f2266p0 = colorForState2;
            if (this.z0) {
                onStateChange = true;
            }
        }
        j0.d dVar = this.k0.f2602f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f2986j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f2267q0);
        if (this.f2267q0 != colorForState3) {
            this.f2267q0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (state[i2] != 16842912) {
                    i2++;
                } else if (this.f2242Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.r0 == z2 || this.f2244S == null) {
            z3 = false;
        } else {
            float q2 = q();
            this.r0 = z2;
            if (q2 != q()) {
                onStateChange = true;
                z3 = true;
            } else {
                z3 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.w0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.s0) : 0;
        if (this.s0 != colorForState4) {
            this.s0 = colorForState4;
            ColorStateList colorStateList6 = this.w0;
            PorterDuff.Mode mode = this.x0;
            this.v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z4 = onStateChange;
        }
        if (u(this.f2232G)) {
            z4 |= this.f2232G.setState(iArr);
        }
        if (u(this.f2244S)) {
            z4 |= this.f2244S.setState(iArr);
        }
        if (u(this.f2237L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z4 |= this.f2237L.setState(iArr3);
        }
        if (u(this.f2238M)) {
            z4 |= this.f2238M.setState(iArr2);
        }
        if (z4) {
            invalidateSelf();
        }
        if (z3) {
            v();
        }
        return z4;
    }

    public final void x(boolean z2) {
        if (this.f2242Q != z2) {
            this.f2242Q = z2;
            float q2 = q();
            if (!z2 && this.r0) {
                this.r0 = false;
            }
            float q3 = q();
            invalidateSelf();
            if (q2 != q3) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f2244S != drawable) {
            float q2 = q();
            this.f2244S = drawable;
            float q3 = q();
            V(this.f2244S);
            o(this.f2244S);
            invalidateSelf();
            if (q2 != q3) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f2245T != colorStateList) {
            this.f2245T = colorStateList;
            if (this.f2243R && (drawable = this.f2244S) != null && this.f2242Q) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
