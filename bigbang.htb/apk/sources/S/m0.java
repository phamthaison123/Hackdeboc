package S;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new androidx.activity.result.a(9);

    /* renamed from: a, reason: collision with root package name */
    public int f441a;

    /* renamed from: b, reason: collision with root package name */
    public int f442b;

    /* renamed from: c, reason: collision with root package name */
    public int f443c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f444d;

    /* renamed from: e, reason: collision with root package name */
    public int f445e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f446f;

    /* renamed from: g, reason: collision with root package name */
    public List f447g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f448h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f449i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f450j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f441a);
        parcel.writeInt(this.f442b);
        parcel.writeInt(this.f443c);
        if (this.f443c > 0) {
            parcel.writeIntArray(this.f444d);
        }
        parcel.writeInt(this.f445e);
        if (this.f445e > 0) {
            parcel.writeIntArray(this.f446f);
        }
        parcel.writeInt(this.f448h ? 1 : 0);
        parcel.writeInt(this.f449i ? 1 : 0);
        parcel.writeInt(this.f450j ? 1 : 0);
        parcel.writeList(this.f447g);
    }
}
