package com.google.android.material.datepicker;

import S.M;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i extends M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1803a;

    public i(l lVar) {
        this.f1803a = lVar;
        w.c(null);
        w.c(null);
    }

    @Override // S.M
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            int i2 = l.f1810c0;
            this.f1803a.getClass();
            throw null;
        }
    }
}
