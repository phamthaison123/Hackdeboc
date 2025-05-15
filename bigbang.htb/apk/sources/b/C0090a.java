package b;

import android.content.Intent;
import androidx.activity.result.b;
import java.util.HashMap;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0090a extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1622c;

    public /* synthetic */ C0090a(int i2) {
        this.f1622c = i2;
    }

    @Override // B.a
    public final Object d0(Intent intent, int i2) {
        int i3 = this.f1622c;
        switch (i3) {
            case 0:
                if (i2 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        HashMap hashMap = new HashMap();
                        int length = stringArrayExtra.length;
                        for (int i4 = 0; i4 < length; i4++) {
                            hashMap.put(stringArrayExtra[i4], Boolean.valueOf(intArrayExtra[i4] == 0));
                        }
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 1:
                switch (i3) {
                }
            default:
                switch (i3) {
                }
        }
        return new b(intent, i2);
    }
}
