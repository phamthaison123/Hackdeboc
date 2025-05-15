package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: i.v0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0175v0 extends C0150i0 {

    /* renamed from: n, reason: collision with root package name */
    public final int f2934n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2935o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0173u0 f2936p;

    /* renamed from: q, reason: collision with root package name */
    public h.q f2937q;

    public C0175v0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2934n = 21;
            this.f2935o = 22;
        } else {
            this.f2934n = 22;
            this.f2935o = 21;
        }
    }

    @Override // i.C0150i0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        h.l lVar;
        int i2;
        int pointToPosition;
        int i3;
        if (this.f2936p != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                lVar = (h.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (h.l) adapter;
                i2 = 0;
            }
            h.q item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= lVar.getCount()) ? null : lVar.getItem(i3);
            h.q qVar = this.f2937q;
            if (qVar != item) {
                h.o oVar = lVar.f2443a;
                if (qVar != null) {
                    this.f2936p.h(oVar, qVar);
                }
                this.f2937q = item;
                if (item != null) {
                    this.f2936p.m(oVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f2934n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f2935o) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (h.l) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (h.l) adapter).f2443a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0173u0 interfaceC0173u0) {
        this.f2936p = interfaceC0173u0;
    }

    @Override // i.C0150i0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
