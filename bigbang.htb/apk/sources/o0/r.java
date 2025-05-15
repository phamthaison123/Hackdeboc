package o0;

import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3430b;

    public /* synthetic */ r(TextInputLayout textInputLayout, int i2) {
        this.f3429a = i2;
        this.f3430b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f3429a;
        TextInputLayout textInputLayout = this.f3430b;
        switch (i2) {
            case 0:
                textInputLayout.f1917i0.performClick();
                textInputLayout.f1917i0.jumpDrawablesToCurrentState();
                break;
            default:
                textInputLayout.f1908e.requestLayout();
                break;
        }
    }
}
