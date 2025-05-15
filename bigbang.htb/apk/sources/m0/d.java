package m0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d extends B.a {
    @Override // B.a
    public final void y(float f2, float f3, v vVar) {
        vVar.d(f3 * f2, 180.0f, 90.0f);
        double d2 = f3;
        double d3 = f2;
        vVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d2 * d3), (float) (Math.sin(Math.toRadians(0.0f)) * d2 * d3));
    }
}
