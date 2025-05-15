package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.A;
import b.C0090a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Random f755a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f756b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f757c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f758d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f759e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final transient HashMap f760f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f761g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f762h = new Bundle();

    public final boolean a(int i2, int i3, Intent intent) {
        androidx.activity.result.c cVar;
        String str = (String) this.f756b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f759e.remove(str);
        androidx.activity.result.e eVar = (androidx.activity.result.e) this.f760f.get(str);
        if (eVar == null || (cVar = eVar.f777a) == null) {
            this.f761g.remove(str);
            this.f762h.putParcelable(str, new androidx.activity.result.b(intent, i3));
        } else {
            ((A) cVar).b(eVar.f778b.d0(intent, i3));
        }
        return true;
    }

    public final androidx.activity.result.d b(String str, C0090a c0090a, A a2) {
        int i2;
        HashMap hashMap;
        HashMap hashMap2 = this.f757c;
        if (((Integer) hashMap2.get(str)) == null) {
            int nextInt = this.f755a.nextInt(2147418112);
            while (true) {
                i2 = nextInt + 65536;
                hashMap = this.f756b;
                if (!hashMap.containsKey(Integer.valueOf(i2))) {
                    break;
                }
                nextInt = this.f755a.nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(i2), str);
            hashMap2.put(str, Integer.valueOf(i2));
        }
        this.f760f.put(str, new androidx.activity.result.e(a2, c0090a));
        HashMap hashMap3 = this.f761g;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            a2.b(obj);
        }
        Bundle bundle = this.f762h;
        androidx.activity.result.b bVar = (androidx.activity.result.b) bundle.getParcelable(str);
        if (bVar != null) {
            bundle.remove(str);
            a2.b(c0090a.d0(bVar.f774b, bVar.f773a));
        }
        return new androidx.activity.result.d(this, str);
    }
}
