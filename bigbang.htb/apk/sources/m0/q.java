package m0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class q extends u {

    /* renamed from: b, reason: collision with root package name */
    public final s f3157b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3158c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3159d;

    public q(s sVar, float f2, float f3) {
        this.f3157b = sVar;
        this.f3158c = f2;
        this.f3159d = f3;
    }

    @Override // m0.u
    public final void a(Matrix matrix, l0.a aVar, int i2, Canvas canvas) {
        s sVar = this.f3157b;
        float f2 = sVar.f3168c;
        float f3 = this.f3159d;
        float f4 = sVar.f3167b;
        float f5 = this.f3158c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = l0.a.f3054i;
        iArr[0] = aVar.f3063f;
        iArr[1] = aVar.f3062e;
        iArr[2] = aVar.f3061d;
        Paint paint = aVar.f3060c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, l0.a.f3055j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        s sVar = this.f3157b;
        return (float) Math.toDegrees(Math.atan((sVar.f3168c - this.f3159d) / (sVar.f3167b - this.f3158c)));
    }
}
