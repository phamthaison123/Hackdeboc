package Z;

import F.O;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f728a;

    /* renamed from: b, reason: collision with root package name */
    public int f729b;

    /* renamed from: c, reason: collision with root package name */
    public int f730c;

    /* renamed from: d, reason: collision with root package name */
    public int f731d;

    public d(View view) {
        this.f728a = view;
    }

    public final void a() {
        int i2 = this.f731d;
        View view = this.f728a;
        int top = i2 - (view.getTop() - this.f729b);
        WeakHashMap weakHashMap = O.f58a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f730c));
    }
}
