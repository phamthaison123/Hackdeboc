package m0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j extends B.a {
    @Override // B.a
    public final void y(float f2, float f3, v vVar) {
        vVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        r rVar = new r(0.0f, 0.0f, f4, f4);
        rVar.f3165f = 180.0f;
        rVar.f3166g = 90.0f;
        vVar.f3177g.add(rVar);
        p pVar = new p(rVar);
        vVar.a(180.0f);
        vVar.f3178h.add(pVar);
        vVar.f3175e = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        vVar.f3173c = (((float) Math.cos(Math.toRadians(d2))) * f6) + f5;
        vVar.f3174d = (f6 * ((float) Math.sin(Math.toRadians(d2)))) + f5;
    }
}
