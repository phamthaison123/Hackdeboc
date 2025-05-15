package U;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class D extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f577d;

    public D(i iVar, ViewGroup viewGroup, View view, View view2) {
        this.f577d = iVar;
        this.f574a = viewGroup;
        this.f575b = view;
        this.f576c = view2;
    }

    @Override // U.r, U.p
    public final void b() {
        this.f574a.getOverlay().remove(this.f575b);
    }

    @Override // U.p
    public final void c(q qVar) {
        this.f576c.setTag(2131296574, null);
        this.f574a.getOverlay().remove(this.f575b);
        qVar.v(this);
    }

    @Override // U.r, U.p
    public final void e() {
        View view = this.f575b;
        if (view.getParent() == null) {
            this.f574a.getOverlay().add(view);
            return;
        }
        i iVar = this.f577d;
        ArrayList arrayList = iVar.f644m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = iVar.f648q;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) iVar.f648q.clone();
        int size2 = arrayList3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((p) arrayList3.get(i2)).a();
        }
    }
}
