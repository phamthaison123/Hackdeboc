package androidx.lifecycle;

import android.app.Activity;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class w extends AbstractC0089e {
    final /* synthetic */ x this$1;

    public w(x xVar) {
        this.this$1 = xVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.this$1.this$0.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        y yVar = this.this$1.this$0;
        int i2 = yVar.f1495a + 1;
        yVar.f1495a = i2;
        if (i2 == 1 && yVar.f1498d) {
            yVar.f1500f.g(i.ON_START);
            yVar.f1498d = false;
        }
    }
}
