package S;

import F.AbstractC0023y;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class f0 {

    /* renamed from: s, reason: collision with root package name */
    public static final List f366s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f367a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f368b;

    /* renamed from: j, reason: collision with root package name */
    public int f376j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f384r;

    /* renamed from: c, reason: collision with root package name */
    public int f369c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f370d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f371e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f372f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f373g = -1;

    /* renamed from: h, reason: collision with root package name */
    public f0 f374h = null;

    /* renamed from: i, reason: collision with root package name */
    public f0 f375i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f377k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f378l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f379m = 0;

    /* renamed from: n, reason: collision with root package name */
    public X f380n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f381o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f382p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f383q = -1;

    public f0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f367a = view;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
            return;
        }
        if ((1024 & this.f376j) == 0) {
            if (this.f377k == null) {
                ArrayList arrayList = new ArrayList();
                this.f377k = arrayList;
                this.f378l = Collections.unmodifiableList(arrayList);
            }
            this.f377k.add(obj);
        }
    }

    public final void b(int i2) {
        this.f376j = i2 | this.f376j;
    }

    public final int c() {
        int i2 = this.f373g;
        return i2 == -1 ? this.f369c : i2;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.f376j & 1024) != 0 || (arrayList = this.f377k) == null || arrayList.size() == 0) ? f366s : this.f378l;
    }

    public final boolean e(int i2) {
        return (this.f376j & i2) != 0;
    }

    public final boolean f() {
        View view = this.f367a;
        return (view.getParent() == null || view.getParent() == this.f384r) ? false : true;
    }

    public final boolean g() {
        return (this.f376j & 1) != 0;
    }

    public final boolean h() {
        return (this.f376j & 4) != 0;
    }

    public final boolean i() {
        if ((this.f376j & 16) == 0) {
            WeakHashMap weakHashMap = F.O.f58a;
            if (!AbstractC0023y.i(this.f367a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return (this.f376j & 8) != 0;
    }

    public final boolean k() {
        return this.f380n != null;
    }

    public final boolean l() {
        return (this.f376j & 256) != 0;
    }

    public final boolean m() {
        return (this.f376j & 2) != 0;
    }

    public final void n(int i2, boolean z2) {
        if (this.f370d == -1) {
            this.f370d = this.f369c;
        }
        if (this.f373g == -1) {
            this.f373g = this.f369c;
        }
        if (z2) {
            this.f373g += i2;
        }
        this.f369c += i2;
        View view = this.f367a;
        if (view.getLayoutParams() != null) {
            ((Q) view.getLayoutParams()).f299c = true;
        }
    }

    public final void o() {
        this.f376j = 0;
        this.f369c = -1;
        this.f370d = -1;
        this.f371e = -1L;
        this.f373g = -1;
        this.f379m = 0;
        this.f374h = null;
        this.f375i = null;
        ArrayList arrayList = this.f377k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f376j &= -1025;
        this.f382p = 0;
        this.f383q = -1;
        RecyclerView.j(this);
    }

    public final void p(boolean z2) {
        int i2 = this.f379m;
        int i3 = z2 ? i2 - 1 : i2 + 1;
        this.f379m = i3;
        if (i3 < 0) {
            this.f379m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i3 == 1) {
            this.f376j |= 16;
        } else if (z2 && i3 == 0) {
            this.f376j &= -17;
        }
    }

    public final boolean q() {
        return (this.f376j & 128) != 0;
    }

    public final boolean r() {
        return (this.f376j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f369c + " id=" + this.f371e + ", oldPos=" + this.f370d + ", pLpos:" + this.f373g);
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.f381o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.f376j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f379m + ")");
        }
        if ((this.f376j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f367a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
