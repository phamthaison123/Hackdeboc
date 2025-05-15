package i;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class X0 extends K.b {
    public static final Parcelable.Creator<X0> CREATOR = new L0(1);

    /* renamed from: c, reason: collision with root package name */
    public int f2748c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2749d;

    public X0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2748c = parcel.readInt();
        this.f2749d = parcel.readInt() != 0;
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f2748c);
        parcel.writeInt(this.f2749d ? 1 : 0);
    }
}
