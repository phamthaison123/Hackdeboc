package com.google.android.material.datepicker;

import F.O;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1783a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w.c(null);
        if (n.J(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(2131296347);
            setNextFocusRightId(2131296368);
        }
        this.f1783a = n.J(getContext(), 2130969267);
        O.h(this, new g(2, this));
    }

    public final q a() {
        return (q) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (q) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((q) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        q qVar = (q) super.getAdapter();
        qVar.getClass();
        int max = Math.max(qVar.f1840a.d(), getFirstVisiblePosition());
        int min = Math.min(qVar.b(), getLastVisiblePosition());
        qVar.getItem(max);
        qVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i2, rect);
            return;
        }
        if (i2 == 33) {
            setSelection(((q) super.getAdapter()).b());
        } else if (i2 == 130) {
            setSelection(((q) super.getAdapter()).f1840a.d());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((q) super.getAdapter()).f1840a.d()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((q) super.getAdapter()).f1840a.d());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1783a) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i2) {
        if (i2 < ((q) super.getAdapter()).f1840a.d()) {
            super.setSelection(((q) super.getAdapter()).f1840a.d());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (q) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof q)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), q.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
