package e;

import F.InterfaceC0015p;
import F.O;
import F.X;
import F.f0;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import h.InterfaceC0114A;
import i.InterfaceC0140d0;
import i.InterfaceC0152j0;
import java.util.WeakHashMap;
import y.C0238b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class m implements InterfaceC0015p, InterfaceC0152j0, InterfaceC0140d0, InterfaceC0114A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f2127b;

    public /* synthetic */ m(v vVar, int i2) {
        this.f2126a = i2;
        this.f2127b = vVar;
    }

    @Override // h.InterfaceC0114A
    public final void b(h.o oVar, boolean z2) {
        u uVar;
        int i2 = this.f2126a;
        v vVar = this.f2127b;
        switch (i2) {
            case 3:
                vVar.m(oVar);
                break;
            default:
                h.o k2 = oVar.k();
                int i3 = 0;
                boolean z3 = k2 != oVar;
                if (z3) {
                    oVar = k2;
                }
                u[] uVarArr = vVar.f2166F;
                int length = uVarArr != null ? uVarArr.length : 0;
                while (true) {
                    if (i3 >= length) {
                        uVar = null;
                    } else {
                        uVar = uVarArr[i3];
                        if (uVar == null || uVar.f2148h != oVar) {
                            i3++;
                        }
                    }
                }
                if (uVar != null) {
                    if (!z3) {
                        vVar.n(uVar, z2);
                        break;
                    } else {
                        vVar.l(uVar.f2141a, uVar, k2);
                        vVar.n(uVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // h.InterfaceC0114A
    public final boolean j(h.o oVar) {
        Window.Callback callback;
        int i2 = this.f2126a;
        v vVar = this.f2127b;
        switch (i2) {
            case 3:
                Window.Callback callback2 = vVar.f2188e.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, oVar);
                    break;
                }
                break;
            default:
                if (oVar == oVar.k() && vVar.f2209z && (callback = vVar.f2188e.getCallback()) != null && !vVar.f2171K) {
                    callback.onMenuOpened(108, oVar);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // F.InterfaceC0015p
    public final f0 o(View view, f0 f0Var) {
        int d2 = f0Var.d();
        int C2 = this.f2127b.C(f0Var, null);
        if (d2 != C2) {
            int b2 = f0Var.b();
            int c2 = f0Var.c();
            int a2 = f0Var.a();
            X x2 = new X(f0Var);
            x2.d(C0238b.a(b2, C2, c2, a2));
            f0Var = x2.b();
        }
        WeakHashMap weakHashMap = O.f58a;
        WindowInsets e2 = f0Var.e();
        if (e2 == null) {
            return f0Var;
        }
        WindowInsets b3 = F.C.b(view, e2);
        return !b3.equals(e2) ? f0.f(b3, view) : f0Var;
    }
}
