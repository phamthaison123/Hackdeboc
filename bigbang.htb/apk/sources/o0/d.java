package o0;

import android.animation.ValueAnimator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3363b;

    public /* synthetic */ d(e eVar, int i2) {
        this.f3362a = i2;
        this.f3363b = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f3362a;
        e eVar = this.f3363b;
        switch (i2) {
            case 0:
                eVar.f3395c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar.f3395c.setScaleX(floatValue);
                eVar.f3395c.setScaleY(floatValue);
                break;
        }
    }
}
