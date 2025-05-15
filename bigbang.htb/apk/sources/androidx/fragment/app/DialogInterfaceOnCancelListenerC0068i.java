package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class DialogInterfaceOnCancelListenerC0068i implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0071l f1334a;

    public DialogInterfaceOnCancelListenerC0068i(DialogInterfaceOnCancelListenerC0071l dialogInterfaceOnCancelListenerC0071l) {
        this.f1334a = dialogInterfaceOnCancelListenerC0071l;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0071l dialogInterfaceOnCancelListenerC0071l = this.f1334a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0071l.f1349d0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0071l.onCancel(dialog);
        }
    }
}
