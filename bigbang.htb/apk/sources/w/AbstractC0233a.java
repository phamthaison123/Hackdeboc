package w;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractC0233a {
    public static void a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    public static void b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
