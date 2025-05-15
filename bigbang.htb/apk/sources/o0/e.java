package o0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import e.ViewOnClickListenerC0096b;
import i.C0;
import i.E0;
import java.util.LinkedHashSet;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e extends m {

    /* renamed from: e, reason: collision with root package name */
    public final C0 f3364e;

    /* renamed from: f, reason: collision with root package name */
    public final E0 f3365f;

    /* renamed from: g, reason: collision with root package name */
    public final a f3366g;

    /* renamed from: h, reason: collision with root package name */
    public final b f3367h;

    /* renamed from: i, reason: collision with root package name */
    public AnimatorSet f3368i;

    /* renamed from: j, reason: collision with root package name */
    public ValueAnimator f3369j;

    public e(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f3364e = new C0(1, this);
        this.f3365f = new E0(1, this);
        this.f3366g = new a(this, 0);
        this.f3367h = new b(this, 0);
    }

    public static boolean d(e eVar) {
        EditText editText = eVar.f3393a.getEditText();
        return editText != null && (editText.hasFocus() || eVar.f3395c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // o0.m
    public final void a() {
        int i2 = this.f3396d;
        if (i2 == 0) {
            i2 = 2131230857;
        }
        TextInputLayout textInputLayout = this.f3393a;
        textInputLayout.setEndIconDrawable(i2);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131755044));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC0096b(3, this));
        LinkedHashSet linkedHashSet = textInputLayout.f1911f0;
        a aVar = this.f3366g;
        linkedHashSet.add(aVar);
        if (textInputLayout.f1908e != null) {
            aVar.a(textInputLayout);
        }
        textInputLayout.f1919j0.add(this.f3367h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(Y.a.f709d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new d(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = Y.a.f706a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new d(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3368i = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f3368i.addListener(new c(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new d(this, 0));
        this.f3369j = ofFloat3;
        ofFloat3.addListener(new c(this, 1));
    }

    @Override // o0.m
    public final void c(boolean z2) {
        if (this.f3393a.getSuffixText() == null) {
            return;
        }
        e(z2);
    }

    public final void e(boolean z2) {
        boolean z3 = this.f3393a.g() == z2;
        if (z2 && !this.f3368i.isRunning()) {
            this.f3369j.cancel();
            this.f3368i.start();
            if (z3) {
                this.f3368i.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f3368i.cancel();
        this.f3369j.start();
        if (z3) {
            this.f3369j.end();
        }
    }
}
