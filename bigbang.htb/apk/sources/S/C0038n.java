package S;

import F.AbstractC0023y;
import U.C0052c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: S.n, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0038n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f451a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f452b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f453c;

    public C0038n(C0040p c0040p) {
        this.f453c = c0040p;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f451a) {
            case 0:
                this.f452b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.f451a;
        Object obj = this.f453c;
        switch (i2) {
            case 0:
                if (!this.f452b) {
                    C0040p c0040p = (C0040p) obj;
                    if (((Float) c0040p.f495z.getAnimatedValue()).floatValue() != 0.0f) {
                        c0040p.f468A = 2;
                        c0040p.f488s.invalidate();
                        break;
                    } else {
                        c0040p.f468A = 0;
                        c0040p.f(0);
                        break;
                    }
                } else {
                    this.f452b = false;
                    break;
                }
            default:
                View view = (View) obj;
                C0052c c0052c = U.x.f666a;
                view.setTransitionAlpha(1.0f);
                if (this.f452b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f451a) {
            case 1:
                View view = (View) this.f453c;
                WeakHashMap weakHashMap = F.O.f58a;
                if (AbstractC0023y.h(view) && view.getLayerType() == 0) {
                    this.f452b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0038n(View view) {
        this.f453c = view;
    }
}
