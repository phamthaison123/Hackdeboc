package s;

import java.util.Comparator;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0220g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3709a;

    public /* synthetic */ C0220g(int i2) {
        this.f3709a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r5 != false) goto L15;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r5 = r5.f3709a
            r0 = -1
            r1 = 1
            r2 = 0
            switch(r5) {
                case 0: goto L5a;
                case 1: goto L3c;
                default: goto L8;
            }
        L8:
            S.r r6 = (S.r) r6
            S.r r7 = (S.r) r7
            androidx.recyclerview.widget.RecyclerView r5 = r6.f507d
            if (r5 != 0) goto L12
            r3 = r1
            goto L13
        L12:
            r3 = r2
        L13:
            androidx.recyclerview.widget.RecyclerView r4 = r7.f507d
            if (r4 != 0) goto L19
            r4 = r1
            goto L1a
        L19:
            r4 = r2
        L1a:
            if (r3 == r4) goto L21
            if (r5 != 0) goto L1f
        L1e:
            r0 = r1
        L1f:
            r2 = r0
            goto L3b
        L21:
            boolean r5 = r6.f504a
            boolean r3 = r7.f504a
            if (r5 == r3) goto L2a
            if (r5 == 0) goto L1e
            goto L1f
        L2a:
            int r5 = r7.f505b
            int r0 = r6.f505b
            int r5 = r5 - r0
            if (r5 == 0) goto L33
        L31:
            r2 = r5
            goto L3b
        L33:
            int r5 = r6.f506c
            int r6 = r7.f506c
            int r5 = r5 - r6
            if (r5 == 0) goto L3b
            goto L31
        L3b:
            return r2
        L3c:
            byte[] r6 = (byte[]) r6
            byte[] r7 = (byte[]) r7
            int r5 = r6.length
            int r0 = r7.length
            if (r5 == r0) goto L49
            int r5 = r6.length
            int r6 = r7.length
            int r2 = r5 - r6
            goto L59
        L49:
            r5 = r2
        L4a:
            int r0 = r6.length
            if (r5 >= r0) goto L59
            r0 = r6[r5]
            r1 = r7[r5]
            if (r0 == r1) goto L56
            int r2 = r0 - r1
            goto L59
        L56:
            int r5 = r5 + 1
            goto L4a
        L59:
            return r2
        L5a:
            android.view.View r6 = (android.view.View) r6
            android.view.View r7 = (android.view.View) r7
            java.util.WeakHashMap r5 = F.O.f58a
            float r5 = F.E.m(r6)
            float r6 = F.E.m(r7)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 <= 0) goto L6d
            goto L74
        L6d:
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L73
            r0 = r1
            goto L74
        L73:
            r0 = r2
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C0220g.compare(java.lang.Object, java.lang.Object):int");
    }
}
