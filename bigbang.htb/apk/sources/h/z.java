package h;

import F.AbstractC0024z;
import F.O;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2518a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2519b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2520c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2521d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2522e;

    /* renamed from: f, reason: collision with root package name */
    public View f2523f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2525h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0114A f2526i;

    /* renamed from: j, reason: collision with root package name */
    public x f2527j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2528k;

    /* renamed from: g, reason: collision with root package name */
    public int f2524g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final y f2529l = new y(this);

    public z(int i2, int i3, Context context, View view, o oVar, boolean z2) {
        this.f2518a = context;
        this.f2519b = oVar;
        this.f2523f = view;
        this.f2520c = z2;
        this.f2521d = i2;
        this.f2522e = i3;
    }

    public final x a() {
        x g2;
        if (this.f2527j == null) {
            Context context = this.f2518a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                g2 = new i(this.f2518a, this.f2523f, this.f2521d, this.f2522e, this.f2520c);
            } else {
                View view = this.f2523f;
                g2 = new G(this.f2521d, this.f2522e, this.f2518a, view, this.f2519b, this.f2520c);
            }
            g2.l(this.f2519b);
            g2.r(this.f2529l);
            g2.n(this.f2523f);
            g2.e(this.f2526i);
            g2.o(this.f2525h);
            g2.p(this.f2524g);
            this.f2527j = g2;
        }
        return this.f2527j;
    }

    public final boolean b() {
        x xVar = this.f2527j;
        return xVar != null && xVar.a();
    }

    public void c() {
        this.f2527j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2528k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        x a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f2524g;
            View view = this.f2523f;
            WeakHashMap weakHashMap = O.f58a;
            if ((Gravity.getAbsoluteGravity(i4, AbstractC0024z.d(view)) & 7) == 5) {
                i2 -= this.f2523f.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f2518a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2516a = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.i();
    }
}
