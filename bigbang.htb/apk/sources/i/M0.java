package i;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class M0 extends K.b {
    public static final Parcelable.Creator<M0> CREATOR = new L0(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2659c;

    public M0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2659c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2659c + "}";
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f2659c));
    }
}
