package o0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f3376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f3376e = lVar;
    }

    @Override // o0.s, F.C0001b
    public final void d(View view, G.d dVar) {
        super.d(view, dVar);
        boolean f2 = l.f(this.f3376e.f3393a.getEditText());
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f129a;
        if (!f2) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // F.C0001b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        l lVar = this.f3376e;
        EditText editText = lVar.f3393a.getEditText();
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (accessibilityEvent.getEventType() == 1 && lVar.f3390o.isTouchExplorationEnabled() && !l.f(lVar.f3393a.getEditText())) {
            l.d(lVar, autoCompleteTextView);
        }
    }
}
