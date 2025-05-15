package o0;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import e.ViewOnClickListenerC0096b;
import i.C0139d;
import i.E0;
import java.util.LinkedHashSet;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l extends m {

    /* renamed from: e, reason: collision with root package name */
    public final h f3380e;

    /* renamed from: f, reason: collision with root package name */
    public final E0 f3381f;

    /* renamed from: g, reason: collision with root package name */
    public final i f3382g;

    /* renamed from: h, reason: collision with root package name */
    public final a f3383h;

    /* renamed from: i, reason: collision with root package name */
    public final b f3384i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3385j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3386k;

    /* renamed from: l, reason: collision with root package name */
    public long f3387l;

    /* renamed from: m, reason: collision with root package name */
    public StateListDrawable f3388m;

    /* renamed from: n, reason: collision with root package name */
    public m0.h f3389n;

    /* renamed from: o, reason: collision with root package name */
    public AccessibilityManager f3390o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f3391p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f3392q;

    public l(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f3380e = new h(this, 0);
        this.f3381f = new E0(2, this);
        this.f3382g = new i(this, textInputLayout);
        this.f3383h = new a(this, 1);
        this.f3384i = new b(this, 1);
        this.f3385j = false;
        this.f3386k = false;
        this.f3387l = Long.MAX_VALUE;
    }

    public static void d(l lVar, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            lVar.getClass();
            return;
        }
        lVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - lVar.f3387l;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            lVar.f3385j = false;
        }
        if (lVar.f3385j) {
            lVar.f3385j = false;
            return;
        }
        lVar.g(!lVar.f3386k);
        if (!lVar.f3386k) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public static boolean f(EditText editText) {
        return editText.getKeyListener() != null;
    }

    @Override // o0.m
    public final void a() {
        Context context = this.f3394b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131165697);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131165630);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(2131165632);
        m0.h e2 = e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        m0.h e3 = e(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f3389n = e2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f3388m = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, e2);
        this.f3388m.addState(new int[0], e3);
        int i2 = this.f3396d;
        if (i2 == 0) {
            i2 = 2131230854;
        }
        TextInputLayout textInputLayout = this.f3393a;
        textInputLayout.setEndIconDrawable(i2);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131755046));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC0096b(4, this));
        LinkedHashSet linkedHashSet = textInputLayout.f1911f0;
        a aVar = this.f3383h;
        linkedHashSet.add(aVar);
        if (textInputLayout.f1908e != null) {
            aVar.a(textInputLayout);
        }
        textInputLayout.f1919j0.add(this.f3384i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = Y.a.f706a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        int i3 = 1;
        ofFloat.addUpdateListener(new b0.a(i3, this));
        this.f3392q = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new b0.a(i3, this));
        this.f3391p = ofFloat2;
        ofFloat2.addListener(new C0139d(5, this));
        this.f3390o = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // o0.m
    public final boolean b(int i2) {
        return i2 != 0;
    }

    public final m0.h e(float f2, float f3, float f4, int i2) {
        m0.j jVar = new m0.j();
        m0.j jVar2 = new m0.j();
        m0.j jVar3 = new m0.j();
        m0.j jVar4 = new m0.j();
        m0.e e2 = h0.k.e();
        m0.e e3 = h0.k.e();
        m0.e e4 = h0.k.e();
        m0.e e5 = h0.k.e();
        m0.a aVar = new m0.a(f2);
        m0.a aVar2 = new m0.a(f2);
        m0.a aVar3 = new m0.a(f3);
        m0.a aVar4 = new m0.a(f3);
        m0.l lVar = new m0.l();
        lVar.f3129a = jVar;
        lVar.f3130b = jVar2;
        lVar.f3131c = jVar3;
        lVar.f3132d = jVar4;
        lVar.f3133e = aVar;
        lVar.f3134f = aVar2;
        lVar.f3135g = aVar4;
        lVar.f3136h = aVar3;
        lVar.f3137i = e2;
        lVar.f3138j = e3;
        lVar.f3139k = e4;
        lVar.f3140l = e5;
        Paint paint = m0.h.f3093w;
        String simpleName = m0.h.class.getSimpleName();
        Context context = this.f3394b;
        int m2 = h0.k.m(context, 2130968802, simpleName);
        m0.h hVar = new m0.h();
        hVar.i(context);
        hVar.k(ColorStateList.valueOf(m2));
        hVar.j(f4);
        hVar.setShapeAppearanceModel(lVar);
        m0.g gVar = hVar.f3094a;
        if (gVar.f3079h == null) {
            gVar.f3079h = new Rect();
        }
        hVar.f3094a.f3079h.set(0, i2, 0, i2);
        hVar.invalidateSelf();
        return hVar;
    }

    public final void g(boolean z2) {
        if (this.f3386k != z2) {
            this.f3386k = z2;
            this.f3392q.cancel();
            this.f3391p.start();
        }
    }
}
