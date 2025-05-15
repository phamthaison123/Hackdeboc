package F;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: F.l, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0011l {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f97a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f98b;

    /* renamed from: c, reason: collision with root package name */
    public final View f99c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f100d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f101e;

    public C0011l(View view) {
        this.f99c = view;
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent f4;
        if (!this.f100d || (f4 = f(0)) == null) {
            return false;
        }
        try {
            return f4.onNestedFling(this.f99c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + f4 + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent f4;
        if (!this.f100d || (f4 = f(0)) == null) {
            return false;
        }
        try {
            return f4.onNestedPreFling(this.f99c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + f4 + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public final boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent f2;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f100d || (f2 = f(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f99c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            int i7 = iArr2[0];
            i6 = iArr2[1];
            i5 = i7;
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f101e == null) {
                this.f101e = new int[2];
            }
            iArr3 = this.f101e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z2 = f2 instanceof InterfaceC0012m;
        View view2 = this.f99c;
        if (z2) {
            ((InterfaceC0012m) f2).e(view2, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                f2.onNestedPreScroll(view2, i2, i3, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i2, int i3, int i4, int[] iArr) {
        e(0, i2, 0, i3, null, i4, iArr);
    }

    public final boolean e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent f2;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f100d || (f2 = f(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f99c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f101e == null) {
                this.f101e = new int[2];
            }
            int[] iArr4 = this.f101e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z2 = f2 instanceof InterfaceC0013n;
        View view2 = this.f99c;
        if (z2) {
            ((InterfaceC0013n) f2).b(view2, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (f2 instanceof InterfaceC0012m) {
                ((InterfaceC0012m) f2).c(view2, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    f2.onNestedScroll(view2, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent f(int i2) {
        if (i2 == 0) {
            return this.f97a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f98b;
    }

    public final boolean g(int i2) {
        return f(i2) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.g(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.f100d
            if (r0 == 0) goto L7c
            android.view.View r0 = r8.f99c
            android.view.ViewParent r2 = r0.getParent()
            r3 = r0
        L13:
            if (r2 == 0) goto L7c
            boolean r4 = r2 instanceof F.InterfaceC0012m
            java.lang.String r5 = "ViewParentCompat"
            java.lang.String r6 = "ViewParent "
            if (r4 == 0) goto L25
            r7 = r2
            F.m r7 = (F.InterfaceC0012m) r7
            boolean r7 = r7.f(r3, r0, r9, r10)
            goto L2b
        L25:
            if (r10 != 0) goto L70
            boolean r7 = r2.onStartNestedScroll(r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L5b
        L2b:
            if (r7 == 0) goto L70
            if (r10 == 0) goto L35
            if (r10 == r1) goto L32
            goto L37
        L32:
            r8.f98b = r2
            goto L37
        L35:
            r8.f97a = r2
        L37:
            if (r4 == 0) goto L3f
            F.m r2 = (F.InterfaceC0012m) r2
            r2.a(r3, r0, r9, r10)
            goto L5a
        L3f:
            if (r10 != 0) goto L5a
            r2.onNestedScrollAccepted(r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L45
            goto L5a
        L45:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r2)
            java.lang.String r10 = " does not implement interface method onNestedScrollAccepted"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r5, r9, r8)
        L5a:
            return r1
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r2)
            java.lang.String r6 = " does not implement interface method onStartNestedScroll"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r5, r6, r4)
        L70:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L77
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L77:
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L7c:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: F.C0011l.h(int, int):boolean");
    }

    public final void i(int i2) {
        ViewParent f2 = f(i2);
        if (f2 != null) {
            boolean z2 = f2 instanceof InterfaceC0012m;
            View view = this.f99c;
            if (z2) {
                ((InterfaceC0012m) f2).d(view, i2);
            } else if (i2 == 0) {
                try {
                    f2.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f97a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f98b = null;
            }
        }
    }
}
