package F;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: F.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0000a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0001b f77a;

    public C0000a(C0001b c0001b) {
        this.f77a = c0001b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f77a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        e.z b2 = this.f77a.b(view);
        if (b2 != null) {
            return (AccessibilityNodeProvider) b2.f2221b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f77a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        G.d dVar = new G.d(accessibilityNodeInfo);
        WeakHashMap weakHashMap = O.f58a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(I.d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(I.c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(I.b(view));
        accessibilityNodeInfo.setStateDescription(K.a(view));
        this.f77a.d(view, dVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(2131296631);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            dVar.b((G.b) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f77a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f77a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.f77a.g(view, i2, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i2) {
        this.f77a.h(view, i2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f77a.i(view, accessibilityEvent);
    }
}
