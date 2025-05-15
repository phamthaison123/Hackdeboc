package S;

import android.animation.ValueAnimator;

/* renamed from: S.o, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0039o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0040p f460a;

    public C0039o(C0040p c0040p) {
        this.f460a = c0040p;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0040p c0040p = this.f460a;
        c0040p.f472c.setAlpha(floatValue);
        c0040p.f473d.setAlpha(floatValue);
        c0040p.f488s.invalidate();
    }
}
