package androidx.emoji2.text;

import S.N;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1123a;

    /* renamed from: b, reason: collision with root package name */
    public final i.r f1124b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.e f1125c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1126d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1127e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f1128f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f1129g;

    /* renamed from: h, reason: collision with root package name */
    public B.a f1130h;

    /* renamed from: i, reason: collision with root package name */
    public J.a f1131i;

    public r(Context context, i.r rVar) {
        m0.e eVar = s.f1132d;
        this.f1126d = new Object();
        B.a.o(context, "Context cannot be null");
        this.f1123a = context.getApplicationContext();
        this.f1124b = rVar;
        this.f1125c = eVar;
    }

    @Override // androidx.emoji2.text.h
    public final void a(B.a aVar) {
        synchronized (this.f1126d) {
            this.f1130h = aVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f1126d) {
            try {
                this.f1130h = null;
                J.a aVar = this.f1131i;
                if (aVar != null) {
                    m0.e eVar = this.f1125c;
                    Context context = this.f1123a;
                    eVar.getClass();
                    context.getContentResolver().unregisterContentObserver(aVar);
                    this.f1131i = null;
                }
                Handler handler = this.f1127e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1127e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1129g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1128f = null;
                this.f1129g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f1126d) {
            try {
                if (this.f1130h == null) {
                    return;
                }
                if (this.f1128f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1129g = threadPoolExecutor;
                    this.f1128f = threadPoolExecutor;
                }
                this.f1128f.execute(new q(0, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C.g d() {
        try {
            m0.e eVar = this.f1125c;
            Context context = this.f1123a;
            i.r rVar = this.f1124b;
            eVar.getClass();
            N a2 = C.b.a(context, rVar);
            int i2 = a2.f276a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            C.g[] gVarArr = (C.g[]) a2.f277b;
            if (gVarArr == null || gVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return gVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }
}
