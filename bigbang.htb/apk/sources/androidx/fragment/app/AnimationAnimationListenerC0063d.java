package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class AnimationAnimationListenerC0063d implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1315a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1319e;

    public AnimationAnimationListenerC0063d(ViewGroup viewGroup, AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, A a2, B.c cVar) {
        this.f1316b = viewGroup;
        this.f1317c = abstractComponentCallbacksC0075p;
        this.f1318d = a2;
        this.f1319e = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i2 = this.f1315a;
        ViewGroup viewGroup = this.f1316b;
        switch (i2) {
            case 0:
                viewGroup.post(new RunnableC0078t(1, this));
                break;
            default:
                viewGroup.post(new RunnableC0078t(0, this));
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC0063d(View view, ViewGroup viewGroup, C0065f c0065f, C0067h c0067h) {
        this.f1319e = c0067h;
        this.f1316b = viewGroup;
        this.f1317c = view;
        this.f1318d = c0065f;
    }
}
