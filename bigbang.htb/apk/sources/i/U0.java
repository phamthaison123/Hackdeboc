package i;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import g.InterfaceC0104d;
import h.InterfaceC0115B;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class U0 implements InterfaceC0115B {

    /* renamed from: a, reason: collision with root package name */
    public h.o f2723a;

    /* renamed from: b, reason: collision with root package name */
    public h.q f2724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2725c;

    public U0(Toolbar toolbar) {
        this.f2725c = toolbar;
    }

    @Override // h.InterfaceC0115B
    public final void b(h.o oVar, boolean z2) {
    }

    @Override // h.InterfaceC0115B
    public final void c() {
        if (this.f2724b != null) {
            h.o oVar = this.f2723a;
            if (oVar != null) {
                int size = oVar.f2455f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2723a.getItem(i2) == this.f2724b) {
                        return;
                    }
                }
            }
            d(this.f2724b);
        }
    }

    @Override // h.InterfaceC0115B
    public final boolean d(h.q qVar) {
        Toolbar toolbar = this.f2725c;
        KeyEvent.Callback callback = toolbar.f962i;
        if (callback instanceof InterfaceC0104d) {
            ((InterfaceC0104d) callback).d();
        }
        toolbar.removeView(toolbar.f962i);
        toolbar.removeView(toolbar.f961h);
        toolbar.f962i = null;
        ArrayList arrayList = toolbar.f944E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2724b = null;
        toolbar.requestLayout();
        qVar.f2479C = false;
        qVar.f2493n.p(false);
        return true;
    }

    @Override // h.InterfaceC0115B
    public final void g(Context context, h.o oVar) {
        h.q qVar;
        h.o oVar2 = this.f2723a;
        if (oVar2 != null && (qVar = this.f2724b) != null) {
            oVar2.d(qVar);
        }
        this.f2723a = oVar;
    }

    @Override // h.InterfaceC0115B
    public final boolean h() {
        return false;
    }

    @Override // h.InterfaceC0115B
    public final boolean j(h.H h2) {
        return false;
    }

    @Override // h.InterfaceC0115B
    public final boolean k(h.q qVar) {
        Toolbar toolbar = this.f2725c;
        toolbar.c();
        ViewParent parent = toolbar.f961h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f961h);
            }
            toolbar.addView(toolbar.f961h);
        }
        View actionView = qVar.getActionView();
        toolbar.f962i = actionView;
        this.f2724b = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f962i);
            }
            V0 h2 = Toolbar.h();
            h2.f2074a = (toolbar.f967n & 112) | 8388611;
            h2.f2729b = 2;
            toolbar.f962i.setLayoutParams(h2);
            toolbar.addView(toolbar.f962i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((V0) childAt.getLayoutParams()).f2729b != 2 && childAt != toolbar.f954a) {
                toolbar.removeViewAt(childCount);
                toolbar.f944E.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.f2479C = true;
        qVar.f2493n.p(false);
        KeyEvent.Callback callback = toolbar.f962i;
        if (callback instanceof InterfaceC0104d) {
            ((InterfaceC0104d) callback).a();
        }
        return true;
    }
}
