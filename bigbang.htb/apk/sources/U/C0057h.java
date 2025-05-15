package U;

import android.view.View;
import java.util.ArrayList;
import l.C0190b;

/* renamed from: U.h, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0057h extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f610c;

    public C0057h(int i2, Object obj, Object obj2) {
        this.f608a = i2;
        this.f610c = obj;
        this.f609b = obj2;
    }

    @Override // U.p
    public final void c(q qVar) {
        int i2 = this.f608a;
        Object obj = this.f609b;
        switch (i2) {
            case 0:
                C0052c c0052c = x.f666a;
                ((View) obj).setTransitionAlpha(1.0f);
                qVar.v(this);
                break;
            case 1:
                ((ArrayList) ((C0190b) obj).getOrDefault(((s) this.f610c).f653b, null)).remove(qVar);
                qVar.v(this);
                break;
            default:
                ((q) obj).y();
                qVar.v(this);
                break;
        }
    }
}
