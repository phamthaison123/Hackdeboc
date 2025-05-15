package j;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0184a extends B.a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0184a f2965d;

    /* renamed from: c, reason: collision with root package name */
    public C0186c f2966c;

    public static C0184a k0() {
        if (f2965d != null) {
            return f2965d;
        }
        synchronized (C0184a.class) {
            try {
                if (f2965d == null) {
                    C0184a c0184a = new C0184a();
                    c0184a.f2966c = new C0186c();
                    f2965d = c0184a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2965d;
    }
}
