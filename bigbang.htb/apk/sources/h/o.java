package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import w.AbstractC0235c;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class o implements A.a {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2449y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2450a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2451b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2452c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2453d;

    /* renamed from: e, reason: collision with root package name */
    public m f2454e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2455f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2456g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2457h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2458i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2459j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2460k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2462m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2463n;

    /* renamed from: o, reason: collision with root package name */
    public View f2464o;

    /* renamed from: v, reason: collision with root package name */
    public q f2471v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2473x;

    /* renamed from: l, reason: collision with root package name */
    public int f2461l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2465p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2466q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2467r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2468s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2469t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2470u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2472w = false;

    public o(Context context) {
        boolean z2 = false;
        this.f2450a = context;
        Resources resources = context.getResources();
        this.f2451b = resources;
        this.f2455f = new ArrayList();
        this.f2456g = new ArrayList();
        this.f2457h = true;
        this.f2458i = new ArrayList();
        this.f2459j = new ArrayList();
        this.f2460k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z2 = true;
        }
        this.f2453d = z2;
    }

    public final q a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f2449y[i6] << 16) | (65535 & i4);
        q qVar = new q(this, i2, i3, i4, i7, charSequence, this.f2461l);
        ArrayList arrayList = this.f2455f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((q) arrayList.get(size)).f2483d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, qVar);
        p(true);
        return qVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f2450a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q a2 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2486g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC0115B interfaceC0115B, Context context) {
        this.f2470u.add(new WeakReference(interfaceC0115B));
        interfaceC0115B.g(context, this);
        this.f2460k = true;
    }

    public final void c(boolean z2) {
        if (this.f2468s) {
            return;
        }
        this.f2468s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2470u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0115B interfaceC0115B = (InterfaceC0115B) weakReference.get();
            if (interfaceC0115B == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0115B.b(this, z2);
            }
        }
        this.f2468s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f2471v;
        if (qVar != null) {
            d(qVar);
        }
        this.f2455f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2463n = null;
        this.f2462m = null;
        this.f2464o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2470u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2471v == qVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0115B interfaceC0115B = (InterfaceC0115B) weakReference.get();
                if (interfaceC0115B == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0115B.d(qVar);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f2471v = null;
            }
        }
        return z2;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f2454e;
        return mVar != null && mVar.d(oVar, menuItem);
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2470u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0115B interfaceC0115B = (InterfaceC0115B) weakReference.get();
            if (interfaceC0115B == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0115B.k(qVar);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f2471v = qVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f2455f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList.get(i3);
            if (qVar.f2480a == i2) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (findItem = qVar.f2494o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final q g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2469t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList.get(i3);
            char c2 = n2 ? qVar.f2489j : qVar.f2487h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i2 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f2455f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f2455f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                q qVar = (q) arrayList2.get(i3);
                if (qVar.hasSubMenu()) {
                    qVar.f2494o.h(arrayList, i2, keyEvent);
                }
                char c2 = n2 ? qVar.f2489j : qVar.f2487h;
                if ((modifiers & 69647) == ((n2 ? qVar.f2490k : qVar.f2488i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n2 && c2 == '\b' && i2 == 67)) && qVar.isEnabled()) {
                        arrayList.add(qVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2473x) {
            return true;
        }
        ArrayList arrayList = this.f2455f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((q) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f2460k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2470u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0115B interfaceC0115B = (InterfaceC0115B) weakReference.get();
                if (interfaceC0115B == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0115B.h();
                }
            }
            ArrayList arrayList = this.f2458i;
            ArrayList arrayList2 = this.f2459j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    q qVar = (q) l2.get(i2);
                    if (qVar.f()) {
                        arrayList.add(qVar);
                    } else {
                        arrayList2.add(qVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2460k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public o k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.f2457h;
        ArrayList arrayList = this.f2456g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2455f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = (q) arrayList2.get(i2);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f2457h = false;
        this.f2460k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2472w;
    }

    public boolean n() {
        return this.f2452c;
    }

    public boolean o() {
        return this.f2453d;
    }

    public final void p(boolean z2) {
        if (this.f2465p) {
            this.f2466q = true;
            if (z2) {
                this.f2467r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f2457h = true;
            this.f2460k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2470u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0115B interfaceC0115B = (InterfaceC0115B) weakReference.get();
            if (interfaceC0115B == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0115B.c();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        q g2 = g(i2, keyEvent);
        boolean q2 = g2 != null ? q(g2, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, h.InterfaceC0115B r8, int r9) {
        /*
            r6 = this;
            h.q r7 = (h.q) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f2495p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            h.o r1 = r7.f2493n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f2486g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f2450a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            h.r r1 = r7.f2477A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f2506a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            h.r r3 = r7.f2477A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f2506a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            h.H r9 = new h.H
            android.content.Context r5 = r6.f2450a
            r9.<init>(r5, r6, r7)
            r7.f2494o = r9
            java.lang.CharSequence r5 = r7.f2484e
            r9.setHeaderTitle(r5)
        L90:
            h.H r7 = r7.f2494o
            if (r4 == 0) goto L9e
            h.w r9 = r3.f2507b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f2506a
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f2470u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.j(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            h.B r4 = (h.InterfaceC0115B) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.j(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.q(android.view.MenuItem, h.B, int):boolean");
    }

    public final void r(InterfaceC0115B interfaceC0115B) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2470u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0115B interfaceC0115B2 = (InterfaceC0115B) weakReference.get();
            if (interfaceC0115B2 == null || interfaceC0115B2 == interfaceC0115B) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f2455f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((q) arrayList.get(i4)).f2481b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((q) arrayList.get(i4)).f2481b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f2455f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f2455f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((q) arrayList.get(i3)).f2480a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f2455f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f2455f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((H) item.getSubMenu()).s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (findItem = findItem(i3)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2455f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList.get(i3);
            if (qVar.f2481b == i2) {
                qVar.f2503x = (qVar.f2503x & (-5)) | (z3 ? 4 : 0);
                qVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2472w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f2455f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList.get(i3);
            if (qVar.f2481b == i2) {
                qVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f2455f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            q qVar = (q) arrayList.get(i3);
            if (qVar.f2481b == i2) {
                int i4 = qVar.f2503x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                qVar.f2503x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2452c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2455f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2455f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((H) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.f2451b;
        if (view != null) {
            this.f2464o = view;
            this.f2462m = null;
            this.f2463n = null;
        } else {
            if (i2 > 0) {
                this.f2462m = resources.getText(i2);
            } else if (charSequence != null) {
                this.f2462m = charSequence;
            }
            if (i3 > 0) {
                Context context = this.f2450a;
                Object obj = w.e.f3731a;
                this.f2463n = AbstractC0235c.b(context, i3);
            } else if (drawable != null) {
                this.f2463n = drawable;
            }
            this.f2464o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2465p = false;
        if (this.f2466q) {
            this.f2466q = false;
            p(this.f2467r);
        }
    }

    public final void w() {
        if (this.f2465p) {
            return;
        }
        this.f2465p = true;
        this.f2466q = false;
        this.f2467r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f2451b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f2451b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        q a2 = a(i2, i3, i4, charSequence);
        H h2 = new H(this.f2450a, this, a2);
        a2.f2494o = h2;
        h2.setHeaderTitle(a2.f2484e);
        return h2;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f2451b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f2451b.getString(i5));
    }
}
