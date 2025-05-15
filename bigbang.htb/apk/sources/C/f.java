package C;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.k;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l.f f19a = new l.f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f20b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f22d;

    static {
        i iVar = new i();
        iVar.f29a = "fonts-androidx";
        iVar.f30b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), iVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20b = threadPoolExecutor;
        f21c = new Object();
        f22d = new k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C.e a(java.lang.String r7, android.content.Context r8, i.r r9, int r10) {
        /*
            l.f r0 = C.f.f19a
            java.lang.Object r1 = r0.a(r7)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            C.e r7 = new C.e
            r7.<init>(r1)
            return r7
        L10:
            S.N r9 = C.b.a(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r9.f277b
            int r9 = r9.f276a
            if (r9 == 0) goto L22
            if (r9 == r1) goto L20
        L1e:
            r1 = r2
            goto L3f
        L20:
            r1 = -2
            goto L3f
        L22:
            r9 = r3
            C.g[] r9 = (C.g[]) r9
            if (r9 == 0) goto L3f
            int r4 = r9.length
            if (r4 != 0) goto L2b
            goto L3f
        L2b:
            int r1 = r9.length
            r4 = 0
            r5 = r4
        L2e:
            if (r5 >= r1) goto L3e
            r6 = r9[r5]
            int r6 = r6.f27e
            if (r6 == 0) goto L3b
            if (r6 >= 0) goto L39
            goto L1e
        L39:
            r1 = r6
            goto L3f
        L3b:
            int r5 = r5 + 1
            goto L2e
        L3e:
            r1 = r4
        L3f:
            if (r1 == 0) goto L47
            C.e r7 = new C.e
            r7.<init>(r1)
            return r7
        L47:
            C.g[] r3 = (C.g[]) r3
            y.e r9 = y.d.f3782a
            android.graphics.Typeface r8 = r9.w(r8, r3, r10)
            if (r8 == 0) goto L5a
            r0.b(r7, r8)
            C.e r7 = new C.e
            r7.<init>(r8)
            return r7
        L5a:
            C.e r7 = new C.e
            r7.<init>(r2)
            return r7
        L60:
            C.e r7 = new C.e
            r8 = -1
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C.f.a(java.lang.String, android.content.Context, i.r, int):C.e");
    }
}
