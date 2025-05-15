package com.google.android.material.datepicker;

import F.B;
import F.E;
import F.O;
import F.Q;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class n<S> extends DialogInterfaceOnCancelListenerC0071l {

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f1821h0;

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet f1822i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f1823j0;
    public u k0;

    /* renamed from: l0, reason: collision with root package name */
    public c f1824l0;

    /* renamed from: m0, reason: collision with root package name */
    public l f1825m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1826n0;

    /* renamed from: o0, reason: collision with root package name */
    public CharSequence f1827o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f1828p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1829q0;
    public CheckableImageButton r0;
    public m0.h s0;
    public Button t0;

    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1821h0 = new LinkedHashSet();
        this.f1822i0 = new LinkedHashSet();
    }

    public static int I(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131165583);
        p pVar = new p(w.b());
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165589);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131165603);
        int i2 = pVar.f1835d;
        return ((i2 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i2) + (dimensionPixelOffset * 2);
    }

    public static boolean J(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(h0.k.m(context, 2130969198, l.class.getCanonicalName()), new int[]{i2});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l
    public final Dialog G() {
        Context B2 = B();
        B();
        int i2 = this.f1823j0;
        if (i2 == 0) {
            H();
            throw null;
        }
        Dialog dialog = new Dialog(B2, i2);
        Context context = dialog.getContext();
        this.f1828p0 = J(context, R.attr.windowFullscreen);
        int m2 = h0.k.m(context, 2130968802, n.class.getCanonicalName());
        m0.h hVar = new m0.h(context, null, 2130969198, 2131821491);
        this.s0 = hVar;
        hVar.i(context);
        this.s0.k(ColorStateList.valueOf(m2));
        m0.h hVar2 = this.s0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = O.f58a;
        hVar2.j(E.i(decorView));
        return dialog;
    }

    public final void H() {
        Q.e(this.f1392f.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1821h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1822i0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1374E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l, androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f1392f;
        }
        this.f1823j0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        Q.e(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f1824l0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f1826n0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1827o0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1829q0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f1828p0 ? 2131492950 : 2131492949, viewGroup);
        Context context = inflate.getContext();
        if (this.f1828p0) {
            inflate.findViewById(2131296508).setLayoutParams(new LinearLayout.LayoutParams(I(context), -2));
        } else {
            inflate.findViewById(2131296509).setLayoutParams(new LinearLayout.LayoutParams(I(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(2131296520);
        WeakHashMap weakHashMap = O.f58a;
        B.f(textView, 1);
        this.r0 = (CheckableImageButton) inflate.findViewById(2131296522);
        TextView textView2 = (TextView) inflate.findViewById(2131296526);
        CharSequence charSequence = this.f1827o0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f1826n0);
        }
        this.r0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.r0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, B.a.A(context, 2131230844));
        stateListDrawable.addState(new int[0], B.a.A(context, 2131230846));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.r0.setChecked(this.f1829q0 != 0);
        O.h(this.r0, null);
        CheckableImageButton checkableImageButton2 = this.r0;
        this.r0.setContentDescription(checkableImageButton2.f1857d ? checkableImageButton2.getContext().getString(2131755129) : checkableImageButton2.getContext().getString(2131755131));
        this.r0.setOnClickListener(new m(this));
        this.t0 = (Button) inflate.findViewById(2131296368);
        H();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l, androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void v(Bundle bundle) {
        super.v(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1823j0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        c cVar = this.f1824l0;
        a aVar = new a();
        int i2 = a.f1784b;
        int i3 = a.f1784b;
        long j2 = cVar.f1786a.f1837f;
        long j3 = cVar.f1787b.f1837f;
        aVar.f1785a = Long.valueOf(cVar.f1789d.f1837f);
        p pVar = this.f1825m0.f1813V;
        if (pVar != null) {
            aVar.f1785a = Long.valueOf(pVar.f1837f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar.f1788c);
        p c2 = p.c(j2);
        p c3 = p.c(j3);
        b bVar = (b) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f1785a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c(c2, c3, bVar, l2 != null ? p.c(l2.longValue()) : null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1826n0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1827o0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l, androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void w() {
        super.w();
        Dialog dialog = this.f1349d0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f1828p0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.s0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = B().getResources().getDimensionPixelOffset(2131165591);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.s0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1349d0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new f0.a(dialog2, rect));
        }
        B();
        int i2 = this.f1823j0;
        if (i2 == 0) {
            H();
            throw null;
        }
        H();
        c cVar = this.f1824l0;
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", cVar.f1789d);
        lVar.E(bundle);
        this.f1825m0 = lVar;
        u uVar = lVar;
        if (this.r0.f1857d) {
            H();
            c cVar2 = this.f1824l0;
            u oVar = new o();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
            oVar.E(bundle2);
            uVar = oVar;
        }
        this.k0 = uVar;
        H();
        h();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l, androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void x() {
        this.k0.f1851S.clear();
        super.x();
    }
}
