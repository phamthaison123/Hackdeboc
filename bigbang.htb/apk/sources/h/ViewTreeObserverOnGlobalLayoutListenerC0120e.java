package h;

import F.O;
import android.view.View;
import android.view.ViewTreeObserver;
import i.C0177w0;
import i.P;
import i.T;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0120e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2398b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0120e(int i2, Object obj) {
        this.f2397a = i2;
        this.f2398b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i2 = this.f2397a;
        Object obj = this.f2398b;
        switch (i2) {
            case 0:
                i iVar = (i) obj;
                if (iVar.a()) {
                    ArrayList arrayList = iVar.f2417i;
                    if (arrayList.size() > 0 && !((C0123h) arrayList.get(0)).f2406a.f2921x) {
                        View view = iVar.f2424p;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0123h) it.next()).f2406a.i();
                            }
                            break;
                        } else {
                            iVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                G g2 = (G) obj;
                if (g2.a()) {
                    C0177w0 c0177w0 = g2.f2362i;
                    if (!c0177w0.f2921x) {
                        View view2 = g2.f2367n;
                        if (view2 != null && view2.isShown()) {
                            c0177w0.i();
                            break;
                        } else {
                            g2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                T t2 = (T) obj;
                if (!t2.getInternalPopup().a()) {
                    t2.f2716f.e(t2.getTextDirection(), t2.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = t2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                P p2 = (P) obj;
                T t3 = p2.f2678D;
                WeakHashMap weakHashMap = O.f58a;
                if (!F.B.b(t3) || !t3.getGlobalVisibleRect(p2.f2676B)) {
                    p2.dismiss();
                    break;
                } else {
                    p2.s();
                    p2.i();
                    break;
                }
                break;
        }
    }
}
