package D;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f47a = new e();

    @Override // D.f
    public final int a(CharSequence charSequence, int i2) {
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            h hVar = i.f50a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                }
                i3 = 0;
            }
            i3 = 1;
        }
        return i3;
    }
}
