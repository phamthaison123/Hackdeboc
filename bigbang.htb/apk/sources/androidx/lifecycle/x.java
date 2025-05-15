package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class x extends AbstractC0089e {
    final /* synthetic */ y this$0;

    public x(y yVar) {
        this.this$0 = yVar;
    }

    @Override // androidx.lifecycle.AbstractC0089e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // androidx.lifecycle.AbstractC0089e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        y yVar = this.this$0;
        int i2 = yVar.f1496b - 1;
        yVar.f1496b = i2;
        if (i2 == 0) {
            yVar.f1499e.postDelayed(yVar.f1501g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new w(this));
    }

    @Override // androidx.lifecycle.AbstractC0089e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        y yVar = this.this$0;
        int i2 = yVar.f1495a - 1;
        yVar.f1495a = i2;
        if (i2 == 0 && yVar.f1497c) {
            yVar.f1500f.g(i.ON_STOP);
            yVar.f1498d = true;
        }
    }
}
