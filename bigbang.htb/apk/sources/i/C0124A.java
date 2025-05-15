package i;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import d.AbstractC0092a;

/* renamed from: i.A, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0124A {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2605a;

    /* renamed from: b, reason: collision with root package name */
    public final e.z f2606b;

    public C0124A(TextView textView) {
        this.f2605a = textView;
        this.f2606b = new e.z(textView);
    }

    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f2605a.getContext().obtainStyledAttributes(attributeSet, AbstractC0092a.f2014i, i2, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        ((m0.e) this.f2606b.f2221b).e(z2);
    }

    public final void c(boolean z2) {
        ((m0.e) this.f2606b.f2221b).f(z2);
    }
}
