package F;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f69a;

    public final void a(float f2) {
        View view = (View) this.f69a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f69a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f69a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(U u2) {
        View view = (View) this.f69a.get();
        if (view != null) {
            if (u2 != null) {
                view.animate().setListener(new P(this, u2, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f69a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
