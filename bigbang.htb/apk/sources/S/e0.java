package S;

import F.AbstractC0023y;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f354a;

    /* renamed from: b, reason: collision with root package name */
    public int f355b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f356c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f357d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f358e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f360g;

    public e0(RecyclerView recyclerView) {
        this.f360g = recyclerView;
        L.d dVar = RecyclerView.u0;
        this.f357d = dVar;
        this.f358e = false;
        this.f359f = false;
        this.f356c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f358e) {
            this.f359f = true;
            return;
        }
        RecyclerView recyclerView = this.f360g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = F.O.f58a;
        AbstractC0023y.m(recyclerView, this);
    }

    public final void b(int i2, int i3, int i4, Interpolator interpolator) {
        int i5;
        RecyclerView recyclerView = this.f360g;
        if (i4 == Integer.MIN_VALUE) {
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i3 * i3) + (i2 * i2));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = width;
            float f3 = i6;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            i4 = Math.min(i5, 2000);
        }
        int i7 = i4;
        if (interpolator == null) {
            interpolator = RecyclerView.u0;
        }
        if (this.f357d != interpolator) {
            this.f357d = interpolator;
            this.f356c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f355b = 0;
        this.f354a = 0;
        recyclerView.setScrollState(2);
        this.f356c.startScroll(0, 0, i2, i3, i7);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f360g;
        if (recyclerView.f1569l == null) {
            recyclerView.removeCallbacks(this);
            this.f356c.abortAnimation();
            return;
        }
        this.f359f = false;
        this.f358e = true;
        recyclerView.m();
        OverScroller overScroller = this.f356c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f354a;
            int i7 = currY - this.f355b;
            this.f354a = currX;
            this.f355b = currY;
            int[] iArr = recyclerView.f1576o0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r2 = recyclerView.r(i6, i7, iArr, null, 1);
            int[] iArr2 = recyclerView.f1576o0;
            if (r2) {
                i6 -= iArr2[0];
                i7 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i6, i7);
            }
            if (recyclerView.f1568k != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(i6, i7, iArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[1];
                int i10 = i6 - i8;
                int i11 = i7 - i9;
                C0049z c0049z = recyclerView.f1569l.f286e;
                if (c0049z != null && !c0049z.f556d && c0049z.f557e) {
                    int b2 = recyclerView.f1553c0.b();
                    if (b2 == 0) {
                        c0049z.g();
                    } else if (c0049z.f553a >= b2) {
                        c0049z.f553a = b2 - 1;
                        c0049z.e(i8, i9);
                    } else {
                        c0049z.e(i8, i9);
                    }
                }
                i5 = i8;
                i2 = i10;
                i3 = i11;
                i4 = i9;
            } else {
                i2 = i6;
                i3 = i7;
                i4 = 0;
                i5 = 0;
            }
            if (!recyclerView.f1571m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1576o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i12 = i4;
            recyclerView.s(i5, i4, i2, i3, null, 1, iArr3);
            int i13 = i2 - iArr2[0];
            int i14 = i3 - iArr2[1];
            if (i5 != 0 || i12 != 0) {
                recyclerView.t(i5, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
            C0049z c0049z2 = recyclerView.f1569l.f286e;
            if ((c0049z2 == null || !c0049z2.f556d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i15 = i13 < 0 ? -currVelocity : i13 > 0 ? currVelocity : 0;
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i15 < 0) {
                        recyclerView.v();
                        if (recyclerView.f1528D.isFinished()) {
                            recyclerView.f1528D.onAbsorb(-i15);
                        }
                    } else if (i15 > 0) {
                        recyclerView.w();
                        if (recyclerView.f1530F.isFinished()) {
                            recyclerView.f1530F.onAbsorb(i15);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f1529E.isFinished()) {
                            recyclerView.f1529E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f1531G.isFinished()) {
                            recyclerView.f1531G.onAbsorb(currVelocity);
                        }
                    }
                    if (i15 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = F.O.f58a;
                        AbstractC0023y.k(recyclerView);
                    }
                }
                C0041q c0041q = recyclerView.f1551b0;
                int[] iArr4 = c0041q.f498c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0041q.f499d = 0;
            } else {
                a();
                RunnableC0042s runnableC0042s = recyclerView.f1549a0;
                if (runnableC0042s != null) {
                    runnableC0042s.a(recyclerView, i5, i12);
                }
            }
        }
        C0049z c0049z3 = recyclerView.f1569l.f286e;
        if (c0049z3 != null && c0049z3.f556d) {
            c0049z3.e(0, 0);
        }
        this.f358e = false;
        if (!this.f359f) {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = F.O.f58a;
            AbstractC0023y.m(recyclerView, this);
        }
    }
}
