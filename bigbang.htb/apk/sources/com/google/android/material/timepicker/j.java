package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f1983a;

    public j(TimePickerView timePickerView) {
        this.f1983a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i2 = TimePickerView.f1968q;
        this.f1983a.getClass();
        return false;
    }
}
