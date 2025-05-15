package androidx.fragment.app;

import F.f0;
import android.animation.LayoutTransition;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0082x extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1434a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1435b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1436c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1437d;

    public final void a(View view) {
        ArrayList arrayList = this.f1435b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f1434a == null) {
            this.f1434a = new ArrayList();
        }
        this.f1434a.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(2131296432);
        if ((tag instanceof AbstractComponentCallbacksC0075p ? (AbstractComponentCallbacksC0075p) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        Object tag = view.getTag(2131296432);
        if ((tag instanceof AbstractComponentCallbacksC0075p ? (AbstractComponentCallbacksC0075p) tag : null) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z2);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        f0 f0Var;
        f0 f2 = f0.f(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1436c;
        if (onApplyWindowInsetsListener != null) {
            f0Var = f0.f(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null);
        } else {
            WeakHashMap weakHashMap = F.O.f58a;
            WindowInsets e2 = f2.e();
            if (e2 != null) {
                WindowInsets b2 = F.C.b(this, e2);
                if (!b2.equals(e2)) {
                    f2 = f0.f(b2, this);
                }
            }
            f0Var = f2;
        }
        if (!f0Var.f94a.j()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                WeakHashMap weakHashMap2 = F.O.f58a;
                WindowInsets e3 = f0Var.e();
                if (e3 != null) {
                    WindowInsets a2 = F.C.a(childAt, e3);
                    if (!a2.equals(e3)) {
                        f0.f(a2, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f1437d && this.f1434a != null) {
            for (int i2 = 0; i2 < this.f1434a.size(); i2++) {
                super.drawChild(canvas, (View) this.f1434a.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList arrayList;
        if (!this.f1437d || (arrayList = this.f1434a) == null || arrayList.size() <= 0 || !this.f1434a.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f1435b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f1434a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1437d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        if (z2) {
            a(view);
        }
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z2) {
        this.f1437d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1436c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1435b == null) {
                this.f1435b = new ArrayList();
            }
            this.f1435b.add(view);
        }
        super.startViewTransition(view);
    }
}
