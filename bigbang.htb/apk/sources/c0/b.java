package c0;

import android.os.Parcel;
import android.os.Parcelable;
import i.L0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b extends K.b {
    public static final Parcelable.Creator<b> CREATOR = new L0(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f1637c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f1637c = parcel.readInt() == 1;
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1637c ? 1 : 0);
    }
}
