package i;

import android.database.DataSetObserver;

/* renamed from: i.q0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0166q0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2881b;

    public /* synthetic */ C0166q0(int i2, Object obj) {
        this.f2880a = i2;
        this.f2881b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i2 = this.f2880a;
        Object obj = this.f2881b;
        switch (i2) {
            case 0:
                C0171t0 c0171t0 = (C0171t0) obj;
                if (c0171t0.f2922y.isShowing()) {
                    c0171t0.i();
                    break;
                }
                break;
            default:
                J.b bVar = (J.b) obj;
                bVar.f164a = true;
                bVar.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i2 = this.f2880a;
        Object obj = this.f2881b;
        switch (i2) {
            case 0:
                ((C0171t0) obj).dismiss();
                break;
            default:
                J.b bVar = (J.b) obj;
                bVar.f164a = false;
                bVar.notifyDataSetInvalidated();
                break;
        }
    }
}
