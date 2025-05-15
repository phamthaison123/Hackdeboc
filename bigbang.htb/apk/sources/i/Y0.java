package i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class Y0 implements InterfaceC0144f0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2750a;

    /* renamed from: b, reason: collision with root package name */
    public int f2751b;

    /* renamed from: c, reason: collision with root package name */
    public View f2752c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2753d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2754e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2755f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2756g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f2757h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2758i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2759j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2760k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2761l;

    /* renamed from: m, reason: collision with root package name */
    public C0157m f2762m;

    /* renamed from: n, reason: collision with root package name */
    public int f2763n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2764o;

    public final void a(int i2) {
        View view;
        int i3 = this.f2751b ^ i2;
        this.f2751b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f2751b & 4;
                Toolbar toolbar = this.f2750a;
                if (i4 != 0) {
                    Drawable drawable = this.f2755f;
                    if (drawable == null) {
                        drawable = this.f2764o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f2750a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f2757h);
                    toolbar2.setSubtitle(this.f2758i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f2752c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f2751b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f2759j);
            Toolbar toolbar = this.f2750a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f2763n);
            } else {
                toolbar.setNavigationContentDescription(this.f2759j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f2751b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f2754e;
            if (drawable == null) {
                drawable = this.f2753d;
            }
        } else {
            drawable = this.f2753d;
        }
        this.f2750a.setLogo(drawable);
    }
}
