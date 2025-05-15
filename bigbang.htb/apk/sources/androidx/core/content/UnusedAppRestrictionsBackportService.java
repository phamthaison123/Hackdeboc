package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import w.g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final g f1042a = new g(this);

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1042a;
    }
}
