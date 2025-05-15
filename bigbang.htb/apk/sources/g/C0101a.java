package g;

import android.content.Context;
import android.content.res.Configuration;
import g.C0101a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0101a implements androidx.emoji2.text.h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2277a;

    public C0101a(Context context, int i2) {
        if (i2 != 1) {
            this.f2277a = context;
        } else {
            this.f2277a = context.getApplicationContext();
        }
    }

    @Override // androidx.emoji2.text.h
    public final void a(final B.a aVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.j
            @Override // java.lang.Runnable
            public final void run() {
                C0101a c0101a = C0101a.this;
                B.a aVar2 = aVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                c0101a.getClass();
                try {
                    s v2 = B.a.v(c0101a.f2277a);
                    if (v2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) v2.f1088a;
                    synchronized (rVar.f1126d) {
                        rVar.f1128f = threadPoolExecutor2;
                    }
                    v2.f1088a.a(new k(aVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    aVar2.Q(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    public final int b() {
        Configuration configuration = this.f2277a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }
}
