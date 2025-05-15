package S;

import android.graphics.Rect;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public final P f253a;

    /* renamed from: b, reason: collision with root package name */
    public int f254b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f255c = new Rect();

    public B(P p2) {
        this.f253a = p2;
    }

    public static A a(P p2, int i2) {
        if (i2 == 0) {
            return new A(p2, 0);
        }
        int i3 = 1;
        if (i2 == 1) {
            return new A(p2, i3);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public final int h() {
        if (Integer.MIN_VALUE == this.f254b) {
            return 0;
        }
        return g() - this.f254b;
    }

    public abstract int i(View view);

    public abstract int j(View view);

    public abstract void k(int i2);
}
