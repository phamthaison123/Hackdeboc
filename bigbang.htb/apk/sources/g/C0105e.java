package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0105e extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f2280a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f2281b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f2282c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f2283d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f2284e;

    public C0105e(Context context, int i2) {
        super(context);
        this.f2280a = i2;
    }

    public final void a(Configuration configuration) {
        if (this.f2284e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2283d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2283d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f2281b == null) {
            this.f2281b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2281b.setTo(theme);
            }
        }
        this.f2281b.applyStyle(this.f2280a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2284e == null) {
            Configuration configuration = this.f2283d;
            if (configuration == null) {
                this.f2284e = super.getResources();
            } else {
                this.f2284e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f2284e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2282c == null) {
            this.f2282c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2282c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2281b;
        if (theme != null) {
            return theme;
        }
        if (this.f2280a == 0) {
            this.f2280a = 2131821030;
        }
        b();
        return this.f2281b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f2280a != i2) {
            this.f2280a = i2;
            b();
        }
    }
}
