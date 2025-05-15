package o0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3378b;

    public j(l lVar, AutoCompleteTextView autoCompleteTextView) {
        this.f3378b = lVar;
        this.f3377a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            l lVar = this.f3378b;
            lVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - lVar.f3387l;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                lVar.f3385j = false;
            }
            l.d(lVar, this.f3377a);
        }
        return false;
    }
}
