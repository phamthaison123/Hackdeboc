package K;

import android.os.Parcel;
import android.os.Parcelable;
import i.L0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f173a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f172b = new a();
    public static final Parcelable.Creator<b> CREATOR = new L0(3);

    public b() {
        this.f173a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f173a, i2);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f173a = parcelable == f172b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f173a = readParcelable == null ? f172b : readParcelable;
    }
}
