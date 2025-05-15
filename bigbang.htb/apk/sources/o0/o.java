package o0;

import F.AbstractC0024z;
import F.B;
import F.O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import i.X;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3402a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f3403b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f3404c;

    /* renamed from: d, reason: collision with root package name */
    public int f3405d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f3406e;

    /* renamed from: f, reason: collision with root package name */
    public Animator f3407f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3408g;

    /* renamed from: h, reason: collision with root package name */
    public int f3409h;

    /* renamed from: i, reason: collision with root package name */
    public int f3410i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3411j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3412k;

    /* renamed from: l, reason: collision with root package name */
    public X f3413l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3414m;

    /* renamed from: n, reason: collision with root package name */
    public int f3415n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f3416o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3417p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3418q;

    /* renamed from: r, reason: collision with root package name */
    public X f3419r;

    /* renamed from: s, reason: collision with root package name */
    public int f3420s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f3421t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f3422u;

    public o(TextInputLayout textInputLayout) {
        this.f3402a = textInputLayout.getContext();
        this.f3403b = textInputLayout;
        this.f3408g = r0.getResources().getDimensionPixelSize(2131165327);
    }

    public final void a(TextView textView, int i2) {
        if (this.f3404c == null && this.f3406e == null) {
            Context context = this.f3402a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3404c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3404c;
            TextInputLayout textInputLayout = this.f3403b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3406e = new FrameLayout(context);
            this.f3404c.addView(this.f3406e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f3406e.setVisibility(0);
            this.f3406e.addView(textView);
        } else {
            this.f3404c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3404c.setVisibility(0);
        this.f3405d++;
    }

    public final void b() {
        if (this.f3404c != null) {
            TextInputLayout textInputLayout = this.f3403b;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3402a;
                boolean i2 = h0.k.i(context);
                LinearLayout linearLayout = this.f3404c;
                WeakHashMap weakHashMap = O.f58a;
                int f2 = AbstractC0024z.f(editText);
                if (i2) {
                    f2 = context.getResources().getDimensionPixelSize(2131165525);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165524);
                if (i2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165526);
                }
                int e2 = AbstractC0024z.e(editText);
                if (i2) {
                    e2 = context.getResources().getDimensionPixelSize(2131165525);
                }
                AbstractC0024z.k(linearLayout, f2, dimensionPixelSize, e2, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f3407f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z2) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i4 == i2 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(Y.a.f706a);
            arrayList.add(ofFloat);
            if (i4 == i2) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f3408g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(Y.a.f709d);
                arrayList.add(ofFloat2);
            }
        }
    }

    public final boolean e() {
        return (this.f3410i != 1 || this.f3413l == null || TextUtils.isEmpty(this.f3411j)) ? false : true;
    }

    public final TextView f(int i2) {
        if (i2 == 1) {
            return this.f3413l;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f3419r;
    }

    public final void g() {
        this.f3411j = null;
        c();
        if (this.f3409h == 1) {
            if (!this.f3418q || TextUtils.isEmpty(this.f3417p)) {
                this.f3410i = 0;
            } else {
                this.f3410i = 2;
            }
        }
        j(this.f3409h, this.f3410i, i(this.f3413l, null));
    }

    public final void h(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3404c;
        if (linearLayout == null) {
            return;
        }
        if ((i2 == 0 || i2 == 1) && (frameLayout = this.f3406e) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i3 = this.f3405d - 1;
        this.f3405d = i3;
        LinearLayout linearLayout2 = this.f3404c;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = O.f58a;
        TextInputLayout textInputLayout = this.f3403b;
        return B.c(textInputLayout) && textInputLayout.isEnabled() && !(this.f3410i == this.f3409h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void j(int i2, int i3, boolean z2) {
        TextView f2;
        TextView f3;
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3407f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3418q, this.f3419r, 2, i2, i3);
            d(arrayList, this.f3412k, this.f3413l, 1, i2, i3);
            B.a.e0(animatorSet, arrayList);
            animatorSet.addListener(new n(this, i3, f(i2), i2, f(i3)));
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (f3 = f(i3)) != null) {
                f3.setVisibility(0);
                f3.setAlpha(1.0f);
            }
            if (i2 != 0 && (f2 = f(i2)) != null) {
                f2.setVisibility(4);
                if (i2 == 1) {
                    f2.setText((CharSequence) null);
                }
            }
            this.f3409h = i3;
        }
        TextInputLayout textInputLayout = this.f3403b;
        textInputLayout.q();
        textInputLayout.s(z2, false);
        textInputLayout.z();
    }
}
