package i;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0141e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2789b;

    public /* synthetic */ RunnableC0141e(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2788a = i2;
        this.f2789b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f2788a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2789b;
        switch (i2) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f865w = actionBarOverlayLayout.f846d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f866x);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f865w = actionBarOverlayLayout.f846d.animate().translationY(-actionBarOverlayLayout.f846d.getHeight()).setListener(actionBarOverlayLayout.f866x);
                break;
        }
    }
}
