package i;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class P0 extends J.b implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f2680x = 0;

    /* renamed from: h, reason: collision with root package name */
    public final int f2681h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2682i;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f2683j;

    /* renamed from: k, reason: collision with root package name */
    public final SearchView f2684k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchableInfo f2685l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f2686m;

    /* renamed from: n, reason: collision with root package name */
    public final WeakHashMap f2687n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2688o;

    /* renamed from: p, reason: collision with root package name */
    public int f2689p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f2690q;

    /* renamed from: r, reason: collision with root package name */
    public int f2691r;

    /* renamed from: s, reason: collision with root package name */
    public int f2692s;

    /* renamed from: t, reason: collision with root package name */
    public int f2693t;

    /* renamed from: u, reason: collision with root package name */
    public int f2694u;

    /* renamed from: v, reason: collision with root package name */
    public int f2695v;

    /* renamed from: w, reason: collision with root package name */
    public int f2696w;

    public P0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f165b = true;
        this.f166c = null;
        this.f164a = false;
        this.f167d = -1;
        this.f168e = new J.a(this);
        this.f169f = new C0166q0(1, this);
        this.f2682i = suggestionRowLayout;
        this.f2681h = suggestionRowLayout;
        this.f2683j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2689p = 1;
        this.f2691r = -1;
        this.f2692s = -1;
        this.f2693t = -1;
        this.f2694u = -1;
        this.f2695v = -1;
        this.f2696w = -1;
        this.f2684k = searchView;
        this.f2685l = searchableInfo;
        this.f2688o = searchView.getSuggestionCommitIconResId();
        this.f2686m = context;
        this.f2687n = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    @Override // J.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.P0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // J.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f2691r = cursor.getColumnIndex("suggest_text_1");
                this.f2692s = cursor.getColumnIndex("suggest_text_2");
                this.f2693t = cursor.getColumnIndex("suggest_text_2_url");
                this.f2694u = cursor.getColumnIndex("suggest_icon_1");
                this.f2695v = cursor.getColumnIndex("suggest_icon_2");
                this.f2696w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // J.b
    public final String c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        SearchableInfo searchableInfo = this.f2685l;
        if (searchableInfo.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    @Override // J.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f2683j.inflate(this.f2681h, viewGroup, false);
        inflate.setTag(new O0(inflate));
        ((ImageView) inflate.findViewById(2131296413)).setImageResource(this.f2688o);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f2686m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.P0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f2686m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // J.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f2683j.inflate(this.f2682i, viewGroup, false);
            if (inflate != null) {
                ((O0) inflate.getTag()).f2670a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // J.b, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = this.d(viewGroup);
            ((O0) d2.getTag()).f2670a.setText(e2.toString());
            return d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f166c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f166c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2684k.q((CharSequence) tag);
        }
    }
}
