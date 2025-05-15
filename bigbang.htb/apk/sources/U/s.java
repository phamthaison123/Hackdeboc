package U;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public q f652a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f653b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5 A[EDGE_INSN: B:120:0x01e5->B:121:0x01e5 BREAK  A[LOOP:1: B:17:0x0088->B:29:0x01dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.s.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f653b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = t.f656c;
        ViewGroup viewGroup2 = this.f653b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) t.b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((q) it.next()).x(viewGroup2);
            }
        }
        this.f652a.i(true);
    }
}
