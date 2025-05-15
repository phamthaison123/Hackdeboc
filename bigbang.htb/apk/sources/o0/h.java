package o0;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import i.RunnableC0151j;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h extends h0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3375b;

    public h(m mVar, int i2) {
        this.f3374a = i2;
        this.f3375b = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f3374a) {
            case 0:
                l lVar = (l) this.f3375b;
                EditText editText = lVar.f3393a.getEditText();
                if (!(editText instanceof AutoCompleteTextView)) {
                    throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                }
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (lVar.f3390o.isTouchExplorationEnabled() && l.f(autoCompleteTextView) && !lVar.f3395c.hasFocus()) {
                    autoCompleteTextView.dismissDropDown();
                }
                autoCompleteTextView.post(new RunnableC0151j(9, this, autoCompleteTextView));
                return;
            default:
                return;
        }
    }

    @Override // h0.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        switch (this.f3374a) {
            case 1:
                ((q) this.f3375b).f3395c.setChecked(!q.d(r0));
                break;
        }
    }
}
