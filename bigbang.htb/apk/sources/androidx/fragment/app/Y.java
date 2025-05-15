package androidx.fragment.app;

import F.ViewTreeObserverOnPreDrawListenerC0017s;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l.C0190b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class Y {
    public static void d(View view, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = F.O.f58a;
        if (F.E.k(view) != null) {
            list.add(view);
        }
        for (int i3 = size; i3 < list.size(); i3++) {
            View view2 = (View) list.get(i3);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            if (list.get(i5) == childAt) {
                                break;
                            } else {
                                i5++;
                            }
                        } else if (F.E.k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        WeakHashMap weakHashMap = F.O.f58a;
        if (F.B.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public static ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
            WeakHashMap weakHashMap = F.O.f58a;
            arrayList2.add(F.E.k(view));
            F.E.v(view, null);
        }
        return arrayList2;
    }

    public static void q(ViewGroup viewGroup, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C0190b c0190b) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
            WeakHashMap weakHashMap = F.O.f58a;
            String k2 = F.E.k(view);
            arrayList4.add(k2);
            if (k2 != null) {
                F.E.v(view, null);
                String str = (String) c0190b.getOrDefault(k2, null);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i3))) {
                        F.E.v((View) arrayList2.get(i3), k2);
                        break;
                    }
                    i3++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0017s.a(viewGroup, new X(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public abstract Object i(Object obj, Object obj2, Object obj3);

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract void l(Object obj, View view, ArrayList arrayList);

    public abstract void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void n(View view, Object obj);

    public abstract void o(Object obj, Rect rect);

    public void p(Object obj, Runnable runnable) {
        runnable.run();
    }

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void s(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object t(Object obj);
}
