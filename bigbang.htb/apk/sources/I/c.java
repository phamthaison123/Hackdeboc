package I;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f143r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f144a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f145b;

    /* renamed from: c, reason: collision with root package name */
    public final View f146c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.activity.b f147d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f148e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f149f;

    /* renamed from: g, reason: collision with root package name */
    public final int f150g;

    /* renamed from: h, reason: collision with root package name */
    public final int f151h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f152i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f153j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f154k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f155l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f156m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f157n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f158o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f159p;

    /* renamed from: q, reason: collision with root package name */
    public final ListView f160q;

    public c(ListView listView) {
        a aVar = new a();
        aVar.f138e = Long.MIN_VALUE;
        aVar.f140g = -1L;
        aVar.f139f = 0L;
        this.f144a = aVar;
        this.f145b = new AccelerateInterpolator();
        this.f148e = new float[]{0.0f, 0.0f};
        this.f149f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f152i = new float[]{0.0f, 0.0f};
        this.f153j = new float[]{0.0f, 0.0f};
        this.f154k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f146c = listView;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f154k;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f153j;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f150g = 1;
        float[] fArr3 = this.f149f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f148e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f152i;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f151h = f143r;
        aVar.f134a = 500;
        aVar.f135b = 500;
        this.f160q = listView;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f148e
            r0 = r0[r7]
            float[] r1 = r3.f149f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f145b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f152i
            r0 = r0[r7]
            float[] r1 = r3.f153j
            r1 = r1[r7]
            float[] r3 = r3.f154k
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = b(r4, r1, r3)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r2 = -r3
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: I.c.a(float, float, float, int):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f150g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (this.f158o && i2 == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f159p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.e()
            goto L7c
        L1a:
            r7.f157n = r2
            r7.f155l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f146c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            I.a r9 = r7.f144a
            r9.f136c = r0
            r9.f137d = r8
            boolean r8 = r7.f158o
            if (r8 != 0) goto L7c
            boolean r8 = r7.f()
            if (r8 == 0) goto L7c
            androidx.activity.b r8 = r7.f147d
            if (r8 != 0) goto L60
            androidx.activity.b r8 = new androidx.activity.b
            r9 = 5
            r8.<init>(r9, r7)
            r7.f147d = r8
        L60:
            r7.f158o = r2
            r7.f156m = r2
            boolean r8 = r7.f155l
            if (r8 != 0) goto L75
            int r8 = r7.f151h
            if (r8 <= 0) goto L75
            androidx.activity.b r9 = r7.f147d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = F.O.f58a
            F.AbstractC0023y.n(r4, r9, r5)
            goto L7a
        L75:
            androidx.activity.b r8 = r7.f147d
            r8.run()
        L7a:
            r7.f155l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I.c.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i2 = 0;
        if (this.f156m) {
            this.f158o = false;
            return;
        }
        a aVar = this.f144a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f138e);
        int i4 = aVar.f135b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f142i = i2;
        aVar.f141h = aVar.a(currentAnimationTimeMillis);
        aVar.f140g = currentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        a aVar = this.f144a;
        float f2 = aVar.f137d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f136c);
        if (abs == 0 || (count = (listView = this.f160q).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
