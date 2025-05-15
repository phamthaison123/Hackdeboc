package com.google.android.material.timepicker;

import F.AbstractC0024z;
import F.B;
import F.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.WeakHashMap;
import q.n;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f1968q = 0;

    /* renamed from: p, reason: collision with root package name */
    public final MaterialButtonToggleGroup f1969p;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        h hVar = new h(this);
        LayoutInflater.from(context).inflate(2131492926, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(2131296481);
        this.f1969p = materialButtonToggleGroup;
        materialButtonToggleGroup.f1748d.add(new i(this));
        Chip chip = (Chip) findViewById(2131296486);
        Chip chip2 = (Chip) findViewById(2131296483);
        WeakHashMap weakHashMap = O.f58a;
        B.f(chip, 2);
        B.f(chip2, 2);
        k kVar = new k(new GestureDetector(getContext(), new j(this)));
        chip.setOnTouchListener(kVar);
        chip2.setOnTouchListener(kVar);
        chip.setTag(2131296595, 12);
        chip2.setTag(2131296595, 10);
        chip.setOnClickListener(hVar);
        chip2.setOnClickListener(hVar);
    }

    public final void f() {
        if (this.f1969p.getVisibility() == 0) {
            n nVar = new n();
            nVar.b(this);
            WeakHashMap weakHashMap = O.f58a;
            char c2 = AbstractC0024z.d(this) == 0 ? (char) 2 : (char) 1;
            HashMap hashMap = nVar.f3674c;
            if (hashMap.containsKey(2131296476)) {
                q.i iVar = (q.i) hashMap.get(2131296476);
                switch (c2) {
                    case 1:
                        q.j jVar = iVar.f3583d;
                        jVar.f3627h = -1;
                        jVar.f3625g = -1;
                        jVar.f3589C = -1;
                        jVar.f3595I = -1;
                        break;
                    case 2:
                        q.j jVar2 = iVar.f3583d;
                        jVar2.f3631j = -1;
                        jVar2.f3629i = -1;
                        jVar2.f3590D = -1;
                        jVar2.f3597K = -1;
                        break;
                    case 3:
                        q.j jVar3 = iVar.f3583d;
                        jVar3.f3633l = -1;
                        jVar3.f3632k = -1;
                        jVar3.f3591E = -1;
                        jVar3.f3596J = -1;
                        break;
                    case 4:
                        q.j jVar4 = iVar.f3583d;
                        jVar4.f3634m = -1;
                        jVar4.f3635n = -1;
                        jVar4.f3592F = -1;
                        jVar4.f3598L = -1;
                        break;
                    case 5:
                        iVar.f3583d.f3636o = -1;
                        break;
                    case 6:
                        q.j jVar5 = iVar.f3583d;
                        jVar5.f3637p = -1;
                        jVar5.f3638q = -1;
                        jVar5.f3594H = -1;
                        jVar5.f3600N = -1;
                        break;
                    case 7:
                        q.j jVar6 = iVar.f3583d;
                        jVar6.f3639r = -1;
                        jVar6.f3640s = -1;
                        jVar6.f3593G = -1;
                        jVar6.f3599M = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            nVar.a(this);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            f();
        }
    }
}
