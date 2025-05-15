package j0;

import android.graphics.Typeface;
import e.z;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f2969c;

    /* renamed from: d, reason: collision with root package name */
    public final z f2970d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2971e;

    public a(z zVar, Typeface typeface) {
        this.f2969c = typeface;
        this.f2970d = zVar;
    }

    @Override // B.a
    public final void S(int i2) {
        if (this.f2971e) {
            return;
        }
        h0.b bVar = (h0.b) this.f2970d.f2221b;
        a aVar = bVar.f2568v;
        if (aVar != null) {
            aVar.f2971e = true;
        }
        Typeface typeface = bVar.f2565s;
        Typeface typeface2 = this.f2969c;
        if (typeface != typeface2) {
            bVar.f2565s = typeface2;
            bVar.g();
        }
    }

    @Override // B.a
    public final void U(Typeface typeface, boolean z2) {
        if (this.f2971e) {
            return;
        }
        h0.b bVar = (h0.b) this.f2970d.f2221b;
        a aVar = bVar.f2568v;
        if (aVar != null) {
            aVar.f2971e = true;
        }
        if (bVar.f2565s != typeface) {
            bVar.f2565s = typeface;
            bVar.g();
        }
    }
}
