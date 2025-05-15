package i;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import e.C0099e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class M implements S, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public e.i f2655a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2656b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f2658d;

    public M(T t2) {
        this.f2658d = t2;
    }

    @Override // i.S
    public final boolean a() {
        e.i iVar = this.f2655a;
        if (iVar != null) {
            return iVar.isShowing();
        }
        return false;
    }

    @Override // i.S
    public final CharSequence b() {
        return this.f2657c;
    }

    @Override // i.S
    public final void c(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // i.S
    public final int d() {
        return 0;
    }

    @Override // i.S
    public final void dismiss() {
        e.i iVar = this.f2655a;
        if (iVar != null) {
            iVar.dismiss();
            this.f2655a = null;
        }
    }

    @Override // i.S
    public final void e(int i2, int i3) {
        if (this.f2656b == null) {
            return;
        }
        T t2 = this.f2658d;
        S.N n2 = new S.N(t2.getPopupContext());
        CharSequence charSequence = this.f2657c;
        Object obj = n2.f277b;
        if (charSequence != null) {
            ((C0099e) obj).f2087d = charSequence;
        }
        ListAdapter listAdapter = this.f2656b;
        int selectedItemPosition = t2.getSelectedItemPosition();
        C0099e c0099e = (C0099e) obj;
        c0099e.f2090g = listAdapter;
        c0099e.f2091h = this;
        c0099e.f2093j = selectedItemPosition;
        c0099e.f2092i = true;
        e.i a2 = n2.a();
        this.f2655a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2121c.f2099e;
        alertController$RecycleListView.setTextDirection(i2);
        alertController$RecycleListView.setTextAlignment(i3);
        this.f2655a.show();
    }

    @Override // i.S
    public final void g(CharSequence charSequence) {
        this.f2657c = charSequence;
    }

    @Override // i.S
    public final int j() {
        return 0;
    }

    @Override // i.S
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // i.S
    public final void l(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // i.S
    public final Drawable n() {
        return null;
    }

    @Override // i.S
    public final void o(ListAdapter listAdapter) {
        this.f2656b = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        T t2 = this.f2658d;
        t2.setSelection(i2);
        if (t2.getOnItemClickListener() != null) {
            t2.performItemClick(null, i2, this.f2656b.getItemId(i2));
        }
        dismiss();
    }

    @Override // i.S
    public final void p(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
