package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import l.C0190b;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0067h extends d0 {
    public static void i(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                i(arrayList, childAt);
            }
        }
    }

    public static void j(C0190b c0190b, View view) {
        WeakHashMap weakHashMap = F.O.f58a;
        String k2 = F.E.k(view);
        if (k2 != null) {
            c0190b.put(k2, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    j(c0190b, childAt);
                }
            }
        }
    }

    public static void k(C0190b c0190b, Collection collection) {
        Iterator it = ((l.h) c0190b.entrySet()).iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            WeakHashMap weakHashMap = F.O.f58a;
            if (!collection.contains(F.E.k(view))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0459  */
    @Override // androidx.fragment.app.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0067h.b(java.util.ArrayList, boolean):void");
    }
}
