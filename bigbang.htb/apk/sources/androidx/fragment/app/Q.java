package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final W f1243a = new W();

    /* renamed from: b, reason: collision with root package name */
    public static final Y f1244b;

    static {
        Y y2;
        try {
            y2 = (Y) U.m.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            y2 = null;
        }
        f1244b = y2;
    }

    public static void a(AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p2, boolean z2) {
        if (z2) {
            abstractComponentCallbacksC0075p2.getClass();
        } else {
            abstractComponentCallbacksC0075p.getClass();
        }
    }

    public static void b(ArrayList arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i2);
        }
    }
}
