package N;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f238a;

    /* renamed from: c, reason: collision with root package name */
    public j f240c;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f239b = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241d = true;

    public k(EditText editText) {
        this.f238a = editText;
    }

    public static void a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.i a2 = androidx.emoji2.text.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.f238a;
        if (editText.isInEditMode() || !this.f241d) {
            return;
        }
        if ((this.f239b || androidx.emoji2.text.i.f1092j != null) && i3 <= i4 && (charSequence instanceof Spannable)) {
            int b2 = androidx.emoji2.text.i.a().b();
            if (b2 != 0) {
                if (b2 == 1) {
                    androidx.emoji2.text.i.a().f(i2, i4 + i2, (Spannable) charSequence);
                    return;
                } else if (b2 != 3) {
                    return;
                }
            }
            androidx.emoji2.text.i a2 = androidx.emoji2.text.i.a();
            if (this.f240c == null) {
                this.f240c = new j(editText);
            }
            a2.g(this.f240c);
        }
    }
}
