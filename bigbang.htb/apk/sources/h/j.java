package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2435a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2436b;

    public j(k kVar) {
        this.f2436b = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f2436b.f2439c;
        q qVar = oVar.f2471v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f2459j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((q) arrayList.get(i2)) == qVar) {
                    this.f2435a = i2;
                    return;
                }
            }
        }
        this.f2435a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i2) {
        k kVar = this.f2436b;
        o oVar = kVar.f2439c;
        oVar.i();
        ArrayList arrayList = oVar.f2459j;
        kVar.getClass();
        int i3 = this.f2435a;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (q) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f2436b;
        o oVar = kVar.f2439c;
        oVar.i();
        int size = oVar.f2459j.size();
        kVar.getClass();
        return this.f2435a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2436b.f2438b.inflate(2131492880, viewGroup, false);
        }
        ((C) view).c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
