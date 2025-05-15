package m0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class p extends u {

    /* renamed from: b, reason: collision with root package name */
    public final r f3156b;

    public p(r rVar) {
        this.f3156b = rVar;
    }

    @Override // m0.u
    public final void a(Matrix matrix, l0.a aVar, int i2, Canvas canvas) {
        r rVar = this.f3156b;
        float f2 = rVar.f3165f;
        float f3 = rVar.f3166g;
        RectF rectF = new RectF(rVar.f3161b, rVar.f3162c, rVar.f3163d, rVar.f3164e);
        aVar.getClass();
        boolean z2 = f3 < 0.0f;
        Path path = aVar.f3064g;
        int[] iArr = l0.a.f3056k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar.f3063f;
            iArr[2] = aVar.f3062e;
            iArr[3] = aVar.f3061d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = aVar.f3061d;
            iArr[2] = aVar.f3062e;
            iArr[3] = aVar.f3063f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / width);
        float[] fArr = l0.a.f3057l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f3059b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f3065h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
