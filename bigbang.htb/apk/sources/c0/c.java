package c0;

import F.AbstractC0024z;
import F.O;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import m0.g;
import m0.h;
import m0.l;
import m0.w;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f1638a;

    /* renamed from: b, reason: collision with root package name */
    public l f1639b;

    /* renamed from: c, reason: collision with root package name */
    public int f1640c;

    /* renamed from: d, reason: collision with root package name */
    public int f1641d;

    /* renamed from: e, reason: collision with root package name */
    public int f1642e;

    /* renamed from: f, reason: collision with root package name */
    public int f1643f;

    /* renamed from: g, reason: collision with root package name */
    public int f1644g;

    /* renamed from: h, reason: collision with root package name */
    public int f1645h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f1646i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1647j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1648k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1649l;

    /* renamed from: m, reason: collision with root package name */
    public h f1650m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1651n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1652o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1653p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1654q;

    /* renamed from: r, reason: collision with root package name */
    public RippleDrawable f1655r;

    /* renamed from: s, reason: collision with root package name */
    public int f1656s;

    public c(MaterialButton materialButton, l lVar) {
        this.f1638a = materialButton;
        this.f1639b = lVar;
    }

    public final w a() {
        RippleDrawable rippleDrawable = this.f1655r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f1655r.getNumberOfLayers() > 2 ? (w) this.f1655r.getDrawable(2) : (w) this.f1655r.getDrawable(1);
    }

    public final h b(boolean z2) {
        RippleDrawable rippleDrawable = this.f1655r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.f1655r.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(l lVar) {
        this.f1639b = lVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(lVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(lVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(lVar);
        }
    }

    public final void d(int i2, int i3) {
        WeakHashMap weakHashMap = O.f58a;
        MaterialButton materialButton = this.f1638a;
        int f2 = AbstractC0024z.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e2 = AbstractC0024z.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f1642e;
        int i5 = this.f1643f;
        this.f1643f = i3;
        this.f1642e = i2;
        if (!this.f1652o) {
            e();
        }
        AbstractC0024z.k(materialButton, f2, (paddingTop + i2) - i4, e2, (paddingBottom + i3) - i5);
    }

    public final void e() {
        h hVar = new h(this.f1639b);
        MaterialButton materialButton = this.f1638a;
        hVar.i(materialButton.getContext());
        hVar.setTintList(this.f1647j);
        PorterDuff.Mode mode = this.f1646i;
        if (mode != null) {
            hVar.setTintMode(mode);
        }
        float f2 = this.f1645h;
        ColorStateList colorStateList = this.f1648k;
        hVar.f3094a.f3082k = f2;
        hVar.invalidateSelf();
        g gVar = hVar.f3094a;
        if (gVar.f3075d != colorStateList) {
            gVar.f3075d = colorStateList;
            hVar.onStateChange(hVar.getState());
        }
        h hVar2 = new h(this.f1639b);
        hVar2.setTint(0);
        float f3 = this.f1645h;
        int w2 = this.f1651n ? B.a.w(materialButton, 2130968802) : 0;
        hVar2.f3094a.f3082k = f3;
        hVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(w2);
        g gVar2 = hVar2.f3094a;
        if (gVar2.f3075d != valueOf) {
            gVar2.f3075d = valueOf;
            hVar2.onStateChange(hVar2.getState());
        }
        h hVar3 = new h(this.f1639b);
        this.f1650m = hVar3;
        hVar3.setTint(-1);
        ColorStateList colorStateList2 = this.f1649l;
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{hVar2, hVar}), this.f1640c, this.f1642e, this.f1641d, this.f1643f), this.f1650m);
        this.f1655r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        h b2 = b(false);
        if (b2 != null) {
            b2.j(this.f1656s);
        }
    }

    public final void f() {
        h b2 = b(false);
        h b3 = b(true);
        if (b2 != null) {
            float f2 = this.f1645h;
            ColorStateList colorStateList = this.f1648k;
            b2.f3094a.f3082k = f2;
            b2.invalidateSelf();
            g gVar = b2.f3094a;
            if (gVar.f3075d != colorStateList) {
                gVar.f3075d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.f1645h;
                int w2 = this.f1651n ? B.a.w(this.f1638a, 2130968802) : 0;
                b3.f3094a.f3082k = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(w2);
                g gVar2 = b3.f3094a;
                if (gVar2.f3075d != valueOf) {
                    gVar2.f3075d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
