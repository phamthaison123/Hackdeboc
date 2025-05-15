package l0;

import android.graphics.Paint;
import android.graphics.Path;
import y.AbstractC0237a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f3054i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f3055j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3056k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f3057l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3058a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3059b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f3060c;

    /* renamed from: d, reason: collision with root package name */
    public int f3061d;

    /* renamed from: e, reason: collision with root package name */
    public int f3062e;

    /* renamed from: f, reason: collision with root package name */
    public int f3063f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f3064g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f3065h;

    public a() {
        Paint paint = new Paint();
        this.f3065h = paint;
        Paint paint2 = new Paint();
        this.f3058a = paint2;
        this.f3061d = AbstractC0237a.d(-16777216, 68);
        this.f3062e = AbstractC0237a.d(-16777216, 20);
        this.f3063f = AbstractC0237a.d(-16777216, 0);
        paint2.setColor(this.f3061d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f3059b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f3060c = new Paint(paint3);
    }
}
