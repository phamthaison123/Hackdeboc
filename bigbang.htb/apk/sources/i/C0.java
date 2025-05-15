package i;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2622b;

    public /* synthetic */ C0(int i2, Object obj) {
        this.f2621a = i2;
        this.f2622b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i2 = this.f2621a;
        Object obj = this.f2622b;
        switch (i2) {
            case 0:
                break;
            case 1:
                o0.e eVar = (o0.e) obj;
                if (eVar.f3393a.getSuffixText() == null) {
                    eVar.e(o0.e.d(eVar));
                    break;
                }
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) obj;
                textInputLayout.s(!textInputLayout.M0, false);
                if (textInputLayout.f1918j) {
                    textInputLayout.n(editable.length());
                }
                if (textInputLayout.f1931q) {
                    textInputLayout.t(editable.length());
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        switch (this.f2621a) {
            case 0:
                SearchView searchView = (SearchView) this.f2622b;
                Editable text = searchView.f925p.getText();
                searchView.f917V = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.w(!isEmpty);
                int i5 = 8;
                if (searchView.f916U && !searchView.f909N && isEmpty) {
                    searchView.f930u.setVisibility(8);
                    i5 = 0;
                }
                searchView.f932w.setVisibility(i5);
                searchView.s();
                searchView.v();
                charSequence.toString();
                searchView.getClass();
                break;
        }
    }
}
