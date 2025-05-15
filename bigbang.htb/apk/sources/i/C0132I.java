package i;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: i.I, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0132I extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0130G f2646a;

    public C0132I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969322);
        Q0.a(this, getContext());
        C0130G c0130g = new C0130G(this);
        this.f2646a = c0130g;
        c0130g.a(attributeSet, 2130969322);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = this.f2646a.f2638b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
