package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class DialogInterfaceOnCancelListenerC0071l extends AbstractComponentCallbacksC0075p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: S, reason: collision with root package name */
    public Handler f1338S;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1347b0;

    /* renamed from: d0, reason: collision with root package name */
    public Dialog f1349d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1350e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1351f0;

    /* renamed from: T, reason: collision with root package name */
    public final RunnableC0078t f1339T = new RunnableC0078t(2, this);

    /* renamed from: U, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0068i f1340U = new DialogInterfaceOnCancelListenerC0068i(this);

    /* renamed from: V, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0069j f1341V = new DialogInterfaceOnDismissListenerC0069j(this);

    /* renamed from: W, reason: collision with root package name */
    public int f1342W = 0;

    /* renamed from: X, reason: collision with root package name */
    public int f1343X = 0;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1344Y = true;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f1345Z = true;

    /* renamed from: a0, reason: collision with root package name */
    public int f1346a0 = -1;

    /* renamed from: c0, reason: collision with root package name */
    public final S.N f1348c0 = new S.N(0, this);

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1352g0 = false;

    public final void F(boolean z2, boolean z3) {
        if (this.f1351f0) {
            return;
        }
        this.f1351f0 = true;
        Dialog dialog = this.f1349d0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1349d0.dismiss();
            if (!z3) {
                if (Looper.myLooper() == this.f1338S.getLooper()) {
                    onDismiss(this.f1349d0);
                } else {
                    this.f1338S.post(this.f1339T);
                }
            }
        }
        this.f1350e0 = true;
        if (this.f1346a0 >= 0) {
            H j2 = j();
            int i2 = this.f1346a0;
            if (i2 >= 0) {
                j2.v(new G(j2, i2), false);
                this.f1346a0 = -1;
                return;
            } else {
                throw new IllegalArgumentException("Bad id: " + i2);
            }
        }
        C0060a c0060a = new C0060a(j());
        H h2 = this.f1404r;
        if (h2 != null && h2 != c0060a.f1280p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0060a.b(new O(3, this));
        if (z2) {
            c0060a.d(true);
        } else {
            c0060a.d(false);
        }
    }

    public Dialog G() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(B(), this.f1343X);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final B.a c() {
        return new C0070k(this, new C0072m(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1350e0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        F(true, true);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void p(Context context) {
        super.p(context);
        this.f1384O.d(this.f1348c0);
        this.f1351f0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public void q(Bundle bundle) {
        super.q(bundle);
        this.f1338S = new Handler();
        this.f1345Z = this.f1409w == 0;
        if (bundle != null) {
            this.f1342W = bundle.getInt("android:style", 0);
            this.f1343X = bundle.getInt("android:theme", 0);
            this.f1344Y = bundle.getBoolean("android:cancelable", true);
            this.f1345Z = bundle.getBoolean("android:showsDialog", this.f1345Z);
            this.f1346a0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void s() {
        this.f1372C = true;
        Dialog dialog = this.f1349d0;
        if (dialog != null) {
            this.f1350e0 = true;
            dialog.setOnDismissListener(null);
            this.f1349d0.dismiss();
            if (!this.f1351f0) {
                onDismiss(this.f1349d0);
            }
            this.f1349d0 = null;
            this.f1352g0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void t() {
        this.f1372C = true;
        if (!this.f1351f0) {
            this.f1351f0 = true;
        }
        S.N n2 = this.f1348c0;
        androidx.lifecycle.u uVar = this.f1384O;
        uVar.getClass();
        androidx.lifecycle.u.a("removeObserver");
        androidx.lifecycle.t tVar = (androidx.lifecycle.t) uVar.f1486b.b(n2);
        if (tVar == null) {
            return;
        }
        tVar.d();
        tVar.c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater u(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.u(r8)
            boolean r0 = r7.f1345Z
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L9a
            boolean r3 = r7.f1347b0
            if (r3 == 0) goto L11
            goto L9a
        L11:
            if (r0 != 0) goto L14
            goto L71
        L14:
            boolean r0 = r7.f1352g0
            if (r0 != 0) goto L71
            r0 = 0
            r3 = 1
            r7.f1347b0 = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.G()     // Catch: java.lang.Throwable -> L4e
            r7.f1349d0 = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f1345Z     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.f1342W     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3b
            if (r5 == r1) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r4 = r7.h()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.f1349d0     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r4 = r7.f1349d0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f1344Y     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f1349d0     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.i r5 = r7.f1340U     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f1349d0     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.j r5 = r7.f1341V     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.f1352g0 = r3     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r3 = 0
            r7.f1349d0 = r3     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.f1347b0 = r0
            goto L71
        L6e:
            r7.f1347b0 = r0
            throw r8
        L71:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " from dialog context"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L8d:
            android.app.Dialog r7 = r7.f1349d0
            if (r7 == 0) goto L99
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r7)
        L99:
            return r8
        L9a:
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r7 = r7.f1345Z
            if (r7 != 0) goto Lc4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "mShowsDialog = false: "
            r7.<init>(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r2, r7)
            goto Ld5
        Lc4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "mCreatingDialog = true: "
            r7.<init>(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r2, r7)
        Ld5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC0071l.u(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public void v(Bundle bundle) {
        Dialog dialog = this.f1349d0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.f1342W;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f1343X;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z2 = this.f1344Y;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1345Z;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.f1346a0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public void w() {
        this.f1372C = true;
        Dialog dialog = this.f1349d0;
        if (dialog != null) {
            this.f1350e0 = false;
            dialog.show();
            View decorView = this.f1349d0.getWindow().getDecorView();
            decorView.setTag(2131296686, this);
            decorView.setTag(2131296688, this);
            decorView.setTag(2131296687, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public void x() {
        this.f1372C = true;
        Dialog dialog = this.f1349d0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void y(Bundle bundle) {
        Bundle bundle2;
        this.f1372C = true;
        if (this.f1349d0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1349d0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0075p
    public final void z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.z(layoutInflater, viewGroup, bundle);
        if (this.f1374E != null || this.f1349d0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1349d0.onRestoreInstanceState(bundle2);
    }
}
