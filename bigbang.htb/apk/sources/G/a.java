package G;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f113a;

    /* renamed from: b, reason: collision with root package name */
    public final d f114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f115c;

    public a(int i2, d dVar, int i3) {
        this.f113a = i2;
        this.f114b = dVar;
        this.f115c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f113a);
        this.f114b.f129a.performAction(this.f115c, bundle);
    }
}
