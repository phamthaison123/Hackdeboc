package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import e.C0097c;
import h.D;
import h.n;
import h.o;
import h.q;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ExpandedMenuView extends ListView implements n, D, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f793b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public o f794a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0097c t2 = C0097c.t(context, attributeSet, f793b, R.attr.listViewStyle, 0);
        if (t2.r(0)) {
            setBackgroundDrawable(t2.g(0));
        }
        if (t2.r(1)) {
            setDivider(t2.g(1));
        }
        t2.u();
    }

    @Override // h.D
    public final void b(o oVar) {
        this.f794a = oVar;
    }

    @Override // h.n
    public final boolean e(q qVar) {
        return this.f794a.q(qVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        e((q) getAdapter().getItem(i2));
    }
}
