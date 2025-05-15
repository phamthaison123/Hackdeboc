package androidx.emoji2.text;

import g.C0107g;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B.a f1104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1105d;

    public k(B.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1104c = aVar;
        this.f1105d = threadPoolExecutor;
    }

    @Override // B.a
    public final void Q(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1105d;
        try {
            this.f1104c.Q(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // B.a
    public final void W(C0107g c0107g) {
        ThreadPoolExecutor threadPoolExecutor = this.f1105d;
        try {
            this.f1104c.W(c0107g);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
