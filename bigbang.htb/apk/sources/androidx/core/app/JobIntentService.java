package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import u.AsyncTaskC0228f;
import u.JobServiceEngineC0230h;

@Deprecated
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public JobServiceEngineC0230h f1030a;

    /* renamed from: b, reason: collision with root package name */
    public AsyncTaskC0228f f1031b;

    static {
        new HashMap();
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobServiceEngineC0230h jobServiceEngineC0230h = this.f1030a;
        if (jobServiceEngineC0230h != null) {
            return jobServiceEngineC0230h.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f1030a = new JobServiceEngineC0230h(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        return 2;
    }
}
