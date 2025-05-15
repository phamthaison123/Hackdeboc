package androidx.appcompat.app;

import B.a;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d;
import androidx.activity.e;
import androidx.fragment.app.FragmentActivity;
import e.E;
import e.j;
import e.k;
import e.v;
import g.C0105e;
import g.C0111k;
import g.C0113m;
import i.C0178x;
import i.C0181y0;
import i.Y0;
import i.Z0;
import java.util.ArrayList;
import l.C0191c;
import l.C0193e;
import u.AbstractC0225c;
import w.AbstractC0233a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class AppCompatActivity extends FragmentActivity implements j {

    /* renamed from: m, reason: collision with root package name */
    public v f781m;

    public AppCompatActivity() {
        int i2 = 1;
        this.f741d.f1620b.b("androidx:appcompat", new d(this, i2));
        g(new e(this, i2));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        v vVar = (v) j();
        vVar.r();
        ((ViewGroup) vVar.f2204u.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f2189f.f2132a.onContentChanged();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        v vVar = (v) j();
        vVar.f2169I = true;
        int i2 = vVar.f2173M;
        if (i2 == -100) {
            i2 = -100;
        }
        int x2 = vVar.x(context, i2);
        Configuration configuration = null;
        if (v.f2160c0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v.o(context, x2, null));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0105e) {
            try {
                ((C0105e) context).a(v.o(context, x2, null));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (v.f2159b0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.colorMode & 3;
                    int i28 = configuration4.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.uiMode & 15;
                    int i32 = configuration4.uiMode & 15;
                    if (i31 != i32) {
                        configuration.uiMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 48;
                    int i34 = configuration4.uiMode & 48;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.screenWidthDp;
                    int i36 = configuration4.screenWidthDp;
                    if (i35 != i36) {
                        configuration.screenWidthDp = i36;
                    }
                    int i37 = configuration3.screenHeightDp;
                    int i38 = configuration4.screenHeightDp;
                    if (i37 != i38) {
                        configuration.screenHeightDp = i38;
                    }
                    int i39 = configuration3.smallestScreenWidthDp;
                    int i40 = configuration4.smallestScreenWidthDp;
                    if (i39 != i40) {
                        configuration.smallestScreenWidthDp = i40;
                    }
                    int i41 = configuration3.densityDpi;
                    int i42 = configuration4.densityDpi;
                    if (i41 != i42) {
                        configuration.densityDpi = i42;
                    }
                }
            }
            Configuration o2 = v.o(context, x2, configuration);
            C0105e c0105e = new C0105e(context, 2131821029);
            c0105e.a(o2);
            try {
                if (context.getTheme() != null) {
                    c0105e.getTheme().rebase();
                }
            } catch (NullPointerException unused3) {
            }
            context = c0105e;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((v) j()).v();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((v) j()).v();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.ComponentActivity
    public final void e() {
        v vVar = (v) j();
        vVar.v();
        vVar.w(0);
    }

    @Override // android.app.Activity
    public final View findViewById(int i2) {
        v vVar = (v) j();
        vVar.r();
        return vVar.f2188e.findViewById(i2);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        v vVar = (v) j();
        if (vVar.f2192i == null) {
            vVar.v();
            E e2 = vVar.f2191h;
            vVar.f2192i = new C0111k(e2 != null ? e2.l0() : vVar.f2187d);
        }
        return vVar.f2192i;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i2 = Z0.f2765a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        v vVar = (v) j();
        vVar.v();
        vVar.w(0);
    }

    public final k j() {
        if (this.f781m == null) {
            C0191c c0191c = k.f2122a;
            this.f781m = new v(this, null, this, this);
        }
        return this.f781m;
    }

    public final void k() {
        getWindow().getDecorView().setTag(2131296686, this);
        getWindow().getDecorView().setTag(2131296688, this);
        getWindow().getDecorView().setTag(2131296687, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v vVar = (v) j();
        if (vVar.f2209z && vVar.f2203t) {
            vVar.v();
            E e2 = vVar.f2191h;
            if (e2 != null) {
                e2.o0(e2.f2050c.getResources().getBoolean(2131034112));
            }
        }
        C0178x a2 = C0178x.a();
        Context context = vVar.f2187d;
        synchronized (a2) {
            C0181y0 c0181y0 = a2.f2947a;
            synchronized (c0181y0) {
                C0193e c0193e = (C0193e) c0181y0.f2956b.get(context);
                if (c0193e != null) {
                    c0193e.a();
                }
            }
        }
        vVar.f2172L = new Configuration(vVar.f2187d.getResources().getConfiguration());
        vVar.j(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent B2;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        v vVar = (v) j();
        vVar.v();
        E e2 = vVar.f2191h;
        if (menuItem.getItemId() == 16908332 && e2 != null && (((Y0) e2.f2054g).f2751b & 4) != 0 && (B2 = a.B(this)) != null) {
            if (!shouldUpRecreateTask(B2)) {
                navigateUpTo(B2);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent B3 = a.B(this);
            if (B3 == null) {
                B3 = a.B(this);
            }
            if (B3 != null) {
                ComponentName component = B3.getComponent();
                if (component == null) {
                    component = B3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent C2 = a.C(this, component);
                    while (C2 != null) {
                        arrayList.add(size, C2);
                        C2 = a.C(this, C2.getComponent());
                    }
                    arrayList.add(B3);
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e3);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = w.e.f3731a;
            AbstractC0233a.a(this, intentArr, null);
            try {
                int i3 = AbstractC0225c.f3719b;
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) j()).r();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        v vVar = (v) j();
        vVar.v();
        E e2 = vVar.f2191h;
        if (e2 != null) {
            e2.f2069v = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((v) j()).j(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        v vVar = (v) j();
        vVar.v();
        E e2 = vVar.f2191h;
        if (e2 != null) {
            e2.f2069v = false;
            C0113m c0113m = e2.f2068u;
            if (c0113m != null) {
                c0113m.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        j().i(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((v) j()).v();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i2) {
        k();
        j().h(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        ((v) j()).f2174N = i2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        k();
        v vVar = (v) j();
        vVar.r();
        ViewGroup viewGroup = (ViewGroup) vVar.f2204u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        vVar.f2189f.f2132a.onContentChanged();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        v vVar = (v) j();
        vVar.r();
        ViewGroup viewGroup = (ViewGroup) vVar.f2204u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        vVar.f2189f.f2132a.onContentChanged();
    }
}
