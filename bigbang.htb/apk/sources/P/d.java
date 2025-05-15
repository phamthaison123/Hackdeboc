package P;

import android.view.animation.Interpolator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f248a;

    /* renamed from: b, reason: collision with root package name */
    public final float f249b;

    public d(float[] fArr) {
        this.f248a = fArr;
        this.f249b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f248a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f249b;
        float f4 = (f2 - (min * f3)) / f3;
        float f5 = fArr[min];
        return ((fArr[min + 1] - f5) * f4) + f5;
    }
}
