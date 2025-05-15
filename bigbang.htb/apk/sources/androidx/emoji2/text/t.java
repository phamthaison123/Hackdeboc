package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1133a;

    /* renamed from: b, reason: collision with root package name */
    public m f1134b;

    public t(int i2) {
        this.f1133a = new SparseArray(i2);
    }

    public final void a(m mVar, int i2, int i3) {
        int a2 = mVar.a(i2);
        SparseArray sparseArray = this.f1133a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(a2);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(mVar.a(i2), tVar);
        }
        if (i3 > i2) {
            tVar.a(mVar, i2 + 1, i3);
        } else {
            tVar.f1134b = mVar;
        }
    }
}
