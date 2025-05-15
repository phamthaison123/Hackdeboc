package i;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: i.b0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0136b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2770a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2771b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f2772c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f2773d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f2774e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2775f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f2776g = false;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f2777h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f2778i;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public C0136b0(TextView textView) {
        this.f2777h = textView;
        this.f2778i = textView.getContext();
        new Z();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        if (d() && this.f2770a == 1) {
            if (!this.f2776g || this.f2775f.length == 0) {
                int floor = ((int) Math.floor((this.f2774e - this.f2773d) / this.f2772c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f2772c) + this.f2773d);
                }
                this.f2775f = a(iArr);
            }
            this.f2771b = true;
        } else {
            this.f2771b = false;
        }
        return this.f2771b;
    }

    public final boolean c() {
        boolean z2 = this.f2775f.length > 0;
        this.f2776g = z2;
        if (z2) {
            this.f2770a = 1;
            this.f2773d = r0[0];
            this.f2774e = r0[r1 - 1];
            this.f2772c = -1.0f;
        }
        return z2;
    }

    public final boolean d() {
        return !(this.f2777h instanceof C0180y);
    }

    public final void e(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f2770a = 1;
        this.f2773d = f2;
        this.f2774e = f3;
        this.f2772c = f4;
        this.f2776g = false;
    }
}
