package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0070k extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B.a f1336c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0071l f1337d;

    public C0070k(DialogInterfaceOnCancelListenerC0071l dialogInterfaceOnCancelListenerC0071l, C0072m c0072m) {
        this.f1337d = dialogInterfaceOnCancelListenerC0071l;
        this.f1336c = c0072m;
    }

    @Override // B.a
    public final View R(int i2) {
        B.a aVar = this.f1336c;
        if (aVar.V()) {
            return aVar.R(i2);
        }
        Dialog dialog = this.f1337d.f1349d0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    @Override // B.a
    public final boolean V() {
        return this.f1336c.V() || this.f1337d.f1352g0;
    }
}
