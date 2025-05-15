package S;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f320a;

    /* renamed from: b, reason: collision with root package name */
    public int f321b;

    /* renamed from: c, reason: collision with root package name */
    public int f322c;

    /* renamed from: d, reason: collision with root package name */
    public int f323d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f324e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f325f;

    /* renamed from: g, reason: collision with root package name */
    public int f326g;

    public final void a(RecyclerView recyclerView) {
        int i2 = this.f323d;
        if (i2 >= 0) {
            this.f323d = -1;
            recyclerView.M(i2);
            this.f325f = false;
            return;
        }
        if (!this.f325f) {
            this.f326g = 0;
            return;
        }
        Interpolator interpolator = this.f324e;
        if (interpolator != null && this.f322c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i3 = this.f322c;
        if (i3 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1547W.b(this.f320a, this.f321b, i3, interpolator);
        int i4 = this.f326g + 1;
        this.f326g = i4;
        if (i4 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f325f = false;
    }
}
