package g;

import F.T;
import F.U;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g.m, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0113m {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f2344c;

    /* renamed from: d, reason: collision with root package name */
    public U f2345d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2346e;

    /* renamed from: b, reason: collision with root package name */
    public long f2343b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C0112l f2347f = new C0112l(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2342a = new ArrayList();

    public final void a() {
        if (this.f2346e) {
            Iterator it = this.f2342a.iterator();
            while (it.hasNext()) {
                ((T) it.next()).b();
            }
            this.f2346e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2346e) {
            return;
        }
        Iterator it = this.f2342a.iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            long j2 = this.f2343b;
            if (j2 >= 0) {
                t2.c(j2);
            }
            Interpolator interpolator = this.f2344c;
            if (interpolator != null && (view = (View) t2.f69a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f2345d != null) {
                t2.d(this.f2347f);
            }
            View view2 = (View) t2.f69a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2346e = true;
    }
}
