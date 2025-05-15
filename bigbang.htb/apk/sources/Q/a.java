package Q;

import F.Q;
import androidx.lifecycle.C;
import l.l;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends C {

    /* renamed from: b, reason: collision with root package name */
    public final l f250b = new l();

    @Override // androidx.lifecycle.C
    public final void a() {
        l lVar = this.f250b;
        int i2 = lVar.f3053c;
        if (i2 > 0) {
            Q.i(lVar.f3052b[0]);
            throw null;
        }
        Object[] objArr = lVar.f3052b;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        lVar.f3053c = 0;
    }
}
