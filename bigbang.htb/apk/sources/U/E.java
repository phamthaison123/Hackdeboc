package U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class E extends AnimatorListenerAdapter implements p {

    /* renamed from: a, reason: collision with root package name */
    public final View f578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f579b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f580c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f582e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f583f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f581d = true;

    public E(View view, int i2) {
        this.f578a = view;
        this.f579b = i2;
        this.f580c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // U.p
    public final void a() {
    }

    @Override // U.p
    public final void b() {
        f(false);
    }

    @Override // U.p
    public final void c(q qVar) {
        if (!this.f583f) {
            C0052c c0052c = x.f666a;
            this.f578a.setTransitionVisibility(this.f579b);
            ViewGroup viewGroup = this.f580c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        qVar.v(this);
    }

    @Override // U.p
    public final void d() {
    }

    @Override // U.p
    public final void e() {
        f(true);
    }

    public final void f(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f581d || this.f582e == z2 || (viewGroup = this.f580c) == null) {
            return;
        }
        this.f582e = z2;
        viewGroup.suppressLayout(z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f583f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f583f) {
            C0052c c0052c = x.f666a;
            this.f578a.setTransitionVisibility(this.f579b);
            ViewGroup viewGroup = this.f580c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f583f) {
            return;
        }
        C0052c c0052c = x.f666a;
        this.f578a.setTransitionVisibility(this.f579b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f583f) {
            return;
        }
        C0052c c0052c = x.f666a;
        this.f578a.setTransitionVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
