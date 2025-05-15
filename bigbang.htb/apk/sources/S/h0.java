package S;

import F.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h0 extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f398d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f399e;

    public h0(RecyclerView recyclerView) {
        this.f398d = recyclerView;
        g0 g0Var = this.f399e;
        if (g0Var != null) {
            this.f399e = g0Var;
        } else {
            this.f399e = new g0(this);
        }
    }

    @Override // F.C0001b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f398d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O(accessibilityEvent);
        }
    }

    @Override // F.C0001b
    public final void d(View view, G.d dVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f80a;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f129a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f398d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        P layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f283b;
        X x2 = recyclerView2.f1550b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f283b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f283b.canScrollVertically(1) || layoutManager.f283b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        c0 c0Var = recyclerView2.f1553c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.F(x2, c0Var), layoutManager.x(x2, c0Var), false, 0));
    }

    @Override // F.C0001b
    public final boolean g(View view, int i2, Bundle bundle) {
        int C2;
        int A2;
        if (super.g(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f398d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        P layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f283b;
        X x2 = recyclerView2.f1550b;
        if (i2 == 4096) {
            C2 = recyclerView2.canScrollVertically(1) ? (layoutManager.f296o - layoutManager.C()) - layoutManager.z() : 0;
            if (layoutManager.f283b.canScrollHorizontally(1)) {
                A2 = (layoutManager.f295n - layoutManager.A()) - layoutManager.B();
            }
            A2 = 0;
        } else if (i2 != 8192) {
            C2 = 0;
            A2 = 0;
        } else {
            C2 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f296o - layoutManager.C()) - layoutManager.z()) : 0;
            if (layoutManager.f283b.canScrollHorizontally(-1)) {
                A2 = -((layoutManager.f295n - layoutManager.A()) - layoutManager.B());
            }
            A2 = 0;
        }
        if (C2 == 0 && A2 == 0) {
            return false;
        }
        layoutManager.f283b.b0(A2, C2, true);
        return true;
    }
}
