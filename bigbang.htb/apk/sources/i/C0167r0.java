package i;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: i.r0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0167r0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0171t0 f2889a;

    public C0167r0(C0171t0 c0171t0) {
        this.f2889a = c0171t0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            C0171t0 c0171t0 = this.f2889a;
            if (c0171t0.f2922y.getInputMethodMode() == 2 || c0171t0.f2922y.getContentView() == null) {
                return;
            }
            Handler handler = c0171t0.f2918u;
            RunnableC0162o0 runnableC0162o0 = c0171t0.f2914q;
            handler.removeCallbacks(runnableC0162o0);
            runnableC0162o0.run();
        }
    }
}
