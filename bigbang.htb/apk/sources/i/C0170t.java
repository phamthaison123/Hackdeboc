package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: i.t, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0170t extends CheckBox {

    /* renamed from: a, reason: collision with root package name */
    public final C0174v f2894a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2895b;

    /* renamed from: c, reason: collision with root package name */
    public final W f2896c;

    /* renamed from: d, reason: collision with root package name */
    public C0124A f2897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170t(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        R0.a(context);
        Q0.a(this, getContext());
        C0174v c0174v = new C0174v(this, 1);
        this.f2894a = c0174v;
        c0174v.c(attributeSet, i2);
        r rVar = new r(this);
        this.f2895b = rVar;
        rVar.e(attributeSet, i2);
        W w2 = new W(this);
        this.f2896c = w2;
        w2.d(attributeSet, i2);
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private C0124A getEmojiTextViewHelper() {
        if (this.f2897d == null) {
            this.f2897d = new C0124A(this);
        }
        return this.f2897d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2895b;
        if (rVar != null) {
            rVar.a();
        }
        W w2 = this.f2896c;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0174v c0174v = this.f2894a;
        if (c0174v != null) {
            c0174v.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2895b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2895b;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0174v c0174v = this.f2894a;
        if (c0174v != null) {
            return c0174v.f2928b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0174v c0174v = this.f2894a;
        if (c0174v != null) {
            return c0174v.f2929c;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2895b;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r rVar = this.f2895b;
        if (rVar != null) {
            rVar.g(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0174v c0174v = this.f2894a;
        if (c0174v != null) {
            if (c0174v.f2932f) {
                c0174v.f2932f = false;
            } else {
                c0174v.f2932f = true;
                c0174v.a();
            }
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
        r rVar = this.f2895b;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2895b;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0174v c0174v = this.f2894a;
        if (c0174v != null) {
            c0174v.f2928b = colorStateList;
            c0174v.f2930d = true;
            c0174v.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0174v c0174v = this.f2894a;
        if (c0174v != null) {
            c0174v.f2929c = mode;
            c0174v.f2931e = true;
            c0174v.a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(B.a.A(getContext(), i2));
    }
}
