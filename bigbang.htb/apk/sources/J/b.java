package J;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import i.C0166q0;
import i.P0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class b extends BaseAdapter implements Filterable, c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f164a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f165b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f166c;

    /* renamed from: d, reason: collision with root package name */
    public int f167d;

    /* renamed from: e, reason: collision with root package name */
    public a f168e;

    /* renamed from: f, reason: collision with root package name */
    public C0166q0 f169f;

    /* renamed from: g, reason: collision with root package name */
    public d f170g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f166c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f168e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                C0166q0 c0166q0 = this.f169f;
                if (c0166q0 != null) {
                    cursor2.unregisterDataSetObserver(c0166q0);
                }
            }
            this.f166c = cursor;
            if (cursor != null) {
                a aVar2 = this.f168e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                C0166q0 c0166q02 = this.f169f;
                if (c0166q02 != null) {
                    cursor.registerDataSetObserver(c0166q02);
                }
                this.f167d = cursor.getColumnIndexOrThrow("_id");
                this.f164a = true;
                notifyDataSetChanged();
            } else {
                this.f167d = -1;
                this.f164a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f164a || (cursor = this.f166c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f164a) {
            return null;
        }
        this.f166c.moveToPosition(i2);
        if (view == null) {
            P0 p02 = (P0) this;
            view = p02.f2683j.inflate(p02.f2682i, viewGroup, false);
        }
        a(view, this.f166c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f170g == null) {
            d dVar = new d();
            dVar.f171a = this;
            this.f170g = dVar;
        }
        return this.f170g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f164a || (cursor = this.f166c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f166c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f164a && (cursor = this.f166c) != null && cursor.moveToPosition(i2)) {
            return this.f166c.getLong(this.f167d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f164a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f166c.moveToPosition(i2)) {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f166c);
        return view;
    }
}
