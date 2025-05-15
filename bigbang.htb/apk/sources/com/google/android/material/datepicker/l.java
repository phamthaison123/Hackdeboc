package com.google.android.material.datepicker;

import F.O;
import F.Q;
import S.D;
import S.i0;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import e.ViewOnClickListenerC0096b;
import e.z;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l<S> extends u {

    /* renamed from: c0, reason: collision with root package name */
    public static final /* synthetic */ int f1810c0 = 0;

    /* renamed from: T, reason: collision with root package name */
    public int f1811T;

    /* renamed from: U, reason: collision with root package name */
    public c f1812U;

    /* renamed from: V, reason: collision with root package name */
    public p f1813V;

    /* renamed from: W, reason: collision with root package name */
    public int f1814W;

    /* renamed from: X, reason: collision with root package name */
    public d f1815X;

    /* renamed from: Y, reason: collision with root package name */
    public RecyclerView f1816Y;

    /* renamed from: Z, reason: collision with root package name */
    public RecyclerView f1817Z;

    /* renamed from: a0, reason: collision with root package name */
    public View f1818a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f1819b0;

    public final void F(p pVar) {
        t tVar = (t) this.f1817Z.getAdapter();
        int f2 = tVar.f1848d.f1786a.f(pVar);
        int f3 = f2 - tVar.f1848d.f1786a.f(this.f1813V);
        boolean z2 = Math.abs(f3) > 3;
        boolean z3 = f3 > 0;
        this.f1813V = pVar;
        if (z2 && z3) {
            this.f1817Z.a0(f2 - 3);
            this.f1817Z.post(new x.j(f2, 1, this));
        } else if (!z2) {
            this.f1817Z.post(new x.j(f2, 1, this));
        } else {
            this.f1817Z.a0(f2 + 3);
            this.f1817Z.post(new x.j(f2, 1, this));
        }
    }

    public final void G(int i2) {
        this.f1814W = i2;
        if (i2 == 2) {
            this.f1816Y.getLayoutManager().i0(this.f1813V.f1834c - ((y) this.f1816Y.getAdapter()).f1854c.f1812U.f1786a.f1834c);
            this.f1818a0.setVisibility(0);
            this.f1819b0.setVisibility(8);
            return;
        }
        if (i2 == 1) {
            this.f1818a0.setVisibility(8);
            this.f1819b0.setVisibility(0);
            F(this.f1813V);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f1392f;
        }
        this.f1811T = bundle.getInt("THEME_RES_ID_KEY");
        Q.e(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f1812U = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f1813V = (p) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        int i3;
        D d2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.f1811T);
        this.f1815X = new d(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        p pVar = this.f1812U.f1786a;
        int i4 = 1;
        int i5 = 0;
        if (n.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i2 = 2131492943;
            i3 = 1;
        } else {
            i2 = 2131492938;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = B().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131165605) + resources.getDimensionPixelOffset(2131165607) + resources.getDimensionPixelSize(2131165606);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165590);
        int i6 = q.f1839d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(2131165604) * (i6 - 1)) + (resources.getDimensionPixelSize(2131165585) * i6) + resources.getDimensionPixelOffset(2131165582));
        GridView gridView = (GridView) inflate.findViewById(2131296507);
        O.h(gridView, new g(0, this));
        gridView.setAdapter((ListAdapter) new f());
        gridView.setNumColumns(pVar.f1835d);
        gridView.setEnabled(false);
        this.f1817Z = (RecyclerView) inflate.findViewById(2131296510);
        h();
        this.f1817Z.setLayoutManager(new h(this, i3, i3));
        this.f1817Z.setTag("MONTHS_VIEW_GROUP_TAG");
        t tVar = new t(contextThemeWrapper, this.f1812U, new z(28, this));
        this.f1817Z.setAdapter(tVar);
        int integer = contextThemeWrapper.getResources().getInteger(2131361828);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(2131296513);
        this.f1816Y = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f1816Y.setLayoutManager(new GridLayoutManager(integer));
            this.f1816Y.setAdapter(new y(this));
            this.f1816Y.g(new i(this));
        }
        if (inflate.findViewById(2131296500) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(2131296500);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            O.h(materialButton, new g(1, this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(2131296502);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(2131296501);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f1818a0 = inflate.findViewById(2131296513);
            this.f1819b0 = inflate.findViewById(2131296506);
            G(1);
            materialButton.setText(this.f1813V.e(inflate.getContext()));
            this.f1817Z.h(new j(this, tVar, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0096b(2, this));
            materialButton3.setOnClickListener(new k(this, tVar, i5));
            materialButton2.setOnClickListener(new k(this, tVar, i4));
        }
        if (!n.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (d2 = new D()).f258a) != (recyclerView = this.f1817Z)) {
            i0 i0Var = d2.f259b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1557e0;
                if (arrayList != null) {
                    arrayList.remove(i0Var);
                }
                d2.f258a.setOnFlingListener(null);
            }
            d2.f258a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                d2.f258a.h(i0Var);
                d2.f258a.setOnFlingListener(d2);
                new Scroller(d2.f258a.getContext(), new DecelerateInterpolator());
                d2.f();
            }
        }
        this.f1817Z.a0(tVar.f1848d.f1786a.f(this.f1813V));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void v(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1811T);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1812U);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f1813V);
    }
}
