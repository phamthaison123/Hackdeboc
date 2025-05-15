package G;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class f extends e {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        d s2 = this.f132a.s(i2);
        if (s2 == null) {
            return null;
        }
        return s2.f129a;
    }
}
