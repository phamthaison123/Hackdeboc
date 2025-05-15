package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new androidx.activity.result.a(4);

    /* renamed from: a, reason: collision with root package name */
    public String f1150a;

    /* renamed from: b, reason: collision with root package name */
    public int f1151b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1150a);
        parcel.writeInt(this.f1151b);
    }
}
