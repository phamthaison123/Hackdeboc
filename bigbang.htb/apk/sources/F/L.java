package F;

import android.view.ContentInfo;
import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class L {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0007h b(View view, C0007h c0007h) {
        ContentInfo p2 = c0007h.f95a.p();
        ContentInfo performReceiveContent = view.performReceiveContent(p2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == p2 ? c0007h : new C0007h(new e.z(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0016q interfaceC0016q) {
        if (interfaceC0016q == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new M(interfaceC0016q));
        }
    }
}
