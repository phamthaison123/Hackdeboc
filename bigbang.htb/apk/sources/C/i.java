package C;

import java.util.concurrent.ThreadFactory;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f29a;

    /* renamed from: b, reason: collision with root package name */
    public int f30b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new h(runnable, this.f29a, this.f30b);
    }
}
