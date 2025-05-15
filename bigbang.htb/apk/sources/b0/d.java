package b0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i.L0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d extends K.b {
    public static final Parcelable.Creator<d> CREATOR = new L0(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f1628c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1629d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1630e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1631f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1632g;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1628c = parcel.readInt();
        this.f1629d = parcel.readInt();
        this.f1630e = parcel.readInt() == 1;
        this.f1631f = parcel.readInt() == 1;
        this.f1632g = parcel.readInt() == 1;
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1628c);
        parcel.writeInt(this.f1629d);
        parcel.writeInt(this.f1630e ? 1 : 0);
        parcel.writeInt(this.f1631f ? 1 : 0);
        parcel.writeInt(this.f1632g ? 1 : 0);
    }

    public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f1628c = bottomSheetBehavior.f1685G;
        this.f1629d = bottomSheetBehavior.f1706d;
        this.f1630e = bottomSheetBehavior.f1704b;
        this.f1631f = bottomSheetBehavior.f1682D;
        this.f1632g = bottomSheetBehavior.f1683E;
    }
}
