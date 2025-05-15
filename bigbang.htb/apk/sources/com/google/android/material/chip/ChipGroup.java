package com.google.android.material.chip;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import e0.f;
import e0.g;
import e0.h;
import e0.i;
import h0.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ChipGroup extends d {

    /* renamed from: e, reason: collision with root package name */
    public int f1775e;

    /* renamed from: f, reason: collision with root package name */
    public int f1776f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1777g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1778h;

    /* renamed from: i, reason: collision with root package name */
    public final f f1779i;

    /* renamed from: j, reason: collision with root package name */
    public final i f1780j;

    /* renamed from: k, reason: collision with root package name */
    public int f1781k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1782l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r3 = 2130968725(0x7f040095, float:1.7546112E38)
            r0 = 2131821476(0x7f1103a4, float:1.9275696E38)
            android.content.Context r10 = p0.a.a(r10, r11, r3, r0)
            r9.<init>(r10, r11, r3)
            r6 = 0
            r9.f2577c = r6
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int[] r0 = X.a.f687h
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r0, r6, r6)
            r7 = 1
            int r0 = r10.getDimensionPixelSize(r7, r6)
            r9.f2575a = r0
            int r0 = r10.getDimensionPixelSize(r6, r6)
            r9.f2576b = r0
            r10.recycle()
            e0.f r10 = new e0.f
            r10.<init>(r9)
            r9.f1779i = r10
            e0.i r10 = new e0.i
            r10.<init>(r9)
            r9.f1780j = r10
            r8 = -1
            r9.f1781k = r8
            r9.f1782l = r6
            android.content.Context r0 = r9.getContext()
            int[] r2 = X.a.f682c
            r4 = 2131821476(0x7f1103a4, float:1.9275696E38)
            int[] r5 = new int[r6]
            r1 = r11
            android.content.res.TypedArray r11 = h0.k.j(r0, r1, r2, r3, r4, r5)
            int r0 = r11.getDimensionPixelOffset(r7, r6)
            r1 = 2
            int r1 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingHorizontal(r1)
            r1 = 3
            int r0 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleLine(r0)
            r0 = 6
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleSelection(r0)
            r0 = 4
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSelectionRequired(r0)
            int r0 = r11.getResourceId(r6, r8)
            if (r0 == r8) goto L81
            r9.f1781k = r0
        L81:
            r11.recycle()
            super.setOnHierarchyChangeListener(r10)
            java.util.WeakHashMap r10 = F.O.f58a
            F.AbstractC0023y.s(r9, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i2) {
        this.f1781k = i2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.f1781k;
                if (i3 != -1 && this.f1777g) {
                    c(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    public final void b(int i2) {
        int i3 = this.f1781k;
        if (i2 == i3) {
            return;
        }
        if (i3 != -1 && this.f1777g) {
            c(i3, false);
        }
        if (i2 != -1) {
            c(i2, true);
        }
        setCheckedId(i2);
    }

    public final void c(int i2, boolean z2) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.f1782l = true;
            ((Chip) findViewById).setChecked(z2);
            this.f1782l = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f1777g) {
            return this.f1781k;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f1777g) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f1775e;
    }

    public int getChipSpacingVertical() {
        return this.f1776f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f1781k;
        if (i2 != -1) {
            c(i2, true);
            setCheckedId(this.f1781k);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCount(), this.f2577c ? getChipCount() : -1, false, this.f1777g ? 1 : 2));
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f1775e != i2) {
            this.f1775e = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f1776f != i2) {
            this.f1776f = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(h hVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1780j.f2272a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z2) {
        this.f1778h = z2;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // h0.d
    public void setSingleLine(boolean z2) {
        super.setSingleLine(z2);
    }

    public void setSingleSelection(boolean z2) {
        if (this.f1777g != z2) {
            this.f1777g = z2;
            this.f1782l = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f1782l = false;
            setCheckedId(-1);
        }
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
