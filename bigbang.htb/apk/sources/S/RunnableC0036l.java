package S;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: S.l, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0036l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f435b;

    public /* synthetic */ RunnableC0036l(int i2, Object obj) {
        this.f434a = i2;
        this.f435b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f434a;
        Object obj = this.f435b;
        switch (i2) {
            case 0:
                C0040p c0040p = (C0040p) obj;
                int i3 = c0040p.f468A;
                ValueAnimator valueAnimator = c0040p.f495z;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                }
                c0040p.f468A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).w0();
                break;
        }
    }
}
