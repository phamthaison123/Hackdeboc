package S;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class A extends B {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(P p2, int i2) {
        super(p2);
        this.f252d = i2;
    }

    @Override // S.B
    public final int b(View view) {
        int i2 = this.f252d;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                Q q2 = (Q) view.getLayoutParams();
                p2.getClass();
                return view.getRight() + ((Q) view.getLayoutParams()).f298b.right + ((ViewGroup.MarginLayoutParams) q2).rightMargin;
            default:
                Q q3 = (Q) view.getLayoutParams();
                p2.getClass();
                return view.getBottom() + ((Q) view.getLayoutParams()).f298b.bottom + ((ViewGroup.MarginLayoutParams) q3).bottomMargin;
        }
    }

    @Override // S.B
    public final int c(View view) {
        int i2 = this.f252d;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                Q q2 = (Q) view.getLayoutParams();
                p2.getClass();
                Rect rect = ((Q) view.getLayoutParams()).f298b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q2).leftMargin + ((ViewGroup.MarginLayoutParams) q2).rightMargin;
            default:
                Q q3 = (Q) view.getLayoutParams();
                p2.getClass();
                Rect rect2 = ((Q) view.getLayoutParams()).f298b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) q3).topMargin + ((ViewGroup.MarginLayoutParams) q3).bottomMargin;
        }
    }

    @Override // S.B
    public final int d(View view) {
        int i2 = this.f252d;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                Q q2 = (Q) view.getLayoutParams();
                p2.getClass();
                return (view.getLeft() - ((Q) view.getLayoutParams()).f298b.left) - ((ViewGroup.MarginLayoutParams) q2).leftMargin;
            default:
                Q q3 = (Q) view.getLayoutParams();
                p2.getClass();
                return (view.getTop() - ((Q) view.getLayoutParams()).f298b.top) - ((ViewGroup.MarginLayoutParams) q3).topMargin;
        }
    }

    @Override // S.B
    public final int e() {
        int i2 = this.f252d;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                return p2.f295n - p2.B();
            default:
                return p2.f296o - p2.z();
        }
    }

    @Override // S.B
    public final int f() {
        int i2 = this.f252d;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                return p2.A();
            default:
                return p2.C();
        }
    }

    @Override // S.B
    public final int g() {
        int i2 = this.f252d;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                return (p2.f295n - p2.A()) - p2.B();
            default:
                return (p2.f296o - p2.C()) - p2.z();
        }
    }

    @Override // S.B
    public final int i(View view) {
        int i2 = this.f252d;
        Rect rect = this.f255c;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                p2.G(view, rect);
                return rect.right;
            default:
                p2.G(view, rect);
                return rect.bottom;
        }
    }

    @Override // S.B
    public final int j(View view) {
        int i2 = this.f252d;
        Rect rect = this.f255c;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                p2.G(view, rect);
                return rect.left;
            default:
                p2.G(view, rect);
                return rect.top;
        }
    }

    @Override // S.B
    public final void k(int i2) {
        int i3 = this.f252d;
        P p2 = this.f253a;
        switch (i3) {
            case 0:
                p2.K(i2);
                break;
            default:
                p2.L(i2);
                break;
        }
    }

    public final int l(View view) {
        int i2 = this.f252d;
        P p2 = this.f253a;
        switch (i2) {
            case 0:
                Q q2 = (Q) view.getLayoutParams();
                p2.getClass();
                Rect rect = ((Q) view.getLayoutParams()).f298b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q2).topMargin + ((ViewGroup.MarginLayoutParams) q2).bottomMargin;
            default:
                Q q3 = (Q) view.getLayoutParams();
                p2.getClass();
                Rect rect2 = ((Q) view.getLayoutParams()).f298b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) q3).leftMargin + ((ViewGroup.MarginLayoutParams) q3).rightMargin;
        }
    }
}
