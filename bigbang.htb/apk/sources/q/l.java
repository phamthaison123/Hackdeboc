package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f3653a;

    /* renamed from: b, reason: collision with root package name */
    public int f3654b;

    /* renamed from: c, reason: collision with root package name */
    public float f3655c;

    /* renamed from: d, reason: collision with root package name */
    public float f3656d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f3680f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f3655c = obtainStyledAttributes.getFloat(index, this.f3655c);
            } else if (index == 0) {
                int i3 = obtainStyledAttributes.getInt(index, this.f3653a);
                this.f3653a = i3;
                this.f3653a = n.f3670d[i3];
            } else if (index == 4) {
                this.f3654b = obtainStyledAttributes.getInt(index, this.f3654b);
            } else if (index == 3) {
                this.f3656d = obtainStyledAttributes.getFloat(index, this.f3656d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
