package g;

import F.U;
import android.view.View;
import i.Y0;

/* renamed from: g.l, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0112l extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2338c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2339d;

    /* renamed from: e, reason: collision with root package name */
    public int f2340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2341f;

    public C0112l(C0113m c0113m) {
        this.f2338c = 0;
        this.f2341f = c0113m;
        this.f2339d = false;
        this.f2340e = 0;
    }

    @Override // F.U
    public final void c() {
        int i2 = this.f2338c;
        Object obj = this.f2341f;
        switch (i2) {
            case 0:
                int i3 = this.f2340e + 1;
                this.f2340e = i3;
                C0113m c0113m = (C0113m) obj;
                if (i3 == c0113m.f2342a.size()) {
                    U u2 = c0113m.f2345d;
                    if (u2 != null) {
                        u2.c();
                    }
                    this.f2340e = 0;
                    this.f2339d = false;
                    c0113m.f2346e = false;
                    break;
                }
                break;
            default:
                if (!this.f2339d) {
                    ((Y0) obj).f2750a.setVisibility(this.f2340e);
                    break;
                }
                break;
        }
    }

    @Override // B.a, F.U
    public final void e(View view) {
        switch (this.f2338c) {
            case 1:
                this.f2339d = true;
                break;
        }
    }

    @Override // B.a, F.U
    public final void g() {
        int i2 = this.f2338c;
        Object obj = this.f2341f;
        switch (i2) {
            case 0:
                if (!this.f2339d) {
                    this.f2339d = true;
                    U u2 = ((C0113m) obj).f2345d;
                    if (u2 != null) {
                        u2.g();
                        break;
                    }
                }
                break;
            default:
                ((Y0) obj).f2750a.setVisibility(0);
                break;
        }
    }

    public C0112l(Y0 y0, int i2) {
        this.f2338c = 1;
        this.f2341f = y0;
        this.f2340e = i2;
        this.f2339d = false;
    }
}
