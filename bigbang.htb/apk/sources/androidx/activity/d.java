package androidx.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d implements androidx.savedstate.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f763a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f764b;

    public /* synthetic */ d(ComponentActivity componentActivity, int i2) {
        this.f763a = i2;
        this.f764b = componentActivity;
    }

    @Override // androidx.savedstate.b
    public final Bundle a() {
        int i2 = this.f763a;
        Object obj = this.f764b;
        switch (i2) {
            case 0:
                Bundle bundle = new Bundle();
                c cVar = ((ComponentActivity) obj).f744g;
                cVar.getClass();
                HashMap hashMap = cVar.f757c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(cVar.f759e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) cVar.f762h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", cVar.f755a);
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((AppCompatActivity) obj).j().getClass();
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle3;
        }
    }

    public d(androidx.savedstate.c cVar) {
        this.f763a = 2;
        this.f764b = new HashSet();
        cVar.b("androidx.savedstate.Restarter", this);
    }
}
