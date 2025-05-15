package i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import e.C0097c;

/* renamed from: i.q, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0165q extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2876d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final r f2877a;

    /* renamed from: b, reason: collision with root package name */
    public final W f2878b;

    /* renamed from: c, reason: collision with root package name */
    public final C0182z f2879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968629);
        R0.a(context);
        Q0.a(this, getContext());
        C0097c t2 = C0097c.t(getContext(), attributeSet, f2876d, 2130968629, 0);
        if (t2.r(0)) {
            setDropDownBackgroundDrawable(t2.g(0));
        }
        t2.u();
        r rVar = new r(this);
        this.f2877a = rVar;
        rVar.e(attributeSet, 2130968629);
        W w2 = new W(this);
        this.f2878b = w2;
        w2.d(attributeSet, 2130968629);
        w2.b();
        C0182z c0182z = new C0182z(this);
        this.f2879c = c0182z;
        c0182z.r(attributeSet, 2130968629);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener q2 = c0182z.q(keyListener);
            if (q2 == keyListener) {
                return;
            }
            super.setKeyListener(q2);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2877a;
        if (rVar != null) {
            rVar.a();
        }
        W w2 = this.f2878b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2877a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2877a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        B.a.P(this, editorInfo, onCreateInputConnection);
        return this.f2879c.s(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2877a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r rVar = this.f2877a;
        if (rVar != null) {
            rVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(B.a.A(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((N.b) this.f2879c.f2961b).f221a.f(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2879c.q(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2877a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2877a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        W w2 = this.f2878b;
        if (w2 != null) {
            w2.e(context, i2);
        }
    }
}
