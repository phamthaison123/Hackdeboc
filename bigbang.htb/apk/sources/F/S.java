package F;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class S implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f67c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68d;

    public /* synthetic */ S(Object obj, e.z zVar, View view, int i2) {
        this.f65a = i2;
        this.f68d = obj;
        this.f66b = zVar;
        this.f67c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f65a;
        Object obj = this.f66b;
        switch (i2) {
            case 0:
                ((View) ((e.E) ((e.z) obj).f2221b).f2053f.getParent()).invalidate();
                break;
            default:
                Q.f(this.f67c);
                ((AppBarLayout$BaseBehavior) this.f68d).t((CoordinatorLayout) obj, null, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
