package androidx.fragment.app;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1239a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1242d;

    public P(C0067h c0067h, ArrayList arrayList, c0 c0Var) {
        this.f1242d = c0067h;
        this.f1240b = arrayList;
        this.f1241c = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f1239a;
        Object obj = this.f1242d;
        Object obj2 = this.f1241c;
        Object obj3 = this.f1240b;
        switch (i2) {
            case 0:
                ((A) obj3).c((AbstractComponentCallbacksC0075p) obj2, (B.c) obj);
                break;
            case 1:
                ((A) obj3).c((AbstractComponentCallbacksC0075p) obj2, (B.c) obj);
                break;
            default:
                List list = (List) obj3;
                c0 c0Var = (c0) obj2;
                if (list.contains(c0Var)) {
                    list.remove(c0Var);
                    ((C0067h) obj).getClass();
                    F.Q.a(c0Var.f1307a, c0Var.f1309c.f1374E);
                    break;
                }
                break;
        }
    }
}
