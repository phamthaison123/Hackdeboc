package androidx.activity;

import a.InterfaceC0059b;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import e.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class e implements InterfaceC0059b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f766b;

    public /* synthetic */ e(ComponentActivity componentActivity, int i2) {
        this.f765a = i2;
        this.f766b = componentActivity;
    }

    @Override // a.InterfaceC0059b
    public final void a() {
        int i2 = this.f765a;
        ComponentActivity componentActivity = this.f766b;
        switch (i2) {
            case 0:
                Bundle a2 = componentActivity.f741d.f1620b.a("android:support:activity-result");
                if (a2 != null) {
                    c cVar = componentActivity.f744g;
                    cVar.getClass();
                    ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        cVar.f759e = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        cVar.f755a = (Random) a2.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        Bundle bundle = a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = cVar.f762h;
                        bundle2.putAll(bundle);
                        for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                            String str = stringArrayList.get(i3);
                            HashMap hashMap = cVar.f757c;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = cVar.f756b;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i3);
                            num2.intValue();
                            String str2 = stringArrayList.get(i3);
                            hashMap2.put(num2, str2);
                            hashMap.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                AppCompatActivity appCompatActivity = (AppCompatActivity) componentActivity;
                k j2 = appCompatActivity.j();
                j2.b();
                appCompatActivity.f741d.f1620b.a("androidx:appcompat");
                j2.c();
                break;
        }
    }
}
