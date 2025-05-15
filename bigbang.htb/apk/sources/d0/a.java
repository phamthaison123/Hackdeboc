package d0;

import android.R;
import android.content.res.ColorStateList;
import i.C0170t;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends C0170t {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f2032g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2033e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2034f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2033e == null) {
            int w2 = B.a.w(this, 2130968773);
            int w3 = B.a.w(this, 2130968802);
            int w4 = B.a.w(this, 2130968787);
            this.f2033e = new ColorStateList(f2032g, new int[]{B.a.K(w3, w2, 1.0f), B.a.K(w3, w4, 0.54f), B.a.K(w3, w4, 0.38f), B.a.K(w3, w4, 0.38f)});
        }
        return this.f2033e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2034f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f2034f = z2;
        if (z2) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
