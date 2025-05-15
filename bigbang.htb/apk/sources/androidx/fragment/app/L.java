package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new androidx.activity.result.a(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f1210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1211b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1213d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1214e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1215f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1216g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1217h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1218i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1219j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1220k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1221l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1222m;

    public L(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        this.f1210a = abstractComponentCallbacksC0075p.getClass().getName();
        this.f1211b = abstractComponentCallbacksC0075p.f1391e;
        this.f1212c = abstractComponentCallbacksC0075p.f1399m;
        this.f1213d = abstractComponentCallbacksC0075p.f1408v;
        this.f1214e = abstractComponentCallbacksC0075p.f1409w;
        this.f1215f = abstractComponentCallbacksC0075p.f1410x;
        this.f1216g = abstractComponentCallbacksC0075p.f1370A;
        this.f1217h = abstractComponentCallbacksC0075p.f1398l;
        this.f1218i = abstractComponentCallbacksC0075p.f1412z;
        this.f1219j = abstractComponentCallbacksC0075p.f1392f;
        this.f1220k = abstractComponentCallbacksC0075p.f1411y;
        this.f1221l = abstractComponentCallbacksC0075p.f1381L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1210a);
        sb.append(" (");
        sb.append(this.f1211b);
        sb.append(")}:");
        if (this.f1212c) {
            sb.append(" fromLayout");
        }
        int i2 = this.f1214e;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f1215f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1216g) {
            sb.append(" retainInstance");
        }
        if (this.f1217h) {
            sb.append(" removing");
        }
        if (this.f1218i) {
            sb.append(" detached");
        }
        if (this.f1220k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1210a);
        parcel.writeString(this.f1211b);
        parcel.writeInt(this.f1212c ? 1 : 0);
        parcel.writeInt(this.f1213d);
        parcel.writeInt(this.f1214e);
        parcel.writeString(this.f1215f);
        parcel.writeInt(this.f1216g ? 1 : 0);
        parcel.writeInt(this.f1217h ? 1 : 0);
        parcel.writeInt(this.f1218i ? 1 : 0);
        parcel.writeBundle(this.f1219j);
        parcel.writeInt(this.f1220k ? 1 : 0);
        parcel.writeBundle(this.f1222m);
        parcel.writeInt(this.f1221l);
    }

    public L(Parcel parcel) {
        this.f1210a = parcel.readString();
        this.f1211b = parcel.readString();
        this.f1212c = parcel.readInt() != 0;
        this.f1213d = parcel.readInt();
        this.f1214e = parcel.readInt();
        this.f1215f = parcel.readString();
        this.f1216g = parcel.readInt() != 0;
        this.f1217h = parcel.readInt() != 0;
        this.f1218i = parcel.readInt() != 0;
        this.f1219j = parcel.readBundle();
        this.f1220k = parcel.readInt() != 0;
        this.f1222m = parcel.readBundle();
        this.f1221l = parcel.readInt();
    }
}
