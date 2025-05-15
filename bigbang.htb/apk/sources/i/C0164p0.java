package i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: i.p0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0164p0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2875b;

    public /* synthetic */ C0164p0(int i2, Object obj) {
        this.f2874a = i2;
        this.f2875b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C0150i0 c0150i0;
        int i3 = this.f2874a;
        Object obj = this.f2875b;
        switch (i3) {
            case 0:
                if (i2 != -1 && (c0150i0 = ((C0171t0) obj).f2900c) != null) {
                    c0150i0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).p(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
