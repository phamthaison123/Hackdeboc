package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import i.X;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3399c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f3400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3401e;

    public n(o oVar, int i2, TextView textView, int i3, TextView textView2) {
        this.f3401e = oVar;
        this.f3397a = i2;
        this.f3398b = textView;
        this.f3399c = i3;
        this.f3400d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        X x2;
        int i2 = this.f3397a;
        o oVar = this.f3401e;
        oVar.f3409h = i2;
        oVar.f3407f = null;
        TextView textView = this.f3398b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f3399c == 1 && (x2 = oVar.f3413l) != null) {
                x2.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f3400d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f3400d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
