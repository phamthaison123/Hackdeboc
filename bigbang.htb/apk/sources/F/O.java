package F;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f58a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f59b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0018t f60c;

    /* renamed from: d, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0020v f61d;

    static {
        new AtomicInteger(1);
        f58a = null;
        f59b = new int[]{2131296272, 2131296273, 2131296284, 2131296295, 2131296298, 2131296299, 2131296300, 2131296301, 2131296302, 2131296303, 2131296274, 2131296275, 2131296276, 2131296277, 2131296278, 2131296279, 2131296280, 2131296281, 2131296282, 2131296283, 2131296285, 2131296286, 2131296287, 2131296288, 2131296289, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296296, 2131296297};
        f60c = new C0018t();
        f61d = new ViewTreeObserverOnGlobalLayoutListenerC0020v();
    }

    public static T a(View view) {
        if (f58a == null) {
            f58a = new WeakHashMap();
        }
        T t2 = (T) f58a.get(view);
        if (t2 != null) {
            return t2;
        }
        T t3 = new T();
        t3.f69a = new WeakReference(view);
        f58a.put(view, t3);
        return t3;
    }

    public static ArrayList b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131296631);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131296631, arrayList2);
        return arrayList2;
    }

    public static String[] c(View view) {
        return Build.VERSION.SDK_INT >= 31 ? L.a(view) : (String[]) view.getTag(2131296637);
    }

    public static void d(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = I.b(view) != null && view.getVisibility() == 0;
            if (B.a(view) != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                B.g(obtain, i2);
                if (z2) {
                    obtain.getText().add(I.b(view));
                    if (AbstractC0023y.c(view) == 0) {
                        AbstractC0023y.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (AbstractC0023y.c((View) parent) == 4) {
                            AbstractC0023y.s(view, 2);
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        B.e(view.getParent(), view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            B.g(obtain2, i2);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(I.b(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0007h e(View view, C0007h c0007h) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0007h + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return L.b(view, c0007h);
        }
        InterfaceC0016q interfaceC0016q = (InterfaceC0016q) view.getTag(2131296636);
        r rVar = f60c;
        if (interfaceC0016q == null) {
            if (view instanceof r) {
                rVar = (r) view;
            }
            return rVar.a(c0007h);
        }
        C0007h a2 = ((I.i) interfaceC0016q).a(view, c0007h);
        if (a2 == null) {
            return null;
        }
        if (view instanceof r) {
            rVar = (r) view;
        }
        return rVar.a(a2);
    }

    public static void f(View view, int i2) {
        ArrayList b2 = b(view);
        for (int i3 = 0; i3 < b2.size(); i3++) {
            if (((G.b) b2.get(i3)).a() == i2) {
                b2.remove(i3);
                return;
            }
        }
    }

    public static void g(View view, G.b bVar, G.o oVar) {
        G.b bVar2 = new G.b(null, bVar.f125b, null, oVar, bVar.f126c);
        View.AccessibilityDelegate a2 = J.a(view);
        C0001b c0001b = a2 == null ? null : a2 instanceof C0000a ? ((C0000a) a2).f77a : new C0001b(a2);
        if (c0001b == null) {
            c0001b = new C0001b();
        }
        h(view, c0001b);
        f(view, bVar2.a());
        b(view).add(bVar2);
        d(view, 0);
    }

    public static void h(View view, C0001b c0001b) {
        if (c0001b == null && (J.a(view) instanceof C0000a)) {
            c0001b = new C0001b();
        }
        view.setAccessibilityDelegate(c0001b == null ? null : c0001b.f81b);
    }

    public static void i(View view, CharSequence charSequence) {
        new C0019u(2131296634, 8, 28, 1 == true ? 1 : 0).b(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0020v viewTreeObserverOnGlobalLayoutListenerC0020v = f61d;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0020v.f108a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0020v);
            AbstractC0023y.o(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC0020v);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0020v.f108a.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0020v);
            if (B.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0020v);
            }
        }
    }
}
