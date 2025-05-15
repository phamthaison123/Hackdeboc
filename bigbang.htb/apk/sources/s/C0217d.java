package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import r.AbstractC0213a;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0217d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0214a f3691a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3692b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3693c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3694d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3695e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3696f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3697g;

    /* renamed from: h, reason: collision with root package name */
    public int f3698h;

    /* renamed from: i, reason: collision with root package name */
    public int f3699i;

    /* renamed from: j, reason: collision with root package name */
    public int f3700j;

    /* renamed from: k, reason: collision with root package name */
    public View f3701k;

    /* renamed from: l, reason: collision with root package name */
    public View f3702l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3703m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3704n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3705o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f3706p;

    public C0217d() {
        super(-2, -2);
        this.f3692b = false;
        this.f3693c = 0;
        this.f3694d = 0;
        this.f3695e = -1;
        this.f3696f = -1;
        this.f3697g = 0;
        this.f3698h = 0;
        this.f3706p = new Rect();
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.f3704n;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f3705o;
    }

    public C0217d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0214a abstractC0214a;
        this.f3692b = false;
        this.f3693c = 0;
        this.f3694d = 0;
        this.f3695e = -1;
        this.f3696f = -1;
        this.f3697g = 0;
        this.f3698h = 0;
        this.f3706p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0213a.f3689b);
        this.f3693c = obtainStyledAttributes.getInteger(0, 0);
        this.f3696f = obtainStyledAttributes.getResourceId(1, -1);
        this.f3694d = obtainStyledAttributes.getInteger(2, 0);
        this.f3695e = obtainStyledAttributes.getInteger(6, -1);
        this.f3697g = obtainStyledAttributes.getInt(5, 0);
        this.f3698h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f3692b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1005t;
            if (TextUtils.isEmpty(string)) {
                abstractC0214a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1005t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1007v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1006u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0214a = (AbstractC0214a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f3691a = abstractC0214a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0214a abstractC0214a2 = this.f3691a;
        if (abstractC0214a2 != null) {
            abstractC0214a2.c(this);
        }
    }

    public C0217d(C0217d c0217d) {
        super((ViewGroup.MarginLayoutParams) c0217d);
        this.f3692b = false;
        this.f3693c = 0;
        this.f3694d = 0;
        this.f3695e = -1;
        this.f3696f = -1;
        this.f3697g = 0;
        this.f3698h = 0;
        this.f3706p = new Rect();
    }

    public C0217d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3692b = false;
        this.f3693c = 0;
        this.f3694d = 0;
        this.f3695e = -1;
        this.f3696f = -1;
        this.f3697g = 0;
        this.f3698h = 0;
        this.f3706p = new Rect();
    }

    public C0217d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3692b = false;
        this.f3693c = 0;
        this.f3694d = 0;
        this.f3695e = -1;
        this.f3696f = -1;
        this.f3697g = 0;
        this.f3698h = 0;
        this.f3706p = new Rect();
    }
}
