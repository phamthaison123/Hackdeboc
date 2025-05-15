package h;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ViewOnAttachStateChangeListenerC0121f implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f2400b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0121f(x xVar, int i2) {
        this.f2399a = i2;
        this.f2400b = xVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i2 = this.f2399a;
        x xVar = this.f2400b;
        switch (i2) {
            case 0:
                i iVar = (i) xVar;
                ViewTreeObserver viewTreeObserver = iVar.f2433y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.f2433y = view.getViewTreeObserver();
                    }
                    iVar.f2433y.removeGlobalOnLayoutListener(iVar.f2418j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                G g2 = (G) xVar;
                ViewTreeObserver viewTreeObserver2 = g2.f2369p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        g2.f2369p = view.getViewTreeObserver();
                    }
                    g2.f2369p.removeGlobalOnLayoutListener(g2.f2363j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
