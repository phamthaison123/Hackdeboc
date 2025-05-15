package Z;

import F.Q;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class b extends c {

    /* renamed from: c, reason: collision with root package name */
    public boolean f721c;

    /* renamed from: d, reason: collision with root package name */
    public int f722d;

    /* renamed from: e, reason: collision with root package name */
    public int f723e;

    /* renamed from: f, reason: collision with root package name */
    public int f724f;

    /* renamed from: g, reason: collision with root package name */
    public VelocityTracker f725g;

    @Override // s.AbstractC0214a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f724f < 0) {
            this.f724f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f721c) {
            int i2 = this.f722d;
            if (i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y2 - this.f723e) > this.f724f) {
                this.f723e = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f725g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f722d = -1;
        motionEvent.getX();
        motionEvent.getY();
        Q.g(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    @Override // s.AbstractC0214a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == r2) goto L41
            r5 = 2
            if (r0 == r5) goto L2d
            r7 = 3
            if (r0 == r7) goto L45
            r7 = 6
            if (r0 == r7) goto L14
            goto L52
        L14:
            int r7 = r8.getActionIndex()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r4
        L1c:
            int r7 = r8.getPointerId(r2)
            r6.f722d = r7
            float r7 = r8.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r7 = (int) r7
            r6.f723e = r7
            goto L52
        L2d:
            int r0 = r6.f722d
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r4
        L36:
            float r8 = r8.getY(r0)
            int r8 = (int) r8
            r6.f723e = r8
            F.Q.i(r7)
            throw r3
        L41:
            android.view.VelocityTracker r0 = r6.f725g
            if (r0 != 0) goto L5c
        L45:
            r6.f721c = r4
            r6.f722d = r1
            android.view.VelocityTracker r7 = r6.f725g
            if (r7 == 0) goto L52
            r7.recycle()
            r6.f725g = r3
        L52:
            android.view.VelocityTracker r7 = r6.f725g
            if (r7 == 0) goto L59
            r7.addMovement(r8)
        L59:
            boolean r6 = r6.f721c
            return r6
        L5c:
            r0.addMovement(r8)
            android.view.VelocityTracker r8 = r6.f725g
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r0)
            android.view.VelocityTracker r8 = r6.f725g
            int r6 = r6.f722d
            r8.getYVelocity(r6)
            F.Q.i(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.b.q(android.view.View, android.view.MotionEvent):boolean");
    }
}
