package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class E extends AbstractC0119d implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final A.a f2354d;

    public E(Context context, A.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2354d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m(((o) this.f2354d).add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((o) this.f2354d).addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = m(menuItemArr2[i6]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f2354d).addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        l.k kVar = (l.k) this.f2395b;
        if (kVar != null) {
            kVar.clear();
        }
        l.k kVar2 = (l.k) this.f2396c;
        if (kVar2 != null) {
            kVar2.clear();
        }
        ((o) this.f2354d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f2354d).close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        return m(((o) this.f2354d).findItem(i2));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return m(((o) this.f2354d).getItem(i2));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f2354d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return ((o) this.f2354d).isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return ((o) this.f2354d).performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return ((o) this.f2354d).performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        if (((l.k) this.f2395b) != null) {
            int i3 = 0;
            while (true) {
                l.k kVar = (l.k) this.f2395b;
                if (i3 >= kVar.f3049c) {
                    break;
                }
                if (((A.b) kVar.h(i3)).getGroupId() == i2) {
                    ((l.k) this.f2395b).i(i3);
                    i3--;
                }
                i3++;
            }
        }
        ((o) this.f2354d).removeGroup(i2);
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        if (((l.k) this.f2395b) != null) {
            int i3 = 0;
            while (true) {
                l.k kVar = (l.k) this.f2395b;
                if (i3 >= kVar.f3049c) {
                    break;
                }
                if (((A.b) kVar.h(i3)).getItemId() == i2) {
                    ((l.k) this.f2395b).i(i3);
                    break;
                }
                i3++;
            }
        }
        ((o) this.f2354d).removeItem(i2);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ((o) this.f2354d).setGroupCheckable(i2, z2, z3);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ((o) this.f2354d).setGroupEnabled(i2, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ((o) this.f2354d).setGroupVisible(i2, z2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2354d.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f2354d).size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return m(((o) this.f2354d).add(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return ((o) this.f2354d).addSubMenu(i2);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m(((o) this.f2354d).add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return ((o) this.f2354d).addSubMenu(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return m(((o) this.f2354d).add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return ((o) this.f2354d).addSubMenu(i2, i3, i4, i5);
    }
}
