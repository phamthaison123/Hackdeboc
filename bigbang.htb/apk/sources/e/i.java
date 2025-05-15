package e;

import F.F;
import F.O;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import g.C0113m;
import java.util.WeakHashMap;
import l.C0191c;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i extends Dialog implements DialogInterface, j {

    /* renamed from: a, reason: collision with root package name */
    public v f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2120b;

    /* renamed from: c, reason: collision with root package name */
    public final h f2121c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r5, int r6) {
        /*
            r4 = this;
            int r6 = i(r5, r6)
            r0 = 1
            r1 = 2130968874(0x7f04012a, float:1.7546414E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            e.w r2 = new e.w
            r2.<init>(r4)
            r4.f2120b = r2
            e.k r2 = r4.e()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            e.v r5 = (e.v) r5
            r5.f2174N = r6
            r2.c()
            e.h r5 = new e.h
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f2121c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.<init>(android.content.Context, int):void");
    }

    public static int i(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968616, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v vVar = (v) e();
        vVar.r();
        ((ViewGroup) vVar.f2204u.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f2189f.f2132a.onContentChanged();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void dismiss() {
        super.dismiss();
        e().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        w wVar = this.f2120b;
        if (wVar == null) {
            return false;
        }
        return wVar.a(keyEvent);
    }

    @Override // android.app.Dialog
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final View findViewById(int i2) {
        v vVar = (v) e();
        vVar.r();
        return vVar.f2188e.findViewById(i2);
    }

    public final k e() {
        if (this.f2119a == null) {
            C0191c c0191c = k.f2122a;
            this.f2119a = new v(getContext(), getWindow(), this, this);
        }
        return this.f2119a;
    }

    @Override // android.app.Dialog
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void invalidateOptionsMenu() {
        v vVar = (v) e();
        vVar.v();
        vVar.w(0);
    }

    public final void g(Bundle bundle) {
        e().b();
        super.onCreate(bundle);
        e().c();
    }

    @Override // android.app.Dialog
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onStop() {
        super.onStop();
        v vVar = (v) e();
        vVar.v();
        E e2 = vVar.f2191h;
        if (e2 != null) {
            e2.f2069v = false;
            C0113m c0113m = e2.f2068u;
            if (c0113m != null) {
                c0113m.a();
            }
        }
    }

    @Override // android.app.Dialog
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void setContentView(int i2) {
        e().h(i2);
    }

    @Override // android.app.Dialog
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setContentView(View view) {
        v vVar = (v) e();
        vVar.r();
        ViewGroup viewGroup = (ViewGroup) vVar.f2204u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        vVar.f2189f.f2132a.onContentChanged();
    }

    @Override // android.app.Dialog
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v vVar = (v) e();
        vVar.r();
        ViewGroup viewGroup = (ViewGroup) vVar.f2204u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        vVar.f2189f.f2132a.onContentChanged();
    }

    @Override // android.app.Dialog
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void setTitle(int i2) {
        super.setTitle(i2);
        e().i(getContext().getString(i2));
    }

    public final void n(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().i(charSequence);
    }

    public final boolean o(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        ListAdapter listAdapter;
        View findViewById;
        g(bundle);
        h hVar = this.f2121c;
        hVar.f2096b.setContentView(hVar.f2112r);
        Window window = hVar.f2097c;
        View findViewById2 = window.findViewById(2131296550);
        View findViewById3 = findViewById2.findViewById(2131296670);
        View findViewById4 = findViewById2.findViewById(2131296371);
        View findViewById5 = findViewById2.findViewById(2131296344);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131296377);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(2131296670);
        View findViewById7 = viewGroup.findViewById(2131296371);
        View findViewById8 = viewGroup.findViewById(2131296344);
        ViewGroup b2 = h.b(findViewById6, findViewById3);
        ViewGroup b3 = h.b(findViewById7, findViewById4);
        ViewGroup b4 = h.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296581);
        hVar.f2103i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        hVar.f2103i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b3.findViewById(R.id.message);
        hVar.f2108n = textView;
        if (textView != null) {
            textView.setVisibility(8);
            hVar.f2103i.removeView(hVar.f2108n);
            if (hVar.f2099e != null) {
                ViewGroup viewGroup2 = (ViewGroup) hVar.f2103i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(hVar.f2103i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(hVar.f2099e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                b3.setVisibility(8);
            }
        }
        Button button = (Button) b4.findViewById(R.id.button1);
        hVar.f2100f = button;
        ViewOnClickListenerC0096b viewOnClickListenerC0096b = hVar.f2118x;
        button.setOnClickListener(viewOnClickListenerC0096b);
        if (TextUtils.isEmpty(null)) {
            hVar.f2100f.setVisibility(8);
            i2 = 0;
        } else {
            hVar.f2100f.setText((CharSequence) null);
            hVar.f2100f.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) b4.findViewById(R.id.button2);
        hVar.f2101g = button2;
        button2.setOnClickListener(viewOnClickListenerC0096b);
        if (TextUtils.isEmpty(null)) {
            hVar.f2101g.setVisibility(8);
        } else {
            hVar.f2101g.setText((CharSequence) null);
            hVar.f2101g.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) b4.findViewById(R.id.button3);
        hVar.f2102h = button3;
        button3.setOnClickListener(viewOnClickListenerC0096b);
        if (TextUtils.isEmpty(null)) {
            hVar.f2102h.setVisibility(8);
        } else {
            hVar.f2102h.setText((CharSequence) null);
            hVar.f2102h.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        hVar.f2095a.getTheme().resolveAttribute(2130968614, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = hVar.f2100f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = hVar.f2101g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = hVar.f2102h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            b4.setVisibility(8);
        }
        if (hVar.f2109o != null) {
            b2.addView(hVar.f2109o, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296667).setVisibility(8);
        } else {
            hVar.f2106l = (ImageView) window.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(hVar.f2098d)) && hVar.f2116v) {
                TextView textView2 = (TextView) window.findViewById(2131296324);
                hVar.f2107m = textView2;
                textView2.setText(hVar.f2098d);
                int i3 = hVar.f2104j;
                if (i3 != 0) {
                    hVar.f2106l.setImageResource(i3);
                } else {
                    Drawable drawable = hVar.f2105k;
                    if (drawable != null) {
                        hVar.f2106l.setImageDrawable(drawable);
                    } else {
                        hVar.f2107m.setPadding(hVar.f2106l.getPaddingLeft(), hVar.f2106l.getPaddingTop(), hVar.f2106l.getPaddingRight(), hVar.f2106l.getPaddingBottom());
                        hVar.f2106l.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(2131296667).setVisibility(8);
                hVar.f2106l.setVisibility(8);
                b2.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i4 = (b2 == null || b2.getVisibility() == 8) ? 0 : 1;
        boolean z3 = b4.getVisibility() != 8;
        if (!z3 && (findViewById = b3.findViewById(2131296651)) != null) {
            findViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = hVar.f2103i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = hVar.f2099e != null ? b2.findViewById(2131296666) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b3.findViewById(2131296652);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = hVar.f2099e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i4 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i4 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f779a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f780b);
            }
        }
        if (!z2) {
            View view = hVar.f2099e;
            if (view == null) {
                view = hVar.f2103i;
            }
            if (view != null) {
                int i5 = i4 | (z3 ? 2 : 0);
                View findViewById11 = window.findViewById(2131296580);
                View findViewById12 = window.findViewById(2131296579);
                WeakHashMap weakHashMap = O.f58a;
                F.d(view, i5, 3);
                if (findViewById11 != null) {
                    b3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = hVar.f2099e;
        if (alertController$RecycleListView2 == null || (listAdapter = hVar.f2110p) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i6 = hVar.f2111q;
        if (i6 > -1) {
            alertController$RecycleListView2.setItemChecked(i6, true);
            alertController$RecycleListView2.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2121c.f2103i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2121c.f2103i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        n(charSequence);
        h hVar = this.f2121c;
        hVar.f2098d = charSequence;
        TextView textView = hVar.f2107m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
