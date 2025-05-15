package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import q.d;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        d dVar = (d) getLayoutParams();
        dVar.f3526a = i2;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i2) {
        d dVar = (d) getLayoutParams();
        dVar.f3528b = i2;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f2) {
        d dVar = (d) getLayoutParams();
        dVar.f3530c = f2;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
