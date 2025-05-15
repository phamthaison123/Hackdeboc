package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import d.AbstractC0092a;
import java.util.WeakHashMap;

/* renamed from: i.t0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0171t0 implements h.F {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2898a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2899b;

    /* renamed from: c, reason: collision with root package name */
    public C0150i0 f2900c;

    /* renamed from: f, reason: collision with root package name */
    public int f2903f;

    /* renamed from: g, reason: collision with root package name */
    public int f2904g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2906i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2907j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2908k;

    /* renamed from: n, reason: collision with root package name */
    public C0166q0 f2911n;

    /* renamed from: o, reason: collision with root package name */
    public View f2912o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2913p;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f2918u;

    /* renamed from: w, reason: collision with root package name */
    public Rect f2920w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2921x;

    /* renamed from: y, reason: collision with root package name */
    public final C0129F f2922y;

    /* renamed from: d, reason: collision with root package name */
    public final int f2901d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2902e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f2905h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2909l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2910m = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public final RunnableC0162o0 f2914q = new RunnableC0162o0(this, 2);

    /* renamed from: r, reason: collision with root package name */
    public final ViewOnTouchListenerC0169s0 f2915r = new ViewOnTouchListenerC0169s0(this);

    /* renamed from: s, reason: collision with root package name */
    public final C0167r0 f2916s = new C0167r0(this);

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC0162o0 f2917t = new RunnableC0162o0(this, 1);

    /* renamed from: v, reason: collision with root package name */
    public final Rect f2919v = new Rect();

    public C0171t0(Context context, AttributeSet attributeSet, int i2, int i3) {
        int resourceId;
        this.f2898a = context;
        this.f2918u = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0092a.f2020o, i2, i3);
        this.f2903f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2904g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2906i = true;
        }
        obtainStyledAttributes.recycle();
        C0129F c0129f = new C0129F(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0092a.f2024s, i2, i3);
        if (obtainStyledAttributes2.hasValue(2)) {
            I.h.c(c0129f, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0129f.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : B.a.A(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2922y = c0129f;
        c0129f.setInputMethodMode(1);
    }

    @Override // h.F
    public final boolean a() {
        return this.f2922y.isShowing();
    }

    public final void c(int i2) {
        this.f2903f = i2;
    }

    public final int d() {
        return this.f2903f;
    }

    @Override // h.F
    public final void dismiss() {
        C0129F c0129f = this.f2922y;
        c0129f.dismiss();
        c0129f.setContentView(null);
        this.f2900c = null;
        this.f2918u.removeCallbacks(this.f2914q);
    }

    @Override // h.F
    public final C0150i0 f() {
        return this.f2900c;
    }

    @Override // h.F
    public final void i() {
        int i2;
        int paddingBottom;
        C0150i0 c0150i0;
        C0150i0 c0150i02 = this.f2900c;
        C0129F c0129f = this.f2922y;
        Context context = this.f2898a;
        if (c0150i02 == null) {
            C0150i0 q2 = q(context, !this.f2921x);
            this.f2900c = q2;
            q2.setAdapter(this.f2899b);
            this.f2900c.setOnItemClickListener(this.f2913p);
            this.f2900c.setFocusable(true);
            this.f2900c.setFocusableInTouchMode(true);
            this.f2900c.setOnItemSelectedListener(new C0164p0(0, this));
            this.f2900c.setOnScrollListener(this.f2916s);
            c0129f.setContentView(this.f2900c);
        }
        Drawable background = c0129f.getBackground();
        Rect rect = this.f2919v;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f2906i) {
                this.f2904g = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = c0129f.getMaxAvailableHeight(this.f2912o, this.f2904g, c0129f.getInputMethodMode() == 2);
        int i4 = this.f2901d;
        if (i4 == -1) {
            paddingBottom = maxAvailableHeight + i2;
        } else {
            int i5 = this.f2902e;
            int a2 = this.f2900c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
            paddingBottom = a2 + (a2 > 0 ? this.f2900c.getPaddingBottom() + this.f2900c.getPaddingTop() + i2 : 0);
        }
        boolean z2 = this.f2922y.getInputMethodMode() == 2;
        I.h.d(c0129f, this.f2905h);
        if (c0129f.isShowing()) {
            View view = this.f2912o;
            WeakHashMap weakHashMap = F.O.f58a;
            if (F.B.b(view)) {
                int i6 = this.f2902e;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.f2912o.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0129f.setWidth(this.f2902e == -1 ? -1 : 0);
                        c0129f.setHeight(0);
                    } else {
                        c0129f.setWidth(this.f2902e == -1 ? -1 : 0);
                        c0129f.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                c0129f.setOutsideTouchable(true);
                View view2 = this.f2912o;
                int i7 = this.f2903f;
                int i8 = this.f2904g;
                if (i6 < 0) {
                    i6 = -1;
                }
                c0129f.update(view2, i7, i8, i6, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int i9 = this.f2902e;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = this.f2912o.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        c0129f.setWidth(i9);
        c0129f.setHeight(i4);
        c0129f.setIsClippedToScreen(true);
        c0129f.setOutsideTouchable(true);
        c0129f.setTouchInterceptor(this.f2915r);
        if (this.f2908k) {
            I.h.c(c0129f, this.f2907j);
        }
        c0129f.setEpicenterBounds(this.f2920w);
        I.g.a(c0129f, this.f2912o, this.f2903f, this.f2904g, this.f2909l);
        this.f2900c.setSelection(-1);
        if ((!this.f2921x || this.f2900c.isInTouchMode()) && (c0150i0 = this.f2900c) != null) {
            c0150i0.setListSelectionHidden(true);
            c0150i0.requestLayout();
        }
        if (this.f2921x) {
            return;
        }
        this.f2918u.post(this.f2917t);
    }

    public final int j() {
        if (this.f2906i) {
            return this.f2904g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2922y.setBackgroundDrawable(drawable);
    }

    public final void l(int i2) {
        this.f2904g = i2;
        this.f2906i = true;
    }

    public final Drawable n() {
        return this.f2922y.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        C0166q0 c0166q0 = this.f2911n;
        if (c0166q0 == null) {
            this.f2911n = new C0166q0(0, this);
        } else {
            ListAdapter listAdapter2 = this.f2899b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0166q0);
            }
        }
        this.f2899b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2911n);
        }
        C0150i0 c0150i0 = this.f2900c;
        if (c0150i0 != null) {
            c0150i0.setAdapter(this.f2899b);
        }
    }

    public C0150i0 q(Context context, boolean z2) {
        return new C0150i0(context, z2);
    }

    public final void r(int i2) {
        Drawable background = this.f2922y.getBackground();
        if (background == null) {
            this.f2902e = i2;
            return;
        }
        Rect rect = this.f2919v;
        background.getPadding(rect);
        this.f2902e = rect.left + rect.right + i2;
    }
}
