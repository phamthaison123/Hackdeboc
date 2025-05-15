package e;

import F.Q;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class p implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f2133b;

    public p(v vVar, Window.Callback callback) {
        this.f2133b = vVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2132a = callback;
    }

    @Override // android.view.Window.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2132a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2132a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f2132a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f2132a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2132a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2133b.p(keyEvent) || this.f2132a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        D d2;
        h.o oVar;
        if (this.f2132a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        v vVar = this.f2133b;
        vVar.v();
        E e2 = vVar.f2191h;
        if (e2 != null && (d2 = e2.f2058k) != null && (oVar = d2.f2044d) != null) {
            oVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
            if (oVar.performShortcut(keyCode, keyEvent, 0)) {
                return true;
            }
        }
        u uVar = vVar.f2167G;
        if (uVar != null && vVar.z(uVar, keyEvent.getKeyCode(), keyEvent)) {
            u uVar2 = vVar.f2167G;
            if (uVar2 == null) {
                return true;
            }
            uVar2.f2152l = true;
            return true;
        }
        if (vVar.f2167G == null) {
            u u2 = vVar.u(0);
            vVar.A(u2, keyEvent);
            boolean z2 = vVar.z(u2, keyEvent.getKeyCode(), keyEvent);
            u2.f2151k = false;
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2132a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2132a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2132a.dispatchTrackballEvent(motionEvent);
    }

    public final boolean e(int i2, Menu menu) {
        return this.f2132a.onMenuOpened(i2, menu);
    }

    public final void f(int i2, Menu menu) {
        this.f2132a.onPanelClosed(i2, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z2) {
        this.f2132a.onPointerCaptureChanged(z2);
    }

    public final void h(List list, Menu menu, int i2) {
        this.f2132a.onProvideKeyboardShortcuts(list, menu, i2);
    }

    @Override // android.view.Window.Callback
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2132a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z2) {
        this.f2132a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof h.o)) {
            return this.f2132a.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i2) {
        return this.f2132a.onCreatePanelView(i2);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f2132a.onMenuItemSelected(i2, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) {
        e(i2, menu);
        v vVar = this.f2133b;
        if (i2 == 108) {
            vVar.v();
            E e2 = vVar.f2191h;
            if (e2 != null && true != e2.f2061n) {
                e2.f2061n = true;
                ArrayList arrayList = e2.f2062o;
                if (arrayList.size() > 0) {
                    Q.i(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            vVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        f(i2, menu);
        v vVar = this.f2133b;
        if (i2 != 108) {
            if (i2 != 0) {
                vVar.getClass();
                return;
            }
            u u2 = vVar.u(i2);
            if (u2.f2153m) {
                vVar.n(u2, false);
                return;
            }
            return;
        }
        vVar.v();
        E e2 = vVar.f2191h;
        if (e2 == null || !e2.f2061n) {
            return;
        }
        e2.f2061n = false;
        ArrayList arrayList = e2.f2062o;
        if (arrayList.size() <= 0) {
            return;
        }
        Q.i(arrayList.get(0));
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        h.o oVar = menu instanceof h.o ? (h.o) menu : null;
        if (i2 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f2473x = true;
        }
        boolean onPreparePanel = this.f2132a.onPreparePanel(i2, view, menu);
        if (oVar != null) {
            oVar.f2473x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        h.o oVar = this.f2133b.u(0).f2148h;
        if (oVar != null) {
            h(list, oVar, i2);
        } else {
            h(list, menu, i2);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f2132a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2132a.onSearchRequested();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r8, int r9) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.p.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }
}
