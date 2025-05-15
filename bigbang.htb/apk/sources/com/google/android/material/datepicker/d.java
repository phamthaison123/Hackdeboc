package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i.r f1792a;

    /* renamed from: b, reason: collision with root package name */
    public final i.r f1793b;

    /* renamed from: c, reason: collision with root package name */
    public final i.r f1794c;

    public d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(h0.k.m(context, 2130969198, l.class.getCanonicalName()), X.a.f692m);
        i.r.b(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f1794c = i.r.b(context, obtainStyledAttributes.getResourceId(1, 0));
        i.r.b(context, obtainStyledAttributes.getResourceId(2, 0));
        i.r.b(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList f2 = h0.k.f(context, obtainStyledAttributes, 6);
        this.f1792a = i.r.b(context, obtainStyledAttributes.getResourceId(8, 0));
        i.r.b(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f1793b = i.r.b(context, obtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(f2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
