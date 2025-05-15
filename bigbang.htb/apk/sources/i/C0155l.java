package i;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: i.l, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0155l extends C0127D implements InterfaceC0159n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0157m f2818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155l(C0157m c0157m, Context context) {
        super(context, null, 2130968607);
        this.f2818d = c0157m;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new C0153k(this, this, c0157m, 0));
    }

    @Override // i.InterfaceC0159n
    public final boolean a() {
        return false;
    }

    @Override // i.InterfaceC0159n
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2818d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
