package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new androidx.activity.result.a(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f1977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1980d;

    public g(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f1978b = readInt;
        this.f1979c = readInt2;
        this.f1980d = readInt3;
        this.f1977a = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1978b == gVar.f1978b && this.f1979c == gVar.f1979c && this.f1977a == gVar.f1977a && this.f1980d == gVar.f1980d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1977a), Integer.valueOf(this.f1978b), Integer.valueOf(this.f1979c), Integer.valueOf(this.f1980d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1978b);
        parcel.writeInt(this.f1979c);
        parcel.writeInt(this.f1980d);
        parcel.writeInt(this.f1977a);
    }
}
