package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new androidx.activity.result.a(5);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1196a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1197b;

    /* renamed from: c, reason: collision with root package name */
    public C0061b[] f1198c;

    /* renamed from: d, reason: collision with root package name */
    public int f1199d;

    /* renamed from: e, reason: collision with root package name */
    public String f1200e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1201f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1202g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1203h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1196a);
        parcel.writeStringList(this.f1197b);
        parcel.writeTypedArray(this.f1198c, i2);
        parcel.writeInt(this.f1199d);
        parcel.writeString(this.f1200e);
        parcel.writeStringList(this.f1201f);
        parcel.writeTypedList(this.f1202g);
        parcel.writeTypedList(this.f1203h);
    }
}
