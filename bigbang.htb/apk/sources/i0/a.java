package i0;

import android.R;
import android.content.res.ColorStateList;
import i.C0131H;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends C0131H {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f2962g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2963e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2964f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2963e == null) {
            int w2 = B.a.w(this, 2130968773);
            int w3 = B.a.w(this, 2130968787);
            int w4 = B.a.w(this, 2130968802);
            this.f2963e = new ColorStateList(f2962g, new int[]{B.a.K(w4, w2, 1.0f), B.a.K(w4, w3, 0.54f), B.a.K(w4, w3, 0.38f), B.a.K(w4, w3, 0.38f)});
        }
        return this.f2963e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2964f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f2964f = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
