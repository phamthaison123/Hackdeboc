package L;

import F.AbstractC0023y;
import F.C0001b;
import F.O;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import e.z;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class b extends C0001b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f175n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final m0.e f176o = new m0.e();

    /* renamed from: p, reason: collision with root package name */
    public static final m0.e f177p = new m0.e();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f182h;

    /* renamed from: i, reason: collision with root package name */
    public final View f183i;

    /* renamed from: j, reason: collision with root package name */
    public a f184j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f178d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f179e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f180f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f181g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f185k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f186l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f187m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f183i = view;
        this.f182h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = O.f58a;
        if (AbstractC0023y.c(view) == 0) {
            AbstractC0023y.s(view, 1);
        }
    }

    @Override // F.C0001b
    public final z b(View view) {
        if (this.f184j == null) {
            this.f184j = new a(this);
        }
        return this.f184j;
    }

    @Override // F.C0001b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // F.C0001b
    public final void d(View view, G.d dVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f80a;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f129a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((e0.c) this).f2225q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i2) {
        if (this.f186l != i2) {
            return false;
        }
        this.f186l = Integer.MIN_VALUE;
        e0.c cVar = (e0.c) this;
        if (i2 == 1) {
            Chip chip = cVar.f2225q;
            chip.f1766m = false;
            chip.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    public final G.d k(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        G.d dVar = new G.d(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f175n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        dVar.f130b = -1;
        View view = this.f183i;
        obtain.setParent(view);
        o(i2, dVar);
        if (dVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f179e;
        dVar.d(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(view.getContext().getPackageName());
        dVar.f131c = i2;
        obtain.setSource(view, i2);
        if (this.f185k == i2) {
            obtain.setAccessibilityFocused(true);
            dVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            dVar.a(64);
        }
        boolean z2 = this.f186l == i2;
        if (z2) {
            dVar.a(2);
        } else if (obtain.isFocusable()) {
            dVar.a(1);
        }
        obtain.setFocused(z2);
        int[] iArr = this.f181g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f178d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            dVar.d(rect3);
            if (dVar.f130b != -1) {
                G.d dVar2 = new G.d(AccessibilityNodeInfo.obtain());
                int i3 = dVar.f130b;
                while (true) {
                    accessibilityNodeInfo = dVar2.f129a;
                    if (i3 == -1) {
                        break;
                    }
                    dVar2.f130b = -1;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i3, dVar2);
                    dVar2.d(rect2);
                    rect3.offset(rect2.left, rect2.top);
                    i3 = dVar2.f130b;
                }
                accessibilityNodeInfo.recycle();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f180f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                dVar.f129a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return dVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.b.m(int, android.graphics.Rect):boolean");
    }

    public final G.d n(int i2) {
        if (i2 != -1) {
            return k(i2);
        }
        View view = this.f183i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        G.d dVar = new G.d(obtain);
        WeakHashMap weakHashMap = O.f58a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            dVar.f129a.addChild(view, ((Integer) arrayList.get(i3)).intValue());
        }
        return dVar;
    }

    public abstract void o(int i2, G.d dVar);

    public final boolean p(int i2) {
        int i3;
        View view = this.f183i;
        if ((!view.isFocused() && !view.requestFocus()) || (i3 = this.f186l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f186l = i2;
        e0.c cVar = (e0.c) this;
        if (i2 == 1) {
            Chip chip = cVar.f2225q;
            chip.f1766m = true;
            chip.refreshDrawableState();
        }
        q(i2, 8);
        return true;
    }

    public final void q(int i2, int i3) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i2 == Integer.MIN_VALUE || !this.f182h.isEnabled() || (parent = (view = this.f183i).getParent()) == null) {
            return;
        }
        if (i2 != -1) {
            obtain = AccessibilityEvent.obtain(i3);
            G.d n2 = n(i2);
            obtain.getText().add(n2.e());
            AccessibilityNodeInfo accessibilityNodeInfo = n2.f129a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i2);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
