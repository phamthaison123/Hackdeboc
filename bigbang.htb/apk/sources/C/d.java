package C;

import i.C0182z;
import java.util.ArrayList;
import l.k;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d implements E.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16b;

    public /* synthetic */ d(int i2, Object obj) {
        this.f15a = i2;
        this.f16b = obj;
    }

    public final void a(e eVar) {
        switch (this.f15a) {
            case 0:
                if (eVar == null) {
                    eVar = new e(-3);
                }
                ((C0182z) this.f16b).t(eVar);
                return;
            default:
                synchronized (f.f21c) {
                    try {
                        k kVar = f.f22d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f16b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f16b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((d) ((E.a) arrayList.get(i2))).b(eVar);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f15a) {
            case 0:
                a((e) obj);
                break;
            default:
                a((e) obj);
                break;
        }
    }
}
