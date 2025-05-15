package n;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0202h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public C0205k f3215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0203i f3216b;

    public C0202h(C0203i c0203i) {
        this.f3216b = c0203i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3215a.f3222b - ((C0205k) obj).f3222b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f3215a != null) {
            for (int i2 = 0; i2 < 9; i2++) {
                str = str + this.f3215a.f3228h[i2] + " ";
            }
        }
        return str + "] " + this.f3215a;
    }
}
