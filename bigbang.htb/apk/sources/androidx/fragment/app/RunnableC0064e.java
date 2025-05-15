package androidx.fragment.app;

import l.C0190b;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0064e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f1325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f1326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1327c;

    public RunnableC0064e(c0 c0Var, c0 c0Var2, boolean z2, C0190b c0190b) {
        this.f1325a = c0Var;
        this.f1326b = c0Var2;
        this.f1327c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q.a(this.f1325a.f1309c, this.f1326b.f1309c, this.f1327c);
    }
}
