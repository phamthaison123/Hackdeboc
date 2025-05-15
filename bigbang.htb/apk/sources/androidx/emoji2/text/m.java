package androidx.emoji2.text;

import g.C0107g;
import java.nio.ByteBuffer;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1106d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1107a;

    /* renamed from: b, reason: collision with root package name */
    public final C0107g f1108b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1109c = 0;

    public m(C0107g c0107g, int i2) {
        this.f1108b = c0107g;
        this.f1107a = i2;
    }

    public final int a(int i2) {
        M.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c2.f216b;
        int i3 = a2 + c2.f215a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final int b() {
        M.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i2 = a2 + c2.f215a;
        return c2.f216b.getInt(c2.f216b.getInt(i2) + i2);
    }

    public final M.a c() {
        ThreadLocal threadLocal = f1106d;
        M.a aVar = (M.a) threadLocal.get();
        if (aVar == null) {
            aVar = new M.a();
            threadLocal.set(aVar);
        }
        M.b bVar = (M.b) this.f1108b.f2292a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i2 = a2 + bVar.f215a;
            int i3 = (this.f1107a * 4) + bVar.f216b.getInt(i2) + i2 + 4;
            int i4 = bVar.f216b.getInt(i3) + i3;
            ByteBuffer byteBuffer = bVar.f216b;
            aVar.f216b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f215a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                aVar.f217c = i5;
                aVar.f218d = aVar.f216b.getShort(i5);
            } else {
                aVar.f215a = 0;
                aVar.f217c = 0;
                aVar.f218d = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        M.a c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? c2.f216b.getInt(a2 + c2.f215a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
