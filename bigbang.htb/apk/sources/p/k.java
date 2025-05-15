package p;

import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public m f3471a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3472b;

    public static long a(f fVar, long j2) {
        m mVar = fVar.f3460d;
        if (mVar instanceof i) {
            return j2;
        }
        ArrayList arrayList = fVar.f3467k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0211d interfaceC0211d = (InterfaceC0211d) arrayList.get(i2);
            if (interfaceC0211d instanceof f) {
                f fVar2 = (f) interfaceC0211d;
                if (fVar2.f3460d != mVar) {
                    j3 = Math.min(j3, a(fVar2, fVar2.f3462f + j2));
                }
            }
        }
        if (fVar != mVar.f3483i) {
            return j3;
        }
        long j4 = mVar.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(mVar.f3482h, j5)), j5 - r9.f3462f);
    }

    public static long b(f fVar, long j2) {
        m mVar = fVar.f3460d;
        if (mVar instanceof i) {
            return j2;
        }
        ArrayList arrayList = fVar.f3467k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0211d interfaceC0211d = (InterfaceC0211d) arrayList.get(i2);
            if (interfaceC0211d instanceof f) {
                f fVar2 = (f) interfaceC0211d;
                if (fVar2.f3460d != mVar) {
                    j3 = Math.max(j3, b(fVar2, fVar2.f3462f + j2));
                }
            }
        }
        if (fVar != mVar.f3482h) {
            return j3;
        }
        long j4 = mVar.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(mVar.f3483i, j5)), j5 - r9.f3462f);
    }
}
