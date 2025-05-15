package e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f2125b;

    public /* synthetic */ l(v vVar, int i2) {
        this.f2124a = i2;
        this.f2125b = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (F.B.c(r1) != false) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            int r1 = r6.f2124a
            r2 = 0
            e.v r3 = r6.f2125b
            switch(r1) {
                case 0: goto L54;
                default: goto L9;
            }
        L9:
            android.widget.PopupWindow r1 = r3.f2199p
            androidx.appcompat.widget.ActionBarContextView r4 = r3.f2198o
            r5 = 55
            r1.showAtLocation(r4, r5, r2, r2)
            F.T r1 = r3.f2201r
            if (r1 == 0) goto L19
            r1.b()
        L19:
            boolean r1 = r3.f2203t
            if (r1 == 0) goto L2a
            android.view.ViewGroup r1 = r3.f2204u
            if (r1 == 0) goto L2a
            java.util.WeakHashMap r4 = F.O.f58a
            boolean r1 = F.B.c(r1)
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r0 = r2
        L2b:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L49
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f2198o
            r4 = 0
            r0.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f2198o
            F.T r0 = F.O.a(r0)
            r0.a(r1)
            r3.f2201r = r0
            e.n r1 = new e.n
            r1.<init>(r2, r6)
            r0.d(r1)
            goto L53
        L49:
            androidx.appcompat.widget.ActionBarContextView r6 = r3.f2198o
            r6.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r6 = r3.f2198o
            r6.setVisibility(r2)
        L53:
            return
        L54:
            int r6 = r3.f2180T
            r6 = r6 & r0
            if (r6 == 0) goto L5c
            r3.q(r2)
        L5c:
            int r6 = r3.f2180T
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L67
            r6 = 108(0x6c, float:1.51E-43)
            r3.q(r6)
        L67:
            r3.f2179S = r2
            r3.f2180T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.l.run():void");
    }
}
