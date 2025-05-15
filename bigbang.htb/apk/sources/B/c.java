package B;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2a;

    /* renamed from: b, reason: collision with root package name */
    public b f3b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f2a) {
                    return;
                }
                this.f2a = true;
                this.f4c = true;
                b bVar = this.f3b;
                if (bVar != null) {
                    try {
                        bVar.d();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f4c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.f4c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(b bVar) {
        synchronized (this) {
            while (this.f4c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f3b == bVar) {
                return;
            }
            this.f3b = bVar;
            if (this.f2a) {
                bVar.d();
            }
        }
    }
}
