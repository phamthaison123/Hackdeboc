package S;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.fragment.app.AbstractComponentCallbacksC0075p;
import androidx.fragment.app.C0073n;
import androidx.fragment.app.C0077s;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.C0098d;
import e.C0099e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class N implements p0, B.b, G.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f276a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f277b;

    public /* synthetic */ N(int i2, Object obj) {
        this.f276a = i2;
        this.f277b = obj;
    }

    public e.i a() {
        C0099e c0099e = (C0099e) this.f277b;
        e.i iVar = new e.i(c0099e.f2084a, this.f276a);
        View view = c0099e.f2088e;
        e.h hVar = iVar.f2121c;
        int i2 = 0;
        if (view != null) {
            hVar.f2109o = view;
        } else {
            CharSequence charSequence = c0099e.f2087d;
            if (charSequence != null) {
                hVar.f2098d = charSequence;
                TextView textView = hVar.f2107m;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0099e.f2086c;
            if (drawable != null) {
                hVar.f2105k = drawable;
                hVar.f2104j = 0;
                ImageView imageView = hVar.f2106l;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    hVar.f2106l.setImageDrawable(drawable);
                }
            }
        }
        if (c0099e.f2090g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0099e.f2085b.inflate(hVar.f2113s, (ViewGroup) null);
            int i3 = c0099e.f2092i ? hVar.f2114t : hVar.f2115u;
            ListAdapter listAdapter = c0099e.f2090g;
            if (listAdapter == null) {
                listAdapter = new e.g(c0099e.f2084a, i3, R.id.text1, null);
            }
            hVar.f2110p = listAdapter;
            hVar.f2111q = c0099e.f2093j;
            if (c0099e.f2091h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0098d(i2, c0099e, hVar));
            }
            if (c0099e.f2092i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            hVar.f2099e = alertController$RecycleListView;
        }
        c0099e.getClass();
        iVar.setCancelable(true);
        c0099e.getClass();
        iVar.setCanceledOnTouchOutside(true);
        c0099e.getClass();
        iVar.setOnCancelListener(null);
        c0099e.getClass();
        iVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c0099e.f2089f;
        if (onKeyListener != null) {
            iVar.setOnKeyListener(onKeyListener);
        }
        return iVar;
    }

    public int b(View view) {
        int i2 = this.f276a;
        Object obj = this.f277b;
        switch (i2) {
            case 0:
                Q q2 = (Q) view.getLayoutParams();
                ((P) obj).getClass();
                return view.getRight() + ((Q) view.getLayoutParams()).f298b.right + ((ViewGroup.MarginLayoutParams) q2).rightMargin;
            default:
                Q q3 = (Q) view.getLayoutParams();
                ((P) obj).getClass();
                return view.getBottom() + ((Q) view.getLayoutParams()).f298b.bottom + ((ViewGroup.MarginLayoutParams) q3).bottomMargin;
        }
    }

    public int c(View view) {
        int i2 = this.f276a;
        Object obj = this.f277b;
        switch (i2) {
            case 0:
                Q q2 = (Q) view.getLayoutParams();
                ((P) obj).getClass();
                return (view.getLeft() - ((Q) view.getLayoutParams()).f298b.left) - ((ViewGroup.MarginLayoutParams) q2).leftMargin;
            default:
                Q q3 = (Q) view.getLayoutParams();
                ((P) obj).getClass();
                return (view.getTop() - ((Q) view.getLayoutParams()).f298b.top) - ((ViewGroup.MarginLayoutParams) q3).topMargin;
        }
    }

    @Override // B.b
    public void d() {
        int i2 = this.f276a;
        Object obj = this.f277b;
        switch (i2) {
            case 1:
                AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p = (AbstractComponentCallbacksC0075p) obj;
                C0073n c0073n = abstractComponentCallbacksC0075p.f1377H;
                if ((c0073n == null ? null : c0073n.f1354a) != null) {
                    View view = c0073n == null ? null : c0073n.f1354a;
                    abstractComponentCallbacksC0075p.f().f1354a = null;
                    view.clearAnimation();
                }
                abstractComponentCallbacksC0075p.f().f1355b = null;
                break;
            default:
                ((androidx.fragment.app.c0) obj).a();
                break;
        }
    }

    public void e() {
        ((C0077s) this.f277b).f1418f.J();
    }

    @Override // G.o
    public boolean i(View view) {
        ((BottomSheetBehavior) this.f277b).z(this.f276a);
        return true;
    }

    public N(Context context) {
        int i2 = e.i.i(context, 0);
        this.f277b = new C0099e(new ContextThemeWrapper(context, e.i.i(context, i2)));
        this.f276a = i2;
    }

    public N(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f277b = bottomSheetBehavior;
        this.f276a = i2;
    }
}
