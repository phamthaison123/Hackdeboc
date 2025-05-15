package i;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class R0 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2705a = new Object();

    public static void a(Context context) {
        if (context.getResources() instanceof T0) {
            return;
        }
        context.getResources();
        int i2 = Z0.f2765a;
    }
}
