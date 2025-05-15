package com.google.android.material.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import d0.a;
import e.y;
import h0.k;
import i.C0131H;
import i.C0165q;
import i.C0168s;
import i.C0170t;
import i.X;
import o0.p;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class MaterialComponentsViewInflater extends y {
    @Override // e.y
    public final C0165q a(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    @Override // e.y
    public final C0168s b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // e.y
    public final C0170t c(Context context, AttributeSet attributeSet) {
        a aVar = new a(p0.a.a(context, attributeSet, 2130968712, 2131821482), attributeSet, 2130968712);
        Context context2 = aVar.getContext();
        TypedArray j2 = k.j(context2, attributeSet, X.a.f694o, 2130968712, 2131821482, new int[0]);
        if (j2.hasValue(0)) {
            aVar.setButtonTintList(k.f(context2, j2, 0));
        }
        aVar.f2034f = j2.getBoolean(1, false);
        j2.recycle();
        return aVar;
    }

    @Override // e.y
    public final C0131H d(Context context, AttributeSet attributeSet) {
        i0.a aVar = new i0.a(p0.a.a(context, attributeSet, 2130969320, 2131821483), attributeSet);
        Context context2 = aVar.getContext();
        TypedArray j2 = k.j(context2, attributeSet, X.a.f695p, 2130969320, 2131821483, new int[0]);
        if (j2.hasValue(0)) {
            aVar.setButtonTintList(k.f(context2, j2, 0));
        }
        aVar.f2964f = j2.getBoolean(1, false);
        j2.recycle();
        return aVar;
    }

    @Override // e.y
    public final X e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
