package m0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public float f3171a;

    /* renamed from: b, reason: collision with root package name */
    public float f3172b;

    /* renamed from: c, reason: collision with root package name */
    public float f3173c;

    /* renamed from: d, reason: collision with root package name */
    public float f3174d;

    /* renamed from: e, reason: collision with root package name */
    public float f3175e;

    /* renamed from: f, reason: collision with root package name */
    public float f3176f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3177g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3178h = new ArrayList();

    public v() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.f3175e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f3173c;
        float f6 = this.f3174d;
        r rVar = new r(f5, f6, f5, f6);
        rVar.f3165f = this.f3175e;
        rVar.f3166g = f4;
        this.f3178h.add(new p(rVar));
        this.f3175e = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f3177g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((t) arrayList.get(i2)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        s sVar = new s();
        sVar.f3167b = f2;
        sVar.f3168c = f3;
        this.f3177g.add(sVar);
        q qVar = new q(sVar, this.f3173c, this.f3174d);
        float b2 = qVar.b() + 270.0f;
        float b3 = qVar.b() + 270.0f;
        a(b2);
        this.f3178h.add(qVar);
        this.f3175e = b3;
        this.f3173c = f2;
        this.f3174d = f3;
    }

    public final void d(float f2, float f3, float f4) {
        this.f3171a = 0.0f;
        this.f3172b = f2;
        this.f3173c = 0.0f;
        this.f3174d = f2;
        this.f3175e = f3;
        this.f3176f = (f3 + f4) % 360.0f;
        this.f3177g.clear();
        this.f3178h.clear();
    }
}
