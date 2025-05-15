package h0;

import android.os.Parcel;
import android.os.Parcelable;
import i.L0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends K.b {
    public static final Parcelable.Creator<a> CREATOR = new L0(8);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2530c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2530c = parcel.readInt() == 1;
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f2530c ? 1 : 0);
    }
}
