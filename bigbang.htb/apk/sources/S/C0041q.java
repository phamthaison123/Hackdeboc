package S;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: S.q, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0041q {

    /* renamed from: a, reason: collision with root package name */
    public int f496a;

    /* renamed from: b, reason: collision with root package name */
    public int f497b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f498c;

    /* renamed from: d, reason: collision with root package name */
    public int f499d;

    public final void a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i4 = this.f499d;
        int i5 = i4 * 2;
        int[] iArr = this.f498c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f498c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i5 >= iArr.length) {
            int[] iArr3 = new int[i4 * 4];
            this.f498c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f498c;
        iArr4[i5] = i2;
        iArr4[i5 + 1] = i3;
        this.f499d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f499d = 0;
        int[] iArr = this.f498c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        P p2 = recyclerView.f1569l;
        if (recyclerView.f1568k == null || p2 == null || !p2.f290i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1554d.g()) {
                p2.i(recyclerView.f1568k.a(), this);
            }
        } else if (!recyclerView.K()) {
            p2.h(this.f496a, this.f497b, recyclerView.f1553c0, this);
        }
        int i2 = this.f499d;
        if (i2 > p2.f291j) {
            p2.f291j = i2;
            p2.f292k = z2;
            recyclerView.f1550b.k();
        }
    }
}
