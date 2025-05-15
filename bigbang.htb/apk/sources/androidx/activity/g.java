package androidx.activity;

import androidx.fragment.app.B;
import java.util.ArrayDeque;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final B f768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f769b;

    public g(h hVar, B b2) {
        this.f769b = hVar;
        this.f768a = b2;
    }

    @Override // androidx.activity.a
    public final void cancel() {
        ArrayDeque arrayDeque = this.f769b.f771b;
        B b2 = this.f768a;
        arrayDeque.remove(b2);
        b2.f1145b.remove(this);
    }
}
