package androidx.activity;

import a.C0058a;
import a.InterfaceC0059b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.A;
import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements E, androidx.savedstate.e, i, androidx.activity.result.f {

    /* renamed from: b, reason: collision with root package name */
    public final C0058a f739b = new C0058a();

    /* renamed from: c, reason: collision with root package name */
    public final q f740c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.savedstate.d f741d;

    /* renamed from: e, reason: collision with root package name */
    public D f742e;

    /* renamed from: f, reason: collision with root package name */
    public final h f743f;

    /* renamed from: g, reason: collision with root package name */
    public final c f744g;

    public ComponentActivity() {
        q qVar = new q(this);
        this.f740c = qVar;
        androidx.savedstate.d dVar = new androidx.savedstate.d(this);
        this.f741d = dVar;
        int i2 = 0;
        this.f743f = new h(new b(i2, this));
        new AtomicInteger();
        this.f744g = new c();
        qVar.a(new m() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.m
            public final void b(o oVar, androidx.lifecycle.i iVar) {
                if (iVar == androidx.lifecycle.i.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        qVar.a(new m() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.m
            public final void b(o oVar, androidx.lifecycle.i iVar) {
                if (iVar == androidx.lifecycle.i.ON_DESTROY) {
                    ComponentActivity.this.f739b.f733b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.b().a();
                }
            }
        });
        qVar.a(new m() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.m
            public final void b(o oVar, androidx.lifecycle.i iVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f742e == null) {
                    f fVar = (f) componentActivity.getLastNonConfigurationInstance();
                    if (fVar != null) {
                        componentActivity.f742e = fVar.f767a;
                    }
                    if (componentActivity.f742e == null) {
                        componentActivity.f742e = new D();
                    }
                }
                componentActivity.f740c.d(this);
            }
        });
        dVar.f1620b.b("android:support:activity-result", new d(this, i2));
        g(new e(this, i2));
    }

    @Override // androidx.savedstate.e
    public final androidx.savedstate.c a() {
        return this.f741d.f1620b;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.E
    public final D b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f742e == null) {
            f fVar = (f) getLastNonConfigurationInstance();
            if (fVar != null) {
                this.f742e = fVar.f767a;
            }
            if (this.f742e == null) {
                this.f742e = new D();
            }
        }
        return this.f742e;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.o
    public final q d() {
        return this.f740c;
    }

    public final void g(InterfaceC0059b interfaceC0059b) {
        C0058a c0058a = this.f739b;
        if (c0058a.f733b != null) {
            interfaceC0059b.a();
        }
        c0058a.f732a.add(interfaceC0059b);
    }

    public final void h() {
        getWindow().getDecorView().setTag(2131296686, this);
        getWindow().getDecorView().setTag(2131296688, this);
        getWindow().getDecorView().setTag(2131296687, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f744g.a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.f743f.b();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f741d.a(bundle);
        C0058a c0058a = this.f739b;
        c0058a.f733b = this;
        Iterator it = c0058a.f732a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0059b) it.next()).a();
        }
        super.onCreate(bundle);
        A.b(this);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.f744g.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        f fVar;
        D d2 = this.f742e;
        if (d2 == null && (fVar = (f) getLastNonConfigurationInstance()) != null) {
            d2 = fVar.f767a;
        }
        if (d2 == null) {
            return null;
        }
        f fVar2 = new f();
        fVar2.f767a = d2;
        return fVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        q qVar = this.f740c;
        if (qVar instanceof q) {
            j jVar = j.f1463c;
            qVar.f("setCurrentState");
            qVar.h(jVar);
        }
        super.onSaveInstanceState(bundle);
        this.f741d.b(bundle);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (B.a.J()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        h();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        h();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        super.setContentView(view, layoutParams);
    }
}
