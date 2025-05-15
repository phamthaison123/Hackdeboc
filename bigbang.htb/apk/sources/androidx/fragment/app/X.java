package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class X implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1261e;

    public X(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1257a = i2;
        this.f1258b = arrayList;
        this.f1259c = arrayList2;
        this.f1260d = arrayList3;
        this.f1261e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i2 = 0; i2 < this.f1257a; i2++) {
            View view = (View) this.f1258b.get(i2);
            String str = (String) this.f1259c.get(i2);
            WeakHashMap weakHashMap = F.O.f58a;
            F.E.v(view, str);
            F.E.v((View) this.f1260d.get(i2), (String) this.f1261e.get(i2));
        }
    }
}
