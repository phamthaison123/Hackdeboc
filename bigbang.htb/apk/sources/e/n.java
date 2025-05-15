package e;

import F.O;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class n extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2129d;

    public n(int i2, Object obj) {
        this.f2128c = i2;
        this.f2129d = obj;
    }

    @Override // F.U
    public final void c() {
        int i2 = this.f2128c;
        Object obj = this.f2129d;
        switch (i2) {
            case 0:
                l lVar = (l) obj;
                lVar.f2125b.f2198o.setAlpha(1.0f);
                v vVar = lVar.f2125b;
                vVar.f2201r.d(null);
                vVar.f2201r = null;
                break;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f2198o.setAlpha(1.0f);
                vVar2.f2201r.d(null);
                vVar2.f2201r = null;
                break;
            default:
                o oVar = (o) obj;
                oVar.f2131b.f2198o.setVisibility(8);
                v vVar3 = oVar.f2131b;
                PopupWindow popupWindow = vVar3.f2199p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f2198o.getParent() instanceof View) {
                    View view = (View) vVar3.f2198o.getParent();
                    WeakHashMap weakHashMap = O.f58a;
                    F.C.c(view);
                }
                vVar3.f2198o.e();
                vVar3.f2201r.d(null);
                vVar3.f2201r = null;
                ViewGroup viewGroup = vVar3.f2204u;
                WeakHashMap weakHashMap2 = O.f58a;
                F.C.c(viewGroup);
                break;
        }
    }

    @Override // B.a, F.U
    public final void g() {
        int i2 = this.f2128c;
        Object obj = this.f2129d;
        switch (i2) {
            case 0:
                ((l) obj).f2125b.f2198o.setVisibility(0);
                break;
            case 1:
                v vVar = (v) obj;
                vVar.f2198o.setVisibility(0);
                if (vVar.f2198o.getParent() instanceof View) {
                    View view = (View) vVar.f2198o.getParent();
                    WeakHashMap weakHashMap = O.f58a;
                    F.C.c(view);
                    break;
                }
                break;
        }
    }
}
