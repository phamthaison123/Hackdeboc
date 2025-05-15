package S;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class Q extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public f0 f297a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f298b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f299c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f300d;

    public Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f298b = new Rect();
        this.f299c = true;
        this.f300d = false;
    }

    public Q(int i2, int i3) {
        super(i2, i3);
        this.f298b = new Rect();
        this.f299c = true;
        this.f300d = false;
    }

    public Q(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f298b = new Rect();
        this.f299c = true;
        this.f300d = false;
    }

    public Q(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f298b = new Rect();
        this.f299c = true;
        this.f300d = false;
    }

    public Q(Q q2) {
        super((ViewGroup.LayoutParams) q2);
        this.f298b = new Rect();
        this.f299c = true;
        this.f300d = false;
    }
}
