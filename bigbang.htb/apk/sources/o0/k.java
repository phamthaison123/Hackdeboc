package o0;

import android.widget.AutoCompleteTextView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f3379a;

    public k(l lVar) {
        this.f3379a = lVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        l lVar = this.f3379a;
        lVar.f3385j = true;
        lVar.f3387l = System.currentTimeMillis();
        lVar.g(false);
    }
}
