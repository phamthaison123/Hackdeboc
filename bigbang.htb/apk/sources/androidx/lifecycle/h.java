package androidx.lifecycle;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1459a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f1460b;

    static {
        int[] iArr = new int[i.values().length];
        f1460b = iArr;
        try {
            iArr[i.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1460b[i.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1460b[i.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1460b[i.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1460b[i.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f1460b[i.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f1460b[i.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[j.values().length];
        f1459a = iArr2;
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f1459a[3] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f1459a[4] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f1459a[0] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f1459a[1] = 5;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
