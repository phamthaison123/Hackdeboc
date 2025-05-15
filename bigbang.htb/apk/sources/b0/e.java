package b0;

import F.AbstractC0023y;
import F.O;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final View f1633a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1634b;

    /* renamed from: c, reason: collision with root package name */
    public int f1635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f1636d;

    public e(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.f1636d = bottomSheetBehavior;
        this.f1633a = view;
        this.f1635c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomSheetBehavior bottomSheetBehavior = this.f1636d;
        L.e eVar = bottomSheetBehavior.f1686H;
        if (eVar == null || !eVar.f()) {
            bottomSheetBehavior.A(this.f1635c);
        } else {
            WeakHashMap weakHashMap = O.f58a;
            AbstractC0023y.m(this.f1633a, this);
        }
        this.f1634b = false;
    }
}
