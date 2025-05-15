package i;

import androidx.appcompat.widget.SearchView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class D0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f2627b;

    public /* synthetic */ D0(SearchView searchView, int i2) {
        this.f2626a = i2;
        this.f2627b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f2626a;
        SearchView searchView = this.f2627b;
        switch (i2) {
            case 0:
                searchView.t();
                break;
            default:
                J.b bVar = searchView.f910O;
                if (bVar instanceof P0) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
