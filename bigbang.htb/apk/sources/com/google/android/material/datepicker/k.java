package com.google.android.material.datepicker;

import S.P;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1809c;

    public /* synthetic */ k(l lVar, t tVar, int i2) {
        this.f1807a = i2;
        this.f1809c = lVar;
        this.f1808b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f1807a;
        t tVar = this.f1808b;
        l lVar = this.f1809c;
        switch (i2) {
            case 0:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f1817Z.getLayoutManager();
                View H0 = linearLayoutManager.H0(0, linearLayoutManager.v(), false);
                int D2 = (H0 == null ? -1 : P.D(H0)) + 1;
                if (D2 < lVar.f1817Z.getAdapter().a()) {
                    Calendar a2 = w.a(tVar.f1848d.f1786a.f1832a);
                    a2.add(2, D2);
                    lVar.F(new p(a2));
                    break;
                }
                break;
            default:
                int F0 = ((LinearLayoutManager) lVar.f1817Z.getLayoutManager()).F0() - 1;
                if (F0 >= 0) {
                    Calendar a3 = w.a(tVar.f1848d.f1786a.f1832a);
                    a3.add(2, F0);
                    lVar.F(new p(a3));
                    break;
                }
                break;
        }
    }
}
