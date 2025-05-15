package I;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f134a;

    /* renamed from: b, reason: collision with root package name */
    public int f135b;

    /* renamed from: c, reason: collision with root package name */
    public float f136c;

    /* renamed from: d, reason: collision with root package name */
    public float f137d;

    /* renamed from: e, reason: collision with root package name */
    public long f138e;

    /* renamed from: f, reason: collision with root package name */
    public long f139f;

    /* renamed from: g, reason: collision with root package name */
    public long f140g;

    /* renamed from: h, reason: collision with root package name */
    public float f141h;

    /* renamed from: i, reason: collision with root package name */
    public int f142i;

    public final float a(long j2) {
        if (j2 < this.f138e) {
            return 0.0f;
        }
        long j3 = this.f140g;
        if (j3 < 0 || j2 < j3) {
            return c.b((j2 - r0) / this.f134a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f141h;
        return (c.b((j2 - j3) / this.f142i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
