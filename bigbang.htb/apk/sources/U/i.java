package U;

import S.C0038n;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i extends q {

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f611y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x, reason: collision with root package name */
    public int f612x;

    public i(int i2) {
        this.f612x = i2;
    }

    public static void H(w wVar) {
        int visibility = wVar.f664b.getVisibility();
        HashMap hashMap = wVar.f663a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = wVar.f664b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static U.F J(U.w r8, U.w r9) {
        /*
            U.F r0 = new U.F
            r0.<init>()
            r1 = 0
            r0.f584a = r1
            r0.f585b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f663a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f586c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f588e = r6
            goto L33
        L2f:
            r0.f586c = r3
            r0.f588e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f663a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f587d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f589f = r2
            goto L56
        L52:
            r0.f587d = r3
            r0.f589f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f586c
            int r9 = r0.f587d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f588e
            android.view.ViewGroup r4 = r0.f589f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f585b = r1
            r0.f584a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f585b = r2
            r0.f584a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f589f
            if (r8 != 0) goto L81
            r0.f585b = r1
            r0.f584a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f588e
            if (r8 != 0) goto L9f
            r0.f585b = r2
            r0.f584a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f587d
            if (r8 != 0) goto L95
            r0.f585b = r2
            r0.f584a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f586c
            if (r8 != 0) goto L9f
            r0.f585b = r1
            r0.f584a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U.i.J(U.w, U.w):U.F");
    }

    public final ObjectAnimator I(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        C0052c c0052c = x.f666a;
        view.setTransitionAlpha(f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, x.f666a, f3);
        ofFloat.addListener(new C0038n(view));
        a(new C0057h(0, this, view));
        return ofFloat;
    }

    @Override // U.q
    public final void d(w wVar) {
        H(wVar);
    }

    @Override // U.q
    public final void g(w wVar) {
        H(wVar);
        HashMap hashMap = wVar.f663a;
        C0052c c0052c = x.f666a;
        hashMap.put("android:fade:transitionAlpha", Float.valueOf(wVar.f664b.getTransitionAlpha()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (J(n(r3, false), q(r3, false)).f584a != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    @Override // U.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r22, U.w r23, U.w r24) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.i.k(android.view.ViewGroup, U.w, U.w):android.animation.Animator");
    }

    @Override // U.q
    public final /* bridge */ /* synthetic */ String[] p() {
        return f611y;
    }

    @Override // U.q
    public final boolean r(w wVar, w wVar2) {
        if (wVar == null && wVar2 == null) {
            return false;
        }
        if (wVar != null && wVar2 != null && wVar2.f663a.containsKey("android:visibility:visibility") != wVar.f663a.containsKey("android:visibility:visibility")) {
            return false;
        }
        F J2 = J(wVar, wVar2);
        if (J2.f584a) {
            return J2.f586c == 0 || J2.f587d == 0;
        }
        return false;
    }
}
