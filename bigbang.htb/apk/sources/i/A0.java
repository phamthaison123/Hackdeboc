package i;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2607a;

    /* renamed from: b, reason: collision with root package name */
    public int f2608b;

    /* renamed from: c, reason: collision with root package name */
    public int f2609c;

    /* renamed from: d, reason: collision with root package name */
    public int f2610d;

    /* renamed from: e, reason: collision with root package name */
    public int f2611e;

    /* renamed from: f, reason: collision with root package name */
    public int f2612f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2613g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2614h;

    public final void a(int i2, int i3) {
        this.f2609c = i2;
        this.f2610d = i3;
        this.f2614h = true;
        if (this.f2613g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2607a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2608b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2607a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2608b = i3;
        }
    }
}
