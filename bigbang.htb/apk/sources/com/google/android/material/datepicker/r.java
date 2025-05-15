package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import e.z;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1844b;

    public r(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1844b = tVar;
        this.f1843a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f1843a;
        q a2 = materialCalendarGridView.a();
        if (i2 < a2.f1840a.d() || i2 > a2.b()) {
            return;
        }
        z zVar = this.f1844b.f1849e;
        long longValue = materialCalendarGridView.a().getItem(i2).longValue();
        Object obj = zVar.f2221b;
        if (longValue < ((e) ((l) obj).f1812U.f1788c).f1795a) {
            return;
        }
        ((l) obj).getClass();
        throw null;
    }
}
