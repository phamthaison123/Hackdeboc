package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: i.u, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0172u extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0174v f2923a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2924b;

    /* renamed from: c, reason: collision with root package name */
    public final W f2925c;

    /* renamed from: d, reason: collision with root package name */
    public C0124A f2926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0172u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968721);
        R0.a(context);
        Q0.a(this, getContext());
        W w2 = new W(this);
        this.f2925c = w2;
        w2.d(attributeSet, 2130968721);
        w2.b();
        r rVar = new r(this);
        this.f2924b = rVar;
        rVar.e(attributeSet, 2130968721);
        C0174v c0174v = new C0174v(this, 0);
        this.f2923a = c0174v;
        c0174v.c(attributeSet, 2130968721);
        getEmojiTextViewHelper().a(attributeSet, 2130968721);
    }

    private C0124A getEmojiTextViewHelper() {
        if (this.f2926d == null) {
            this.f2926d = new C0124A(this);
        }
        return this.f2926d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        W w2 = this.f2925c;
        if (w2 != null) {
            w2.b();
        }
        r rVar = this.f2924b;
        if (rVar != null) {
            rVar.a();
        }
        C0174v c0174v = this.f2923a;
        if (c0174v != null) {
            c0174v.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2924b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2924b;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0174v c0174v = this.f2923a;
        if (c0174v != null) {
            return c0174v.f2928b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0174v c0174v = this.f2923a;
        if (c0174v != null) {
            return c0174v.f2929c;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        B.a.P(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2924b;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r rVar = this.f2924b;
        if (rVar != null) {
            rVar.g(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0174v c0174v = this.f2923a;
        if (c0174v != null) {
            if (c0174v.f2932f) {
                c0174v.f2932f = false;
            } else {
                c0174v.f2932f = true;
                c0174v.b();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2924b;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2924b;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0174v c0174v = this.f2923a;
        if (c0174v != null) {
            c0174v.f2928b = colorStateList;
            c0174v.f2930d = true;
            c0174v.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0174v c0174v = this.f2923a;
        if (c0174v != null) {
            c0174v.f2929c = mode;
            c0174v.f2931e = true;
            c0174v.b();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        W w2 = this.f2925c;
        if (w2 != null) {
            w2.e(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(B.a.A(getContext(), i2));
    }
}
