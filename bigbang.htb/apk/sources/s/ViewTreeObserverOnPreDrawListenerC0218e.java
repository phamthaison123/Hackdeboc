package s;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0218e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3707a;

    public ViewTreeObserverOnPreDrawListenerC0218e(CoordinatorLayout coordinatorLayout) {
        this.f3707a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f3707a.p(0);
        return true;
    }
}
