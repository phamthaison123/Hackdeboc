package com.google.android.material.snackbar;

import F.AbstractC0024z;
import F.O;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f1872a;

    /* renamed from: b, reason: collision with root package name */
    public Button f1873b;

    /* renamed from: c, reason: collision with root package name */
    public int f1874c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f1872a.getPaddingTop() == i3 && this.f1872a.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.f1872a;
        WeakHashMap weakHashMap = O.f58a;
        if (AbstractC0024z.g(textView)) {
            AbstractC0024z.k(textView, AbstractC0024z.f(textView), i3, AbstractC0024z.e(textView), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f1873b;
    }

    public TextView getMessageView() {
        return this.f1872a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1872a = (TextView) findViewById(2131296605);
        this.f1873b = (Button) findViewById(2131296604);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165321);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165320);
        boolean z2 = this.f1872a.getLayout().getLineCount() > 1;
        if (!z2 || this.f1874c <= 0 || this.f1873b.getMeasuredWidth() <= this.f1874c) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f1874c = i2;
    }
}
