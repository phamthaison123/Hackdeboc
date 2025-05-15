package j0;

import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f2974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B.a f2975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f2976e;

    public c(d dVar, TextPaint textPaint, B.a aVar) {
        this.f2976e = dVar;
        this.f2974c = textPaint;
        this.f2975d = aVar;
    }

    @Override // B.a
    public final void S(int i2) {
        this.f2975d.S(i2);
    }

    @Override // B.a
    public final void U(Typeface typeface, boolean z2) {
        this.f2976e.g(this.f2974c, typeface);
        this.f2975d.U(typeface, z2);
    }
}
