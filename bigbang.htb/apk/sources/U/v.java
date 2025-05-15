package U;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import g.C0107g;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class v extends q {

    /* renamed from: z, reason: collision with root package name */
    public int f662z;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f660x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f661y = true;

    /* renamed from: A, reason: collision with root package name */
    public boolean f658A = false;

    /* renamed from: B, reason: collision with root package name */
    public int f659B = 0;

    @Override // U.q
    public final void A(B.a aVar) {
        this.f650s = aVar;
        this.f659B |= 8;
        int size = this.f660x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((q) this.f660x.get(i2)).A(aVar);
        }
    }

    @Override // U.q
    public final void B(TimeInterpolator timeInterpolator) {
        this.f659B |= 1;
        ArrayList arrayList = this.f660x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((q) this.f660x.get(i2)).B(timeInterpolator);
            }
        }
        this.f635d = timeInterpolator;
    }

    @Override // U.q
    public final void C(m0.e eVar) {
        super.C(eVar);
        this.f659B |= 4;
        if (this.f660x != null) {
            for (int i2 = 0; i2 < this.f660x.size(); i2++) {
                ((q) this.f660x.get(i2)).C(eVar);
            }
        }
    }

    @Override // U.q
    public final void D() {
        this.f659B |= 2;
        int size = this.f660x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((q) this.f660x.get(i2)).D();
        }
    }

    @Override // U.q
    public final void E(long j2) {
        this.f633b = j2;
    }

    @Override // U.q
    public final String G(String str) {
        String G2 = super.G(str);
        for (int i2 = 0; i2 < this.f660x.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G2);
            sb.append("\n");
            sb.append(((q) this.f660x.get(i2)).G(str + "  "));
            G2 = sb.toString();
        }
        return G2;
    }

    public final void H(q qVar) {
        this.f660x.add(qVar);
        qVar.f640i = this;
        long j2 = this.f634c;
        if (j2 >= 0) {
            qVar.z(j2);
        }
        if ((this.f659B & 1) != 0) {
            qVar.B(this.f635d);
        }
        if ((this.f659B & 2) != 0) {
            qVar.D();
        }
        if ((this.f659B & 4) != 0) {
            qVar.C(this.f651t);
        }
        if ((this.f659B & 8) != 0) {
            qVar.A(this.f650s);
        }
    }

    @Override // U.q
    public final void a(p pVar) {
        super.a(pVar);
    }

    @Override // U.q
    public final void b(View view) {
        for (int i2 = 0; i2 < this.f660x.size(); i2++) {
            ((q) this.f660x.get(i2)).b(view);
        }
        this.f637f.add(view);
    }

    @Override // U.q
    public final void d(w wVar) {
        if (s(wVar.f664b)) {
            Iterator it = this.f660x.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (qVar.s(wVar.f664b)) {
                    qVar.d(wVar);
                    wVar.f665c.add(qVar);
                }
            }
        }
    }

    @Override // U.q
    public final void f(w wVar) {
        int size = this.f660x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((q) this.f660x.get(i2)).f(wVar);
        }
    }

    @Override // U.q
    public final void g(w wVar) {
        if (s(wVar.f664b)) {
            Iterator it = this.f660x.iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (qVar.s(wVar.f664b)) {
                    qVar.g(wVar);
                    wVar.f665c.add(qVar);
                }
            }
        }
    }

    @Override // U.q
    /* renamed from: j */
    public final q clone() {
        v vVar = (v) super.clone();
        vVar.f660x = new ArrayList();
        int size = this.f660x.size();
        for (int i2 = 0; i2 < size; i2++) {
            q clone = ((q) this.f660x.get(i2)).clone();
            vVar.f660x.add(clone);
            clone.f640i = vVar;
        }
        return vVar;
    }

    @Override // U.q
    public final void l(ViewGroup viewGroup, C0107g c0107g, C0107g c0107g2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f633b;
        int size = this.f660x.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = (q) this.f660x.get(i2);
            if (j2 > 0 && (this.f661y || i2 == 0)) {
                long j3 = qVar.f633b;
                if (j3 > 0) {
                    qVar.E(j3 + j2);
                } else {
                    qVar.E(j2);
                }
            }
            qVar.l(viewGroup, c0107g, c0107g2, arrayList, arrayList2);
        }
    }

    @Override // U.q
    public final void u(View view) {
        super.u(view);
        int size = this.f660x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((q) this.f660x.get(i2)).u(view);
        }
    }

    @Override // U.q
    public final void v(p pVar) {
        super.v(pVar);
    }

    @Override // U.q
    public final void w(View view) {
        for (int i2 = 0; i2 < this.f660x.size(); i2++) {
            ((q) this.f660x.get(i2)).w(view);
        }
        this.f637f.remove(view);
    }

    @Override // U.q
    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.f660x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((q) this.f660x.get(i2)).x(viewGroup);
        }
    }

    @Override // U.q
    public final void y() {
        if (this.f660x.isEmpty()) {
            F();
            m();
            return;
        }
        u uVar = new u();
        uVar.f657a = this;
        Iterator it = this.f660x.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(uVar);
        }
        this.f662z = this.f660x.size();
        if (this.f661y) {
            Iterator it2 = this.f660x.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).y();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f660x.size(); i2++) {
            ((q) this.f660x.get(i2 - 1)).a(new C0057h(2, this, (q) this.f660x.get(i2)));
        }
        q qVar = (q) this.f660x.get(0);
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override // U.q
    public final void z(long j2) {
        ArrayList arrayList;
        this.f634c = j2;
        if (j2 < 0 || (arrayList = this.f660x) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((q) this.f660x.get(i2)).z(j2);
        }
    }
}
