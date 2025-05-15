package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class A extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public e.z f1442a;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, i iVar) {
        if (activity instanceof o) {
            q d2 = ((o) activity).d();
            if (d2 instanceof q) {
                d2.g(iVar);
            }
        }
    }

    public static void b(Activity activity) {
        z.registerIn(activity);
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new A(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f1442a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        e.z zVar = this.f1442a;
        if (zVar != null) {
            ((y) zVar.f2221b).b();
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        e.z zVar = this.f1442a;
        if (zVar != null) {
            y yVar = (y) zVar.f2221b;
            int i2 = yVar.f1495a + 1;
            yVar.f1495a = i2;
            if (i2 == 1 && yVar.f1498d) {
                yVar.f1500f.g(i.ON_START);
                yVar.f1498d = false;
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
    }
}
