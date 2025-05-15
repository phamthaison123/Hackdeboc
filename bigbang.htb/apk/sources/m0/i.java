package m0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3116a;

    public i(float f2) {
        this.f3116a = f2;
    }

    @Override // m0.c
    public final float a(RectF rectF) {
        return rectF.height() * this.f3116a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f3116a == ((i) obj).f3116a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3116a)});
    }
}
