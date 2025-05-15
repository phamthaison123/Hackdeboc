package com.google.android.material.chip;

import D.j;
import F.AbstractC0023y;
import F.AbstractC0024z;
import F.E;
import F.O;
import Y.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import e0.a;
import e0.c;
import e0.d;
import e0.e;
import h0.k;
import i.C0170t;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m0.l;
import m0.w;
import z.AbstractC0241b;
import z.InterfaceC0240a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class Chip extends C0170t implements d, w {

    /* renamed from: v, reason: collision with root package name */
    public static final Rect f1755v = new Rect();

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f1756w = {R.attr.state_selected};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1757x = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public e f1758e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f1759f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f1760g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f1761h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1762i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1763j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1764k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1765l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1766m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1767n;

    /* renamed from: o, reason: collision with root package name */
    public int f1768o;

    /* renamed from: p, reason: collision with root package name */
    public int f1769p;

    /* renamed from: q, reason: collision with root package name */
    public final c f1770q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1771r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1772s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f1773t;

    /* renamed from: u, reason: collision with root package name */
    public final a f1774u;

    public Chip(Context context, AttributeSet attributeSet) {
        super(p0.a.a(context, attributeSet, 2130968740, 2131821472), attributeSet, 2130968740);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f1772s = new Rect();
        this.f1773t = new RectF();
        this.f1774u = new a(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        e eVar = new e(context2, attributeSet);
        int[] iArr = X.a.f681b;
        TypedArray j2 = k.j(eVar.f2256e0, attributeSet, iArr, 2130968740, 2131821472, new int[0]);
        eVar.F0 = j2.hasValue(37);
        Context context3 = eVar.f2256e0;
        ColorStateList f2 = k.f(context3, j2, 24);
        if (eVar.f2268x != f2) {
            eVar.f2268x = f2;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList f3 = k.f(context3, j2, 11);
        if (eVar.f2269y != f3) {
            eVar.f2269y = f3;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = j2.getDimension(19, 0.0f);
        if (eVar.f2270z != dimension) {
            eVar.f2270z = dimension;
            eVar.invalidateSelf();
            eVar.v();
        }
        if (j2.hasValue(12)) {
            eVar.B(j2.getDimension(12, 0.0f));
        }
        eVar.G(k.f(context3, j2, 22));
        eVar.H(j2.getDimension(23, 0.0f));
        eVar.Q(k.f(context3, j2, 36));
        String text = j2.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.f2230E, text)) {
            eVar.f2230E = text;
            eVar.k0.f2600d = true;
            eVar.invalidateSelf();
            eVar.v();
        }
        j0.d dVar = (!j2.hasValue(0) || (resourceId3 = j2.getResourceId(0, 0)) == 0) ? null : new j0.d(context3, resourceId3);
        dVar.f2987k = j2.getDimension(1, dVar.f2987k);
        eVar.R(dVar);
        int i2 = j2.getInt(3, 0);
        if (i2 == 1) {
            eVar.C0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            eVar.C0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            eVar.C0 = TextUtils.TruncateAt.END;
        }
        eVar.F(j2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.F(j2.getBoolean(15, false));
        }
        eVar.C(k.h(context3, j2, 14));
        if (j2.hasValue(17)) {
            eVar.E(k.f(context3, j2, 17));
        }
        eVar.D(j2.getDimension(16, -1.0f));
        eVar.N(j2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.N(j2.getBoolean(26, false));
        }
        eVar.I(k.h(context3, j2, 25));
        eVar.M(k.f(context3, j2, 30));
        eVar.K(j2.getDimension(28, 0.0f));
        eVar.x(j2.getBoolean(6, false));
        eVar.A(j2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.A(j2.getBoolean(8, false));
        }
        eVar.y(k.h(context3, j2, 7));
        if (j2.hasValue(9)) {
            eVar.z(k.f(context3, j2, 9));
        }
        eVar.f2246U = (!j2.hasValue(39) || (resourceId2 = j2.getResourceId(39, 0)) == 0) ? null : b.a(context3, resourceId2);
        eVar.f2247V = (!j2.hasValue(33) || (resourceId = j2.getResourceId(33, 0)) == 0) ? null : b.a(context3, resourceId);
        float dimension2 = j2.getDimension(21, 0.0f);
        if (eVar.f2248W != dimension2) {
            eVar.f2248W = dimension2;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.P(j2.getDimension(35, 0.0f));
        eVar.O(j2.getDimension(34, 0.0f));
        float dimension3 = j2.getDimension(41, 0.0f);
        if (eVar.f2251Z != dimension3) {
            eVar.f2251Z = dimension3;
            eVar.invalidateSelf();
            eVar.v();
        }
        float dimension4 = j2.getDimension(40, 0.0f);
        if (eVar.f2252a0 != dimension4) {
            eVar.f2252a0 = dimension4;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.L(j2.getDimension(29, 0.0f));
        eVar.J(j2.getDimension(27, 0.0f));
        float dimension5 = j2.getDimension(13, 0.0f);
        if (eVar.f2255d0 != dimension5) {
            eVar.f2255d0 = dimension5;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.E0 = j2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        j2.recycle();
        k.a(context2, attributeSet, 2130968740, 2131821472);
        k.b(context2, attributeSet, iArr, 2130968740, 2131821472, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130968740, 2131821472);
        this.f1767n = obtainStyledAttributes.getBoolean(32, false);
        this.f1769p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        WeakHashMap weakHashMap = O.f58a;
        eVar.j(E.i(this));
        k.a(context2, attributeSet, 2130968740, 2131821472);
        k.b(context2, attributeSet, iArr, 2130968740, 2131821472, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, 2130968740, 2131821472);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1770q = new c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new e0.b(this));
        }
        setChecked(this.f1763j);
        setText(eVar.f2230E);
        setEllipsize(eVar.C0);
        h();
        if (!this.f1758e.D0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1767n) {
            setMinHeight(this.f1769p);
        }
        this.f1768o = AbstractC0024z.d(this);
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f1773t;
        rectF.setEmpty();
        if (c() && this.f1761h != null) {
            e eVar = this.f1758e;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.U()) {
                float f2 = eVar.f2255d0 + eVar.f2254c0 + eVar.f2240O + eVar.f2253b0 + eVar.f2252a0;
                if (eVar.getLayoutDirection() == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i2 = (int) closeIconTouchBounds.left;
        int i3 = (int) closeIconTouchBounds.top;
        int i4 = (int) closeIconTouchBounds.right;
        int i5 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1772s;
        rect.set(i2, i3, i4, i5);
        return rect;
    }

    private j0.d getTextAppearance() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.k0.f2602f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f1765l != z2) {
            this.f1765l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f1764k != z2) {
            this.f1764k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i2) {
        this.f1769p = i2;
        if (!this.f1767n) {
            InsetDrawable insetDrawable = this.f1759f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f1759f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i2 - ((int) this.f1758e.f2270z));
        int max2 = Math.max(0, i2 - this.f1758e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f1759f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f1759f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i3 = max2 > 0 ? max2 / 2 : 0;
        int i4 = max > 0 ? max / 2 : 0;
        if (this.f1759f != null) {
            Rect rect = new Rect();
            this.f1759f.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                f();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f1759f = new InsetDrawable((Drawable) this.f1758e, i3, i4, i3, i4);
        f();
    }

    public final boolean c() {
        e eVar = this.f1758e;
        if (eVar != null) {
            Object obj = eVar.f2237L;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof InterfaceC0240a) {
                ((AbstractC0241b) ((InterfaceC0240a) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        e eVar = this.f1758e;
        return eVar != null && eVar.f2242Q;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        if (!this.f1771r) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.f1770q;
        AccessibilityManager accessibilityManager = cVar.f182h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = cVar.f2225q;
                int i3 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i4 = cVar.f187m;
                if (i4 != i3) {
                    cVar.f187m = i3;
                    cVar.q(i3, 128);
                    cVar.q(i4, 256);
                }
                if (i3 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i2 = cVar.f187m) != Integer.MIN_VALUE) {
                if (i2 == Integer.MIN_VALUE) {
                    return true;
                }
                cVar.f187m = Integer.MIN_VALUE;
                cVar.q(Integer.MIN_VALUE, 128);
                cVar.q(i2, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r7 == false) goto L57;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f1771r
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        L9:
            e0.c r0 = r9.f1770q
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            if (r1 == r2) goto La4
            int r1 = r10.getKeyCode()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 61
            r5 = 0
            if (r1 == r4) goto L87
            r4 = 0
            r6 = 66
            if (r1 == r6) goto L56
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L56;
                default: goto L28;
            }
        L28:
            goto La4
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto La4
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r6 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r6 = 17
            goto L44
        L42:
            r6 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r7 = r4
        L4a:
            if (r4 >= r1) goto L9d
            boolean r8 = r0.m(r6, r5)
            if (r8 == 0) goto L9d
            int r4 = r4 + 1
            r7 = r2
            goto L4a
        L56:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto La4
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto La4
            int r1 = r0.f186l
            if (r1 == r3) goto L9f
            com.google.android.material.chip.Chip r5 = r0.f2225q
            if (r1 != 0) goto L6f
            boolean r1 = r5.performClick()
            goto L9f
        L6f:
            if (r1 != r2) goto L9f
            r5.playSoundEffect(r4)
            android.view.View$OnClickListener r1 = r5.f1761h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
            r4 = r2
        L7c:
            boolean r1 = r5.f1771r
            if (r1 == 0) goto L85
            e0.c r1 = r5.f1770q
            r1.q(r2, r2)
        L85:
            r1 = r4
            goto L9f
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r7 = r0.m(r1, r5)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto La4
            boolean r7 = r0.m(r2, r5)
        L9d:
            if (r7 == 0) goto La4
        L9f:
            int r0 = r0.f186l
            if (r0 == r3) goto La4
            return r2
        La4:
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // i.C0170t, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1758e;
        if (eVar == null || !e.u(eVar.f2237L)) {
            return;
        }
        e eVar2 = this.f1758e;
        ?? isEnabled = isEnabled();
        int i2 = isEnabled;
        if (this.f1766m) {
            i2 = isEnabled + 1;
        }
        int i3 = i2;
        if (this.f1765l) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (this.f1764k) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (isChecked()) {
            i5 = i4 + 1;
        }
        int[] iArr = new int[i5];
        int i6 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i6 = 1;
        }
        if (this.f1766m) {
            iArr[i6] = 16842908;
            i6++;
        }
        if (this.f1765l) {
            iArr[i6] = 16843623;
            i6++;
        }
        if (this.f1764k) {
            iArr[i6] = 16842919;
            i6++;
        }
        if (isChecked()) {
            iArr[i6] = 16842913;
        }
        if (Arrays.equals(eVar2.y0, iArr)) {
            return;
        }
        eVar2.y0 = iArr;
        if (eVar2.U() && eVar2.w(eVar2.getState(), iArr)) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (!c() || (eVar = this.f1758e) == null || !eVar.f2236K || this.f1761h == null) {
            O.h(this, null);
            this.f1771r = false;
        } else {
            O.h(this, this.f1770q);
            this.f1771r = true;
        }
    }

    public final void f() {
        ColorStateList colorStateList = this.f1758e.f2229D;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1760g = new RippleDrawable(colorStateList, getBackgroundDrawable(), null);
        e eVar = this.f1758e;
        if (eVar.z0) {
            eVar.z0 = false;
            eVar.A0 = null;
            eVar.onStateChange(eVar.getState());
        }
        RippleDrawable rippleDrawable = this.f1760g;
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f1758e) == null) {
            return;
        }
        int r2 = (int) (eVar.r() + eVar.f2255d0 + eVar.f2252a0);
        e eVar2 = this.f1758e;
        int q2 = (int) (eVar2.q() + eVar2.f2248W + eVar2.f2251Z);
        if (this.f1759f != null) {
            Rect rect = new Rect();
            this.f1759f.getPadding(rect);
            q2 += rect.left;
            r2 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0024z.k(this, q2, paddingTop, r2, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f1777g) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f1759f;
        return insetDrawable == null ? this.f1758e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2244S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2245T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2269y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return Math.max(0.0f, eVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f1758e;
    }

    public float getChipEndPadding() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2255d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f1758e;
        if (eVar == null || (drawable = eVar.f2232G) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0240a)) {
            return drawable;
        }
        ((AbstractC0241b) ((InterfaceC0240a) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2234I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2233H;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2270z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2248W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2227B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2228C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f1758e;
        if (eVar == null || (drawable = eVar.f2237L) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0240a)) {
            return drawable;
        }
        ((AbstractC0241b) ((InterfaceC0240a) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2241P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2254c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2240O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2253b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2239N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1771r) {
            c cVar = this.f1770q;
            if (cVar.f186l == 1 || cVar.f185k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public b getHideMotionSpec() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2247V;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2250Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2249X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2229D;
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        return this.f1758e.f3094a.f3072a;
    }

    public b getShowMotionSpec() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2246U;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2252a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f1758e;
        if (eVar != null) {
            return eVar.f2251Z;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f1758e;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        j0.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f1774u);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.n(this, this.f1758e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1756w);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f1757x);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f1771r) {
            c cVar = this.f1770q;
            int i3 = cVar.f186l;
            if (i3 != Integer.MIN_VALUE) {
                cVar.j(i3);
            }
            if (z2) {
                cVar.m(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f2577c) {
                i2 = 0;
                for (int i3 = 0; i3 < chipGroup.getChildCount(); i3++) {
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            i2 = -1;
            Object tag = getTag(2131296572);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) G.c.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i2, 1, isChecked()).f128a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f1768o != i2) {
            this.f1768o = i2;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L51
        L21:
            boolean r0 = r5.f1764k
            if (r0 == 0) goto L51
            if (r1 != 0) goto L57
            r5.setCloseIconPressed(r2)
            goto L57
        L2b:
            boolean r0 = r5.f1764k
            if (r0 == 0) goto L44
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f1761h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f1771r
            if (r0 == 0) goto L42
            e0.c r0 = r5.f1770q
            r0.q(r3, r3)
        L42:
            r0 = r3
            goto L45
        L44:
            r0 = r2
        L45:
            r5.setCloseIconPressed(r2)
            if (r0 != 0) goto L57
            goto L51
        L4b:
            if (r1 == 0) goto L51
            r5.setCloseIconPressed(r3)
            goto L57
        L51:
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L58
        L57:
            r2 = r3
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1760g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // i.C0170t, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f1760g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // i.C0170t, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.x(z2);
        }
    }

    public void setCheckableResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.x(eVar.f2256e0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        e eVar = this.f1758e;
        if (eVar == null) {
            this.f1763j = z2;
            return;
        }
        if (eVar.f2242Q) {
            boolean isChecked = isChecked();
            super.setChecked(z2);
            if (isChecked == z2 || (onCheckedChangeListener = this.f1762i) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.y(B.a.A(eVar.f2256e0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.z(B.a.x(eVar.f2256e0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.A(eVar.f2256e0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f1758e;
        if (eVar == null || eVar.f2269y == colorStateList) {
            return;
        }
        eVar.f2269y = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList x2;
        e eVar = this.f1758e;
        if (eVar == null || eVar.f2269y == (x2 = B.a.x(eVar.f2256e0, i2))) {
            return;
        }
        eVar.f2269y = x2;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.B(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.B(eVar.f2256e0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f1758e;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.B0 = new WeakReference(null);
            }
            this.f1758e = eVar;
            eVar.D0 = false;
            eVar.B0 = new WeakReference(this);
            b(this.f1769p);
        }
    }

    public void setChipEndPadding(float f2) {
        e eVar = this.f1758e;
        if (eVar == null || eVar.f2255d0 == f2) {
            return;
        }
        eVar.f2255d0 = f2;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setChipEndPaddingResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            float dimension = eVar.f2256e0.getResources().getDimension(i2);
            if (eVar.f2255d0 != dimension) {
                eVar.f2255d0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.C(B.a.A(eVar.f2256e0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.D(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.D(eVar.f2256e0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.E(B.a.x(eVar.f2256e0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.F(eVar.f2256e0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f2) {
        e eVar = this.f1758e;
        if (eVar == null || eVar.f2270z == f2) {
            return;
        }
        eVar.f2270z = f2;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setChipMinHeightResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            float dimension = eVar.f2256e0.getResources().getDimension(i2);
            if (eVar.f2270z != dimension) {
                eVar.f2270z = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        e eVar = this.f1758e;
        if (eVar == null || eVar.f2248W == f2) {
            return;
        }
        eVar.f2248W = f2;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setChipStartPaddingResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            float dimension = eVar.f2256e0.getResources().getDimension(i2);
            if (eVar.f2248W != dimension) {
                eVar.f2248W = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.G(B.a.x(eVar.f2256e0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.H(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.H(eVar.f2256e0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f1758e;
        if (eVar == null || eVar.f2241P == charSequence) {
            return;
        }
        String str = D.b.f36d;
        Locale locale = Locale.getDefault();
        int i2 = j.f54a;
        D.b bVar = TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? D.b.f39g : D.b.f38f;
        eVar.f2241P = bVar.c(charSequence, bVar.f42c);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.J(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.J(eVar.f2256e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.I(B.a.A(eVar.f2256e0, i2));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.K(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.K(eVar.f2256e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.L(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.L(eVar.f2256e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.M(B.a.x(eVar.f2256e0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.j(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1758e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.C0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f1767n = z2;
        b(this.f1769p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(b bVar) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.f2247V = bVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.f2247V = b.a(eVar.f2256e0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.O(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.O(eVar.f2256e0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.P(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.P(eVar.f2256e0.getResources().getDimension(i2));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f1758e == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.E0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1762i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1761h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.Q(colorStateList);
        }
        if (this.f1758e.z0) {
            return;
        }
        f();
    }

    public void setRippleColorResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.Q(B.a.x(eVar.f2256e0, i2));
            if (this.f1758e.z0) {
                return;
            }
            f();
        }
    }

    @Override // m0.w
    public void setShapeAppearanceModel(l lVar) {
        this.f1758e.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(b bVar) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.f2246U = bVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.f2246U = b.a(eVar.f2256e0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.f1758e;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.D0 ? null : charSequence, bufferType);
        e eVar2 = this.f1758e;
        if (eVar2 == null || TextUtils.equals(eVar2.f2230E, charSequence)) {
            return;
        }
        eVar2.f2230E = charSequence;
        eVar2.k0.f2600d = true;
        eVar2.invalidateSelf();
        eVar2.v();
    }

    public void setTextAppearance(j0.d dVar) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.R(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        e eVar = this.f1758e;
        if (eVar == null || eVar.f2252a0 == f2) {
            return;
        }
        eVar.f2252a0 = f2;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setTextEndPaddingResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            float dimension = eVar.f2256e0.getResources().getDimension(i2);
            if (eVar.f2252a0 != dimension) {
                eVar.f2252a0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setTextStartPadding(float f2) {
        e eVar = this.f1758e;
        if (eVar == null || eVar.f2251Z == f2) {
            return;
        }
        eVar.f2251Z = f2;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setTextStartPaddingResource(int i2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            float dimension = eVar.f2256e0.getResources().getDimension(i2);
            if (eVar.f2251Z != dimension) {
                eVar.f2251Z = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.N(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.A(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.F(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.R(new j0.d(eVar.f2256e0, i2));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        e eVar = this.f1758e;
        if (eVar != null) {
            eVar.R(new j0.d(eVar.f2256e0, i2));
        }
        h();
    }
}
