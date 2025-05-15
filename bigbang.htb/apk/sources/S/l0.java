package S;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new androidx.activity.result.a(8);

    /* renamed from: a, reason: collision with root package name */
    public int f436a;

    /* renamed from: b, reason: collision with root package name */
    public int f437b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f438c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f439d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f436a + ", mGapDir=" + this.f437b + ", mHasUnwantedGapAfter=" + this.f439d + ", mGapPerSpan=" + Arrays.toString(this.f438c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f436a);
        parcel.writeInt(this.f437b);
        parcel.writeInt(this.f439d ? 1 : 0);
        int[] iArr = this.f438c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f438c);
        }
    }
}
