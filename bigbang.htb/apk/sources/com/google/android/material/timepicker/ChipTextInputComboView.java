package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    public final Chip f1942a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f1943b;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(2131492924, (ViewGroup) this, false);
        this.f1942a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(2131492925, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f1943b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        editText.setSaveEnabled(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1942a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1943b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z2) {
        Chip chip = this.f1942a;
        chip.setChecked(z2);
        int i2 = z2 ? 0 : 4;
        EditText editText = this.f1943b;
        editText.setVisibility(i2);
        chip.setVisibility(z2 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new androidx.activity.b(9, editText));
            if (TextUtils.isEmpty(editText.getText())) {
                return;
            }
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1942a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i2, Object obj) {
        this.f1942a.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f1942a.toggle();
    }
}
