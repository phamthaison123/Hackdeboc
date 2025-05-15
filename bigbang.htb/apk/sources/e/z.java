package e;

import F.AbstractC0002c;
import F.AbstractC0023y;
import F.AbstractC0024z;
import F.InterfaceC0006g;
import F.InterfaceC0015p;
import F.O;
import F.Q;
import F.X;
import F.e0;
import F.f0;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import h.C0123h;
import h.H;
import h.InterfaceC0114A;
import h.RunnableC0122g;
import i.C0157m;
import i.InterfaceC0163p;
import i.InterfaceC0173u0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import s.C0217d;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class z implements InterfaceC0173u0, InterfaceC0114A, h.m, InterfaceC0163p, InterfaceC0015p, InterfaceC0006g, H.b, G.o, c0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2220a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2221b;

    public z(int i2) {
        this.f2220a = i2;
        if (i2 == 10) {
            this.f2221b = new ConcurrentHashMap();
            return;
        }
        if (i2 == 22) {
            this.f2221b = new HashMap();
            return;
        }
        if (i2 == 13) {
            this.f2221b = new X();
        } else if (i2 != 14) {
            this.f2221b = new ArrayDeque();
        } else {
            this.f2221b = new G.g(this);
        }
    }

    @Override // h.m
    public final void a(h.o oVar) {
        h.m mVar = ((ActionMenuView) this.f2221b).f876v;
        if (mVar != null) {
            mVar.a(oVar);
        }
    }

    @Override // h.InterfaceC0114A
    public final void b(h.o oVar, boolean z2) {
        if (oVar instanceof H) {
            oVar.k().c(false);
        }
        InterfaceC0114A interfaceC0114A = ((C0157m) this.f2221b).f2832e;
        if (interfaceC0114A != null) {
            interfaceC0114A.b(oVar, z2);
        }
    }

    @Override // F.InterfaceC0006g
    public final int c() {
        int source;
        source = ((ContentInfo) this.f2221b).getSource();
        return source;
    }

    @Override // h.m
    public final boolean d(h.o oVar, MenuItem menuItem) {
        Object obj = this.f2221b;
        if (((ActionMenuView) obj).f869A == null) {
            return false;
        }
        z zVar = (z) ((ActionMenuView) obj).f869A;
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) zVar.f2221b).f946G.f2079b).iterator();
        if (it.hasNext()) {
            Q.i(it.next());
            throw null;
        }
        ((Toolbar) zVar.f2221b).getClass();
        return false;
    }

    @Override // H.b
    public final ClipDescription e() {
        switch (this.f2220a) {
            case 16:
                return ((InputContentInfo) this.f2221b).getDescription();
            default:
                return ((H.b) this.f2221b).e();
        }
    }

    @Override // H.b
    public final void f() {
        switch (this.f2220a) {
            case 16:
                ((InputContentInfo) this.f2221b).requestPermission();
                break;
            default:
                ((H.b) this.f2221b).f();
                break;
        }
    }

    @Override // F.InterfaceC0006g
    public final ClipData g() {
        ClipData clip;
        clip = ((ContentInfo) this.f2221b).getClip();
        return clip;
    }

    @Override // i.InterfaceC0173u0
    public final void h(h.o oVar, MenuItem menuItem) {
        ((h.i) this.f2221b).f2415g.removeCallbacksAndMessages(oVar);
    }

    @Override // G.o
    public final boolean i(View view) {
        if (!((SwipeDismissBehavior) this.f2221b).r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = O.f58a;
        boolean z2 = AbstractC0024z.d(view) == 1;
        int i2 = ((SwipeDismissBehavior) this.f2221b).f1674c;
        view.offsetLeftAndRight((!(i2 == 0 && z2) && (i2 != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        ((SwipeDismissBehavior) this.f2221b).getClass();
        return true;
    }

    @Override // h.InterfaceC0114A
    public final boolean j(h.o oVar) {
        Object obj = this.f2221b;
        if (oVar == ((C0157m) obj).f2830c) {
            return false;
        }
        ((H) oVar).f2375A.getClass();
        ((C0157m) obj).getClass();
        InterfaceC0114A interfaceC0114A = ((C0157m) this.f2221b).f2832e;
        if (interfaceC0114A != null) {
            return interfaceC0114A.j(oVar);
        }
        return false;
    }

    @Override // H.b
    public final Uri k() {
        switch (this.f2220a) {
            case 16:
                return ((InputContentInfo) this.f2221b).getLinkUri();
            default:
                return ((H.b) this.f2221b).k();
        }
    }

    @Override // F.InterfaceC0006g
    public final int l() {
        int flags;
        flags = ((ContentInfo) this.f2221b).getFlags();
        return flags;
    }

    @Override // i.InterfaceC0173u0
    public final void m(h.o oVar, h.q qVar) {
        ((h.i) this.f2221b).f2415g.removeCallbacksAndMessages(null);
        int size = ((h.i) this.f2221b).f2417i.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (oVar == ((C0123h) ((h.i) this.f2221b).f2417i.get(i2)).f2407b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        ((h.i) this.f2221b).f2415g.postAtTime(new RunnableC0122g(this, i3 < ((h.i) this.f2221b).f2417i.size() ? (C0123h) ((h.i) this.f2221b).f2417i.get(i3) : null, qVar, oVar, 0), oVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // H.b
    public final Object n() {
        return (InputContentInfo) this.f2221b;
    }

    @Override // F.InterfaceC0015p
    public final f0 o(View view, f0 f0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2221b;
        if (!Objects.equals(coordinatorLayout.f1023n, f0Var)) {
            coordinatorLayout.f1023n = f0Var;
            boolean z2 = f0Var.d() > 0;
            coordinatorLayout.f1024o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            e0 e0Var = f0Var.f94a;
            if (!e0Var.j()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    WeakHashMap weakHashMap = O.f58a;
                    if (AbstractC0023y.b(childAt) && ((C0217d) childAt.getLayoutParams()).f3691a != null && e0Var.j()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return f0Var;
    }

    @Override // F.InterfaceC0006g
    public final ContentInfo p() {
        return (ContentInfo) this.f2221b;
    }

    @Override // H.b
    public final Uri q() {
        switch (this.f2220a) {
            case 16:
                return ((InputContentInfo) this.f2221b).getContentUri();
            default:
                return ((H.b) this.f2221b).q();
        }
    }

    public G.d r(int i2) {
        return null;
    }

    public G.d s(int i2) {
        return null;
    }

    public boolean t(int i2, int i3, Bundle bundle) {
        return false;
    }

    public final String toString() {
        switch (this.f2220a) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.f2221b) + "}";
            default:
                return super.toString();
        }
    }

    public final long u() {
        return ((ByteBuffer) this.f2221b).getInt() & 4294967295L;
    }

    public final void v(int i2) {
        Object obj = this.f2221b;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i2);
    }

    public /* synthetic */ z(int i2, Object obj) {
        this.f2220a = i2;
        this.f2221b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(27, materialButtonToggleGroup);
        this.f2220a = 27;
    }

    public z(TextView textView) {
        this.f2220a = 21;
        B.a.o(textView, "textView cannot be null");
        this.f2221b = new N.i(textView);
    }

    public z(Object obj) {
        this.f2220a = 16;
        this.f2221b = (InputContentInfo) obj;
    }

    public z(B.a aVar) {
        this.f2220a = 9;
        this.f2221b = aVar;
    }

    public z(ByteBuffer byteBuffer) {
        this.f2220a = 20;
        this.f2221b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public z(ContentInfo contentInfo) {
        this.f2220a = 12;
        contentInfo.getClass();
        this.f2221b = AbstractC0002c.e(contentInfo);
    }
}
