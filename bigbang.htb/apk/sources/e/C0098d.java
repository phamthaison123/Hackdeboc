package e;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import i.P;
import i.T;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0098d implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2083c;

    public /* synthetic */ C0098d(int i2, Object obj, Object obj2) {
        this.f2081a = i2;
        this.f2083c = obj;
        this.f2082b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        int i3 = this.f2081a;
        Object obj = this.f2083c;
        switch (i3) {
            case 0:
                C0099e c0099e = (C0099e) obj;
                DialogInterface.OnClickListener onClickListener = c0099e.f2091h;
                h hVar = (h) this.f2082b;
                onClickListener.onClick(hVar.f2096b, i2);
                if (!c0099e.f2092i) {
                    hVar.f2096b.dismiss();
                    break;
                }
                break;
            default:
                P p2 = (P) obj;
                p2.f2678D.setSelection(i2);
                T t2 = p2.f2678D;
                if (t2.getOnItemClickListener() != null) {
                    t2.performItemClick(view, i2, p2.f2675A.getItemId(i2));
                }
                p2.dismiss();
                break;
        }
    }
}
