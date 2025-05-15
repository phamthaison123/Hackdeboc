package U;

import F.Q;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public final View f664b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f663a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f665c = new ArrayList();

    public w(View view) {
        this.f664b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f664b == wVar.f664b && this.f663a.equals(wVar.f663a);
    }

    public final int hashCode() {
        return this.f663a.hashCode() + (this.f664b.hashCode() * 31);
    }

    public final String toString() {
        String d2 = Q.d(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f664b + "\n", "    values:");
        HashMap hashMap = this.f663a;
        for (String str : hashMap.keySet()) {
            d2 = d2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return d2;
    }
}
