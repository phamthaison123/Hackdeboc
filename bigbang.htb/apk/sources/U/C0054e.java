package U;

import android.view.ViewGroup;

/* renamed from: U.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0054e extends r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f593a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f594b;

    public C0054e(ViewGroup viewGroup) {
        this.f594b = viewGroup;
    }

    @Override // U.r, U.p
    public final void a() {
        this.f594b.suppressLayout(false);
        this.f593a = true;
    }

    @Override // U.r, U.p
    public final void b() {
        this.f594b.suppressLayout(false);
    }

    @Override // U.p
    public final void c(q qVar) {
        if (!this.f593a) {
            this.f594b.suppressLayout(false);
        }
        qVar.v(this);
    }

    @Override // U.r, U.p
    public final void e() {
        this.f594b.suppressLayout(true);
    }
}
