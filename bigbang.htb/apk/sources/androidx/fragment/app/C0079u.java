package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0079u extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0075p f1424c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A f1425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B.c f1426e;

    public C0079u(ViewGroup viewGroup, View view, AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, A a2, B.c cVar) {
        this.f1422a = viewGroup;
        this.f1423b = view;
        this.f1424c = abstractComponentCallbacksC0075p;
        this.f1425d = a2;
        this.f1426e = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1422a;
        View view = this.f1423b;
        viewGroup.endViewTransition(view);
        AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = this.f1424c;
        C0073n c0073n = abstractComponentCallbacksC0075p.f1377H;
        Animator animator2 = c0073n == null ? null : c0073n.f1355b;
        abstractComponentCallbacksC0075p.f().f1355b = null;
        if (animator2 == null || viewGroup.indexOfChild(view) >= 0) {
            return;
        }
        this.f1425d.c(abstractComponentCallbacksC0075p, this.f1426e);
    }
}
