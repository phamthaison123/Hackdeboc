package h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class l extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final o f2443a;

    /* renamed from: b, reason: collision with root package name */
    public int f2444b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2445c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2446d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2447e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2448f;

    public l(o oVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f2446d = z2;
        this.f2447e = layoutInflater;
        this.f2443a = oVar;
        this.f2448f = i2;
        a();
    }

    public final void a() {
        o oVar = this.f2443a;
        q qVar = oVar.f2471v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f2459j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((q) arrayList.get(i2)) == qVar) {
                    this.f2444b = i2;
                    return;
                }
            }
        }
        this.f2444b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i2) {
        ArrayList l2;
        boolean z2 = this.f2446d;
        o oVar = this.f2443a;
        if (z2) {
            oVar.i();
            l2 = oVar.f2459j;
        } else {
            l2 = oVar.l();
        }
        int i3 = this.f2444b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (q) l2.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        boolean z2 = this.f2446d;
        o oVar = this.f2443a;
        if (z2) {
            oVar.i();
            l2 = oVar.f2459j;
        } else {
            l2 = oVar.l();
        }
        return this.f2444b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2447e.inflate(this.f2448f, viewGroup, false);
        }
        int i3 = getItem(i2).f2481b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f2481b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2443a.m() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        C c2 = (C) view;
        if (this.f2445c) {
            listMenuItemView.setForceShowIcon(true);
        }
        c2.c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
