package F;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class D implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0015p f56a;

    public D(View view, InterfaceC0015p interfaceC0015p) {
        this.f56a = interfaceC0015p;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.f56a.o(view, f0.f(windowInsets, view)).e();
    }
}
