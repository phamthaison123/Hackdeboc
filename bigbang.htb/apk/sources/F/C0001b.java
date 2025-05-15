package F;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0001b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f79c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f80a;

    /* renamed from: b, reason: collision with root package name */
    public final C0000a f81b;

    public C0001b() {
        this(f79c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f80a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public e.z b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f80a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new e.z(14, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f80a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, G.d dVar) {
        this.f80a.onInitializeAccessibilityNodeInfo(view, dVar.f129a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f80a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f80a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i2, Bundle bundle) {
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(2131296631);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                break;
            }
            G.b bVar = (G.b) list.get(i3);
            if (bVar.a() == i2) {
                G.o oVar = bVar.f127d;
                if (oVar != null) {
                    Class cls = bVar.f126c;
                    if (cls != null) {
                        try {
                            Q.i(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    z2 = oVar.i(view);
                }
            } else {
                i3++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f80a.performAccessibilityAction(view, i2, bundle);
        }
        if (z2 || i2 != 2131296271) {
            return z2;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131296632);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
                i5++;
            }
        }
        return z3;
    }

    public void h(View view, int i2) {
        this.f80a.sendAccessibilityEvent(view, i2);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f80a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0001b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f80a = accessibilityDelegate;
        this.f81b = new C0000a(this);
    }
}
