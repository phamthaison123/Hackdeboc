package S;

import android.util.SparseArray;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f305a;

    /* renamed from: b, reason: collision with root package name */
    public int f306b;

    public final V a(int i2) {
        SparseArray sparseArray = this.f305a;
        V v2 = (V) sparseArray.get(i2);
        if (v2 != null) {
            return v2;
        }
        V v3 = new V();
        sparseArray.put(i2, v3);
        return v3;
    }
}
