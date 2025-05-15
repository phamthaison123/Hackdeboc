package S;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: S.y, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0048y implements Parcelable {
    public static final Parcelable.Creator<C0048y> CREATOR = new androidx.activity.result.a(7);

    /* renamed from: a, reason: collision with root package name */
    public int f550a;

    /* renamed from: b, reason: collision with root package name */
    public int f551b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f552c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f550a);
        parcel.writeInt(this.f551b);
        parcel.writeInt(this.f552c ? 1 : 0);
    }
}
