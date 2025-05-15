package G;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e.z;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class e extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final z f132a;

    public e(z zVar) {
        this.f132a = zVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        d r2 = this.f132a.r(i2);
        if (r2 == null) {
            return null;
        }
        return r2.f129a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f132a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.f132a.t(i2, i3, bundle);
    }
}
