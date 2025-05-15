package e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import d.AbstractC0092a;
import java.lang.ref.WeakReference;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2095a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2096b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2097c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2098d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2099e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2100f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2101g;

    /* renamed from: h, reason: collision with root package name */
    public Button f2102h;

    /* renamed from: i, reason: collision with root package name */
    public NestedScrollView f2103i;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2105k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f2106l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2107m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f2108n;

    /* renamed from: o, reason: collision with root package name */
    public View f2109o;

    /* renamed from: p, reason: collision with root package name */
    public ListAdapter f2110p;

    /* renamed from: r, reason: collision with root package name */
    public final int f2112r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2113s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2114t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2115u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2116v;

    /* renamed from: w, reason: collision with root package name */
    public final f f2117w;

    /* renamed from: j, reason: collision with root package name */
    public int f2104j = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2111q = -1;

    /* renamed from: x, reason: collision with root package name */
    public final ViewOnClickListenerC0096b f2118x = new ViewOnClickListenerC0096b(0, this);

    public h(Context context, i iVar, Window window) {
        this.f2095a = context;
        this.f2096b = iVar;
        this.f2097c = window;
        f fVar = new f();
        fVar.f2094a = new WeakReference(iVar);
        this.f2117w = fVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0092a.f2010e, 2130968615, 0);
        this.f2112r = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2113s = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2114t = obtainStyledAttributes.getResourceId(7, 0);
        this.f2115u = obtainStyledAttributes.getResourceId(3, 0);
        this.f2116v = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        iVar.e().g(1);
    }

    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
