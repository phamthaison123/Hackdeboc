package L;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f193v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f195b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f197d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f198e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f199f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f200g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f201h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f202i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f203j;

    /* renamed from: k, reason: collision with root package name */
    public int f204k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f205l;

    /* renamed from: m, reason: collision with root package name */
    public final float f206m;

    /* renamed from: n, reason: collision with root package name */
    public final float f207n;

    /* renamed from: o, reason: collision with root package name */
    public final int f208o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f209p;

    /* renamed from: q, reason: collision with root package name */
    public final B.a f210q;

    /* renamed from: r, reason: collision with root package name */
    public View f211r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f212s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f213t;

    /* renamed from: c, reason: collision with root package name */
    public int f196c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.activity.b f214u = new androidx.activity.b(6, this);

    public e(Context context, ViewGroup viewGroup, B.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f213t = viewGroup;
        this.f210q = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f208o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f195b = viewConfiguration.getScaledTouchSlop();
        this.f206m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f207n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f209p = new OverScroller(context, f193v);
    }

    public final void a() {
        this.f196c = -1;
        float[] fArr = this.f197d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f198e, 0.0f);
            Arrays.fill(this.f199f, 0.0f);
            Arrays.fill(this.f200g, 0.0f);
            Arrays.fill(this.f201h, 0);
            Arrays.fill(this.f202i, 0);
            Arrays.fill(this.f203j, 0);
            this.f204k = 0;
        }
        VelocityTracker velocityTracker = this.f205l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f205l = null;
        }
    }

    public final void b(View view, int i2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f213t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f211r = view;
        this.f196c = i2;
        this.f210q.Y(view, i2);
        n(1);
    }

    public final boolean c(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        B.a aVar = this.f210q;
        boolean z2 = aVar.F(view) > 0;
        boolean z3 = aVar.G() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f195b) : z3 && Math.abs(f3) > ((float) this.f195b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i2 = this.f195b;
        return f4 > ((float) (i2 * i2));
    }

    public final void d(int i2) {
        float[] fArr = this.f197d;
        if (fArr != null) {
            int i3 = this.f204k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f198e[i2] = 0.0f;
                this.f199f[i2] = 0.0f;
                this.f200g[i2] = 0.0f;
                this.f201h[i2] = 0;
                this.f202i[i2] = 0;
                this.f203j[i2] = 0;
                this.f204k = (~i4) & i3;
            }
        }
    }

    public final int e(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f213t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r9 = this;
            int r0 = r9.f194a
            r1 = 2
            if (r0 != r1) goto L5b
            android.widget.OverScroller r0 = r9.f209p
            boolean r2 = r0.computeScrollOffset()
            int r3 = r0.getCurrX()
            int r4 = r0.getCurrY()
            android.view.View r5 = r9.f211r
            int r5 = r5.getLeft()
            int r5 = r3 - r5
            android.view.View r6 = r9.f211r
            int r6 = r6.getTop()
            int r6 = r4 - r6
            if (r5 == 0) goto L2c
            android.view.View r7 = r9.f211r
            java.util.WeakHashMap r8 = F.O.f58a
            r7.offsetLeftAndRight(r5)
        L2c:
            if (r6 == 0) goto L35
            android.view.View r7 = r9.f211r
            java.util.WeakHashMap r8 = F.O.f58a
            r7.offsetTopAndBottom(r6)
        L35:
            if (r5 != 0) goto L39
            if (r6 == 0) goto L40
        L39:
            B.a r5 = r9.f210q
            android.view.View r6 = r9.f211r
            r5.a0(r6, r3, r4)
        L40:
            if (r2 == 0) goto L52
            int r5 = r0.getFinalX()
            if (r3 != r5) goto L52
            int r3 = r0.getFinalY()
            if (r4 != r3) goto L52
            r0.abortAnimation()
            goto L54
        L52:
            if (r2 != 0) goto L5b
        L54:
            androidx.activity.b r0 = r9.f214u
            android.view.ViewGroup r2 = r9.f213t
            r2.post(r0)
        L5b:
            int r9 = r9.f194a
            if (r9 != r1) goto L61
            r9 = 1
            goto L62
        L61:
            r9 = 0
        L62:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L.e.f():boolean");
    }

    public final View g(int i2, int i3) {
        ViewGroup viewGroup = this.f213t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f210q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f211r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f211r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f209p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.n(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f211r
            float r0 = r10.f207n
            int r0 = (int) r0
            float r6 = r10.f206m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3d
        L3b:
            r14 = r11
            goto L45
        L3d:
            if (r7 <= r6) goto L45
            if (r14 <= 0) goto L43
            r14 = r6
            goto L45
        L43:
            int r11 = -r6
            goto L3b
        L45:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5f
            float r11 = (float) r6
            float r6 = (float) r8
        L5d:
            float r11 = r11 / r6
            goto L62
        L5f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L5d
        L62:
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
        L66:
            float r0 = r0 / r6
            goto L6b
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L66
        L6b:
            B.a r6 = r10.f210q
            int r12 = r6.F(r12)
            int r12 = r10.e(r4, r13, r12)
            int r13 = r6.G()
            int r13 = r10.e(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.n(r11)
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: L.e.h(int, int, int, int):boolean");
    }

    public final boolean i(int i2) {
        if ((this.f204k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r9.f196c == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.e.j(android.view.MotionEvent):void");
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f205l;
        float f2 = this.f206m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f205l.getXVelocity(this.f196c);
        float f3 = this.f207n;
        float abs = Math.abs(xVelocity);
        float f4 = 0.0f;
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f205l.getYVelocity(this.f196c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f3) {
            if (abs2 > f2) {
                if (yVelocity <= 0.0f) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f212s = true;
        this.f210q.b0(this.f211r, xVelocity, f4);
        this.f212s = false;
        if (this.f194a == 1) {
            n(0);
        }
    }

    public final void l(float f2, float f3, int i2) {
        float[] fArr = this.f197d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f198e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f199f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f200g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f201h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f202i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f203j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f197d = fArr2;
            this.f198e = fArr3;
            this.f199f = fArr4;
            this.f200g = fArr5;
            this.f201h = iArr;
            this.f202i = iArr2;
            this.f203j = iArr3;
        }
        float[] fArr9 = this.f197d;
        this.f199f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f198e;
        this.f200g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f201h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        ViewGroup viewGroup = this.f213t;
        int left = viewGroup.getLeft();
        int i6 = this.f208o;
        int i7 = i4 < left + i6 ? 1 : 0;
        if (i5 < viewGroup.getTop() + i6) {
            i7 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i7 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i7 |= 8;
        }
        iArr7[i2] = i7;
        this.f204k |= 1 << i2;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f199f[pointerId] = x2;
                this.f200g[pointerId] = y2;
            }
        }
    }

    public final void n(int i2) {
        this.f213t.removeCallbacks(this.f214u);
        if (this.f194a != i2) {
            this.f194a = i2;
            this.f210q.Z(i2);
            if (this.f194a == 0) {
                this.f211r = null;
            }
        }
    }

    public final boolean o(int i2, int i3) {
        if (this.f212s) {
            return h(i2, i3, (int) this.f205l.getXVelocity(this.f196c), (int) this.f205l.getYVelocity(this.f196c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i2) {
        if (view == this.f211r && this.f196c == i2) {
            return true;
        }
        if (view == null || !this.f210q.j0(view, i2)) {
            return false;
        }
        this.f196c = i2;
        b(view, i2);
        return true;
    }
}
