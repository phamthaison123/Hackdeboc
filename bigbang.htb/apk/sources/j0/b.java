package j0;

import android.graphics.Typeface;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B.a f2972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f2973d;

    public b(d dVar, B.a aVar) {
        this.f2973d = dVar;
        this.f2972c = aVar;
    }

    @Override // B.a
    public final void S(int i2) {
        this.f2973d.f2989m = true;
        this.f2972c.S(i2);
    }

    @Override // B.a
    public final void T(Typeface typeface) {
        d dVar = this.f2973d;
        dVar.f2990n = Typeface.create(typeface, dVar.f2979c);
        dVar.f2989m = true;
        this.f2972c.U(dVar.f2990n, false);
    }
}
