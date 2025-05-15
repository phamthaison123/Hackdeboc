package e;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f2094a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == -3 || i2 == -2 || i2 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2094a.get(), message.what);
        } else {
            if (i2 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
