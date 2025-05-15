package C;

import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import e.z;
import java.util.concurrent.Callable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i2) {
        this.f5a = i2;
        this.f8d = obj;
        this.f6b = obj2;
        this.f7c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = this.f8d;
        Object obj3 = this.f6b;
        Object obj4 = this.f7c;
        switch (this.f5a) {
            case 0:
                Typeface typeface = (Typeface) obj4;
                B.a aVar = (B.a) ((z) obj3).f2221b;
                if (aVar != null) {
                    aVar.T(typeface);
                    break;
                }
                break;
            case 1:
                ((d) ((E.a) obj3)).b(obj4);
                break;
            case 2:
                try {
                    obj = ((Callable) obj3).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) obj2).post(new a(this, (E.a) obj4, obj, 1));
                break;
            default:
                if (((View) obj4) != null) {
                    ((Z.b) obj2).getClass();
                    break;
                }
                break;
        }
    }
}
