package W;

import android.os.Parcel;
import android.util.SparseIntArray;
import l.C0190b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f670d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f671e;

    /* renamed from: f, reason: collision with root package name */
    public final int f672f;

    /* renamed from: g, reason: collision with root package name */
    public final int f673g;

    /* renamed from: h, reason: collision with root package name */
    public final String f674h;

    /* renamed from: i, reason: collision with root package name */
    public int f675i;

    /* renamed from: j, reason: collision with root package name */
    public int f676j;

    /* renamed from: k, reason: collision with root package name */
    public int f677k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0190b(), new C0190b(), new C0190b());
    }

    @Override // W.a
    public final b a() {
        Parcel parcel = this.f671e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f676j;
        if (i2 == this.f672f) {
            i2 = this.f673g;
        }
        return new b(parcel, dataPosition, i2, this.f674h + "  ", this.f667a, this.f668b, this.f669c);
    }

    @Override // W.a
    public final boolean e(int i2) {
        while (this.f676j < this.f673g) {
            int i3 = this.f677k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f676j;
            Parcel parcel = this.f671e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f677k = parcel.readInt();
            this.f676j += readInt;
        }
        return this.f677k == i2;
    }

    @Override // W.a
    public final void h(int i2) {
        int i3 = this.f675i;
        SparseIntArray sparseIntArray = this.f670d;
        Parcel parcel = this.f671e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f675i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, C0190b c0190b, C0190b c0190b2, C0190b c0190b3) {
        super(c0190b, c0190b2, c0190b3);
        this.f670d = new SparseIntArray();
        this.f675i = -1;
        this.f677k = -1;
        this.f671e = parcel;
        this.f672f = i2;
        this.f673g = i3;
        this.f676j = i2;
        this.f674h = str;
    }
}
