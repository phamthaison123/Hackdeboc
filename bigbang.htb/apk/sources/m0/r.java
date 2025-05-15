package m0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class r extends t {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f3160h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f3161b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3162c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3163d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3164e;

    /* renamed from: f, reason: collision with root package name */
    public float f3165f;

    /* renamed from: g, reason: collision with root package name */
    public float f3166g;

    public r(float f2, float f3, float f4, float f5) {
        this.f3161b = f2;
        this.f3162c = f3;
        this.f3163d = f4;
        this.f3164e = f5;
    }

    @Override // m0.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3169a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f3160h;
        rectF.set(this.f3161b, this.f3162c, this.f3163d, this.f3164e);
        path.arcTo(rectF, this.f3165f, this.f3166g, false);
        path.transform(matrix);
    }
}
