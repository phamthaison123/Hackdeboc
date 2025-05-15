package S;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: S.k, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0035k extends L {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f420s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f421g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f422h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f423i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f424j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f425k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f426l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f427m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f428n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f429o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f430p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f431q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f432r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f0) arrayList.get(size)).f367a.animate().cancel();
        }
    }

    @Override // S.L
    public final boolean a(f0 f0Var, f0 f0Var2, K k2, K k3) {
        int i2;
        int i3;
        int i4 = k2.f266a;
        int i5 = k2.f267b;
        if (f0Var2.q()) {
            int i6 = k2.f266a;
            i3 = k2.f267b;
            i2 = i6;
        } else {
            i2 = k3.f266a;
            i3 = k3.f267b;
        }
        if (f0Var == f0Var2) {
            return g(f0Var, i4, i5, i2, i3);
        }
        View view = f0Var.f367a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(f0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(f0Var2);
        float f2 = -((int) ((i2 - i4) - translationX));
        View view2 = f0Var2.f367a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i3 - i5) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f425k;
        C0033i c0033i = new C0033i();
        c0033i.f400a = f0Var;
        c0033i.f401b = f0Var2;
        c0033i.f402c = i4;
        c0033i.f403d = i5;
        c0033i.f404e = i2;
        c0033i.f405f = i3;
        arrayList.add(c0033i);
        return true;
    }

    @Override // S.L
    public final void d(f0 f0Var) {
        View view = f0Var.f367a;
        view.animate().cancel();
        ArrayList arrayList = this.f424j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0034j) arrayList.get(size)).f408a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(f0Var);
                arrayList.remove(size);
            }
        }
        j(f0Var, this.f425k);
        if (this.f422h.remove(f0Var)) {
            view.setAlpha(1.0f);
            c(f0Var);
        }
        if (this.f423i.remove(f0Var)) {
            view.setAlpha(1.0f);
            c(f0Var);
        }
        ArrayList arrayList2 = this.f428n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(f0Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f427m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0034j) arrayList5.get(size4)).f408a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(f0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f426l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(f0Var)) {
                view.setAlpha(1.0f);
                c(f0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f431q.remove(f0Var);
        this.f429o.remove(f0Var);
        this.f432r.remove(f0Var);
        this.f430p.remove(f0Var);
        i();
    }

    @Override // S.L
    public final void e() {
        ArrayList arrayList = this.f424j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0034j c0034j = (C0034j) arrayList.get(size);
            View view = c0034j.f408a.f367a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0034j.f408a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f422h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((f0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f423i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f0 f0Var = (f0) arrayList3.get(size3);
            f0Var.f367a.setAlpha(1.0f);
            c(f0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f425k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0033i c0033i = (C0033i) arrayList4.get(size4);
            f0 f0Var2 = c0033i.f400a;
            if (f0Var2 != null) {
                k(c0033i, f0Var2);
            }
            f0 f0Var3 = c0033i.f401b;
            if (f0Var3 != null) {
                k(c0033i, f0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f427m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0034j c0034j2 = (C0034j) arrayList6.get(size6);
                    View view2 = c0034j2.f408a.f367a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0034j2.f408a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f426l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    f0 f0Var4 = (f0) arrayList8.get(size8);
                    f0Var4.f367a.setAlpha(1.0f);
                    c(f0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f428n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0033i c0033i2 = (C0033i) arrayList10.get(size10);
                    f0 f0Var5 = c0033i2.f400a;
                    if (f0Var5 != null) {
                        k(c0033i2, f0Var5);
                    }
                    f0 f0Var6 = c0033i2.f401b;
                    if (f0Var6 != null) {
                        k(c0033i2, f0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f431q);
            h(this.f430p);
            h(this.f429o);
            h(this.f432r);
            ArrayList arrayList11 = this.f271b;
            if (arrayList11.size() > 0) {
                F.Q.i(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // S.L
    public final boolean f() {
        return (this.f423i.isEmpty() && this.f425k.isEmpty() && this.f424j.isEmpty() && this.f422h.isEmpty() && this.f430p.isEmpty() && this.f431q.isEmpty() && this.f429o.isEmpty() && this.f432r.isEmpty() && this.f427m.isEmpty() && this.f426l.isEmpty() && this.f428n.isEmpty()) ? false : true;
    }

    public final boolean g(f0 f0Var, int i2, int i3, int i4, int i5) {
        View view = f0Var.f367a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) f0Var.f367a.getTranslationY());
        l(f0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(f0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        ArrayList arrayList = this.f424j;
        C0034j c0034j = new C0034j();
        c0034j.f408a = f0Var;
        c0034j.f409b = translationX;
        c0034j.f410c = translationY;
        c0034j.f411d = i4;
        c0034j.f412e = i5;
        arrayList.add(c0034j);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f271b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            F.Q.i(arrayList.get(0));
            throw null;
        }
    }

    public final void j(f0 f0Var, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0033i c0033i = (C0033i) arrayList.get(size);
            if (k(c0033i, f0Var) && c0033i.f400a == null && c0033i.f401b == null) {
                arrayList.remove(c0033i);
            }
        }
    }

    public final boolean k(C0033i c0033i, f0 f0Var) {
        if (c0033i.f401b == f0Var) {
            c0033i.f401b = null;
        } else {
            if (c0033i.f400a != f0Var) {
                return false;
            }
            c0033i.f400a = null;
        }
        f0Var.f367a.setAlpha(1.0f);
        View view = f0Var.f367a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(f0Var);
        return true;
    }

    public final void l(f0 f0Var) {
        if (f420s == null) {
            f420s = new ValueAnimator().getInterpolator();
        }
        f0Var.f367a.animate().setInterpolator(f420s);
        d(f0Var);
    }
}
