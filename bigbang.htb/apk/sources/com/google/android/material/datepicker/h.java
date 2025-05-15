package com.google.android.material.datepicker;

import S.C;
import S.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f1801E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ l f1802F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, int i2, int i3) {
        super(i2);
        this.f1802F = lVar;
        this.f1801E = i3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, S.P
    public final void s0(RecyclerView recyclerView, int i2) {
        C c2 = new C(this, recyclerView.getContext(), 1);
        c2.f553a = i2;
        t0(c2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void v0(c0 c0Var, int[] iArr) {
        int i2 = this.f1801E;
        l lVar = this.f1802F;
        if (i2 == 0) {
            iArr[0] = lVar.f1817Z.getWidth();
            iArr[1] = lVar.f1817Z.getWidth();
        } else {
            iArr[0] = lVar.f1817Z.getHeight();
            iArr[1] = lVar.f1817Z.getHeight();
        }
    }
}
