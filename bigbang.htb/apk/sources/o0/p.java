package o0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import i.C0165q;
import i.C0171t0;
import i.H0;
import java.util.Locale;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class p extends C0165q {

    /* renamed from: e, reason: collision with root package name */
    public final C0171t0 f3423e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f3424f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f3425g;

    public p(Context context, AttributeSet attributeSet) {
        super(p0.a.a(context, attributeSet, 2130968629, 0), attributeSet);
        this.f3425g = new Rect();
        Context context2 = getContext();
        TypedArray j2 = h0.k.j(context2, attributeSet, X.a.f689j, 2130968629, 2131821226, new int[0]);
        if (j2.hasValue(0) && j2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f3424f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0171t0 c0171t0 = new C0171t0(context2, null, 2130969166, 0);
        this.f3423e = c0171t0;
        c0171t0.f2921x = true;
        c0171t0.f2922y.setFocusable(true);
        c0171t0.f2912o = this;
        c0171t0.f2922y.setInputMethodMode(2);
        c0171t0.o(getAdapter());
        c0171t0.f2913p = new H0(this, 1);
        j2.recycle();
    }

    public static void a(p pVar, Object obj) {
        pVar.setText(pVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.f1881E) ? super.getHint() : b2.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.f1881E && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i4 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0171t0 c0171t0 = this.f3423e;
                int min = Math.min(adapter.getCount(), Math.max(0, !c0171t0.f2922y.isShowing() ? -1 : c0171t0.f2900c.getSelectedItemPosition()) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable background = c0171t0.f2922y.getBackground();
                if (background != null) {
                    Rect rect = this.f3425g;
                    background.getPadding(rect);
                    i5 += rect.left + rect.right;
                }
                i4 = b2.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f3423e.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f3424f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f3423e.i();
        }
    }
}
