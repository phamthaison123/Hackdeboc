package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import o.C0207a;
import o.d;
import q.b;
import q.q;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class Barrier extends b {

    /* renamed from: g, reason: collision with root package name */
    public int f987g;

    /* renamed from: h, reason: collision with root package name */
    public int f988h;

    /* renamed from: i, reason: collision with root package name */
    public C0207a f989i;

    public Barrier(Context context) {
        super(context);
        this.f3493a = new int[32];
        this.f3498f = new HashMap();
        this.f3495c = context;
        e(null);
        super.setVisibility(8);
    }

    public final void e(AttributeSet attributeSet) {
        int[] iArr = q.f3676b;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3497e = string;
                    setIds(string);
                }
            }
        }
        C0207a c0207a = new C0207a();
        c0207a.f3353d0 = new d[4];
        c0207a.f3354e0 = 0;
        c0207a.f3253f0 = 0;
        c0207a.f3254g0 = true;
        c0207a.f3255h0 = 0;
        this.f989i = c0207a;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i3 = 0; i3 < indexCount2; i3++) {
                int index2 = obtainStyledAttributes2.getIndex(i3);
                if (index2 == 15) {
                    setType(obtainStyledAttributes2.getInt(index2, 0));
                } else if (index2 == 14) {
                    this.f989i.f3254g0 = obtainStyledAttributes2.getBoolean(index2, true);
                } else if (index2 == 16) {
                    this.f989i.f3255h0 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                }
            }
        }
        this.f3496d = this.f989i;
        d();
    }

    public int getMargin() {
        return this.f989i.f3255h0;
    }

    public int getType() {
        return this.f987g;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f989i.f3254g0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f989i.f3255h0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f989i.f3255h0 = i2;
    }

    public void setType(int i2) {
        this.f987g = i2;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3493a = new int[32];
        this.f3498f = new HashMap();
        this.f3495c = context;
        e(attributeSet);
        super.setVisibility(8);
    }
}
