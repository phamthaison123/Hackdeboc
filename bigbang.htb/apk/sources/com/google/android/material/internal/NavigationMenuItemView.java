package com.google.android.material.internal;

import F.AbstractC0023y;
import F.O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c0.d;
import h.C;
import h.q;
import h0.e;
import i.C0158m0;
import java.util.WeakHashMap;
import x.k;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class NavigationMenuItemView extends e implements C {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f1860F = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public q f1861A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1862B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1863C;

    /* renamed from: D, reason: collision with root package name */
    public Drawable f1864D;

    /* renamed from: E, reason: collision with root package name */
    public final d f1865E;

    /* renamed from: v, reason: collision with root package name */
    public int f1866v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1867w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1868x;

    /* renamed from: y, reason: collision with root package name */
    public final CheckedTextView f1869y;

    /* renamed from: z, reason: collision with root package name */
    public FrameLayout f1870z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d dVar = new d(this, 2);
        this.f1865E = dVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131492909, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(2131165305));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131296389);
        this.f1869y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        O.h(checkedTextView, dVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1870z == null) {
                this.f1870z = (FrameLayout) ((ViewStub) findViewById(2131296388)).inflate();
            }
            this.f1870z.removeAllViews();
            this.f1870z.addView(view);
        }
    }

    @Override // h.C
    public final void c(q qVar) {
        StateListDrawable stateListDrawable;
        this.f1861A = qVar;
        int i2 = qVar.f2480a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(qVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130968774, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1860F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = O.f58a;
            AbstractC0023y.q(this, stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.f2484e);
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.f2496q);
        setTooltipText(qVar.f2497r);
        q qVar2 = this.f1861A;
        CharSequence charSequence = qVar2.f2484e;
        CheckedTextView checkedTextView = this.f1869y;
        if (charSequence == null && qVar2.getIcon() == null && this.f1861A.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1870z;
            if (frameLayout != null) {
                C0158m0 c0158m0 = (C0158m0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0158m0).width = -1;
                this.f1870z.setLayoutParams(c0158m0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1870z;
        if (frameLayout2 != null) {
            C0158m0 c0158m02 = (C0158m0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0158m02).width = -2;
            this.f1870z.setLayoutParams(c0158m02);
        }
    }

    @Override // h.C
    public q getItemData() {
        return this.f1861A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        q qVar = this.f1861A;
        if (qVar != null && qVar.isCheckable() && this.f1861A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1860F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1868x != z2) {
            this.f1868x = z2;
            this.f1865E.h(this.f1869y, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.f1869y.setChecked(z2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1863C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f1862B);
            }
            int i2 = this.f1866v;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f1867w) {
            if (this.f1864D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = k.f3762a;
                Drawable drawable2 = resources.getDrawable(2131230863, theme);
                this.f1864D = drawable2;
                if (drawable2 != null) {
                    int i3 = this.f1866v;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f1864D;
        }
        this.f1869y.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f1869y.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f1866v = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1862B = colorStateList;
        this.f1863C = colorStateList != null;
        q qVar = this.f1861A;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f1869y.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1867w = z2;
    }

    public void setTextAppearance(int i2) {
        this.f1869y.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1869y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1869y.setText(charSequence);
    }
}
