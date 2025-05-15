package x;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3762a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f3763b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3764c = new Object();

    public static Typeface a(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i2, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ab A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r14, int r15, android.util.TypedValue r16, int r17, B.a r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k.b(android.content.Context, int, android.util.TypedValue, int, B.a, boolean, boolean):android.graphics.Typeface");
    }
}
