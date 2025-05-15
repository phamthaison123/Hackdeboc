package Y;

import android.animation.TimeInterpolator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f712a;

    /* renamed from: b, reason: collision with root package name */
    public long f713b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f714c;

    /* renamed from: d, reason: collision with root package name */
    public int f715d;

    /* renamed from: e, reason: collision with root package name */
    public int f716e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f714c;
        return timeInterpolator != null ? timeInterpolator : a.f707b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f712a == cVar.f712a && this.f713b == cVar.f713b && this.f715d == cVar.f715d && this.f716e == cVar.f716e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f712a;
        long j3 = this.f713b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f715d) * 31) + this.f716e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f712a + " duration: " + this.f713b + " interpolator: " + a().getClass() + " repeatCount: " + this.f715d + " repeatMode: " + this.f716e + "}\n";
    }
}
