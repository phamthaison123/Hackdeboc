package o0;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import e.ViewOnClickListenerC0096b;
import java.util.LinkedHashSet;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class q extends m {

    /* renamed from: e, reason: collision with root package name */
    public final h f3426e;

    /* renamed from: f, reason: collision with root package name */
    public final a f3427f;

    /* renamed from: g, reason: collision with root package name */
    public final b f3428g;

    public q(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f3426e = new h(this, 1);
        this.f3427f = new a(this, 2);
        this.f3428g = new b(this, 2);
    }

    public static boolean d(q qVar) {
        EditText editText = qVar.f3393a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // o0.m
    public final void a() {
        int i2 = this.f3396d;
        if (i2 == 0) {
            i2 = 2131230820;
        }
        TextInputLayout textInputLayout = this.f3393a;
        textInputLayout.setEndIconDrawable(i2);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131755134));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC0096b(5, this));
        LinkedHashSet linkedHashSet = textInputLayout.f1911f0;
        a aVar = this.f3427f;
        linkedHashSet.add(aVar);
        if (textInputLayout.f1908e != null) {
            aVar.a(textInputLayout);
        }
        textInputLayout.f1919j0.add(this.f3428g);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
