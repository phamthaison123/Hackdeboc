package S;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i0 extends U {

    /* renamed from: a, reason: collision with root package name */
    public boolean f406a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f407b;

    public i0(D d2) {
        this.f407b = d2;
    }

    @Override // S.U
    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0 && this.f406a) {
            this.f406a = false;
            this.f407b.f();
        }
    }

    @Override // S.U
    public final void b(RecyclerView recyclerView, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        this.f406a = true;
    }
}
