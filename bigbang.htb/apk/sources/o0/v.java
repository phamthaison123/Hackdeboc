package o0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i.L0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class v extends K.b {
    public static final Parcelable.Creator<v> CREATOR = new L0(9);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3432c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3433d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3434e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3435f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f3436g;

    public v(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3432c = (CharSequence) creator.createFromParcel(parcel);
        this.f3433d = parcel.readInt() == 1;
        this.f3434e = (CharSequence) creator.createFromParcel(parcel);
        this.f3435f = (CharSequence) creator.createFromParcel(parcel);
        this.f3436g = (CharSequence) creator.createFromParcel(parcel);
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3432c) + " hint=" + ((Object) this.f3434e) + " helperText=" + ((Object) this.f3435f) + " placeholderText=" + ((Object) this.f3436g) + "}";
    }

    @Override // K.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.f3432c, parcel, i2);
        parcel.writeInt(this.f3433d ? 1 : 0);
        TextUtils.writeToParcel(this.f3434e, parcel, i2);
        TextUtils.writeToParcel(this.f3435f, parcel, i2);
        TextUtils.writeToParcel(this.f3436g, parcel, i2);
    }
}
