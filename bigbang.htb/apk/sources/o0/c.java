package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3361b;

    public /* synthetic */ c(e eVar, int i2) {
        this.f3360a = i2;
        this.f3361b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3360a) {
            case 1:
                this.f3361b.f3393a.setEndIconVisible(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3360a) {
            case 0:
                this.f3361b.f3393a.setEndIconVisible(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
