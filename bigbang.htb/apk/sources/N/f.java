package N;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f229a;

    /* renamed from: b, reason: collision with root package name */
    public e f230b;

    public f(TextView textView) {
        this.f229a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f229a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = androidx.emoji2.text.i.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return androidx.emoji2.text.i.a().f(0, charSequence.length(), charSequence);
            }
            if (b2 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.i a2 = androidx.emoji2.text.i.a();
        if (this.f230b == null) {
            this.f230b = new e(textView, this);
        }
        a2.g(this.f230b);
        return charSequence;
    }
}
