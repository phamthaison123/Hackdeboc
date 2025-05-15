package androidx.activity;

import androidx.fragment.app.B;
import androidx.fragment.app.H;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f770a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f771b = new ArrayDeque();

    public h(b bVar) {
        this.f770a = bVar;
    }

    public final void a(o oVar, B b2) {
        q d2 = oVar.d();
        if (d2.f1471c == j.f1461a) {
            return;
        }
        b2.f1145b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, d2, b2));
    }

    public final void b() {
        Iterator descendingIterator = this.f771b.descendingIterator();
        while (descendingIterator.hasNext()) {
            B b2 = (B) descendingIterator.next();
            if (b2.f1144a) {
                H h2 = b2.f1146c;
                h2.x(true);
                if (h2.f1177h.f1144a) {
                    h2.K();
                    return;
                } else {
                    h2.f1176g.b();
                    return;
                }
            }
        }
        Runnable runnable = this.f770a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
