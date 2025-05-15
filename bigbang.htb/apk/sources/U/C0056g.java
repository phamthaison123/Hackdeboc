package U;

import F.O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: U.g, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0056g extends q {

    /* renamed from: A, reason: collision with root package name */
    public static final C0052c f602A;

    /* renamed from: B, reason: collision with root package name */
    public static final C0052c f603B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0052c f604C;

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f605x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y, reason: collision with root package name */
    public static final C0052c f606y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0052c f607z;

    static {
        new C0051b(PointF.class, "boundsOrigin").f591a = new Rect();
        f606y = new C0052c(PointF.class, "topLeft", 0);
        f607z = new C0052c(PointF.class, "bottomRight", 1);
        f602A = new C0052c(PointF.class, "bottomRight", 2);
        f603B = new C0052c(PointF.class, "topLeft", 3);
        f604C = new C0052c(PointF.class, "position", 4);
    }

    public static void H(w wVar) {
        View view = wVar.f664b;
        WeakHashMap weakHashMap = O.f58a;
        if (!F.B.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = wVar.f663a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", wVar.f664b.getParent());
    }

    @Override // U.q
    public final void d(w wVar) {
        H(wVar);
    }

    @Override // U.q
    public final void g(w wVar) {
        H(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // U.q
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        int i2;
        C0056g c0056g;
        ObjectAnimator ofObject;
        if (wVar == null || wVar2 == null) {
            return null;
        }
        HashMap hashMap = wVar.f663a;
        HashMap hashMap2 = wVar2.f663a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        View view = wVar2.f664b;
        C0052c c0052c = x.f666a;
        view.setLeftTopRightBottom(i3, i5, i7, i9);
        if (i2 != 2) {
            c0056g = this;
            if (i3 == i4 && i5 == i6) {
                c0056g.f651t.getClass();
                ofObject = ObjectAnimator.ofObject(view, f602A, (TypeConverter) null, m0.e.c(i7, i9, i8, i10));
            } else {
                c0056g.f651t.getClass();
                ofObject = ObjectAnimator.ofObject(view, f603B, (TypeConverter) null, m0.e.c(i3, i5, i4, i6));
            }
        } else if (i11 == i13 && i12 == i14) {
            c0056g = this;
            c0056g.f651t.getClass();
            ofObject = ObjectAnimator.ofObject(view, f604C, (TypeConverter) null, m0.e.c(i3, i5, i4, i6));
        } else {
            c0056g = this;
            C0055f c0055f = new C0055f();
            c0055f.f599e = view;
            c0056g.f651t.getClass();
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(c0055f, f606y, (TypeConverter) null, m0.e.c(i3, i5, i4, i6));
            c0056g.f651t.getClass();
            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(c0055f, f607z, (TypeConverter) null, m0.e.c(i7, i9, i8, i10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject2, ofObject3);
            animatorSet.addListener(new C0053d(c0055f));
            ofObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            viewGroup4.suppressLayout(true);
            c0056g.a(new C0054e(viewGroup4));
        }
        return ofObject;
    }

    @Override // U.q
    public final String[] p() {
        return f605x;
    }
}
