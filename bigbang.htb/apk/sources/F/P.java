package F;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class P extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f62a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f63b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f64c;

    public /* synthetic */ P(Object obj, Object obj2, Object obj3) {
        this.f64c = obj;
        this.f62a = obj2;
        this.f63b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ((U) this.f62a).e((View) this.f63b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((U) this.f62a).c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((U) this.f62a).g();
    }
}
