package m0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3067a;

    public a(float f2) {
        this.f3067a = f2;
    }

    @Override // m0.c
    public final float a(RectF rectF) {
        return this.f3067a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3067a == ((a) obj).f3067a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3067a)});
    }
}
