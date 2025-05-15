package com.google.android.material.datepicker;

import S.G;
import S.f0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class y extends G {

    /* renamed from: c, reason: collision with root package name */
    public final l f1854c;

    public y(l lVar) {
        this.f1854c = lVar;
    }

    @Override // S.G
    public final int a() {
        return this.f1854c.f1812U.f1790e;
    }

    @Override // S.G
    public final void c(f0 f0Var, int i2) {
        l lVar = this.f1854c;
        int i3 = lVar.f1812U.f1786a.f1834c + i2;
        TextView textView = ((x) f0Var).f1853t;
        String string = textView.getContext().getString(2131755115);
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i3)));
        d dVar = lVar.f1815X;
        if (w.b().get(1) == i3) {
            i.r rVar = dVar.f1793b;
        } else {
            i.r rVar2 = dVar.f1792a;
        }
        throw null;
    }

    @Override // S.G
    public final f0 d(RecyclerView recyclerView) {
        return new x((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(2131492944, (ViewGroup) recyclerView, false));
    }
}
