package i;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class E0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2633b;

    public /* synthetic */ E0(int i2, Object obj) {
        this.f2632a = i2;
        this.f2633b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        int i2 = this.f2632a;
        Object obj = this.f2633b;
        switch (i2) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View.OnFocusChangeListener onFocusChangeListener = searchView.f906K;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z2);
                    break;
                }
                break;
            case 1:
                o0.e eVar = (o0.e) obj;
                eVar.e(o0.e.d(eVar));
                break;
            default:
                o0.l lVar = (o0.l) obj;
                lVar.f3393a.setEndIconActivated(z2);
                if (!z2) {
                    lVar.g(false);
                    lVar.f3385j = false;
                    break;
                }
                break;
        }
    }
}
