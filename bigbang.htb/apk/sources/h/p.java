package h;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class p implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0114A {

    /* renamed from: a, reason: collision with root package name */
    public o f2474a;

    /* renamed from: b, reason: collision with root package name */
    public e.i f2475b;

    /* renamed from: c, reason: collision with root package name */
    public k f2476c;

    @Override // h.InterfaceC0114A
    public final void b(o oVar, boolean z2) {
        e.i iVar;
        if ((z2 || oVar == this.f2474a) && (iVar = this.f2475b) != null) {
            iVar.dismiss();
        }
    }

    @Override // h.InterfaceC0114A
    public final boolean j(o oVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        k kVar = this.f2476c;
        if (kVar.f2442f == null) {
            kVar.f2442f = new j(kVar);
        }
        this.f2474a.q(kVar.f2442f.getItem(i2), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2476c.b(this.f2474a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        o oVar = this.f2474a;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2475b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2475b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oVar.performShortcut(i2, keyEvent, 0);
    }
}
