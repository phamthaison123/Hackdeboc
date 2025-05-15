package U;

import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f617c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f621g;

    public l(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f621g = mVar;
        this.f615a = obj;
        this.f616b = arrayList;
        this.f617c = obj2;
        this.f618d = arrayList2;
        this.f619e = obj3;
        this.f620f = arrayList3;
    }

    @Override // U.p
    public final void c(q qVar) {
        qVar.v(this);
    }

    @Override // U.r, U.p
    public final void d() {
        m mVar = this.f621g;
        Object obj = this.f615a;
        if (obj != null) {
            mVar.u(obj, this.f616b, null);
        }
        Object obj2 = this.f617c;
        if (obj2 != null) {
            mVar.u(obj2, this.f618d, null);
        }
        Object obj3 = this.f619e;
        if (obj3 != null) {
            mVar.u(obj3, this.f620f, null);
        }
    }
}
