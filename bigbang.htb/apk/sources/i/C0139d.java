package i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0139d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2787b;

    public /* synthetic */ C0139d(int i2, Object obj) {
        this.f2786a = i2;
        this.f2787b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f2786a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2787b;
                actionBarOverlayLayout.f865w = null;
                actionBarOverlayLayout.f853k = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.f2786a;
        Object obj = this.f2787b;
        switch (i2) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f865w = null;
                actionBarOverlayLayout.f853k = false;
                return;
            case 1:
                ((U.q) obj).m();
                animator.removeListener(this);
                return;
            case 2:
                ((HideBottomViewOnScrollBehavior) obj).f1671c = null;
                return;
            case 3:
            default:
                ((ExpandableTransformationBehavior) obj).getClass();
                return;
            case 4:
                F.Q.i(obj);
                throw null;
            case 5:
                o0.l lVar = (o0.l) obj;
                lVar.f3395c.setChecked(lVar.f3386k);
                lVar.f3392q.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2786a) {
            case 4:
                F.Q.i(this.f2787b);
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
