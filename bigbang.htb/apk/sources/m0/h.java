package m0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import y.AbstractC0237a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class h extends Drawable implements w {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f3093w;

    /* renamed from: a, reason: collision with root package name */
    public g f3094a;

    /* renamed from: b, reason: collision with root package name */
    public final u[] f3095b;

    /* renamed from: c, reason: collision with root package name */
    public final u[] f3096c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f3097d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3098e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f3099f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f3100g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f3101h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f3102i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f3103j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f3104k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f3105l;

    /* renamed from: m, reason: collision with root package name */
    public l f3106m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f3107n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f3108o;

    /* renamed from: p, reason: collision with root package name */
    public final l0.a f3109p;

    /* renamed from: q, reason: collision with root package name */
    public final f f3110q;

    /* renamed from: r, reason: collision with root package name */
    public final n f3111r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f3112s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f3113t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f3114u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3115v;

    static {
        Paint paint = new Paint(1);
        f3093w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new l());
    }

    public final void a(RectF rectF, Path path) {
        g gVar = this.f3094a;
        this.f3111r.a(gVar.f3072a, gVar.f3081j, rectF, this.f3110q, path);
        if (this.f3094a.f3080i != 1.0f) {
            Matrix matrix = this.f3099f;
            matrix.reset();
            float f2 = this.f3094a.f3080i;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f3114u, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        int color;
        int c2;
        if (colorStateList == null || mode == null) {
            if (!z2 || (c2 = c((color = paint.getColor()))) == color) {
                return null;
            }
            return new PorterDuffColorFilter(c2, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int c(int i2) {
        int i3;
        g gVar = this.f3094a;
        float f2 = gVar.f3085n + gVar.f3086o + gVar.f3084m;
        g0.a aVar = gVar.f3073b;
        if (aVar == null || !aVar.f2349a || AbstractC0237a.d(i2, 255) != aVar.f2352d) {
            return i2;
        }
        float min = (aVar.f2353e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i2);
        int K2 = B.a.K(AbstractC0237a.d(i2, 255), aVar.f2350b, min);
        if (min > 0.0f && (i3 = aVar.f2351c) != 0) {
            K2 = AbstractC0237a.b(AbstractC0237a.d(i3, g0.a.f2348f), K2);
        }
        return AbstractC0237a.d(K2, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.f3097d.cardinality() > 0) {
            Log.w("h", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.f3094a.f3089r;
        Path path = this.f3100g;
        l0.a aVar = this.f3109p;
        if (i2 != 0) {
            canvas.drawPath(path, aVar.f3058a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            u uVar = this.f3095b[i3];
            int i4 = this.f3094a.f3088q;
            Matrix matrix = u.f3170a;
            uVar.a(matrix, aVar, i4, canvas);
            this.f3096c[i3].a(matrix, aVar, this.f3094a.f3088q, canvas);
        }
        if (this.f3115v) {
            g gVar = this.f3094a;
            int sin = (int) (Math.sin(Math.toRadians(gVar.f3090s)) * gVar.f3089r);
            g gVar2 = this.f3094a;
            int cos = (int) (Math.cos(Math.toRadians(gVar2.f3090s)) * gVar2.f3089r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f3093w);
            canvas.translate(sin, cos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f3107n;
        paint.setColorFilter(this.f3112s);
        int alpha = paint.getAlpha();
        int i2 = this.f3094a.f3083l;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f3108o;
        paint2.setColorFilter(this.f3113t);
        paint2.setStrokeWidth(this.f3094a.f3082k);
        int alpha2 = paint2.getAlpha();
        int i3 = this.f3094a.f3083l;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f3098e;
        Path path = this.f3100g;
        if (z2) {
            float f2 = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            l lVar = this.f3094a.f3072a;
            k e2 = lVar.e();
            c cVar = lVar.f3133e;
            if (!(cVar instanceof i)) {
                cVar = new b(f2, cVar);
            }
            e2.f3121e = cVar;
            c cVar2 = lVar.f3134f;
            if (!(cVar2 instanceof i)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f3122f = cVar2;
            c cVar3 = lVar.f3136h;
            if (!(cVar3 instanceof i)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.f3124h = cVar3;
            c cVar4 = lVar.f3135g;
            if (!(cVar4 instanceof i)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f3123g = cVar4;
            l a2 = e2.a();
            this.f3106m = a2;
            float f3 = this.f3094a.f3081j;
            RectF rectF = this.f3103j;
            rectF.set(g());
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f3111r.a(a2, f3, rectF, null, this.f3101h);
            a(g(), path);
            this.f3098e = false;
        }
        g gVar = this.f3094a;
        int i4 = gVar.f3087p;
        if (i4 != 1 && gVar.f3088q > 0) {
            if (i4 == 2) {
                canvas.save();
                g gVar2 = this.f3094a;
                int sin = (int) (Math.sin(Math.toRadians(gVar2.f3090s)) * gVar2.f3089r);
                g gVar3 = this.f3094a;
                canvas.translate(sin, (int) (Math.cos(Math.toRadians(gVar3.f3090s)) * gVar3.f3089r));
                if (this.f3115v) {
                    RectF rectF2 = this.f3114u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f3094a.f3088q * 2) + ((int) rectF2.width()) + width, (this.f3094a.f3088q * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f3094a.f3088q) - width;
                    float f5 = (getBounds().top - this.f3094a.f3088q) - height;
                    canvas2.translate(-f4, -f5);
                    d(canvas2);
                    canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            } else if (!gVar.f3072a.d(g())) {
                path.isConvex();
            }
        }
        g gVar4 = this.f3094a;
        Paint.Style style = gVar4.f3092u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, gVar4.f3072a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, l lVar, RectF rectF) {
        if (!lVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = lVar.f3134f.a(rectF) * this.f3094a.f3081j;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f3108o;
        Path path = this.f3101h;
        l lVar = this.f3106m;
        RectF rectF = this.f3103j;
        rectF.set(g());
        float strokeWidth = h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, lVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f3102i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f3094a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        g gVar = this.f3094a;
        if (gVar.f3087p == 2) {
            return;
        }
        if (gVar.f3072a.d(g())) {
            outline.setRoundRect(getBounds(), this.f3094a.f3072a.f3133e.a(g()) * this.f3094a.f3081j);
            return;
        }
        RectF g2 = g();
        Path path = this.f3100g;
        a(g2, path);
        path.isConvex();
        try {
            outline.setConvexPath(path);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f3094a.f3079h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f3104k;
        region.set(bounds);
        RectF g2 = g();
        Path path = this.f3100g;
        a(g2, path);
        Region region2 = this.f3105l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f3094a.f3092u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3108o.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.f3094a.f3073b = new g0.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f3098e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f3094a.f3077f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f3094a.f3076e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f3094a.f3075d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f3094a.f3074c) != null && colorStateList4.isStateful())));
    }

    public final void j(float f2) {
        g gVar = this.f3094a;
        if (gVar.f3085n != f2) {
            gVar.f3085n = f2;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        g gVar = this.f3094a;
        if (gVar.f3074c != colorStateList) {
            gVar.f3074c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f3094a.f3074c == null || color2 == (colorForState2 = this.f3094a.f3074c.getColorForState(iArr, (color2 = (paint2 = this.f3107n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f3094a.f3075d == null || color == (colorForState = this.f3094a.f3075d.getColorForState(iArr, (color = (paint = this.f3108o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f3112s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3113t;
        g gVar = this.f3094a;
        this.f3112s = b(gVar.f3077f, gVar.f3078g, this.f3107n, true);
        g gVar2 = this.f3094a;
        this.f3113t = b(gVar2.f3076e, gVar2.f3078g, this.f3108o, false);
        g gVar3 = this.f3094a;
        if (gVar3.f3091t) {
            int colorForState = gVar3.f3077f.getColorForState(getState(), 0);
            l0.a aVar = this.f3109p;
            aVar.getClass();
            aVar.f3061d = AbstractC0237a.d(colorForState, 68);
            aVar.f3062e = AbstractC0237a.d(colorForState, 20);
            aVar.f3063f = AbstractC0237a.d(colorForState, 0);
            aVar.f3058a.setColor(aVar.f3061d);
        }
        return (Objects.equals(porterDuffColorFilter, this.f3112s) && Objects.equals(porterDuffColorFilter2, this.f3113t)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        g gVar = this.f3094a;
        g gVar2 = new g();
        gVar2.f3074c = null;
        gVar2.f3075d = null;
        gVar2.f3076e = null;
        gVar2.f3077f = null;
        gVar2.f3078g = PorterDuff.Mode.SRC_IN;
        gVar2.f3079h = null;
        gVar2.f3080i = 1.0f;
        gVar2.f3081j = 1.0f;
        gVar2.f3083l = 255;
        gVar2.f3084m = 0.0f;
        gVar2.f3085n = 0.0f;
        gVar2.f3086o = 0.0f;
        gVar2.f3087p = 0;
        gVar2.f3088q = 0;
        gVar2.f3089r = 0;
        gVar2.f3090s = 0;
        gVar2.f3091t = false;
        gVar2.f3092u = Paint.Style.FILL_AND_STROKE;
        gVar2.f3072a = gVar.f3072a;
        gVar2.f3073b = gVar.f3073b;
        gVar2.f3082k = gVar.f3082k;
        gVar2.f3074c = gVar.f3074c;
        gVar2.f3075d = gVar.f3075d;
        gVar2.f3078g = gVar.f3078g;
        gVar2.f3077f = gVar.f3077f;
        gVar2.f3083l = gVar.f3083l;
        gVar2.f3080i = gVar.f3080i;
        gVar2.f3089r = gVar.f3089r;
        gVar2.f3087p = gVar.f3087p;
        gVar2.f3091t = gVar.f3091t;
        gVar2.f3081j = gVar.f3081j;
        gVar2.f3084m = gVar.f3084m;
        gVar2.f3085n = gVar.f3085n;
        gVar2.f3086o = gVar.f3086o;
        gVar2.f3088q = gVar.f3088q;
        gVar2.f3090s = gVar.f3090s;
        gVar2.f3076e = gVar.f3076e;
        gVar2.f3092u = gVar.f3092u;
        if (gVar.f3079h != null) {
            gVar2.f3079h = new Rect(gVar.f3079h);
        }
        this.f3094a = gVar2;
        return this;
    }

    public final void n() {
        g gVar = this.f3094a;
        float f2 = gVar.f3085n + gVar.f3086o;
        gVar.f3088q = (int) Math.ceil(0.75f * f2);
        this.f3094a.f3089r = (int) Math.ceil(f2 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f3098e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = l(iArr) || m();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        g gVar = this.f3094a;
        if (gVar.f3083l != i2) {
            gVar.f3083l = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3094a.getClass();
        super.invalidateSelf();
    }

    @Override // m0.w
    public final void setShapeAppearanceModel(l lVar) {
        this.f3094a.f3072a = lVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3094a.f3077f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f3094a;
        if (gVar.f3078g != mode) {
            gVar.f3078g = mode;
            m();
            super.invalidateSelf();
        }
    }

    public h(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(l.b(context, attributeSet, i2, i3).a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(m0.l r4) {
        /*
            r3 = this;
            m0.g r0 = new m0.g
            r0.<init>()
            r1 = 0
            r0.f3074c = r1
            r0.f3075d = r1
            r0.f3076e = r1
            r0.f3077f = r1
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.f3078g = r2
            r0.f3079h = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.f3080i = r2
            r0.f3081j = r2
            r2 = 255(0xff, float:3.57E-43)
            r0.f3083l = r2
            r2 = 0
            r0.f3084m = r2
            r0.f3085n = r2
            r0.f3086o = r2
            r2 = 0
            r0.f3087p = r2
            r0.f3088q = r2
            r0.f3089r = r2
            r0.f3090s = r2
            r0.f3091t = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.f3092u = r2
            r0.f3072a = r4
            r0.f3073b = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.h.<init>(m0.l):void");
    }

    public h(g gVar) {
        n nVar;
        this.f3095b = new u[4];
        this.f3096c = new u[4];
        this.f3097d = new BitSet(8);
        this.f3099f = new Matrix();
        this.f3100g = new Path();
        this.f3101h = new Path();
        this.f3102i = new RectF();
        this.f3103j = new RectF();
        this.f3104k = new Region();
        this.f3105l = new Region();
        Paint paint = new Paint(1);
        this.f3107n = paint;
        Paint paint2 = new Paint(1);
        this.f3108o = paint2;
        this.f3109p = new l0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            nVar = m.f3141a;
        } else {
            nVar = new n();
        }
        this.f3111r = nVar;
        this.f3114u = new RectF();
        this.f3115v = true;
        this.f3094a = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        f fVar = new f();
        fVar.f3071a = this;
        this.f3110q = fVar;
    }
}
