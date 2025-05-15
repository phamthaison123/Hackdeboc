package com.google.android.material.internal;

import F.O;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import c0.d;
import h0.a;
import i.C0125B;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class CheckableImageButton extends C0125B implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1856g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f1857d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1858e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1859f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969037);
        this.f1858e = true;
        this.f1859f = true;
        O.h(this, new d(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1857d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f1857d ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f1856g) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f173a);
        setChecked(aVar.f2530c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f2530c = this.f1857d;
        return aVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f1858e != z2) {
            this.f1858e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f1858e || this.f1857d == z2) {
            return;
        }
        this.f1857d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f1859f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f1859f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1857d);
    }
}
