package N;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f225a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.e f226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        m0.e eVar = new m0.e();
        this.f225a = editText;
        this.f226b = eVar;
        if (androidx.emoji2.text.i.f1092j != null) {
            androidx.emoji2.text.i a2 = androidx.emoji2.text.i.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a2.f1097e.y(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f225a.getEditableText();
        this.f226b.getClass();
        return m0.e.d(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f225a.getEditableText();
        this.f226b.getClass();
        return m0.e.d(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
