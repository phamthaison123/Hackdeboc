package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0062c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f1305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0065f f1306e;

    public C0062c(ViewGroup viewGroup, View view, boolean z2, c0 c0Var, C0065f c0065f) {
        this.f1302a = viewGroup;
        this.f1303b = view;
        this.f1304c = z2;
        this.f1305d = c0Var;
        this.f1306e = c0065f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1302a;
        View view = this.f1303b;
        viewGroup.endViewTransition(view);
        if (this.f1304c) {
            F.Q.a(this.f1305d.f1307a, view);
        }
        this.f1306e.b();
    }
}
