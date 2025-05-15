package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class S extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f1246b;

    public /* synthetic */ S(Rect rect, int i2) {
        this.f1245a = i2;
        this.f1246b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i2 = this.f1245a;
        Rect rect = this.f1246b;
        switch (i2) {
            case 0:
                break;
            default:
                if (rect == null || rect.isEmpty()) {
                }
                break;
        }
        return rect;
    }
}
