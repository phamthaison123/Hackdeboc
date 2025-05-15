package F;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0017s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f104a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f105b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f106c;

    public ViewTreeObserverOnPreDrawListenerC0017s(ViewGroup viewGroup, Runnable runnable) {
        this.f104a = viewGroup;
        this.f105b = viewGroup.getViewTreeObserver();
        this.f106c = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0017s viewTreeObserverOnPreDrawListenerC0017s = new ViewTreeObserverOnPreDrawListenerC0017s(viewGroup, runnable);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0017s);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0017s);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f105b.isAlive();
        View view = this.f104a;
        if (isAlive) {
            this.f105b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f106c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f105b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f105b.isAlive();
        View view2 = this.f104a;
        if (isAlive) {
            this.f105b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
