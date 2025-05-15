package androidx.fragment.app;

import android.content.Context;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0065f extends e.s {

    /* renamed from: c, reason: collision with root package name */
    public boolean f1328c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1329d;

    /* renamed from: e, reason: collision with root package name */
    public C0080v f1330e;

    public final C0080v h(Context context) {
        if (this.f1329d) {
            return this.f1330e;
        }
        c0 c0Var = (c0) this.f2138a;
        C0080v L2 = B.a.L(context, c0Var.f1309c, c0Var.f1307a == 2, this.f1328c);
        this.f1330e = L2;
        this.f1329d = true;
        return L2;
    }
}
