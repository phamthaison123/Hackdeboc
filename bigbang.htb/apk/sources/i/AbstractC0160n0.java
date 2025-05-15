package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import d.AbstractC0092a;
import e.C0097c;
import java.util.WeakHashMap;

/* renamed from: i.n0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractC0160n0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2851a;

    /* renamed from: b, reason: collision with root package name */
    public int f2852b;

    /* renamed from: c, reason: collision with root package name */
    public int f2853c;

    /* renamed from: d, reason: collision with root package name */
    public int f2854d;

    /* renamed from: e, reason: collision with root package name */
    public int f2855e;

    /* renamed from: f, reason: collision with root package name */
    public int f2856f;

    /* renamed from: g, reason: collision with root package name */
    public float f2857g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2858h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2859i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2860j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2861k;

    /* renamed from: l, reason: collision with root package name */
    public int f2862l;

    /* renamed from: m, reason: collision with root package name */
    public int f2863m;

    /* renamed from: n, reason: collision with root package name */
    public int f2864n;

    /* renamed from: o, reason: collision with root package name */
    public int f2865o;

    public AbstractC0160n0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2851a = true;
        this.f2852b = -1;
        this.f2853c = 0;
        this.f2855e = 8388659;
        int[] iArr = AbstractC0092a.f2019n;
        C0097c t2 = C0097c.t(context, attributeSet, iArr, i2, 0);
        Object obj = t2.f2079b;
        WeakHashMap weakHashMap = F.O.f58a;
        F.J.c(this, context, iArr, attributeSet, (TypedArray) obj, i2, 0);
        int j2 = t2.j(1, -1);
        if (j2 >= 0) {
            setOrientation(j2);
        }
        int j3 = t2.j(0, -1);
        if (j3 >= 0) {
            setGravity(j3);
        }
        boolean a2 = t2.a(2, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f2857g = ((TypedArray) obj).getFloat(4, -1.0f);
        this.f2852b = t2.j(3, -1);
        this.f2858h = t2.a(7, false);
        setDividerDrawable(t2.g(5));
        this.f2864n = t2.j(8, 0);
        this.f2865o = t2.d(6, 0);
        t2.u();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0158m0;
    }

    public final void f(Canvas canvas, int i2) {
        this.f2861k.setBounds(getPaddingLeft() + this.f2865o, i2, (getWidth() - getPaddingRight()) - this.f2865o, this.f2863m + i2);
        this.f2861k.draw(canvas);
    }

    public final void g(Canvas canvas, int i2) {
        this.f2861k.setBounds(i2, getPaddingTop() + this.f2865o, this.f2862l + i2, (getHeight() - getPaddingBottom()) - this.f2865o);
        this.f2861k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f2852b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2852b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2852b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i4 = this.f2853c;
        if (this.f2854d == 1 && (i2 = this.f2855e & 112) != 48) {
            if (i2 == 16) {
                i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2856f) / 2;
            } else if (i2 == 80) {
                i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2856f;
            }
        }
        return i4 + ((LinearLayout.LayoutParams) ((C0158m0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2852b;
    }

    public Drawable getDividerDrawable() {
        return this.f2861k;
    }

    public int getDividerPadding() {
        return this.f2865o;
    }

    public int getDividerWidth() {
        return this.f2862l;
    }

    public int getGravity() {
        return this.f2855e;
    }

    public int getOrientation() {
        return this.f2854d;
    }

    public int getShowDividers() {
        return this.f2864n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2857g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0158m0 generateDefaultLayoutParams() {
        int i2 = this.f2854d;
        if (i2 == 0) {
            return new C0158m0(-2, -2);
        }
        if (i2 == 1) {
            return new C0158m0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0158m0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0158m0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0158m0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0158m0(layoutParams);
    }

    public final boolean k(int i2) {
        if (i2 == 0) {
            return (this.f2864n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f2864n & 4) != 0;
        }
        if ((this.f2864n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f2861k == null) {
            return;
        }
        int i3 = 0;
        if (this.f2854d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && k(i3)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0158m0) childAt.getLayoutParams())).topMargin) - this.f2863m);
                }
                i3++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2863m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0158m0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = b1.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i3)) {
                C0158m0 c0158m0 = (C0158m0) childAt3.getLayoutParams();
                g(canvas, a2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0158m0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0158m0).leftMargin) - this.f2862l);
            }
            i3++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0158m0 c0158m02 = (C0158m0) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0158m02).leftMargin;
                    i2 = this.f2862l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0158m02).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f2862l;
                right = left - i2;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.AbstractC0160n0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.AbstractC0160n0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f2851a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f2852b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2861k) {
            return;
        }
        this.f2861k = drawable;
        if (drawable != null) {
            this.f2862l = drawable.getIntrinsicWidth();
            this.f2863m = drawable.getIntrinsicHeight();
        } else {
            this.f2862l = 0;
            this.f2863m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f2865o = i2;
    }

    public void setGravity(int i2) {
        if (this.f2855e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2855e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2855e;
        if ((8388615 & i4) != i3) {
            this.f2855e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f2858h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f2854d != i2) {
            this.f2854d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f2864n) {
            requestLayout();
        }
        this.f2864n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2855e;
        if ((i4 & 112) != i3) {
            this.f2855e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2857g = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
