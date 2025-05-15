package i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class K extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final L f2647a;

    public K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969341);
        Q0.a(this, getContext());
        L l2 = new L(this);
        this.f2647a = l2;
        l2.a(attributeSet, 2130969341);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L l2 = this.f2647a;
        Drawable drawable = l2.f2649e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = l2.f2648d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2647a.f2649e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2647a.d(canvas);
    }
}
