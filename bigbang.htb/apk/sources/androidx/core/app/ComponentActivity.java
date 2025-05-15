package androidx.core.app;

import F.InterfaceC0009j;
import F.O;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.A;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ComponentActivity extends Activity implements o, InterfaceC0009j {

    /* renamed from: a, reason: collision with root package name */
    public final q f1029a = new q(this);

    public final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public q d() {
        return this.f1029a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            WeakHashMap weakHashMap = O.f58a;
        }
        return c(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            WeakHashMap weakHashMap = O.f58a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public void e() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        q qVar = this.f1029a;
        qVar.f("markState");
        j jVar = j.f1463c;
        qVar.f("setCurrentState");
        qVar.h(jVar);
        super.onSaveInstanceState(bundle);
    }
}
