package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0133a implements F.U {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2766a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2768c;

    public C0133a(ActionBarContextView actionBarContextView) {
        this.f2768c = actionBarContextView;
    }

    @Override // F.U
    public final void c() {
        if (this.f2766a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2768c;
        actionBarContextView.f826f = null;
        super/*android.view.View*/.setVisibility(this.f2767b);
    }

    @Override // F.U
    public final void e(View view) {
        this.f2766a = true;
    }

    @Override // F.U
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f2766a = false;
    }
}
