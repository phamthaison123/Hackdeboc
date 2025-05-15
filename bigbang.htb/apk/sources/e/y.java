package e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import i.C0131H;
import i.C0165q;
import i.C0168s;
import i.C0170t;
import i.X;
import java.lang.reflect.Constructor;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2215b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2216c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f2217d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final l.k f2218e = new l.k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2219a = new Object[2];

    public C0165q a(Context context, AttributeSet attributeSet) {
        return new C0165q(context, attributeSet);
    }

    public C0168s b(Context context, AttributeSet attributeSet) {
        return new C0168s(context, attributeSet, 2130968696);
    }

    public C0170t c(Context context, AttributeSet attributeSet) {
        return new C0170t(context, attributeSet, 2130968712);
    }

    public C0131H d(Context context, AttributeSet attributeSet) {
        return new C0131H(context, attributeSet);
    }

    public X e(Context context, AttributeSet attributeSet) {
        return new X(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        l.k kVar = f2218e;
        Constructor constructor = (Constructor) kVar.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2215b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2219a);
    }
}
