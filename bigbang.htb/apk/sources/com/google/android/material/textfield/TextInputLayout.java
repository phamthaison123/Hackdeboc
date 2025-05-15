package com.google.android.material.textfield;

import D.j;
import F.AbstractC0022x;
import F.AbstractC0023y;
import F.AbstractC0024z;
import F.B;
import F.O;
import U.i;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import e.z;
import h0.b;
import h0.c;
import h0.k;
import i.AbstractC0146g0;
import i.C0;
import i.C0178x;
import i.C0181y0;
import i.RunnableC0151j;
import i.X;
import j0.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m0.g;
import m0.h;
import m0.l;
import o0.m;
import o0.o;
import o0.r;
import o0.s;
import o0.t;
import o0.u;
import o0.v;
import w.d;
import w.e;
import y.AbstractC0237a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f1877A;
    public ColorStateList A0;

    /* renamed from: B, reason: collision with root package name */
    public final X f1878B;
    public int B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1879C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1880D;
    public int D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1881E;
    public int E0;

    /* renamed from: F, reason: collision with root package name */
    public h f1882F;
    public int F0;

    /* renamed from: G, reason: collision with root package name */
    public h f1883G;
    public boolean G0;

    /* renamed from: H, reason: collision with root package name */
    public final l f1884H;
    public final b H0;

    /* renamed from: I, reason: collision with root package name */
    public final int f1885I;
    public boolean I0;

    /* renamed from: J, reason: collision with root package name */
    public int f1886J;
    public boolean J0;

    /* renamed from: K, reason: collision with root package name */
    public int f1887K;
    public ValueAnimator K0;

    /* renamed from: L, reason: collision with root package name */
    public int f1888L;
    public boolean L0;

    /* renamed from: M, reason: collision with root package name */
    public int f1889M;
    public boolean M0;

    /* renamed from: N, reason: collision with root package name */
    public int f1890N;

    /* renamed from: O, reason: collision with root package name */
    public int f1891O;

    /* renamed from: P, reason: collision with root package name */
    public int f1892P;

    /* renamed from: Q, reason: collision with root package name */
    public final Rect f1893Q;

    /* renamed from: R, reason: collision with root package name */
    public final Rect f1894R;

    /* renamed from: S, reason: collision with root package name */
    public final RectF f1895S;

    /* renamed from: T, reason: collision with root package name */
    public Typeface f1896T;

    /* renamed from: U, reason: collision with root package name */
    public final CheckableImageButton f1897U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f1898V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f1899W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1900a;

    /* renamed from: a0, reason: collision with root package name */
    public PorterDuff.Mode f1901a0;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f1902b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1903b0;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f1904c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1905c0;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f1906d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1907d0;

    /* renamed from: e, reason: collision with root package name */
    public EditText f1908e;

    /* renamed from: e0, reason: collision with root package name */
    public View.OnLongClickListener f1909e0;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1910f;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet f1911f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1912g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1913g0;

    /* renamed from: h, reason: collision with root package name */
    public int f1914h;

    /* renamed from: h0, reason: collision with root package name */
    public final SparseArray f1915h0;

    /* renamed from: i, reason: collision with root package name */
    public final o f1916i;

    /* renamed from: i0, reason: collision with root package name */
    public final CheckableImageButton f1917i0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1918j;

    /* renamed from: j0, reason: collision with root package name */
    public final LinkedHashSet f1919j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1920k;
    public ColorStateList k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1921l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1922l0;

    /* renamed from: m, reason: collision with root package name */
    public X f1923m;

    /* renamed from: m0, reason: collision with root package name */
    public PorterDuff.Mode f1924m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1925n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f1926n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1927o;

    /* renamed from: o0, reason: collision with root package name */
    public ColorDrawable f1928o0;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1929p;

    /* renamed from: p0, reason: collision with root package name */
    public int f1930p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1931q;

    /* renamed from: q0, reason: collision with root package name */
    public Drawable f1932q0;

    /* renamed from: r, reason: collision with root package name */
    public X f1933r;
    public View.OnLongClickListener r0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f1934s;
    public View.OnLongClickListener s0;

    /* renamed from: t, reason: collision with root package name */
    public int f1935t;
    public final CheckableImageButton t0;

    /* renamed from: u, reason: collision with root package name */
    public i f1936u;
    public ColorStateList u0;

    /* renamed from: v, reason: collision with root package name */
    public i f1937v;
    public ColorStateList v0;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f1938w;
    public ColorStateList w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f1939x;
    public int x0;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1940y;
    public int y0;

    /* renamed from: z, reason: collision with root package name */
    public final X f1941z;
    public int z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05e7  */
    /* JADX WARN: Type inference failed for: r2v135 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r29, android.util.AttributeSet r30) {
        /*
            Method dump skipped, instructions count: 1603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = drawable.mutate();
            if (z2) {
                drawable.setTintList(colorStateList);
            }
            if (z3) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private m getEndIconDelegate() {
        SparseArray sparseArray = this.f1915h0;
        m mVar = (m) sparseArray.get(this.f1913g0);
        return mVar != null ? mVar : (m) sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.t0;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.f1913g0 == 0 || !g()) {
            return null;
        }
        return this.f1917i0;
    }

    public static void j(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z2);
            }
        }
    }

    public static void l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = O.f58a;
        boolean a2 = AbstractC0022x.a(checkableImageButton);
        boolean z2 = onLongClickListener != null;
        boolean z3 = a2 || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z2);
        AbstractC0023y.s(checkableImageButton, z3 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        boolean z2;
        boolean z3;
        if (this.f1908e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f1913g0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1908e = editText;
        setMinWidth(this.f1912g);
        setMaxWidth(this.f1914h);
        h();
        setTextInputAccessibilityDelegate(new s(this));
        Typeface typeface = this.f1908e.getTypeface();
        b bVar = this.H0;
        a aVar = bVar.f2568v;
        if (aVar != null) {
            aVar.f2971e = true;
        }
        if (bVar.f2565s != typeface) {
            bVar.f2565s = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar.f2566t != typeface) {
            bVar.f2566t = typeface;
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            bVar.g();
        }
        float textSize = this.f1908e.getTextSize();
        if (bVar.f2555i != textSize) {
            bVar.f2555i = textSize;
            bVar.g();
        }
        int gravity = this.f1908e.getGravity();
        int i2 = (gravity & (-113)) | 48;
        if (bVar.f2554h != i2) {
            bVar.f2554h = i2;
            bVar.g();
        }
        if (bVar.f2553g != gravity) {
            bVar.f2553g = gravity;
            bVar.g();
        }
        this.f1908e.addTextChangedListener(new C0(2, this));
        if (this.v0 == null) {
            this.v0 = this.f1908e.getHintTextColors();
        }
        if (this.f1879C) {
            if (TextUtils.isEmpty(this.f1880D)) {
                CharSequence hint = this.f1908e.getHint();
                this.f1910f = hint;
                setHint(hint);
                this.f1908e.setHint((CharSequence) null);
            }
            this.f1881E = true;
        }
        if (this.f1923m != null) {
            n(this.f1908e.getText().length());
        }
        q();
        this.f1916i.b();
        this.f1902b.bringToFront();
        this.f1904c.bringToFront();
        this.f1906d.bringToFront();
        this.t0.bringToFront();
        Iterator it = this.f1911f0.iterator();
        while (it.hasNext()) {
            ((o0.a) ((t) it.next())).a(this);
        }
        u();
        x();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        s(false, true);
    }

    private void setErrorIconVisible(boolean z2) {
        this.t0.setVisibility(z2 ? 0 : 8);
        this.f1906d.setVisibility(z2 ? 8 : 0);
        x();
        if (this.f1913g0 != 0) {
            return;
        }
        p();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1880D)) {
            return;
        }
        this.f1880D = charSequence;
        b bVar = this.H0;
        if (charSequence == null || !TextUtils.equals(bVar.f2569w, charSequence)) {
            bVar.f2569w = charSequence;
            bVar.f2570x = null;
            Bitmap bitmap = bVar.f2572z;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f2572z = null;
            }
            bVar.g();
        }
        if (this.G0) {
            return;
        }
        i();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f1931q == z2) {
            return;
        }
        if (z2) {
            X x2 = new X(getContext(), null);
            this.f1933r = x2;
            x2.setId(2131296661);
            i iVar = new i();
            iVar.f612x = 3;
            iVar.f634c = 87L;
            LinearInterpolator linearInterpolator = Y.a.f706a;
            iVar.f635d = linearInterpolator;
            this.f1936u = iVar;
            iVar.f633b = 67L;
            i iVar2 = new i();
            iVar2.f612x = 3;
            iVar2.f634c = 87L;
            iVar2.f635d = linearInterpolator;
            this.f1937v = iVar2;
            X x3 = this.f1933r;
            WeakHashMap weakHashMap = O.f58a;
            B.f(x3, 1);
            setPlaceholderTextAppearance(this.f1935t);
            setPlaceholderTextColor(this.f1934s);
            X x4 = this.f1933r;
            if (x4 != null) {
                this.f1900a.addView(x4);
                this.f1933r.setVisibility(0);
            }
        } else {
            X x5 = this.f1933r;
            if (x5 != null) {
                x5.setVisibility(8);
            }
            this.f1933r = null;
        }
        this.f1931q = z2;
    }

    public final void a(float f2) {
        int i2 = 2;
        b bVar = this.H0;
        if (bVar.f2549c == f2) {
            return;
        }
        if (this.K0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.K0 = valueAnimator;
            valueAnimator.setInterpolator(Y.a.f707b);
            this.K0.setDuration(167L);
            this.K0.addUpdateListener(new b0.a(i2, this));
        }
        this.K0.setFloatValues(bVar.f2549c, f2);
        this.K0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1900a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    public final void b() {
        int i2;
        int i3;
        int i4;
        h hVar = this.f1882F;
        if (hVar == null) {
            return;
        }
        hVar.setShapeAppearanceModel(this.f1884H);
        if (this.f1886J == 2 && (i3 = this.f1888L) > -1 && (i4 = this.f1891O) != 0) {
            h hVar2 = this.f1882F;
            hVar2.f3094a.f3082k = i3;
            hVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i4);
            g gVar = hVar2.f3094a;
            if (gVar.f3075d != valueOf) {
                gVar.f3075d = valueOf;
                hVar2.onStateChange(hVar2.getState());
            }
        }
        int i5 = this.f1892P;
        if (this.f1886J == 1) {
            TypedValue l2 = k.l(getContext(), 2130968802);
            i5 = AbstractC0237a.b(this.f1892P, l2 != null ? l2.data : 0);
        }
        this.f1892P = i5;
        this.f1882F.k(ColorStateList.valueOf(i5));
        if (this.f1913g0 == 3) {
            this.f1908e.getBackground().invalidateSelf();
        }
        h hVar3 = this.f1883G;
        if (hVar3 != null) {
            if (this.f1888L > -1 && (i2 = this.f1891O) != 0) {
                hVar3.k(ColorStateList.valueOf(i2));
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        d(this.f1917i0, this.f1922l0, this.k0, this.f1926n0, this.f1924m0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f1908e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f1910f != null) {
            boolean z2 = this.f1881E;
            this.f1881E = false;
            CharSequence hint = editText.getHint();
            this.f1908e.setHint(this.f1910f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f1908e.setHint(hint);
                this.f1881E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.f1900a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure newChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(newChild, i2);
            if (childAt == this.f1908e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.M0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1879C) {
            b bVar = this.H0;
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f2570x != null && bVar.f2548b) {
                bVar.f2544N.getLineLeft(0);
                bVar.f2535E.setTextSize(bVar.f2532B);
                float f2 = bVar.f2563q;
                float f3 = bVar.f2564r;
                float f4 = bVar.f2531A;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                canvas.translate(f2, f3);
                bVar.f2544N.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        h hVar = this.f1883G;
        if (hVar != null) {
            Rect bounds = hVar.getBounds();
            bounds.top = bounds.bottom - this.f1888L;
            this.f1883G.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.L0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.L0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            h0.b r3 = r4.H0
            if (r3 == 0) goto L2f
            r3.f2533C = r1
            android.content.res.ColorStateList r1 = r3.f2558l
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f2557k
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.g()
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f1908e
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = F.O.f58a
            boolean r3 = F.B.c(r4)
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.s(r0, r2)
        L47:
            r4.q()
            r4.z()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.L0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        float c2;
        if (!this.f1879C) {
            return 0;
        }
        int i2 = this.f1886J;
        b bVar = this.H0;
        if (i2 == 0 || i2 == 1) {
            c2 = bVar.c();
        } else {
            if (i2 != 2) {
                return 0;
            }
            c2 = bVar.c() / 2.0f;
        }
        return (int) c2;
    }

    public final boolean f() {
        return this.f1879C && !TextUtils.isEmpty(this.f1880D) && (this.f1882F instanceof o0.g);
    }

    public final boolean g() {
        return this.f1906d.getVisibility() == 0 && this.f1917i0.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1908e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public h getBoxBackground() {
        int i2 = this.f1886J;
        if (i2 == 1 || i2 == 2) {
            return this.f1882F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1892P;
    }

    public int getBoxBackgroundMode() {
        return this.f1886J;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1887K;
    }

    public float getBoxCornerRadiusBottomEnd() {
        h hVar = this.f1882F;
        return hVar.f3094a.f3072a.f3136h.a(hVar.g());
    }

    public float getBoxCornerRadiusBottomStart() {
        h hVar = this.f1882F;
        return hVar.f3094a.f3072a.f3135g.a(hVar.g());
    }

    public float getBoxCornerRadiusTopEnd() {
        h hVar = this.f1882F;
        return hVar.f3094a.f3072a.f3134f.a(hVar.g());
    }

    public float getBoxCornerRadiusTopStart() {
        h hVar = this.f1882F;
        return hVar.f3094a.f3072a.f3133e.a(hVar.g());
    }

    public int getBoxStrokeColor() {
        return this.z0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0;
    }

    public int getBoxStrokeWidth() {
        return this.f1889M;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1890N;
    }

    public int getCounterMaxLength() {
        return this.f1920k;
    }

    public CharSequence getCounterOverflowDescription() {
        X x2;
        if (this.f1918j && this.f1921l && (x2 = this.f1923m) != null) {
            return x2.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1938w;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1938w;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.v0;
    }

    public EditText getEditText() {
        return this.f1908e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1917i0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1917i0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f1913g0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1917i0;
    }

    public CharSequence getError() {
        o oVar = this.f1916i;
        if (oVar.f3412k) {
            return oVar.f3411j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1916i.f3414m;
    }

    public int getErrorCurrentTextColors() {
        X x2 = this.f1916i.f3413l;
        if (x2 != null) {
            return x2.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.t0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        X x2 = this.f1916i.f3413l;
        if (x2 != null) {
            return x2.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        o oVar = this.f1916i;
        if (oVar.f3418q) {
            return oVar.f3417p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        X x2 = this.f1916i.f3419r;
        if (x2 != null) {
            return x2.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1879C) {
            return this.f1880D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.H0.c();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.H0;
        return bVar.d(bVar.f2558l);
    }

    public ColorStateList getHintTextColor() {
        return this.w0;
    }

    public int getMaxWidth() {
        return this.f1914h;
    }

    public int getMinWidth() {
        return this.f1912g;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1917i0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1917i0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1931q) {
            return this.f1929p;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1935t;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1934s;
    }

    public CharSequence getPrefixText() {
        return this.f1940y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1941z.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1941z;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1897U.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1897U.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f1877A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1878B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1878B;
    }

    public Typeface getTypeface() {
        return this.f1896T;
    }

    public final void h() {
        int i2 = this.f1886J;
        if (i2 != 0) {
            l lVar = this.f1884H;
            if (i2 == 1) {
                this.f1882F = new h(lVar);
                this.f1883G = new h();
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException(this.f1886J + " is illegal; only @BoxBackgroundMode constants are supported.");
                }
                if (!this.f1879C || (this.f1882F instanceof o0.g)) {
                    this.f1882F = new h(lVar);
                } else {
                    this.f1882F = new o0.g(lVar);
                }
                this.f1883G = null;
            }
        } else {
            this.f1882F = null;
            this.f1883G = null;
        }
        EditText editText = this.f1908e;
        if (editText != null && this.f1882F != null && editText.getBackground() == null && this.f1886J != 0) {
            EditText editText2 = this.f1908e;
            h hVar = this.f1882F;
            WeakHashMap weakHashMap = O.f58a;
            AbstractC0023y.q(editText2, hVar);
        }
        z();
        if (this.f1886J == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1887K = getResources().getDimensionPixelSize(2131165523);
            } else if (k.i(getContext())) {
                this.f1887K = getResources().getDimensionPixelSize(2131165522);
            }
        }
        if (this.f1908e != null && this.f1886J == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.f1908e;
                WeakHashMap weakHashMap2 = O.f58a;
                AbstractC0024z.k(editText3, AbstractC0024z.f(editText3), getResources().getDimensionPixelSize(2131165521), AbstractC0024z.e(this.f1908e), getResources().getDimensionPixelSize(2131165520));
            } else if (k.i(getContext())) {
                EditText editText4 = this.f1908e;
                WeakHashMap weakHashMap3 = O.f58a;
                AbstractC0024z.k(editText4, AbstractC0024z.f(editText4), getResources().getDimensionPixelSize(2131165519), AbstractC0024z.e(this.f1908e), getResources().getDimensionPixelSize(2131165518));
            }
        }
        if (this.f1886J != 0) {
            r();
        }
    }

    public final void i() {
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        if (f()) {
            RectF rectF = this.f1895S;
            int width = this.f1908e.getWidth();
            int gravity = this.f1908e.getGravity();
            b bVar = this.H0;
            CharSequence charSequence = bVar.f2569w;
            WeakHashMap weakHashMap = O.f58a;
            boolean c2 = (AbstractC0024z.d(bVar.f2547a) == 1 ? D.i.f53d : D.i.f52c).c(charSequence, charSequence.length());
            bVar.f2571y = c2;
            Rect rect = bVar.f2551e;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c2) {
                        i3 = rect.left;
                        f4 = i3;
                    } else {
                        f2 = rect.right;
                        f3 = bVar.f2545O;
                    }
                } else if (c2) {
                    f2 = rect.right;
                    f3 = bVar.f2545O;
                } else {
                    i3 = rect.left;
                    f4 = i3;
                }
                rectF.left = f4;
                float f6 = rect.top;
                rectF.top = f6;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (bVar.f2545O / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c2) {
                        f5 = f4 + bVar.f2545O;
                    } else {
                        i2 = rect.right;
                        f5 = i2;
                    }
                } else if (c2) {
                    i2 = rect.right;
                    f5 = i2;
                } else {
                    f5 = bVar.f2545O + f4;
                }
                rectF.right = f5;
                rectF.bottom = bVar.c() + f6;
                float f7 = rectF.left;
                float f8 = this.f1885I;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1888L);
                o0.g gVar = (o0.g) this.f1882F;
                gVar.getClass();
                gVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f2 = width / 2.0f;
            f3 = bVar.f2545O / 2.0f;
            f4 = f2 - f3;
            rectF.left = f4;
            float f62 = rect.top;
            rectF.top = f62;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (bVar.f2545O / 2.0f);
            rectF.right = f5;
            rectF.bottom = bVar.c() + f62;
            float f72 = rectF.left;
            float f82 = this.f1885I;
            rectF.left = f72 - f82;
            rectF.right += f82;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1888L);
            o0.g gVar2 = (o0.g) this.f1882F;
            gVar2.getClass();
            gVar2.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final void k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public final void m(TextView textView, int i2) {
        try {
            textView.setTextAppearance(i2);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2131820918);
        Context context = getContext();
        Object obj = e.f3731a;
        textView.setTextColor(d.a(context, 2131099723));
    }

    public final void n(int i2) {
        boolean z2 = this.f1921l;
        int i3 = this.f1920k;
        String str = null;
        if (i3 == -1) {
            this.f1923m.setText(String.valueOf(i2));
            this.f1923m.setContentDescription(null);
            this.f1921l = false;
        } else {
            this.f1921l = i2 > i3;
            Context context = getContext();
            this.f1923m.setContentDescription(context.getString(this.f1921l ? 2131755041 : 2131755040, Integer.valueOf(i2), Integer.valueOf(this.f1920k)));
            if (z2 != this.f1921l) {
                o();
            }
            String str2 = D.b.f36d;
            Locale locale = Locale.getDefault();
            int i4 = j.f54a;
            D.b bVar = TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? D.b.f39g : D.b.f38f;
            X x2 = this.f1923m;
            String string = getContext().getString(2131755042, Integer.valueOf(i2), Integer.valueOf(this.f1920k));
            if (string == null) {
                bVar.getClass();
            } else {
                str = bVar.c(string, bVar.f42c).toString();
            }
            x2.setText(str);
        }
        if (this.f1908e == null || z2 == this.f1921l) {
            return;
        }
        s(false, false);
        z();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        X x2 = this.f1923m;
        if (x2 != null) {
            m(x2, this.f1921l ? this.f1925n : this.f1927o);
            if (!this.f1921l && (colorStateList2 = this.f1938w) != null) {
                this.f1923m.setTextColor(colorStateList2);
            }
            if (!this.f1921l || (colorStateList = this.f1939x) == null) {
                return;
            }
            this.f1923m.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f1908e;
        if (editText != null) {
            ThreadLocal threadLocal = c.f2573a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1893Q;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = c.f2573a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = c.f2574b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            h hVar = this.f1883G;
            if (hVar != null) {
                int i6 = rect.bottom;
                hVar.setBounds(rect.left, i6 - this.f1890N, rect.right, i6);
            }
            if (this.f1879C) {
                float textSize = this.f1908e.getTextSize();
                b bVar = this.H0;
                if (bVar.f2555i != textSize) {
                    bVar.f2555i = textSize;
                    bVar.g();
                }
                int gravity = this.f1908e.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (bVar.f2554h != i7) {
                    bVar.f2554h = i7;
                    bVar.g();
                }
                if (bVar.f2553g != gravity) {
                    bVar.f2553g = gravity;
                    bVar.g();
                }
                if (this.f1908e == null) {
                    throw new IllegalStateException();
                }
                WeakHashMap weakHashMap = O.f58a;
                boolean z3 = AbstractC0024z.d(this) == 1;
                int i8 = rect.bottom;
                Rect rect2 = this.f1894R;
                rect2.bottom = i8;
                int i9 = this.f1886J;
                X x2 = this.f1941z;
                if (i9 == 1) {
                    int compoundPaddingLeft = this.f1908e.getCompoundPaddingLeft() + rect.left;
                    if (this.f1940y != null && !z3) {
                        compoundPaddingLeft = (compoundPaddingLeft - x2.getMeasuredWidth()) + x2.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft;
                    rect2.top = rect.top + this.f1887K;
                    int compoundPaddingRight = rect.right - this.f1908e.getCompoundPaddingRight();
                    if (this.f1940y != null && z3) {
                        compoundPaddingRight += x2.getMeasuredWidth() - x2.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight;
                } else if (i9 != 2) {
                    int compoundPaddingLeft2 = this.f1908e.getCompoundPaddingLeft() + rect.left;
                    if (this.f1940y != null && !z3) {
                        compoundPaddingLeft2 = (compoundPaddingLeft2 - x2.getMeasuredWidth()) + x2.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft2;
                    rect2.top = getPaddingTop();
                    int compoundPaddingRight2 = rect.right - this.f1908e.getCompoundPaddingRight();
                    if (this.f1940y != null && z3) {
                        compoundPaddingRight2 += x2.getMeasuredWidth() - x2.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight2;
                } else {
                    rect2.left = this.f1908e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - e();
                    rect2.right = rect.right - this.f1908e.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = bVar.f2551e;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    bVar.f2534D = true;
                    bVar.f();
                }
                if (this.f1908e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f2536F;
                textPaint.setTextSize(bVar.f2555i);
                textPaint.setTypeface(bVar.f2566t);
                textPaint.setLetterSpacing(0.0f);
                float f2 = -textPaint.ascent();
                rect2.left = this.f1908e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1886J != 1 || this.f1908e.getMinLines() > 1) ? rect.top + this.f1908e.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f1908e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1886J != 1 || this.f1908e.getMinLines() > 1) ? rect.bottom - this.f1908e.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = bVar.f2550d;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    bVar.f2534D = true;
                    bVar.f();
                }
                bVar.g();
                if (!f() || this.G0) {
                    return;
                }
                i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        EditText editText;
        int max;
        super.onMeasure(i2, i3);
        int i4 = 1;
        boolean z2 = false;
        if (this.f1908e != null && this.f1908e.getMeasuredHeight() < (max = Math.max(this.f1904c.getMeasuredHeight(), this.f1902b.getMeasuredHeight()))) {
            this.f1908e.setMinimumHeight(max);
            z2 = true;
        }
        boolean p2 = p();
        if (z2 || p2) {
            this.f1908e.post(new r(this, i4));
        }
        if (this.f1933r != null && (editText = this.f1908e) != null) {
            this.f1933r.setGravity(editText.getGravity());
            this.f1933r.setPadding(this.f1908e.getCompoundPaddingLeft(), this.f1908e.getCompoundPaddingTop(), this.f1908e.getCompoundPaddingRight(), this.f1908e.getCompoundPaddingBottom());
        }
        u();
        x();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        super.onRestoreInstanceState(vVar.f173a);
        setError(vVar.f3432c);
        if (vVar.f3433d) {
            this.f1917i0.post(new r(this, 0));
        }
        setHint(vVar.f3434e);
        setHelperText(vVar.f3435f);
        setPlaceholderText(vVar.f3436g);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        if (this.f1916i.e()) {
            vVar.f3432c = getError();
        }
        vVar.f3433d = this.f1913g0 != 0 && this.f1917i0.f1857d;
        vVar.f3434e = getHint();
        vVar.f3435f = getHelperText();
        vVar.f3436g = getPlaceholderText();
        return vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        X x2;
        PorterDuffColorFilter g2;
        PorterDuffColorFilter g3;
        EditText editText = this.f1908e;
        if (editText == null || this.f1886J != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC0146g0.a(background)) {
            background = background.mutate();
        }
        o oVar = this.f1916i;
        if (oVar.e()) {
            X x3 = oVar.f3413l;
            int currentTextColor = x3 != null ? x3.getCurrentTextColor() : -1;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C0178x.f2945b;
            synchronized (C0178x.class) {
                g3 = C0181y0.g(currentTextColor, mode);
            }
            background.setColorFilter(g3);
            return;
        }
        if (!this.f1921l || (x2 = this.f1923m) == null) {
            background.clearColorFilter();
            this.f1908e.refreshDrawableState();
            return;
        }
        int currentTextColor2 = x2.getCurrentTextColor();
        PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
        PorterDuff.Mode mode4 = C0178x.f2945b;
        synchronized (C0178x.class) {
            g2 = C0181y0.g(currentTextColor2, mode3);
        }
        background.setColorFilter(g2);
    }

    public final void r() {
        if (this.f1886J != 1) {
            FrameLayout frameLayout = this.f1900a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e2 = e();
            if (e2 != layoutParams.topMargin) {
                layoutParams.topMargin = e2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void s(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        X x2;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1908e;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1908e;
        boolean z5 = editText2 != null && editText2.hasFocus();
        o oVar = this.f1916i;
        boolean e2 = oVar.e();
        ColorStateList colorStateList2 = this.v0;
        b bVar = this.H0;
        if (colorStateList2 != null) {
            bVar.h(colorStateList2);
            ColorStateList colorStateList3 = this.v0;
            if (bVar.f2557k != colorStateList3) {
                bVar.f2557k = colorStateList3;
                bVar.g();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.v0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.F0) : this.F0;
            bVar.h(ColorStateList.valueOf(colorForState));
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (bVar.f2557k != valueOf) {
                bVar.f2557k = valueOf;
                bVar.g();
            }
        } else if (e2) {
            X x3 = oVar.f3413l;
            bVar.h(x3 != null ? x3.getTextColors() : null);
        } else if (this.f1921l && (x2 = this.f1923m) != null) {
            bVar.h(x2.getTextColors());
        } else if (z5 && (colorStateList = this.w0) != null) {
            bVar.h(colorStateList);
        }
        if (z4 || !this.I0 || (isEnabled() && z5)) {
            if (z3 || this.G0) {
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.K0.cancel();
                }
                if (z2 && this.J0) {
                    a(1.0f);
                } else {
                    bVar.i(1.0f);
                }
                this.G0 = false;
                if (f()) {
                    i();
                }
                EditText editText3 = this.f1908e;
                t(editText3 != null ? editText3.getText().length() : 0);
                v();
                y();
                return;
            }
            return;
        }
        if (z3 || !this.G0) {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.K0.cancel();
            }
            if (z2 && this.J0) {
                a(0.0f);
            } else {
                bVar.i(0.0f);
            }
            if (f() && (!((o0.g) this.f1882F).f3372y.isEmpty()) && f()) {
                ((o0.g) this.f1882F).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.G0 = true;
            X x4 = this.f1933r;
            if (x4 != null && this.f1931q) {
                x4.setText((CharSequence) null);
                U.t.a(this.f1900a, this.f1937v);
                this.f1933r.setVisibility(4);
            }
            v();
            y();
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f1892P != i2) {
            this.f1892P = i2;
            this.B0 = i2;
            this.D0 = i2;
            this.E0 = i2;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        Context context = getContext();
        Object obj = e.f3731a;
        setBoxBackgroundColor(d.a(context, i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.B0 = defaultColor;
        this.f1892P = defaultColor;
        this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.E0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.f1886J) {
            return;
        }
        this.f1886J = i2;
        if (this.f1908e != null) {
            h();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f1887K = i2;
    }

    public void setBoxStrokeColor(int i2) {
        if (this.z0 != i2) {
            this.z0 = i2;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.x0 = colorStateList.getDefaultColor();
            this.F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.y0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.z0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.z0 != colorStateList.getDefaultColor()) {
            this.z0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f1889M = i2;
        z();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f1890N = i2;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1918j != z2) {
            o oVar = this.f1916i;
            if (z2) {
                X x2 = new X(getContext(), null);
                this.f1923m = x2;
                x2.setId(2131296658);
                Typeface typeface = this.f1896T;
                if (typeface != null) {
                    this.f1923m.setTypeface(typeface);
                }
                this.f1923m.setMaxLines(1);
                oVar.a(this.f1923m, 2);
                ((ViewGroup.MarginLayoutParams) this.f1923m.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131165720));
                o();
                if (this.f1923m != null) {
                    EditText editText = this.f1908e;
                    n(editText == null ? 0 : editText.getText().length());
                }
            } else {
                oVar.h(this.f1923m, 2);
                this.f1923m = null;
            }
            this.f1918j = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f1920k != i2) {
            if (i2 > 0) {
                this.f1920k = i2;
            } else {
                this.f1920k = -1;
            }
            if (!this.f1918j || this.f1923m == null) {
                return;
            }
            EditText editText = this.f1908e;
            n(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f1925n != i2) {
            this.f1925n = i2;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1939x != colorStateList) {
            this.f1939x = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f1927o != i2) {
            this.f1927o = i2;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1938w != colorStateList) {
            this.f1938w = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.w0 = colorStateList;
        if (this.f1908e != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        j(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f1917i0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1917i0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? B.a.A(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.f1913g0;
        this.f1913g0 = i2;
        Iterator it = this.f1919j0.iterator();
        while (true) {
            if (!it.hasNext()) {
                setEndIconVisible(i2 != 0);
                if (getEndIconDelegate().b(this.f1886J)) {
                    getEndIconDelegate().a();
                    c();
                    return;
                } else {
                    throw new IllegalStateException("The current box background mode " + this.f1886J + " is not supported by the end icon mode " + i2);
                }
            }
            o0.b bVar = (o0.b) ((u) it.next());
            int i4 = bVar.f3358a;
            m mVar = bVar.f3359b;
            switch (i4) {
                case 0:
                    EditText editText = getEditText();
                    if (editText != null && i3 == 2) {
                        editText.post(new RunnableC0151j(8, bVar, editText));
                        o0.e eVar = (o0.e) mVar;
                        if (editText.getOnFocusChangeListener() == eVar.f3365f) {
                            editText.setOnFocusChangeListener(null);
                        }
                        CheckableImageButton checkableImageButton = eVar.f3395c;
                        if (checkableImageButton.getOnFocusChangeListener() != eVar.f3365f) {
                            break;
                        } else {
                            checkableImageButton.setOnFocusChangeListener(null);
                            break;
                        }
                    }
                    break;
                case 1:
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                    if (autoCompleteTextView != null && i3 == 3) {
                        autoCompleteTextView.post(new RunnableC0151j(10, bVar, autoCompleteTextView));
                        if (autoCompleteTextView.getOnFocusChangeListener() == ((o0.l) mVar).f3381f) {
                            autoCompleteTextView.setOnFocusChangeListener(null);
                        }
                        autoCompleteTextView.setOnTouchListener(null);
                        autoCompleteTextView.setOnDismissListener(null);
                        break;
                    }
                    break;
                default:
                    EditText editText2 = getEditText();
                    if (editText2 != null && i3 == 1) {
                        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        editText2.post(new RunnableC0151j(11, bVar, editText2));
                        break;
                    }
                    break;
            }
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.r0;
        CheckableImageButton checkableImageButton = this.f1917i0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.r0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f1917i0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            this.k0 = colorStateList;
            this.f1922l0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f1924m0 != mode) {
            this.f1924m0 = mode;
            this.f1926n0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (g() != z2) {
            this.f1917i0.setVisibility(z2 ? 0 : 8);
            x();
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        o oVar = this.f1916i;
        if (!oVar.f3412k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            oVar.g();
            return;
        }
        oVar.c();
        oVar.f3411j = charSequence;
        oVar.f3413l.setText(charSequence);
        int i2 = oVar.f3409h;
        if (i2 != 1) {
            oVar.f3410i = 1;
        }
        oVar.j(i2, oVar.f3410i, oVar.i(oVar.f3413l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        o oVar = this.f1916i;
        oVar.f3414m = charSequence;
        X x2 = oVar.f3413l;
        if (x2 != null) {
            x2.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        o oVar = this.f1916i;
        if (oVar.f3412k == z2) {
            return;
        }
        oVar.c();
        TextInputLayout textInputLayout = oVar.f3403b;
        if (z2) {
            X x2 = new X(oVar.f3402a, null);
            oVar.f3413l = x2;
            x2.setId(2131296659);
            oVar.f3413l.setTextAlignment(5);
            Typeface typeface = oVar.f3422u;
            if (typeface != null) {
                oVar.f3413l.setTypeface(typeface);
            }
            int i2 = oVar.f3415n;
            oVar.f3415n = i2;
            X x3 = oVar.f3413l;
            if (x3 != null) {
                textInputLayout.m(x3, i2);
            }
            ColorStateList colorStateList = oVar.f3416o;
            oVar.f3416o = colorStateList;
            X x4 = oVar.f3413l;
            if (x4 != null && colorStateList != null) {
                x4.setTextColor(colorStateList);
            }
            CharSequence charSequence = oVar.f3414m;
            oVar.f3414m = charSequence;
            X x5 = oVar.f3413l;
            if (x5 != null) {
                x5.setContentDescription(charSequence);
            }
            oVar.f3413l.setVisibility(4);
            X x6 = oVar.f3413l;
            WeakHashMap weakHashMap = O.f58a;
            B.f(x6, 1);
            oVar.a(oVar.f3413l, 0);
        } else {
            oVar.g();
            oVar.h(oVar.f3413l, 0);
            oVar.f3413l = null;
            textInputLayout.q();
            textInputLayout.z();
        }
        oVar.f3412k = z2;
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? B.a.A(getContext(), i2) : null);
        k(this.t0, this.u0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.s0;
        CheckableImageButton checkableImageButton = this.t0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.s0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.t0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        CheckableImageButton checkableImageButton = this.t0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.t0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        o oVar = this.f1916i;
        oVar.f3415n = i2;
        X x2 = oVar.f3413l;
        if (x2 != null) {
            oVar.f3403b.m(x2, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        o oVar = this.f1916i;
        oVar.f3416o = colorStateList;
        X x2 = oVar.f3413l;
        if (x2 == null || colorStateList == null) {
            return;
        }
        x2.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.I0 != z2) {
            this.I0 = z2;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        o oVar = this.f1916i;
        if (isEmpty) {
            if (oVar.f3418q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!oVar.f3418q) {
            setHelperTextEnabled(true);
        }
        oVar.c();
        oVar.f3417p = charSequence;
        oVar.f3419r.setText(charSequence);
        int i2 = oVar.f3409h;
        if (i2 != 2) {
            oVar.f3410i = 2;
        }
        oVar.j(i2, oVar.f3410i, oVar.i(oVar.f3419r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        o oVar = this.f1916i;
        oVar.f3421t = colorStateList;
        X x2 = oVar.f3419r;
        if (x2 == null || colorStateList == null) {
            return;
        }
        x2.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        o oVar = this.f1916i;
        if (oVar.f3418q == z2) {
            return;
        }
        oVar.c();
        if (z2) {
            X x2 = new X(oVar.f3402a, null);
            oVar.f3419r = x2;
            x2.setId(2131296660);
            oVar.f3419r.setTextAlignment(5);
            Typeface typeface = oVar.f3422u;
            if (typeface != null) {
                oVar.f3419r.setTypeface(typeface);
            }
            oVar.f3419r.setVisibility(4);
            X x3 = oVar.f3419r;
            WeakHashMap weakHashMap = O.f58a;
            B.f(x3, 1);
            int i2 = oVar.f3420s;
            oVar.f3420s = i2;
            X x4 = oVar.f3419r;
            if (x4 != null) {
                x4.setTextAppearance(i2);
            }
            ColorStateList colorStateList = oVar.f3421t;
            oVar.f3421t = colorStateList;
            X x5 = oVar.f3419r;
            if (x5 != null && colorStateList != null) {
                x5.setTextColor(colorStateList);
            }
            oVar.a(oVar.f3419r, 1);
        } else {
            oVar.c();
            int i3 = oVar.f3409h;
            if (i3 == 2) {
                oVar.f3410i = 0;
            }
            oVar.j(i3, oVar.f3410i, oVar.i(oVar.f3419r, null));
            oVar.h(oVar.f3419r, 1);
            oVar.f3419r = null;
            TextInputLayout textInputLayout = oVar.f3403b;
            textInputLayout.q();
            textInputLayout.z();
        }
        oVar.f3418q = z2;
    }

    public void setHelperTextTextAppearance(int i2) {
        o oVar = this.f1916i;
        oVar.f3420s = i2;
        X x2 = oVar.f3419r;
        if (x2 != null) {
            x2.setTextAppearance(i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1879C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.J0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1879C) {
            this.f1879C = z2;
            if (z2) {
                CharSequence hint = this.f1908e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1880D)) {
                        setHint(hint);
                    }
                    this.f1908e.setHint((CharSequence) null);
                }
                this.f1881E = true;
            } else {
                this.f1881E = false;
                if (!TextUtils.isEmpty(this.f1880D) && TextUtils.isEmpty(this.f1908e.getHint())) {
                    this.f1908e.setHint(this.f1880D);
                }
                setHintInternal(null);
            }
            if (this.f1908e != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        b bVar = this.H0;
        View view = bVar.f2547a;
        j0.d dVar = new j0.d(view.getContext(), i2);
        ColorStateList colorStateList = dVar.f2986j;
        if (colorStateList != null) {
            bVar.f2558l = colorStateList;
        }
        float f2 = dVar.f2987k;
        if (f2 != 0.0f) {
            bVar.f2556j = f2;
        }
        ColorStateList colorStateList2 = dVar.f2977a;
        if (colorStateList2 != null) {
            bVar.f2542L = colorStateList2;
        }
        bVar.f2540J = dVar.f2981e;
        bVar.f2541K = dVar.f2982f;
        bVar.f2539I = dVar.f2983g;
        bVar.f2543M = dVar.f2985i;
        a aVar = bVar.f2568v;
        if (aVar != null) {
            aVar.f2971e = true;
        }
        z zVar = new z(29, bVar);
        dVar.a();
        bVar.f2568v = new a(zVar, dVar.f2990n);
        dVar.c(view.getContext(), bVar.f2568v);
        bVar.g();
        this.w0 = bVar.f2558l;
        if (this.f1908e != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            if (this.v0 == null) {
                this.H0.h(colorStateList);
            }
            this.w0 = colorStateList;
            if (this.f1908e != null) {
                s(false, false);
            }
        }
    }

    public void setMaxWidth(int i2) {
        this.f1914h = i2;
        EditText editText = this.f1908e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinWidth(int i2) {
        this.f1912g = i2;
        EditText editText = this.f1908e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? B.a.A(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.f1913g0 != 1) {
            setEndIconMode(1);
        } else {
            if (z2) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        this.f1922l0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f1924m0 = mode;
        this.f1926n0 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1931q && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1931q) {
                setPlaceholderTextEnabled(true);
            }
            this.f1929p = charSequence;
        }
        EditText editText = this.f1908e;
        t(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f1935t = i2;
        X x2 = this.f1933r;
        if (x2 != null) {
            x2.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1934s != colorStateList) {
            this.f1934s = colorStateList;
            X x2 = this.f1933r;
            if (x2 == null || colorStateList == null) {
                return;
            }
            x2.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f1940y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f1941z.setText(charSequence);
        v();
    }

    public void setPrefixTextAppearance(int i2) {
        this.f1941z.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1941z.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1897U.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? B.a.A(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f1909e0;
        CheckableImageButton checkableImageButton = this.f1897U;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f1909e0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f1897U;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f1898V != colorStateList) {
            this.f1898V = colorStateList;
            this.f1899W = true;
            d(this.f1897U, true, colorStateList, this.f1903b0, this.f1901a0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f1901a0 != mode) {
            this.f1901a0 = mode;
            this.f1903b0 = true;
            d(this.f1897U, this.f1899W, this.f1898V, true, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        CheckableImageButton checkableImageButton = this.f1897U;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            u();
            p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f1877A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f1878B.setText(charSequence);
        y();
    }

    public void setSuffixTextAppearance(int i2) {
        this.f1878B.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1878B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(s sVar) {
        EditText editText = this.f1908e;
        if (editText != null) {
            O.h(editText, sVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z2;
        if (typeface != this.f1896T) {
            this.f1896T = typeface;
            b bVar = this.H0;
            a aVar = bVar.f2568v;
            boolean z3 = true;
            if (aVar != null) {
                aVar.f2971e = true;
            }
            if (bVar.f2565s != typeface) {
                bVar.f2565s = typeface;
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVar.f2566t != typeface) {
                bVar.f2566t = typeface;
            } else {
                z3 = false;
            }
            if (z2 || z3) {
                bVar.g();
            }
            o oVar = this.f1916i;
            if (typeface != oVar.f3422u) {
                oVar.f3422u = typeface;
                X x2 = oVar.f3413l;
                if (x2 != null) {
                    x2.setTypeface(typeface);
                }
                X x3 = oVar.f3419r;
                if (x3 != null) {
                    x3.setTypeface(typeface);
                }
            }
            X x4 = this.f1923m;
            if (x4 != null) {
                x4.setTypeface(typeface);
            }
        }
    }

    public final void t(int i2) {
        FrameLayout frameLayout = this.f1900a;
        if (i2 != 0 || this.G0) {
            X x2 = this.f1933r;
            if (x2 == null || !this.f1931q) {
                return;
            }
            x2.setText((CharSequence) null);
            U.t.a(frameLayout, this.f1937v);
            this.f1933r.setVisibility(4);
            return;
        }
        X x3 = this.f1933r;
        if (x3 == null || !this.f1931q) {
            return;
        }
        x3.setText(this.f1929p);
        U.t.a(frameLayout, this.f1936u);
        this.f1933r.setVisibility(0);
        this.f1933r.bringToFront();
    }

    public final void u() {
        int f2;
        if (this.f1908e == null) {
            return;
        }
        if (this.f1897U.getVisibility() == 0) {
            f2 = 0;
        } else {
            EditText editText = this.f1908e;
            WeakHashMap weakHashMap = O.f58a;
            f2 = AbstractC0024z.f(editText);
        }
        X x2 = this.f1941z;
        int compoundPaddingTop = this.f1908e.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165527);
        int compoundPaddingBottom = this.f1908e.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = O.f58a;
        AbstractC0024z.k(x2, f2, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void v() {
        this.f1941z.setVisibility((this.f1940y == null || this.G0) ? 8 : 0);
        p();
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.A0.getDefaultColor();
        int colorForState = this.A0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.A0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1891O = colorForState2;
        } else if (z3) {
            this.f1891O = colorForState;
        } else {
            this.f1891O = defaultColor;
        }
    }

    public final void x() {
        int i2;
        if (this.f1908e == null) {
            return;
        }
        if (g() || this.t0.getVisibility() == 0) {
            i2 = 0;
        } else {
            EditText editText = this.f1908e;
            WeakHashMap weakHashMap = O.f58a;
            i2 = AbstractC0024z.e(editText);
        }
        X x2 = this.f1878B;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165527);
        int paddingTop = this.f1908e.getPaddingTop();
        int paddingBottom = this.f1908e.getPaddingBottom();
        WeakHashMap weakHashMap2 = O.f58a;
        AbstractC0024z.k(x2, dimensionPixelSize, paddingTop, i2, paddingBottom);
    }

    public final void y() {
        X x2 = this.f1878B;
        int visibility = x2.getVisibility();
        boolean z2 = (this.f1877A == null || this.G0) ? false : true;
        x2.setVisibility(z2 ? 0 : 8);
        if (visibility != x2.getVisibility()) {
            getEndIconDelegate().c(z2);
        }
        p();
    }

    public final void z() {
        X x2;
        EditText editText;
        EditText editText2;
        if (this.f1882F == null || this.f1886J == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f1908e) != null && editText2.hasFocus());
        boolean z4 = isHovered() || ((editText = this.f1908e) != null && editText.isHovered());
        boolean isEnabled = isEnabled();
        o oVar = this.f1916i;
        if (!isEnabled) {
            this.f1891O = this.F0;
        } else if (oVar.e()) {
            if (this.A0 != null) {
                w(z3, z4);
            } else {
                X x3 = oVar.f3413l;
                this.f1891O = x3 != null ? x3.getCurrentTextColor() : -1;
            }
        } else if (!this.f1921l || (x2 = this.f1923m) == null) {
            if (z3) {
                this.f1891O = this.z0;
            } else if (z4) {
                this.f1891O = this.y0;
            } else {
                this.f1891O = this.x0;
            }
        } else if (this.A0 != null) {
            w(z3, z4);
        } else {
            this.f1891O = x2.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && oVar.f3412k && oVar.e()) {
            z2 = true;
        }
        setErrorIconVisible(z2);
        k(this.t0, this.u0);
        k(this.f1897U, this.f1898V);
        ColorStateList colorStateList = this.k0;
        CheckableImageButton checkableImageButton = this.f1917i0;
        k(checkableImageButton, colorStateList);
        m endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof o0.l) {
            if (!oVar.e() || getEndIconDrawable() == null) {
                c();
            } else {
                Drawable mutate = getEndIconDrawable().mutate();
                X x4 = oVar.f3413l;
                mutate.setTint(x4 != null ? x4.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        int i2 = this.f1888L;
        if (z3 && isEnabled()) {
            this.f1888L = this.f1890N;
        } else {
            this.f1888L = this.f1889M;
        }
        if (this.f1888L != i2 && this.f1886J == 2 && f() && !this.G0) {
            if (f()) {
                ((o0.g) this.f1882F).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            i();
        }
        if (this.f1886J == 1) {
            if (!isEnabled()) {
                this.f1892P = this.C0;
            } else if (z4 && !z3) {
                this.f1892P = this.E0;
            } else if (z3) {
                this.f1892P = this.D0;
            } else {
                this.f1892P = this.B0;
            }
        }
        b();
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f1917i0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1917i0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            c();
            k(checkableImageButton, this.k0);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f1897U.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1897U;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            d(checkableImageButton, this.f1899W, this.f1898V, this.f1903b0, this.f1901a0);
            setStartIconVisible(true);
            k(checkableImageButton, this.f1898V);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.t0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f1916i.f3412k);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1917i0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1917i0.setImageDrawable(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }
}
