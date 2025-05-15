package m0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class o extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Matrix f3155c;

    public o(ArrayList arrayList, Matrix matrix) {
        this.f3154b = arrayList;
        this.f3155c = matrix;
    }

    @Override // m0.u
    public final void a(Matrix matrix, l0.a aVar, int i2, Canvas canvas) {
        Iterator it = this.f3154b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(this.f3155c, aVar, i2, canvas);
        }
    }
}
