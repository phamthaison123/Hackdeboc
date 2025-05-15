package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import d.AbstractC0092a;
import e.C0097c;
import java.util.WeakHashMap;

/* renamed from: i.C, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0126C implements G.o {

    /* renamed from: a, reason: collision with root package name */
    public int f2618a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f2619b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2620c;

    public C0126C(ImageView imageView) {
        this.f2619b = imageView;
    }

    public final void a() {
        S0 s0;
        ImageView imageView = (ImageView) this.f2619b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0146g0.b(drawable);
        }
        if (drawable == null || (s0 = (S0) this.f2620c) == null) {
            return;
        }
        C0178x.d(drawable, s0, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i2) {
        int m2;
        View view = this.f2619b;
        ImageView imageView = (ImageView) view;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0092a.f2011f;
        C0097c t2 = C0097c.t(context, attributeSet, iArr, i2, 0);
        Context context2 = imageView.getContext();
        TypedArray typedArray = (TypedArray) t2.f2079b;
        WeakHashMap weakHashMap = F.O.f58a;
        F.J.c(imageView, context2, iArr, attributeSet, typedArray, i2, 0);
        try {
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null && (m2 = t2.m(1, -1)) != -1 && (drawable = B.a.A(((ImageView) view).getContext(), m2)) != null) {
                ((ImageView) view).setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0146g0.b(drawable);
            }
            if (t2.r(2)) {
                ((ImageView) view).setImageTintList(t2.b(2));
            }
            if (t2.r(3)) {
                ((ImageView) view).setImageTintMode(AbstractC0146g0.c(t2.j(3, -1), null));
            }
            t2.u();
        } catch (Throwable th) {
            t2.u();
            throw th;
        }
    }

    public final void c(int i2) {
        View view = this.f2619b;
        if (i2 != 0) {
            ImageView imageView = (ImageView) view;
            Drawable A2 = B.a.A(imageView.getContext(), i2);
            if (A2 != null) {
                AbstractC0146g0.b(A2);
            }
            imageView.setImageDrawable(A2);
        } else {
            ((ImageView) view).setImageDrawable(null);
        }
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (((S0) this.f2620c) == null) {
            this.f2620c = new S0(0);
        }
        S0 s0 = (S0) this.f2620c;
        s0.f2708c = colorStateList;
        s0.f2707b = true;
        a();
    }

    public final void e(PorterDuff.Mode mode) {
        if (((S0) this.f2620c) == null) {
            this.f2620c = new S0(0);
        }
        S0 s0 = (S0) this.f2620c;
        s0.f2709d = mode;
        s0.f2706a = true;
        a();
    }

    @Override // G.o
    public final boolean i(View view) {
        throw null;
    }
}
