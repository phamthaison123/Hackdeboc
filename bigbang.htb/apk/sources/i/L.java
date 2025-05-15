package i;

import F.AbstractC0024z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import d.AbstractC0092a;
import e.C0097c;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class L extends C0130G {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f2648d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2649e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f2650f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2651g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2652h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2653i;

    public L(SeekBar seekBar) {
        super(seekBar);
        this.f2650f = null;
        this.f2651g = null;
        this.f2652h = false;
        this.f2653i = false;
        this.f2648d = seekBar;
    }

    @Override // i.C0130G
    public final void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, 2130969341);
        SeekBar seekBar = this.f2648d;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC0092a.f2012g;
        C0097c t2 = C0097c.t(context, attributeSet, iArr, 2130969341, 0);
        Context context2 = seekBar.getContext();
        TypedArray typedArray = (TypedArray) t2.f2079b;
        WeakHashMap weakHashMap = F.O.f58a;
        F.J.c(seekBar, context2, iArr, attributeSet, typedArray, 2130969341, 0);
        Drawable h2 = t2.h(0);
        if (h2 != null) {
            seekBar.setThumb(h2);
        }
        Drawable g2 = t2.g(1);
        Drawable drawable = this.f2649e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2649e = g2;
        if (g2 != null) {
            g2.setCallback(seekBar);
            g2.setLayoutDirection(AbstractC0024z.d(seekBar));
            if (g2.isStateful()) {
                g2.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (t2.r(3)) {
            this.f2651g = AbstractC0146g0.c(t2.j(3, -1), this.f2651g);
            this.f2653i = true;
        }
        if (t2.r(2)) {
            this.f2650f = t2.b(2);
            this.f2652h = true;
        }
        t2.u();
        c();
    }

    public final void c() {
        Drawable drawable = this.f2649e;
        if (drawable != null) {
            if (this.f2652h || this.f2653i) {
                Drawable mutate = drawable.mutate();
                this.f2649e = mutate;
                if (this.f2652h) {
                    mutate.setTintList(this.f2650f);
                }
                if (this.f2653i) {
                    this.f2649e.setTintMode(this.f2651g);
                }
                if (this.f2649e.isStateful()) {
                    this.f2649e.setState(this.f2648d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f2649e != null) {
            int max = this.f2648d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2649e.getIntrinsicWidth();
                int intrinsicHeight = this.f2649e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2649e.setBounds(-i2, -i3, i2, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f2649e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
