package Z;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s.AbstractC0214a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class c extends AbstractC0214a {

    /* renamed from: a, reason: collision with root package name */
    public d f726a;

    /* renamed from: b, reason: collision with root package name */
    public int f727b = 0;

    public c() {
    }

    @Override // s.AbstractC0214a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        r(coordinatorLayout, view, i2);
        if (this.f726a == null) {
            this.f726a = new d(view);
        }
        d dVar = this.f726a;
        View view2 = dVar.f728a;
        dVar.f729b = view2.getTop();
        dVar.f730c = view2.getLeft();
        this.f726a.a();
        int i3 = this.f727b;
        if (i3 == 0) {
            return true;
        }
        d dVar2 = this.f726a;
        if (dVar2.f731d != i3) {
            dVar2.f731d = i3;
            dVar2.a();
        }
        this.f727b = 0;
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.q(view, i2);
    }

    public c(int i2) {
    }
}
