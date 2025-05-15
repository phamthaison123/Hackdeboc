package i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: i.c0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0138c0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final r f2783a;

    /* renamed from: b, reason: collision with root package name */
    public final W f2784b;

    /* renamed from: c, reason: collision with root package name */
    public C0124A f2785c;

    public C0138c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        Q0.a(this, getContext());
        r rVar = new r(this);
        this.f2783a = rVar;
        rVar.e(attributeSet, R.attr.buttonStyleToggle);
        W w2 = new W(this);
        this.f2784b = w2;
        w2.d(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0124A getEmojiTextViewHelper() {
        if (this.f2785c == null) {
            this.f2785c = new C0124A(this);
        }
        return this.f2785c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2783a;
        if (rVar != null) {
            rVar.a();
        }
        W w2 = this.f2784b;
        if (w2 != null) {
            w2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2783a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2783a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2783a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r rVar = this.f2783a;
        if (rVar != null) {
            rVar.g(i2);
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((m0.e) getEmojiTextViewHelper().f2606b.f2221b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2783a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2783a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }
}
