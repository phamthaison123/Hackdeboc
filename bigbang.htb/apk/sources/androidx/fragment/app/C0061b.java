package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0061b implements Parcelable {
    public static final Parcelable.Creator<C0061b> CREATOR = new androidx.activity.result.a(3);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1285a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1286b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1287c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1288d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1289e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1290f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1291g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1292h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f1293i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1294j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1295k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1296l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1297m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1298n;

    public C0061b(C0060a c0060a) {
        int size = c0060a.f1265a.size();
        this.f1285a = new int[size * 5];
        if (!c0060a.f1271g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1286b = new ArrayList(size);
        this.f1287c = new int[size];
        this.f1288d = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            O o2 = (O) c0060a.f1265a.get(i3);
            int i4 = i2 + 1;
            this.f1285a[i2] = o2.f1231a;
            ArrayList arrayList = this.f1286b;
            AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = o2.f1232b;
            arrayList.add(abstractComponentCallbacksC0075p != null ? abstractComponentCallbacksC0075p.f1391e : null);
            int[] iArr = this.f1285a;
            iArr[i4] = o2.f1233c;
            iArr[i2 + 2] = o2.f1234d;
            int i5 = i2 + 4;
            iArr[i2 + 3] = o2.f1235e;
            i2 += 5;
            iArr[i5] = o2.f1236f;
            this.f1287c[i3] = o2.f1237g.ordinal();
            this.f1288d[i3] = o2.f1238h.ordinal();
        }
        this.f1289e = c0060a.f1270f;
        this.f1290f = c0060a.f1272h;
        this.f1291g = c0060a.f1282r;
        this.f1292h = c0060a.f1273i;
        this.f1293i = c0060a.f1274j;
        this.f1294j = c0060a.f1275k;
        this.f1295k = c0060a.f1276l;
        this.f1296l = c0060a.f1277m;
        this.f1297m = c0060a.f1278n;
        this.f1298n = c0060a.f1279o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1285a);
        parcel.writeStringList(this.f1286b);
        parcel.writeIntArray(this.f1287c);
        parcel.writeIntArray(this.f1288d);
        parcel.writeInt(this.f1289e);
        parcel.writeString(this.f1290f);
        parcel.writeInt(this.f1291g);
        parcel.writeInt(this.f1292h);
        TextUtils.writeToParcel(this.f1293i, parcel, 0);
        parcel.writeInt(this.f1294j);
        TextUtils.writeToParcel(this.f1295k, parcel, 0);
        parcel.writeStringList(this.f1296l);
        parcel.writeStringList(this.f1297m);
        parcel.writeInt(this.f1298n ? 1 : 0);
    }

    public C0061b(Parcel parcel) {
        this.f1285a = parcel.createIntArray();
        this.f1286b = parcel.createStringArrayList();
        this.f1287c = parcel.createIntArray();
        this.f1288d = parcel.createIntArray();
        this.f1289e = parcel.readInt();
        this.f1290f = parcel.readString();
        this.f1291g = parcel.readInt();
        this.f1292h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1293i = (CharSequence) creator.createFromParcel(parcel);
        this.f1294j = parcel.readInt();
        this.f1295k = (CharSequence) creator.createFromParcel(parcel);
        this.f1296l = parcel.createStringArrayList();
        this.f1297m = parcel.createStringArrayList();
        this.f1298n = parcel.readInt() != 0;
    }
}
