package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class q implements A.b {

    /* renamed from: A, reason: collision with root package name */
    public r f2477A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2478B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2480a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2481b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2482c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2483d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2484e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2485f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2486g;

    /* renamed from: h, reason: collision with root package name */
    public char f2487h;

    /* renamed from: j, reason: collision with root package name */
    public char f2489j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2491l;

    /* renamed from: n, reason: collision with root package name */
    public final o f2493n;

    /* renamed from: o, reason: collision with root package name */
    public H f2494o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2495p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2496q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2497r;

    /* renamed from: y, reason: collision with root package name */
    public int f2504y;

    /* renamed from: z, reason: collision with root package name */
    public View f2505z;

    /* renamed from: i, reason: collision with root package name */
    public int f2488i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2490k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2492m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2498s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2499t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2500u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2501v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2502w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f2503x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2479C = false;

    public q(o oVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f2493n = oVar;
        this.f2480a = i3;
        this.f2481b = i2;
        this.f2482c = i4;
        this.f2483d = i5;
        this.f2484e = charSequence;
        this.f2504y = i6;
    }

    public static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // A.b
    public final r a() {
        return this.f2477A;
    }

    @Override // A.b
    public final A.b b(r rVar) {
        r rVar2 = this.f2477A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f2505z = null;
        this.f2477A = rVar;
        this.f2493n.p(true);
        r rVar3 = this.f2477A;
        if (rVar3 != null) {
            rVar3.d(new e.z(3, this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2504y & 8) == 0) {
            return false;
        }
        if (this.f2505z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2478B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2493n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2502w && (this.f2500u || this.f2501v)) {
            drawable = drawable.mutate();
            if (this.f2500u) {
                drawable.setTintList(this.f2498s);
            }
            if (this.f2501v) {
                drawable.setTintMode(this.f2499t);
            }
            this.f2502w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f2504y & 8) == 0) {
            return false;
        }
        if (this.f2505z == null && (rVar = this.f2477A) != null) {
            this.f2505z = rVar.b(this);
        }
        return this.f2505z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2478B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2493n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f2503x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f2503x |= 32;
        } else {
            this.f2503x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2505z;
        if (view != null) {
            return view;
        }
        r rVar = this.f2477A;
        if (rVar == null) {
            return null;
        }
        View b2 = rVar.b(this);
        this.f2505z = b2;
        return b2;
    }

    @Override // A.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2490k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2489j;
    }

    @Override // A.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2496q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2481b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2491l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f2492m;
        if (i2 == 0) {
            return null;
        }
        Drawable A2 = B.a.A(this.f2493n.f2450a, i2);
        this.f2492m = 0;
        this.f2491l = A2;
        return d(A2);
    }

    @Override // A.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2498s;
    }

    @Override // A.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2499t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2486g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2480a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // A.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2488i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f2487h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2482c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2494o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2484e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2485f;
        return charSequence != null ? charSequence : this.f2484e;
    }

    @Override // A.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2497r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2494o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2479C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2503x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2503x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2503x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.f2477A;
        return (rVar == null || !rVar.c()) ? (this.f2503x & 8) == 0 : (this.f2503x & 8) == 0 && this.f2477A.a();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2505z = view;
        this.f2477A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f2480a) > 0) {
            view.setId(i2);
        }
        o oVar = this.f2493n;
        oVar.f2460k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2489j == c2) {
            return this;
        }
        this.f2489j = Character.toLowerCase(c2);
        this.f2493n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f2503x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f2503x = i3;
        if (i2 != i3) {
            this.f2493n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.f2503x;
        if ((i2 & 4) != 0) {
            o oVar = this.f2493n;
            oVar.getClass();
            ArrayList arrayList = oVar.f2455f;
            int size = arrayList.size();
            oVar.w();
            for (int i3 = 0; i3 < size; i3++) {
                q qVar = (q) arrayList.get(i3);
                if (qVar.f2481b == this.f2481b && (qVar.f2503x & 4) != 0 && qVar.isCheckable()) {
                    boolean z3 = qVar == this;
                    int i4 = qVar.f2503x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    qVar.f2503x = i5;
                    if (i4 != i5) {
                        qVar.f2493n.p(false);
                    }
                }
            }
            oVar.v();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.f2503x = i6;
            if (i2 != i6) {
                this.f2493n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f2503x |= 16;
        } else {
            this.f2503x &= -17;
        }
        this.f2493n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2491l = null;
        this.f2492m = i2;
        this.f2502w = true;
        this.f2493n.p(false);
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2498s = colorStateList;
        this.f2500u = true;
        this.f2502w = true;
        this.f2493n.p(false);
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2499t = mode;
        this.f2501v = true;
        this.f2502w = true;
        this.f2493n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2486g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f2487h == c2) {
            return this;
        }
        this.f2487h = c2;
        this.f2493n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2478B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2495p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.f2487h = c2;
        this.f2489j = Character.toLowerCase(c3);
        this.f2493n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2504y = i2;
        o oVar = this.f2493n;
        oVar.f2460k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2484e = charSequence;
        this.f2493n.p(false);
        H h2 = this.f2494o;
        if (h2 != null) {
            h2.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2485f = charSequence;
        this.f2493n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.f2503x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f2503x = i3;
        if (i2 != i3) {
            o oVar = this.f2493n;
            oVar.f2457h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2484e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // A.b, android.view.MenuItem
    public final A.b setContentDescription(CharSequence charSequence) {
        this.f2496q = charSequence;
        this.f2493n.p(false);
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final A.b setTooltipText(CharSequence charSequence) {
        this.f2497r = charSequence;
        this.f2493n.p(false);
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2489j == c2 && this.f2490k == i2) {
            return this;
        }
        this.f2489j = Character.toLowerCase(c2);
        this.f2490k = KeyEvent.normalizeMetaState(i2);
        this.f2493n.p(false);
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2487h == c2 && this.f2488i == i2) {
            return this;
        }
        this.f2487h = c2;
        this.f2488i = KeyEvent.normalizeMetaState(i2);
        this.f2493n.p(false);
        return this;
    }

    @Override // A.b, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2487h = c2;
        this.f2488i = KeyEvent.normalizeMetaState(i2);
        this.f2489j = Character.toLowerCase(c3);
        this.f2490k = KeyEvent.normalizeMetaState(i3);
        this.f2493n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f2493n.f2450a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2492m = 0;
        this.f2491l = drawable;
        this.f2502w = true;
        this.f2493n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f2493n.f2450a;
        View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2505z = inflate;
        this.f2477A = null;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f2480a) > 0) {
            inflate.setId(i3);
        }
        o oVar = this.f2493n;
        oVar.f2460k = true;
        oVar.p(true);
        return this;
    }
}
