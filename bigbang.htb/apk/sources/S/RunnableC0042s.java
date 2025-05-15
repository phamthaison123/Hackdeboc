package S;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import s.C0220g;

/* renamed from: S.s, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0042s implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f512e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C0220g f513f = new C0220g(2);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f514a;

    /* renamed from: b, reason: collision with root package name */
    public long f515b;

    /* renamed from: c, reason: collision with root package name */
    public long f516c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f517d;

    public static f0 c(RecyclerView recyclerView, int i2, long j2) {
        int h2 = recyclerView.f1556e.h();
        for (int i3 = 0; i3 < h2; i3++) {
            f0 I2 = RecyclerView.I(recyclerView.f1556e.g(i3));
            if (I2.f369c == i2 && !I2.h()) {
                return null;
            }
        }
        X x2 = recyclerView.f1550b;
        try {
            recyclerView.P();
            f0 i4 = x2.i(i2, j2);
            if (i4 != null) {
                if (!i4.g() || i4.h()) {
                    x2.a(i4, false);
                } else {
                    x2.f(i4.f367a);
                }
            }
            recyclerView.Q(false);
            return i4;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1577p && this.f515b == 0) {
            this.f515b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0041q c0041q = recyclerView.f1551b0;
        c0041q.f496a = i2;
        c0041q.f497b = i3;
    }

    public final void b(long j2) {
        r rVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        r rVar2;
        ArrayList arrayList = this.f514a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0041q c0041q = recyclerView3.f1551b0;
                c0041q.b(recyclerView3, false);
                i2 += c0041q.f499d;
            }
        }
        ArrayList arrayList2 = this.f517d;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0041q c0041q2 = recyclerView4.f1551b0;
                int abs = Math.abs(c0041q2.f497b) + Math.abs(c0041q2.f496a);
                for (int i6 = 0; i6 < c0041q2.f499d * 2; i6 += 2) {
                    if (i4 >= arrayList2.size()) {
                        rVar2 = new r();
                        arrayList2.add(rVar2);
                    } else {
                        rVar2 = (r) arrayList2.get(i4);
                    }
                    int[] iArr = c0041q2.f498c;
                    int i7 = iArr[i6 + 1];
                    rVar2.f504a = i7 <= abs;
                    rVar2.f505b = abs;
                    rVar2.f506c = i7;
                    rVar2.f507d = recyclerView4;
                    rVar2.f508e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(arrayList2, f513f);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (rVar = (r) arrayList2.get(i8)).f507d) != null; i8++) {
            f0 c2 = c(recyclerView, rVar.f508e, rVar.f504a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f368b != null && c2.g() && !c2.h() && (recyclerView2 = (RecyclerView) c2.f368b.get()) != null) {
                if (recyclerView2.f1588y && recyclerView2.f1556e.h() != 0) {
                    L l2 = recyclerView2.f1532H;
                    if (l2 != null) {
                        l2.e();
                    }
                    P p2 = recyclerView2.f1569l;
                    X x2 = recyclerView2.f1550b;
                    if (p2 != null) {
                        p2.b0(x2);
                        recyclerView2.f1569l.c0(x2);
                    }
                    x2.f307a.clear();
                    x2.d();
                }
                C0041q c0041q3 = recyclerView2.f1551b0;
                c0041q3.b(recyclerView2, true);
                if (c0041q3.f499d != 0) {
                    try {
                        Trace.beginSection("RV Nested Prefetch");
                        c0 c0Var = recyclerView2.f1553c0;
                        G g2 = recyclerView2.f1568k;
                        c0Var.f337d = 1;
                        c0Var.f338e = g2.a();
                        c0Var.f340g = false;
                        c0Var.f341h = false;
                        c0Var.f342i = false;
                        for (int i9 = 0; i9 < c0041q3.f499d * 2; i9 += 2) {
                            c(recyclerView2, c0041q3.f498c[i9], j2);
                        }
                        rVar.f504a = false;
                        rVar.f505b = 0;
                        rVar.f506c = 0;
                        rVar.f507d = null;
                        rVar.f508e = 0;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            rVar.f504a = false;
            rVar.f505b = 0;
            rVar.f506c = 0;
            rVar.f507d = null;
            rVar.f508e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f514a;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f516c);
        } finally {
            this.f515b = 0L;
            Trace.endSection();
        }
    }
}
