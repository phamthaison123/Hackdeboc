package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import m.AbstractC0194a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f3648e;

    /* renamed from: a, reason: collision with root package name */
    public int f3649a;

    /* renamed from: b, reason: collision with root package name */
    public int f3650b;

    /* renamed from: c, reason: collision with root package name */
    public float f3651c;

    /* renamed from: d, reason: collision with root package name */
    public float f3652d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3648e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f3679e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f3648e.get(index)) {
                case 1:
                    this.f3652d = obtainStyledAttributes.getFloat(index, this.f3652d);
                    break;
                case 2:
                    this.f3650b = obtainStyledAttributes.getInt(index, this.f3650b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0194a.f3066a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3649a = n.f(obtainStyledAttributes, index, this.f3649a);
                    break;
                case 6:
                    this.f3651c = obtainStyledAttributes.getFloat(index, this.f3651c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
