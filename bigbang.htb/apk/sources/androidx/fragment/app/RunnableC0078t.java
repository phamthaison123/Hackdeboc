package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0078t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1421b;

    public /* synthetic */ RunnableC0078t(int i2, Object obj) {
        this.f1420a = i2;
        this.f1421b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f1420a;
        Object obj = this.f1421b;
        switch (i2) {
            case 0:
                AnimationAnimationListenerC0063d animationAnimationListenerC0063d = (AnimationAnimationListenerC0063d) obj;
                Object obj2 = animationAnimationListenerC0063d.f1317c;
                C0073n c0073n = ((AbstractComponentCallbacksC0075p) obj2).f1377H;
                if ((c0073n == null ? null : c0073n.f1354a) != null) {
                    ((AbstractComponentCallbacksC0075p) obj2).f().f1354a = null;
                    ((A) animationAnimationListenerC0063d.f1318d).c((AbstractComponentCallbacksC0075p) animationAnimationListenerC0063d.f1317c, (B.c) animationAnimationListenerC0063d.f1319e);
                    break;
                }
                break;
            case 1:
                AnimationAnimationListenerC0063d animationAnimationListenerC0063d2 = (AnimationAnimationListenerC0063d) obj;
                animationAnimationListenerC0063d2.f1316b.endViewTransition((View) animationAnimationListenerC0063d2.f1317c);
                ((C0065f) animationAnimationListenerC0063d2.f1318d).b();
                break;
            case 2:
                DialogInterfaceOnCancelListenerC0071l dialogInterfaceOnCancelListenerC0071l = (DialogInterfaceOnCancelListenerC0071l) obj;
                dialogInterfaceOnCancelListenerC0071l.f1341V.onDismiss(dialogInterfaceOnCancelListenerC0071l.f1349d0);
                break;
            case 3:
                ((H) obj).x(true);
                break;
            default:
                Q.b((ArrayList) obj, 4);
                break;
        }
    }
}
