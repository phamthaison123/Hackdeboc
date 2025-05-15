package i;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;
import g.AbstractC0103c;
import h.C0116a;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ViewOnClickListenerC0137c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2780a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2782c;

    public ViewOnClickListenerC0137c(ActionBarContextView actionBarContextView, AbstractC0103c abstractC0103c) {
        this.f2782c = actionBarContextView;
        this.f2781b = abstractC0103c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f2780a;
        Object obj = this.f2781b;
        switch (i2) {
            case 0:
                ((AbstractC0103c) obj).b();
                break;
            default:
                Y0 y0 = (Y0) this.f2782c;
                Window.Callback callback = y0.f2760k;
                if (callback != null && y0.f2761l) {
                    callback.onMenuItemSelected(0, (C0116a) obj);
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC0137c(Y0 y0) {
        this.f2782c = y0;
        this.f2781b = new C0116a(y0.f2750a.getContext(), y0.f2757h);
    }
}
