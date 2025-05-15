package w;

import android.content.Context;
import java.io.File;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractC0234b {
    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static File[] c(Context context) {
        return context.getObbDirs();
    }
}
