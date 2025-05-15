package androidx.appcompat.widget;

import F.AbstractC0023y;
import F.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import d.AbstractC0092a;
import i.B0;
import i.C0135b;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f812a;

    /* renamed from: b, reason: collision with root package name */
    public View f813b;

    /* renamed from: c, reason: collision with root package name */
    public View f814c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f815d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f816e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f817f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f818g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f819h;

    /* renamed from: i, reason: collision with root package name */
    public final int f820i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0135b c0135b = new C0135b(this);
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.q(this, c0135b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0092a.f2006a);
        boolean z2 = false;
        this.f815d = obtainStyledAttributes.getDrawable(0);
        this.f816e = obtainStyledAttributes.getDrawable(2);
        this.f820i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131296611) {
            this.f818g = true;
            this.f817f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f818g ? !(this.f815d != null || this.f816e != null) : this.f817f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f815d;
        if (drawable != null && drawable.isStateful()) {
            this.f815d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f816e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f816e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f817f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f817f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f815d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f816e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f817f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f813b = findViewById(2131296304);
        this.f814c = findViewById(2131296312);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f812a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.f818g) {
            Drawable drawable = this.f817f;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f815d != null) {
                if (this.f813b.getVisibility() == 0) {
                    this.f815d.setBounds(this.f813b.getLeft(), this.f813b.getTop(), this.f813b.getRight(), this.f813b.getBottom());
                } else {
                    View view = this.f814c;
                    if (view == null || view.getVisibility() != 0) {
                        this.f815d.setBounds(0, 0, 0, 0);
                    } else {
                        this.f815d.setBounds(this.f814c.getLeft(), this.f814c.getTop(), this.f814c.getRight(), this.f814c.getBottom());
                    }
                }
                z3 = true;
            } else {
                z3 = false;
            }
            this.f819h = false;
            if (!z3) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f813b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f820i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f813b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f815d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f815d);
        }
        this.f815d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f813b;
            if (view != null) {
                this.f815d.setBounds(view.getLeft(), this.f813b.getTop(), this.f813b.getRight(), this.f813b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f818g ? !(this.f815d != null || this.f816e != null) : this.f817f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f817f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f817f);
        }
        this.f817f = drawable;
        boolean z2 = this.f818g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f817f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f815d != null || this.f816e != null) : this.f817f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f816e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f816e);
        }
        this.f816e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f819h && this.f816e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f818g ? !(this.f815d != null || this.f816e != null) : this.f817f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(B0 b02) {
    }

    public void setTransitioning(boolean z2) {
        this.f812a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f815d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f816e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f817f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f815d;
        boolean z2 = this.f818g;
        return (drawable == drawable2 && !z2) || (drawable == this.f816e && this.f819h) || ((drawable == this.f817f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }
}
