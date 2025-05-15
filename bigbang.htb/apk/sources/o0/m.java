package o0;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3393a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3394b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f3395c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3396d;

    public m(TextInputLayout textInputLayout, int i2) {
        this.f3393a = textInputLayout;
        this.f3394b = textInputLayout.getContext();
        this.f3395c = textInputLayout.getEndIconView();
        this.f3396d = i2;
    }

    public abstract void a();

    public boolean b(int i2) {
        return true;
    }

    public void c(boolean z2) {
    }
}
