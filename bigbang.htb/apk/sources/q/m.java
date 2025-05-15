package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class m {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f3657m;

    /* renamed from: a, reason: collision with root package name */
    public float f3658a;

    /* renamed from: b, reason: collision with root package name */
    public float f3659b;

    /* renamed from: c, reason: collision with root package name */
    public float f3660c;

    /* renamed from: d, reason: collision with root package name */
    public float f3661d;

    /* renamed from: e, reason: collision with root package name */
    public float f3662e;

    /* renamed from: f, reason: collision with root package name */
    public float f3663f;

    /* renamed from: g, reason: collision with root package name */
    public float f3664g;

    /* renamed from: h, reason: collision with root package name */
    public float f3665h;

    /* renamed from: i, reason: collision with root package name */
    public float f3666i;

    /* renamed from: j, reason: collision with root package name */
    public float f3667j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3668k;

    /* renamed from: l, reason: collision with root package name */
    public float f3669l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3657m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f3682h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f3657m.get(index)) {
                case 1:
                    this.f3658a = obtainStyledAttributes.getFloat(index, this.f3658a);
                    break;
                case 2:
                    this.f3659b = obtainStyledAttributes.getFloat(index, this.f3659b);
                    break;
                case 3:
                    this.f3660c = obtainStyledAttributes.getFloat(index, this.f3660c);
                    break;
                case 4:
                    this.f3661d = obtainStyledAttributes.getFloat(index, this.f3661d);
                    break;
                case 5:
                    this.f3662e = obtainStyledAttributes.getFloat(index, this.f3662e);
                    break;
                case 6:
                    this.f3663f = obtainStyledAttributes.getDimension(index, this.f3663f);
                    break;
                case 7:
                    this.f3664g = obtainStyledAttributes.getDimension(index, this.f3664g);
                    break;
                case 8:
                    this.f3665h = obtainStyledAttributes.getDimension(index, this.f3665h);
                    break;
                case 9:
                    this.f3666i = obtainStyledAttributes.getDimension(index, this.f3666i);
                    break;
                case 10:
                    this.f3667j = obtainStyledAttributes.getDimension(index, this.f3667j);
                    break;
                case 11:
                    this.f3668k = true;
                    this.f3669l = obtainStyledAttributes.getDimension(index, this.f3669l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
