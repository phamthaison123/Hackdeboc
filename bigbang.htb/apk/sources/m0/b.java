package m0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f3068a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3069b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f3068a;
            f2 += ((b) cVar).f3069b;
        }
        this.f3068a = cVar;
        this.f3069b = f2;
    }

    @Override // m0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f3068a.a(rectF) + this.f3069b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3068a.equals(bVar.f3068a) && this.f3069b == bVar.f3069b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3068a, Float.valueOf(this.f3069b)});
    }
}
