package S;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f413a;

    /* renamed from: b, reason: collision with root package name */
    public int f414b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f415c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f416d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f417e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f419g;

    public j0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f419g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f413a = -1;
        this.f414b = Integer.MIN_VALUE;
        this.f415c = false;
        this.f416d = false;
        this.f417e = false;
        int[] iArr = this.f418f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
