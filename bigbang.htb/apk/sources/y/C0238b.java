package y;

import android.graphics.Insets;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0238b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0238b f3776e = new C0238b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3777a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3778b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3779c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3780d;

    public C0238b(int i2, int i3, int i4, int i5) {
        this.f3777a = i2;
        this.f3778b = i3;
        this.f3779c = i4;
        this.f3780d = i5;
    }

    public static C0238b a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f3776e : new C0238b(i2, i3, i4, i5);
    }

    public final Insets b() {
        return Insets.of(this.f3777a, this.f3778b, this.f3779c, this.f3780d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0238b.class != obj.getClass()) {
            return false;
        }
        C0238b c0238b = (C0238b) obj;
        return this.f3780d == c0238b.f3780d && this.f3777a == c0238b.f3777a && this.f3779c == c0238b.f3779c && this.f3778b == c0238b.f3778b;
    }

    public final int hashCode() {
        return (((((this.f3777a * 31) + this.f3778b) * 31) + this.f3779c) * 31) + this.f3780d;
    }

    public final String toString() {
        return "Insets{left=" + this.f3777a + ", top=" + this.f3778b + ", right=" + this.f3779c + ", bottom=" + this.f3780d + '}';
    }
}
