package l;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3026a;

    /* renamed from: b, reason: collision with root package name */
    public int f3027b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3028c;

    /* renamed from: d, reason: collision with root package name */
    public int f3029d;

    /* renamed from: e, reason: collision with root package name */
    public int f3030e;

    public f(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3028c = i2;
        this.f3026a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f3026a.get(obj);
                if (obj2 != null) {
                    this.f3029d++;
                    return obj2;
                }
                this.f3030e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L87
            monitor-enter(r2)
            int r0 = r2.f3027b     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 1
            r2.f3027b = r0     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r0 = r2.f3026a     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1a
            int r4 = r2.f3027b     // Catch: java.lang.Throwable -> L18
            int r4 = r4 + (-1)
            r2.f3027b = r4     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L85
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            int r4 = r2.f3028c
        L1d:
            monitor-enter(r2)
            int r0 = r2.f3027b     // Catch: java.lang.Throwable -> L2f
            if (r0 < 0) goto L64
            java.util.LinkedHashMap r0 = r2.f3026a     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            int r0 = r2.f3027b     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L64
            goto L31
        L2f:
            r3 = move-exception
            goto L83
        L31:
            int r0 = r2.f3027b     // Catch: java.lang.Throwable -> L2f
            if (r0 <= r4) goto L62
            java.util.LinkedHashMap r0 = r2.f3026a     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L3e
            goto L62
        L3e:
            java.util.LinkedHashMap r0 = r2.f3026a     // Catch: java.lang.Throwable -> L2f
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L2f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L2f
            r0.getValue()     // Catch: java.lang.Throwable -> L2f
            java.util.LinkedHashMap r0 = r2.f3026a     // Catch: java.lang.Throwable -> L2f
            r0.remove(r1)     // Catch: java.lang.Throwable -> L2f
            int r0 = r2.f3027b     // Catch: java.lang.Throwable -> L2f
            int r0 = r0 + (-1)
            r2.f3027b = r0     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L1d
        L62:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return r3
        L64:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2f
            r4.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            throw r3     // Catch: java.lang.Throwable -> L2f
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r3
        L85:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3
        L87:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "key == null || value == null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i2;
        try {
            int i3 = this.f3029d;
            int i4 = this.f3030e + i3;
            i2 = i4 != 0 ? (i3 * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f3028c + ",hits=" + this.f3029d + ",misses=" + this.f3030e + ",hitRate=" + i2 + "%]";
    }
}
