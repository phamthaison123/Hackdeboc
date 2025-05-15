package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f1158a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1159b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f1160c;

    public G(H h2, int i2) {
        this.f1160c = h2;
        this.f1158a = i2;
    }

    @Override // androidx.fragment.app.F
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        H h2 = this.f1160c;
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = h2.f1188s;
        int i2 = this.f1158a;
        if (abstractComponentCallbacksC0075p == null || i2 >= 0 || !abstractComponentCallbacksC0075p.g().K()) {
            return h2.L(arrayList, arrayList2, i2, this.f1159b);
        }
        return false;
    }
}
