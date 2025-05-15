package o0;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3370e = 1;

    public f(TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
    }

    @Override // o0.m
    public final void a() {
        TextInputLayout textInputLayout = this.f3393a;
        switch (this.f3370e) {
            case 0:
                textInputLayout.setEndIconDrawable(this.f3396d);
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                break;
            default:
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconDrawable((Drawable) null);
                textInputLayout.setEndIconContentDescription((CharSequence) null);
                break;
        }
    }

    public f(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
    }
}
