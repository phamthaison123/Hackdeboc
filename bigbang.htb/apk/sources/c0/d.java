package c0;

import F.C0001b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1658e;

    public /* synthetic */ d(View view, int i2) {
        this.f1657d = i2;
        this.f1658e = view;
    }

    @Override // F.C0001b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1657d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1658e).f1857d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // F.C0001b
    public final void d(View view, G.d dVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f80a;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f129a;
        int i2 = this.f1657d;
        View view2 = this.f1658e;
        switch (i2) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i3 = MaterialButtonToggleGroup.f1744k;
                materialButtonToggleGroup.getClass();
                int i4 = -1;
                if (view instanceof MaterialButton) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i5) == view) {
                                i4 = i6;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.c(i5)) {
                                    i6++;
                                }
                                i5++;
                            }
                        }
                    }
                }
                dVar.f(G.c.a(0, 1, i4, 1, ((MaterialButton) view).f1741n));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f1858e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f1857d);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) view2).f1868x);
                break;
        }
    }
}
