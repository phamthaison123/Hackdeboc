package p;

import F.Q;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class f implements InterfaceC0211d {

    /* renamed from: d, reason: collision with root package name */
    public final m f3460d;

    /* renamed from: f, reason: collision with root package name */
    public int f3462f;

    /* renamed from: g, reason: collision with root package name */
    public int f3463g;

    /* renamed from: a, reason: collision with root package name */
    public m f3457a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3458b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3459c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3461e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f3464h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f3465i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3466j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3467k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3468l = new ArrayList();

    public f(m mVar) {
        this.f3460d = mVar;
    }

    @Override // p.InterfaceC0211d
    public final void a(InterfaceC0211d interfaceC0211d) {
        ArrayList arrayList = this.f3468l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f3466j) {
                return;
            }
        }
        this.f3459c = true;
        m mVar = this.f3457a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f3458b) {
            this.f3460d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i2 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f3466j) {
            g gVar = this.f3465i;
            if (gVar != null) {
                if (!gVar.f3466j) {
                    return;
                } else {
                    this.f3462f = this.f3464h * gVar.f3463g;
                }
            }
            d(fVar.f3463g + this.f3462f);
        }
        m mVar2 = this.f3457a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(InterfaceC0211d interfaceC0211d) {
        this.f3467k.add(interfaceC0211d);
        if (this.f3466j) {
            interfaceC0211d.a(interfaceC0211d);
        }
    }

    public final void c() {
        this.f3468l.clear();
        this.f3467k.clear();
        this.f3466j = false;
        this.f3463g = 0;
        this.f3459c = false;
        this.f3458b = false;
    }

    public void d(int i2) {
        if (this.f3466j) {
            return;
        }
        this.f3466j = true;
        this.f3463g = i2;
        Iterator it = this.f3467k.iterator();
        while (it.hasNext()) {
            InterfaceC0211d interfaceC0211d = (InterfaceC0211d) it.next();
            interfaceC0211d.a(interfaceC0211d);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3460d.f3476b.f3302W);
        sb.append(":");
        sb.append(Q.m(this.f3461e));
        sb.append("(");
        sb.append(this.f3466j ? Integer.valueOf(this.f3463g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3468l.size());
        sb.append(":d=");
        sb.append(this.f3467k.size());
        sb.append(">");
        return sb.toString();
    }
}
