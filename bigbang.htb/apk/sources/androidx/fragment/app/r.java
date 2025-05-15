package androidx.fragment.app;

import a.InterfaceC0059b;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class r implements InterfaceC0059b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f1414a;

    public r(FragmentActivity fragmentActivity) {
        this.f1414a = fragmentActivity;
    }

    @Override // a.InterfaceC0059b
    public final void a() {
        FragmentActivity fragmentActivity = this.f1414a;
        C0077s c0077s = (C0077s) fragmentActivity.f1153h.f277b;
        c0077s.f1418f.b(c0077s, c0077s, null);
        Bundle a2 = fragmentActivity.f741d.f1620b.a("android:support:fragments");
        if (a2 != null) {
            Parcelable parcelable = a2.getParcelable("android:support:fragments");
            C0077s c0077s2 = (C0077s) fragmentActivity.f1153h.f277b;
            if (!(c0077s2 instanceof androidx.lifecycle.E)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            c0077s2.f1418f.O(parcelable);
        }
    }
}
