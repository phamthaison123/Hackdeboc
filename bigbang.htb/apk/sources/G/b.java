package G;

import android.R;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f116e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f117f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f118g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f119h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f120i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f121j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f122k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f123l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f126c;

    /* renamed from: d, reason: collision with root package name */
    public final o f127d;

    static {
        new b(1);
        new b(2);
        new b(4);
        new b(8);
        f116e = new b(16);
        new b(32);
        new b(64);
        new b(128);
        new b(256, h.class);
        new b(512, h.class);
        new b(1024, i.class);
        new b(2048, i.class);
        f117f = new b(4096);
        f118g = new b(8192);
        new b(16384);
        new b(32768);
        new b(65536);
        new b(131072, m.class);
        f119h = new b(262144);
        f120i = new b(524288);
        f121j = new b(1048576);
        new b(2097152, n.class);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, k.class);
        f122k = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f123l = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, l.class);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, j.class);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
    }

    public b(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f124a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f124a;
        Object obj3 = this.f124a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f124a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public b(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public b(Object obj, int i2, String str, o oVar, Class cls) {
        this.f125b = i2;
        this.f127d = oVar;
        if (obj == null) {
            this.f124a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f124a = obj;
        }
        this.f126c = cls;
    }
}
