package androidx.appcompat.view.menu;

import F.AbstractC0023y;
import F.O;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import d.AbstractC0092a;
import e.C0097c;
import h.C;
import h.q;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ListMenuItemView extends LinearLayout implements C, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public q f795a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f796b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f797c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f798d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f799e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f800f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f801g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f802h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f803i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f804j;

    /* renamed from: k, reason: collision with root package name */
    public final int f805k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f806l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f807m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f808n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f809o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f810p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f811q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0097c t2 = C0097c.t(getContext(), attributeSet, AbstractC0092a.f2023r, 2130969165, 0);
        this.f804j = t2.g(5);
        this.f805k = t2.m(1, -1);
        this.f807m = t2.a(7, false);
        this.f806l = context;
        this.f808n = t2.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, 2130968900, 0);
        this.f809o = obtainStyledAttributes.hasValue(0);
        t2.u();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f810p == null) {
            this.f810p = LayoutInflater.from(getContext());
        }
        return this.f810p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f801g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f802h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f802h.getLayoutParams();
        rect.top = this.f802h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if ((r0.f2493n.n() ? r0.f2489j : r0.f2487h) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    @Override // h.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(h.q r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(h.q):void");
    }

    @Override // h.C
    public q getItemData() {
        return this.f795a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = O.f58a;
        AbstractC0023y.q(this, this.f804j);
        TextView textView = (TextView) findViewById(2131296665);
        this.f798d = textView;
        int i2 = this.f805k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f806l, i2);
        }
        this.f800f = (TextView) findViewById(2131296597);
        ImageView imageView = (ImageView) findViewById(2131296627);
        this.f801g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f808n);
        }
        this.f802h = (ImageView) findViewById(2131296438);
        this.f803i = (LinearLayout) findViewById(2131296370);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f796b != null && this.f807m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f796b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f797c == null && this.f799e == null) {
            return;
        }
        if ((this.f795a.f2503x & 4) != 0) {
            if (this.f797c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131492881, (ViewGroup) this, false);
                this.f797c = radioButton;
                LinearLayout linearLayout = this.f803i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f797c;
            view = this.f799e;
        } else {
            if (this.f799e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131492878, (ViewGroup) this, false);
                this.f799e = checkBox;
                LinearLayout linearLayout2 = this.f803i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f799e;
            view = this.f797c;
        }
        if (z2) {
            compoundButton.setChecked(this.f795a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f799e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f797c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f795a.f2503x & 4) != 0) {
            if (this.f797c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131492881, (ViewGroup) this, false);
                this.f797c = radioButton;
                LinearLayout linearLayout = this.f803i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f797c;
        } else {
            if (this.f799e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131492878, (ViewGroup) this, false);
                this.f799e = checkBox;
                LinearLayout linearLayout2 = this.f803i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f799e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f811q = z2;
        this.f807m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f802h;
        if (imageView != null) {
            imageView.setVisibility((this.f809o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f795a.f2493n.getClass();
        boolean z2 = this.f811q;
        if (z2 || this.f807m) {
            ImageView imageView = this.f796b;
            if (imageView == null && drawable == null && !this.f807m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(2131492879, (ViewGroup) this, false);
                this.f796b = imageView2;
                LinearLayout linearLayout = this.f803i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f807m) {
                this.f796b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f796b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f796b.getVisibility() != 0) {
                this.f796b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f798d.getVisibility() != 8) {
                this.f798d.setVisibility(8);
            }
        } else {
            this.f798d.setText(charSequence);
            if (this.f798d.getVisibility() != 0) {
                this.f798d.setVisibility(0);
            }
        }
    }
}
