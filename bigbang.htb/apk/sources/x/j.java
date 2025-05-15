package x;

import S.P;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3761c;

    public /* synthetic */ j(int i2, int i3, Object obj) {
        this.f3759a = i3;
        this.f3761c = obj;
        this.f3760b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f3759a;
        int i3 = this.f3760b;
        Object obj = this.f3761c;
        switch (i2) {
            case 0:
                ((B.a) obj).S(i3);
                break;
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.l) obj).f1817Z;
                if (!recyclerView.f1584u) {
                    P p2 = recyclerView.f1569l;
                    if (p2 != null) {
                        p2.s0(recyclerView, i3);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }
}
