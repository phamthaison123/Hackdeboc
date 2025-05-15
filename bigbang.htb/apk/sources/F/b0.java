package F;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class b0 extends a0 {
    public b0(f0 f0Var, WindowInsets windowInsets) {
        super(f0Var, windowInsets);
    }

    @Override // F.e0
    public f0 a() {
        return f0.f(this.f75c.consumeDisplayCutout(), null);
    }

    @Override // F.e0
    public C0008i e() {
        DisplayCutout displayCutout = this.f75c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0008i(displayCutout);
    }

    @Override // F.e0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (Objects.equals(this.f75c, b0Var.f75c)) {
            b0Var.getClass();
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // F.e0
    public int hashCode() {
        return this.f75c.hashCode();
    }
}
