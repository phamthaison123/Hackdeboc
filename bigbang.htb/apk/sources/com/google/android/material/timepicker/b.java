package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1971a;

    public b(ClockFaceView clockFaceView) {
        this.f1971a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1971a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1950s.f1959b) - clockFaceView.f1957z;
        if (height != clockFaceView.f1975q) {
            clockFaceView.f1975q = height;
            clockFaceView.f();
            int i2 = clockFaceView.f1975q;
            ClockHandView clockHandView = clockFaceView.f1950s;
            clockHandView.f1967j = i2;
            clockHandView.invalidate();
        }
        return true;
    }
}
