package G;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f128a;

    public c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f128a = collectionItemInfo;
    }

    public static c a(int i2, int i3, int i4, int i5, boolean z2) {
        return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, false, z2));
    }
}
