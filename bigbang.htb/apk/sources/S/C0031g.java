package S;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: S.g, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0031g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0035k f390f;

    public C0031g(C0035k c0035k, f0 f0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f390f = c0035k;
        this.f385a = f0Var;
        this.f386b = i2;
        this.f387c = view;
        this.f388d = i3;
        this.f389e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i2 = this.f386b;
        View view = this.f387c;
        if (i2 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f388d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f389e.setListener(null);
        C0035k c0035k = this.f390f;
        f0 f0Var = this.f385a;
        c0035k.c(f0Var);
        c0035k.f430p.remove(f0Var);
        c0035k.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f390f.getClass();
    }
}
