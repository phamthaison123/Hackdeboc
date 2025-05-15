package F;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f70a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f71b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f72c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f73d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f70a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f71b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f72c = declaredField3;
            declaredField3.setAccessible(true);
            f73d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
