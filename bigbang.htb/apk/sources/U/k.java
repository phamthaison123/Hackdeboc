package U;

import android.view.View;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f614b;

    public k(View view, ArrayList arrayList) {
        this.f613a = view;
        this.f614b = arrayList;
    }

    @Override // U.p
    public final void a() {
    }

    @Override // U.p
    public final void b() {
    }

    @Override // U.p
    public final void c(q qVar) {
        qVar.v(this);
        this.f613a.setVisibility(8);
        ArrayList arrayList = this.f614b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) arrayList.get(i2)).setVisibility(0);
        }
    }

    @Override // U.p
    public final void d() {
    }

    @Override // U.p
    public final void e() {
    }
}
