package a0;

import F.AbstractC0024z;
import F.O;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public int f734c;

    /* renamed from: d, reason: collision with root package name */
    public int f735d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f736e;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f736e = swipeDismissBehavior;
    }

    @Override // B.a
    public final int F(View view) {
        return view.getWidth();
    }

    @Override // B.a
    public final void Y(View view, int i2) {
        this.f735d = i2;
        this.f734c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // B.a
    public final void Z(int i2) {
        this.f736e.getClass();
    }

    @Override // B.a
    public final void a0(View view, int i2, int i3) {
        float f2 = this.f734c;
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f736e;
        float f3 = (width * swipeDismissBehavior.f1676e) + f2;
        float width2 = (view.getWidth() * swipeDismissBehavior.f1677f) + this.f734c;
        float f4 = i2;
        if (f4 <= f3) {
            view.setAlpha(1.0f);
        } else if (f4 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f4 - f3) / (width2 - f3))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f734c) >= java.lang.Math.round(r9.getWidth() * r3.f1675d)) goto L27;
     */
    @Override // B.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f735d = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f736e
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = F.O.f58a
            int r5 = F.AbstractC0024z.d(r9)
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f1674c
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5e
            goto L52
        L2a:
            if (r1 <= 0) goto L5e
            goto L52
        L2d:
            if (r6 != r2) goto L5e
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L5e
            goto L52
        L34:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5e
            goto L52
        L39:
            int r10 = r9.getLeft()
            int r0 = r8.f734c
            int r10 = r10 - r0
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r1 = r3.f1675d
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r10 = java.lang.Math.abs(r10)
            if (r10 < r0) goto L5e
        L52:
            int r10 = r9.getLeft()
            int r8 = r8.f734c
            if (r10 >= r8) goto L5c
            int r8 = r8 - r11
            goto L61
        L5c:
            int r8 = r8 + r11
            goto L61
        L5e:
            int r8 = r8.f734c
            r2 = r4
        L61:
            L.e r10 = r3.f1672a
            int r11 = r9.getTop()
            boolean r8 = r10.o(r8, r11)
            if (r8 == 0) goto L77
            a0.b r8 = new a0.b
            r8.<init>(r3, r9, r2)
            java.util.WeakHashMap r10 = F.O.f58a
            F.AbstractC0023y.m(r9, r8)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.b0(android.view.View, float, float):void");
    }

    @Override // B.a
    public final boolean j0(View view, int i2) {
        int i3 = this.f735d;
        return (i3 == -1 || i3 == i2) && this.f736e.r(view);
    }

    @Override // B.a
    public final int q(View view, int i2) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = O.f58a;
        boolean z2 = AbstractC0024z.d(view) == 1;
        int i3 = this.f736e.f1674c;
        if (i3 == 0) {
            if (z2) {
                width = this.f734c - view.getWidth();
                width2 = this.f734c;
            } else {
                width = this.f734c;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 != 1) {
            width = this.f734c - view.getWidth();
            width2 = this.f734c + view.getWidth();
        } else if (z2) {
            width = this.f734c;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f734c - view.getWidth();
            width2 = this.f734c;
        }
        return Math.min(Math.max(width, i2), width2);
    }

    @Override // B.a
    public final int r(View view, int i2) {
        return view.getTop();
    }
}
