package e;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class q extends s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2134c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f2135d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, Context context) {
        super(vVar);
        this.f2135d = vVar;
        this.f2136e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // e.s
    public final IntentFilter c() {
        switch (this.f2134c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // e.s
    public final int d() {
        long j2;
        boolean z2;
        int i2 = this.f2134c;
        Object obj = this.f2136e;
        switch (i2) {
            case 0:
                if (!((PowerManager) obj).isPowerSaveMode()) {
                    break;
                }
                break;
            default:
                C0097c c0097c = (C0097c) obj;
                C0094B c0094b = (C0094B) c0097c.f2080c;
                if (c0094b.f2040b <= System.currentTimeMillis()) {
                    Context context = (Context) c0097c.f2078a;
                    Location l2 = B.a.p(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c0097c.l("network") : null;
                    Location l3 = B.a.p(context, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c0097c.l("gps") : null;
                    if (l3 == null || l2 == null ? l3 != null : l3.getTime() > l2.getTime()) {
                        l2 = l3;
                    }
                    if (l2 == null) {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i3 = Calendar.getInstance().get(11);
                        if (i3 < 6 || i3 >= 22) {
                        }
                        break;
                    } else {
                        C0094B c0094b2 = (C0094B) c0097c.f2080c;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0093A.f2035d == null) {
                            C0093A.f2035d = new C0093A();
                        }
                        C0093A c0093a = C0093A.f2035d;
                        c0093a.a(currentTimeMillis - 86400000, l2.getLatitude(), l2.getLongitude());
                        c0093a.a(currentTimeMillis, l2.getLatitude(), l2.getLongitude());
                        boolean z3 = c0093a.f2038c == 1;
                        long j3 = c0093a.f2037b;
                        long j4 = c0093a.f2036a;
                        double latitude = l2.getLatitude();
                        double longitude = l2.getLongitude();
                        boolean z4 = z3;
                        c0093a.a(86400000 + currentTimeMillis, latitude, longitude);
                        long j5 = c0093a.f2037b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0094b2.f2039a = z4;
                        c0094b2.f2040b = j2;
                        z2 = c0094b.f2039a;
                    }
                } else {
                    z2 = c0094b.f2039a;
                }
                if (z2) {
                }
                break;
        }
        return 1;
    }

    @Override // e.s
    public final void f() {
        int i2 = this.f2134c;
        v vVar = this.f2135d;
        switch (i2) {
            case 0:
                vVar.j(true);
                break;
            default:
                vVar.j(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, C0097c c0097c) {
        super(vVar);
        this.f2135d = vVar;
        this.f2136e = c0097c;
    }
}
