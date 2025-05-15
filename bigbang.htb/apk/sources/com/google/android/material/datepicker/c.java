package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new androidx.activity.result.a(11);

    /* renamed from: a, reason: collision with root package name */
    public final p f1786a;

    /* renamed from: b, reason: collision with root package name */
    public final p f1787b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1788c;

    /* renamed from: d, reason: collision with root package name */
    public final p f1789d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1790e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1791f;

    public c(p pVar, p pVar2, b bVar, p pVar3) {
        this.f1786a = pVar;
        this.f1787b = pVar2;
        this.f1789d = pVar3;
        this.f1788c = bVar;
        if (pVar3 != null && pVar.f1832a.compareTo(pVar3.f1832a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (pVar3 != null && pVar3.compareTo(pVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f1791f = pVar.f(pVar2) + 1;
        this.f1790e = (pVar2.f1834c - pVar.f1834c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1786a.equals(cVar.f1786a) && this.f1787b.equals(cVar.f1787b) && Objects.equals(this.f1789d, cVar.f1789d) && this.f1788c.equals(cVar.f1788c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1786a, this.f1787b, this.f1789d, this.f1788c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1786a, 0);
        parcel.writeParcelable(this.f1787b, 0);
        parcel.writeParcelable(this.f1789d, 0);
        parcel.writeParcelable(this.f1788c, 0);
    }
}
