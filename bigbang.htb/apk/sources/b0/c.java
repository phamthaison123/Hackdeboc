package b0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f1627c;

    public c(BottomSheetBehavior bottomSheetBehavior) {
        this.f1627c = bottomSheetBehavior;
    }

    @Override // B.a
    public final int G() {
        BottomSheetBehavior bottomSheetBehavior = this.f1627c;
        return bottomSheetBehavior.f1682D ? bottomSheetBehavior.f1692N : bottomSheetBehavior.f1680B;
    }

    @Override // B.a
    public final void Z(int i2) {
        if (i2 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f1627c;
            if (bottomSheetBehavior.f1684F) {
                bottomSheetBehavior.A(1);
            }
        }
    }

    @Override // B.a
    public final void a0(View view, int i2, int i3) {
        this.f1627c.u(i3);
    }

    @Override // B.a
    public final void b0(View view, float f2, float f3) {
        int i2;
        int i3 = 6;
        BottomSheetBehavior bottomSheetBehavior = this.f1627c;
        if (f3 < 0.0f) {
            if (bottomSheetBehavior.f1704b) {
                i2 = bottomSheetBehavior.f1727y;
            } else {
                int top = view.getTop();
                System.currentTimeMillis();
                int i4 = bottomSheetBehavior.f1728z;
                if (top > i4) {
                    i2 = i4;
                } else {
                    i2 = bottomSheetBehavior.x();
                }
            }
            i3 = 3;
        } else if (bottomSheetBehavior.f1682D && bottomSheetBehavior.D(view, f3)) {
            if (Math.abs(f2) >= Math.abs(f3) || f3 <= 500.0f) {
                if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1692N) / 2) {
                    if (bottomSheetBehavior.f1704b) {
                        i2 = bottomSheetBehavior.f1727y;
                    } else if (Math.abs(view.getTop() - bottomSheetBehavior.x()) < Math.abs(view.getTop() - bottomSheetBehavior.f1728z)) {
                        i2 = bottomSheetBehavior.x();
                    } else {
                        i2 = bottomSheetBehavior.f1728z;
                    }
                    i3 = 3;
                }
            }
            i2 = bottomSheetBehavior.f1692N;
            i3 = 5;
        } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.f1704b) {
                int i5 = bottomSheetBehavior.f1728z;
                if (top2 < i5) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.f1680B)) {
                        i2 = bottomSheetBehavior.x();
                        i3 = 3;
                    } else {
                        i2 = bottomSheetBehavior.f1728z;
                    }
                } else if (Math.abs(top2 - i5) < Math.abs(top2 - bottomSheetBehavior.f1680B)) {
                    i2 = bottomSheetBehavior.f1728z;
                } else {
                    i2 = bottomSheetBehavior.f1680B;
                    i3 = 4;
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.f1727y) < Math.abs(top2 - bottomSheetBehavior.f1680B)) {
                i2 = bottomSheetBehavior.f1727y;
                i3 = 3;
            } else {
                i2 = bottomSheetBehavior.f1680B;
                i3 = 4;
            }
        } else {
            if (bottomSheetBehavior.f1704b) {
                i2 = bottomSheetBehavior.f1680B;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.f1728z) < Math.abs(top3 - bottomSheetBehavior.f1680B)) {
                    i2 = bottomSheetBehavior.f1728z;
                } else {
                    i2 = bottomSheetBehavior.f1680B;
                }
            }
            i3 = 4;
        }
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.E(view, i3, i2, true);
    }

    @Override // B.a
    public final boolean j0(View view, int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.f1627c;
        int i3 = bottomSheetBehavior.f1685G;
        if (i3 == 1 || bottomSheetBehavior.f1699U) {
            return false;
        }
        if (i3 == 3 && bottomSheetBehavior.f1697S == i2) {
            WeakReference weakReference = bottomSheetBehavior.f1694P;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.f1693O;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // B.a
    public final int q(View view, int i2) {
        return view.getLeft();
    }

    @Override // B.a
    public final int r(View view, int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.f1627c;
        int x2 = bottomSheetBehavior.x();
        int i3 = bottomSheetBehavior.f1682D ? bottomSheetBehavior.f1692N : bottomSheetBehavior.f1680B;
        return i2 < x2 ? x2 : i2 > i3 ? i3 : i2;
    }
}
