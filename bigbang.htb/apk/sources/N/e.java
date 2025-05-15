package N;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e extends androidx.emoji2.text.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f227a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f228b;

    public e(TextView textView, f fVar) {
        this.f227a = new WeakReference(textView);
        this.f228b = new WeakReference(fVar);
    }

    @Override // androidx.emoji2.text.g
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f227a.get();
        InputFilter inputFilter = (InputFilter) this.f228b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    androidx.emoji2.text.i a2 = androidx.emoji2.text.i.a();
                    CharSequence text = textView.getText();
                    if (text == null) {
                        length = 0;
                    } else {
                        a2.getClass();
                        length = text.length();
                    }
                    CharSequence f2 = a2.f(0, length, text);
                    int selectionStart = Selection.getSelectionStart(f2);
                    int selectionEnd = Selection.getSelectionEnd(f2);
                    textView.setText(f2);
                    if (f2 instanceof Spannable) {
                        Spannable spannable = (Spannable) f2;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
