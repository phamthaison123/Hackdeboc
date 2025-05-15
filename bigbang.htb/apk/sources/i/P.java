package i;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import e.C0098d;
import h.ViewTreeObserverOnGlobalLayoutListenerC0120e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class P extends C0171t0 implements S {

    /* renamed from: A, reason: collision with root package name */
    public ListAdapter f2675A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f2676B;

    /* renamed from: C, reason: collision with root package name */
    public int f2677C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ T f2678D;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f2679z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(T t2, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969372, 0);
        this.f2678D = t2;
        this.f2676B = new Rect();
        this.f2912o = t2;
        this.f2921x = true;
        this.f2922y.setFocusable(true);
        this.f2913p = new C0098d(1, this, t2);
    }

    @Override // i.S
    public final CharSequence b() {
        return this.f2679z;
    }

    @Override // i.S
    public final void e(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        C0129F c0129f = this.f2922y;
        boolean isShowing = c0129f.isShowing();
        s();
        this.f2922y.setInputMethodMode(2);
        i();
        C0150i0 c0150i0 = this.f2900c;
        c0150i0.setChoiceMode(1);
        c0150i0.setTextDirection(i2);
        c0150i0.setTextAlignment(i3);
        T t2 = this.f2678D;
        int selectedItemPosition = t2.getSelectedItemPosition();
        C0150i0 c0150i02 = this.f2900c;
        if (c0129f.isShowing() && c0150i02 != null) {
            c0150i02.setListSelectionHidden(false);
            c0150i02.setSelection(selectedItemPosition);
            if (c0150i02.getChoiceMode() != 0) {
                c0150i02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = t2.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0120e viewTreeObserverOnGlobalLayoutListenerC0120e = new ViewTreeObserverOnGlobalLayoutListenerC0120e(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0120e);
        this.f2922y.setOnDismissListener(new O(this, viewTreeObserverOnGlobalLayoutListenerC0120e));
    }

    @Override // i.S
    public final void g(CharSequence charSequence) {
        this.f2679z = charSequence;
    }

    @Override // i.C0171t0, i.S
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f2675A = listAdapter;
    }

    @Override // i.S
    public final void p(int i2) {
        this.f2677C = i2;
    }

    public final void s() {
        int i2;
        C0129F c0129f = this.f2922y;
        Drawable background = c0129f.getBackground();
        T t2 = this.f2678D;
        if (background != null) {
            background.getPadding(t2.f2718h);
            boolean a2 = b1.a(t2);
            Rect rect = t2.f2718h;
            i2 = a2 ? rect.right : -rect.left;
        } else {
            Rect rect2 = t2.f2718h;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        int paddingLeft = t2.getPaddingLeft();
        int paddingRight = t2.getPaddingRight();
        int width = t2.getWidth();
        int i3 = t2.f2717g;
        if (i3 == -2) {
            int a3 = t2.a((SpinnerAdapter) this.f2675A, c0129f.getBackground());
            int i4 = t2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = t2.f2718h;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (a3 > i5) {
                a3 = i5;
            }
            r(Math.max(a3, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        this.f2903f = b1.a(t2) ? (((width - paddingRight) - this.f2902e) - this.f2677C) + i2 : paddingLeft + this.f2677C + i2;
    }
}
