package a0;

import F.AbstractC0023y;
import F.O;
import L.e;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final View f737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f738b;

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f738b = swipeDismissBehavior;
        this.f737a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f738b.f1672a;
        if (eVar == null || !eVar.f()) {
            return;
        }
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.m(this.f737a, this);
    }
}
