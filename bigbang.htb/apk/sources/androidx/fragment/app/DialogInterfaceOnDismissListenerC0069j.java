package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class DialogInterfaceOnDismissListenerC0069j implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0071l f1335a;

    public DialogInterfaceOnDismissListenerC0069j(DialogInterfaceOnCancelListenerC0071l dialogInterfaceOnCancelListenerC0071l) {
        this.f1335a = dialogInterfaceOnCancelListenerC0071l;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0071l dialogInterfaceOnCancelListenerC0071l = this.f1335a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0071l.f1349d0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0071l.onDismiss(dialog);
        }
    }
}
