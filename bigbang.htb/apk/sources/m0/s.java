package m0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class s extends t {

    /* renamed from: b, reason: collision with root package name */
    public float f3167b;

    /* renamed from: c, reason: collision with root package name */
    public float f3168c;

    @Override // m0.t
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3169a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f3167b, this.f3168c);
        path.transform(matrix);
    }
}
