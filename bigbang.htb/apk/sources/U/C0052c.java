package U;

import F.AbstractC0024z;
import F.O;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: U.c, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0052c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f592a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0052c(Class cls, String str, int i2) {
        super(cls, str);
        this.f592a = i2;
    }

    public final Float a(View view) {
        switch (this.f592a) {
            case 5:
                C0052c c0052c = x.f666a;
                return Float.valueOf(view.getTransitionAlpha());
            case 6:
            default:
                WeakHashMap weakHashMap = O.f58a;
                return Float.valueOf(AbstractC0024z.e(view));
            case 7:
                return Float.valueOf(view.getLayoutParams().width);
            case 8:
                return Float.valueOf(view.getLayoutParams().height);
            case 9:
                WeakHashMap weakHashMap2 = O.f58a;
                return Float.valueOf(AbstractC0024z.f(view));
        }
    }

    public final void b(C0055f c0055f, PointF pointF) {
        switch (this.f592a) {
            case 0:
                c0055f.getClass();
                c0055f.f595a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0055f.f596b = round;
                int i2 = c0055f.f600f + 1;
                c0055f.f600f = i2;
                if (i2 == c0055f.f601g) {
                    int i3 = c0055f.f595a;
                    int i4 = c0055f.f597c;
                    int i5 = c0055f.f598d;
                    View view = c0055f.f599e;
                    C0052c c0052c = x.f666a;
                    view.setLeftTopRightBottom(i3, round, i4, i5);
                    c0055f.f600f = 0;
                    c0055f.f601g = 0;
                    break;
                }
                break;
            default:
                c0055f.getClass();
                c0055f.f597c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                c0055f.f598d = round2;
                int i6 = c0055f.f601g + 1;
                c0055f.f601g = i6;
                if (c0055f.f600f == i6) {
                    int i7 = c0055f.f595a;
                    int i8 = c0055f.f596b;
                    int i9 = c0055f.f597c;
                    View view2 = c0055f.f599e;
                    C0052c c0052c2 = x.f666a;
                    view2.setLeftTopRightBottom(i7, i8, i9, round2);
                    c0055f.f600f = 0;
                    c0055f.f601g = 0;
                    break;
                }
                break;
        }
    }

    public final void c(View view, PointF pointF) {
        switch (this.f592a) {
            case 2:
                int left = view.getLeft();
                int top = view.getTop();
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                C0052c c0052c = x.f666a;
                view.setLeftTopRightBottom(left, top, round, round2);
                break;
            case 3:
                int round3 = Math.round(pointF.x);
                int round4 = Math.round(pointF.y);
                int right = view.getRight();
                int bottom = view.getBottom();
                C0052c c0052c2 = x.f666a;
                view.setLeftTopRightBottom(round3, round4, right, bottom);
                break;
            default:
                int round5 = Math.round(pointF.x);
                int round6 = Math.round(pointF.y);
                int width = view.getWidth() + round5;
                int height = view.getHeight() + round6;
                C0052c c0052c3 = x.f666a;
                view.setLeftTopRightBottom(round5, round6, width, height);
                break;
        }
    }

    public final void d(View view, Float f2) {
        switch (this.f592a) {
            case 5:
                float floatValue = f2.floatValue();
                C0052c c0052c = x.f666a;
                view.setTransitionAlpha(floatValue);
                break;
            case 6:
            default:
                WeakHashMap weakHashMap = O.f58a;
                AbstractC0024z.k(view, AbstractC0024z.f(view), view.getPaddingTop(), f2.intValue(), view.getPaddingBottom());
                break;
            case 7:
                view.getLayoutParams().width = f2.intValue();
                view.requestLayout();
                break;
            case 8:
                view.getLayoutParams().height = f2.intValue();
                view.requestLayout();
                break;
            case 9:
                int intValue = f2.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = O.f58a;
                AbstractC0024z.k(view, intValue, paddingTop, AbstractC0024z.e(view), view.getPaddingBottom());
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f592a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                WeakHashMap weakHashMap = O.f58a;
                break;
        }
        return a((View) obj);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f592a) {
            case 0:
                b((C0055f) obj, (PointF) obj2);
                break;
            case 1:
                b((C0055f) obj, (PointF) obj2);
                break;
            case 2:
                c((View) obj, (PointF) obj2);
                break;
            case 3:
                c((View) obj, (PointF) obj2);
                break;
            case 4:
                c((View) obj, (PointF) obj2);
                break;
            case 5:
                d((View) obj, (Float) obj2);
                break;
            case 6:
                WeakHashMap weakHashMap = O.f58a;
                F.A.c((View) obj, (Rect) obj2);
                break;
            case 7:
                d((View) obj, (Float) obj2);
                break;
            case 8:
                d((View) obj, (Float) obj2);
                break;
            case 9:
                d((View) obj, (Float) obj2);
                break;
            default:
                d((View) obj, (Float) obj2);
                break;
        }
    }
}
