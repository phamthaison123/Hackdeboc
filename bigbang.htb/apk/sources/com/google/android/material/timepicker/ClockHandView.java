package com.google.android.material.timepicker;

import F.AbstractC0023y;
import F.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1958a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1959b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1960c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f1961d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f1962e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1963f;

    /* renamed from: g, reason: collision with root package name */
    public float f1964g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1965h;

    /* renamed from: i, reason: collision with root package name */
    public double f1966i;

    /* renamed from: j, reason: collision with root package name */
    public int f1967j;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969206);
        this.f1958a = new ArrayList();
        Paint paint = new Paint();
        this.f1961d = paint;
        this.f1962e = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f684e, 2130969206, 2131821549);
        this.f1967j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1959b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1963f = getResources().getDimensionPixelSize(2131165504);
        this.f1960c = r4.getDimensionPixelSize(2131165502);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f2) {
        b(f2);
    }

    public final void b(float f2) {
        float f3 = f2 % 360.0f;
        this.f1964g = f3;
        this.f1966i = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        float cos = (this.f1967j * ((float) Math.cos(this.f1966i))) + (getWidth() / 2);
        float sin = (this.f1967j * ((float) Math.sin(this.f1966i))) + height;
        float f4 = this.f1959b;
        this.f1962e.set(cos - f4, sin - f4, cos + f4, sin + f4);
        Iterator it = this.f1958a.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f1948E - f3) > 0.001f) {
                clockFaceView.f1948E = f3;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.f1967j * ((float) Math.cos(this.f1966i))) + width;
        float f2 = height;
        float sin = (this.f1967j * ((float) Math.sin(this.f1966i))) + f2;
        Paint paint = this.f1961d;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f1959b, paint);
        double sin2 = Math.sin(this.f1966i);
        double cos2 = Math.cos(this.f1966i);
        paint.setStrokeWidth(this.f1963f);
        canvas.drawLine(width, f2, r1 + ((int) (cos2 * r11)), height + ((int) (r11 * sin2)), paint);
        canvas.drawCircle(width, f2, this.f1960c, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        a(this.f1964g);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked == 0) {
            this.f1965h = false;
            z2 = true;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z3 = this.f1965h;
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
        }
        boolean z5 = this.f1965h;
        int degrees = (int) Math.toDegrees(Math.atan2(y2 - (getHeight() / 2), x2 - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f2 = i2;
        boolean z6 = this.f1964g != f2;
        if (!z2 || !z6) {
            if (z6 || z3) {
                a(f2);
            }
            this.f1965h = z5 | z4;
            return true;
        }
        z4 = true;
        this.f1965h = z5 | z4;
        return true;
    }
}
