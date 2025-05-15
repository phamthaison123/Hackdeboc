package h;

import S.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import e.C0099e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k implements InterfaceC0115B, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2437a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2438b;

    /* renamed from: c, reason: collision with root package name */
    public o f2439c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f2440d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0114A f2441e;

    /* renamed from: f, reason: collision with root package name */
    public j f2442f;

    public k(Context context) {
        this.f2437a = context;
        this.f2438b = LayoutInflater.from(context);
    }

    @Override // h.InterfaceC0115B
    public final void b(o oVar, boolean z2) {
        InterfaceC0114A interfaceC0114A = this.f2441e;
        if (interfaceC0114A != null) {
            interfaceC0114A.b(oVar, z2);
        }
    }

    @Override // h.InterfaceC0115B
    public final void c() {
        j jVar = this.f2442f;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // h.InterfaceC0115B
    public final boolean d(q qVar) {
        return false;
    }

    @Override // h.InterfaceC0115B
    public final void e(InterfaceC0114A interfaceC0114A) {
        this.f2441e = interfaceC0114A;
    }

    @Override // h.InterfaceC0115B
    public final void g(Context context, o oVar) {
        if (this.f2437a != null) {
            this.f2437a = context;
            if (this.f2438b == null) {
                this.f2438b = LayoutInflater.from(context);
            }
        }
        this.f2439c = oVar;
        j jVar = this.f2442f;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // h.InterfaceC0115B
    public final boolean h() {
        return false;
    }

    @Override // h.InterfaceC0115B
    public final boolean j(H h2) {
        if (!h2.hasVisibleItems()) {
            return false;
        }
        p pVar = new p();
        pVar.f2474a = h2;
        Context context = h2.f2450a;
        N n2 = new N(context);
        Object obj = n2.f277b;
        C0099e c0099e = (C0099e) obj;
        k kVar = new k(c0099e.f2084a);
        pVar.f2476c = kVar;
        kVar.f2441e = pVar;
        h2.b(kVar, context);
        k kVar2 = pVar.f2476c;
        if (kVar2.f2442f == null) {
            kVar2.f2442f = new j(kVar2);
        }
        c0099e.f2090g = kVar2.f2442f;
        c0099e.f2091h = pVar;
        View view = h2.f2464o;
        if (view != null) {
            c0099e.f2088e = view;
        } else {
            c0099e.f2086c = h2.f2463n;
            ((C0099e) obj).f2087d = h2.f2462m;
        }
        c0099e.f2089f = pVar;
        e.i a2 = n2.a();
        pVar.f2475b = a2;
        a2.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f2475b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f2475b.show();
        InterfaceC0114A interfaceC0114A = this.f2441e;
        if (interfaceC0114A == null) {
            return true;
        }
        interfaceC0114A.j(h2);
        return true;
    }

    @Override // h.InterfaceC0115B
    public final boolean k(q qVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f2439c.q(this.f2442f.getItem(i2), this, 0);
    }
}
