package i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: i.h0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0148h0 extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f2794a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2795b;

    public final void a(Canvas canvas) {
        this.f2794a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void jumpToCurrentState() {
        this.f2794a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onBoundsChange(Rect rect) {
        this.f2794a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void setAlpha(int i2) {
        this.f2794a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f2795b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void setAutoMirrored(boolean z2) {
        this.f2794a.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setChangingConfigurations(int i2) {
        this.f2794a.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2794a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f2794a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f2794a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2794a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2794a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f2794a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f2794a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f2794a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f2794a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f2794a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f2794a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setDither(boolean z2) {
        this.f2794a.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setFilterBitmap(boolean z2) {
        this.f2794a.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f2794a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f2794a.isStateful();
    }

    public final void j(float f2, float f3) {
        this.f2794a.setHotspot(f2, f3);
    }

    public final void k(int i2, int i3, int i4, int i5) {
        this.f2794a.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void setTint(int i2) {
        this.f2794a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void setTintList(ColorStateList colorStateList) {
        this.f2794a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f2794a.setTintMode(mode);
    }

    public final boolean o(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f2794a.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        return this.f2794a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        if (this.f2795b) {
            j(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        if (this.f2795b) {
            k(i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f2795b) {
            return this.f2794a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        if (this.f2795b) {
            return o(z2, z3);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
