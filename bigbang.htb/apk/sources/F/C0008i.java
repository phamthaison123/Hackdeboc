package F;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0008i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f96a;

    public C0008i(DisplayCutout displayCutout) {
        this.f96a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0008i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f96a, ((C0008i) obj).f96a);
    }

    public final int hashCode() {
        Object obj = this.f96a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f96a + "}";
    }
}
