package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0077s extends B.a implements androidx.lifecycle.E, androidx.activity.i, androidx.activity.result.f, K {

    /* renamed from: c, reason: collision with root package name */
    public final Activity f1415c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1416d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f1417e;

    /* renamed from: f, reason: collision with root package name */
    public final H f1418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f1419g;

    public C0077s(FragmentActivity fragmentActivity) {
        this.f1419g = fragmentActivity;
        Handler handler = new Handler();
        this.f1418f = new H();
        this.f1415c = fragmentActivity;
        B.a.o(fragmentActivity, "context == null");
        this.f1416d = fragmentActivity;
        this.f1417e = handler;
    }

    @Override // B.a
    public final View R(int i2) {
        return this.f1419g.findViewById(i2);
    }

    @Override // B.a
    public final boolean V() {
        Window window = this.f1419g.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.E
    public final androidx.lifecycle.D b() {
        return this.f1419g.b();
    }

    @Override // androidx.lifecycle.o
    public final androidx.lifecycle.q d() {
        return this.f1419g.f1154i;
    }

    @Override // androidx.fragment.app.K
    public final void f() {
        this.f1419g.getClass();
    }
}
