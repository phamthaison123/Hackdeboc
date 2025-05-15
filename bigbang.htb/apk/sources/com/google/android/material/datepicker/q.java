package com.google.android.material.datepicker;

import F.AbstractC0023y;
import F.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class q extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f1839d = w.c(null).getMaximum(4);

    /* renamed from: a, reason: collision with root package name */
    public final p f1840a;

    /* renamed from: b, reason: collision with root package name */
    public d f1841b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1842c;

    public q(p pVar, c cVar) {
        this.f1840a = pVar;
        this.f1842c = cVar;
        throw null;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        p pVar = this.f1840a;
        if (i2 < pVar.d() || i2 > b()) {
            return null;
        }
        int d2 = (i2 - pVar.d()) + 1;
        Calendar a2 = w.a(pVar.f1832a);
        a2.set(5, d2);
        return Long.valueOf(a2.getTimeInMillis());
    }

    public final int b() {
        p pVar = this.f1840a;
        return (pVar.d() + pVar.f1836e) - 1;
    }

    public final void c(TextView textView, long j2) {
        if (textView == null) {
            return;
        }
        if (j2 >= ((e) this.f1842c.f1788c).f1795a) {
            textView.setEnabled(true);
            throw null;
        }
        textView.setEnabled(false);
        i.r rVar = this.f1841b.f1794c;
        rVar.getClass();
        m0.h hVar = new m0.h();
        m0.h hVar2 = new m0.h();
        hVar.setShapeAppearanceModel((m0.l) rVar.f2888g);
        hVar2.setShapeAppearanceModel((m0.l) rVar.f2888g);
        hVar.k((ColorStateList) rVar.f2886e);
        float f2 = rVar.f2883b;
        ColorStateList colorStateList = (ColorStateList) rVar.f2887f;
        hVar.f3094a.f3082k = f2;
        hVar.invalidateSelf();
        m0.g gVar = hVar.f3094a;
        if (gVar.f3075d != colorStateList) {
            gVar.f3075d = colorStateList;
            hVar.onStateChange(hVar.getState());
        }
        ColorStateList colorStateList2 = (ColorStateList) rVar.f2885d;
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2.withAlpha(30), hVar, hVar2);
        Rect rect = (Rect) rVar.f2884c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.q(textView, insetDrawable);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        p pVar = this.f1840a;
        return pVar.d() + pVar.f1836e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.f1840a.f1835d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f1841b == null) {
            this.f1841b = new d(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131492935, viewGroup, false);
        }
        p pVar = this.f1840a;
        int d2 = i2 - pVar.d();
        if (d2 < 0 || d2 >= pVar.f1836e) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i3 = d2 + 1;
            textView.setTag(pVar);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i3)));
            Calendar a2 = w.a(pVar.f1832a);
            a2.set(5, i3);
            long timeInMillis = a2.getTimeInMillis();
            Calendar b2 = w.b();
            b2.set(5, 1);
            Calendar a3 = w.a(b2);
            a3.get(2);
            int i4 = a3.get(1);
            a3.getMaximum(7);
            a3.getActualMaximum(5);
            a3.getTimeInMillis();
            if (pVar.f1834c == i4) {
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton.format(new Date(timeInMillis)));
            } else {
                DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
                instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                textView.setContentDescription(instanceForSkeleton2.format(new Date(timeInMillis)));
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i2);
        if (item != null) {
            c(textView, item.longValue());
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
