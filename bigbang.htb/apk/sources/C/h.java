package C;

import android.os.Process;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f28a;

    public h(Runnable runnable, String str, int i2) {
        super(runnable, str);
        this.f28a = i2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f28a);
        super.run();
    }
}
