package S;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: S.h, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0032h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0033i f394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0035k f397e;

    public /* synthetic */ C0032h(C0035k c0035k, C0033i c0033i, ViewPropertyAnimator viewPropertyAnimator, View view, int i2) {
        this.f393a = i2;
        this.f397e = c0035k;
        this.f394b = c0033i;
        this.f395c = viewPropertyAnimator;
        this.f396d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.f393a;
        C0035k c0035k = this.f397e;
        C0033i c0033i = this.f394b;
        View view = this.f396d;
        ViewPropertyAnimator viewPropertyAnimator = this.f395c;
        switch (i2) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c0035k.c(c0033i.f400a);
                c0035k.f432r.remove(c0033i.f400a);
                c0035k.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c0035k.c(c0033i.f401b);
                c0035k.f432r.remove(c0033i.f401b);
                c0035k.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i2 = this.f393a;
        C0035k c0035k = this.f397e;
        C0033i c0033i = this.f394b;
        switch (i2) {
            case 0:
                f0 f0Var = c0033i.f400a;
                c0035k.getClass();
                break;
            default:
                f0 f0Var2 = c0033i.f401b;
                c0035k.getClass();
                break;
        }
    }
}
