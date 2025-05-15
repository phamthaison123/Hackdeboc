package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import h0.k;
import i.X;
import p0.a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class MaterialTextView extends X {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        TypedValue l2 = k.l(context2, 2130969468);
        if (l2 != null && l2.type == 18 && l2.data == 0) {
            return;
        }
        Resources.Theme theme = context2.getTheme();
        int[] iArr = X.a.f698s;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int e2 = e(context2, obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (e2 != -1) {
            return;
        }
        TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
        obtainStyledAttributes2.recycle();
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, X.a.f697r);
            int e3 = e(getContext(), obtainStyledAttributes3, 1, 2);
            obtainStyledAttributes3.recycle();
            if (e3 >= 0) {
                setLineHeight(e3);
            }
        }
    }

    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            int i4 = iArr[i3];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i4, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i2 = dimensionPixelSize;
            } else {
                i2 = typedArray.getDimensionPixelSize(i4, -1);
            }
        }
        return i2;
    }

    @Override // i.X, android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        TypedValue l2 = k.l(context, 2130969468);
        if (l2 != null && l2.type == 18 && l2.data == 0) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i2, X.a.f697r);
        int e2 = e(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (e2 >= 0) {
            setLineHeight(e2);
        }
    }
}
