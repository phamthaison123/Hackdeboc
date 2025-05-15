package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ProcessLifecycleInitializer implements T.b {
    @Override // T.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // T.b
    public final Object b(Context context) {
        if (!l.f1467a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new k());
        }
        y yVar = y.f1494h;
        yVar.getClass();
        yVar.f1499e = new Handler();
        yVar.f1500f.g(i.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new x(yVar));
        return yVar;
    }
}
