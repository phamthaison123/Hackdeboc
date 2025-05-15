package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import u.InterfaceC0224b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class FragmentActivity extends ComponentActivity implements InterfaceC0224b {

    /* renamed from: j, reason: collision with root package name */
    public boolean f1155j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1156k;

    /* renamed from: h, reason: collision with root package name */
    public final S.N f1153h = new S.N(2, new C0077s(this));

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.q f1154i = new androidx.lifecycle.q(this);

    /* renamed from: l, reason: collision with root package name */
    public boolean f1157l = true;

    public FragmentActivity() {
        this.f741d.f1620b.b("android:support:fragments", new C0076q(this));
        g(new r(this));
    }

    public static boolean i(H h2) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p : h2.f1172c.f()) {
            if (abstractComponentCallbacksC0075p != null) {
                C0077s c0077s = abstractComponentCallbacksC0075p.f1405s;
                if ((c0077s == null ? null : c0077s.f1419g) != null) {
                    z2 |= i(abstractComponentCallbacksC0075p.g());
                }
                Z z3 = abstractComponentCallbacksC0075p.f1383N;
                androidx.lifecycle.j jVar = androidx.lifecycle.j.f1464d;
                androidx.lifecycle.j jVar2 = androidx.lifecycle.j.f1463c;
                if (z3 != null) {
                    z3.e();
                    if (z3.f1263b.f1471c.compareTo(jVar) >= 0) {
                        androidx.lifecycle.q qVar = abstractComponentCallbacksC0075p.f1383N.f1263b;
                        qVar.f("setCurrentState");
                        qVar.h(jVar2);
                        z2 = true;
                    }
                }
                if (abstractComponentCallbacksC0075p.f1382M.f1471c.compareTo(jVar) >= 0) {
                    androidx.lifecycle.q qVar2 = abstractComponentCallbacksC0075p.f1382M;
                    qVar2.f("setCurrentState");
                    qVar2.h(jVar2);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1155j);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1156k);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1157l);
        if (getApplication() != null) {
            androidx.lifecycle.D b2 = b();
            String canonicalName = Q.a.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            Object obj = (androidx.lifecycle.C) b2.f1445a.get(concat);
            if (!Q.a.class.isInstance(obj)) {
                obj = new Q.a();
                androidx.lifecycle.C c2 = (androidx.lifecycle.C) b2.f1445a.put(concat, obj);
                if (c2 != null) {
                    c2.a();
                }
            }
            l.l lVar = ((Q.a) obj).f250b;
            if (lVar.f3053c > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (lVar.f3053c > 0) {
                    F.Q.i(lVar.f3052b[0]);
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(lVar.f3051a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0077s) this.f1153h.f277b).f1418f.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f1153h.e();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        S.N n2 = this.f1153h;
        n2.e();
        super.onConfigurationChanged(configuration);
        ((C0077s) n2.f277b).f1418f.h();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1154i.g(androidx.lifecycle.i.ON_CREATE);
        H h2 = ((C0077s) this.f1153h.f277b).f1418f;
        h2.f1161A = false;
        h2.f1162B = false;
        h2.f1168H.f1209g = false;
        h2.s(1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        return ((C0077s) this.f1153h.f277b).f1418f.j() | onCreatePanelMenu;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0077s) this.f1153h.f277b).f1418f.f1175f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C0077s) this.f1153h.f277b).f1418f.k();
        this.f1154i.g(androidx.lifecycle.i.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((C0077s) this.f1153h.f277b).f1418f.l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        S.N n2 = this.f1153h;
        if (i2 == 0) {
            return ((C0077s) n2.f277b).f1418f.n();
        }
        if (i2 != 6) {
            return false;
        }
        return ((C0077s) n2.f277b).f1418f.i();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        ((C0077s) this.f1153h.f277b).f1418f.m(z2);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.f1153h.e();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            ((C0077s) this.f1153h.f277b).f1418f.o();
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f1156k = false;
        ((C0077s) this.f1153h.f277b).f1418f.s(5);
        this.f1154i.g(androidx.lifecycle.i.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        ((C0077s) this.f1153h.f277b).f1418f.q(z2);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f1154i.g(androidx.lifecycle.i.ON_RESUME);
        H h2 = ((C0077s) this.f1153h.f277b).f1418f;
        h2.f1161A = false;
        h2.f1162B = false;
        h2.f1168H.f1209g = false;
        h2.s(7);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return super.onPreparePanel(i2, view, menu);
        }
        return ((C0077s) this.f1153h.f277b).f1418f.r() | super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1153h.e();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        S.N n2 = this.f1153h;
        n2.e();
        super.onResume();
        this.f1156k = true;
        ((C0077s) n2.f277b).f1418f.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        S.N n2 = this.f1153h;
        n2.e();
        super.onStart();
        this.f1157l = false;
        boolean z2 = this.f1155j;
        Object obj = n2.f277b;
        if (!z2) {
            this.f1155j = true;
            H h2 = ((C0077s) obj).f1418f;
            h2.f1161A = false;
            h2.f1162B = false;
            h2.f1168H.f1209g = false;
            h2.s(4);
        }
        ((C0077s) obj).f1418f.x(true);
        this.f1154i.g(androidx.lifecycle.i.ON_START);
        H h3 = ((C0077s) obj).f1418f;
        h3.f1161A = false;
        h3.f1162B = false;
        h3.f1168H.f1209g = false;
        h3.s(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1153h.e();
    }

    @Override // android.app.Activity
    public void onStop() {
        S.N n2;
        super.onStop();
        this.f1157l = true;
        do {
            n2 = this.f1153h;
        } while (i(((C0077s) n2.f277b).f1418f));
        H h2 = ((C0077s) n2.f277b).f1418f;
        h2.f1162B = true;
        h2.f1168H.f1209g = true;
        h2.s(4);
        this.f1154i.g(androidx.lifecycle.i.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0077s) this.f1153h.f277b).f1418f.f1175f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
