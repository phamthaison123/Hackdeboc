package e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class r extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f2137a;

    public r(s sVar) {
        this.f2137a = sVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2137a.f();
    }
}
