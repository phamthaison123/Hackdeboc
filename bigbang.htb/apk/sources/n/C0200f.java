package n;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0200f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3211b;

    /* renamed from: c, reason: collision with root package name */
    public int f3212c;

    public C0200f(int i2, int i3) {
        this.f3210a = i3;
        if (i3 != 1) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f3211b = new Object[i2];
        } else {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f3211b = new Object[i2];
        }
    }

    public Object a() {
        int i2 = this.f3210a;
        Object[] objArr = this.f3211b;
        switch (i2) {
            case 0:
                int i3 = this.f3212c;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object obj = objArr[i4];
                objArr[i4] = null;
                this.f3212c = i4;
                return obj;
            default:
                int i5 = this.f3212c;
                if (i5 <= 0) {
                    return null;
                }
                int i6 = i5 - 1;
                Object obj2 = objArr[i6];
                objArr[i6] = null;
                this.f3212c = i6;
                return obj2;
        }
    }

    public boolean b(Object obj) {
        int i2 = this.f3210a;
        Object[] objArr = this.f3211b;
        switch (i2) {
            case 0:
                int i3 = this.f3212c;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.f3212c = i3 + 1;
                return true;
            default:
                int i4 = 0;
                while (true) {
                    int i5 = this.f3212c;
                    if (i4 >= i5) {
                        if (i5 >= objArr.length) {
                            return false;
                        }
                        objArr[i5] = obj;
                        this.f3212c = i5 + 1;
                        return true;
                    }
                    if (objArr[i4] == obj) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i4++;
                }
        }
    }
}
