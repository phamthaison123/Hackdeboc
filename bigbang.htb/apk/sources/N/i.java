package N;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i extends m0.e {

    /* renamed from: b, reason: collision with root package name */
    public final h f236b;

    public i(TextView textView) {
        this.f236b = new h(textView);
    }

    @Override // m0.e
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return (androidx.emoji2.text.i.f1092j != null) ^ true ? inputFilterArr : this.f236b.a(inputFilterArr);
    }

    @Override // m0.e
    public final void e(boolean z2) {
        if (!(androidx.emoji2.text.i.f1092j != null)) {
            return;
        }
        this.f236b.e(z2);
    }

    @Override // m0.e
    public final void f(boolean z2) {
        boolean z3 = !(androidx.emoji2.text.i.f1092j != null);
        h hVar = this.f236b;
        if (z3) {
            hVar.f235d = z2;
        } else {
            hVar.f(z2);
        }
    }
}
