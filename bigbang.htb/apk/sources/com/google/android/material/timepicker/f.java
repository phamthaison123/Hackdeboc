package com.google.android.material.timepicker;

import F.AbstractC0023y;
import F.AbstractC0024z;
import F.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import java.util.WeakHashMap;
import q.n;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class f extends ConstraintLayout {

    /* renamed from: p, reason: collision with root package name */
    public final e f1974p;

    /* renamed from: q, reason: collision with root package name */
    public int f1975q;

    /* renamed from: r, reason: collision with root package name */
    public final m0.h f1976r;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969206);
        LayoutInflater.from(context).inflate(2131492922, this);
        m0.h hVar = new m0.h();
        this.f1976r = hVar;
        m0.i iVar = new m0.i(0.5f);
        m0.k e2 = hVar.f3094a.f3072a.e();
        e2.f3121e = iVar;
        e2.f3122f = iVar;
        e2.f3123g = iVar;
        e2.f3124h = iVar;
        hVar.setShapeAppearanceModel(e2.a());
        this.f1976r.k(ColorStateList.valueOf(-1));
        m0.h hVar2 = this.f1976r;
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.q(this, hVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f700u, 2130969206, 0);
        this.f1975q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1974p = new e(this);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = O.f58a;
            view.setId(AbstractC0024z.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f1974p;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public final void f() {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if ("skip".equals(getChildAt(i3).getTag())) {
                i2++;
            }
        }
        n nVar = new n();
        nVar.b(this);
        float f2 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != 2131296361 && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i5 = this.f1975q;
                HashMap hashMap = nVar.f3674c;
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new q.i());
                }
                q.j jVar = ((q.i) hashMap.get(Integer.valueOf(id))).f3583d;
                jVar.f3644w = 2131296361;
                jVar.f3645x = i5;
                jVar.f3646y = f2;
                f2 = (360.0f / (childCount - i2)) + f2;
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f1974p;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f1976r.k(ColorStateList.valueOf(i2));
    }
}
