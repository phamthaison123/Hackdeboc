package androidx.versionedparcelable;

import W.b;
import W.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(10);

    /* renamed from: a, reason: collision with root package name */
    public final c f1621a;

    public ParcelImpl(Parcel parcel) {
        this.f1621a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).i(this.f1621a);
    }
}
