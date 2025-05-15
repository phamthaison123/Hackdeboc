package b0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import m0.g;
import m0.h;
import o0.l;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1624b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f1623a = i2;
        this.f1624b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f1623a;
        Object obj = this.f1624b;
        switch (i2) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = ((BottomSheetBehavior) obj).f1711i;
                if (hVar != null) {
                    g gVar = hVar.f3094a;
                    if (gVar.f3081j != floatValue) {
                        gVar.f3081j = floatValue;
                        hVar.f3098e = true;
                        hVar.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                ((l) obj).f3395c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((TextInputLayout) obj).H0.i(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
