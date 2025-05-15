package m0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public B.a f3129a = new j();

    /* renamed from: b, reason: collision with root package name */
    public B.a f3130b = new j();

    /* renamed from: c, reason: collision with root package name */
    public B.a f3131c = new j();

    /* renamed from: d, reason: collision with root package name */
    public B.a f3132d = new j();

    /* renamed from: e, reason: collision with root package name */
    public c f3133e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f3134f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f3135g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f3136h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f3137i = h0.k.e();

    /* renamed from: j, reason: collision with root package name */
    public e f3138j = h0.k.e();

    /* renamed from: k, reason: collision with root package name */
    public e f3139k = h0.k.e();

    /* renamed from: l, reason: collision with root package name */
    public e f3140l = h0.k.e();

    public static k a(Context context, int i2, int i3, a aVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, X.a.f702w);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            c c2 = c(obtainStyledAttributes, 5, aVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            k kVar = new k();
            B.a d2 = h0.k.d(i5);
            kVar.f3117a = d2;
            k.b(d2);
            kVar.f3121e = c3;
            B.a d3 = h0.k.d(i6);
            kVar.f3118b = d3;
            k.b(d3);
            kVar.f3122f = c4;
            B.a d4 = h0.k.d(i7);
            kVar.f3119c = d4;
            k.b(d4);
            kVar.f3123g = c5;
            B.a d5 = h0.k.d(i8);
            kVar.f3120d = d5;
            k.b(d5);
            kVar.f3124h = c6;
            return kVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static k b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f696q, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z2 = this.f3140l.getClass().equals(e.class) && this.f3138j.getClass().equals(e.class) && this.f3137i.getClass().equals(e.class) && this.f3139k.getClass().equals(e.class);
        float a2 = this.f3133e.a(rectF);
        return z2 && ((this.f3134f.a(rectF) > a2 ? 1 : (this.f3134f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f3136h.a(rectF) > a2 ? 1 : (this.f3136h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f3135g.a(rectF) > a2 ? 1 : (this.f3135g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f3130b instanceof j) && (this.f3129a instanceof j) && (this.f3131c instanceof j) && (this.f3132d instanceof j));
    }

    public final k e() {
        k kVar = new k();
        kVar.f3117a = new j();
        kVar.f3118b = new j();
        kVar.f3119c = new j();
        kVar.f3120d = new j();
        kVar.f3121e = new a(0.0f);
        kVar.f3122f = new a(0.0f);
        kVar.f3123g = new a(0.0f);
        kVar.f3124h = new a(0.0f);
        kVar.f3125i = h0.k.e();
        kVar.f3126j = h0.k.e();
        kVar.f3127k = h0.k.e();
        kVar.f3117a = this.f3129a;
        kVar.f3118b = this.f3130b;
        kVar.f3119c = this.f3131c;
        kVar.f3120d = this.f3132d;
        kVar.f3121e = this.f3133e;
        kVar.f3122f = this.f3134f;
        kVar.f3123g = this.f3135g;
        kVar.f3124h = this.f3136h;
        kVar.f3125i = this.f3137i;
        kVar.f3126j = this.f3138j;
        kVar.f3127k = this.f3139k;
        kVar.f3128l = this.f3140l;
        return kVar;
    }
}
