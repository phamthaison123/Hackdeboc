package S;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C extends C0049z {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f256q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f257r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Object obj, Context context, int i2) {
        super(context);
        this.f256q = i2;
        this.f257r = obj;
    }

    @Override // S.C0049z
    public final float b(DisplayMetrics displayMetrics) {
        switch (this.f256q) {
        }
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // S.C0049z
    public final int c(int i2) {
        switch (this.f256q) {
            case 0:
                return Math.min(100, super.c(i2));
            default:
                return super.c(i2);
        }
    }

    @Override // S.C0049z
    public final void f(View view, c0 c0Var, a0 a0Var) {
        switch (this.f256q) {
            case 0:
                D d2 = (D) this.f257r;
                int[] a2 = d2.a(d2.f258a.getLayoutManager(), view);
                int i2 = a2[0];
                int i3 = a2[1];
                int ceil = (int) Math.ceil(c(Math.max(Math.abs(i2), Math.abs(i3))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f562j;
                    a0Var.f320a = i2;
                    a0Var.f321b = i3;
                    a0Var.f322c = ceil;
                    a0Var.f324e = decelerateInterpolator;
                    a0Var.f325f = true;
                    break;
                }
                break;
            default:
                super.f(view, c0Var, a0Var);
                break;
        }
    }
}
