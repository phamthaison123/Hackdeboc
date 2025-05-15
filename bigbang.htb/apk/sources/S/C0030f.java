package S;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.AbstractComponentCallbacksC0075p;

/* renamed from: S.f, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0030f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f363c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f365e;

    public C0030f(C0035k c0035k, f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f361a = 0;
        this.f365e = c0035k;
        this.f362b = f0Var;
        this.f364d = viewPropertyAnimator;
        this.f363c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f361a) {
            case 1:
                this.f363c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.f361a;
        Object obj = this.f365e;
        View view = this.f363c;
        Object obj2 = this.f364d;
        Object obj3 = this.f362b;
        switch (i2) {
            case 0:
                ((ViewPropertyAnimator) obj2).setListener(null);
                view.setAlpha(1.0f);
                C0035k c0035k = (C0035k) obj;
                f0 f0Var = (f0) obj3;
                c0035k.c(f0Var);
                c0035k.f431q.remove(f0Var);
                c0035k.i();
                break;
            case 1:
                ((ViewPropertyAnimator) obj2).setListener(null);
                C0035k c0035k2 = (C0035k) obj;
                f0 f0Var2 = (f0) obj3;
                c0035k2.c(f0Var2);
                c0035k2.f429o.remove(f0Var2);
                c0035k2.i();
                break;
            default:
                ((ViewGroup) obj3).endViewTransition(view);
                animator.removeListener(this);
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = (AbstractComponentCallbacksC0075p) obj2;
                View view2 = abstractComponentCallbacksC0075p.f1374E;
                if (view2 != null && abstractComponentCallbacksC0075p.f1411y) {
                    view2.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i2 = this.f361a;
        Object obj = this.f365e;
        switch (i2) {
            case 0:
                ((C0035k) obj).getClass();
                break;
            case 1:
                ((C0035k) obj).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C0030f(C0035k c0035k, Object obj, View view, ViewPropertyAnimator viewPropertyAnimator, int i2) {
        this.f361a = i2;
        this.f365e = c0035k;
        this.f362b = obj;
        this.f363c = view;
        this.f364d = viewPropertyAnimator;
    }
}
