package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: i.D, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0127D extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final r f2623a;

    /* renamed from: b, reason: collision with root package name */
    public final C0126C f2624b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0127D(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        R0.a(context);
        this.f2625c = false;
        Q0.a(this, getContext());
        r rVar = new r(this);
        this.f2623a = rVar;
        rVar.e(attributeSet, i2);
        C0126C c0126c = new C0126C(this);
        this.f2624b = c0126c;
        c0126c.b(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2623a;
        if (rVar != null) {
            rVar.a();
        }
        C0126C c0126c = this.f2624b;
        if (c0126c != null) {
            c0126c.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2623a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2623a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        S0 s0;
        C0126C c0126c = this.f2624b;
        if (c0126c == null || (s0 = (S0) c0126c.f2620c) == null) {
            return null;
        }
        return (ColorStateList) s0.f2708c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        S0 s0;
        C0126C c0126c = this.f2624b;
        if (c0126c == null || (s0 = (S0) c0126c.f2620c) == null) {
            return null;
        }
        return (PorterDuff.Mode) s0.f2709d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f2624b.f2619b).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2623a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r rVar = this.f2623a;
        if (rVar != null) {
            rVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0126C c0126c = this.f2624b;
        if (c0126c != null) {
            c0126c.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0126C c0126c = this.f2624b;
        if (c0126c != null && drawable != null && !this.f2625c) {
            c0126c.f2618a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0126c != null) {
            c0126c.a();
            if (this.f2625c) {
                return;
            }
            ImageView imageView = (ImageView) c0126c.f2619b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0126c.f2618a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f2625c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0126C c0126c = this.f2624b;
        if (c0126c != null) {
            c0126c.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0126C c0126c = this.f2624b;
        if (c0126c != null) {
            c0126c.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2623a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2623a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0126C c0126c = this.f2624b;
        if (c0126c != null) {
            c0126c.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0126C c0126c = this.f2624b;
        if (c0126c != null) {
            c0126c.e(mode);
        }
    }
}
