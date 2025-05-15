package com.google.android.material.button;

import F.AbstractC0023y;
import F.AbstractC0024z;
import F.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c0.d;
import c0.e;
import c0.f;
import com.google.android.material.timepicker.i;
import e.z;
import h0.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import m0.l;
import n.C0201g;
import p0.a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1744k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1745a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1746b;

    /* renamed from: c, reason: collision with root package name */
    public final z f1747c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1748d;

    /* renamed from: e, reason: collision with root package name */
    public final C0201g f1749e;

    /* renamed from: f, reason: collision with root package name */
    public Integer[] f1750f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1751g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1752h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1753i;

    /* renamed from: j, reason: collision with root package name */
    public int f1754j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969185, 2131821490), attributeSet, 2130969185);
        this.f1745a = new ArrayList();
        this.f1746b = new e(this);
        this.f1747c = new z(this);
        this.f1748d = new LinkedHashSet();
        this.f1749e = new C0201g(1, this);
        this.f1751g = false;
        TypedArray j2 = k.j(getContext(), attributeSet, X.a.f691l, 2130969185, 2131821490, new int[0]);
        setSingleSelection(j2.getBoolean(2, false));
        this.f1754j = j2.getResourceId(0, -1);
        this.f1753i = j2.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        j2.recycle();
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && c(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setCheckedId(int i2) {
        this.f1754j = i2;
        b(i2, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = O.f58a;
            materialButton.setId(AbstractC0024z.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f1732e.add(this.f1746b);
        materialButton.setOnPressedChangeListenerInternal(this.f1747c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.f1741n) {
            d(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        l shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1745a.add(new f(shapeAppearanceModel.f3133e, shapeAppearanceModel.f3136h, shapeAppearanceModel.f3134f, shapeAppearanceModel.f3135g));
        O.h(materialButton, new d(this, 0));
    }

    public final void b(int i2, boolean z2) {
        Iterator it = this.f1748d.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public final boolean c(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    public final boolean d(int i2, boolean z2) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f1753i && checkedButtonIds.isEmpty()) {
            View findViewById = findViewById(i2);
            if (findViewById instanceof MaterialButton) {
                this.f1751g = true;
                ((MaterialButton) findViewById).setChecked(true);
                this.f1751g = false;
            }
            this.f1754j = i2;
            return false;
        }
        if (z2 && this.f1752h) {
            checkedButtonIds.remove(Integer.valueOf(i2));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                View findViewById2 = findViewById(intValue);
                if (findViewById2 instanceof MaterialButton) {
                    this.f1751g = true;
                    ((MaterialButton) findViewById2).setChecked(false);
                    this.f1751g = false;
                }
                b(intValue, false);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1749e);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f1750f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        f fVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                m0.k e2 = materialButton.getShapeAppearanceModel().e();
                f fVar2 = (f) this.f1745a.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    m0.a aVar = f.f1660e;
                    if (i2 == firstVisibleChildIndex) {
                        if (z2) {
                            WeakHashMap weakHashMap = O.f58a;
                            fVar = AbstractC0024z.d(this) == 1 ? new f(aVar, aVar, fVar2.f1662b, fVar2.f1663c) : new f(fVar2.f1661a, fVar2.f1664d, aVar, aVar);
                        } else {
                            fVar = new f(fVar2.f1661a, aVar, fVar2.f1662b, aVar);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        fVar2 = null;
                    } else if (z2) {
                        WeakHashMap weakHashMap2 = O.f58a;
                        fVar = AbstractC0024z.d(this) == 1 ? new f(fVar2.f1661a, fVar2.f1664d, aVar, aVar) : new f(aVar, aVar, fVar2.f1662b, fVar2.f1663c);
                    } else {
                        fVar = new f(aVar, fVar2.f1664d, aVar, fVar2.f1663c);
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    e2.f3121e = new m0.a(0.0f);
                    e2.f3122f = new m0.a(0.0f);
                    e2.f3123g = new m0.a(0.0f);
                    e2.f3124h = new m0.a(0.0f);
                } else {
                    e2.f3121e = fVar2.f1661a;
                    e2.f3124h = fVar2.f1664d;
                    e2.f3122f = fVar2.f1662b;
                    e2.f3123g = fVar2.f1663c;
                }
                materialButton.setShapeAppearanceModel(e2.a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f1752h) {
            return this.f1754j;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.f1741n) {
                arrayList.add(Integer.valueOf(materialButton.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f1750f;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i2 = this.f1754j;
        if (i2 == -1 || (materialButton = (MaterialButton) findViewById(i2)) == null) {
            return;
        }
        materialButton.setChecked(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1752h ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        e();
        a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f1732e.remove(this.f1746b);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f1745a.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setSelectionRequired(boolean z2) {
        this.f1753i = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f1752h != z2) {
            this.f1752h = z2;
            this.f1751g = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                materialButton.setChecked(false);
                b(materialButton.getId(), false);
            }
            this.f1751g = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
