package S;

/* renamed from: S.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0025a {

    /* renamed from: a, reason: collision with root package name */
    public int f316a;

    /* renamed from: b, reason: collision with root package name */
    public int f317b;

    /* renamed from: c, reason: collision with root package name */
    public Object f318c;

    /* renamed from: d, reason: collision with root package name */
    public int f319d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0025a.class != obj.getClass()) {
            return false;
        }
        C0025a c0025a = (C0025a) obj;
        int i2 = this.f316a;
        if (i2 != c0025a.f316a) {
            return false;
        }
        if (i2 == 8 && Math.abs(this.f319d - this.f317b) == 1 && this.f319d == c0025a.f317b && this.f317b == c0025a.f319d) {
            return true;
        }
        if (this.f319d != c0025a.f319d || this.f317b != c0025a.f317b) {
            return false;
        }
        Object obj2 = this.f318c;
        if (obj2 != null) {
            if (!obj2.equals(c0025a.f318c)) {
                return false;
            }
        } else if (c0025a.f318c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f316a * 31) + this.f317b) * 31) + this.f319d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i2 = this.f316a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f317b);
        sb.append("c:");
        sb.append(this.f319d);
        sb.append(",p:");
        sb.append(this.f318c);
        sb.append("]");
        return sb.toString();
    }
}
