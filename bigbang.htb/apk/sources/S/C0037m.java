package S;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: S.m, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0037m extends U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0040p f440a;

    public C0037m(C0040p c0040p) {
        this.f440a = c0040p;
    }

    @Override // S.U
    public final void b(RecyclerView recyclerView, int i2, int i3) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0040p c0040p = this.f440a;
        int computeVerticalScrollRange = c0040p.f488s.computeVerticalScrollRange();
        int i4 = c0040p.f487r;
        int i5 = computeVerticalScrollRange - i4;
        int i6 = c0040p.f470a;
        c0040p.f489t = i5 > 0 && i4 >= i6;
        int computeHorizontalScrollRange = c0040p.f488s.computeHorizontalScrollRange();
        int i7 = c0040p.f486q;
        boolean z2 = computeHorizontalScrollRange - i7 > 0 && i7 >= i6;
        c0040p.f490u = z2;
        boolean z3 = c0040p.f489t;
        if (!z3 && !z2) {
            if (c0040p.f491v != 0) {
                c0040p.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i4;
            c0040p.f481l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0040p.f480k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (c0040p.f490u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i7;
            c0040p.f484o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0040p.f483n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
        }
        int i8 = c0040p.f491v;
        if (i8 == 0 || i8 == 1) {
            c0040p.f(1);
        }
    }
}
