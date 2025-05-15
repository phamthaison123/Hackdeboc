package D;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f31e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f32a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33b;

    /* renamed from: c, reason: collision with root package name */
    public int f34c;

    /* renamed from: d, reason: collision with root package name */
    public char f35d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f31e[i2] = Character.getDirectionality(i2);
        }
    }

    public a(CharSequence charSequence) {
        this.f32a = charSequence;
        this.f33b = charSequence.length();
    }

    public final byte a() {
        int i2 = this.f34c - 1;
        CharSequence charSequence = this.f32a;
        char charAt = charSequence.charAt(i2);
        this.f35d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f34c);
            this.f34c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f34c--;
        char c2 = this.f35d;
        return c2 < 1792 ? f31e[c2] : Character.getDirectionality(c2);
    }
}
