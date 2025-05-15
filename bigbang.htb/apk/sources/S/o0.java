package S;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f461a;

    /* renamed from: b, reason: collision with root package name */
    public int f462b;

    /* renamed from: c, reason: collision with root package name */
    public int f463c;

    /* renamed from: d, reason: collision with root package name */
    public int f464d;

    /* renamed from: e, reason: collision with root package name */
    public int f465e;

    public final boolean a() {
        int i2 = this.f461a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f464d;
            int i5 = this.f462b;
            if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f464d;
            int i7 = this.f463c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f465e;
            int i9 = this.f462b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f465e;
            int i11 = this.f463c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if (((i3 << 12) & i2) == 0) {
                return false;
            }
        }
        return true;
    }
}
