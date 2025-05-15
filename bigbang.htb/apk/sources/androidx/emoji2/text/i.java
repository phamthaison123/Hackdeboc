package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l.C0191c;
import u.RunnableC0223a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f1091i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile i f1092j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1093a;

    /* renamed from: b, reason: collision with root package name */
    public final C0191c f1094b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1095c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1096d;

    /* renamed from: e, reason: collision with root package name */
    public final d f1097e;

    /* renamed from: f, reason: collision with root package name */
    public final h f1098f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1099g;

    /* renamed from: h, reason: collision with root package name */
    public final n f1100h;

    public i(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1093a = reentrantReadWriteLock;
        this.f1095c = 3;
        this.f1098f = sVar.f1088a;
        int i2 = sVar.f1089b;
        this.f1099g = i2;
        this.f1100h = sVar.f1090c;
        this.f1096d = new Handler(Looper.getMainLooper());
        this.f1094b = new C0191c();
        d dVar = new d(19, this);
        this.f1097e = dVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1095c = 0;
            } catch (Throwable th) {
                this.f1093a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            dVar.w();
        }
    }

    public static i a() {
        i iVar;
        synchronized (f1091i) {
            try {
                iVar = f1092j;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public final int b() {
        this.f1093a.readLock().lock();
        try {
            return this.f1095c;
        } finally {
            this.f1093a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f1099g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1093a.writeLock().lock();
        try {
            if (this.f1095c == 0) {
                return;
            }
            this.f1095c = 0;
            this.f1093a.writeLock().unlock();
            this.f1097e.w();
        } finally {
            this.f1093a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1093a.writeLock().lock();
        try {
            this.f1095c = 2;
            arrayList.addAll(this.f1094b);
            this.f1094b.clear();
            this.f1093a.writeLock().unlock();
            this.f1096d.post(new RunnableC0223a(arrayList, this.f1095c, th));
        } catch (Throwable th2) {
            this.f1093a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f1093a.writeLock().lock();
        try {
            this.f1095c = 1;
            arrayList.addAll(this.f1094b);
            this.f1094b.clear();
            this.f1093a.writeLock().unlock();
            this.f1096d.post(new RunnableC0223a(arrayList, this.f1095c));
        } catch (Throwable th) {
            this.f1093a.writeLock().unlock();
            throw th;
        }
    }

    public final CharSequence f(int i2, int i3, CharSequence charSequence) {
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        B.a.m(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        B.a.m(i2 <= charSequence.length(), "start should be < than charSequence length");
        B.a.m(i3 <= charSequence.length(), "end should be < than charSequence length");
        return (charSequence.length() == 0 || i2 == i3) ? charSequence : this.f1097e.x(charSequence, i2, i3, false);
    }

    public final void g(g gVar) {
        B.a.o(gVar, "initCallback cannot be null");
        this.f1093a.writeLock().lock();
        try {
            if (this.f1095c != 1 && this.f1095c != 2) {
                this.f1094b.add(gVar);
                this.f1093a.writeLock().unlock();
            }
            this.f1096d.post(new RunnableC0223a(gVar, this.f1095c));
            this.f1093a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1093a.writeLock().unlock();
            throw th;
        }
    }
}
