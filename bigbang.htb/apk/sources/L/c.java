package L;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f188a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f189b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f190c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.e f191d;

    public c(boolean z2, m0.e eVar) {
        this.f190c = z2;
        this.f191d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f191d.getClass();
        Rect rect = this.f188a;
        ((G.d) obj).d(rect);
        Rect rect2 = this.f189b;
        ((G.d) obj2).d(rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        boolean z2 = this.f190c;
        if (i4 < i5) {
            return z2 ? 1 : -1;
        }
        if (i4 > i5) {
            return z2 ? -1 : 1;
        }
        int i6 = rect.bottom;
        int i7 = rect2.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if (i8 < i9) {
            return z2 ? 1 : -1;
        }
        if (i8 > i9) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
