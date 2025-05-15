package o0;

import F.C0001b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class s extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3431d;

    public s(TextInputLayout textInputLayout) {
        this.f3431d = textInputLayout;
    }

    @Override // F.C0001b
    public void d(View view, G.d dVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f80a;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f129a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3431d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean z2 = !isEmpty;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(hint);
        boolean z5 = !textInputLayout.G0;
        boolean z6 = !TextUtils.isEmpty(error);
        if (!z6 && TextUtils.isEmpty(counterOverflowDescription)) {
            z3 = false;
        }
        String charSequence = z4 ? hint.toString() : "";
        if (z2) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (z5 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (!z6) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        if (editText != null) {
            editText.setLabelFor(2131296660);
        }
    }
}
