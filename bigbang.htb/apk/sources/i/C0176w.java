package i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import y.AbstractC0237a;

/* renamed from: i.w, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0176w {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2938a = {2131230803, 2131230801, 2131230727};

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2939b = {2131230751, 2131230786, 2131230758, 2131230753, 2131230754, 2131230757, 2131230756};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2940c = {2131230800, 2131230802, 2131230744, 2131230796, 2131230797, 2131230798, 2131230799};

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2941d = {2131230776, 2131230742, 2131230775};

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2942e = {2131230794, 2131230804};

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2943f = {2131230730, 2131230736, 2131230731, 2131230737};

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i2) {
        int c2 = Q0.c(context, 2130968774);
        return new ColorStateList(new int[][]{Q0.f2699b, Q0.f2701d, Q0.f2700c, Q0.f2703f}, new int[]{Q0.b(context, 2130968771), AbstractC0237a.b(c2, i2), AbstractC0237a.b(c2, i2), i2});
    }

    public static LayerDrawable c(C0181y0 c0181y0, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable e2 = c0181y0.e(context, 2131230790);
        Drawable e3 = c0181y0.e(context, 2131230791);
        if ((e2 instanceof BitmapDrawable) && e2.getIntrinsicWidth() == dimensionPixelSize && e2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) e2;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e2.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((e3 instanceof BitmapDrawable) && e3.getIntrinsicWidth() == dimensionPixelSize && e3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) e3;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            e3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e3.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter g2;
        if (AbstractC0146g0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0178x.f2945b;
        }
        PorterDuff.Mode mode2 = C0178x.f2945b;
        synchronized (C0178x.class) {
            g2 = C0181y0.g(i2, mode);
        }
        drawable.setColorFilter(g2);
    }

    public final ColorStateList d(Context context, int i2) {
        if (i2 == 2131230747) {
            return B.a.x(context, 2131099669);
        }
        if (i2 == 2131230793) {
            return B.a.x(context, 2131099672);
        }
        if (i2 != 2131230792) {
            if (i2 == 2131230735) {
                return b(context, Q0.c(context, 2130968771));
            }
            if (i2 == 2131230729) {
                return b(context, 0);
            }
            if (i2 == 2131230734) {
                return b(context, Q0.c(context, 2130968769));
            }
            if (i2 == 2131230788 || i2 == 2131230789) {
                return B.a.x(context, 2131099671);
            }
            if (a(this.f2939b, i2)) {
                return Q0.d(context, 2130968775);
            }
            if (a(this.f2942e, i2)) {
                return B.a.x(context, 2131099668);
            }
            if (a(this.f2943f, i2)) {
                return B.a.x(context, 2131099667);
            }
            if (i2 == 2131230785) {
                return B.a.x(context, 2131099670);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d2 = Q0.d(context, 2130968805);
        if (d2 == null || !d2.isStateful()) {
            iArr[0] = Q0.f2699b;
            iArr2[0] = Q0.b(context, 2130968805);
            iArr[1] = Q0.f2702e;
            iArr2[1] = Q0.c(context, 2130968773);
            iArr[2] = Q0.f2703f;
            iArr2[2] = Q0.c(context, 2130968805);
        } else {
            int[] iArr3 = Q0.f2699b;
            iArr[0] = iArr3;
            iArr2[0] = d2.getColorForState(iArr3, 0);
            iArr[1] = Q0.f2702e;
            iArr2[1] = Q0.c(context, 2130968773);
            iArr[2] = Q0.f2703f;
            iArr2[2] = d2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
