package S;

import F.C0001b;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f307a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f308b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f309c;

    /* renamed from: d, reason: collision with root package name */
    public final List f310d;

    /* renamed from: e, reason: collision with root package name */
    public int f311e;

    /* renamed from: f, reason: collision with root package name */
    public int f312f;

    /* renamed from: g, reason: collision with root package name */
    public W f313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f314h;

    public X(RecyclerView recyclerView) {
        this.f314h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f307a = arrayList;
        this.f308b = null;
        this.f309c = new ArrayList();
        this.f310d = Collections.unmodifiableList(arrayList);
        this.f311e = 2;
        this.f312f = 2;
    }

    public final void a(f0 f0Var, boolean z2) {
        RecyclerView.j(f0Var);
        RecyclerView recyclerView = this.f314h;
        h0 h0Var = recyclerView.f1567j0;
        if (h0Var != null) {
            g0 g0Var = h0Var.f399e;
            boolean z3 = g0Var instanceof g0;
            View view = f0Var.f367a;
            F.O.h(view, z3 ? (C0001b) g0Var.f392e.remove(view) : null);
        }
        if (z2 && recyclerView.f1553c0 != null) {
            recyclerView.f1558f.m(f0Var);
        }
        f0Var.f384r = null;
        W c2 = c();
        c2.getClass();
        int i2 = f0Var.f372f;
        ArrayList arrayList = c2.a(i2).f301a;
        if (((V) c2.f305a.get(i2)).f302b <= arrayList.size()) {
            return;
        }
        f0Var.o();
        arrayList.add(f0Var);
    }

    public final int b(int i2) {
        RecyclerView recyclerView = this.f314h;
        if (i2 >= 0 && i2 < recyclerView.f1553c0.b()) {
            return !recyclerView.f1553c0.f340g ? i2 : recyclerView.f1554d.f(i2, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f1553c0.b() + recyclerView.y());
    }

    public final W c() {
        if (this.f313g == null) {
            W w2 = new W();
            w2.f305a = new SparseArray();
            w2.f306b = 0;
            this.f313g = w2;
        }
        return this.f313g;
    }

    public final void d() {
        ArrayList arrayList = this.f309c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.s0;
        C0041q c0041q = this.f314h.f1551b0;
        int[] iArr2 = c0041q.f498c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0041q.f499d = 0;
    }

    public final void e(int i2) {
        ArrayList arrayList = this.f309c;
        a((f0) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    public final void f(View view) {
        f0 I2 = RecyclerView.I(view);
        boolean l2 = I2.l();
        RecyclerView recyclerView = this.f314h;
        if (l2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I2.k()) {
            I2.f380n.j(I2);
        } else if (I2.r()) {
            I2.f376j &= -33;
        }
        g(I2);
        if (recyclerView.f1532H == null || I2.i()) {
            return;
        }
        recyclerView.f1532H.d(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(S.f0 r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.X.g(S.f0):void");
    }

    public final void h(View view) {
        L l2;
        f0 I2 = RecyclerView.I(view);
        boolean e2 = I2.e(12);
        RecyclerView recyclerView = this.f314h;
        if (!e2 && I2.m() && (l2 = recyclerView.f1532H) != null) {
            C0035k c0035k = (C0035k) l2;
            if (I2.d().isEmpty() && c0035k.f421g && !I2.h()) {
                if (this.f308b == null) {
                    this.f308b = new ArrayList();
                }
                I2.f380n = this;
                I2.f381o = true;
                this.f308b.add(I2);
                return;
            }
        }
        if (I2.h() && !I2.j() && !recyclerView.f1568k.f265b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I2.f380n = this;
        I2.f381o = false;
        this.f307a.add(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x042e, code lost:
    
        if ((r14 + r12) >= r24) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b4, code lost:
    
        if (r3.f340g == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e4, code lost:
    
        r10.b(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ec, code lost:
    
        if (r10.k() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ee, code lost:
    
        r2.removeDetachedView(r10.f367a, false);
        r10.f380n.j(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0205, code lost:
    
        g(r10);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fd, code lost:
    
        if (r10.r() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ff, code lost:
    
        r10.f376j &= -33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ce, code lost:
    
        if (r10.f372f != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e1, code lost:
    
        if (r10.f371e != r6.b(r10.f369c)) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0503 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final S.f0 i(int r23, long r24) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.X.i(int, long):S.f0");
    }

    public final void j(f0 f0Var) {
        if (f0Var.f381o) {
            this.f308b.remove(f0Var);
        } else {
            this.f307a.remove(f0Var);
        }
        f0Var.f380n = null;
        f0Var.f381o = false;
        f0Var.f376j &= -33;
    }

    public final void k() {
        P p2 = this.f314h.f1569l;
        this.f312f = this.f311e + (p2 != null ? p2.f291j : 0);
        ArrayList arrayList = this.f309c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f312f; size--) {
            e(size);
        }
    }
}
