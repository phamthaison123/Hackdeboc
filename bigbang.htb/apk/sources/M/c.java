package M;

import java.nio.ByteBuffer;
import m0.e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f215a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f216b;

    /* renamed from: c, reason: collision with root package name */
    public int f217c;

    /* renamed from: d, reason: collision with root package name */
    public int f218d;

    public c() {
        if (e.f3070a == null) {
            e.f3070a = new e(7);
        }
    }

    public final int a(int i2) {
        if (i2 < this.f218d) {
            return this.f216b.getShort(this.f217c + i2);
        }
        return 0;
    }
}
