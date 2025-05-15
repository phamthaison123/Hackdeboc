package com.google.android.material.button;

import F.AbstractC0024z;
import F.O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c0.a;
import c0.b;
import c0.c;
import c0.e;
import e.z;
import h0.k;
import i.C0168s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.l;
import m0.w;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class MaterialButton extends C0168s implements Checkable, w {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f1729q = {R.attr.state_checkable};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1730r = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f1731d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1732e;

    /* renamed from: f, reason: collision with root package name */
    public a f1733f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1734g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f1735h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1736i;

    /* renamed from: j, reason: collision with root package name */
    public int f1737j;

    /* renamed from: k, reason: collision with root package name */
    public int f1738k;

    /* renamed from: l, reason: collision with root package name */
    public int f1739l;

    /* renamed from: m, reason: collision with root package name */
    public int f1740m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1741n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1742o;

    /* renamed from: p, reason: collision with root package name */
    public int f1743p;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(p0.a.a(context, attributeSet, 2130969184, 2131821458), attributeSet, 2130969184);
        this.f1732e = new LinkedHashSet();
        this.f1741n = false;
        this.f1742o = false;
        Context context2 = getContext();
        TypedArray j2 = k.j(context2, attributeSet, X.a.f690k, 2130969184, 2131821458, new int[0]);
        this.f1740m = j2.getDimensionPixelSize(12, 0);
        int i2 = j2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1734g = k.k(i2, mode);
        this.f1735h = k.f(getContext(), j2, 14);
        this.f1736i = k.h(getContext(), j2, 10);
        this.f1743p = j2.getInteger(11, 1);
        this.f1737j = j2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, l.b(context2, attributeSet, 2130969184, 2131821458).a());
        this.f1731d = cVar;
        cVar.f1640c = j2.getDimensionPixelOffset(1, 0);
        cVar.f1641d = j2.getDimensionPixelOffset(2, 0);
        cVar.f1642e = j2.getDimensionPixelOffset(3, 0);
        cVar.f1643f = j2.getDimensionPixelOffset(4, 0);
        if (j2.hasValue(8)) {
            int dimensionPixelSize = j2.getDimensionPixelSize(8, -1);
            cVar.f1644g = dimensionPixelSize;
            float f2 = dimensionPixelSize;
            m0.k e2 = cVar.f1639b.e();
            e2.f3121e = new m0.a(f2);
            e2.f3122f = new m0.a(f2);
            e2.f3123g = new m0.a(f2);
            e2.f3124h = new m0.a(f2);
            cVar.c(e2.a());
            cVar.f1653p = true;
        }
        cVar.f1645h = j2.getDimensionPixelSize(20, 0);
        cVar.f1646i = k.k(j2.getInt(7, -1), mode);
        cVar.f1647j = k.f(getContext(), j2, 6);
        cVar.f1648k = k.f(getContext(), j2, 19);
        cVar.f1649l = k.f(getContext(), j2, 16);
        cVar.f1654q = j2.getBoolean(5, false);
        cVar.f1656s = j2.getDimensionPixelSize(9, 0);
        WeakHashMap weakHashMap = O.f58a;
        int f3 = AbstractC0024z.f(this);
        int paddingTop = getPaddingTop();
        int e3 = AbstractC0024z.e(this);
        int paddingBottom = getPaddingBottom();
        if (j2.hasValue(0)) {
            cVar.f1652o = true;
            setSupportBackgroundTintList(cVar.f1647j);
            setSupportBackgroundTintMode(cVar.f1646i);
        } else {
            cVar.e();
        }
        AbstractC0024z.k(this, f3 + cVar.f1640c, paddingTop + cVar.f1642e, e3 + cVar.f1641d, paddingBottom + cVar.f1643f);
        j2.recycle();
        setCompoundDrawablePadding(this.f1740m);
        d(this.f1736i != null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        c cVar = this.f1731d;
        return cVar != null && cVar.f1654q;
    }

    public final boolean b() {
        c cVar = this.f1731d;
        return (cVar == null || cVar.f1652o) ? false : true;
    }

    public final void c() {
        int i2 = this.f1743p;
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f1736i, null, null, null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative(null, null, this.f1736i, null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative(null, this.f1736i, null, null);
        }
    }

    public final void d(boolean z2) {
        Drawable drawable = this.f1736i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f1736i = mutate;
            mutate.setTintList(this.f1735h);
            PorterDuff.Mode mode = this.f1734g;
            if (mode != null) {
                this.f1736i.setTintMode(mode);
            }
            int i2 = this.f1737j;
            if (i2 == 0) {
                i2 = this.f1736i.getIntrinsicWidth();
            }
            int i3 = this.f1737j;
            if (i3 == 0) {
                i3 = this.f1736i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1736i;
            int i4 = this.f1738k;
            int i5 = this.f1739l;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.f1736i.setVisible(true, z2);
        }
        if (z2) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i6 = this.f1743p;
        if (((i6 == 1 || i6 == 2) && drawable3 != this.f1736i) || (((i6 == 3 || i6 == 4) && drawable5 != this.f1736i) || ((i6 == 16 || i6 == 32) && drawable4 != this.f1736i))) {
            c();
        }
    }

    public final void e(int i2, int i3) {
        if (this.f1736i == null || getLayout() == null) {
            return;
        }
        int i4 = this.f1743p;
        if (!(i4 == 1 || i4 == 2) && i4 != 3 && i4 != 4) {
            if (i4 == 16 || i4 == 32) {
                this.f1738k = 0;
                if (i4 == 16) {
                    this.f1739l = 0;
                    d(false);
                    return;
                }
                int i5 = this.f1737j;
                if (i5 == 0) {
                    i5 = this.f1736i.getIntrinsicHeight();
                }
                int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - i5) - this.f1740m) - getPaddingBottom()) / 2;
                if (this.f1739l != textHeight) {
                    this.f1739l = textHeight;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1739l = 0;
        if (i4 == 1 || i4 == 3) {
            this.f1738k = 0;
            d(false);
            return;
        }
        int i6 = this.f1737j;
        if (i6 == 0) {
            i6 = this.f1736i.getIntrinsicWidth();
        }
        int textWidth = i2 - getTextWidth();
        WeakHashMap weakHashMap = O.f58a;
        int e2 = ((((textWidth - AbstractC0024z.e(this)) - i6) - this.f1740m) - AbstractC0024z.f(this)) / 2;
        if ((AbstractC0024z.d(this) == 1) != (this.f1743p == 4)) {
            e2 = -e2;
        }
        if (this.f1738k != e2) {
            this.f1738k = e2;
            d(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f1731d.f1644g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f1736i;
    }

    public int getIconGravity() {
        return this.f1743p;
    }

    public int getIconPadding() {
        return this.f1740m;
    }

    public int getIconSize() {
        return this.f1737j;
    }

    public ColorStateList getIconTint() {
        return this.f1735h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1734g;
    }

    public int getInsetBottom() {
        return this.f1731d.f1643f;
    }

    public int getInsetTop() {
        return this.f1731d.f1642e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f1731d.f1649l;
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        if (b()) {
            return this.f1731d.f1639b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f1731d.f1648k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f1731d.f1645h;
        }
        return 0;
    }

    @Override // i.C0168s
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f1731d.f1647j : super.getSupportBackgroundTintList();
    }

    @Override // i.C0168s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f1731d.f1646i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1741n;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            k.n(this, this.f1731d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f1729q);
        }
        if (this.f1741n) {
            View.mergeDrawableStates(onCreateDrawableState, f1730r);
        }
        return onCreateDrawableState;
    }

    @Override // i.C0168s, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1741n);
    }

    @Override // i.C0168s, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f1741n);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // i.C0168s, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f173a);
        setChecked(bVar.f1637c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f1637c = this.f1741n;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        e(i2, i3);
    }

    @Override // i.C0168s, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1736i != null) {
            if (this.f1736i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!b()) {
            super.setBackgroundColor(i2);
            return;
        }
        c cVar = this.f1731d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i2);
        }
    }

    @Override // i.C0168s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f1731d;
        cVar.f1652o = true;
        ColorStateList colorStateList = cVar.f1647j;
        MaterialButton materialButton = cVar.f1638a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.f1646i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // i.C0168s, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? B.a.A(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (b()) {
            this.f1731d.f1654q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f1741n != z2) {
            this.f1741n = z2;
            refreshDrawableState();
            if (this.f1742o) {
                return;
            }
            this.f1742o = true;
            Iterator it = this.f1732e.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                boolean z3 = this.f1741n;
                MaterialButtonToggleGroup materialButtonToggleGroup = eVar.f1659a;
                if (!materialButtonToggleGroup.f1751g) {
                    if (materialButtonToggleGroup.f1752h) {
                        materialButtonToggleGroup.f1754j = z3 ? getId() : -1;
                    }
                    if (materialButtonToggleGroup.d(getId(), z3)) {
                        materialButtonToggleGroup.b(getId(), this.f1741n);
                    }
                    materialButtonToggleGroup.invalidate();
                }
            }
            this.f1742o = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (b()) {
            c cVar = this.f1731d;
            if (cVar.f1653p && cVar.f1644g == i2) {
                return;
            }
            cVar.f1644g = i2;
            cVar.f1653p = true;
            float f2 = i2;
            m0.k e2 = cVar.f1639b.e();
            e2.f3121e = new m0.a(f2);
            e2.f3122f = new m0.a(f2);
            e2.f3123g = new m0.a(f2);
            e2.f3124h = new m0.a(f2);
            cVar.c(e2.a());
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (b()) {
            this.f1731d.b(false).j(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1736i != drawable) {
            this.f1736i = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f1743p != i2) {
            this.f1743p = i2;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f1740m != i2) {
            this.f1740m = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? B.a.A(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1737j != i2) {
            this.f1737j = i2;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1735h != colorStateList) {
            this.f1735h = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1734g != mode) {
            this.f1734g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(B.a.x(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        c cVar = this.f1731d;
        cVar.d(cVar.f1642e, i2);
    }

    public void setInsetTop(int i2) {
        c cVar = this.f1731d;
        cVar.d(i2, cVar.f1643f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f1733f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.f1733f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((z) aVar).f2221b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f1731d;
            if (cVar.f1649l != colorStateList) {
                cVar.f1649l = colorStateList;
                MaterialButton materialButton = cVar.f1638a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (b()) {
            setRippleColor(B.a.x(getContext(), i2));
        }
    }

    @Override // m0.w
    public void setShapeAppearanceModel(l lVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f1731d.c(lVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.f1731d;
            cVar.f1651n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f1731d;
            if (cVar.f1648k != colorStateList) {
                cVar.f1648k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (b()) {
            setStrokeColor(B.a.x(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (b()) {
            c cVar = this.f1731d;
            if (cVar.f1645h != i2) {
                cVar.f1645h = i2;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // i.C0168s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f1731d;
        if (cVar.f1647j != colorStateList) {
            cVar.f1647j = colorStateList;
            if (cVar.b(false) != null) {
                cVar.b(false).setTintList(cVar.f1647j);
            }
        }
    }

    @Override // i.C0168s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f1731d;
        if (cVar.f1646i != mode) {
            cVar.f1646i = mode;
            if (cVar.b(false) == null || cVar.f1646i == null) {
                return;
            }
            cVar.b(false).setTintMode(cVar.f1646i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1741n);
    }
}
