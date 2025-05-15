package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ViewOnAttachStateChangeListenerC0083y implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1438a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f1439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1440c;

    public ViewOnAttachStateChangeListenerC0083y(LayoutInflaterFactory2C0084z layoutInflaterFactory2C0084z, M m2) {
        this.f1440c = layoutInflaterFactory2C0084z;
        this.f1439b = m2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f1438a;
        Object obj = this.f1440c;
        switch (i2) {
            case 0:
                M m2 = this.f1439b;
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = m2.f1225c;
                m2.k();
                d0.f((ViewGroup) abstractComponentCallbacksC0075p.f1374E.getParent(), ((LayoutInflaterFactory2C0084z) obj).f1441a.C()).e();
                break;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = F.O.f58a;
                F.C.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC0083y(M m2, View view) {
        this.f1439b = m2;
        this.f1440c = view;
    }
}
