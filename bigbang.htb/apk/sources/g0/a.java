package g0;

import android.content.Context;
import android.util.TypedValue;
import h0.k;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f2348f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2350b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2351c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2352d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2353e;

    public a(Context context) {
        TypedValue l2 = k.l(context, 2130968910);
        boolean z2 = (l2 == null || l2.type != 18 || l2.data == 0) ? false : true;
        TypedValue l3 = k.l(context, 2130968909);
        int i2 = l3 != null ? l3.data : 0;
        TypedValue l4 = k.l(context, 2130968908);
        int i3 = l4 != null ? l4.data : 0;
        TypedValue l5 = k.l(context, 2130968802);
        int i4 = l5 != null ? l5.data : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f2349a = z2;
        this.f2350b = i2;
        this.f2351c = i3;
        this.f2352d = i4;
        this.f2353e = f2;
    }
}
