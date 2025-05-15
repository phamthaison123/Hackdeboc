package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k extends AbstractC0089e {
    @Override // androidx.lifecycle.AbstractC0089e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        A.b(activity);
    }

    @Override // androidx.lifecycle.AbstractC0089e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // androidx.lifecycle.AbstractC0089e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
