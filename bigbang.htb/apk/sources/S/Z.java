package S;

import android.os.Parcel;
import android.os.Parcelable;
import i.L0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class Z extends K.b {
    public static final Parcelable.Creator<Z> CREATOR = new L0(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f315c;

    public Z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f315c = parcel.readParcelable(classLoader == null ? P.class.getClassLoader() : classLoader);
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f315c, 0);
    }
}
