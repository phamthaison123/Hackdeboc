package I;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f extends View.BaseSavedState {
    public static final Parcelable.Creator<f> CREATOR = new androidx.activity.result.a(2);

    /* renamed from: a, reason: collision with root package name */
    public int f161a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f161a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f161a);
    }
}
