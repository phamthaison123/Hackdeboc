package h0;

import F.AbstractC0024z;
import F.O;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f2575a;

    /* renamed from: b, reason: collision with root package name */
    public int f2576b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2577c;

    /* renamed from: d, reason: collision with root package name */
    public int f2578d;

    public int getItemSpacing() {
        return this.f2576b;
    }

    public int getLineSpacing() {
        return this.f2575a;
    }

    public int getRowCount() {
        return this.f2578d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (getChildCount() == 0) {
            this.f2578d = 0;
            return;
        }
        this.f2578d = 1;
        WeakHashMap weakHashMap = O.f58a;
        boolean z3 = AbstractC0024z.d(this) == 1;
        int paddingRight = z3 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z3 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i8 = (i4 - i2) - paddingLeft;
        int i9 = paddingRight;
        int i10 = paddingTop;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(2131296572, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = marginLayoutParams.getMarginStart();
                    i6 = marginLayoutParams.getMarginEnd();
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i9 + i7;
                if (!this.f2577c && measuredWidth > i8) {
                    i10 = this.f2575a + paddingTop;
                    this.f2578d++;
                    i9 = paddingRight;
                }
                childAt.setTag(2131296572, Integer.valueOf(this.f2578d - 1));
                int i12 = i9 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                if (z3) {
                    childAt.layout(i8 - measuredWidth2, i10, (i8 - i9) - i7, measuredHeight);
                } else {
                    childAt.layout(i12, i10, measuredWidth2, measuredHeight);
                }
                i9 += childAt.getMeasuredWidth() + i7 + i6 + this.f2576b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i8 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i8 - getPaddingRight();
        int i9 = paddingTop;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int i12 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i6 <= paddingRight || ((ChipGroup) this).f2577c) {
                    i7 = i12;
                } else {
                    i7 = getPaddingLeft();
                    i9 = this.f2575a + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i7 + i6;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (measuredWidth > i10) {
                    i10 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i6 + i5 + this.f2576b + i7;
                if (i11 == getChildCount() - 1) {
                    i10 += i5;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i10;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i4 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i4 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i4) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i2) {
        this.f2576b = i2;
    }

    public void setLineSpacing(int i2) {
        this.f2575a = i2;
    }

    public void setSingleLine(boolean z2) {
        this.f2577c = z2;
    }
}
