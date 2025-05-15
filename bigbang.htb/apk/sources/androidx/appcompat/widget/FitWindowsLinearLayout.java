package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import e.m;
import i.InterfaceC0152j0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0152j0 f894a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        InterfaceC0152j0 interfaceC0152j0 = this.f894a;
        if (interfaceC0152j0 != null) {
            rect.top = ((m) interfaceC0152j0).f2127b.C(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC0152j0 interfaceC0152j0) {
        this.f894a = interfaceC0152j0;
    }
}
