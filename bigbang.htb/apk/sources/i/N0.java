package i;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class N0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f2662a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2663b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2664c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2665d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2666e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2667f;

    public N0(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f2666e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f2663b = rect3;
        Rect rect4 = new Rect();
        this.f2665d = rect4;
        Rect rect5 = new Rect();
        this.f2664c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f2662a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f2667f;
                if (z3 && !this.f2665d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f2667f;
                    this.f2667f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else {
            if (this.f2663b.contains(x2, y2)) {
                this.f2667f = true;
                z2 = true;
            }
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        Rect rect = this.f2664c;
        View view = this.f2662a;
        if (!z2 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
