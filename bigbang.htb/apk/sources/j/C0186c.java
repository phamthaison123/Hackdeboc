package j;

import android.os.Looper;
import java.util.concurrent.Executors;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0186c extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final Object f2968c;

    public C0186c() {
        Executors.newFixedThreadPool(4, new ThreadFactoryC0185b());
    }

    public final boolean k0() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
