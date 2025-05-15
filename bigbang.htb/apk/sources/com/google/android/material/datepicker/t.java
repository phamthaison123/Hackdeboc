package com.google.android.material.datepicker;

import S.G;
import S.Q;
import S.f0;
import android.R;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import e.z;
import java.util.Calendar;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class t extends G {

    /* renamed from: c, reason: collision with root package name */
    public final Context f1847c;

    /* renamed from: d, reason: collision with root package name */
    public final c f1848d;

    /* renamed from: e, reason: collision with root package name */
    public final z f1849e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1850f;

    public t(ContextThemeWrapper contextThemeWrapper, c cVar, z zVar) {
        p pVar = cVar.f1786a;
        p pVar2 = cVar.f1789d;
        if (pVar.compareTo(pVar2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (pVar2.compareTo(cVar.f1787b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i2 = q.f1839d;
        int i3 = l.f1810c0;
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(2131165585) * i2;
        int dimensionPixelSize2 = n.J(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(2131165585) : 0;
        this.f1847c = contextThemeWrapper;
        this.f1850f = dimensionPixelSize + dimensionPixelSize2;
        this.f1848d = cVar;
        this.f1849e = zVar;
        if (this.f264a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f265b = true;
    }

    @Override // S.G
    public final int a() {
        return this.f1848d.f1791f;
    }

    @Override // S.G
    public final long b(int i2) {
        Calendar a2 = w.a(this.f1848d.f1786a.f1832a);
        a2.add(2, i2);
        return new p(a2).f1832a.getTimeInMillis();
    }

    @Override // S.G
    public final void c(f0 f0Var, int i2) {
        s sVar = (s) f0Var;
        c cVar = this.f1848d;
        Calendar a2 = w.a(cVar.f1786a.f1832a);
        a2.add(2, i2);
        p pVar = new p(a2);
        sVar.f1845t.setText(pVar.e(sVar.f367a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sVar.f1846u.findViewById(2131296498);
        if (materialCalendarGridView.a() == null || !pVar.equals(materialCalendarGridView.a().f1840a)) {
            new q(pVar, cVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // S.G
    public final f0 d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(2131492940, (ViewGroup) recyclerView, false);
        if (!n.J(recyclerView.getContext(), R.attr.windowFullscreen)) {
            return new s(linearLayout, false);
        }
        linearLayout.setLayoutParams(new Q(-1, this.f1850f));
        return new s(linearLayout, true);
    }
}
