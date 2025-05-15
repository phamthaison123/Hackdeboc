package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1461a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f1462b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f1463c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f1464d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f1465e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f1466f;

    static {
        j jVar = new j("DESTROYED", 0);
        f1461a = jVar;
        j jVar2 = new j("INITIALIZED", 1);
        f1462b = jVar2;
        j jVar3 = new j("CREATED", 2);
        f1463c = jVar3;
        j jVar4 = new j("STARTED", 3);
        f1464d = jVar4;
        j jVar5 = new j("RESUMED", 4);
        f1465e = jVar5;
        f1466f = new j[]{jVar, jVar2, jVar3, jVar4, jVar5};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f1466f.clone();
    }
}
