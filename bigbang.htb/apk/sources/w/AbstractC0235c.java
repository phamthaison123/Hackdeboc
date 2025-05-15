package w;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractC0235c {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i2) {
        return context.getDrawable(i2);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
