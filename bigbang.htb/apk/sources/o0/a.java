package o0;

import F.AbstractC0023y;
import F.O;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import i.C0;
import i.E0;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3357b;

    public /* synthetic */ a(m mVar, int i2) {
        this.f3356a = i2;
        this.f3357b = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        int i2 = this.f3356a;
        m mVar = this.f3357b;
        switch (i2) {
            case 0:
                EditText editText = textInputLayout.getEditText();
                e eVar = (e) mVar;
                textInputLayout.setEndIconVisible(e.d(eVar));
                textInputLayout.setEndIconCheckable(false);
                E0 e02 = eVar.f3365f;
                editText.setOnFocusChangeListener(e02);
                eVar.f3395c.setOnFocusChangeListener(e02);
                C0 c02 = eVar.f3364e;
                editText.removeTextChangedListener(c02);
                editText.addTextChangedListener(c02);
                return;
            case 1:
                EditText editText2 = textInputLayout.getEditText();
                if (!(editText2 instanceof AutoCompleteTextView)) {
                    throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                }
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
                l lVar = (l) mVar;
                int boxBackgroundMode = lVar.f3393a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(lVar.f3389n);
                } else if (boxBackgroundMode == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(lVar.f3388m);
                }
                if (!l.f(autoCompleteTextView)) {
                    TextInputLayout textInputLayout2 = lVar.f3393a;
                    int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                    m0.h boxBackground = textInputLayout2.getBoxBackground();
                    int w2 = B.a.w(autoCompleteTextView, 2130968774);
                    int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
                    if (boxBackgroundMode2 == 2) {
                        int w3 = B.a.w(autoCompleteTextView, 2130968802);
                        m0.h hVar = new m0.h(boxBackground.f3094a.f3072a);
                        int K2 = B.a.K(w2, w3, 0.1f);
                        hVar.k(new ColorStateList(iArr, new int[]{K2, 0}));
                        hVar.setTint(w3);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{K2, w3});
                        m0.h hVar2 = new m0.h(boxBackground.f3094a.f3072a);
                        hVar2.setTint(-1);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar, hVar2), boxBackground});
                        WeakHashMap weakHashMap = O.f58a;
                        AbstractC0023y.q(autoCompleteTextView, layerDrawable);
                    } else if (boxBackgroundMode2 == 1) {
                        int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{B.a.K(w2, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                        WeakHashMap weakHashMap2 = O.f58a;
                        AbstractC0023y.q(autoCompleteTextView, rippleDrawable);
                    }
                }
                autoCompleteTextView.setOnTouchListener(new j(lVar, autoCompleteTextView));
                autoCompleteTextView.setOnFocusChangeListener(lVar.f3381f);
                autoCompleteTextView.setOnDismissListener(new k(lVar));
                autoCompleteTextView.setThreshold(0);
                h hVar3 = lVar.f3380e;
                autoCompleteTextView.removeTextChangedListener(hVar3);
                autoCompleteTextView.addTextChangedListener(hVar3);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (autoCompleteTextView.getKeyListener() == null) {
                    CheckableImageButton checkableImageButton = lVar.f3395c;
                    WeakHashMap weakHashMap3 = O.f58a;
                    AbstractC0023y.s(checkableImageButton, 2);
                }
                textInputLayout.setTextInputAccessibilityDelegate(lVar.f3382g);
                textInputLayout.setEndIconVisible(true);
                return;
            default:
                EditText editText3 = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                q qVar = (q) mVar;
                qVar.f3395c.setChecked(!q.d(qVar));
                h hVar4 = qVar.f3426e;
                editText3.removeTextChangedListener(hVar4);
                editText3.addTextChangedListener(hVar4);
                return;
        }
    }
}
