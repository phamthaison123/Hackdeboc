package androidx.emoji2.text;

import android.os.Trace;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (i.f1092j != null) {
                i.a().c();
            }
        } finally {
            Trace.endSection();
        }
    }
}
