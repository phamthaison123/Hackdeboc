package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i ON_ANY;
    public static final i ON_CREATE;
    public static final i ON_DESTROY;
    public static final i ON_PAUSE;
    public static final i ON_RESUME;
    public static final i ON_START;
    public static final i ON_STOP;

    static {
        i iVar = new i("ON_CREATE", 0);
        ON_CREATE = iVar;
        i iVar2 = new i("ON_START", 1);
        ON_START = iVar2;
        i iVar3 = new i("ON_RESUME", 2);
        ON_RESUME = iVar3;
        i iVar4 = new i("ON_PAUSE", 3);
        ON_PAUSE = iVar4;
        i iVar5 = new i("ON_STOP", 4);
        ON_STOP = iVar5;
        i iVar6 = new i("ON_DESTROY", 5);
        ON_DESTROY = iVar6;
        i iVar7 = new i("ON_ANY", 6);
        ON_ANY = iVar7;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final j a() {
        switch (h.f1460b[ordinal()]) {
            case 1:
            case 2:
                return j.f1463c;
            case 3:
            case 4:
                return j.f1464d;
            case 5:
                return j.f1465e;
            case 6:
                return j.f1461a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
