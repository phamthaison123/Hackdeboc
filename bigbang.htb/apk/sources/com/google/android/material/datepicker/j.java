package com.google.android.material.datepicker;

import S.P;
import S.U;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j extends U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1806c;

    public j(l lVar, t tVar, MaterialButton materialButton) {
        this.f1806c = lVar;
        this.f1804a = tVar;
        this.f1805b = materialButton;
    }

    @Override // S.U
    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.f1805b.getText());
        }
    }

    @Override // S.U
    public final void b(RecyclerView recyclerView, int i2, int i3) {
        int F0;
        l lVar = this.f1806c;
        if (i2 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f1817Z.getLayoutManager();
            View H0 = linearLayoutManager.H0(0, linearLayoutManager.v(), false);
            F0 = H0 == null ? -1 : P.D(H0);
        } else {
            F0 = ((LinearLayoutManager) lVar.f1817Z.getLayoutManager()).F0();
        }
        t tVar = this.f1804a;
        Calendar a2 = w.a(tVar.f1848d.f1786a.f1832a);
        a2.add(2, F0);
        lVar.f1813V = new p(a2);
        Calendar a3 = w.a(tVar.f1848d.f1786a.f1832a);
        a3.add(2, F0);
        a3.set(5, 1);
        Calendar a4 = w.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        this.f1805b.setText(DateUtils.formatDateTime(tVar.f1847c, a4.getTimeInMillis() - TimeZone.getDefault().getOffset(r4), 36));
    }
}
