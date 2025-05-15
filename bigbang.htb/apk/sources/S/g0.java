package S;

import F.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class g0 extends C0001b {

    /* renamed from: d, reason: collision with root package name */
    public final h0 f391d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f392e = new WeakHashMap();

    public g0(h0 h0Var) {
        this.f391d = h0Var;
    }

    @Override // F.C0001b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f392e.get(view);
        return c0001b != null ? c0001b.a(view, accessibilityEvent) : this.f80a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // F.C0001b
    public final e.z b(View view) {
        C0001b c0001b = (C0001b) this.f392e.get(view);
        return c0001b != null ? c0001b.b(view) : super.b(view);
    }

    @Override // F.C0001b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f392e.get(view);
        if (c0001b != null) {
            c0001b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // F.C0001b
    public final void d(View view, G.d dVar) {
        h0 h0Var = this.f391d;
        boolean K2 = h0Var.f398d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f80a;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f129a;
        if (!K2) {
            RecyclerView recyclerView = h0Var.f398d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Q(view, dVar);
                C0001b c0001b = (C0001b) this.f392e.get(view);
                if (c0001b != null) {
                    c0001b.d(view, dVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // F.C0001b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f392e.get(view);
        if (c0001b != null) {
            c0001b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // F.C0001b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f392e.get(viewGroup);
        return c0001b != null ? c0001b.f(viewGroup, view, accessibilityEvent) : this.f80a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // F.C0001b
    public final boolean g(View view, int i2, Bundle bundle) {
        h0 h0Var = this.f391d;
        if (!h0Var.f398d.K()) {
            RecyclerView recyclerView = h0Var.f398d;
            if (recyclerView.getLayoutManager() != null) {
                C0001b c0001b = (C0001b) this.f392e.get(view);
                if (c0001b != null) {
                    if (c0001b.g(view, i2, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i2, bundle)) {
                    return true;
                }
                X x2 = recyclerView.getLayoutManager().f283b.f1550b;
                return false;
            }
        }
        return super.g(view, i2, bundle);
    }

    @Override // F.C0001b
    public final void h(View view, int i2) {
        C0001b c0001b = (C0001b) this.f392e.get(view);
        if (c0001b != null) {
            c0001b.h(view, i2);
        } else {
            super.h(view, i2);
        }
    }

    @Override // F.C0001b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0001b c0001b = (C0001b) this.f392e.get(view);
        if (c0001b != null) {
            c0001b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
