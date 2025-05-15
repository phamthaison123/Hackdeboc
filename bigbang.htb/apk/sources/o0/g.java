package o0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class g extends m0.h {

    /* renamed from: x, reason: collision with root package name */
    public final Paint f3371x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f3372y;

    /* renamed from: z, reason: collision with root package name */
    public int f3373z;

    public g(m0.l lVar) {
        super(lVar == null ? new m0.l() : lVar);
        Paint paint = new Paint(1);
        this.f3371x = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f3372y = new RectF();
    }

    @Override // m0.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.f3373z = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.f3373z);
    }

    @Override // m0.h
    public final void f(Canvas canvas) {
        RectF rectF = this.f3372y;
        if (rectF.isEmpty()) {
            super.f(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.f(canvas2);
        canvas2.drawRect(rectF, this.f3371x);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void o(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f3372y;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
