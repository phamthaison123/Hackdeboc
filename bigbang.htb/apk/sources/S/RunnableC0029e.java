package S;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: S.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0029e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0035k f353c;

    public /* synthetic */ RunnableC0029e(C0035k c0035k, ArrayList arrayList, int i2) {
        this.f351a = i2;
        this.f353c = c0035k;
        this.f352b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f2;
        int i2 = this.f351a;
        float f3 = 0.0f;
        C0035k c0035k = this.f353c;
        ArrayList arrayList = this.f352b;
        switch (i2) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0034j c0034j = (C0034j) it.next();
                    f0 f0Var = c0034j.f408a;
                    c0035k.getClass();
                    View view = f0Var.f367a;
                    int i3 = c0034j.f411d - c0034j.f409b;
                    int i4 = c0034j.f412e - c0034j.f410c;
                    if (i3 != 0) {
                        f2 = 0.0f;
                        view.animate().translationX(0.0f);
                    } else {
                        f2 = 0.0f;
                    }
                    if (i4 != 0) {
                        view.animate().translationY(f2);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    c0035k.f430p.add(f0Var);
                    animate.setDuration(c0035k.f274e).setListener(new C0031g(c0035k, f0Var, i3, view, i4, animate)).start();
                }
                arrayList.clear();
                c0035k.f427m.remove(arrayList);
                break;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0033i c0033i = (C0033i) it2.next();
                    c0035k.getClass();
                    f0 f0Var2 = c0033i.f400a;
                    View view2 = f0Var2 == null ? null : f0Var2.f367a;
                    f0 f0Var3 = c0033i.f401b;
                    View view3 = f0Var3 != null ? f0Var3.f367a : null;
                    ArrayList arrayList2 = c0035k.f432r;
                    long j2 = c0035k.f275f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                        arrayList2.add(c0033i.f400a);
                        duration.translationX(c0033i.f404e - c0033i.f402c);
                        duration.translationY(c0033i.f405f - c0033i.f403d);
                        duration.alpha(f3).setListener(new C0032h(c0035k, c0033i, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList2.add(c0033i.f401b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0032h(c0035k, c0033i, animate2, view3, 1)).start();
                    }
                    f3 = 0.0f;
                }
                arrayList.clear();
                c0035k.f428n.remove(arrayList);
                break;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    f0 f0Var4 = (f0) it3.next();
                    c0035k.getClass();
                    View view4 = f0Var4.f367a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c0035k.f429o.add(f0Var4);
                    animate3.alpha(1.0f).setDuration(c0035k.f272c).setListener(new C0030f(c0035k, f0Var4, view4, animate3, 1)).start();
                }
                arrayList.clear();
                c0035k.f426l.remove(arrayList);
                break;
        }
    }
}
