package i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import h.ViewTreeObserverOnGlobalLayoutListenerC0120e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class T extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2710i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final r f2711a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2712b;

    /* renamed from: c, reason: collision with root package name */
    public final C0153k f2713c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f2714d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2715e;

    /* renamed from: f, reason: collision with root package name */
    public final S f2716f;

    /* renamed from: g, reason: collision with root package name */
    public int f2717g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f2718h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130969372(0x7f04031c, float:1.7547424E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f2718h = r1
            android.content.Context r1 = r11.getContext()
            i.Q0.a(r11, r1)
            int[] r1 = d.AbstractC0092a.f2027v
            r2 = 0
            e.c r3 = e.C0097c.t(r12, r13, r1, r0, r2)
            i.r r4 = new i.r
            r4.<init>(r11)
            r11.f2711a = r4
            r4 = 4
            int r4 = r3.m(r4, r2)
            if (r4 == 0) goto L31
            g.e r5 = new g.e
            r5.<init>(r12, r4)
            r11.f2712b = r5
            goto L33
        L31:
            r11.f2712b = r12
        L33:
            r4 = -1
            r5 = 0
            int[] r6 = i.T.f2710i     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            boolean r7 = r6.hasValue(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            if (r7 == 0) goto L4c
            int r4 = r6.getInt(r2, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            goto L4c
        L46:
            r11 = move-exception
            r5 = r6
            goto Ld5
        L4a:
            r7 = move-exception
            goto L55
        L4c:
            r6.recycle()
            goto L5f
        L50:
            r11 = move-exception
            goto Ld5
        L53:
            r7 = move-exception
            r6 = r5
        L55:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L5f
            goto L4c
        L5f:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L99
            if (r4 == r7) goto L66
            goto La6
        L66:
            i.P r4 = new i.P
            android.content.Context r8 = r11.f2712b
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.f2712b
            e.c r1 = e.C0097c.t(r8, r13, r1, r0, r2)
            java.lang.Object r8 = r1.f2079b
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f2717g = r8
            android.graphics.drawable.Drawable r8 = r1.g(r7)
            r4.k(r8)
            java.lang.String r6 = r3.o(r6)
            r4.f2679z = r6
            r1.u()
            r11.f2716f = r4
            i.k r1 = new i.k
            r1.<init>(r11, r11, r4, r7)
            r11.f2713c = r1
            goto La6
        L99:
            i.M r1 = new i.M
            r1.<init>(r11)
            r11.f2716f = r1
            java.lang.String r4 = r3.o(r6)
            r1.f2657c = r4
        La6:
            java.lang.Object r1 = r3.f2079b
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            java.lang.CharSequence[] r1 = r1.getTextArray(r2)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r4, r1)
            r12 = 2131492967(0x7f0c0067, float:1.86094E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter(r2)
        Lc1:
            r3.u()
            r11.f2715e = r7
            android.widget.SpinnerAdapter r12 = r11.f2714d
            if (r12 == 0) goto Lcf
            r11.setAdapter(r12)
            r11.f2714d = r5
        Lcf:
            i.r r11 = r11.f2711a
            r11.e(r13, r0)
            return
        Ld5:
            if (r5 == 0) goto Lda
            r5.recycle()
        Lda:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i.T.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.f2718h;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2711a;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        S s2 = this.f2716f;
        return s2 != null ? s2.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        S s2 = this.f2716f;
        return s2 != null ? s2.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2716f != null ? this.f2717g : super.getDropDownWidth();
    }

    public final S getInternalPopup() {
        return this.f2716f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        S s2 = this.f2716f;
        return s2 != null ? s2.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2712b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        S s2 = this.f2716f;
        return s2 != null ? s2.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2711a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2711a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        S s2 = this.f2716f;
        if (s2 == null || !s2.a()) {
            return;
        }
        s2.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2716f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        Q q2 = (Q) parcelable;
        super.onRestoreInstanceState(q2.getSuperState());
        if (!q2.f2697a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0120e(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        Q q2 = new Q(super.onSaveInstanceState());
        S s2 = this.f2716f;
        q2.f2697a = s2 != null && s2.a();
        return q2;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0153k c0153k = this.f2713c;
        if (c0153k == null || !c0153k.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        S s2 = this.f2716f;
        if (s2 == null) {
            return super.performClick();
        }
        if (s2.a()) {
            return true;
        }
        this.f2716f.e(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2711a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r rVar = this.f2711a;
        if (rVar != null) {
            rVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        S s2 = this.f2716f;
        if (s2 == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            s2.p(i2);
            s2.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        S s2 = this.f2716f;
        if (s2 != null) {
            s2.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2716f != null) {
            this.f2717g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        S s2 = this.f2716f;
        if (s2 != null) {
            s2.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(B.a.A(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        S s2 = this.f2716f;
        if (s2 != null) {
            s2.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2711a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2711a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2715e) {
            this.f2714d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        S s2 = this.f2716f;
        if (s2 != null) {
            Context context = this.f2712b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            N n2 = new N();
            n2.f2660a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                n2.f2661b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            s2.o(n2);
        }
    }
}
