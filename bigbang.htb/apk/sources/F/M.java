package F;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class M implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0016q f57a;

    public M(InterfaceC0016q interfaceC0016q) {
        this.f57a = interfaceC0016q;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0007h c0007h = new C0007h(new e.z(contentInfo));
        C0007h a2 = ((I.i) this.f57a).a(view, c0007h);
        if (a2 == null) {
            return null;
        }
        return a2 == c0007h ? contentInfo : a2.f95a.p();
    }
}
