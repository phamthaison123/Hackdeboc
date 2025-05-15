package com.google.android.material.datepicker;

import F.Q;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class o<S> extends u {

    /* renamed from: T, reason: collision with root package name */
    public int f1830T;

    /* renamed from: U, reason: collision with root package name */
    public c f1831U;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f1392f;
        }
        this.f1830T = bundle.getInt("THEME_RES_ID_KEY");
        Q.e(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f1831U = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.f1830T));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void v(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1830T);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1831U);
    }
}
