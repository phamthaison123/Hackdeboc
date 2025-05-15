package u;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class RunnableC0223a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3715a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3716b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3717c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3718d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RunnableC0223a(androidx.emoji2.text.g gVar, int i2) {
        this(Arrays.asList(gVar), i2, null);
        this.f3715a = 2;
        B.a.o(gVar, "initCallback cannot be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f3715a;
        int i3 = 0;
        Object obj = this.f3718d;
        int i4 = this.f3716b;
        Object obj2 = this.f3717c;
        switch (i2) {
            case 0:
                String[] strArr = (String[]) obj2;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i3 < length) {
                    iArr[i3] = packageManager.checkPermission(strArr[i3], packageName);
                    i3++;
                }
                ((InterfaceC0224b) activity).onRequestPermissionsResult(i4, strArr, iArr);
                break;
            case 1:
                B.a aVar = (B.a) ((z) obj2).f2221b;
                if (aVar != null) {
                    aVar.S(i4);
                    break;
                }
                break;
            case 2:
                List list = (List) obj2;
                int size = list.size();
                if (i4 == 1) {
                    while (i3 < size) {
                        ((androidx.emoji2.text.g) list.get(i3)).a();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((androidx.emoji2.text.g) list.get(i3)).getClass();
                        i3++;
                    }
                    break;
                }
            default:
                ((BottomSheetBehavior) obj).B((View) obj2, i4);
                break;
        }
    }

    public /* synthetic */ RunnableC0223a(Object obj, Object obj2, int i2, int i3) {
        this.f3715a = i3;
        this.f3718d = obj;
        this.f3717c = obj2;
        this.f3716b = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RunnableC0223a(ArrayList arrayList, int i2) {
        this(arrayList, i2, null);
        this.f3715a = 2;
    }

    public RunnableC0223a(List list, int i2, Throwable th) {
        this.f3715a = 2;
        B.a.o(list, "initCallbacks cannot be null");
        this.f3717c = new ArrayList(list);
        this.f3716b = i2;
        this.f3718d = th;
    }
}
