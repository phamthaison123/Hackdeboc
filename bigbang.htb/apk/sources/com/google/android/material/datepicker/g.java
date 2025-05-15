package com.google.android.material.datepicker;

import F.C0001b;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class g extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1800e;

    public /* synthetic */ g(int i2, Object obj) {
        this.f1799d = i2;
        this.f1800e = obj;
    }

    @Override // F.C0001b
    public final void d(View view, G.d dVar) {
        int i2 = this.f1799d;
        View.AccessibilityDelegate accessibilityDelegate = this.f80a;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f129a;
        switch (i2) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                l lVar = (l) this.f1800e;
                accessibilityNodeInfo.setHintText(lVar.f1819b0.getVisibility() == 0 ? lVar.B().getResources().getString(2131755132) : lVar.B().getResources().getString(2131755130));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
        }
    }
}
