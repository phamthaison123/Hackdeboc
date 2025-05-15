package e;

import F.O;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import g.InterfaceC0102b;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f2042d;

    public C(E e2, int i2) {
        this.f2041c = i2;
        this.f2042d = e2;
    }

    @Override // F.U
    public final void c() {
        View view;
        int i2 = this.f2041c;
        E e2 = this.f2042d;
        switch (i2) {
            case 0:
                if (e2.f2064q && (view = e2.f2056i) != null) {
                    view.setTranslationY(0.0f);
                    e2.f2053f.setTranslationY(0.0f);
                }
                e2.f2053f.setVisibility(8);
                e2.f2053f.setTransitioning(false);
                e2.f2068u = null;
                InterfaceC0102b interfaceC0102b = e2.f2060m;
                if (interfaceC0102b != null) {
                    interfaceC0102b.b(e2.f2059l);
                    e2.f2059l = null;
                    e2.f2060m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = e2.f2052e;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = O.f58a;
                    F.C.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                e2.f2068u = null;
                e2.f2053f.requestLayout();
                break;
        }
    }
}
