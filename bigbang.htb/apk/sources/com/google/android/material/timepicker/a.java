package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends h0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f1970a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f1970a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f1970a;
        if (isEmpty) {
            chipTextInputComboView.f1942a.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
        } else {
            chipTextInputComboView.f1942a.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
        }
    }
}
