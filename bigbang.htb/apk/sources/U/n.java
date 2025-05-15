package U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import l.C0190b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f623b;

    public /* synthetic */ n(Object obj, C0190b c0190b) {
        this.f623b = obj;
        this.f622a = c0190b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((C0190b) this.f622a).remove(animator);
        ((q) this.f623b).f644m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((q) this.f623b).f644m.add(animator);
    }
}
