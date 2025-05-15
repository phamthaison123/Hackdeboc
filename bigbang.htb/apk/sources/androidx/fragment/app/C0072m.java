package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0072m extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0075p f1353c;

    public C0072m(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p) {
        this.f1353c = abstractComponentCallbacksC0075p;
    }

    @Override // B.a
    public final View R(int i2) {
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1353c;
        View view = abstractComponentCallbacksC0075p.f1374E;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0075p + " does not have a view");
    }

    @Override // B.a
    public final boolean V() {
        return this.f1353c.f1374E != null;
    }
}
