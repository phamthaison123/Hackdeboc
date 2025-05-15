package p0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import g.C0105e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3485a = {R.attr.theme, 2130969495};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3486b = {2130969210};

    public static Context a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3486b, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0105e) && ((C0105e) context).f2280a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0105e c0105e = new C0105e(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3485a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0105e.getTheme().applyStyle(resourceId2, true);
        }
        return c0105e;
    }
}
