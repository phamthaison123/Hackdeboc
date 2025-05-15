package h;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import w.AbstractC0235c;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0116a implements A.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2377a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f2378b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f2379c;

    /* renamed from: d, reason: collision with root package name */
    public char f2380d;

    /* renamed from: f, reason: collision with root package name */
    public char f2382f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f2384h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f2385i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2386j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2387k;

    /* renamed from: e, reason: collision with root package name */
    public int f2381e = 4096;

    /* renamed from: g, reason: collision with root package name */
    public int f2383g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2388l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2389m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2390n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2391o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2392p = 16;

    public C0116a(Context context, CharSequence charSequence) {
        this.f2385i = context;
        this.f2377a = charSequence;
    }

    @Override // A.b
    public final r a() {
        return null;
    }

    @Override // A.b
    public final A.b b(r rVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f2384h;
        if (drawable != null) {
            if (this.f2390n || this.f2391o) {
                this.f2384h = drawable;
                Drawable mutate = drawable.mutate();
                this.f2384h = mutate;
                if (this.f2390n) {
                    mutate.setTintList(this.f2388l);
                }
                if (this.f2391o) {
                    this.f2384h.setTintMode(this.f2389m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // A.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2383g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2382f;
    }

    @Override // A.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2386j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f2384h;
    }

    @Override // A.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2388l;
    }

    @Override // A.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2389m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2379c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // A.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2381e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2380d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2377a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2378b;
        return charSequence != null ? charSequence : this.f2377a;
    }

    @Override // A.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2387k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2392p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2392p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2392p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2392p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f2382f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f2392p = (z2 ? 1 : 0) | (this.f2392p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f2392p = (z2 ? 2 : 0) | (this.f2392p & (-3));
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final A.b setContentDescription(CharSequence charSequence) {
        this.f2386j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f2392p = (z2 ? 16 : 0) | (this.f2392p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2384h = drawable;
        c();
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2388l = colorStateList;
        this.f2390n = true;
        c();
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2389m = mode;
        this.f2391o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2379c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f2380d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2380d = c2;
        this.f2382f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2377a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2378b = charSequence;
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final A.b setTooltipText(CharSequence charSequence) {
        this.f2387k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f2392p = (this.f2392p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f2382f = Character.toLowerCase(c2);
        this.f2383g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f2386j = charSequence;
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f2380d = c2;
        this.f2381e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f2377a = this.f2385i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f2387k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        Context context = this.f2385i;
        Object obj = w.e.f3731a;
        this.f2384h = AbstractC0235c.b(context, i2);
        c();
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2380d = c2;
        this.f2381e = KeyEvent.normalizeMetaState(i2);
        this.f2382f = Character.toLowerCase(c3);
        this.f2383g = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
