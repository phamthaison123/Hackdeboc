package i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class H0 implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2645b;

    public /* synthetic */ H0(View view, int i2) {
        this.f2644a = i2;
        this.f2645b = view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        Object item;
        int i3 = this.f2644a;
        View view2 = this.f2645b;
        switch (i3) {
            case 0:
                ((SearchView) view2).o(i2);
                break;
            default:
                if (i2 < 0) {
                    C0171t0 c0171t0 = ((o0.p) view2).f3423e;
                    item = !c0171t0.f2922y.isShowing() ? null : c0171t0.f2900c.getSelectedItem();
                } else {
                    item = ((o0.p) view2).getAdapter().getItem(i2);
                }
                o0.p pVar = (o0.p) view2;
                o0.p.a(pVar, item);
                AdapterView.OnItemClickListener onItemClickListener = pVar.getOnItemClickListener();
                C0171t0 c0171t02 = pVar.f3423e;
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = c0171t02.f2922y.isShowing() ? c0171t02.f2900c.getSelectedView() : null;
                        i2 = !c0171t02.f2922y.isShowing() ? -1 : c0171t02.f2900c.getSelectedItemPosition();
                        j2 = !c0171t02.f2922y.isShowing() ? Long.MIN_VALUE : c0171t02.f2900c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0171t02.f2900c, view, i2, j2);
                }
                c0171t02.dismiss();
                break;
        }
    }
}
