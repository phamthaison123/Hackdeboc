package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1797b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1798c;

    public f() {
        Calendar c2 = w.c(null);
        this.f1796a = c2;
        this.f1797b = c2.getMaximum(7);
        this.f1798c = c2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1797b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        int i3 = this.f1797b;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f1798c;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131492936, viewGroup, false);
        }
        int i3 = i2 + this.f1798c;
        int i4 = this.f1797b;
        if (i3 > i4) {
            i3 -= i4;
        }
        Calendar calendar = this.f1796a;
        calendar.set(7, i3);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(2131755110), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
