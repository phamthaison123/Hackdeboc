package Z;

import android.os.Parcel;
import android.os.Parcelable;
import i.L0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends K.b {
    public static final Parcelable.Creator<a> CREATOR = new L0(5);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f717c;

    /* renamed from: d, reason: collision with root package name */
    public final int f718d;

    /* renamed from: e, reason: collision with root package name */
    public final float f719e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f720f;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f717c = parcel.readByte() != 0;
        this.f718d = parcel.readInt();
        this.f719e = parcel.readFloat();
        this.f720f = parcel.readByte() != 0;
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f717c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f718d);
        parcel.writeFloat(this.f719e);
        parcel.writeByte(this.f720f ? (byte) 1 : (byte) 0);
    }
}
