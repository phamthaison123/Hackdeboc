package U;

import android.view.View;
import android.view.WindowId;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class G implements H {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f590a;

    public G(View view) {
        this.f590a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G) && ((G) obj).f590a.equals(this.f590a);
    }

    public final int hashCode() {
        return this.f590a.hashCode();
    }
}
