package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1445a = new HashMap();

    public final void a() {
        for (C c2 : this.f1445a.values()) {
            HashMap hashMap = c2.f1443a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : c2.f1443a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            c2.a();
        }
        this.f1445a.clear();
    }
}
