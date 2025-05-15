package s;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import i.L0;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0219f extends K.b {
    public static final Parcelable.Creator<C0219f> CREATOR = new L0(2);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f3708c;

    public C0219f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f3708c = new SparseArray(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f3708c.append(iArr[i2], readParcelableArray[i2]);
        }
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.f3708c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.f3708c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f3708c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}
