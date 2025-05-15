package S;

import F.AbstractC0024z;
import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: S.p, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0040p extends M implements T {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f466C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f467D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f468A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC0036l f469B;

    /* renamed from: a, reason: collision with root package name */
    public final int f470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f471b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f472c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f474e;

    /* renamed from: f, reason: collision with root package name */
    public final int f475f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f476g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f477h;

    /* renamed from: i, reason: collision with root package name */
    public final int f478i;

    /* renamed from: j, reason: collision with root package name */
    public final int f479j;

    /* renamed from: k, reason: collision with root package name */
    public int f480k;

    /* renamed from: l, reason: collision with root package name */
    public int f481l;

    /* renamed from: m, reason: collision with root package name */
    public float f482m;

    /* renamed from: n, reason: collision with root package name */
    public int f483n;

    /* renamed from: o, reason: collision with root package name */
    public int f484o;

    /* renamed from: p, reason: collision with root package name */
    public float f485p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f488s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f495z;

    /* renamed from: q, reason: collision with root package name */
    public int f486q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f487r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f489t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f490u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f491v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f492w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f493x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f494y = new int[2];

    public C0040p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f495z = ofFloat;
        this.f468A = 0;
        RunnableC0036l runnableC0036l = new RunnableC0036l(0, this);
        this.f469B = runnableC0036l;
        C0037m c0037m = new C0037m(this);
        this.f472c = stateListDrawable;
        this.f473d = drawable;
        this.f476g = stateListDrawable2;
        this.f477h = drawable2;
        this.f474e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f475f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f478i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f479j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f470a = i3;
        this.f471b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0038n(this));
        ofFloat.addUpdateListener(new C0039o(this));
        RecyclerView recyclerView2 = this.f488s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            P p2 = recyclerView2.f1569l;
            if (p2 != null) {
                p2.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1571m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f488s;
            recyclerView3.f1573n.remove(this);
            if (recyclerView3.f1575o == this) {
                recyclerView3.f1575o = null;
            }
            ArrayList arrayList2 = this.f488s.f1557e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0037m);
            }
            this.f488s.removeCallbacks(runnableC0036l);
        }
        this.f488s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f488s.f1573n.add(this);
            this.f488s.h(c0037m);
        }
    }

    public static int e(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    @Override // S.M
    public final void b(Canvas canvas) {
        if (this.f486q != this.f488s.getWidth() || this.f487r != this.f488s.getHeight()) {
            this.f486q = this.f488s.getWidth();
            this.f487r = this.f488s.getHeight();
            f(0);
            return;
        }
        if (this.f468A != 0) {
            if (this.f489t) {
                int i2 = this.f486q;
                int i3 = this.f474e;
                int i4 = i2 - i3;
                int i5 = this.f481l;
                int i6 = this.f480k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f472c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f487r;
                int i9 = this.f475f;
                Drawable drawable = this.f473d;
                drawable.setBounds(0, 0, i9, i8);
                RecyclerView recyclerView = this.f488s;
                WeakHashMap weakHashMap = F.O.f58a;
                if (AbstractC0024z.d(recyclerView) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f490u) {
                int i10 = this.f487r;
                int i11 = this.f478i;
                int i12 = i10 - i11;
                int i13 = this.f484o;
                int i14 = this.f483n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f476g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f486q;
                int i17 = this.f479j;
                Drawable drawable2 = this.f477h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f487r - this.f478i) {
            int i2 = this.f484o;
            int i3 = this.f483n;
            if (f2 >= i2 - (i3 / 2) && f2 <= (i3 / 2) + i2) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f488s;
        WeakHashMap weakHashMap = F.O.f58a;
        boolean z2 = AbstractC0024z.d(recyclerView) == 1;
        int i2 = this.f474e;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f486q - i2) {
            return false;
        }
        int i3 = this.f481l;
        int i4 = this.f480k / 2;
        return f3 >= ((float) (i3 - i4)) && f3 <= ((float) (i4 + i3));
    }

    public final void f(int i2) {
        RunnableC0036l runnableC0036l = this.f469B;
        StateListDrawable stateListDrawable = this.f472c;
        if (i2 == 2 && this.f491v != 2) {
            stateListDrawable.setState(f466C);
            this.f488s.removeCallbacks(runnableC0036l);
        }
        if (i2 == 0) {
            this.f488s.invalidate();
        } else {
            g();
        }
        if (this.f491v == 2 && i2 != 2) {
            stateListDrawable.setState(f467D);
            this.f488s.removeCallbacks(runnableC0036l);
            this.f488s.postDelayed(runnableC0036l, 1200);
        } else if (i2 == 1) {
            this.f488s.removeCallbacks(runnableC0036l);
            this.f488s.postDelayed(runnableC0036l, 1500);
        }
        this.f491v = i2;
    }

    public final void g() {
        int i2 = this.f468A;
        ValueAnimator valueAnimator = this.f495z;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f468A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
