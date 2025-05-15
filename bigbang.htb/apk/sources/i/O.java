package i;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import h.ViewTreeObserverOnGlobalLayoutListenerC0120e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class O implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f2669b;

    public O(P p2, ViewTreeObserverOnGlobalLayoutListenerC0120e viewTreeObserverOnGlobalLayoutListenerC0120e) {
        this.f2669b = p2;
        this.f2668a = viewTreeObserverOnGlobalLayoutListenerC0120e;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2669b.f2678D.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2668a);
        }
    }
}
