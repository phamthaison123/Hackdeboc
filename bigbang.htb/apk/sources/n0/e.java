package n0;

import F.Q;
import android.os.Handler;
import android.os.Message;
import g.C0107g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0107g f3252a;

    public e(C0107g c0107g) {
        this.f3252a = c0107g;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0107g c0107g = this.f3252a;
        Q.i(message.obj);
        synchronized (c0107g.f2292a) {
            Q.i(c0107g.f2294c);
            throw null;
        }
    }
}
