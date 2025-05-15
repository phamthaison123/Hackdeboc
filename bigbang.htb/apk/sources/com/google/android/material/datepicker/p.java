package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new androidx.activity.result.a(13);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f1832a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1833b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1834c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1835d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1836e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1837f;

    /* renamed from: g, reason: collision with root package name */
    public String f1838g;

    public p(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = w.a(calendar);
        this.f1832a = a2;
        this.f1833b = a2.get(2);
        this.f1834c = a2.get(1);
        this.f1835d = a2.getMaximum(7);
        this.f1836e = a2.getActualMaximum(5);
        this.f1837f = a2.getTimeInMillis();
    }

    public static p b(int i2, int i3) {
        Calendar c2 = w.c(null);
        c2.set(1, i2);
        c2.set(2, i3);
        return new p(c2);
    }

    public static p c(long j2) {
        Calendar c2 = w.c(null);
        c2.setTimeInMillis(j2);
        return new p(c2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p pVar) {
        return this.f1832a.compareTo(pVar.f1832a);
    }

    public final int d() {
        Calendar calendar = this.f1832a;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f1835d : firstDayOfWeek;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e(Context context) {
        if (this.f1838g == null) {
            this.f1838g = DateUtils.formatDateTime(context, this.f1832a.getTimeInMillis() - TimeZone.getDefault().getOffset(r0), 36);
        }
        return this.f1838g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f1833b == pVar.f1833b && this.f1834c == pVar.f1834c;
    }

    public final int f(p pVar) {
        if (!(this.f1832a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (pVar.f1833b - this.f1833b) + ((pVar.f1834c - this.f1834c) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1833b), Integer.valueOf(this.f1834c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1834c);
        parcel.writeInt(this.f1833b);
    }
}
