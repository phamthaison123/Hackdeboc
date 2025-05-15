package S;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: S.z, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0049z {

    /* renamed from: a, reason: collision with root package name */
    public int f553a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f554b;

    /* renamed from: c, reason: collision with root package name */
    public P f555c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f556d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f557e;

    /* renamed from: f, reason: collision with root package name */
    public View f558f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f559g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f560h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f561i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f562j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f563k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f564l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f565m;

    /* renamed from: n, reason: collision with root package name */
    public float f566n;

    /* renamed from: o, reason: collision with root package name */
    public int f567o;

    /* renamed from: p, reason: collision with root package name */
    public int f568p;

    public C0049z(Context context) {
        a0 a0Var = new a0();
        a0Var.f323d = -1;
        a0Var.f325f = false;
        a0Var.f326g = 0;
        a0Var.f320a = 0;
        a0Var.f321b = 0;
        a0Var.f322c = Integer.MIN_VALUE;
        a0Var.f324e = null;
        this.f559g = a0Var;
        this.f561i = new LinearInterpolator();
        this.f562j = new DecelerateInterpolator();
        this.f565m = false;
        this.f567o = 0;
        this.f568p = 0;
        this.f564l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    public float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int c(int i2) {
        float abs = Math.abs(i2);
        if (!this.f565m) {
            this.f566n = b(this.f564l);
            this.f565m = true;
        }
        return (int) Math.ceil(abs * this.f566n);
    }

    public final PointF d(int i2) {
        Object obj = this.f555c;
        if (obj instanceof b0) {
            return ((b0) obj).a(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void e(int i2, int i3) {
        PointF d2;
        RecyclerView recyclerView = this.f554b;
        if (this.f553a == -1 || recyclerView == null) {
            g();
        }
        if (this.f556d && this.f558f == null && this.f555c != null && (d2 = d(this.f553a)) != null) {
            float f2 = d2.x;
            if (f2 != 0.0f || d2.y != 0.0f) {
                recyclerView.Z((int) Math.signum(f2), (int) Math.signum(d2.y), null);
            }
        }
        this.f556d = false;
        View view = this.f558f;
        a0 a0Var = this.f559g;
        if (view != null) {
            this.f554b.getClass();
            f0 I2 = RecyclerView.I(view);
            if ((I2 != null ? I2.c() : -1) == this.f553a) {
                f(this.f558f, recyclerView.f1553c0, a0Var);
                a0Var.a(recyclerView);
                g();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f558f = null;
            }
        }
        if (this.f557e) {
            c0 c0Var = recyclerView.f1553c0;
            if (this.f554b.f1569l.v() == 0) {
                g();
            } else {
                int i4 = this.f567o;
                int i5 = i4 - i2;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.f567o = i5;
                int i6 = this.f568p;
                int i7 = i6 - i3;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f568p = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF d3 = d(this.f553a);
                    if (d3 != null) {
                        if (d3.x != 0.0f || d3.y != 0.0f) {
                            float f3 = d3.y;
                            float sqrt = (float) Math.sqrt((f3 * f3) + (r10 * r10));
                            float f4 = d3.x / sqrt;
                            d3.x = f4;
                            float f5 = d3.y / sqrt;
                            d3.y = f5;
                            this.f563k = d3;
                            this.f567o = (int) (f4 * 10000.0f);
                            this.f568p = (int) (f5 * 10000.0f);
                            int c2 = c(10000);
                            LinearInterpolator linearInterpolator = this.f561i;
                            a0Var.f320a = (int) (this.f567o * 1.2f);
                            a0Var.f321b = (int) (this.f568p * 1.2f);
                            a0Var.f322c = (int) (c2 * 1.2f);
                            a0Var.f324e = linearInterpolator;
                            a0Var.f325f = true;
                        }
                    }
                    a0Var.f323d = this.f553a;
                    g();
                }
            }
            boolean z2 = a0Var.f323d >= 0;
            a0Var.a(recyclerView);
            if (z2 && this.f557e) {
                this.f556d = true;
                recyclerView.f1547W.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.view.View r10, S.c0 r11, S.a0 r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.C0049z.f(android.view.View, S.c0, S.a0):void");
    }

    public final void g() {
        if (this.f557e) {
            this.f557e = false;
            this.f568p = 0;
            this.f567o = 0;
            this.f563k = null;
            this.f554b.f1553c0.f334a = -1;
            this.f558f = null;
            this.f553a = -1;
            this.f556d = false;
            P p2 = this.f555c;
            if (p2.f286e == this) {
                p2.f286e = null;
            }
            this.f555c = null;
            this.f554b = null;
        }
    }
}
