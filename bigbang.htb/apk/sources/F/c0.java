package F;

import android.graphics.Insets;
import android.view.WindowInsets;
import y.C0238b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class c0 extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public C0238b f82f;

    public c0(f0 f0Var, WindowInsets windowInsets) {
        super(f0Var, windowInsets);
        this.f82f = null;
    }

    @Override // F.e0
    public C0238b f() {
        if (this.f82f == null) {
            Insets mandatorySystemGestureInsets = this.f75c.getMandatorySystemGestureInsets();
            this.f82f = C0238b.a(mandatorySystemGestureInsets.left, mandatorySystemGestureInsets.top, mandatorySystemGestureInsets.right, mandatorySystemGestureInsets.bottom);
        }
        return this.f82f;
    }

    @Override // F.e0
    public f0 i(int i2, int i3, int i4, int i5) {
        return f0.f(this.f75c.inset(i2, i3, i4, i5), null);
    }
}
