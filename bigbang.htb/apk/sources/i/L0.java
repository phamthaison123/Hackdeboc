package i;

import android.os.Parcel;
import android.os.Parcelable;
import s.C0219f;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class L0 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2654a;

    public /* synthetic */ L0(int i2) {
        this.f2654a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2654a) {
            case 0:
                return new M0(parcel, null);
            case 1:
                return new X0(parcel, null);
            case 2:
                return new C0219f(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return K.b.f172b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new S.Z(parcel, null);
            case 5:
                return new Z.a(parcel, null);
            case 6:
                return new b0.d(parcel, (ClassLoader) null);
            case 7:
                return new c0.b(parcel, null);
            case 8:
                return new h0.a(parcel, null);
            default:
                return new o0.v(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f2654a) {
            case 0:
                return new M0[i2];
            case 1:
                return new X0[i2];
            case 2:
                return new C0219f[i2];
            case 3:
                return new K.b[i2];
            case 4:
                return new S.Z[i2];
            case 5:
                return new Z.a[i2];
            case 6:
                return new b0.d[i2];
            case 7:
                return new c0.b[i2];
            case 8:
                return new h0.a[i2];
            default:
                return new o0.v[i2];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2654a) {
            case 0:
                return new M0(parcel, classLoader);
            case 1:
                return new X0(parcel, classLoader);
            case 2:
                return new C0219f(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return K.b.f172b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new S.Z(parcel, classLoader);
            case 5:
                return new Z.a(parcel, classLoader);
            case 6:
                return new b0.d(parcel, classLoader);
            case 7:
                return new c0.b(parcel, classLoader);
            case 8:
                return new h0.a(parcel, classLoader);
            default:
                return new o0.v(parcel, classLoader);
        }
    }
}
