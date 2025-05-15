package androidx.fragment.app;

import F.ViewTreeObserverOnPreDrawListenerC0017s;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0081w extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1429a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1430b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1431c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1432d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1433e;

    public RunnableC0081w(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1433e = true;
        this.f1429a = viewGroup;
        this.f1430b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f1433e = true;
        if (this.f1431c) {
            return !this.f1432d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1431c = true;
            ViewTreeObserverOnPreDrawListenerC0017s.a(this.f1429a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f1431c;
        ViewGroup viewGroup = this.f1429a;
        if (z2 || !this.f1433e) {
            viewGroup.endViewTransition(this.f1430b);
            this.f1432d = true;
        } else {
            this.f1433e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1433e = true;
        if (this.f1431c) {
            return !this.f1432d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1431c = true;
            ViewTreeObserverOnPreDrawListenerC0017s.a(this.f1429a, this);
        }
        return true;
    }
}
