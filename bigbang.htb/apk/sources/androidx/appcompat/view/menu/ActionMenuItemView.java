package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import d.AbstractC0092a;
import h.AbstractC0118c;
import h.C;
import h.C0117b;
import h.n;
import h.o;
import h.q;
import i.InterfaceC0159n;
import i.X;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ActionMenuItemView extends X implements C, View.OnClickListener, InterfaceC0159n {

    /* renamed from: f, reason: collision with root package name */
    public q f782f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f783g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f784h;

    /* renamed from: i, reason: collision with root package name */
    public n f785i;

    /* renamed from: j, reason: collision with root package name */
    public C0117b f786j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0118c f787k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f788l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f789m;

    /* renamed from: n, reason: collision with root package name */
    public final int f790n;

    /* renamed from: o, reason: collision with root package name */
    public int f791o;

    /* renamed from: p, reason: collision with root package name */
    public final int f792p;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f788l = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0092a.f2008c, 0, 0);
        this.f790n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f792p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f791o = -1;
        setSaveEnabled(false);
    }

    @Override // i.InterfaceC0159n
    public final boolean a() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f782f.getIcon() == null;
    }

    @Override // i.InterfaceC0159n
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // h.C
    public final void c(q qVar) {
        this.f782f = qVar;
        setIcon(qVar.getIcon());
        setTitle(qVar.getTitleCondensed());
        setId(qVar.f2480a);
        setVisibility(qVar.isVisible() ? 0 : 8);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f786j == null) {
            this.f786j = new C0117b(this);
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f783g);
        if (this.f784h != null && ((this.f782f.f2504y & 4) != 4 || (!this.f788l && !this.f789m))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f783g : null);
        CharSequence charSequence = this.f782f.f2496q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f782f.f2484e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f782f.f2497r;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z4 ? null : this.f782f.f2484e);
        } else {
            setTooltipText(charSequence2);
        }
    }

    @Override // h.C
    public q getItemData() {
        return this.f782f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n nVar = this.f785i;
        if (nVar != null) {
            nVar.e(this.f782f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f788l = e();
        f();
    }

    @Override // i.X, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2 = !TextUtils.isEmpty(getText());
        if (z2 && (i4 = this.f791o) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f790n;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (z2 || this.f784h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f784h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0117b c0117b;
        if (this.f782f.hasSubMenu() && (c0117b = this.f786j) != null && c0117b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f789m != z2) {
            this.f789m = z2;
            q qVar = this.f782f;
            if (qVar != null) {
                o oVar = qVar.f2493n;
                oVar.f2460k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f784h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f792p;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(n nVar) {
        this.f785i = nVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f791o = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0118c abstractC0118c) {
        this.f787k = abstractC0118c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f783g = charSequence;
        f();
    }
}
