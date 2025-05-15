package i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: i.s, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0168s extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final r f2890a;

    /* renamed from: b, reason: collision with root package name */
    public final W f2891b;

    /* renamed from: c, reason: collision with root package name */
    public C0124A f2892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168s(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        R0.a(context);
        Q0.a(this, getContext());
        r rVar = new r(this);
        this.f2890a = rVar;
        rVar.e(attributeSet, i2);
        W w2 = new W(this);
        this.f2891b = w2;
        w2.d(attributeSet, i2);
        w2.b();
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private C0124A getEmojiTextViewHelper() {
        if (this.f2892c == null) {
            this.f2892c = new C0124A(this);
        }
        return this.f2892c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2890a;
        if (rVar != null) {
            rVar.a();
        }
        W w2 = this.f2891b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2890a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2890a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        S0 s0 = this.f2891b.f2737h;
        if (s0 != null) {
            return (ColorStateList) s0.f2708c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        S0 s0 = this.f2891b.f2737h;
        if (s0 != null) {
            return (PorterDuff.Mode) s0.f2709d;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        W w2 = this.f2891b;
        if (w2 != null) {
            w2.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        super.setAutoSizeTextTypeWithDefaults(i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2890a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r rVar = this.f2890a;
        if (rVar != null) {
            rVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((m0.e) getEmojiTextViewHelper().f2606b.f2221b).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        W w2 = this.f2891b;
        if (w2 != null) {
            w2.f2730a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2890a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2890a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w2 = this.f2891b;
        if (w2.f2737h == null) {
            w2.f2737h = new S0(0);
        }
        S0 s0 = w2.f2737h;
        s0.f2708c = colorStateList;
        s0.f2707b = colorStateList != null;
        w2.f2731b = s0;
        w2.f2732c = s0;
        w2.f2733d = s0;
        w2.f2734e = s0;
        w2.f2735f = s0;
        w2.f2736g = s0;
        w2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w2 = this.f2891b;
        if (w2.f2737h == null) {
            w2.f2737h = new S0(0);
        }
        S0 s0 = w2.f2737h;
        s0.f2709d = mode;
        s0.f2706a = mode != null;
        w2.f2731b = s0;
        w2.f2732c = s0;
        w2.f2733d = s0;
        w2.f2734e = s0;
        w2.f2735f = s0;
        w2.f2736g = s0;
        w2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        W w2 = this.f2891b;
        if (w2 != null) {
            w2.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
    }
}
