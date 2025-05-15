package androidx.fragment.app;

import android.os.Bundle;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0076q implements androidx.savedstate.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f1413a;

    public C0076q(FragmentActivity fragmentActivity) {
        this.f1413a = fragmentActivity;
    }

    @Override // androidx.savedstate.b
    public final Bundle a() {
        FragmentActivity fragmentActivity;
        Bundle bundle = new Bundle();
        do {
            fragmentActivity = this.f1413a;
        } while (FragmentActivity.i(((C0077s) fragmentActivity.f1153h.f277b).f1418f));
        fragmentActivity.f1154i.g(androidx.lifecycle.i.ON_STOP);
        I P2 = ((C0077s) fragmentActivity.f1153h.f277b).f1418f.P();
        if (P2 != null) {
            bundle.putParcelable("android:support:fragments", P2);
        }
        return bundle;
    }
}
